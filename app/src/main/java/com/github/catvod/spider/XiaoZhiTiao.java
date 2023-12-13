package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * XiaoZhiTiao
 *
 * @author Oiltea
 */
public class XiaoZhiTiao extends Ali {

    private static final String siteUrl = "https://gitcafe.net/tool/alipaper/";
    private static final String aliUrl = "https://www.aliyundrive.com/s/";
    private String token;
    private Date date;

    private Map<String, String> getHeaders() {
        Map<String, String> params = new HashMap<>();
        params.put("Host", "gitcafe.net");
        params.put("User-Agent", Util.CHROME);
        return params;
    }

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        date = new Date();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("action", "search");
        params.put("from", "web");
        params.put("keyword", key);
        params.put("token", getToken());
        JSONObject object = new JSONObject(OkHttp.post(siteUrl, params, getHeaders()).getBody());
        if (!object.optBoolean("success")) return "";
        List<Vod> list = new ArrayList<>();
        JSONArray data = object.getJSONArray("data");
        for (int i = 0, len = data.length(); i < len; i++) {
            JSONObject o = data.getJSONObject(i);
            String alikey = o.getString("alikey");
            String title = o.getString("title");
            String creatime = o.getString("creatime");
            list.add(new Vod(aliUrl + alikey, title, "", TextUtils.isEmpty(creatime) ? "" : creatime.substring(0, 10)));
        }
        return Result.string(list);
    }

    private String getToken() throws JSONException {
        if (TextUtils.isEmpty(token) || new Date().compareTo(date) > 0) {
            Map<String, String> params = new HashMap<>();
            params.put("action", "get_token");
            params.put("from", "web");
            JSONObject object = new JSONObject(OkHttp.post(siteUrl, params, getHeaders()).getBody());
            if (object.getBoolean("success")) {
                token = object.getString("data");
                date = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000);
            }
        }
        return token;
    }
}