package com.github.catvod.spider;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Json;
import com.github.catvod.utils.Path;
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
        return Result.string(vod(ids.get(0)));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        if (id.contains("://") && id.contains("***")) id = id.replace("***", "#");
        return switch (flag) {
            case "直連" -> Result.get().url(id).subs(getSubs(id)).string();
            case "解析" -> Result.get().parse().jx().url(id).string();
            case "嗅探" -> Result.get().parse().url(id).string();
            default -> Result.get().url(id).string();
        };
    }

    private Vod vod(String url) {
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodPic(Image.PUSH);
        vod.setTypeName("FongMi");
        vod.setVodName(url.startsWith("file://") ? new File(url).getName() : "");
        if (url.contains("://") && url.contains("#")) url = url.replace("#", "***");
        if (isThunder(url)) {
            vod.setVodPlayUrl(url);
            vod.setVodPlayFrom("迅雷");
            return vod;
        } else if (url.contains("youtube.com")) {
            vod.setVodPlayUrl(url);
            vod.setVodPlayFrom("YouTube");
            return vod;
        } else if (url.contains("$")) {
            vod.setVodPlayFrom("直連");
            vod.setVodPlayUrl(TextUtils.join("#", url.split("\n")));
            return vod;
        } else {
            vod.setVodPlayUrl(TextUtils.join("$$$", Arrays.asList(url, url, url)));
            vod.setVodPlayFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
            return vod;
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
        subs.add(Sub.create().name(name).ext(ext).url(url));
    }

    private void setFileSub(String url, List<Sub> subs) {
        File parent = new File(url.replace("file://", "")).getParentFile();
        if (parent == null) return;
        for (File f : Path.list(parent)) {
            String ext = VodUtil.getExt(f.getName());
            if (f.isFile() && VodUtil.isSub(ext)) subs.add(Sub.create().name(VodUtil.removeExt(f.getName())).ext(ext).url("file://" + f.getAbsolutePath()));
        }
    }
}
