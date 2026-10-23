package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.Response;
import com.github.catvod.utils.VodUtil;

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
        Vod vod = Vod.create().id(url).name(url.startsWith("file://") ? new File(url).getName() : "").pic(Image.PUSH).typeName("FongMi");
        if (url.contains("://") && url.contains("#")) url = url.replace("#", "***");
        if (isThunder(url)) {
            return vod.playUrl(url).playFrom("迅雷");
        } else if (url.contains("youtube.com")) {
            return vod.playUrl(url).playFrom("YouTube");
        } else if (url.contains("$")) {
            return vod.playFrom("直連").playUrl(TextUtils.join("#", url.split("\n")));
        } else {
            return vod.playUrl(TextUtils.join("$$$", Arrays.asList(url, url, url))).playFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
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
        if (!url.startsWith("file://")) return subs;
        File parent = new File(url.replace("file://", "")).getParentFile();
        if (parent == null) return subs;
        for (File f : Path.list(parent)) {
            String ext = VodUtil.getExt(f.getName());
            if (!f.isFile() || !VodUtil.isSub(ext)) continue;
            subs.add(Sub.create().name(VodUtil.removeExt(f.getName())).format(ext).url("file://" + f.getAbsolutePath()));
        }
        return subs;
    }
}
