package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class MixDemo {
    public static final HashMap a = new HashMap();
    public static HashMap b = null;

    public static String c(String str, String str2) {
        int iIndexOf;
        if (str2.trim().length() <= 0 || (iIndexOf = str.indexOf("?")) <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = iIndexOf + 1;
        sb.append(str.substring(0, i));
        sb.append("cat_ext=");
        sb.append(Base64.encodeToString(str2.getBytes(), 10));
        sb.append("&");
        sb.append(str.substring(i));
        return sb.toString();
    }

    public static Object[] loadHtml(String str, String str2) {
        try {
            String str3 = new String(Base64.decode(str2, 10), "UTF-8");
            StringBuilder sb = new StringBuilder();
            HashMap map = a;
            if (map.containsKey(str)) {
                ArrayList arrayList = (ArrayList) map.get(str);
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append("\"");
                    sb.append((String) arrayList.get(i));
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
            if (b == null) {
                b = new HashMap();
                for (String str4 : linkedHashMap.keySet()) {
                    HashMap<String, String> map = linkedHashMap.get(str4);
                    String str5 = map.get("type");
                    if (str5.equals("1") || str5.equals("0")) {
                        try {
                            JSONArray jSONArray = new JSONObject(map.get("ext")).getJSONArray("flag");
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                ArrayList arrayList = (ArrayList) b.get(string);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    b.put(string, arrayList);
                                }
                                arrayList.add(str4);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) b.get(str2);
            if (arrayList3 == null || arrayList3.isEmpty()) {
                for (String str6 : linkedHashMap.keySet()) {
                    HashMap<String, String> map2 = linkedHashMap.get(str6);
                    String str7 = map2.get("type");
                    if (str7.equals("1")) {
                        linkedHashMap2.put(str6, c(map2.get("url"), map2.get("ext")));
                    } else if (str7.equals("0")) {
                        arrayList2.add(map2.get("url"));
                    }
                }
            } else {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    String str8 = (String) arrayList3.get(i2);
                    HashMap<String, String> map3 = linkedHashMap.get(str8);
                    String str9 = map3.get("type");
                    if (str9.equals("1")) {
                        linkedHashMap2.put(str8, c(map3.get("url"), map3.get("ext")));
                    } else if (str9.equals("0")) {
                        arrayList2.add(map3.get("url"));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                a.put(str2, arrayList2);
            }
            JSONObject jSONObject = JsonParallel.parse(linkedHashMap2, str3);
            if (jSONObject != null && jSONObject.has("url")) {
                return jSONObject;
            }
            if (!arrayList2.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", "proxy://do=parseMix&flag=" + str2 + "&url=" + Base64.encodeToString(str3.getBytes(), 10));
                jSONObject2.put("parse", 1);
                jSONObject2.put("ua", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36 Edg/133.0.0.0");
                return jSONObject2;
            }
        } catch (Throwable th) {
            SpiderDebug.log(th);
        }
        return new JSONObject();
    }
}
