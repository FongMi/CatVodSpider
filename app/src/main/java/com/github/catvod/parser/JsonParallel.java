package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JsonParallel {

    private static final String ParseOKTag = "p_json_parse";

    public static JSONObject parse(LinkedHashMap<String, String> jx, String url) {
        if (jx.isEmpty()) return new JSONObject();
        ExecutorService service = Executors.newFixedThreadPool(3);
        CompletionService<JSONObject> completionService = new ExecutorCompletionService<>(service);
        List<Future<JSONObject>> futures = new ArrayList<>();
        Set<String> jxNames = jx.keySet();
        for (String jxName : jxNames) {
            String parseUrl = jx.get(jxName);
            futures.add(completionService.submit(() -> {
                try {
                    HashMap<String, String> reqHeaders = JsonBasic.getReqHeader(parseUrl);
                    String realUrl = reqHeaders.get("url");
                    reqHeaders.remove("url");
                    SpiderDebug.log(realUrl + url);
                    String json = OkHttpUtil.string(realUrl + url, ParseOKTag, reqHeaders);
                    JSONObject taskResult = Misc.jsonParse(url, json);
                    taskResult.put("jxFrom", jxName);
                    SpiderDebug.log(taskResult.toString());
                    return taskResult;
                } catch (Exception ignored) {
                    return null;
                }
            }));
        }
        JSONObject pTaskResult = null;
        for (int i = 0; i < futures.size(); ++i) {
            try {
                Future<JSONObject> completed = completionService.take();
                pTaskResult = completed.get();
                if (pTaskResult != null) {
                    OkHttpUtil.cancel(ParseOKTag);
                    for (int j = 0; j < futures.size(); j++) {
                        try {
                            futures.get(j).cancel(true);
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                    }
                    futures.clear();
                    break;
                }
            } catch (Exception ignored) {
            }
        }
        service.shutdownNow();
        return pTaskResult != null ? pTaskResult : new JSONObject();
    }
}
