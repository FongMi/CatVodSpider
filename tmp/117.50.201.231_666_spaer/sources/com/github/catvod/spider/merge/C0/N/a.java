package com.github.catvod.spider.merge.C0.N;

import android.graphics.Bitmap;
import android.util.Base64;
import com.github.catvod.spider.merge.C0.c0.h;
import com.github.catvod.spider.merge.C0.d0.E;
import com.github.catvod.spider.merge.C0.j.o;
import com.github.catvod.spider.merge.C0.k.g;
import com.github.catvod.spider.merge.C0.r.EnumC0199b;
import com.github.catvod.spider.merge.C0.s.b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static int b(int i, int i2) {
        int i3 = (i2 * 4) ^ i;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static Bitmap c(String str) {
        try {
            EnumMap enumMap = new EnumMap(EnumC0199b.class);
            enumMap.put(EnumC0199b.CHARACTER_SET, "UTF-8");
            enumMap.put(EnumC0199b.MARGIN, 2);
            b bVarA = new com.github.catvod.spider.merge.C0.A0.a().a(str, com.github.catvod.spider.merge.C0.r.a.l, o.a(240), o.a(240), enumMap);
            int iC = bVarA.c();
            int iB = bVarA.b();
            int[] iArr = new int[iC * iB];
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iC; i2++) {
                    iArr[(i * iC) + i2] = bVarA.a(i2, i) ? -16777216 : -1;
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
                        } catch (JSONException e) {
                        }
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("group", str);
                    jSONObject2.put("channels", jSONArray2);
                } catch (JSONException e2) {
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
            String strG = g.g(str, null);
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

    public static h l(String str) {
        return E.c(str);
    }

    public static void m(LinkedHashMap linkedHashMap, String str) {
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String line = bufferedReader.readLine();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            String line2 = line;
            while (line2 != null) {
                if (line2.trim().isEmpty()) {
                    linkedHashMap2 = linkedHashMap4;
                } else {
                    String[] strArrSplit = line2.split(",");
                    if (strArrSplit.length < 2) {
                        linkedHashMap2 = linkedHashMap4;
                    } else if (line2.contains("#genre#")) {
                        String strTrim = strArrSplit[0].trim();
                        if (linkedHashMap.containsKey(strTrim)) {
                            linkedHashMap2 = (LinkedHashMap) linkedHashMap.get(strTrim);
                        } else {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(strTrim, linkedHashMap2);
                        }
                    } else {
                        String strTrim2 = strArrSplit[0].trim();
                        for (String str2 : strArrSplit[1].trim().split("#")) {
                            String strTrim3 = str2.trim();
                            if (!strTrim3.isEmpty() && (strTrim3.startsWith("http") || strTrim3.startsWith("rtsp") || strTrim3.startsWith("rtmp"))) {
                                if (linkedHashMap4.containsKey(strTrim2)) {
                                    arrayList = (ArrayList) linkedHashMap4.get(strTrim2);
                                } else {
                                    arrayList = new ArrayList();
                                    linkedHashMap4.put(strTrim2, arrayList);
                                }
                                if (!arrayList.contains(strTrim3)) {
                                    arrayList.add(strTrim3);
                                }
                            }
                        }
                        linkedHashMap2 = linkedHashMap4;
                    }
                }
                line2 = bufferedReader.readLine();
                linkedHashMap4 = linkedHashMap2;
            }
            bufferedReader.close();
            if (linkedHashMap3.isEmpty()) {
                return;
            }
            linkedHashMap.put("未分组", linkedHashMap3);
        } catch (Throwable th) {
        }
    }

    public static int o(int i, int i2) {
        int i3 = (-862048943) * i2;
        int i4 = (((i3 << 15) | (i3 >>> 17)) * 461845907) ^ i;
        return (((i4 << 13) | (i4 >>> 19)) * 5) - 430675100;
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
