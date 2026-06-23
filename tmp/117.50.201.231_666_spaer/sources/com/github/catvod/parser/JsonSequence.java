package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.yi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class JsonSequence {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        try {
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    try {
                        HashMap<String, String> reqHeader = JsonBasic.getReqHeader(linkedHashMap.get(str2));
                        String str3 = reqHeader.get("url");
                        reqHeader.remove("url");
                        SpiderDebug.log(str3 + str);
                        JSONObject jSONObjectG = ku.g(str, yi.k(str3 + str, reqHeader));
                        if (jSONObjectG != null) {
                            jSONObjectG.put("jxFrom", str2);
                            return jSONObjectG;
                        }
                    } catch (Throwable th) {
                        SpiderDebug.log(th);
                    }
                }
            }
        } catch (Throwable th2) {
            SpiderDebug.log(th2);
        }
        return new JSONObject();
    }
}
