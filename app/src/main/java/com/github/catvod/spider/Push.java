package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Push extends Ali {

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        if (url.contains("aliyundrive")) return super.detailContent(ids);
        return Result.string(vod(url));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        if (id.contains("youtube.com")) return Result.get().url(Youtube.fetch(id)).string();
        if (flag.equals("直連")) return Result.get().url(id).subs(getSubs(id)).string();
        if (flag.equals("嗅探")) return Result.get().parse().url(id).string();
        if (flag.equals("解析")) return Result.get().parse().jx().url(id).string();
        return super.playerContent(flag, id, vipFlags);
    }

    private Vod vod(String url) {
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setTypeName("FongMi");
        vod.setVodName(url.startsWith("file://") ? new File(url).getName() : url);
        vod.setVodPic("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        vod.setVodPlayFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
        vod.setVodPlayUrl(TextUtils.join("$$$", Arrays.asList("播放$" + url, "播放$" + url, "播放$" + url)));
        return vod;
    }

    private List<Sub> getSubs(String url) {
        List<Sub> subs = new ArrayList<>();
        if (url.startsWith("file://")) setFileSub(url, subs);
        if (url.startsWith("http://")) setHttpSub(url, subs);
        return subs;
    }

    private void setHttpSub(String url, List<Sub> subs) {
        try {
            List<String> vodTypes = Arrays.asList("mp4", "mkv");
            List<String> subTypes = Arrays.asList("srt", "ass");
            if (!vodTypes.contains(Utils.getExt(url))) return;
            for (String ext : subTypes) detectSub(url, ext, subs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void detectSub(String url, String ext, List<Sub> subs) throws Exception {
        url = Utils.removeExt(url).concat(".").concat(ext);
        if (OkHttp.newCall(url).code() != 200) return;
        String name = Uri.parse(url).getLastPathSegment();
        subs.add(Sub.create().name(name).ext(ext).url(url));
    }

    private void setFileSub(String url, List<Sub> subs) {
        File file = new File(url.replace("file://", ""));
        if (file.getParentFile() == null) return;
        for (File f : Objects.requireNonNull(file.getParentFile().listFiles())) {
            String ext = Utils.getExt(f.getName());
            if (Utils.isSub(ext)) subs.add(Sub.create().name(Utils.removeExt(f.getName())).ext(ext).url("file://" + f.getAbsolutePath()));
        }
    }
}