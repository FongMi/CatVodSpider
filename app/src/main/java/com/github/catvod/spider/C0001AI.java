package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0152vp;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class C0001AI extends Spider {

    private String baseUrl = "";
    private String extraConfig = "";
    private String userAgent = "";

    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", this.extraConfig);
        return headers;
    }

    @Override
    public void init(Context context, String str) throws Exception {
        super.init(context, str);
        this.extraConfig = str;
        String decoded = C0152vp.m724Mo(str);
        String[] parts = decoded.split("\\|");
        if (parts.length >= 3) {
            this.baseUrl = parts[0];
            this.userAgent = parts[2];
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String apiUrl = this.baseUrl + "/?ac=detail&ids=" + ids.get(0);
            JSONObject apiData = new JSONObject(C0106ZJ.m484FN(apiUrl, createHeaders()));
            JSONObject video = apiData.getJSONArray("list").optJSONObject(0);

            JSONObject detail = new JSONObject();
            detail.put("vod_id", video.optString("vod_id"));
            detail.put("vod_name", video.optString("vod_name"));
            detail.put("vod_pic", video.optString("vod_pic"));
            detail.put("vod_director", video.optString("vod_director"));
            detail.put("vod_actor", video.optString("vod_actor"));
            detail.put("vod_year", video.optString("vod_year"));
            detail.put("vod_area", video.optString("vod_area"));
            detail.put("vod_lang", video.optString("vod_remarks"));
            detail.put("vod_content", video.optString("vod_content"));
            detail.put("vod_remarks", video.optString("vod_play_from"));
            detail.put("vod_play_url", video.optString("vod_play_url"));
            detail.put("type_name", video.optString("vod_class"));

            JSONArray list = new JSONArray();
            list.put(detail);

            JSONObject result = new JSONObject();
            result.put("list", list);
            return result.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        try {
            JSONObject playerConfig = new JSONObject();
            playerConfig.put("Referer", this.userAgent);

            JSONObject result = new JSONObject();

            if (id.contains(".mp4")) {
                result.put("jx", 1);
                result.put("parse", 0);
                result.put("url", id);
                if (this.userAgent.contains("qiaoji")) {
                    result.put("header", playerConfig.toString());
                }
            } else if (!id.contains(".m3u8")) {
                result.put("parse", 0);
                result.put("url", id);
                if (!this.userAgent.contains("qiaoji")) {
                    result.put("header", playerConfig.toString());
                }
            }

            return result.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        try {
            String searchUrl = this.baseUrl + "/?ac=videolist&wd=" + keyword;
            JSONObject apiData = new JSONObject(C0106ZJ.m484FN(searchUrl, createHeaders()));
            JSONArray items = apiData.getJSONArray("list");

            JSONArray results = new JSONArray();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.optJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.optString("vod_id"));
                entry.put("vod_name", item.optString("vod_name"));
                entry.put("vod_pic", item.optString("vod_pic"));
                entry.put("vod_remarks", item.optString("vod_remarks"));
                results.put(entry);
            }

            JSONObject response = new JSONObject();
            response.put("list", results);
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }
}
