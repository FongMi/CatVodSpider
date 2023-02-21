package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;

import java.util.Arrays;
import java.util.List;

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
        if (flag.contains("畫")) return super.playerContent(flag, id, vipFlags);
        if (flag.equals("嗅探")) return Result.get().parse().url(id).string();
        if (flag.equals("解析")) return Result.get().parse().jx().url(id).string();
        return Result.get().url(id).string();
    }

    private Vod vod(String url) {
        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodName(url);
        vod.setTypeName("FongMi");
        vod.setVodPic("https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
        vod.setVodPlayFrom(TextUtils.join("$$$", Arrays.asList("直連", "嗅探", "解析")));
        vod.setVodPlayUrl(TextUtils.join("$$$", Arrays.asList("播放$" + url, "播放$" + url, "播放$" + url)));
        return vod;
    }
}