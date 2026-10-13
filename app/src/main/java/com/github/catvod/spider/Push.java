package com.github.catvod.spider;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.Response;
import com.github.catvod.utils.VodUtil;
import com.google.gson.JsonObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Push extends Spider {

    private static final Pattern THUNDER = Pattern.compile("(magnet|thunder|ed2k):.*");

    @Override
    public String detailContent(List<String> ids) {
        return Response.create().vod(vod(ids.get(0))).string();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        if (id.contains("://") && id.contains("***")) id = id.replace("***", "#");
        Response result = Response.create().url(id);
        switch (flag) {
            case "直連" -> result.subs(getSubs(id));
            case "解析" -> result.parse().jx();
            case "嗅探" -> result.parse();
        }
        return result.string();
    }

    private Vod vod(String url) {
        Vod vod = new Vod(url, url.startsWith("file://") ? new File(url).getName() : "", Image.PUSH).setTypeName("FongMi");
        if (url.contains("://") && url.contains("#")) url = url.replace("#", "***");
        if (isThunder(url)) {
            return vod.setPlayUrl(url).setPlayFrom("迅雷");
        } else if (url.contains("youtube.com")) {
            return vod.setPlayUrl(url).setPlayFrom("YouTube");
        } else if (url.contains("$")) {
            return vod.setPlayFrom("直連").setPlayUrl(TextUtils.join("#", url.split("\n")));
        } else {
            return vod.setPlayUrl(TextUtils.join("$$$", Arrays.asList(url, url, url))).setPlayFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
        }
    }

    private boolean isThunder(String url) {
        return THUNDER.matcher(url).find() || isTorrent(url);
    }

    private boolean isTorrent(String url) {
        return !url.startsWith("magnet") && url.split(";")[0].endsWith(".torrent");
    }

    private List<Sub> getSubs(String url) {
        List<Sub> subs = new ArrayList<>();
        if (url.startsWith("file://")) setFileSub(url, subs);
        if (url.startsWith("http://")) setHttpSub(url, subs);
        return subs;
    }

    private void setHttpSub(String url, List<Sub> subs) {
        List<String> vodTypes = Arrays.asList("mp4", "mkv");
        List<String> subTypes = Arrays.asList("srt", "ass");
        if (!vodTypes.contains(VodUtil.getExt(url))) return;
        for (String ext : subTypes) detectSub(url, ext, subs);
    }

    private void detectSub(String url, String ext, List<Sub> subs) {
        url = VodUtil.removeExt(url).concat(".").concat(ext);
        JsonObject result = Json.parse(net.req(url, "{\"timeout\":15000}")).getAsJsonObject();
        if (!"200".equals(result.get("code").getAsString()) || result.get("content").getAsString().length() < 100) return;
        String name = Uri.parse(url).getLastPathSegment();
        subs.add(new Sub().setName(name).setFormat(VodUtil.getSubMimeType(ext)).setUrl(url));
    }

    private void setFileSub(String url, List<Sub> subs) {
        File parent = new File(url.replace("file://", "")).getParentFile();
        if (parent == null) return;
        for (File f : Path.list(parent)) {
            String ext = VodUtil.getExt(f.getName());
            if (!f.isFile() || !VodUtil.isSub(ext)) continue;
            subs.add(new Sub().setName(VodUtil.removeExt(f.getName())).setFormat(VodUtil.getSubMimeType(ext)).setUrl("file://" + f.getAbsolutePath()));
        }
    }
}
