package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.yi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class JsonParallel {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, final String str) {
        JSONObject jSONObject;
        Throwable th;
        try {
            if (linkedHashMap.size() > 0) {
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorServiceNewFixedThreadPool);
                ArrayList arrayList = new ArrayList();
                for (final String str2 : linkedHashMap.keySet()) {
                    final String str3 = linkedHashMap.get(str2);
                    arrayList.add(executorCompletionService.submit(new Callable<JSONObject>() { // from class: com.github.catvod.parser.JsonParallel.1
                        @Override // java.util.concurrent.Callable
                        public JSONObject call() {
                            String str4 = str;
                            try {
                                HashMap<String, String> reqHeader = JsonBasic.getReqHeader(str3);
                                String str5 = reqHeader.get("url");
                                reqHeader.remove("url");
                                SpiderDebug.log(str5 + str4);
                                JSONObject jSONObjectG = ku.g(str4, yi.m(yi.f(), str5 + str4, "p_json_parse", reqHeader, null));
                                jSONObjectG.put("jxFrom", str2);
                                SpiderDebug.log(jSONObjectG.toString());
                                return jSONObjectG;
                            } catch (Throwable th2) {
                                SpiderDebug.log(th2);
                                return null;
                            }
                        }
                    }));
                }
                JSONObject jSONObject2 = null;
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        try {
                            jSONObject = (JSONObject) executorCompletionService.take().get();
                            if (jSONObject != null) {
                                try {
                                    yi.e();
                                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                        try {
                                            ((Future) arrayList.get(i2)).cancel(true);
                                        } catch (Throwable th2) {
                                            SpiderDebug.log(th2);
                                        }
                                    }
                                    arrayList.clear();
                                    jSONObject2 = jSONObject;
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                    SpiderDebug.log(th);
                                    jSONObject2 = jSONObject;
                                    i++;
                                }
                            }
                        } catch (Throwable th4) {
                            jSONObject = jSONObject2;
                            th = th4;
                        }
                        jSONObject2 = jSONObject;
                        i++;
                    }
                }
                try {
                    executorServiceNewFixedThreadPool.shutdownNow();
                } catch (Throwable th5) {
                    SpiderDebug.log(th5);
                }
                if (jSONObject2 != null) {
                    return jSONObject2;
                }
            }
        } catch (Throwable th6) {
            SpiderDebug.log(th6);
        }
        return new JSONObject();
    }
}
