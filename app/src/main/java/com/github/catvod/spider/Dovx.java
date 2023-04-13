package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;

import java.net.URLEncoder;

public class Dovx extends Ali {

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        Result result = Result.objectFrom(OkHttp.string("https://api.dovx.tk/ali/search?wd=" + URLEncoder.encode(key)));
        for (Vod vod : result.getList()) vod.setVodId(vod.getVodContent());
        return result.string();
    }
}
