package com.github.catvod.spider.merge.bY;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class A {
    private static Bitmap c;
    private static String d;
    private static final String e = com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, 55, -105, 12, -34, 22}, new byte[]{-85, 67, -31, 120, -77, 102, -47, 47});
    private String a;
    private final Map<String, Map<String, String>> b = new HashMap();

    private com.github.catvod.spider.merge.KI.e<String> a(String str, boolean z) {
        com.github.catvod.spider.merge.KI.e<String> eVar = new com.github.catvod.spider.merge.KI.e<>();
        eVar.e(0);
        try {
            b(true);
            String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{101, 38, -125, -9, -33, 116, -76, -16, 125, 51, -103, -87, -50, 47, -14, -69, 120, 124, -108, -24, -63, 97, -24, -73, 108, 32, -110, -88, -40, 60, -6, -79, 126, 52, -110, -11, -109, 61, -13, -66, 127, 55, -98, -29, -111}, new byte[]{13, 82, -9, -121, -84, 78, -101, -33}) + m(this.a, com.github.catvod.spider.merge.XI.f.a(new byte[]{47, -32, -113, 106, -110, -4, -64}, new byte[]{92, -120, -18, 24, -9, -107, -92, 15})) + com.github.catvod.spider.merge.XI.f.a(new byte[]{-103, 93, 66, -117, 11, -12}, new byte[]{-65, 59, 48, -28, 102, -55, -18, 74}) + m(this.a, com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, -41}, new byte[]{-74, -68, -66, 31, 91, 24, -77, 119})) + com.github.catvod.spider.merge.XI.f.a(new byte[]{-100, -26, -104, -77, -12, 75, 122}, new byte[]{-70, -107, -3, -40, -111, 50, 71, 10}) + m(this.a, com.github.catvod.spider.merge.XI.f.a(new byte[]{-41, -127, 3, 127, 70}, new byte[]{-92, -28, 104, 26, 63, -43, 29, 91})) + com.github.catvod.spider.merge.XI.f.a(new byte[]{74, 68, 43, -72, -24, 48, -120, -47, 9, 92, 38, -77, -19, 57, -109, -34, 31, 82, 43, -65, -96, 113, -109, -36, 4, 74, 43, -78, -8, 44, -120, -36, 4, 94, 43, -80, -8, 41, -109, -56, 9, 73, 120, -19, -69, 33, -59, -49, 51, 66, 33, -31, -81, 117, -123, -118, 94, 19}, new byte[]{108, 43, 69, -36, -99, 64, -75, -65});
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{43, 54, 61, -115, 40, -115, -111, 9}, new byte[]{77, 69, 84, -23, 68, -28, -30, 125}), arrayList.toString());
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-82, 34, 108, 97}, new byte[]{-34, 67, 24, 9, -77, -82, 70, -99}), e);
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.h(str2, map, f()).a());
            if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-76, 113, -2, -117, -42}, new byte[]{-47, 3, -116, -27, -71, 76, 103, 49})) == 0) {
                String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{111, -122, -125, 83, 24}, new byte[]{10, -2, -9, 33, 121, 8, -16, 88})).optJSONArray(com.github.catvod.spider.merge.XI.f.a(new byte[]{-44, 115, -26, 115}, new byte[]{-72, 26, -107, 7, -108, -50, -73, -58})).optJSONObject(0).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-68, 20}, new byte[]{-56, 123, 33, 15, -113, -35, 43, -30}));
                if (TextUtils.isEmpty(strOptString) && z) {
                    return a(str, false);
                }
                eVar.f(strOptString);
            } else if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-119, 29, -53, 81, -28}, new byte[]{-20, 111, -71, 63, -117, -70, 87, 19})) == 2) {
                eVar.g(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{26, -89, 58, 32, 66, -128, 30, -91}, new byte[]{105, -49, 85, 87, 29, -19, 109, -62})));
                if (jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-10, -21, 30, -36, 42, 42, -11, -116}, new byte[]{-123, -125, 113, -85, 117, 71, -122, -21})).equals(com.github.catvod.spider.merge.XI.f.a(new byte[]{49, -38, -31, 49, 19, -12, -91, -2, 101, -87, -53, 77, 77, -34, -24}, new byte[]{-41, 76, 102, -43, -88, 66, 64, 73}))) {
                    eVar.g(com.github.catvod.spider.merge.XI.f.a(new byte[]{87, 36, 47, -55, -73, -30, -86, -118, 50, 123, 62, -92, -53, -54, -26, -29, 4, 45, 69, -75, -89, -88, -60, -128, 87, 38, 9}, new byte[]{-77, -100, -94, 47, 35, 77, 76, 6}));
                }
                eVar.e(2);
            } else {
                eVar.e(jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 5, -41, -67, 20}, new byte[]{-90, 119, -91, -45, 123, 112, -3, -47})));
                eVar.g(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{69, 82, 97, -84, -111, -100, 27, 56}, new byte[]{54, 58, 14, -37, -50, -15, 104, 95})));
            }
        } catch (Exception e2) {
            eVar.e(500);
            eVar.g(e2.getMessage());
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-64, 76, 119, -63, -126, 69, 110, -38}, new byte[]{-93, 35, 7, -72, -94, 32, 28, -88}) + e2.getMessage());
        }
        return eVar;
    }

    private boolean b(boolean z) {
        try {
            n();
            com.github.catvod.spider.merge.XI.o oVarE = com.github.catvod.spider.merge.XI.o.e(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-26, 56, 17, -41, 122, 64, -63, 125, -2, 45, 11, -119, 107, 27, -121, 54, -5, 98, 6, -56, 100, 85, -113, 34, -25, 99, 9, -50, 122, 14, -47, 49, -30, 37, 0, -55, 125, 14, -105, 34, -21, 113, 85, -127, 104, 10, -98, 13, -25, 40, 88, -107, 60, 74, -37, 96, -74, 106, 18, -62, 107, 71, -33, 116, -22, 60, 72, -53, 102, 29, -121, 54, -77, 106, 10, -43, 109, 31, -100, 111, -6, 37, 8, -62, 47, 30, -117, 33, -19, 113, 84, -127, 109, 19, -100, 111, -95, 56, 19, -45, 100, 10, -56, 60, -5, 33, 88, -106, 57, 74, -56, 34, -17, 43, 0, -102, 56}, new byte[]{-114, 76, 101, -89, 9, 122, -18, 82}), f()));
            ArrayList arrayList = new ArrayList();
            if (oVarE.a() == 0) {
                Iterator<com.github.catvod.spider.merge.XI.n> it = oVarE.b().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-22, 15, -23, -81, 105, -66, -112, 121, -14, 26, -13, -15, 120, -27, -42, 50, -9, 85, -2, -80, 119, -85, -34, 38, -21, 84, -5, -74, 118, -31, -46, 55, -20, 26, -6, -70, 104, -69, -34, 37, -5, 21, -2, -30, 40, -94, -48, 56, -20, 30, -18, -85, 39, -30, -34, 63, -18, 93, -14, -81, 127, -10, -34, 107, -26, 30, -15, -70, 110, -31, -103, 52, -26, 8, -23, -80, 113, -31, -47, 107}, new byte[]{-126, 123, -99, -33, 26, -124, -65, 86});
                HashMap map = new HashMap();
                map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-126, -42, -120, 124, 45, 79, -14, -77}, new byte[]{-28, -65, -28, 25, 65, 38, -127, -57}), new JSONArray((Collection) arrayList).toString());
                if (!TextUtils.isEmpty(new JSONObject(com.github.catvod.spider.merge.nU.c.h(strA, map, f()).a()).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-54, -47, 1, 75, 13, 26}, new byte[]{-66, -80, 114, 32, 100, 126, -126, 126}))) || !z) {
                    return true;
                }
                try {
                    return b(false);
                } catch (Exception e2) {
                    e = e2;
                    y.b(new byte[]{-107, -123, -42, 13, -66, -45, -43, 55, -125, -110, -128, 72}, new byte[]{-15, -32, -70, 104, -54, -74, -11, 82}, new StringBuilder(), e);
                    return false;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void c(String str, String str2, String str3, String str4, List<com.github.catvod.spider.merge.XI.n> list, String str5) {
        try {
            String str6 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-49, 49, 46, 58, -4, -91, 98, 47, -41, 36, 52, 100, -19, -2, 36, 100, -46, 107, 57, 37, -30, -80, 62, 104, -58, 55, 63, 101, -29, -10, 62, 116, -104, 44, 41, 21, -23, -19, 34, 109, -8, 50, 63, 40, -78, -21, 63, 117, -62, 99, 41, 47, -28, -6, 52, 61}, new byte[]{-89, 69, 90, 74, -113, -97, 77, 0}) + str + com.github.catvod.spider.merge.XI.f.a(new byte[]{-128, 76, -76, 11}, new byte[]{-90, 57, -33, 54, -97, 98, -29, -12}) + str2 + com.github.catvod.spider.merge.XI.f.a(new byte[]{61, -127, -95, 79, 0, -30, 57, 34, 38}, new byte[]{27, -14, -55, 46, 114, -121, 80, 70}) + str3 + com.github.catvod.spider.merge.XI.f.a(new byte[]{24, 0, -3, -42, 14, -13, 106, 127, 74, 7, -22, -64, 77, -27, 50, 99, 93, 82, -66, -108, 24, -23, 56, 103, 91, 2, -1, -58, 18, -68, 103, 54, 72, 6, -22, -59, 52, -20, 56, 116, 91, 82, -66, -108, 28, -28, 53, 45, 15, 73, -1, -45, 12, -28, 106, 33, 24, 1, -6, -33, 86, -80, 103, 32, 24, 11, -26, -64, 86}, new byte[]{62, 111, -113, -78, 107, -127, 87, 16}) + URLEncoder.encode(str4) + com.github.catvod.spider.merge.XI.f.a(new byte[]{-59, -72, 3, -117, 74, 16, -97, 15, -42, -4, 14, -118, 93, 18, -102, 14, -41, -11, 7, -120, 82, 0, -54, 80, -126, -94, 80, -34, 8, 27, -54, 80, -106, -94, 82, -34, 13, 0, -34, 93, -127, -15, 15, -99, 5, 86, -39, 103, -118, -88, 3, -119, 81, 22, -100, 10, -37, -22, 92, -33, 23, 82, -58, 83, -122, -94, 3}, new byte[]{-29, -52, 62, -69, 100, 38, -87, 56});
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(com.github.catvod.spider.merge.XI.f.a(new byte[]{18, -115, 41, -59, 79, -125}, new byte[]{81, -30, 70, -82, 38, -26, -30, -115}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, 29, -32, -59, -19, 38, 60}, new byte[]{-122, 89, -93, -119, -93, 98, 1, -59}) + str);
            com.github.catvod.spider.merge.XI.o oVarE = com.github.catvod.spider.merge.XI.o.e(com.github.catvod.spider.merge.nU.c.l(str6, mapF));
            if (oVarE.a() == 0) {
                List<com.github.catvod.spider.merge.XI.n> listB = oVarE.b();
                ArrayList arrayList = new ArrayList();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    com.github.catvod.spider.merge.XI.n nVar = listB.get(size);
                    if (nVar.g()) {
                        nVar.j(str5);
                        list.add(nVar);
                    } else if (nVar.b() == 1) {
                        arrayList.add(nVar);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    c(str, str2, str3, listB.get(size2).c(), list, "");
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static A e() {
        return z.a;
    }

    private Map<String, String> f() {
        HashMap map = new HashMap();
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-17, -122, -89, 6, -80, -125, -125, -69, -44, -127}, new byte[]{-70, -11, -62, 116, -99, -62, -28, -34}), com.github.catvod.spider.merge.XI.f.a(new byte[]{50, 72, 2, 115, 95, -97, 61, -123, 74, 9, 72, 58, 27, -92, 53, -60, 27, 72, 15, 105, 19, -67, 8, -118, 78, 23, 86, 42, 8, -45, 11, -61, 17, 17, 76, 33, 19, -117, 106, -98, 86, 7, 57, 106, 67, -97, 57, -3, 26, 69, 51, 115, 71, -36, 105, -103, 72, 9, 75, 44, 19, -37, 23, -30, 43, 106, 52, 54, 19, -97, 53, -63, 26, 7, 63, 127, 80, -104, 51, -125, 95, 100, 16, 104, 92, -98, 57, -123, 78, 20, 76, 52, 3, -35, 108, -124, 79, 7, 43, 123, 85, -110, 46, -61, 80, 18, 75, 45, 29, -64, 106, -118, 58, 67, 31, 53, 2, -64, 104, -124, 79, 9, 72, 52, 3}, new byte[]{127, 39, 120, 26, 51, -13, 92, -86}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-8, 61, 50, -34, -91, 14}, new byte[]{-71, 94, 81, -69, -43, 122, -11, -35}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-101, 111, 49, -53, -33, 2, 39, -16, -109, 112, 47, -120, -36, 18, 41, -22, -63, 124, 41, -58, -60, 18, 35, -16, -57, 74, 21, -31, -101, 89}, new byte[]{-6, 31, 65, -89, -74, 97, 70, -124}));
        if (!TextUtils.isEmpty(g())) {
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{49, -15, 27, 91, -108, -65}, new byte[]{114, -98, 116, 48, -3, -38, 1, 120}), g());
        }
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-25, -45, -37, -85, 72, 63, 58, 7, -16, -59, -59, -70}, new byte[]{-92, -68, -75, -33, 45, 81, 78, 42}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-48, -4, -3, 82, 122, 48, 124, 8, -40, -29, -29, 17, 107, 126, 106, 11, -58, -95, -21, 81, 97, 62, 48, 9, -61, -32, -24, 80, 112, 60, 121, 25, -43, -73, -83, 93, 123, 50, 111, 15, -44, -8, -80, 107, 71, 21, 48, 68}, new byte[]{-79, -116, -115, 62, 19, 83, 29, 124}));
        map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-6, -73, -30, 60, 123, 25, -16}, new byte[]{-88, -46, -124, 89, 9, 124, -126, -42}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, 53, 29, 94, -92, -98, -33, -60, -24, 32, 7, 0, -75, -59, -103, -113, -19, 111, 10, 65, -70}, new byte[]{-104, 65, 105, 46, -41, -92, -16, -21}));
        return map;
    }

    private String i(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{20, -11}, new byte[]{59, -34, 28, -14, 98, 12, -122, -110}))));
                    boolean z = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
                        return com.github.catvod.spider.merge.XI.f.a(new byte[]{50}, new byte[]{29, -50, -115, -41, 116, -51, 9, 96});
                    }
                    String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{81}, new byte[]{126, 49, -58, -103, 41, -33, -119, 123});
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) strA);
                        }
                    }
                    String string = sb.toString();
                    return (z && string.isEmpty()) ? com.github.catvod.spider.merge.XI.f.a(new byte[]{40}, new byte[]{7, 3, 126, 92, -122, 12, -83, -122}) : string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static boolean k() {
        try {
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-47, -99, 104, 2, 73, 112, -16, 101, -55, -120, 111, 1, 74, 37, -83, 62, -105, -117, 125, 27, 94, 63, -15, 41, -42, -124, 51, 4, 8, 101, -66, 58, -48, -58, 123, 23, 78, 59, -83, 41, -42, -115, 121, 77, 86, 58, -30, 58, -38, -49, 109, 0, 86, 37, -72, 35, -41, -113, 110, 29, 87, 119, -81, 41}, new byte[]{-71, -23, 28, 114, 58, 74, -33, 74});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{40, -21, 16, 45, 115, -64, -67, 116, 19, -20}, new byte[]{125, -104, 117, 95, 94, -127, -38, 17}), com.github.catvod.spider.merge.XI.f.a(new byte[]{81, 68, -25, 44, 68, -33, -76, -85, 41, 5, -83, 101, 0, -28, -68, -22, 120, 68, -22, 54, 8, -3, -127, -92, 45, 27, -77, 117, 19, -109, -126, -19, 114, 29, -87, 126, 8, -53, -29, -80, 53, 11, -36, 53, 88, -33, -80, -45, 121, 73, -42, 44, 92, -100, -32, -73, 43, 5, -82, 115, 8, -101, -98, -52, 72, 102, -47, 105, 8, -33, -68, -17, 121, 11, -38, 32, 75, -40, -70, -83, 60, 104, -11, 55, 71, -34, -80, -85, 45, 26, -86, 107, 24, -99, -27, -86, 44, 11, -50, 36, 78, -46, -89, -19, 51, 30, -82, 114, 6, -128, -29}, new byte[]{28, 43, -99, 69, 40, -77, -43, -124}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{95, -16, -15, -125, -16, 26, 113}, new byte[]{13, -107, -105, -26, -126, 127, 3, -58}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-65, -69, 55, 121, 88, -47, -17, 11, -89, -82, 45, 39, 73, -118, -87, 64, -94, -31, 32, 102, 70, -60}, new byte[]{-41, -49, 67, 9, 43, -21, -64, 36}));
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(strA, map));
            SpiderDebug.log(jSONObject.toString());
            String str = com.github.catvod.spider.merge.XI.f.a(new byte[]{57, -64, -54, 2, 77, 79, 33, 98}, new byte[]{81, -76, -66, 114, 62, 117, 14, 77}) + jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{58, -34, 50, 105, -81, 70}, new byte[]{83, -77, 85, 28, -35, 42, 59, 56})) + com.github.catvod.spider.merge.XI.f.a(new byte[]{99, -105, -27, 49, -76, 0, -73, 1, 120, -113, -8, 55, -121, 4, -103, 0, 96, -56, -53, 38, -121, 62, -68, 11, 34, -110, -28, 32, -47, 62, -31, 83, 113, -55, -77, 97, -44, 83, -32, 81, 96, -55, -55, 58, -117, 6, -128, 5, 34, -98, -81, 101, -91, 13, -65, 3, 44, -107, -4, 99}, new byte[]{69, -5, -118, 86, -28, 97, -48, 100});
            d = jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{90, 14, -44, 62}, new byte[]{41, 103, -77, 80, -90, 126, -19, -33}));
            byte[] bArrBytes = com.github.catvod.spider.merge.nU.c.d(str).body().bytes();
            c = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    private String m(String str, String str2) {
        try {
            return (String) ((Map) this.b.get(str)).get(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private com.github.catvod.spider.merge.XI.n n() {
        try {
            com.github.catvod.spider.merge.XI.o oVarE = com.github.catvod.spider.merge.XI.o.e(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-18, 115, 12, 55, 76, 103, -100, 42, -10, 102, 22, 105, 93, 60, -38, 97, -13, 41, 27, 40, 82, 114, -46, 117, -17, 40, 20, 46, 76, 41, -116, 102, -22, 110, 29, 41, 75, 41, -54, 117, -29, 58, 72, 97, 94, 45, -61, 90, -17, 99, 69, 117, 10, 109, -122, 55, -66, 33, 15, 34, 93, 96, -126, 35, -30, 119, 85, 43, 80, 58, -38, 97, -69, 33, 23, 53, 91, 56, -63, 56, -14, 110, 21, 34, 25, 57, -42, 118, -27, 58, 73, 97, 91, 52, -63, 56, -93, 53, 62, 97, 81, 40, -34, 56, -73, 55, 72, 97, 79, 60, -44, 96, -69, 54}, new byte[]{-122, 7, 120, 71, 63, 93, -77, 5}), f()));
            if (oVarE.a() == 0) {
                for (com.github.catvod.spider.merge.XI.n nVar : oVarE.b()) {
                    if (nVar.c().equals(e)) {
                        return nVar;
                    }
                }
            }
            String str = com.github.catvod.spider.merge.XI.f.a(new byte[]{-95, 126, 12, 75, -101, -71, 22, 69, -71, 107, 22, 21, -118, -30, 80, 14, -68, 36, 27, 84, -123, -84, 88, 26, -96, 37, 27, 73, -115, -30, 77, 15, -10, 107, 69, 88, -121, -18, 84, 3, -67, 44, 26, 95, -101, -9, 86, 1, -84, 100, 69}, new byte[]{-55, 10, 120, 59, -24, -125, 57, 106}) + new JSONObject(com.github.catvod.spider.merge.nU.c.l(com.github.catvod.spider.merge.XI.f.a(new byte[]{-13, -76, 33, 86, -31, -39, -37, -114, -21, -95, 59, 8, -16, -126, -99, -59, -18, -18, 54, 73, -1, -52, -107, -47, -14, -17, 50, 67, -26, -105, -111, -52, -21, -84, 52, 82, -9, -107, -107, -45, -14, -95, 55, 74, -9, -36, -105, -51, -14, -91, 59, 82, -26, -102, -124, -60, -90, -16, 115, 71, -30, -109, -85, -56, -1, -3, 103, 19, -94, -42, -58, -103, -67, -73, 48, 68, -81, -46, -46, -57, -14, -91, 57, 66, -31, -34, -81, -125, -7, -92, 38, 82, -3, -120, -111, -49, -71, -20, 119, 82, -3, -120, -111, -49, -71, -20, 119, 83, -7, -63, -40, -125, -14, -77, 49, 73, -15, -106, -121, -60, -23, -30, 121, 4, -31, -122, -122, -41, -2, -78, 33, 79, -1, -122, -42, -4}, new byte[]{-101, -64, 85, 38, -110, -29, -12, -95}), f())).optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{112, -14, 90, -55, 122, -80}, new byte[]{2, -105, 41, -68, 22, -60, -109, 15})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-91, -27, -51, 45, 18, -69, 44, -61}, new byte[]{-57, -127, -66, 89, 125, -48, 73, -83})) + com.github.catvod.spider.merge.XI.f.a(new byte[]{79, -101, 109, 81, -65, 122, 95, -90, 16, -120, 100, 5, -22, 50, 74, -94, 25, -89, 104, 92, -25, 38, 30, -30, 92, -54, 57, 30, -83, 113, 73, -17, 88, -34, 101, 72, -9, 120, 68, -75, 0, -100, 60}, new byte[]{105, -8, 1, 56, -38, 20, 43, -46});
            HashMap map = new HashMap();
            String strA = com.github.catvod.spider.merge.XI.f.a(new byte[]{-117, 1, -109, 54}, new byte[]{-5, 96, -25, 94, -30, -101, -102, 127});
            String str2 = e;
            map.put(strA, str2);
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-60, 106, 116, 44, -53}, new byte[]{-83, 25, 16, 69, -71, -67, 117, -40}), com.github.catvod.spider.merge.XI.f.a(new byte[]{76}, new byte[]{125, -98, -77, 0, -13, -85, 25, 105}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-16, -99, -124, -54, 60, 64, -103, -85, -31, -123}, new byte[]{-110, -15, -21, -87, 87, 31, -11, -62}), com.github.catvod.spider.merge.XI.f.a(new byte[]{84, -113}, new byte[]{15, -46, 8, 53, 87, -6, 12, 93}));
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.h(str, map, f()).a());
            com.github.catvod.spider.merge.XI.n nVar2 = new com.github.catvod.spider.merge.XI.n();
            nVar2.h(jSONObject.optLong(com.github.catvod.spider.merge.XI.f.a(new byte[]{-77, 22, 77, 86, -59}, new byte[]{-43, 101, 18, 63, -95, -6, -76, 57})));
            nVar2.i(str2);
            return nVar2;
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void r(String str, String str2, String str3) {
        try {
            Map<String, String> map = this.b.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.b.put(str, map);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean s() {
        try {
            String str = com.github.catvod.spider.merge.XI.f.a(new byte[]{12, -9, 25, -63, -96, -4, -50, -5, 20, -30, 30, -62, -93, -87, -109, -96, 74, -31, 12, -40, -73, -77, -49, -73, 11, -18, 66, -46, -69, -89, -113, -70, 1, -17, 66, -60, -67, -81, -126, -75, 23, -9, 82, -46, -69, -89, -113, -70, 1, -17, 50, -40, -73, -5}, new byte[]{100, -125, 109, -79, -45, -58, -31, -44}) + d;
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-37, 104, -74, 38, 68, 34, 44, 120, -32, 111}, new byte[]{-114, 27, -45, 84, 105, 99, 75, 29}), com.github.catvod.spider.merge.XI.f.a(new byte[]{98, -72, 85, -41, 26, -119, -105, -85, 26, -7, 31, -98, 94, -78, -97, -22, 75, -72, 88, -51, 86, -85, -94, -92, 30, -25, 1, -114, 77, -59, -95, -19, 65, -31, 27, -123, 86, -99, -64, -80, 6, -9, 110, -50, 6, -119, -109, -45, 74, -75, 100, -41, 2, -54, -61, -73, 24, -7, 28, -120, 86, -51, -67, -52, 123, -102, 99, -110, 86, -119, -97, -17, 74, -9, 104, -37, 21, -114, -103, -83, 15, -108, 71, -52, 25, -120, -109, -85, 30, -26, 24, -112, 70, -53, -58, -86, 31, -9, 124, -33, 16, -124, -124, -19, 0, -30, 28, -119, 88, -42, -64}, new byte[]{47, -41, 47, -66, 118, -27, -10, -124}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{6, 95, -124, 96, 123, -116, 24}, new byte[]{84, 58, -30, 5, 9, -23, 106, -119}), com.github.catvod.spider.merge.XI.f.a(new byte[]{123, 112, 17, -24, 58, -2, 66, 102, 99, 101, 11, -74, 43, -91, 4, 45, 102, 42, 6, -9, 36, -21}, new byte[]{19, 4, 101, -104, 73, -60, 109, 73}));
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(str, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{52, 56, 7, 57, -41}, new byte[]{81, 74, 117, 87, -72, 29, -57, -120})) == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{-21, -56, -30, 121, 95, 1, 60, 76, -2}, new byte[]{-120, -96, -125, 23, 49, 100, 80, 19})));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{17, 74, -23, 112, 35, -92}, new byte[]{98, 62, -120, 4, 86, -41, -111, 25})) == 0) {
                    String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-96, -10, -122, 43, -41, -126, -69, -4, -72, -29, -127, 40, -44, -41, -26, -89, -26, -32, -109, 50, -64, -51, -70, -80, -89, -17, -35, 45, -105, -105, -8, -68, -81, -21, -100, 116, -55, -39, -3, -67, -25, -13, -128, 57, -64, -51, -25, -96, -92, -19, -107, 50, -54, -121, -30, -18}, new byte[]{-56, -126, -14, 91, -92, -72, -108, -45}) + System.currentTimeMillis() + com.github.catvod.spider.merge.XI.f.a(new byte[]{23, -50, -98, 31, -7, 53, 119}, new byte[]{49, -84, -6, 106, -118, 70, 74, 118}) + jSONObject2.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{2}, new byte[]{116, -110, 37, -45, -37, -118, 107, 118}));
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : com.github.catvod.spider.merge.nU.c.b(str2, map).c().get(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93, -72, -33, -74, -37, 119, -97, -21, -71, -72}, new byte[]{-48, -35, -85, -101, -72, 24, -16, -128}))) {
                        str4 = TextUtils.isEmpty(str4) ? str5.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-73}, new byte[]{-116, 116, 111, 55, -107, -127, 79, -110}))[0] : str4 + com.github.catvod.spider.merge.XI.f.a(new byte[]{2}, new byte[]{57, -21, -62, 18, 6, -117, 65, 110}) + str5.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{76}, new byte[]{119, 79, -126, -57, 127, 7, 8, 92}))[0];
                        if (str5.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{93, 38, -20, 83, 24, 65}, new byte[]{31, 98, -71, 0, 75, 124, -46, -27}))) {
                            str3 = str5.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-76}, new byte[]{-113, -41, -104, 82, 100, 32, -115, -23}))[0];
                        }
                    }
                    SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{122, 110, 21, 125, 4, 12, 39, -38, 103, 110, 11, 55, 103}, new byte[]{14, 11, 120, 13, 71, 99, 72, -79}) + str4);
                    map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{44, -60, -51, -35, -118, 89}, new byte[]{111, -85, -94, -74, -29, 60, -89, 120}), str4);
                    Iterator<String> it = com.github.catvod.spider.merge.nU.c.j(com.github.catvod.spider.merge.nU.c.f(), com.github.catvod.spider.merge.nU.c.c(com.github.catvod.spider.merge.nU.c.c(com.github.catvod.spider.merge.XI.f.a(new byte[]{106, -19, -52, -58, -92, 19, 75, 83, 114, -8, -42, -104, -75, 72, 13, 24, 119, -73, -37, -39, -70, 6, 0, 21, 113, -14, -105, -37, -74, 64, 10, 67, 100, -21, -41, -37, -22, 65, 11, 17, 103, -33, -44, -39, -96}, new byte[]{2, -103, -72, -74, -41, 41, 100, 124}), map), map), new HashMap(), map).c().get(com.github.catvod.spider.merge.XI.f.a(new byte[]{65, -10, 29, -62, 3, 33, -40, 97, 91, -10}, new byte[]{50, -109, 105, -17, 96, 78, -73, 10})).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{3, 116, -96, 30, -124, -13, -15}, new byte[]{80, 32, -17, 85, -63, -67, -52, 40}))) {
                            str3 = str3 + com.github.catvod.spider.merge.XI.f.a(new byte[]{-102}, new byte[]{-95, 105, 13, -66, -103, -13, -82, -70}) + next.split(com.github.catvod.spider.merge.XI.f.a(new byte[]{-110}, new byte[]{-87, -55, -46, 67, 92, 126, -102, -31}))[0];
                            break;
                        }
                    }
                    com.github.catvod.spider.merge.pT.C.u(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 59, -8, 39, -122, -22}, new byte[]{-19, 89, -103, 78, -30, -97, -4, -27}), str3);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void d(String str, String str2, List<com.github.catvod.spider.merge.XI.n> list) {
        int i;
        List<com.github.catvod.spider.merge.XI.n> list2;
        try {
            String strL = l(str, str2);
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            char c2 = 5;
            char c3 = 4;
            byte b = 3;
            r(str, com.github.catvod.spider.merge.XI.f.a(new byte[]{71, -85, 4, 6, -110}, new byte[]{52, -50, 111, 99, -21, 96, -75, 70}), strL);
            String str3 = com.github.catvod.spider.merge.XI.f.a(new byte[]{-97, -108, -124, 22, -84, -15, -48, 5, -121, -127, -98, 72, -67, -86, -106, 78, -126, -50, -109, 9, -78, -28, -116, 66, -106, -110, -107, 73, -77, -94, -116, 94, -56, -105, -107, 4, -30, -2, -39, 75, -121, -112, -81, 15, -69, -10, -51, 31, -57, -43, -62, 94, -7, -81, -102, 89, -108, -35, -63, 64, -84, -93, -112, 93, -110, -115, -128, 18, -90, -10, -49, 12, -121, -127, -105, 3, -30, -6, -39, 68, -126, -115, -51, 84, -17, -19, -112, 88, -109, -123, -126, 91, -85, -94, -110, 79, -47, -109, -104, 9, -83, -65, -118, 88, -101, -35}, new byte[]{-9, -32, -16, 102, -33, -53, -1, 42}) + str + com.github.catvod.spider.merge.XI.f.a(new byte[]{-31, 109, -57, -86, 98, -92, 52, -26, -79, 118, -51, -78, 73, -12, 106, -92, -94, 34, -103, -29, 117, -15, 100, -82, -87, 122, -60, -8, 117, -15, 112, -82, -85, 122, -63, -29, 97, -4, 103, -3, -10, 57, -54, -95, 101, -19, 106, -85, -94, 113, -107}, new byte[]{-57, 31, -88, -59, 22, -103, 5, -64});
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(com.github.catvod.spider.merge.XI.f.a(new byte[]{37, -115, 8, 49, 38, 127}, new byte[]{102, -30, 103, 90, 79, 26, 41, -67}), com.github.catvod.spider.merge.XI.f.a(new byte[]{-34, -109, -44, 6, 103, -55, -114}, new byte[]{-100, -41, -105, 74, 41, -115, -77, 2}) + strL);
            com.github.catvod.spider.merge.XI.o oVarE = com.github.catvod.spider.merge.XI.o.e(com.github.catvod.spider.merge.nU.c.l(str3, mapF));
            if (oVarE.a() != 0) {
                com.github.catvod.spider.merge.pT.k.b("");
                return;
            }
            r(str, com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, 48, 111, 76, -77, -45, -81}, new byte[]{-12, 88, 14, 62, -42, -70, -53, 46}), oVarE.c());
            r(str, com.github.catvod.spider.merge.XI.f.a(new byte[]{105, 117}, new byte[]{28, 30, 94, -34, 90, -6, -63, 95}), oVarE.d());
            List<com.github.catvod.spider.merge.XI.n> listB = oVarE.b();
            int size = listB.size() - 1;
            while (size >= 0) {
                com.github.catvod.spider.merge.XI.n nVar = listB.get(size);
                if (nVar.g()) {
                    list.add(nVar);
                }
                if (nVar.b() == 1) {
                    byte[] bArr = new byte[8];
                    bArr[0] = -88;
                    bArr[1] = -82;
                    bArr[2] = 123;
                    bArr[b] = 7;
                    bArr[c3] = 52;
                    bArr[c2] = 112;
                    bArr[6] = 108;
                    bArr[7] = 104;
                    String strM = m(str, com.github.catvod.spider.merge.XI.f.a(new byte[]{-35, -59}, bArr));
                    byte[] bArr2 = new byte[7];
                    bArr2[0] = 60;
                    bArr2[1] = -41;
                    bArr2[2] = 109;
                    bArr2[b] = -113;
                    bArr2[c3] = 102;
                    bArr2[c2] = -26;
                    bArr2[6] = -87;
                    byte[] bArr3 = new byte[8];
                    bArr3[0] = 79;
                    bArr3[1] = -65;
                    bArr3[2] = 12;
                    bArr3[b] = -3;
                    bArr3[c3] = b;
                    bArr3[5] = -113;
                    bArr3[6] = -51;
                    bArr3[7] = 125;
                    String strM2 = m(str, com.github.catvod.spider.merge.XI.f.a(bArr2, bArr3));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr4 = new byte[10];
                    bArr4[0] = -125;
                    bArr4[1] = -109;
                    bArr4[2] = -81;
                    bArr4[b] = 10;
                    bArr4[4] = -37;
                    bArr4[5] = -89;
                    bArr4[6] = -107;
                    bArr4[7] = 124;
                    bArr4[8] = -62;
                    bArr4[9] = -117;
                    sb.append(com.github.catvod.spider.merge.XI.f.a(bArr4, new byte[]{-84, -32, -57, 107, -87, -62, -7, 21}));
                    sb.append(strM2);
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{50}, new byte[]{31, 88, -34, -88, 34, -76, -127, -63}));
                    sb.append(nVar.a());
                    sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-13}, new byte[]{-36, 70, 33, 123, -13, -71, 72, -49}));
                    sb.append(nVar.e());
                    i = size;
                    list2 = listB;
                    c(strL, strM, strM2, sb.toString(), list, nVar.e());
                } else {
                    i = size;
                    list2 = listB;
                }
                size = i - 1;
                listB = list2;
                c2 = 5;
                c3 = 4;
                b = 3;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String g() {
        return com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{-93, 7, -25, 126, 51, 28}, new byte[]{-115, 101, -122, 23, 87, 105, 64, 88}));
    }

    public final com.github.catvod.spider.merge.KI.e<String> h(String str) {
        com.github.catvod.spider.merge.KI.e<String> eVar = new com.github.catvod.spider.merge.KI.e<>();
        try {
            eVar = a(str, true);
        } catch (Exception e2) {
            eVar.e(500);
            eVar.f(e2.getMessage());
        }
        if (eVar.b() == 0 && !com.github.catvod.spider.merge.VE.h.c(eVar.c())) {
            String strC = eVar.c();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-4, 101, -122, 82, 45, 13, 54, 47, -12, 97, -106, 67, 48, 22, 120, 0, -12, 112, -117, 54, 48, 31, 43, 89, -69}, new byte[]{-101, 0, -14, 22, 66, 122, 88, 99}) + strC);
            String str2 = com.github.catvod.spider.merge.XI.f.a(new byte[]{50, -122, 61, -88, -89, -28, -8, -117, 42, -109, 39, -10, -74, -65, -66, -64, 47, -36, 42, -73, -71, -15, -74, -44, 51, -35, 36, -67, -80, -73, -74, -51, 52, -108, 38, -25, -96, -89, -89, -63, 103, -65, 122, -115, -20, -127, -111, -24, 12, -83, 123, -18, -32, -127, -29, -100, 106, -44, 57, -71, -96, -74, -22}, new byte[]{90, -14, 73, -40, -44, -34, -41, -92}) + URLEncoder.encode(strC) + com.github.catvod.spider.merge.XI.f.a(new byte[]{-114, 41, 83, 28, -83, 14, -102, 113, -47, 58, 90, 72, -16, 80, -56, 106, -38, 35, 88, 28, -90, 93, -118, 105, -58, 43}, new byte[]{-88, 74, 63, 117, -56, 96, -18, 5});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-121, 32, -96, 0, 25, 125, 26, 63, -68, 39}, new byte[]{-46, 83, -59, 114, 52, 60, 125, 90}), com.github.catvod.spider.merge.XI.f.a(new byte[]{81, -124, 70, 26, -43, 110, -51, -101, 14, -49, 6, 80, -114, 38, -108, -110, 15, -45, 3, 76, -115, 44, -12, -29, 4, -128, 92, 26, -50, 114, -49, -60, 18, -128, 92, 26, -50, 114, -49, -60, 4, -48, 0, 69, -10, 78, -60, -46, 86, -123, 85, 27, -120, 51, -110, -114, 15, -38, 88, 17, -43, 115, -46, -30, 77, -120, 86, 25, -39, 38, -105, -114, 14, -49, 2, 69}, new byte[]{63, -31, 50, 126, -68, 29, -90, -96}));
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-89, 10, -66, -117, 85, 9}, new byte[]{-28, 101, -47, -32, 60, 108, -76, 113}), g());
            JSONObject jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.l(str2, map));
            String strOptString = jSONObject.optJSONObject(com.github.catvod.spider.merge.XI.f.a(new byte[]{36, 98, 50, 76}, new byte[]{77, 12, 84, 35, -31, 79, 52, -24})).optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{9, 6, -43, -11, 64}, new byte[]{109, 106, -68, -101, 43, -2, 14, 104}));
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{-38, -55, -35, -25, -1, -93, 57, 78, -46, -51, -51, -10, -30, -72, 119, 102, -47, -59, -57, -56, -80, -90, 50, 113, -121, -116}, new byte[]{-67, -84, -87, -93, -112, -44, 87, 2}) + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                eVar.e(jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{102, 57, 81, 1, 115}, new byte[]{3, 75, 35, 111, 28, 69, -82, 59})));
                eVar.f(com.github.catvod.spider.merge.XI.f.a(new byte[]{115, -17, 12, 99, -97, -10, -114, -63, -83, 100, -52, -73}, new byte[]{23, -125, 101, 13, -12, -42, 106, 121}));
            }
            eVar.f(com.github.catvod.spider.merge.nU.c.c(strOptString, map));
            return eVar;
        }
        return eVar;
    }

    public final Bitmap j() {
        return c;
    }

    public final String l(String str, String str2) {
        JSONObject jSONObject;
        try {
            String str3 = com.github.catvod.spider.merge.XI.f.a(new byte[]{33, -43, 38, -16, -91, 12, 58, 43, 57, -64, 60, -82, -76, 87, 124, 96, 60, -113, 49, -17, -69, 25, 102, 108, 40, -45, 55, -81, -96, 83, 103, 109, 47, -40, 109, -12, -21}, new byte[]{73, -95, 82, -128, -42, 54, 21, 4}) + System.currentTimeMillis() + com.github.catvod.spider.merge.XI.f.a(new byte[]{100, -106, 10, 98, 122, -120}, new byte[]{66, -27, 127, 16, 22, -75, 125, 113}) + str + com.github.catvod.spider.merge.XI.f.a(new byte[]{-124, -118, -21, -44, 20, -6, -19, 4, -97, -118, -21, -64, 20, -8, -19, 1, -124, -98, -26, -41, 71, -91, -82, 9, -46, -103, -36, -36, 30, -87, -70, 93, -110, -36, -79, -115, 92, -10, -20, 27, -42, -122, -24, -48, 20, -87}, new byte[]{-94, -23, -125, -75, 122, -108, -120, 104});
            HashMap map = new HashMap();
            map.put(com.github.catvod.spider.merge.XI.f.a(new byte[]{-22, 96, -44}, new byte[]{-102, 23, -80, -71, -92, 40, 57, 106}), str2);
            jSONObject = new JSONObject(com.github.catvod.spider.merge.nU.c.h(str3, map, f()).a());
        } catch (Exception unused) {
        }
        if (jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{117, 83, -18, -69, 21}, new byte[]{16, 33, -100, -43, 122, -93, -119, 4})) == 0) {
            return jSONObject.optString(com.github.catvod.spider.merge.XI.f.a(new byte[]{74, -114, -80, -79, -114, -12}, new byte[]{56, -17, -34, -43, -3, -97, -68, -92}));
        }
        jSONObject.optInt(com.github.catvod.spider.merge.XI.f.a(new byte[]{-47, 112, 8, -36, -123, 116, 63}, new byte[]{-76, 2, 122, -125, -24, 7, 88, -128}));
        com.github.catvod.spider.merge.pT.k.b("");
        return "";
    }

    public final com.github.catvod.spider.merge.KI.k o(String str, String str2, String str3) {
        ArrayList arrayList;
        char c2;
        int i;
        List listSingletonList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        com.github.catvod.spider.merge.KI.k kVar = new com.github.catvod.spider.merge.KI.k();
        try {
            arrayList = new ArrayList();
            d(str, str2, arrayList);
            c2 = 3;
            i = 8;
            listSingletonList = Collections.singletonList(com.github.catvod.spider.merge.XI.f.a(new byte[]{105, -101, -34, 120, 73, 18, 55, 81, -65, -59}, new byte[]{43, 126, 100, -34, -84, -100, -88, -74}));
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            it = arrayList.iterator();
        } catch (Exception unused) {
        }
        while (true) {
            String string = "";
            if (!it.hasNext()) {
                break;
            }
            com.github.catvod.spider.merge.XI.n nVar = (com.github.catvod.spider.merge.XI.n) it.next();
            if (!TextUtils.isEmpty(nVar.d())) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[i];
                bArr[0] = 67;
                bArr[1] = 63;
                bArr[2] = 110;
                bArr[c2] = 111;
                bArr[4] = -78;
                bArr[5] = 48;
                bArr[6] = 65;
                bArr[7] = -41;
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{24}, bArr));
                sb.append(nVar.d().trim());
                byte[] bArr2 = new byte[i];
                bArr2[0] = -44;
                bArr2[1] = 110;
                bArr2[2] = 123;
                bArr2[c2] = -114;
                bArr2[4] = 11;
                bArr2[5] = 92;
                bArr2[6] = 23;
                bArr2[7] = 93;
                sb.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-119}, bArr2));
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(nVar.e());
            sb2.append(nVar.f());
            byte[] bArr3 = new byte[i];
            bArr3[0] = -96;
            bArr3[1] = 63;
            bArr3[2] = 1;
            bArr3[c2] = 83;
            bArr3[4] = -17;
            bArr3[5] = 27;
            bArr3[6] = -27;
            bArr3[7] = -17;
            sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-124}, bArr3));
            sb2.append(str);
            byte[] bArr4 = new byte[i];
            bArr4[0] = -80;
            bArr4[1] = -115;
            bArr4[2] = -56;
            bArr4[c2] = 55;
            bArr4[4] = 2;
            bArr4[5] = -50;
            bArr4[6] = 5;
            bArr4[7] = 16;
            sb2.append(com.github.catvod.spider.merge.XI.f.a(new byte[]{-101}, bArr4));
            sb2.append(nVar.a());
            String string2 = sb2.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(com.github.catvod.spider.merge.XI.f.a(new byte[]{51, -108, 104, 78}, new byte[]{91, -32, 28, 62, 44, -84, -110, -42}))) {
                string2 = string2 + com.github.catvod.spider.merge.XI.f.a(new byte[]{114}, new byte[]{89, 58, -117, -107, -83, -95, 117, 122}) + str3 + com.github.catvod.spider.merge.XI.f.a(new byte[]{34}, new byte[]{9, 76, -13, 126, -98, 34, 57, -38}) + nVar.e();
            }
            arrayList2.add(string2);
            i = 8;
            c2 = 3;
            return kVar;
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(com.github.catvod.spider.merge.XI.f.a(new byte[]{-106, 55, 12, 65, 52, -114, 107, -14, -51, 89, 4, 0, 102, -126, 33, -121, -19, 47, 111, 1, 63, -51, 54, -60, 87, -113}, new byte[]{115, -65, -118, -91, -114, 37, -126, 97}));
        }
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            arrayList3.add(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{-104}, new byte[]{-69, -1, -1, -102, -1, 61, -38, 59}), arrayList2));
        }
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(i(((com.github.catvod.spider.merge.XI.n) arrayList.get(0)).c()));
        kVar.k(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{5, -116, -17}, new byte[]{33, -88, -53, 10, -10, 7, 40, -61}), arrayList3));
        kVar.j(TextUtils.join(com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 9, 12}, new byte[]{57, 45, 40, 77, 33, 70, 41, 121}), listSingletonList));
        return kVar;
    }

    public final boolean p() {
        return !TextUtils.isEmpty(com.github.catvod.spider.merge.pT.C.q(com.github.catvod.spider.merge.XI.f.a(new byte[]{-59, 38, -21, 66, -117, -48}, new byte[]{-21, 68, -118, 43, -17, -91, -117, 19})));
    }

    public final String q(String[] strArr) {
        try {
            if (!p()) {
                com.github.catvod.spider.merge.pT.k.b(com.github.catvod.spider.merge.XI.f.a(new byte[]{-61, 76, 24, -66, -101, -47, 101, 52, -80, -4, -110, -79, -83, -35, 101, 7, -98, 57, 55, -44, -27, -41, 46, 109, -99, 125, 87, -26, -127, -126, 46, 55, -62, 109, 28}, new byte[]{37, -48, -78, 89, 2, 106, -128, -119}));
                return com.github.catvod.spider.merge.KI.h.n(com.github.catvod.spider.merge.XI.f.a(new byte[]{-111, 27, 121, 41, 94, -47, -109, 107, -30, -85, -13, 38, 104, -35, -109, 88, -52, 110, 86, 67, 32, -41, -40, 50, -49, 42, 54, 113, 68, -126, -40, 104, -112, 58, 125}, new byte[]{119, -121, -45, -50, -57, 106, 118, -42}));
            }
            this.a = strArr[0];
            com.github.catvod.spider.merge.KI.e<String> eVarH = h(strArr[1]);
            if (eVarH.b() != 0) {
                return com.github.catvod.spider.merge.KI.h.n(eVarH.d());
            }
            String strC = eVarH.c();
            SpiderDebug.log(com.github.catvod.spider.merge.XI.f.a(new byte[]{29, 42, 92, 73, -26, 52, 38, -65, 44, 55, 71, 29, -86}, new byte[]{121, 69, 43, 39, -118, 91, 71, -37}) + strC);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(com.github.catvod.spider.merge.XI.f.a(new byte[]{107, -65, 99, 126, -61, 100, -49, 109, 80, -72}, new byte[]{62, -52, 6, 12, -18, 37, -88, 8}), com.github.catvod.spider.merge.XI.f.a(new byte[]{62, 42, -122, -1, -30, -88, -19, -101, 97, 97, -58, -75, -71, -32, -76, -110, 96, 125, -61, -87, -70, -22, -44, -29, 107, 46, -100, -1, -7, -76, -17, -60, 125, 46, -100, -1, -7, -76, -17, -60, 107, 126, -64, -96, -63, -120, -28, -46, 57, 43, -107, -2, -65, -11, -78, -114, 96, 116, -104, -12, -30, -75, -14, -30, 34, 38, -106, -4, -18, -32, -73, -114, 97, 97, -62, -96}, new byte[]{80, 79, -14, -101, -117, -37, -122, -96}));
            if (com.github.catvod.spider.merge.pT.m.b().booleanValue()) {
                String strD = com.github.catvod.spider.merge.pT.m.d(strC, 12, 400);
                if (strArr.length <= 3) {
                    com.github.catvod.spider.merge.KI.h hVarE = com.github.catvod.spider.merge.KI.h.e();
                    hVarE.y(strD);
                    hVarE.j();
                    hVarE.f(mapF);
                    return hVarE.o();
                }
                String str = Proxy.getUrl() + com.github.catvod.spider.merge.XI.f.a(new byte[]{59, -96, -118, 121, -24, 94, -58, -33, 113, -30, -109, 43, -24, 113, -55, -33, 97, -7}, new byte[]{4, -60, -27, 68, -116, 63, -88, -78}) + strArr[2] + com.github.catvod.spider.merge.XI.f.a(new byte[]{-123, -31, 2, -35, -45, -39, 45, 35, -37, -86}, new byte[]{-93, -105, 109, -71, -102, -73, 73, 70}) + strArr[3] + com.github.catvod.spider.merge.XI.f.a(new byte[]{-12, 119, 90, -48, -107, 12, -46, -53}, new byte[]{-46, 1, 53, -76, -64, 126, -66, -10});
                com.github.catvod.spider.merge.KI.h hVarE2 = com.github.catvod.spider.merge.KI.h.e();
                hVarE2.y(strD);
                hVarE2.a(str);
                hVarE2.j();
                hVarE2.f(mapF);
                return hVarE2.o();
            }
            if (TextUtils.isEmpty(com.github.catvod.spider.merge.pT.m.g())) {
                return "";
            }
            if (strArr.length <= 2) {
                com.github.catvod.spider.merge.KI.h hVarE3 = com.github.catvod.spider.merge.KI.h.e();
                hVarE3.y(com.github.catvod.spider.merge.pT.m.e(strC));
                hVarE3.j();
                hVarE3.f(mapF);
                return hVarE3.o();
            }
            String str2 = Proxy.getUrl() + com.github.catvod.spider.merge.XI.f.a(new byte[]{-110, 79, -73, -111, 42, -107, 101, -96, -40, 13, -82, -61, 42, -70, 106, -96, -56, 22}, new byte[]{-83, 43, -40, -84, 78, -12, 11, -51}) + strArr[1] + com.github.catvod.spider.merge.XI.f.a(new byte[]{-80, -14, -99, 54, -75, 68, -8, -47, -18, -71}, new byte[]{-106, -124, -14, 82, -4, 42, -100, -76}) + strArr[2] + com.github.catvod.spider.merge.XI.f.a(new byte[]{17, -68, -96, 89, -25, -68, 0, -7}, new byte[]{55, -54, -49, 61, -78, -50, 108, -60});
            com.github.catvod.spider.merge.KI.h hVarE4 = com.github.catvod.spider.merge.KI.h.e();
            hVarE4.y(com.github.catvod.spider.merge.pT.m.e(strC));
            hVarE4.a(str2);
            hVarE4.j();
            hVarE4.f(mapF);
            return hVarE4.o();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
