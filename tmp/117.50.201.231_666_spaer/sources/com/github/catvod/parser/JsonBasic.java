package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.wb;
import com.github.catvod.spider.merge.A0.yi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class JsonBasic {
    public static HashMap<String, String> getReqHeader(String str) {
        HashMap<String, String> mapF = wb.f("url", str);
        if (str.contains("cat_ext")) {
            try {
                int iIndexOf = str.indexOf("cat_ext=");
                int iIndexOf2 = str.indexOf("&", iIndexOf);
                String str2 = new String(Base64.decode(str.substring(iIndexOf + 8, iIndexOf2), 10));
                String str3 = str.substring(0, iIndexOf) + str.substring(iIndexOf2 + 1);
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("header")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        mapF.put(next, jSONObjectOptJSONObject.optString(next, ""));
                    }
                }
                mapF.put("url", str3);
            } catch (Throwable unused) {
            }
        }
        return mapF;
    }

    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, String str) {
        try {
            SpiderDebug.log("Load Json Parse Basic...");
            if (linkedHashMap.size() > 0) {
                for (String str2 : linkedHashMap.keySet()) {
                    HashMap<String, String> reqHeader = getReqHeader(linkedHashMap.get(str2));
                    try {
                        String str3 = reqHeader.get("url");
                        reqHeader.remove("url");
                        SpiderDebug.log(str3 + str);
                        JSONObject jSONObjectG = ku.g(str, yi.k(str3 + str, reqHeader));
                        if (jSONObjectG != null) {
                            jSONObjectG.put("jxFrom", str2);
                            SpiderDebug.log(jSONObjectG.toString());
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
