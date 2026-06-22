package com.github.catvod.spider.merge;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ރ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0281 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final Pattern f708 = Pattern.compile(SOY.d("54787D5E5A5C457B75"));

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final Pattern f709 = Pattern.compile(SOY.d("1D203E03045A0E3B251A114A587A7F5C4B5E58"));

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static String m1032(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : pattern.pattern().equals(f709.pattern()) ? SOY.d("9CCEFB93FCF19DE9D5") : SOY.d("9CCEFB93E5CA9FC2DC");
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String m1033(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap) {
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
                            jSONObject.put(SOY.d("14333C13"), str2);
                            jSONObject.put(SOY.d("0F203D05"), jSONArray3);
                        } catch (JSONException unused) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(SOY.d("1D203E0304"), str);
                    jSONObject2.put(SOY.d("193A30181A121621"), jSONArray2);
                } catch (JSONException unused2) {
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static Object[] m1034(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m1037(linkedHashMap, str, null);
            return new Object[]{200, SOY.d("0E3729025B07163338184F57193A300407120E6F2402125A42"), new ByteArrayInputStream(m1033(linkedHashMap).getBytes(SOY.d("2F06175B4C")))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static void m1035(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String str) {
        LinkedHashMap<String, ArrayList<String>> linkedHashMap2;
        ArrayList<String> arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            LinkedHashMap<String, ArrayList<String>> linkedHashMap3 = new LinkedHashMap<>();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.equals("") && !line.startsWith(SOY.d("5917092239442F")) && line.startsWith(SOY.d("591709223D393C"))) {
                    String strM1032 = m1032(f708, line);
                    String strM10322 = m1032(f709, line);
                    String strTrim = bufferedReader.readLine().trim();
                    if (linkedHashMap.containsKey(strM10322)) {
                        linkedHashMap2 = linkedHashMap.get(strM10322);
                    } else {
                        LinkedHashMap<String, ArrayList<String>> linkedHashMap4 = new LinkedHashMap<>();
                        linkedHashMap.put(strM10322, linkedHashMap4);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    if (linkedHashMap2 == null || !linkedHashMap2.containsKey(strM1032)) {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        linkedHashMap2.put(strM1032, arrayList2);
                        arrayList = arrayList2;
                    } else {
                        arrayList = linkedHashMap2.get(strM1032);
                    }
                    if (arrayList != null && !arrayList.contains(strTrim)) {
                        arrayList.add(strTrim);
                    }
                }
            }
            bufferedReader.close();
            if (linkedHashMap3.isEmpty()) {
                return;
            }
            linkedHashMap.put(SOY.d("9CCEFB93FCF19DE9D5"), linkedHashMap3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static void m1036(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String str) {
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
                    String[] strArrSplit = line.split(SOY.d("56"));
                    if (strArrSplit.length < 2) {
                        line = bufferedReader.readLine();
                    } else {
                        if (line.contains(SOY.d("59353418061259"))) {
                            String strTrim = strArrSplit[0].trim();
                            if (linkedHashMap.containsKey(strTrim)) {
                                linkedHashMap3 = linkedHashMap.get(strTrim);
                            } else {
                                linkedHashMap3 = new LinkedHashMap<>();
                                linkedHashMap.put(strTrim, linkedHashMap3);
                            }
                        } else {
                            String strTrim2 = strArrSplit[0].trim();
                            for (String str2 : strArrSplit[1].trim().split(SOY.d("59"))) {
                                String strTrim3 = str2.trim();
                                if (!strTrim3.isEmpty() && (strTrim3.startsWith(SOY.d("12262506")) || strTrim3.startsWith(SOY.d("08262206")) || strTrim3.startsWith(SOY.d("08263C06")))) {
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
            linkedHashMap.put(SOY.d("9CCEFB93FCF19DE9D5"), linkedHashMap2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static void m1037(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> linkedHashMap, String str, HashMap<String, String> map) {
        String strM1089 = C0295.m1089(str, map);
        if (strM1089.startsWith(SOY.d("5917092239442F"))) {
            m1035(linkedHashMap, strM1089);
        } else {
            m1036(linkedHashMap, strM1089);
        }
    }
}
