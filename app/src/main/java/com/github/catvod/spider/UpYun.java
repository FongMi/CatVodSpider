package com.github.catvod.spider;

import android.util.Base64;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpYun extends Ali {

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, pg);
    }

    private String searchContent(String key, String pg) throws Exception {
        String searchUrl = "https://upapi.juapp9.com/search?keyword=" + URLEncoder.encode(key) + "&page=" + pg + "&s_type=2";
        String content = OkHttp.string(searchUrl, getHeader());
        String decodedContent = new String(Base64.decode(content, Base64.DEFAULT));
        JSONArray jsonArray = new JSONObject(decodedContent).getJSONObject("result").getJSONArray("items");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            String id = jsonObj.optString("page_url");
            String name = jsonObj.optString("title");
            String pic = "https://pic.imgdb.cn/item/65767399c458853aeff8a6a0.webp";
            String remark = jsonObj.optString("insert_time");
            if (name.contains(key)) list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }
}