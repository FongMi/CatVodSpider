package com.github.catvod.spider.merge.Dw;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.merge.Fs.E;
import com.github.catvod.spider.merge.t0.C1390a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class i {
    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static int b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.github.catvod.spider.merge.A0.a, com.github.catvod.spider.merge.t0.c] */
    public static Bitmap c(String str) {
        try {
            EnumMap enumMap = new EnumMap(j.class);
            enumMap.put(j.CHARACTER_SET, "UTF-8");
            enumMap.put(j.MARGIN, 2);
            com.github.catvod.spider.merge.s.b bVarA = new com.github.catvod.spider.merge.A0.a().a(str, C1390a.l, com.github.catvod.spider.merge.nz.o.a(240), com.github.catvod.spider.merge.nz.o.a(240), enumMap);
            int iC = bVarA.c();
            int iB = bVarA.b();
            int[] iArr = new int[iC * iB];
            for (int i = 0; i < iB; i++) {
                int i2 = i * iC;
                for (int i3 = 0; i3 < iC; i3++) {
                    iArr[i2 + i3] = bVarA.a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iB, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, iC, 0, 0, iC, iB);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void e(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static String g(LinkedHashMap linkedHashMap) {
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

    public static Object[] h(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean zContains = str.contains(".bmp");
            String strG = com.github.catvod.spider.merge.mk.g.g(str, null);
            if (zContains) {
                m(linkedHashMap, new String(Base64.decode(strG.split("\\*\\*")[1], 0)));
            } else {
                m(linkedHashMap, strG);
            }
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(g(linkedHashMap).getBytes("UTF-8"))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void i(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void j(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static com.github.catvod.spider.merge.Em.h l(String str) {
        return E.c(str);
    }

    public static void m(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                if (!line.trim().isEmpty()) {
                    String[] strArrSplit = line.split(",");
                    if (strArrSplit.length >= 2) {
                        if (line.contains("#genre#")) {
                            String strTrim = strArrSplit[0].trim();
                            if (linkedHashMap.containsKey(strTrim)) {
                                linkedHashMap3 = (LinkedHashMap) linkedHashMap.get(strTrim);
                            } else {
                                linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap.put(strTrim, linkedHashMap3);
                            }
                        } else {
                            String strTrim2 = strArrSplit[0].trim();
                            for (String str2 : strArrSplit[1].trim().split("#")) {
                                String strTrim3 = str2.trim();
                                if (!strTrim3.isEmpty() && (strTrim3.startsWith("http") || strTrim3.startsWith("rtsp") || strTrim3.startsWith("rtmp"))) {
                                    if (linkedHashMap3.containsKey(strTrim2)) {
                                        arrayList = (ArrayList) linkedHashMap3.get(strTrim2);
                                    } else {
                                        arrayList = new ArrayList();
                                        linkedHashMap3.put(strTrim2, arrayList);
                                    }
                                    if (!arrayList.contains(strTrim3)) {
                                        arrayList.add(strTrim3);
                                    }
                                }
                            }
                        }
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

    public static int o(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int p(int i, Object obj) {
        return o(i, obj != null ? obj.hashCode() : 0);
    }

    public boolean d() {
        throw null;
    }

    public Object n() {
        throw null;
    }
}
