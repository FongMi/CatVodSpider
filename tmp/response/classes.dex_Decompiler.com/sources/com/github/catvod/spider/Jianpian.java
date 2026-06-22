package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0132s;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.h.C0169a;
import com.github.catvod.spider.merge.h.C0173e;
import com.github.catvod.spider.merge.h.C0174f;
import com.github.catvod.spider.merge.h.C0175g;
import com.github.catvod.spider.merge.h.C0176h;
import com.github.catvod.spider.merge.n.C0197c;
import com.google.gson.JsonParser;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Jianpian extends Spider {
    private final String a = C0098a.a(new byte[]{19, -76, -102, -7, -121, 59, -31, -47, 11, -87, -64, -4, -33, 126, -10, -125, 85, -93, -127, -28}, new byte[]{123, -64, -18, -119, -67, 20, -50, -80});
    private String b;

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-61, 43, 56, -59, 40, 87, 9, 68, -40, 44}, new byte[]{-74, 88, 93, -73, 5, 54, 110, 33}), C0098a.a(new byte[]{-44, -114, -110, 10, -33, -97, -63, 122, -84, -49, -40, 67, -101, -65, -55, 59, -20, -103, -45, 67, -14, -99, -60, 39, -10, -120, -116, 67, -126, -62, -101, 117, -53, -124, -116, 14, -38, -45, -21, 102, -87, -63, -72, 17, -36, -45, -6, 58, -10, -116, -56, 38, -41, -102, -44, 60, -10, -113, -56, 33, -58, -102, -52, 49, -74, -77, -93, 50, -126, -35, -110, 101, -87, -39, -38, 85, -99, -61, -112, 103, -94, -63, -97, 21, -102, -45, -31, 37, -23, -115, -115, 52, -42, -111, -21, 60, -19, -50, -35, 80, -124, -35, -109, 99, -71, -55, -93, 43, -25, -66, -20, 121, -71, -115, -127, 8, -42, -45, -25, 48, -6, -118, -121, 74, -109, -91, -59, 39, -22, -120, -121, 13, -100, -57, -114, 101, -71, -94, -128, 17, -36, -98, -59, 122, -96, -47, -58, 83, -99, -57, -108, 102, -87, -49, -38, 82, -125, -45, -19, 58, -5, -120, -124, 6, -109, -96, -63, 51, -8, -109, -127, 76, -122, -64, -105, 123, -86, -41, -45, 20, -42, -111, -63, 59, -14, -50, -128, 86, -43, -110, -61, 48, -94, -106, -115, 1, -46, -99, -53, 122, -88, -49, -40, 88, -35, -106, -44, 1, -32, -111, -115, 89, -3, -74, -12, 2, -42, -77, -93, 60, -28, -70, -26, 28, -94, -128, -104, 19, -27, -106, -46, 38, -16, -114, -122, 89, -121, -62, -106, 110, -23, -128, -117, 8, -46, -108, -59, 27, -8, -116, -115, 89, -48, -100, -51, 123, -13, -111, -37, 77, -53, -108, -109}, new byte[]{-103, -31, -24, 99, -77, -13, -96, 85}));
        map.put(C0098a.a(new byte[]{-17, 96, 95, 80, -111, 114}, new byte[]{-114, 3, 60, 53, -31, 6, -18, -62}), C0098a.a(new byte[]{-104, -115, 55, -88, 10, -56, -27, 28, -112, -110, 41, -21, 9, -40, -21, 6, -43, -35, 51, -95, 27, -33, -85, 24, -107, -100, 46, -86, 79, -117, -82, 71, -45}, new byte[]{-7, -3, 71, -60, 99, -85, -124, 104}));
        map.put(C0098a.a(new byte[]{-104, 5, 91, 21, -16, 115, -78, -22, -108, 77, 77, 93, -10, 111, -93, -15}, new byte[]{-32, 40, 41, 112, -127, 6, -41, -103}), C0098a.a(new byte[]{-117, 106, 18, -64, -66, 54, 55, 99, -112, 98, 76}, new byte[]{-24, 5, 127, -18, -44, 70, 4, 77}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (str.endsWith(C0098a.a(new byte[]{110, -56, 81, 34, 125}, new byte[]{65, -77, 33, 69, 0, 73, 1, 111}))) {
            return searchContent(str.split(C0098a.a(new byte[]{-11}, new byte[]{-38, 105, -127, 55, 53, -114, -64, 75}))[0], str2);
        }
        if (str.equals(C0098a.a(new byte[]{68, 88}, new byte[]{113, 104, -66, -112, -110, -123, -105, 75})) || str.equals(C0098a.a(new byte[]{110, -120}, new byte[]{87, -79, -48, -69, -36, -46, -78, 30})) || str.equals(C0098a.a(new byte[]{0, 84, 35}, new byte[]{49, 101, 18, -17, -37, 2, 107, -34}))) {
            ArrayList arrayList = new ArrayList();
            Iterator<C0173e> it = C0175g.b(C0197c.l(this.a + String.format(C0098a.a(new byte[]{4, -121, 28, -79, 60, -50, -6, 16, 74, -127, 67, -76, 122, -39, -9, 123, 72, -121, 24, -67, 116, -59, -15, 61, 116, -113, 8, -27, 54, -39, -91, 52, 74, -127, 9, -27, 54, -39}, new byte[]{43, -26, 108, -40, 19, -86, -125, 68}), str, str2), a())).a().iterator();
            while (it.hasNext()) {
                Iterator<C0169a> it2 = it.next().c().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().a());
                }
            }
            h hVar = new h();
            hVar.k(1, 1, 0, 1);
            hVar.A(arrayList);
            return hVar.toString();
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        Iterator<C0173e> it3 = C0175g.b(C0197c.l(this.a + String.format(C0098a.a(new byte[]{-63, 74, -86, 12, 104, -106, -12, 78, -125, 73, -11, 9, 46, -122, -14, 4, -120, 72, -69, 17, 34, -86, -10, 82, -118, 22, -1, 22, 97, -108, -12, 94, -113, 22, -1, 22, 97, -116, -29, 90, -100, 22, -1, 22, 97, -127, -1, 75, -117, 22, -22, 67, 52, -102, -12, 79, -45, 14, -87, 67, 55, -108, -31, 94, -45, 14, -87, 67, 36, -108, -14, 94, -119, 68, -88, 28, 24, -100, -30, 6}, new byte[]{-18, 43, -38, 101, 71, -11, -122, 59}), str, map2.get(C0098a.a(new byte[]{-53, -4, 74, -66}, new byte[]{-86, -114, 47, -33, 12, 2, 114, -64})) == null ? C0098a.a(new byte[]{52}, new byte[]{4, -15, 3, -32, -17, 119, -37, 17}) : (String) map2.get(C0098a.a(new byte[]{-33, 67, 48, -90}, new byte[]{-66, 49, 85, -57, 112, -61, -43, -102})), map2.get(C0098a.a(new byte[]{41, -120, -59, 60}, new byte[]{80, -19, -92, 78, 57, -96, 98, -55})) == null ? C0098a.a(new byte[]{-22}, new byte[]{-38, -116, -58, 45, 2, 4, 42, 103}) : (String) map2.get(C0098a.a(new byte[]{-83, 50, 23, 118}, new byte[]{-44, 87, 118, 4, -80, -97, 27, -92})), map2.get(C0098a.a(new byte[]{23, 15}, new byte[]{117, 118, -95, -22, -120, 88, -86, 105})) == null ? C0098a.a(new byte[]{83, -79, -100, -60, 101, -18}, new byte[]{38, -63, -8, -91, 17, -113, 11, -76}) : (String) map2.get(C0098a.a(new byte[]{-31, 32}, new byte[]{-125, 89, 40, 36, 50, 53, 101, 106})), str2), a())).a().iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().m());
        }
        return h.q(arrayList2);
    }

    public String detailContent(List<String> list) {
        C0173e c0173eA = ((C0174f) C0132s.a(C0197c.l(C0098a.a(new byte[]{-46, 59, 31, 47, 52, 54, 123, 18, -54, 38, 69, 42, 108, 115, 108, 64, -108, 44, 4, 50, 33, 120, 36, 26, -107, 57, 2, 59, 107, 118, 123, 23, -33, 59, 10, 54, 98, 111, 102, 76, -45, 43, 86}, new byte[]{-70, 79, 107, 95, 14, 25, 84, 115}) + list.get(0), a()), C0174f.class)).a();
        k kVarM = c0173eA.m();
        kVarM.j(c0173eA.i());
        kVarM.n(c0173eA.k());
        kVarM.d(c0173eA.b());
        kVarM.b(c0173eA.g());
        kVarM.c(c0173eA.a());
        kVarM.k(c0173eA.j());
        kVarM.f(c0173eA.e());
        kVarM.e(c0173eA.d());
        return h.p(kVarM);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-73}, new byte[]{-122, -18, -73, 105, -83, -78, -22, -28}), C0098a.a(new byte[]{61}, new byte[]{15, 72, 27, -104, -12, -103, -36, -126}), C0098a.a(new byte[]{-33}, new byte[]{-20, -109, 40, 100, 17, 106, 27, -123}), C0098a.a(new byte[]{-40}, new byte[]{-20, 107, 0, -74, 9, 0, -75, 28}), C0098a.a(new byte[]{124, -14}, new byte[]{73, -62, -105, -83, -56, 22, -15, -14}), C0098a.a(new byte[]{-105, 25}, new byte[]{-82, 32, 30, 86, 4, 68, 75, 43}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{104, 96, -77, 50, -71, 47}, new byte[]{-113, -12, 6, -41, 4, -98, 35, 105}), C0098a.a(new byte[]{83, 46, 109, 91, -19, -54, -69, -78, 19}, new byte[]{-76, -70, -40, -77, 74, 76, 94, 59}), C0098a.a(new byte[]{12, 80, -100, 116, 28, -99}, new byte[]{-23, -38, 52, -110, -96, 54, 120, 125}), C0098a.a(new byte[]{36, 117, -93, 84, -18, -27}, new byte[]{-61, -50, 31, -68, 103, 95, -59, 40}), C0098a.a(new byte[]{-89, 127, -18, 4, 6, 25, -123, 19, -57}, new byte[]{64, -59, 68, -31, -69, -116, 98, -102}), C0098a.a(new byte[]{125, 120, 7, 21, -16, 55, -22}, new byte[]{51, 29, 115, 115, -100, 94, -110, 5}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return h.r(arrayList, JsonParser.parseString(C0197c.l(this.b, null)));
    }

    public String homeVideoContent() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0173e> it = C0175g.b(C0197c.l(C0098a.a(new byte[]{-64, -77, -119, 106, -12, 115, 16, -39, -40, -82, -45, 111, -84, 54, 7, -117, -122, -92, -110, 119, -31, 61, 79, -47, -121, -76, -111, 115, -86, 57, 16, -44, -63, -76, -119, 37, -66, 51, 76, -25, -63, -93, -64, 34, -10}, new byte[]{-88, -57, -3, 26, -50, 92, 63, -72}), a())).a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l());
        }
        return h.q(arrayList);
    }

    public void init(Context context, String str) {
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        h hVar = new h();
        hVar.y(str2);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0176h> it = ((C0176h) C0132s.a(C0197c.l(this.a + String.format(C0098a.a(new byte[]{73, 12, 104, 121, 30, -81, 81, -13, 21, 8, 121, 98, 82, -79, 76, -86, 15, 9, 125, 127, 103, -21, 92, -73, 3, 20, 37, 53, 66, -1, 0, -67, 18, 8, 127, 127, 67, -96, 60, -75, 2, 80, 32, 40, 23, -87, 2, -69, 3, 80, 61, 99, 23, -87, 2, -69, 3, 62, 113, 106, 84, -28, 81, -20}, new byte[]{102, 109, 24, 16, 49, -39, 99, -36}), URLEncoder.encode(str), str2), a()), C0176h.class)).a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        return h.q(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, C0098a.a(new byte[]{29}, new byte[]{44, -27, 116, -70, -75, -118, 18, 8}));
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
