package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class JsonSequence {

    public static JSONObject parse(LinkedHashMap<String, String> jx, String url) {
        if (jx.isEmpty()) return new JSONObject();
        Set<String> jxNames = jx.keySet();
        for (String jxName : jxNames) {
            try {
                String parseUrl = jx.get(jxName);
                HashMap<String, String> reqHeaders = JsonBasic.getReqHeader(parseUrl);
                String realUrl = reqHeaders.get("url");
                reqHeaders.remove("url");
                SpiderDebug.log(realUrl + url);
                String json = OkHttp.string(realUrl + url, reqHeaders);
                JSONObject taskResult = Utils.jsonParse(url, json);
                if (taskResult == null) continue;
                taskResult.put("jxFrom", jxName);
                return taskResult;
            } catch (Exception ignored) {
            }
        }
        return new JSONObject();
    }
}
