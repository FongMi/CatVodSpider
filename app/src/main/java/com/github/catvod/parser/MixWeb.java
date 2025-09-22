package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class MixWeb {

    /* renamed from: q */
    public static HashMap<String, ArrayList<String>> f5q = new HashMap<>();

    /* renamed from: xC */
    static HashMap<String, ArrayList<String>> f6xC = null;

    public static Object[] loadHtml(String str, String str2) {
        try {
            String str3 = new String(Base64.decode(str2, 10), "UTF-8");
            StringBuilder sb = new StringBuilder();
            if (f5q.containsKey(str)) {
                ArrayList<String> arrayList = f5q.get(str);
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append("\"");
                    sb.append(arrayList.get(i));
                    sb.append("\"");
                    if (i < arrayList.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            return new Object[]{200, "text/html; charset=\"UTF-8\"", new ByteArrayInputStream("\n<!doctype html>\n<html>\n<head>\n<title>解析</title>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=EmulateIE10\" />\n<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n<meta name=\"viewport\" content=\"width=device-width\">\n</head>\n<body>\n<script>\nvar apiArray=[#jxs#];\nvar urlPs=\"#url#\";\nvar iframeHtml=\"\";\nfor(var i=0;i<apiArray.length;i++){\nvar URL=apiArray[i]+urlPs;\niframeHtml=iframeHtml+\"<iframe sandbox='allow-scripts allow-same-origin allow-forms' frameborder='0' allowfullscreen='true' webkitallowfullscreen='true' mozallowfullscreen='true' src=\"+URL+\"></iframe>\";\n}\ndocument.write(iframeHtml);\n</script>\n</body>\n</html>".replace("#url#", str3).replace("#jxs#", sb.toString()).toString().getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> linkedHashMap, String str, String str2, String str3) {
        try {
            if (f6xC == null) {
                f6xC = new HashMap<>();
                for (String str4 : linkedHashMap.keySet()) {
                    HashMap<String, String> map = linkedHashMap.get(str4);
                    if (map.get("type").equals("0")) {
                        try {
                            JSONArray jSONArray = new JSONObject(map.get("ext")).getJSONArray("flag");
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String strOptString = jSONArray.optString(i);
                                ArrayList<String> arrayList = f6xC.get(strOptString);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                    f6xC.put(strOptString, arrayList);
                                }
                                arrayList.add(str4);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = f6xC.get(str2);
            if (arrayList3 == null || arrayList3.isEmpty()) {
                Iterator<String> it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    HashMap<String, String> map2 = linkedHashMap.get(it.next());
                    if (map2.get("type").equals("0")) {
                        arrayList2.add(map2.get("url"));
                    }
                }
            } else {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    HashMap<String, String> map3 = linkedHashMap.get(arrayList3.get(i2));
                    if (map3.get("type").equals("0")) {
                        arrayList2.add(map3.get("url"));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                f5q.put(str2, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", "proxy://do=MixWeb&flag=" + str2 + "&url=" + Base64.encodeToString(str3.getBytes(), 10));
                jSONObject.put("parse", 1);
                jSONObject.put("ua", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                return jSONObject;
            }
        } catch (Throwable th) {
            SpiderDebug.log(th);
        }
        return new JSONObject();
    }
}
