package com.github.catvod.spider.merge;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.r */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0141r {
    /* renamed from: QU */
    public static void m701QU(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String str) {
        ArrayList<String> arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String line = bufferedReader.readLine();
            LinkedHashMap<String, ArrayList<String>> linkedHashMap2 = new LinkedHashMap<>();
            LinkedHashMap<String, ArrayList<String>> linkedHashMap3 = linkedHashMap2;
            while (line != null) {
                if (line.trim().isEmpty()) {
                    line = bufferedReader.readLine();
                } else {
                    String[] strArrSplit = line.split(",");
                    if (strArrSplit.length < 2) {
                        line = bufferedReader.readLine();
                    } else {
                        if (line.contains("#genre#")) {
                            String strTrim = strArrSplit[0].trim();
                            if (linkedHashMap.containsKey(strTrim)) {
                                linkedHashMap3 = linkedHashMap.get(strTrim);
                            } else {
                                linkedHashMap3 = new LinkedHashMap<>();
                                linkedHashMap.put(strTrim, linkedHashMap3);
                            }
                        } else {
                            String strTrim2 = strArrSplit[0].trim();
                            for (String str2 : strArrSplit[1].trim().split("#")) {
                                String strTrim3 = str2.trim();
                                if (!strTrim3.isEmpty() && (strTrim3.startsWith("http") || strTrim3.startsWith("rtsp") || strTrim3.startsWith("rtmp"))) {
                                    if (linkedHashMap3.containsKey(strTrim2)) {
                                        arrayList = linkedHashMap3.get(strTrim2);
                                    } else {
                                        arrayList = new ArrayList<>();
                                        linkedHashMap3.put(strTrim2, arrayList);
                                    }
                                    if (!arrayList.contains(strTrim3)) {
                                        arrayList.add(strTrim3);
                                    }
                                }
                            }
                        }
                        line = bufferedReader.readLine();
                    }
                }
            }
            bufferedReader.close();
            if (linkedHashMap2.isEmpty()) {
                return;
            }
            linkedHashMap.put("未分组", linkedHashMap2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: UJ */
    public static void m702UJ(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String str, HashMap<String, String> map) {
        m701QU(linkedHashMap, C0106ZJ.m484FN(str, map));
    }

    /* renamed from: q */
    public static String m703q(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String str : linkedHashMap.keySet()) {
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap<String, ArrayList<String>> linkedHashMap2 = linkedHashMap.get(str);
            if (!linkedHashMap2.isEmpty()) {
                for (String str2 : linkedHashMap2.keySet()) {
                    ArrayList<String> arrayList = linkedHashMap2.get(str2);
                    if (!arrayList.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (int i = 0; i < arrayList.size(); i++) {
                            jSONArray3.put(arrayList.get(i));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("name", str2);
                            jSONObject.put("urls", jSONArray3);
                        } catch (JSONException unused) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("group", str);
                    jSONObject2.put("channels", jSONArray2);
                } catch (JSONException unused2) {
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: xC */
    public static Object[] m704xC(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m702UJ(linkedHashMap, str, null);
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(m703q(linkedHashMap).getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
