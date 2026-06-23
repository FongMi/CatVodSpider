package com.github.catvod.spider.merge.A0;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class os {
    public static final Pattern a = Pattern.compile(".*,(.+?)$");
    public static final Pattern b = Pattern.compile("group-title=\"(.*?)\"");

    public static String c(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : pattern.pattern().equals(b.pattern()) ? "未分组" : "未命名";
    }

    public static String d(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (String str : linkedHashMap.keySet()) {
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(str);
            if (!linkedHashMap2.isEmpty()) {
                for (String str2 : linkedHashMap2.keySet()) {
                    ArrayList arrayList = (ArrayList) linkedHashMap2.get(str2);
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

    public static void e(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        String strK = yi.k(str, null);
        if (strK.startsWith("#EXTM3U")) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(strK));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!line.equals("") && !line.startsWith("#EXTM3U") && line.startsWith("#EXTINF")) {
                        String strC = c(line, a);
                        String strC2 = c(line, b);
                        String strTrim = bufferedReader.readLine().trim();
                        if (linkedHashMap.containsKey(strC2)) {
                            linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(strC2);
                        } else {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap.put(strC2, linkedHashMap4);
                            linkedHashMap2 = linkedHashMap4;
                        }
                        if (linkedHashMap2 == null || !linkedHashMap2.containsKey(strC)) {
                            ArrayList arrayList3 = new ArrayList();
                            linkedHashMap2.put(strC, arrayList3);
                            arrayList2 = arrayList3;
                        } else {
                            arrayList2 = (ArrayList) linkedHashMap2.get(strC);
                        }
                        if (arrayList2 != null && !arrayList2.contains(strTrim)) {
                            arrayList2.add(strTrim);
                        }
                    }
                }
                bufferedReader.close();
                if (linkedHashMap3.isEmpty()) {
                    return;
                }
                linkedHashMap.put("未分组", linkedHashMap3);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(strK));
            String line2 = bufferedReader2.readLine();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = linkedHashMap5;
            while (line2 != null) {
                if (line2.trim().isEmpty()) {
                    line2 = bufferedReader2.readLine();
                } else {
                    String[] strArrSplit = line2.split(",");
                    if (strArrSplit.length < 2) {
                        line2 = bufferedReader2.readLine();
                    } else {
                        if (line2.contains("#genre#")) {
                            String strTrim2 = strArrSplit[0].trim();
                            if (linkedHashMap.containsKey(strTrim2)) {
                                linkedHashMap6 = (LinkedHashMap) linkedHashMap.get(strTrim2);
                            } else {
                                linkedHashMap6 = new LinkedHashMap();
                                linkedHashMap.put(strTrim2, linkedHashMap6);
                            }
                        } else {
                            String strTrim3 = strArrSplit[0].trim();
                            for (String str2 : strArrSplit[1].trim().split("#")) {
                                String strTrim4 = str2.trim();
                                if (!strTrim4.isEmpty() && (strTrim4.startsWith("http") || strTrim4.startsWith("rtsp") || strTrim4.startsWith("rtmp"))) {
                                    if (linkedHashMap6.containsKey(strTrim3)) {
                                        arrayList = (ArrayList) linkedHashMap6.get(strTrim3);
                                    } else {
                                        arrayList = new ArrayList();
                                        linkedHashMap6.put(strTrim3, arrayList);
                                    }
                                    if (!arrayList.contains(strTrim4)) {
                                        arrayList.add(strTrim4);
                                    }
                                }
                            }
                        }
                        line2 = bufferedReader2.readLine();
                    }
                }
            }
            bufferedReader2.close();
            if (linkedHashMap5.isEmpty()) {
                return;
            }
            linkedHashMap.put("未分组", linkedHashMap5);
        } catch (Throwable unused) {
        }
    }
}
