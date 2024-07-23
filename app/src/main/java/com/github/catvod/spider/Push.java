package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Push extends Spider {

    private final Ali ali;

    public Push() {
        ali = new Ali();
    }

    @Override
    public void init(Context context, String extend) {
        ali.init(context, extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (Ali.pattern.matcher(ids.get(0)).find()) return ali.detailContent(ids);
        return Result.string(vod(ids.get(0)));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        if (id.startsWith("http") && id.contains("***")) id = id.replace("***", "#");
        if (flag.equals("直連")) return Result.get().url(id).subs(getSubs(id)).string();
        if (flag.equals("解析")) return Result.get().parse().jx().url(id).string();
        if (flag.equals("嗅探")) return Result.get().parse().url(id).string();
        if (flag.equals("迅雷")) return Result.get().url(id).string();
        return ali.playerContent(flag, id, vipFlags);
    }

    private Vod vod(String url) {
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodPic(Image.PUSH);
        vod.setTypeName("FongMi");
        vod.setVodName(url.startsWith("file://") ? new File(url).getName() : url);
        if (url.startsWith("http") && url.contains("#")) url = url.replace("#", "***");
        if (Util.isThunder(url)) {
            vod.setVodPlayUrl(url);
            vod.setVodPlayFrom("迅雷");
        } else if (url.contains("$")) {
            vod.setVodPlayFrom("直連");
            vod.setVodPlayUrl(TextUtils.join("#", url.split("\n")));
        } else {
            vod.setVodPlayUrl(TextUtils.join("$$$", Arrays.asList(url, url, url)));
            vod.setVodPlayFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
        }
        return vod;
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
        if (!vodTypes.contains(Util.getExt(url))) return;
        for (String ext : subTypes) detectSub(url, ext, subs);
    }

    private void detectSub(String url, String ext, List<Sub> subs) {
        url = Util.removeExt(url).concat(".").concat(ext);
        if (OkHttp.string(url).length() < 100) return;
        String name = Uri.parse(url).getLastPathSegment();
        subs.add(Sub.create().name(name).ext(ext).url(url));
    }

    private void setFileSub(String url, List<Sub> subs) {
        File file = new File(url.replace("file://", ""));
        if (file.getParentFile() == null) return;
        for (File f : file.getParentFile().listFiles()) {
            String ext = Util.getExt(f.getName());
            if (Util.isSub(ext)) subs.add(Sub.create().name(Util.removeExt(f.getName())).ext(ext).url("file://" + f.getAbsolutePath()));
        }
    }
}