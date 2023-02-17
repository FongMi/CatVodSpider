package com.github.catvod.spider;

import android.util.Base64;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.upyun.Data;
import com.github.catvod.bean.upyun.Item;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpYun extends Ali {

    private final String siteUrl = "https://www.upyunso.com/";
    private final String apiUrl = "https://api.upyunso2.com/";

    private Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        headers.put("Referer", siteUrl);
        return headers;
    }

    @Override
    public String searchContent(String key, boolean quick) {
        String url = apiUrl + "search?keyword=" + URLEncoder.encode(key) + "&page=1&s_type=2";
        String res = new String(Base64.decode(OkHttp.string(url, getHeaders()), Base64.DEFAULT));
        List<Vod> list = new ArrayList<>();
        for (Item item : Data.objectFrom(res).getResult().getItems()) if (item.isAli() && item.getTitle().contains(key)) list.add(item.getVod());
        return Result.string(list);
    }
}