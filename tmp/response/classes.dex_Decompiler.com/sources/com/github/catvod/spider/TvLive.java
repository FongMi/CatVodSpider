package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.C0138d;
import com.github.catvod.spider.merge.n.C0197c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class TvLive extends Spider {
    private String a;
    private final String b = C0098a.a(new byte[]{-67, -95, 64, 22, 40, 37, -113, -5, -4, -5, 26, 76, 109, 100}, new byte[]{-46, -54, 40, 98, 92, 85, -96, -56});

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-59, 99, -20, 22, -37, -35, -24, -15, -2, 100}, new byte[]{-112, 16, -119, 100, -10, -100, -113, -108}), this.b);
        return map;
    }

    private void b(BufferedReader bufferedReader, JSONArray jSONArray, String str) {
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (!line.equals("") && !line.contains(C0098a.a(new byte[]{51, 96, 116, 40, -4, -110, 103}, new byte[]{16, 37, 44, 124, -79, -95, 50, 72})) && line.contains(C0098a.a(new byte[]{-66, -127, -37, -6, 51, 8, -103}, new byte[]{-99, -60, -125, -82, 122, 70, -33, 123}))) {
                    String strTrim = e(C0098a.a(new byte[]{-119, 10, -67, -74, -103, 63, 70, -17, -64, 94}, new byte[]{-3, 124, -38, -101, -9, 94, 43, -118}), C0098a.a(new byte[]{62, -88, -71, -46, 101, 7, -86, 96, 123, -25, -16}, new byte[]{28, -120, -51, -92, 2, 42, -58, 15}), line).trim();
                    String strE = e(C0098a.a(new byte[]{92, 62, 11, 57, 126, 9, -92, 102, 21, 106}, new byte[]{40, 72, 108, 20, 18, 102, -61, 9}), C0098a.a(new byte[]{80, -6, -58, -107, -99, 2, -4, 80, 6, -77, -43, -117, -105, 74}, new byte[]{114, -38, -95, -25, -14, 119, -116, 125}), line);
                    if (!str.equals("")) {
                        strE = str;
                    }
                    String strE2 = e(C0098a.a(new byte[]{72, 11, 0, 41, -85, -89, -16, -78, 91, 21, 10, 97, -7}, new byte[]{47, 121, 111, 92, -37, -118, -124, -37}), C0098a.a(new byte[]{-119, 70}, new byte[]{-85, 106, 103, 43, -27, 21, 9, -8}), line);
                    if (strTrim.equals("")) {
                        strTrim = line.substring(line.lastIndexOf(C0098a.a(new byte[]{-124}, new byte[]{-88, 95, -114, -47, -4, 92, -63, 103})) + 1);
                    }
                    jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{-82, 60, 28, 1, 110, -96}, new byte[]{-40, 83, 120, 94, 7, -60, 119, -98}), new JSONObject().put(C0098a.a(new byte[]{82, -88, -123, -32, 48, -17, 20, 97, 123, -78, -109, -45}, new byte[]{36, -57, -31, -65, 64, -125, 117, 24}), strTrim + C0098a.a(new byte[]{-49}, new byte[]{-21, 60, -94, -122, -123, -114, 105, -32}) + bufferedReader.readLine().trim()).put(C0098a.a(new byte[]{-104, -96, 35}, new byte[]{-24, -55, 64, 77, -58, -11, -33, 18}), strE).toString()).put(C0098a.a(new byte[]{38, 6, 107, -20, 38, 60, 48, 69}, new byte[]{80, 105, 15, -77, 72, 93, 93, 32}), strTrim).put(C0098a.a(new byte[]{96, 10, 13, 127, -69, -42, 27}, new byte[]{22, 101, 105, 32, -53, -65, 120, -18}), strE).put(C0098a.a(new byte[]{-8, 95, -51, 21, -128, 61, 38, 51, -4, 91, -38}, new byte[]{-114, 48, -87, 74, -14, 88, 75, 82}), strE2));
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void c(BufferedReader bufferedReader, JSONArray jSONArray, String str) {
        try {
            ArrayList<C0138d> arrayList = new ArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.equals("") && !line.contains(C0098a.a(new byte[]{76, -99, -85, -85, -54, 63, 48}, new byte[]{111, -40, -13, -1, -121, 12, 101, -108})) && line.contains(C0098a.a(new byte[]{110, -91, 13, 17, -104, -108, -37}, new byte[]{77, -32, 85, 69, -47, -38, -99, 101}))) {
                    String strE = e(C0098a.a(new byte[]{-42, -108, -48, 48, 0, -98, -14, 35, -97, -64}, new byte[]{-94, -30, -73, 29, 110, -1, -97, 70}), C0098a.a(new byte[]{-20, -95, -94, -34, -64, -59, 8, 58, -87, -18, -21}, new byte[]{-50, -127, -42, -88, -89, -24, 100, 85}), line);
                    String strE2 = e(C0098a.a(new byte[]{-94, 126, -55, -9, 58, -56, 51, 119, -79, 96, -61, -65, 104}, new byte[]{-59, 12, -90, -126, 74, -27, 71, 30}), C0098a.a(new byte[]{15, -49}, new byte[]{45, -29, -106, -53, -118, -42, 96, -23}), line);
                    if (strE.equals("")) {
                        strE = line.substring(line.lastIndexOf(C0098a.a(new byte[]{94}, new byte[]{114, -28, 75, 100, 39, -114, -106, 22})) + 1);
                    }
                    arrayList.add(new C0138d(strE, bufferedReader.readLine().trim(), strE2));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0138d c0138d : arrayList) {
                String strA = c0138d.a();
                if (linkedHashMap.containsKey(strA)) {
                    ((List) linkedHashMap.get(strA)).add(c0138d);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0138d);
                    linkedHashMap.put(strA, arrayList2);
                }
            }
            for (String str2 : linkedHashMap.keySet()) {
                List<C0138d> list = (List) linkedHashMap.get(str2);
                ArrayList arrayList3 = new ArrayList();
                for (C0138d c0138d2 : list) {
                    arrayList3.add(c0138d2.b() + C0098a.a(new byte[]{1}, new byte[]{37, -48, -17, -26, 94, 118, 70, -94}) + c0138d2.c());
                }
                jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{123, -24, -48, -120, -37, -123}, new byte[]{13, -121, -76, -41, -78, -31, -10, -25}), new JSONObject().put(C0098a.a(new byte[]{16, 39, 40, -84, 32, -85, -60, -57, 57, 61, 62, -97}, new byte[]{102, 72, 76, -13, 80, -57, -91, -66}), TextUtils.join(C0098a.a(new byte[]{-72}, new byte[]{-101, 107, 91, -40, -48, 48, -45, -122}), arrayList3)).put(C0098a.a(new byte[]{-107, -40, -48}, new byte[]{-27, -79, -77, 96, 31, -67, 110, -117}), str).toString()).put(C0098a.a(new byte[]{-62, -111, 97, 43, 114, 65, -40, 61}, new byte[]{-76, -2, 5, 116, 28, 32, -75, 88}), str2).put(C0098a.a(new byte[]{92, 75, -79, 120, -90, -36, -12}, new byte[]{42, 36, -43, 39, -42, -75, -105, 63}), str).put(C0098a.a(new byte[]{-100, -80, 116, -76, -70, 53, 14, -85, -104, -76, 99}, new byte[]{-22, -33, 16, -21, -56, 80, 99, -54}), ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d(BufferedReader bufferedReader, JSONArray jSONArray, String str) {
        int i;
        int i2;
        try {
            ArrayList<C0138d> arrayList = new ArrayList();
            String strSubstring = "";
            while (true) {
                String line = bufferedReader.readLine();
                i = 1;
                i2 = 3;
                if (line == null) {
                    break;
                }
                if (!line.equals("") && line.contains(C0098a.a(new byte[]{6}, new byte[]{42, -114, 84, -66, -67, -126, 27, -71}))) {
                    if (line.contains(C0098a.a(new byte[]{42, -70, 19, 99, -40, 0, -49, 103}, new byte[]{6, -103, 116, 6, -74, 114, -86, 68}))) {
                        strSubstring = line.substring(0, line.indexOf(C0098a.a(new byte[]{-101}, new byte[]{-73, -121, -38, -89, -69, 102, -34, -108})));
                    } else {
                        String[] strArrSplit = line.split(C0098a.a(new byte[]{-127}, new byte[]{-83, 76, -62, -2, 97, -55, -90, -71}));
                        arrayList.add(new C0138d(strArrSplit[0], strArrSplit[1], strSubstring));
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C0138d c0138d : arrayList) {
                String strA = c0138d.a();
                if (linkedHashMap.containsKey(strA)) {
                    ((List) linkedHashMap.get(strA)).add(c0138d);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c0138d);
                    linkedHashMap.put(strA, arrayList2);
                }
            }
            for (String str2 : linkedHashMap.keySet()) {
                List<C0138d> list = (List) linkedHashMap.get(str2);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (C0138d c0138d2 : list) {
                    String strB = c0138d2.b();
                    if (linkedHashMap2.containsKey(strB)) {
                        ((List) linkedHashMap2.get(strB)).add(c0138d2);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(c0138d2);
                        linkedHashMap2.put(strB, arrayList3);
                    }
                }
                int size = 0;
                for (List list2 : linkedHashMap2.values()) {
                    if (list2.size() > size) {
                        size = list2.size();
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                int i3 = 0;
                while (i3 < size) {
                    ArrayList arrayList4 = new ArrayList();
                    for (String str3 : linkedHashMap2.keySet()) {
                        try {
                            C0138d c0138d3 = (C0138d) ((List) linkedHashMap2.get(str3)).get(i3);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            byte[] bArr = new byte[i];
                            bArr[0] = 91;
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = 127;
                            bArr2[1] = 70;
                            bArr2[2] = 120;
                            try {
                                bArr2[3] = -126;
                                bArr2[4] = -29;
                                bArr2[5] = -63;
                                try {
                                    bArr2[6] = -71;
                                    bArr2[7] = -99;
                                    sb.append(C0098a.a(bArr, bArr2));
                                    sb.append(c0138d3.c());
                                    arrayList4.add(sb.toString());
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                        }
                        i = 1;
                    }
                    if (arrayList4.size() > 0) {
                        linkedHashMap3.put(C0098a.a(new byte[]{-112, -111, -18, 82, 38, 104}, new byte[]{119, 43, 81, -70, -111, -57, -42, 90}) + (i3 + 1), TextUtils.join(C0098a.a(new byte[]{-56}, new byte[]{-21, 94, -58, 78, -21, 25, -37, 40}), arrayList4));
                    }
                    i3++;
                    i2 = 3;
                    i = 1;
                }
                byte[] bArr3 = new byte[i2];
                bArr3[0] = 124;
                bArr3[1] = 74;
                bArr3[2] = -55;
                jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{109, 29, 78, -17, -20, -17}, new byte[]{27, 114, 42, -80, -123, -117, 11, -3}), new JSONObject().put(C0098a.a(new byte[]{73, -36, 100, 52, -74, -5, 59, -88, 96, -58, 114, 7}, new byte[]{63, -77, 0, 107, -58, -105, 90, -47}), TextUtils.join(C0098a.a(bArr3, new byte[]{88, 110, -19, 104, -26, 46, 126, -63}), linkedHashMap3.values())).put(C0098a.a(new byte[]{49, -121, 38, 99, -34, -111, 22, -48, 24, -114, 48, 83, -61}, new byte[]{71, -24, 66, 60, -82, -3, 119, -87}), TextUtils.join(C0098a.a(new byte[]{-95, -25, -13}, new byte[]{-123, -61, -41, 56, -119, -127, -10, -100}), linkedHashMap3.keySet())).put(C0098a.a(new byte[]{92, -31, 110}, new byte[]{44, -120, 13, 54, 74, 52, -47, 41}), str).toString()).put(C0098a.a(new byte[]{50, 26, 118, 9, 111, 19, 57, 120}, new byte[]{68, 117, 18, 86, 1, 114, 84, 29}), str2).put(C0098a.a(new byte[]{-23, -22, 106, -75, -128, -102, -82}, new byte[]{-97, -123, 14, -22, -16, -13, -51, -22}), str).put(C0098a.a(new byte[]{6, -128, -88, 93, -65, 29, 91, 81, 2, -124, -65}, new byte[]{112, -17, -52, 2, -51, 120, 54, 48}), ""));
                i2 = 3;
                i = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String e(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str);
            return str3.substring(iIndexOf + str.length(), str3.indexOf(str2, iIndexOf));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(C0098a.a(new byte[]{28, -65, 18, -126, 25, -45, 111, 79, 28, -65, 18, -126, 25, -45, 124, 66, 17, 116, -73, 5, -47, 113, -44, -122, -117, 53, -40, 59, -85, 27, -2, -32, -44, 42, -121, 75, -114, 120}, new byte[]{49, -110, 63, -81, 52, -2, 66, 98}));
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws IOException {
        char c = 1;
        byte b = 0;
        int i = 8;
        if (!str2.equals(C0098a.a(new byte[]{36}, new byte[]{21, 102, 10, -25, -83, -64, -91, 118}))) {
            return "";
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{30, 32, -19}, new byte[]{107, 82, -127, -104, -80, -114, 47, -65}));
        String strOptString2 = jSONObject.optString(C0098a.a(new byte[]{-57, 81, -32}, new byte[]{-73, 56, -125, -30, -112, -123, -93, 53}));
        String strOptString3 = jSONObject.optString(C0098a.a(new byte[]{1, 46, -89, -31, 64}, new byte[]{102, 92, -56, -108, 48, -47, 53, 71}));
        String strOptString4 = jSONObject.optString(C0098a.a(new byte[]{-86, 80, -63, 111, 99, 42, 27}, new byte[]{-55, 57, -77, 12, 22, 67, 111, 15}));
        String strL = C0197c.l(strOptString, a());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strL.getBytes());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        JSONArray jSONArray = new JSONArray();
        if (strL.contains(C0098a.a(new byte[]{-64, 75, 16, 39, 50, 97, 16}, new byte[]{-29, 44, 117, 73, 64, 4, 51, 72}))) {
            if (strOptString4.equals(C0098a.a(new byte[]{10}, new byte[]{59, -31, -63, -29, -107, 67, 82, -125}))) {
                d(bufferedReader, jSONArray, strOptString2);
            } else {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    String strSubstring = "";
                    int i2 = 0;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.equals("")) {
                            byte[] bArr = new byte[i];
                            bArr[b] = 99;
                            bArr[c] = -96;
                            bArr[2] = -81;
                            bArr[3] = 101;
                            bArr[4] = 105;
                            bArr[5] = -34;
                            bArr[6] = 28;
                            bArr[7] = 118;
                            byte[] bArr2 = new byte[i];
                            bArr2[b] = 79;
                            bArr2[1] = -125;
                            bArr2[2] = -56;
                            bArr2[3] = b;
                            bArr2[4] = 7;
                            bArr2[5] = -84;
                            bArr2[6] = 121;
                            bArr2[7] = 85;
                            if (line.contains(C0098a.a(bArr, bArr2))) {
                                int i3 = i2 + 1;
                                if (i3 > 1) {
                                    byte[] bArr3 = new byte[1];
                                    bArr3[b] = -37;
                                    linkedHashMap.put(strSubstring, TextUtils.join(C0098a.a(bArr3, new byte[]{-8, -128, -70, -15, -77, 100, 59, -74}), arrayList));
                                    arrayList.clear();
                                }
                                strSubstring = line.substring(0, line.indexOf(C0098a.a(new byte[]{-110}, new byte[]{-66, 66, -43, -49, 33, -67, 102, 1})));
                                i2 = i3;
                            } else {
                                arrayList.add(line.replace(C0098a.a(new byte[]{-119}, new byte[]{-91, -98, -94, -50, -19, 63, 38, -125}), C0098a.a(new byte[]{73}, new byte[]{109, -35, 78, -37, -84, 14, -19, 94})));
                            }
                        }
                        c = 1;
                        i = 8;
                        b = 0;
                    }
                    if (arrayList.size() > 0) {
                        linkedHashMap.put(strSubstring, TextUtils.join(C0098a.a(new byte[]{43}, new byte[]{8, -64, 47, 15, -96, -109, -84, 39}), arrayList));
                    }
                    for (String str3 : linkedHashMap.keySet()) {
                        jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{-84, 53, -78, -26, 47, 114}, new byte[]{-38, 90, -42, -71, 70, 22, 3, -89}), new JSONObject().put(C0098a.a(new byte[]{91, -5, -10, 39, -67, -65, 70, -98, 114, -31, -32, 20}, new byte[]{45, -108, -110, 120, -51, -45, 39, -25}), (String) linkedHashMap.get(str3)).put(C0098a.a(new byte[]{96, 46, 57}, new byte[]{16, 71, 90, -22, 75, 113, 73, -108}), strOptString2).toString()).put(C0098a.a(new byte[]{57, 51, -97, -55, 118, -21, 6, 33}, new byte[]{79, 92, -5, -106, 24, -118, 107, 68}), str3).put(C0098a.a(new byte[]{-14, -103, -104, -53, 127, -30, 72}, new byte[]{-124, -10, -4, -108, 15, -117, 43, -114}), strOptString2).put(C0098a.a(new byte[]{116, -76, 18, -7, 107, -71, 32, 113, 112, -80, 5}, new byte[]{2, -37, 118, -90, 25, -36, 77, 16}), ""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (strL.contains(C0098a.a(new byte[]{-50, 127, 99, 19, 49, -25, -62}, new byte[]{-19, 58, 59, 71, 124, -44, -105, 24}))) {
            if (strOptString3.equals(C0098a.a(new byte[]{104}, new byte[]{89, 23, 21, -117, 81, -25, 43, 77}))) {
                c(bufferedReader, jSONArray, strOptString2);
            } else {
                b(bufferedReader, jSONArray, strOptString2);
            }
        }
        bufferedReader.close();
        byteArrayInputStream.close();
        return new JSONObject().put(C0098a.a(new byte[]{79, 39, -98, 12, 119, -53, 80, -23, 75}, new byte[]{63, 70, -7, 105, 20, -92, 37, -121}), 1).put(C0098a.a(new byte[]{50, 59, 62, -90}, new byte[]{94, 82, 77, -46, -43, 21, -65, -47}), jSONArray).toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject(list.get(0));
        String string = jSONObject.getString(C0098a.a(new byte[]{7, 104, -74, -81, -53, -30, 59, -16, 46, 114, -96, -100}, new byte[]{113, 7, -46, -16, -69, -114, 90, -119}));
        String string2 = jSONObject.getString(C0098a.a(new byte[]{41, -51, 66}, new byte[]{89, -92, 33, -79, -64, -109, -111, -101}));
        String strA = C0098a.a(new byte[]{30, 63, 43, -42, -15, -79}, new byte[]{-9, -65, -94, 51, 126, 1, 26, 32});
        String strOptString = jSONObject.optString(C0098a.a(new byte[]{97, 30, -27, 3, 48, -19, -15, 66, 72, 23, -13, 51, 45}, new byte[]{23, 113, -127, 92, 64, -127, -112, 59}));
        if (!strOptString.equals("")) {
            strA = strOptString;
        }
        String[] strArrSplit = string.split(C0098a.a(new byte[]{34, 38}, new byte[]{126, 2, 50, -22, -115, -3, -56, 108}));
        String strA2 = C0098a.a(new byte[]{34, 72, 62, -62, -71, 62, 103, -13, 113, 58, 25, -121}, new byte[]{-59, -36, -117, 42, 30, -72, -128, 104});
        if (strArrSplit.length == 2) {
            strA2 = strArrSplit[0];
            str = C0098a.a(new byte[]{-104, -59, -116, 14, -41, 85, -63, 25, -50, -78, -68, 104, -84, 87, -66}, new byte[]{126, 87, 33, -24, 67, -21, 36, -123}) + strArrSplit[1];
        } else {
            str = "";
        }
        JSONObject jSONObjectPut = new JSONObject().put(C0098a.a(new byte[]{-28, -41, 8, 17, 2, -113}, new byte[]{-110, -72, 108, 78, 107, -21, 10, -27}), list.get(0)).put(C0098a.a(new byte[]{78, 72, 105, -23, -52, -41, -26, -56}, new byte[]{56, 39, 13, -74, -94, -74, -117, -83}), strA2).put(C0098a.a(new byte[]{-28, 49, 3, -79, 2, 92, -120}, new byte[]{-110, 94, 103, -18, 114, 53, -21, -99}), string2).put(C0098a.a(new byte[]{-12, -68, 40, -1, -13, -103, 56, 35, -27}, new byte[]{-128, -59, 88, -102, -84, -9, 89, 78}), C0098a.a(new byte[]{-52, 43, -127, 76, 59, -122, -117, -99, -97, 89, -90, 9}, new byte[]{43, -65, 52, -92, -100, 0, 108, 6})).put(C0098a.a(new byte[]{-63, -103, 29, -89, -48, 37, 46, 29}, new byte[]{-73, -10, 121, -8, -87, 64, 79, 111}), "").put(C0098a.a(new byte[]{28, -55, 87, 17, 74, 13, -98, 82}, new byte[]{106, -90, 51, 78, 43, 127, -5, 51}), "").put(C0098a.a(new byte[]{-74, -66, -63, 108, 47, 34, 45, 59, -78, -70, -42}, new byte[]{-64, -47, -91, 51, 93, 71, 64, 90}), "").put(C0098a.a(new byte[]{102, 59, 99, 41, -1, 68, -86, 25, 98}, new byte[]{16, 84, 7, 118, -98, 39, -34, 118}), "").put(C0098a.a(new byte[]{-77, 106, -38, 73, -115, 19, -121, -78, -90, 113, -47, 100}, new byte[]{-59, 5, -66, 22, -23, 122, -11, -41}), "").put(C0098a.a(new byte[]{-68, 118, -83, 96, 20, -106, 99, 119, -81, 119, -67}, new byte[]{-54, 25, -55, 63, 119, -7, 13, 3}), str);
        if (string.length() > 0) {
            jSONObjectPut.put(C0098a.a(new byte[]{-124, 52, 110, 48, -108, -25, -102, -101, -83, 61, 120, 0, -119}, new byte[]{-14, 91, 10, 111, -28, -117, -5, -30}), strA);
            jSONObjectPut.put(C0098a.a(new byte[]{98, 58, -73, 26, -111, 11, 14, -92, 75, 32, -95, 41}, new byte[]{20, 85, -45, 69, -31, 103, 111, -35}), string);
        }
        return new JSONObject().put(C0098a.a(new byte[]{59, -83, 52, 66}, new byte[]{87, -60, 71, 54, 37, 119, -36, 17}), new JSONArray().put(jSONObjectPut)).toString();
    }

    public String homeContent(boolean z) throws JSONException {
        char c;
        int i;
        String str;
        JSONObject jSONObject;
        String strA;
        String str2;
        JSONArray jSONArray = new JSONArray();
        int i2 = 1;
        char c2 = 0;
        int i3 = 4;
        int i4 = 7;
        if (this.a.contains(C0098a.a(new byte[]{-39}, new byte[]{-3, 99, 74, -38, 17, 96, 67, -19}))) {
            String str3 = this.a;
            if (str3.contains(C0098a.a(new byte[]{70, -97, 64}, new byte[]{96, -71, 102, -12, 6, 43, -25, -120}))) {
                String[] strArrSplit = this.a.split(C0098a.a(new byte[]{69, 15, 81}, new byte[]{99, 41, 119, -20, -51, 82, 8, 83}));
                c = 0;
                String str4 = strArrSplit[0];
                i = 1;
                str = strArrSplit.length > 1 ? strArrSplit[1] : "";
                str3 = str4;
            } else {
                c = 0;
                i = 1;
                str = "";
            }
            byte[] bArr = new byte[i];
            bArr[c] = -6;
            String[] strArrSplit2 = str3.split(C0098a.a(bArr, new byte[]{-39, -94, 13, 11, -89, -26, 41, 15}));
            for (String str5 : strArrSplit2) {
                String[] strArrSplit3 = str5.split(C0098a.a(new byte[]{124, -46}, new byte[]{32, -10, 74, -13, 101, 108, -101, 100}));
                String str6 = strArrSplit3[0];
                String str7 = strArrSplit3[1];
                jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{26, -50, 100, -45, 49, -106, -109}, new byte[]{110, -73, 20, -74, 110, -1, -9, -17}), new JSONObject().put(C0098a.a(new byte[]{-76, -35, -115}, new byte[]{-63, -81, -31, -72, 26, 48, 102, 107}), str7).put(C0098a.a(new byte[]{-48, -64, 5}, new byte[]{-96, -87, 102, 58, -82, 23, -51, 109}), str7.contains(C0098a.a(new byte[]{-67, -61, -51, 124}, new byte[]{-109, -73, -75, 8, 126, 45, 127, -106})) ? str : "").toString()).put(C0098a.a(new byte[]{18, 96, -127, 49, -113, -65, 98, -100, 3}, new byte[]{102, 25, -15, 84, -48, -47, 3, -15}), str6));
            }
            jSONObject = new JSONObject();
            strA = C0098a.a(new byte[]{4, 114, -89, 60, 108}, new byte[]{103, 30, -58, 79, 31, -36, 68, 67});
        } else {
            JSONArray jSONArray2 = new JSONArray(C0197c.l(this.a, a()));
            int i5 = 0;
            while (i5 < jSONArray2.length()) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i5);
                byte[] bArr2 = new byte[i3];
                // fill-array-data instruction
                bArr2[0] = 41;
                bArr2[1] = -108;
                bArr2[2] = 80;
                bArr2[3] = 14;
                String strOptString = jSONObject2.optString(C0098a.a(bArr2, new byte[]{71, -11, 61, 107, -57, -85, -22, -81}));
                String strOptString2 = jSONObject2.optString(C0098a.a(new byte[]{-124, 56, 52}, new byte[]{-15, 74, 88, -37, 36, -36, 104, 125}));
                String strOptString3 = jSONObject2.optString(C0098a.a(new byte[]{120, 7, 0, 66, 58}, new byte[]{31, 117, 111, 55, 74, 54, -108, 2}));
                byte[] bArr3 = new byte[i4];
                // fill-array-data instruction
                bArr3[0] = 116;
                bArr3[1] = -47;
                bArr3[2] = -81;
                bArr3[3] = 64;
                bArr3[4] = -56;
                bArr3[5] = 29;
                bArr3[6] = -105;
                String strOptString4 = jSONObject2.optString(C0098a.a(bArr3, new byte[]{23, -72, -35, 35, -67, 116, -29, 76}));
                if (strOptString2.contains(C0098a.a(new byte[]{-50, -127, 85}, new byte[]{-24, -89, 115, 73, 4, -10, 9, 108}))) {
                    String[] strArrSplit4 = strOptString2.split(C0098a.a(new byte[]{-115, -43, -120}, new byte[]{-85, -13, -82, 53, 60, -4, 93, -128}));
                    String str8 = strArrSplit4[c2];
                    str2 = strArrSplit4.length > i2 ? strArrSplit4[i2] : "";
                    strOptString2 = str8;
                } else {
                    str2 = "";
                }
                jSONArray.put(new JSONObject().put(C0098a.a(new byte[]{16, 81, -55, -76, 66, 79, -33}, new byte[]{100, 40, -71, -47, 29, 38, -69, 14}), new JSONObject().put(C0098a.a(new byte[]{-66, -21, -41}, new byte[]{-53, -103, -69, 62, 87, 14, 105, 58}), strOptString2).put(C0098a.a(new byte[]{-22, -26, -96}, new byte[]{-102, -113, -61, -13, -106, -72, 99, 113}), str2).put(C0098a.a(new byte[]{-27, -36, -124, -114, -90}, new byte[]{-126, -82, -21, -5, -42, -88, -35, -71}), strOptString3).put(C0098a.a(new byte[]{73, 82, -79, 51, -13, -87, -98}, new byte[]{42, 59, -61, 80, -122, -64, -22, -120}), strOptString4).toString()).put(C0098a.a(new byte[]{53, 123, 98, 111, -71, -83, -68, -107, 36}, new byte[]{65, 2, 18, 10, -26, -61, -35, -8}), strOptString));
                i5++;
                i2 = 1;
                c2 = 0;
                i3 = 4;
                i4 = 7;
            }
            jSONObject = new JSONObject();
            strA = C0098a.a(new byte[]{-40, 116, -85, -125, -37}, new byte[]{-69, 24, -54, -16, -88, -107, -100, 94});
        }
        return jSONObject.put(strA, jSONArray).toString();
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-86, -101, -128, 61, -69, 92, 88, 8, -111, -100}, new byte[]{-1, -24, -27, 79, -106, 29, 63, 109}), this.b);
        return new JSONObject().put(C0098a.a(new byte[]{77, 111, 20, 47, 126}, new byte[]{61, 14, 102, 92, 27, 113, -63, -66}), 0).put(C0098a.a(new byte[]{-9, -111, 93, 61, -34, -70}, new byte[]{-97, -12, 60, 89, -69, -56, 110, -30}), map.toString()).put(C0098a.a(new byte[]{-62, -126, 23, -32, 96, -125, -96}, new byte[]{-78, -18, 118, -103, 53, -15, -52, -112}), "").put(C0098a.a(new byte[]{35, 40, -112}, new byte[]{86, 90, -4, 21, -120, 101, 67, -116}), str2).toString();
    }
}
