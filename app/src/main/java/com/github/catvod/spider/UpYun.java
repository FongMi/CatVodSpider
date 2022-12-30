package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.upyun.Data;
import com.github.catvod.bean.upyun.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Misc;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpYun extends Spider {

    private final String siteUrl = "https://www.upyunso.com/";
    private final String apiUrl = "https://api.upyunso2.com/";
    private Ali ali;

    private Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", siteUrl);
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        ali = new Ali(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        return ali.detailContent(Arrays.asList(ids.get(0)));
    }

    @Override
    public String searchContent(String key, boolean quick) {
        String url = apiUrl + "search?keyword=" + URLEncoder.encode(key) + "&page=1&s_type=2";
        String res = new String(Base64.decode(OkHttp.string(url, getHeaders()), Base64.DEFAULT));
        List<Vod> list = new ArrayList<>();
        for (Item item : Data.objectFrom(res).getResult().getItems()) if (item.isAli()) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return ali.playerContent(flag, id);
    }
}