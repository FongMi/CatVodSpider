package com.github.catvod.parser;

import android.util.Base64;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class JsonBasic {

    public static JSONObject parse(LinkedHashMap<String, String> jx, String url) {
        SpiderDebug.log("Load Json Parse Basic...");
        if (jx.isEmpty()) return new JSONObject();
        Set<String> jxNames = jx.keySet();
        for (String jxName : jxNames) {
            String parseUrl = jx.get(jxName);
            HashMap<String, String> reqHeaders = getReqHeader(parseUrl);
            try {
                String realUrl = reqHeaders.get("url");
                reqHeaders.remove("url");
                SpiderDebug.log(realUrl + url);
                String json = OkHttp.string(realUrl + url, reqHeaders);
                JSONObject taskResult = Utils.jsonParse(url, json);
                if (taskResult == null) continue;
                taskResult.put("jxFrom", jxName);
                SpiderDebug.log(taskResult.toString());
                return taskResult;
            } catch (Exception ignored) {
            }
        }
        return new JSONObject();
    }

    public static HashMap<String, String> getReqHeader(String url) {
        HashMap<String, String> reqHeaders = new HashMap<>();
        reqHeaders.put("url", url);
        if (!url.contains("cat_ext")) return reqHeaders;
        try {
            int start = url.indexOf("cat_ext=");
            int end = url.indexOf("&", start);
            String ext = url.substring(start + 8, end);
            ext = new String(Base64.decode(ext, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP));
            String newUrl = url.substring(0, start) + url.substring(end + 1);
            JSONObject jsonObject = new JSONObject(ext);
            if (jsonObject.has("header")) {
                JSONObject headerJson = jsonObject.optJSONObject("header");
                Iterator<String> keys = headerJson.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    reqHeaders.put(key, headerJson.optString(key, ""));
                }
            }
            reqHeaders.put("url", newUrl);
        } catch (Exception ignored) {
        }
        return reqHeaders;
    }
}
