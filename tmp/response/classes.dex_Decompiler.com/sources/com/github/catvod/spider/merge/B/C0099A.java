package com.github.catvod.spider.merge.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.c.C0139e;
import com.github.catvod.spider.merge.f.C0158a;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0219l;
import com.github.catvod.spider.merge.p.C0221n;
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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0099A {
    private static Bitmap c;
    private static String d;
    private static final String e = C0098a.a(new byte[]{-63, -63, 70, -92, 16, 60}, new byte[]{-18, -75, 48, -48, 125, 76, 16, -43});
    private String a;
    private final Map<String, Map<String, String>> b = new HashMap();

    private C0139e<String> a(String str, boolean z) {
        C0139e<String> c0139e = new C0139e<>();
        c0139e.e(0);
        try {
            b(true);
            String str2 = C0098a.a(new byte[]{-64, -74, 89, 29, -70, 37, 70, 101, -40, -93, 67, 67, -85, 126, 0, 46, -35, -20, 78, 2, -92, 48, 26, 34, -55, -80, 72, 66, -67, 109, 8, 36, -37, -92, 72, 31, -10, 108, 1, 43, -38, -89, 68, 9, -12}, new byte[]{-88, -62, 45, 109, -55, 31, 105, 74}) + m(this.a, C0098a.a(new byte[]{30, 35, 51, 50, -57, -7, 81}, new byte[]{109, 75, 82, 64, -94, -112, 53, 116})) + C0098a.a(new byte[]{68, 61, -46, -72, -102, 126}, new byte[]{98, 91, -96, -41, -9, 67, -9, -105}) + m(this.a, C0098a.a(new byte[]{-96, 53}, new byte[]{-43, 94, -100, 47, -10, -66, -9, -2})) + C0098a.a(new byte[]{-28, -99, 32, -123, -38, -114, 9}, new byte[]{-62, -18, 69, -18, -65, -9, 52, -105}) + m(this.a, C0098a.a(new byte[]{-121, -43, 7, 127, 39}, new byte[]{-12, -80, 108, 26, 94, -123, -104, 27})) + C0098a.a(new byte[]{23, -113, 93, 46, -60, 92, 124, 63, 84, -105, 80, 37, -63, 85, 103, 48, 66, -103, 93, 41, -116, 29, 103, 50, 89, -127, 93, 36, -44, 64, 124, 50, 89, -107, 93, 38, -44, 69, 103, 38, 84, -126, 14, 123, -105, 77, 49, 33, 110, -119, 87, 119, -125, 25, 113, 100, 3, -40}, new byte[]{49, -32, 51, 74, -79, 44, 65, 81});
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put(C0098a.a(new byte[]{-18, 116, 51, 70, -122, 18, 124, 117}, new byte[]{-120, 7, 90, 34, -22, 123, 15, 1}), arrayList.toString());
            map.put(C0098a.a(new byte[]{-77, -36, 62, -42}, new byte[]{-61, -67, 74, -66, 33, 109, 21, 80}), e);
            JSONObject jSONObject = new JSONObject(C0197c.h(str2, map, f()).a());
            if (jSONObject.optInt(C0098a.a(new byte[]{102, 83, -16, 36, -61}, new byte[]{3, 33, -126, 74, -84, -98, 118, -61})) == 0) {
                String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{64, 50, -68, -53, -28}, new byte[]{37, 74, -56, -71, -123, -77, 40, -37})).optJSONArray(C0098a.a(new byte[]{56, -100, -47, -34}, new byte[]{84, -11, -94, -86, 25, 9, -50, 101})).optJSONObject(0).optString(C0098a.a(new byte[]{-99, -47}, new byte[]{-23, -66, -128, -46, 9, 73, -8, 112}));
                if (TextUtils.isEmpty(strOptString) && z) {
                    return a(str, false);
                }
                c0139e.f(strOptString);
            } else if (jSONObject.optInt(C0098a.a(new byte[]{-127, -89, -41, -109, -88}, new byte[]{-28, -43, -91, -3, -57, 67, -110, -26})) == 2) {
                c0139e.g(jSONObject.optString(C0098a.a(new byte[]{-94, 42, -102, -32, 33, -16, 83, -105}, new byte[]{-47, 66, -11, -105, 126, -99, 32, -16})));
                if (jSONObject.optString(C0098a.a(new byte[]{110, 52, -25, -34, 109, -4, 6, 13}, new byte[]{29, 92, -120, -87, 50, -111, 117, 106})).equals(C0098a.a(new byte[]{-78, -20, 11, -50, -98, 19, 14, 14, -26, -97, 33, -78, -64, 57, 67}, new byte[]{84, 122, -116, 42, 37, -91, -21, -71}))) {
                    c0139e.g(C0098a.a(new byte[]{114, 78, -83, 10, -53, 127, -120, -11, 23, 17, -68, 103, -73, 87, -60, -100, 33, 71, -57, 118, -37, 53, -26, -1, 114, 76, -117}, new byte[]{-106, -10, 32, -20, 95, -48, 110, 121}));
                }
                c0139e.e(2);
            } else {
                c0139e.e(jSONObject.optInt(C0098a.a(new byte[]{57, 49, -93, -95, 8}, new byte[]{92, 67, -47, -49, 103, -55, 114, -25})));
                c0139e.g(jSONObject.optString(C0098a.a(new byte[]{34, -12, 52, -83, -80, -74, -10, -121}, new byte[]{81, -100, 91, -38, -17, -37, -123, -32})));
            }
        } catch (Exception e2) {
            c0139e.e(500);
            c0139e.g(e2.getMessage());
            SpiderDebug.log(C0098a.a(new byte[]{-102, -119, -115, 112, 17, 80, 118, 102}, new byte[]{-7, -26, -3, 9, 49, 53, 4, 20}) + e2.getMessage());
        }
        return c0139e;
    }

    private boolean b(boolean z) {
        try {
            n();
            com.github.catvod.spider.merge.f.b bVarE = com.github.catvod.spider.merge.f.b.e(C0197c.l(C0098a.a(new byte[]{-96, -59, 59, 46, -98, 25, 13, 87, -72, -48, 33, 112, -113, 66, 75, 28, -67, -97, 44, 49, -128, 12, 67, 8, -95, -98, 35, 55, -98, 87, 29, 27, -92, -40, 42, 48, -103, 87, 91, 8, -83, -116, 127, 120, -116, 83, 82, 39, -95, -43, 114, 108, -40, 19, 23, 74, -16, -105, 56, 59, -113, 30, 19, 94, -84, -63, 98, 50, -126, 68, 75, 28, -11, -105, 32, 44, -119, 70, 80, 69, -68, -40, 34, 59, -53, 71, 71, 11, -85, -116, 126, 120, -119, 74, 80, 69, -25, -59, 57, 42, -128, 83, 4, 22, -67, -36, 114, 111, -35, 19, 4, 8, -87, -42, 42, 99, -36}, new byte[]{-56, -79, 79, 94, -19, 35, 34, 120}), f()));
            ArrayList arrayList = new ArrayList();
            if (bVarE.a() == 0) {
                Iterator<C0158a> it = bVarE.b().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                String strA = C0098a.a(new byte[]{-11, -13, -117, -13, 43, -84, 32, -113, -19, -26, -111, -83, 58, -9, 102, -60, -24, -87, -100, -20, 53, -71, 110, -48, -12, -88, -103, -22, 52, -13, 98, -63, -13, -26, -104, -26, 42, -87, 110, -45, -28, -23, -100, -66, 106, -80, 96, -50, -13, -30, -116, -9, 101, -16, 110, -55, -15, -95, -112, -13, 61, -28, 110, -99, -7, -30, -109, -26, 44, -13, 41, -62, -7, -12, -117, -20, 51, -13, 97, -99}, new byte[]{-99, -121, -1, -125, 88, -106, 15, -96});
                HashMap map = new HashMap();
                map.put(C0098a.a(new byte[]{-38, 91, -53, -31, 86, 44, -78, 30}, new byte[]{-68, 50, -89, -124, 58, 69, -63, 106}), new JSONArray((Collection) arrayList).toString());
                if (!TextUtils.isEmpty(new JSONObject(C0197c.h(strA, map, f()).a()).optString(C0098a.a(new byte[]{-11, -108, 28, 99, 119, -18}, new byte[]{-127, -11, 111, 8, 30, -118, 25, -107}))) || !z) {
                    return true;
                }
                try {
                    return b(false);
                } catch (Exception e2) {
                    e = e2;
                    y.c(new byte[]{81, 13, 70, -73, 35, -59, -31, -78, 71, 26, 16, -14}, new byte[]{53, 104, 42, -46, 87, -96, -63, -41}, new StringBuilder(), e);
                    return false;
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void c(String str, String str2, String str3, String str4, List<C0158a> list, String str5) {
        try {
            String str6 = C0098a.a(new byte[]{-40, -99, -72, 110, 109, 1, 104, -79, -64, -120, -94, 48, 124, 90, 46, -6, -59, -57, -81, 113, 115, 20, 52, -10, -47, -101, -87, 49, 114, 82, 52, -22, -113, -128, -65, 65, 120, 73, 40, -13, -17, -98, -87, 124, 35, 79, 53, -21, -43, -49, -65, 123, 117, 94, 62, -93}, new byte[]{-80, -23, -52, 30, 30, 59, 71, -98}) + str + C0098a.a(new byte[]{107, 37, -110, 69}, new byte[]{77, 80, -7, 120, -23, 8, -63, 113}) + str2 + C0098a.a(new byte[]{-100, 28, -119, 28, -80, 49, 15, 123, -121}, new byte[]{-70, 111, -31, 125, -62, 84, 102, 31}) + str3 + C0098a.a(new byte[]{96, -89, -50, 80, -112, -113, 39, -98, 50, -96, -39, 70, -45, -103, 127, -126, 37, -11, -115, 18, -122, -107, 117, -122, 35, -91, -52, 64, -116, -64, 42, -41, 48, -95, -39, 67, -86, -112, 117, -107, 35, -11, -115, 18, -126, -104, 120, -52, 119, -18, -52, 85, -110, -104, 39, -64, 96, -90, -55, 89, -56, -52, 42, -63, 96, -84, -43, 70, -56}, new byte[]{70, -56, -68, 52, -11, -3, 26, -15}) + URLEncoder.encode(str4) + C0098a.a(new byte[]{4, -84, 83, 77, -31, 13, -95, 80, 23, -24, 94, 76, -10, 15, -92, 81, 22, -31, 87, 78, -7, 29, -12, 15, 67, -74, 0, 24, -93, 6, -12, 15, 87, -74, 2, 24, -90, 29, -32, 2, 64, -27, 95, 91, -82, 75, -25, 56, 75, -68, 83, 79, -6, 11, -94, 85, 26, -2, 12, 25, -68, 79, -8, 12, 71, -74, 83}, new byte[]{34, -40, 110, 125, -49, 59, -105, 103});
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(C0098a.a(new byte[]{67, -78, 24, -26, 46, -63}, new byte[]{0, -35, 119, -115, 71, -92, 87, 48}), C0098a.a(new byte[]{-40, -96, -121, 16, -51, 99, -34}, new byte[]{-102, -28, -60, 92, -125, 39, -29, -47}) + str);
            com.github.catvod.spider.merge.f.b bVarE = com.github.catvod.spider.merge.f.b.e(C0197c.l(str6, mapF));
            if (bVarE.a() == 0) {
                List<C0158a> listB = bVarE.b();
                ArrayList arrayList = new ArrayList();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    C0158a c0158a = listB.get(size);
                    if (c0158a.g()) {
                        c0158a.j(str5);
                        list.add(c0158a);
                    } else if (c0158a.b() == 1) {
                        arrayList.add(c0158a);
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

    public static C0099A e() {
        return z.a;
    }

    private Map<String, String> f() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-35, 105, -27, 125, 10, 22, -3, -121, -26, 110}, new byte[]{-120, 26, -128, 15, 39, 87, -102, -30}), C0098a.a(new byte[]{-50, -20, 42, -104, -12, 58, 21, 46, -74, -83, 96, -47, -80, 1, 29, 111, -25, -20, 39, -126, -72, 24, 32, 33, -78, -77, 126, -63, -93, 118, 35, 104, -19, -75, 100, -54, -72, 46, 66, 53, -86, -93, 17, -127, -24, 58, 17, 86, -26, -31, 27, -104, -20, 121, 65, 50, -76, -83, 99, -57, -72, 126, 63, 73, -41, -50, 28, -35, -72, 58, 29, 106, -26, -93, 23, -108, -5, 61, 27, 40, -93, -64, 56, -125, -9, 59, 17, 46, -78, -80, 100, -33, -88, 120, 68, 47, -77, -93, 3, -112, -2, 55, 6, 104, -84, -74, 99, -58, -74, 101, 66, 33, -58, -25, 55, -34, -87, 101, 64, 47, -77, -83, 96, -33, -88}, new byte[]{-125, -125, 80, -15, -104, 86, 116, 1}));
        map.put(C0098a.a(new byte[]{20, 58, -97, -89, -15, 65}, new byte[]{85, 89, -4, -62, -127, 53, 18, -81}), C0098a.a(new byte[]{-38, 100, -1, -100, 60, -66, -31, 76, -46, 123, -31, -33, 63, -82, -17, 86, -128, 119, -25, -111, 39, -82, -27, 76, -122, 65, -37, -74, 120, -27}, new byte[]{-69, 20, -113, -16, 85, -35, -128, 56}));
        if (!TextUtils.isEmpty(g())) {
            map.put(C0098a.a(new byte[]{21, 109, -128, -100, -25, -53}, new byte[]{86, 2, -17, -9, -114, -82, -75, 2}), g());
        }
        map.put(C0098a.a(new byte[]{-23, 90, 17, 94, 111, -34, 26, -36, -2, 76, 15, 79}, new byte[]{-86, 53, 127, 42, 10, -80, 110, -15}), C0098a.a(new byte[]{-34, -77, -87, -76, 22, 73, 46, 64, -42, -84, -73, -9, 7, 7, 56, 67, -56, -18, -65, -73, 13, 71, 98, 65, -51, -81, -68, -74, 28, 69, 43, 81, -37, -8, -7, -69, 23, 75, 61, 71, -38, -73, -28, -115, 43, 108, 98, 12}, new byte[]{-65, -61, -39, -40, 127, 42, 79, 52}));
        map.put(C0098a.a(new byte[]{-99, -59, -121, -4, -45, -7, -122}, new byte[]{-49, -96, -31, -103, -95, -100, -12, 35}), C0098a.a(new byte[]{-8, -60, -114, -53, -113, 101, -99, -40, -32, -47, -108, -107, -98, 62, -37, -109, -27, -98, -103, -44, -111}, new byte[]{-112, -80, -6, -69, -4, 95, -78, -9}));
        return map;
    }

    private String i(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split(C0098a.a(new byte[]{-13, -57}, new byte[]{-36, -20, -16, 122, 81, 58, -49, -101}))));
                    boolean z = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
                        return C0098a.a(new byte[]{-52}, new byte[]{-29, -35, 65, 82, 127, 31, 0, 100});
                    }
                    String strA = C0098a.a(new byte[]{12}, new byte[]{35, 42, 88, 80, 71, -77, 78, 51});
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
                    return (z && string.isEmpty()) ? C0098a.a(new byte[]{-69}, new byte[]{-108, 115, 62, -30, -23, -31, 72, 89}) : string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static boolean k() {
        try {
            String strA = C0098a.a(new byte[]{66, 11, -26, 105, -85, -117, 96, 112, 90, 30, -31, 106, -88, -34, 61, 43, 4, 29, -13, 112, -68, -60, 97, 60, 69, 18, -67, 111, -22, -98, 46, 47, 67, 80, -11, 124, -84, -64, 61, 60, 69, 27, -9, 38, -76, -63, 114, 47, 73, 89, -29, 107, -76, -34, 40, 54, 68, 25, -32, 118, -75, -116, 63, 60}, new byte[]{42, 127, -110, 25, -40, -79, 79, 95});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{11, -20, 42, -53, -97, 77, 86, 82, 48, -21}, new byte[]{94, -97, 79, -71, -78, 12, 49, 55}), C0098a.a(new byte[]{59, -65, -127, -36, -109, -24, -109, 102, 67, -2, -53, -107, -41, -45, -101, 39, 18, -65, -116, -58, -33, -54, -90, 105, 71, -32, -43, -123, -60, -92, -91, 32, 24, -26, -49, -114, -33, -4, -60, 125, 95, -16, -70, -59, -113, -24, -105, 30, 19, -78, -80, -36, -117, -85, -57, 122, 65, -2, -56, -125, -33, -84, -71, 1, 34, -99, -73, -103, -33, -24, -101, 34, 19, -16, -68, -48, -100, -17, -99, 96, 86, -109, -109, -57, -112, -23, -105, 102, 71, -31, -52, -101, -49, -86, -62, 103, 70, -16, -88, -44, -103, -27, -128, 32, 89, -27, -56, -126, -47, -73, -60}, new byte[]{118, -48, -5, -75, -1, -124, -14, 73}));
            map.put(C0098a.a(new byte[]{-107, -56, -111, -65, -30, 126, 36}, new byte[]{-57, -83, -9, -38, -112, 27, 86, -34}), C0098a.a(new byte[]{-100, 45, -6, -32, -125, 6, -127, -19, -124, 56, -32, -66, -110, 93, -57, -90, -127, 119, -19, -1, -99, 19}, new byte[]{-12, 89, -114, -112, -16, 60, -82, -62}));
            JSONObject jSONObject = new JSONObject(C0197c.l(strA, map));
            SpiderDebug.log(jSONObject.toString());
            String str = C0098a.a(new byte[]{125, 92, 76, 122, -33, -73, 70, 96}, new byte[]{21, 40, 56, 10, -84, -115, 105, 79}) + jSONObject.optString(C0098a.a(new byte[]{-106, 1, 116, 52, 81, 9}, new byte[]{-1, 108, 19, 65, 35, 101, -14, -1})) + C0098a.a(new byte[]{76, 1, 35, 49, 78, 24, -126, -65, 87, 25, 62, 55, 125, 28, -84, -66, 79, 94, 13, 38, 125, 38, -119, -75, 13, 4, 34, 32, 43, 38, -44, -19, 94, 95, 117, 97, 46, 75, -43, -17, 79, 95, 15, 58, 113, 30, -75, -69, 13, 8, 105, 101, 95, 21, -118, -67, 3, 3, 58, 99}, new byte[]{106, 109, 76, 86, 30, 121, -27, -38});
            d = jSONObject.optString(C0098a.a(new byte[]{45, -49, -67, -22}, new byte[]{94, -90, -38, -124, -111, -34, -100, 14}));
            byte[] bArrBytes = C0197c.d(str).body().bytes();
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

    private C0158a n() {
        try {
            com.github.catvod.spider.merge.f.b bVarE = com.github.catvod.spider.merge.f.b.e(C0197c.l(C0098a.a(new byte[]{-45, -106, 109, -78, -115, 94, -69, -58, -53, -125, 119, -20, -100, 5, -3, -115, -50, -52, 122, -83, -109, 75, -11, -103, -46, -51, 117, -85, -115, 16, -85, -118, -41, -117, 124, -84, -118, 16, -19, -103, -34, -33, 41, -28, -97, 20, -28, -74, -46, -122, 36, -16, -53, 84, -95, -37, -125, -60, 110, -89, -100, 89, -91, -49, -33, -110, 52, -82, -111, 3, -3, -115, -122, -60, 118, -80, -102, 1, -26, -44, -49, -117, 116, -89, -40, 0, -15, -102, -40, -33, 40, -28, -102, 13, -26, -44, -98, -48, 95, -28, -112, 17, -7, -44, -118, -46, 41, -28, -114, 5, -13, -116, -122, -45}, new byte[]{-69, -30, 25, -62, -2, 100, -108, -23}), f()));
            if (bVarE.a() == 0) {
                for (C0158a c0158a : bVarE.b()) {
                    if (c0158a.c().equals(e)) {
                        return c0158a;
                    }
                }
            }
            String str = C0098a.a(new byte[]{115, 8, -4, 47, -94, -19, -108, 74, 107, 29, -26, 113, -77, -74, -46, 1, 110, 82, -21, 48, -68, -8, -38, 21, 114, 83, -21, 45, -76, -74, -49, 0, 36, 29, -75, 60, -66, -70, -42, 12, 111, 90, -22, 59, -94, -93, -44, 14, 126, 18, -75}, new byte[]{27, 124, -120, 95, -47, -41, -69, 101}) + new JSONObject(C0197c.l(C0098a.a(new byte[]{-92, 99, 90, -4, -17, 94, -54, 113, -68, 118, 64, -94, -2, 5, -116, 58, -71, 57, 77, -29, -15, 75, -124, 46, -91, 56, 73, -23, -24, 16, -128, 51, -68, 123, 79, -8, -7, 18, -124, 44, -91, 118, 76, -32, -7, 91, -122, 50, -91, 114, 64, -8, -24, 29, -107, 59, -15, 39, 8, -19, -20, 20, -70, 55, -88, 42, 28, -71, -84, 81, -41, 102, -22, 96, 75, -18, -95, 85, -61, 56, -91, 114, 66, -24, -17, 89, -66, 124, -82, 115, 93, -8, -13, 15, -128, 48, -18, 59, 12, -8, -13, 15, -128, 48, -18, 59, 12, -7, -9, 70, -55, 124, -91, 100, 74, -29, -1, 17, -106, 59, -66, 53, 2, -82, -17, 1, -105, 40, -87, 101, 90, -27, -15, 1, -57, 3}, new byte[]{-52, 23, 46, -116, -100, 100, -27, 94}), f())).optJSONObject(C0098a.a(new byte[]{122, -74, -18, -24, -56, -42}, new byte[]{8, -45, -99, -99, -92, -94, -102, -72})).optString(C0098a.a(new byte[]{-40, -21, 30, 83, -88, -108, 88, 53}, new byte[]{-70, -113, 109, 39, -57, -1, 61, 91})) + C0098a.a(new byte[]{-79, 113, -114, -7, 13, 72, -108, -21, -18, 98, -121, -83, 88, 0, -127, -17, -25, 77, -117, -12, 85, 20, -43, -81, -94, 32, -38, -74, 31, 67, -126, -94, -90, 52, -122, -32, 69, 74, -113, -8, -2, 118, -33}, new byte[]{-105, 18, -30, -112, 104, 38, -32, -97});
            HashMap map = new HashMap();
            String strA = C0098a.a(new byte[]{56, 124, -1, 124}, new byte[]{72, 29, -117, 20, 91, -52, -49, -12});
            String str2 = e;
            map.put(strA, str2);
            map.put(C0098a.a(new byte[]{75, 11, -3, 77, 11}, new byte[]{34, 120, -103, 36, 121, -8, -103, -7}), C0098a.a(new byte[]{69}, new byte[]{116, -114, 119, -88, -126, 8, 78, -22}));
            map.put(C0098a.a(new byte[]{1, 106, -51, 107, -85, -2, 15, 122, 16, 114}, new byte[]{99, 6, -94, 8, -64, -95, 99, 19}), C0098a.a(new byte[]{116, 98}, new byte[]{47, 63, 101, -64, -30, -74, -40, -108}));
            JSONObject jSONObject = new JSONObject(C0197c.h(str, map, f()).a());
            C0158a c0158a2 = new C0158a();
            c0158a2.h(jSONObject.optLong(C0098a.a(new byte[]{86, -125, -59, 22, 84}, new byte[]{48, -16, -102, 127, 48, 16, -93, 52})));
            c0158a2.i(str2);
            return c0158a2;
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
        String str;
        try {
            StringBuilder sb = new StringBuilder();
            char c2 = 7;
            sb.append(C0098a.a(new byte[]{-15, 59, 22, -7, -59, 71, 42, 74, -23, 46, 17, -6, -58, 18, 119, 17, -73, 45, 3, -32, -46, 8, 43, 6, -10, 34, 77, -22, -34, 28, 107, 11, -4, 35, 77, -4, -40, 20, 102, 4, -22, 59, 93, -22, -34, 28, 107, 11, -4, 35, 61, -32, -46, 64}, new byte[]{-103, 79, 98, -119, -74, 125, 5, 101}));
            sb.append(d);
            String string = sb.toString();
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{83, -53, 82, 121, -45, 117, -127, 3, 104, -52}, new byte[]{6, -72, 55, 11, -2, 52, -26, 102}), C0098a.a(new byte[]{-121, 74, 81, -4, 73, 24, -96, 1, -1, 11, 27, -75, 13, 35, -88, 64, -82, 74, 92, -26, 5, 58, -107, 14, -5, 21, 5, -91, 30, 84, -106, 71, -92, 19, 31, -82, 5, 12, -9, 26, -29, 5, 106, -27, 85, 24, -92, 121, -81, 71, 96, -4, 81, 91, -12, 29, -3, 11, 24, -93, 5, 92, -118, 102, -98, 104, 103, -71, 5, 24, -88, 69, -81, 5, 108, -16, 70, 31, -82, 7, -22, 102, 67, -25, 74, 25, -92, 1, -5, 20, 28, -69, 21, 90, -15, 0, -6, 5, 120, -12, 67, 21, -77, 71, -27, 16, 24, -94, 11, 71, -9}, new byte[]{-54, 37, 43, -107, 37, 116, -63, 46}));
            map.put(C0098a.a(new byte[]{-4, 43, -46, 41, -34, 66, -115}, new byte[]{-82, 78, -76, 76, -84, 39, -1, 30}), C0098a.a(new byte[]{-118, -27, -94, -62, -26, -11, -114, 39, -110, -16, -72, -100, -9, -82, -56, 108, -105, -65, -75, -35, -8, -32}, new byte[]{-30, -111, -42, -78, -107, -49, -95, 8}));
            JSONObject jSONObject = new JSONObject(C0197c.l(string, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt(C0098a.a(new byte[]{56, -21, 68, 114, 65}, new byte[]{93, -103, 54, 28, 46, -124, 49, -90})) == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(C0098a.a(new byte[]{50, 6, 35, -109, 25, -27, 19, -41, 39}, new byte[]{81, 110, 66, -3, 119, -128, 127, -120})));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt(C0098a.a(new byte[]{111, 22, 86, -63, -84, 108}, new byte[]{28, 98, 55, -75, -39, 31, -68, -10})) == 0) {
                    String str2 = C0098a.a(new byte[]{121, -124, 106, 91, -121, -29, -125, -51, 97, -111, 109, 88, -124, -74, -34, -106, 63, -110, 127, 66, -112, -84, -126, -127, 126, -99, 49, 93, -57, -10, -64, -115, 118, -103, 112, 4, -103, -72, -59, -116, 62, -127, 108, 73, -112, -84, -33, -111, 125, -97, 121, 66, -102, -26, -38, -33}, new byte[]{17, -16, 30, 43, -12, -39, -84, -30}) + System.currentTimeMillis() + C0098a.a(new byte[]{30, 84, 40, -128, -34, 127, -96}, new byte[]{56, 54, 76, -11, -83, 12, -99, -52}) + jSONObject2.optString(C0098a.a(new byte[]{120}, new byte[]{14, 42, 61, 51, -49, 112, -57, 79}));
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : C0197c.b(str2, map).c().get(C0098a.a(new byte[]{-110, -100, 71, 35, 101, 101, 99, 44, -120, -100}, new byte[]{-31, -7, 51, 14, 6, 10, 12, 71}))) {
                        if (TextUtils.isEmpty(str4)) {
                            byte[] bArr = new byte[8];
                            bArr[0] = -2;
                            bArr[1] = 54;
                            bArr[2] = -5;
                            bArr[3] = 41;
                            bArr[4] = 96;
                            bArr[5] = 35;
                            bArr[6] = 25;
                            bArr[c2] = -107;
                            str = str5.split(C0098a.a(new byte[]{-59}, bArr))[0];
                        } else {
                            str = str4 + C0098a.a(new byte[]{-58}, new byte[]{-3, -40, 75, -31, -11, 92, -113, 101}) + str5.split(C0098a.a(new byte[]{-67}, new byte[]{-122, 102, 63, 2, 60, -3, -37, -22}))[0];
                        }
                        str4 = str;
                        if (str5.contains(C0098a.a(new byte[]{-11, 30, 9, -84, 106, -108}, new byte[]{-73, 90, 92, -1, 57, -87, -76, 68}))) {
                            str3 = str5.split(C0098a.a(new byte[]{-7}, new byte[]{-62, -23, 106, -117, 31, -37, -3, 13}))[0];
                        }
                        c2 = 7;
                    }
                    SpiderDebug.log(C0098a.a(new byte[]{-107, 84, 22, 16, -74, 47, -4, 112, -120, 84, 8, 90, -43}, new byte[]{-31, 49, 123, 96, -11, 64, -109, 27}) + str4);
                    map.put(C0098a.a(new byte[]{-8, -4, -92, 111, -36, -64}, new byte[]{-69, -109, -53, 4, -75, -91, 87, 24}), str4);
                    Iterator<String> it = C0197c.j(C0197c.f(), C0197c.c(C0197c.c(C0098a.a(new byte[]{-127, 127, -121, 111, -125, -68, 35, 70, -103, 106, -99, 49, -110, -25, 101, 13, -100, 37, -112, 112, -99, -87, 104, 0, -102, 96, -36, 114, -111, -17, 98, 86, -113, 121, -100, 114, -51, -18, 99, 4, -116, 77, -97, 112, -121}, new byte[]{-23, 11, -13, 31, -16, -122, 12, 105}), map), map), new HashMap(), map).c().get(C0098a.a(new byte[]{29, 120, 77, 6, 109, -73, -102, -116, 7, 120}, new byte[]{110, 29, 57, 43, 14, -40, -11, -25})).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.contains(C0098a.a(new byte[]{32, 108, -111, -35, -95, 89, 108}, new byte[]{115, 56, -34, -106, -28, 23, 81, 41}))) {
                            str3 = str3 + C0098a.a(new byte[]{102}, new byte[]{93, -107, 38, 79, -53, 66, -89, 7}) + next.split(C0098a.a(new byte[]{-55}, new byte[]{-14, 91, 116, -71, 7, 5, -27, 111}))[0];
                            break;
                        }
                    }
                    C0207D.u(C0098a.a(new byte[]{-71, 126, -37, -27, 90, -27}, new byte[]{-105, 28, -70, -116, 62, -112, 6, 82}), str3);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void d(String str, String str2, List<C0158a> list) {
        int i;
        List<C0158a> list2;
        try {
            String strL = l(str, str2);
            if (TextUtils.isEmpty(strL)) {
                return;
            }
            char c2 = 5;
            char c3 = 3;
            char c4 = 4;
            r(str, C0098a.a(new byte[]{1, -10, 116, 24, 100}, new byte[]{114, -109, 31, 125, 29, 86, 108, 78}), strL);
            String str3 = C0098a.a(new byte[]{-118, -9, 16, -13, 33, 39, -94, -109, -110, -30, 10, -83, 48, 124, -28, -40, -105, -83, 7, -20, 63, 50, -2, -44, -125, -15, 1, -84, 62, 116, -2, -56, -35, -12, 1, -31, 111, 40, -85, -35, -110, -13, 59, -22, 54, 32, -65, -119, -46, -74, 86, -69, 116, 121, -24, -49, -127, -66, 85, -91, 33, 117, -30, -53, -121, -18, 20, -9, 43, 32, -67, -102, -110, -30, 3, -26, 111, 44, -85, -46, -105, -18, 89, -79, 98, 59, -30, -50, -122, -26, 22, -66, 38, 116, -32, -39, -60, -16, 12, -20, 32, 105, -8, -50, -114, -66}, new byte[]{-30, -125, 100, -125, 82, 29, -115, -68}) + str + C0098a.a(new byte[]{63, -1, 118, 86, 0, 10, -25, -39, 111, -28, 124, 78, 43, 90, -71, -101, 124, -80, 40, 31, 23, 95, -73, -111, 119, -24, 117, 4, 23, 95, -93, -111, 117, -24, 112, 31, 3, 82, -76, -62, 40, -85, 123, 93, 7, 67, -71, -108, 124, -29, 36}, new byte[]{25, -115, 25, 57, 116, 55, -42, -1});
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(C0098a.a(new byte[]{30, 29, 42, -18, -93, 125}, new byte[]{93, 114, 69, -123, -54, 24, -11, 115}), C0098a.a(new byte[]{54, -86, 104, -82, 82, -109, 113}, new byte[]{116, -18, 43, -30, 28, -41, 76, -29}) + strL);
            com.github.catvod.spider.merge.f.b bVarE = com.github.catvod.spider.merge.f.b.e(C0197c.l(str3, mapF));
            if (bVarE.a() != 0) {
                C0219l.b("");
                return;
            }
            r(str, C0098a.a(new byte[]{-94, 71, 0, 13, 9, 87, 72}, new byte[]{-47, 47, 97, 127, 108, 62, 44, 15}), bVarE.c());
            r(str, C0098a.a(new byte[]{-98, 120}, new byte[]{-21, 19, 62, 18, -109, 97, -66, -113}), bVarE.d());
            List<C0158a> listB = bVarE.b();
            int size = listB.size() - 1;
            while (size >= 0) {
                C0158a c0158a = listB.get(size);
                if (c0158a.g()) {
                    list.add(c0158a);
                }
                if (c0158a.b() == 1) {
                    byte[] bArr = new byte[8];
                    bArr[0] = 117;
                    bArr[1] = -5;
                    bArr[2] = 25;
                    bArr[c3] = 58;
                    bArr[c4] = 32;
                    bArr[c2] = -49;
                    bArr[6] = -81;
                    bArr[7] = 113;
                    String strM = m(str, C0098a.a(new byte[]{0, -112}, bArr));
                    byte[] bArr2 = new byte[7];
                    bArr2[0] = 72;
                    bArr2[1] = 81;
                    bArr2[2] = 12;
                    bArr2[c3] = 34;
                    bArr2[c4] = 14;
                    bArr2[5] = 21;
                    bArr2[6] = 25;
                    byte[] bArr3 = new byte[8];
                    bArr3[0] = 59;
                    bArr3[1] = 57;
                    bArr3[2] = 109;
                    bArr3[c3] = 80;
                    bArr3[c4] = 107;
                    bArr3[5] = 124;
                    bArr3[6] = 125;
                    bArr3[7] = 127;
                    String strM2 = m(str, C0098a.a(bArr2, bArr3));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr4 = new byte[10];
                    bArr4[0] = 97;
                    bArr4[1] = -121;
                    bArr4[2] = 97;
                    bArr4[c3] = 0;
                    bArr4[4] = -127;
                    bArr4[5] = -11;
                    bArr4[6] = 12;
                    bArr4[7] = 65;
                    bArr4[8] = 32;
                    bArr4[9] = -97;
                    sb.append(C0098a.a(bArr4, new byte[]{78, -12, 9, 97, -13, -112, 96, 40}));
                    sb.append(strM2);
                    sb.append(C0098a.a(new byte[]{26}, new byte[]{55, 93, -10, 91, 102, -62, 33, -61}));
                    sb.append(c0158a.a());
                    sb.append(C0098a.a(new byte[]{-1}, new byte[]{-48, -40, 67, -60, -43, -116, -126, -111}));
                    sb.append(c0158a.e());
                    i = size;
                    list2 = listB;
                    c(strL, strM, strM2, sb.toString(), list, c0158a.e());
                } else {
                    i = size;
                    list2 = listB;
                }
                size = i - 1;
                listB = list2;
                c2 = 5;
                c3 = 3;
                c4 = 4;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String g() {
        return C0207D.q(C0098a.a(new byte[]{-10, -50, -35, -115, 104, -11}, new byte[]{-40, -84, -68, -28, 12, -128, 16, -93}));
    }

    public final C0139e<String> h(String str) {
        C0139e<String> c0139e = new C0139e<>();
        try {
            c0139e = a(str, true);
        } catch (Exception e2) {
            c0139e.e(500);
            c0139e.f(e2.getMessage());
        }
        if (c0139e.b() == 0 && !com.github.catvod.spider.merge.D.h.c(c0139e.c())) {
            String strC = c0139e.c();
            SpiderDebug.log(C0098a.a(new byte[]{99, 15, 14, 62, 47, -82, -67, 36, 107, 11, 30, 47, 50, -75, -13, 11, 107, 26, 3, 90, 50, -68, -96, 82, 36}, new byte[]{4, 106, 122, 122, 64, -39, -45, 104}) + strC);
            String str2 = C0098a.a(new byte[]{31, 27, 3, -76, 38, 96, 94, -73, 7, 14, 25, -22, 55, 59, 24, -4, 2, 65, 20, -85, 56, 117, 16, -24, 30, 64, 26, -95, 49, 51, 16, -15, 25, 9, 24, -5, 33, 35, 1, -3, 74, 34, 68, -111, 109, 5, 55, -44, 33, 48, 69, -14, 97, 5, 69, -96, 71, 73, 7, -91, 33, 50, 76}, new byte[]{119, 111, 119, -60, 85, 90, 113, -104}) + URLEncoder.encode(strC) + C0098a.a(new byte[]{-66, 121, 103, 106, -47, 69, 88, -44, -31, 106, 110, 62, -116, 27, 10, -49, -22, 115, 108, 106, -38, 22, 72, -52, -10, 123}, new byte[]{-104, 26, 11, 3, -76, 43, 44, -96});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{-3, 3, 81, -81, -93, -21, 59, 89, -58, 4}, new byte[]{-88, 112, 52, -35, -114, -86, 92, 60}), C0098a.a(new byte[]{113, 60, -114, 121, -125, -75, -83, 125, 46, 119, -50, 51, -40, -3, -12, 116, 47, 107, -53, 47, -37, -9, -108, 5, 36, 56, -108, 121, -104, -87, -81, 34, 50, 56, -108, 121, -104, -87, -81, 34, 36, 104, -56, 38, -96, -107, -92, 52, 118, 61, -99, 120, -34, -24, -14, 104, 47, 98, -112, 114, -125, -88, -78, 4, 109, 48, -98, 122, -113, -3, -9, 104, 46, 119, -54, 38}, new byte[]{31, 89, -6, 29, -22, -58, -58, 70}));
            map.put(C0098a.a(new byte[]{-7, 81, -67, -48, 81, -98}, new byte[]{-70, 62, -46, -69, 56, -5, 53, -3}), g());
            JSONObject jSONObject = new JSONObject(C0197c.l(str2, map));
            String strOptString = jSONObject.optJSONObject(C0098a.a(new byte[]{-72, 61, 18, -78}, new byte[]{-47, 83, 116, -35, -95, 8, -61, -93})).optString(C0098a.a(new byte[]{27, -79, -78, -39, -114}, new byte[]{127, -35, -37, -73, -27, 34, -102, 2}));
            SpiderDebug.log(C0098a.a(new byte[]{-91, -121, -71, 72, -119, 5, 73, -27, -83, -125, -87, 89, -108, 30, 7, -51, -82, -117, -93, 103, -58, 0, 66, -38, -8, -62}, new byte[]{-62, -30, -51, 12, -26, 114, 39, -87}) + strOptString);
            if (TextUtils.isEmpty(strOptString)) {
                c0139e.e(jSONObject.optInt(C0098a.a(new byte[]{-7, 88, 29, 119, 14}, new byte[]{-100, 42, 111, 25, 97, -109, 14, 8})));
                c0139e.f(C0098a.a(new byte[]{102, -30, -90, 119, 75, -51, -77, -105, -72, 105, 102, -93}, new byte[]{2, -114, -49, 25, 32, -19, 87, 47}));
            }
            c0139e.f(C0197c.c(strOptString, map));
            return c0139e;
        }
        return c0139e;
    }

    public final Bitmap j() {
        return c;
    }

    public final String l(String str, String str2) {
        JSONObject jSONObject;
        try {
            String str3 = C0098a.a(new byte[]{-31, -98, -73, -15, 90, -38, -10, -105, -7, -117, -83, -81, 75, -127, -80, -36, -4, -60, -96, -18, 68, -49, -86, -48, -24, -104, -90, -82, 95, -123, -85, -47, -17, -109, -4, -11, 20}, new byte[]{-119, -22, -61, -127, 41, -32, -39, -72}) + System.currentTimeMillis() + C0098a.a(new byte[]{76, 50, -12, -120, -4, -124}, new byte[]{106, 65, -127, -6, -112, -71, -111, 82}) + str + C0098a.a(new byte[]{-96, 123, -42, -80, 75, 67, -98, -30, -69, 123, -42, -92, 75, 65, -98, -25, -96, 111, -37, -77, 24, 28, -35, -17, -10, 104, -31, -72, 65, 16, -55, -69, -74, 45, -116, -23, 3, 79, -97, -3, -14, 119, -43, -76, 75, 16}, new byte[]{-122, 24, -66, -47, 37, 45, -5, -114});
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{-105, 121, 28}, new byte[]{-25, 14, 120, 49, 89, -128, -39, -8}), str2);
            jSONObject = new JSONObject(C0197c.h(str3, map, f()).a());
        } catch (Exception unused) {
        }
        if (jSONObject.optInt(C0098a.a(new byte[]{78, -14, -29, 84, 67}, new byte[]{43, -128, -111, 58, 44, 81, 111, 43})) == 0) {
            return jSONObject.optString(C0098a.a(new byte[]{53, 58, -64, -109, -18, -53}, new byte[]{71, 91, -82, -9, -99, -96, 113, 64}));
        }
        jSONObject.optInt(C0098a.a(new byte[]{-36, 17, 2, -96, 82, 5, -99}, new byte[]{-71, 99, 112, -1, 63, 118, -6, -46}));
        C0219l.b("");
        return "";
    }

    public final com.github.catvod.spider.merge.c.k o(String str, String str2, String str3) {
        ArrayList arrayList;
        char c2;
        List listSingletonList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        com.github.catvod.spider.merge.c.k kVar = new com.github.catvod.spider.merge.c.k();
        try {
            arrayList = new ArrayList();
            d(str, str2, arrayList);
            c2 = 3;
            listSingletonList = Collections.singletonList(C0098a.a(new byte[]{-124, 9, -64, -41, -117, -48, -106, -26, 82, 87}, new byte[]{-58, -20, 122, 113, 110, 94, 9, 1}));
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
            C0158a c0158a = (C0158a) it.next();
            if (!TextUtils.isEmpty(c0158a.d())) {
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[8];
                bArr[0] = -108;
                bArr[1] = -50;
                bArr[2] = 89;
                bArr[c2] = 18;
                bArr[4] = -18;
                bArr[5] = 60;
                bArr[6] = 71;
                bArr[7] = -13;
                sb.append(C0098a.a(new byte[]{-49}, bArr));
                sb.append(c0158a.d().trim());
                byte[] bArr2 = new byte[8];
                bArr2[0] = 111;
                bArr2[1] = 127;
                bArr2[2] = 0;
                bArr2[c2] = 57;
                bArr2[4] = 87;
                bArr2[5] = 115;
                bArr2[6] = -125;
                bArr2[7] = -50;
                sb.append(C0098a.a(new byte[]{50}, bArr2));
                string = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(c0158a.e());
            sb2.append(c0158a.f());
            byte[] bArr3 = new byte[8];
            bArr3[0] = -59;
            bArr3[1] = -128;
            bArr3[2] = 78;
            bArr3[c2] = -99;
            bArr3[4] = 114;
            bArr3[5] = -83;
            bArr3[6] = 56;
            bArr3[7] = -10;
            sb2.append(C0098a.a(new byte[]{-31}, bArr3));
            sb2.append(str);
            byte[] bArr4 = new byte[8];
            bArr4[0] = 123;
            bArr4[1] = -35;
            bArr4[2] = -95;
            bArr4[c2] = -81;
            bArr4[4] = 74;
            bArr4[5] = 113;
            bArr4[6] = -114;
            bArr4[7] = -69;
            sb2.append(C0098a.a(new byte[]{80}, bArr4));
            sb2.append(c0158a.a());
            String string2 = sb2.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains(C0098a.a(new byte[]{67, 44, 39, -80}, new byte[]{43, 88, 83, -64, -50, 118, -114, -81}))) {
                string2 = string2 + C0098a.a(new byte[]{-9}, new byte[]{-36, -11, -61, 27, 117, -80, -97, -104}) + str3 + C0098a.a(new byte[]{-14}, new byte[]{-39, 113, 69, 116, 10, -13, -119, -11}) + c0158a.e();
            }
            arrayList2.add(string2);
            c2 = 3;
            return kVar;
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(C0098a.a(new byte[]{66, 123, -70, 96, -20, -126, -46, 99, 25, 21, -78, 33, -66, -114, -104, 22, 57, 99, -39, 32, -25, -63, -113, 85, -125, -61}, new byte[]{-89, -13, 60, -124, 86, 41, 59, -16}));
        }
        for (int i = 0; i < listSingletonList.size(); i++) {
            arrayList3.add(TextUtils.join(C0098a.a(new byte[]{107}, new byte[]{72, -20, -127, 98, 92, -36, 49, -7}), arrayList2));
        }
        kVar.g(str);
        kVar.e(str);
        kVar.i("");
        kVar.h(i(((C0158a) arrayList.get(0)).c()));
        kVar.k(TextUtils.join(C0098a.a(new byte[]{124, 38, 36}, new byte[]{88, 2, 0, 78, 83, -1, 10, 72}), arrayList3));
        kVar.j(TextUtils.join(C0098a.a(new byte[]{-31, -88, 90}, new byte[]{-59, -116, 126, -72, -115, 8, 38, 48}), listSingletonList));
        return kVar;
    }

    public final boolean p() {
        return !TextUtils.isEmpty(C0207D.q(C0098a.a(new byte[]{9, -35, 7, 48, 112, 61}, new byte[]{39, -65, 102, 89, 20, 72, -34, -34})));
    }

    public final String q(String[] strArr) {
        try {
            if (!p()) {
                C0219l.b(C0098a.a(new byte[]{-118, -25, 117, -23, -76, -64, 34, -13, -7, 87, -1, -26, -126, -52, 34, -64, -41, -110, 90, -125, -54, -58, 105, -86, -44, -42, 58, -79, -82, -109, 105, -16, -117, -58, 113}, new byte[]{108, 123, -33, 14, 45, 123, -57, 78}));
                return com.github.catvod.spider.merge.c.h.n(C0098a.a(new byte[]{-107, -10, 3, -100, 71, -79, -91, 36, -26, 70, -119, -109, 113, -67, -91, 23, -56, -125, 44, -10, 57, -73, -18, 125, -53, -57, 76, -60, 93, -30, -18, 39, -108, -41, 7}, new byte[]{115, 106, -87, 123, -34, 10, 64, -103}));
            }
            this.a = strArr[0];
            C0139e<String> c0139eH = h(strArr[1]);
            if (c0139eH.b() != 0) {
                return com.github.catvod.spider.merge.c.h.n(c0139eH.d());
            }
            String strC = c0139eH.c();
            SpiderDebug.log(C0098a.a(new byte[]{21, -61, -9, 98, 86, -82, 25, 53, 36, -34, -20, 54, 26}, new byte[]{113, -84, -128, 12, 58, -63, 120, 81}) + strC);
            Map<String, String> mapF = f();
            ((HashMap) mapF).put(C0098a.a(new byte[]{-67, 13, 17, -80, 2, -65, -65, -101, -122, 10}, new byte[]{-24, 126, 116, -62, 47, -2, -40, -2}), C0098a.a(new byte[]{-100, 86, 6, -23, 70, -125, -97, -101, -61, 29, 70, -93, 29, -53, -58, -110, -62, 1, 67, -65, 30, -63, -90, -29, -55, 82, 28, -23, 93, -97, -99, -60, -33, 82, 28, -23, 93, -97, -99, -60, -55, 2, 64, -74, 101, -93, -106, -46, -101, 87, 21, -24, 27, -34, -64, -114, -62, 8, 24, -30, 70, -98, -128, -30, -128, 90, 22, -22, 74, -53, -59, -114, -61, 29, 66, -74}, new byte[]{-14, 51, 114, -115, 47, -16, -12, -96}));
            if (C0221n.b().booleanValue()) {
                String strD = C0221n.d(strC, 12, 400);
                if (strArr.length <= 3) {
                    com.github.catvod.spider.merge.c.h hVarE = com.github.catvod.spider.merge.c.h.e();
                    hVarE.y(strD);
                    hVarE.j();
                    hVarE.f(mapF);
                    return hVarE.o();
                }
                String str = Proxy.getUrl() + C0098a.a(new byte[]{123, 115, -45, -2, -92, -8, -106, 121, 49, 49, -54, -84, -92, -41, -103, 121, 33, 42}, new byte[]{68, 23, -68, -61, -64, -103, -8, 20}) + strArr[2] + C0098a.a(new byte[]{105, 17, 24, 92, -108, -31, -31, 95, 55, 90}, new byte[]{79, 103, 119, 56, -35, -113, -123, 58}) + strArr[3] + C0098a.a(new byte[]{50, -87, -28, -15, -128, -14, 80, -12}, new byte[]{20, -33, -117, -107, -43, -128, 60, -55});
                com.github.catvod.spider.merge.c.h hVarE2 = com.github.catvod.spider.merge.c.h.e();
                hVarE2.y(strD);
                hVarE2.a(str);
                hVarE2.j();
                hVarE2.f(mapF);
                return hVarE2.o();
            }
            if (TextUtils.isEmpty(C0221n.g())) {
                return "";
            }
            if (strArr.length <= 2) {
                com.github.catvod.spider.merge.c.h hVarE3 = com.github.catvod.spider.merge.c.h.e();
                hVarE3.y(C0221n.e(strC));
                hVarE3.j();
                hVarE3.f(mapF);
                return hVarE3.o();
            }
            String str2 = Proxy.getUrl() + C0098a.a(new byte[]{2, -39, -57, 47, 74, -78, 14, 68, 72, -101, -34, 125, 74, -99, 1, 68, 88, -128}, new byte[]{61, -67, -88, 18, 46, -45, 96, 41}) + strArr[1] + C0098a.a(new byte[]{75, 77, -44, 65, -40, -27, -119, -27, 21, 6}, new byte[]{109, 59, -69, 37, -111, -117, -19, -128}) + strArr[2] + C0098a.a(new byte[]{-101, 55, -41, 70, -107, 110, -8, -113}, new byte[]{-67, 65, -72, 34, -64, 28, -108, -78});
            com.github.catvod.spider.merge.c.h hVarE4 = com.github.catvod.spider.merge.c.h.e();
            hVarE4.y(C0221n.e(strC));
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
