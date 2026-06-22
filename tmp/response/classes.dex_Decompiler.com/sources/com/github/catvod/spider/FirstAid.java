package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class FirstAid extends Spider {
    private final String a = C0098a.a(new byte[]{123, 117, -71, -19, 92, 110, -59, -46, 126, 47, -76, -14, 90, 56, -117, -108, 61, 98, -93}, new byte[]{19, 1, -51, -99, 47, 84, -22, -3});

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-50, -57, 20, -64, -14, 106, -42, 100, -11, -64}, new byte[]{-101, -76, 113, -78, -33, 43, -79, 1}), C0098a.a(new byte[]{-127, 12, 102, -125, -40, -36, -51, 123, -7, 77, 44, -54, -100, -25, -59, 58, -88, 12, 107, -103, -108, -2, -8, 116, -3, 83, 50, -38, -113, -112, -5, 61, -94, 85, 40, -47, -108, -56, -102, 96, -27, 67, 93, -102, -60, -36, -55, 3, -87, 1, 87, -125, -64, -97, -103, 103, -5, 77, 47, -36, -108, -104, -25, 28, -104, 46, 80, -58, -108, -36, -59, 63, -87, 67, 91, -113, -41, -37, -61, 125, -20, 32, 116, -104, -37, -35, -55, 123, -3, 82, 43, -60, -124, -98, -100, 122, -4, 67, 79, -117, -46, -47, -34, 61, -29, 86, 47, -35, -102, -125, -102}, new byte[]{-52, 99, 28, -22, -76, -80, -84, 84}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String[] strArrSplit = str.split(C0098a.a(new byte[]{-127, -104}, new byte[]{-35, -28, -46, -1, -87, 43, -42, -44}));
        String str3 = strArrSplit[0];
        int i = Integer.parseInt(strArrSplit[1]);
        if (map.get(C0098a.a(new byte[]{-42, 64, -85, -7, -20, -70}, new byte[]{-75, 33, -33, -100, -91, -34, -5, 24})) != null) {
            str3 = map.get(C0098a.a(new byte[]{-120, -112, -44, 5, 63, 28}, new byte[]{-21, -15, -96, 96, 118, 120, 108, -121}));
        }
        h hVarE = l.e(C0197c.l(this.a + String.format(C0098a.a(new byte[]{-52, -70, 109}, new byte[]{-29, -97, 30, 76, 74, -77, -105, -6}), str3), a()));
        String str4 = C0098a.a(new byte[]{4, 8, -66, 28, -86, 58}, new byte[]{108, 124, -54, 108, -39, 0, -32, -24}) + hVarE.o0(C0098a.a(new byte[]{14, 45, 61, -80, -33, 55, 67, -49, 16}, new byte[]{32, 79, 81, -33, -68, 92, 114, -1})).d(i).a(C0098a.a(new byte[]{-54, -122, -122}, new byte[]{-71, -12, -27, -82, -51, -60, -88, 107}));
        C0074g c0074gG = hVarE.o0(C0098a.a(new byte[]{-120, 68, -18, -31, -10, -45, -27, 13, -61, 3, -24, -91}, new byte[]{-90, 46, -124, -52, -126, -70, -111, 97})).d(i).g(C0098a.a(new byte[]{116, 25, -86, -126, -96, 45, -84, -114, 105}, new byte[]{90, 117, -61, -15, -44, 0, -50, -4}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gG) {
            arrayList.add(new k(this.a + mVar.o0(C0098a.a(new byte[]{-69}, new byte[]{-38, 57, 7, -51, -63, -41, 21, 79})).a(C0098a.a(new byte[]{-62, 38, 63, 24}, new byte[]{-86, 84, 90, 126, -97, 68, 83, 11})), y.b(new byte[]{-18}, new byte[]{-113, -22, 39, 36, 16, -21, -103, 48}, mVar), str4));
        }
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.k(1, 1, 0, c0074gG.size());
        hVar.A(arrayList);
        return hVar.toString();
    }

    public String detailContent(List<String> list) {
        h hVarE = l.e(C0197c.l(list.get(0), a()));
        String strA = i.a(new byte[]{39, 119, -67, -17, -80, -74, -124, -76, 96, 117, -72, -18, -5, -79, -104, -19, 125, 104, -96, -25, -80}, new byte[]{9, 1, -44, -117, -43, -39, -87, -64}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{-88, -123, -81, -81, 93, -41, 95, 89, -23, -123, -93, -71, 22, -44, 27, 73, -14, -34, -96, -89, 93, -64, 95, 83, -24, -45, -81, -90, 95}, new byte[]{-122, -13, -58, -53, 56, -72, 114, 58})).a(C0098a.a(new byte[]{-77, -75, -46}, new byte[]{-64, -57, -79, 107, -75, -63, 35, 7}));
        String strA3 = i.a(new byte[]{90, 89, 89, -122, -17, 112, 11, -115, 4, 71, 89, -123, -92}, new byte[]{41, 41, 56, -24, -63, 20, 100, -18}, hVarE);
        String strA4 = C0098a.a(new byte[]{121, 102, -42, 96, -92, -45}, new byte[]{-99, -34, 123, -123, 63, 110, 19, -48});
        String strA5 = i.a(new byte[]{-117, 3, -41, 101, -128, -26, 85, -50, -47, 71, -39, 109, -61}, new byte[]{-91, 106, -70, 2, -83, -110, 48, -74}, hVarE);
        String strA6 = hVarE.o0(C0098a.a(new byte[]{-8, 120, 100, 86, 64, 32, -42, 35, -76, 123, 127, 81, 64}, new byte[]{-37, 14, 13, 50, 37, 79, -10, 80})).a(C0098a.a(new byte[]{-105, 14, -114}, new byte[]{-28, 124, -19, -100, -46, 116, -50, -4}));
        if (strA6.isEmpty()) {
            strA6 = hVarE.o0(C0098a.a(new byte[]{-92, -5, 103, 112, 4, -121}, new byte[]{-121, -115, 14, 20, 97, -24, 12, 83})).a(C0098a.a(new byte[]{33, -86, 4}, new byte[]{82, -40, 103, -61, -103, 39, -69, 127}));
        }
        String strB = C0134u.b(new byte[]{69}, new byte[]{97, -67, 79, -49, 125, -51, -8, -120}, C0133t.c(strA), strA6);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA2);
        kVar.h(strA);
        kVar.c(strA3);
        kVar.d(strA4);
        kVar.e(strA5);
        kVar.j(C0098a.a(new byte[]{-65, -63, 76, 109}, new byte[]{-18, -88, 32, 8, 22, -77, -104, -120}));
        kVar.k(strB);
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{47, -41, 104, 111, -98, 26, 73}, new byte[]{69, -66, 2, 6, -21, 102, 121, -28}), C0098a.a(new byte[]{-60, 23, 18, 3, 53, 26, 18}, new byte[]{-82, 126, 120, 106, 64, 102, 35, -43}), C0098a.a(new byte[]{99, -1, -38, -83, 75, 69, 24}, new byte[]{9, -106, -80, -60, 62, 57, 42, -42}), C0098a.a(new byte[]{-13, 125, -3, 64, -84, 125, -98}, new byte[]{-103, 20, -105, 41, -39, 1, -83, -40}), C0098a.a(new byte[]{-15, 119, 64, 121, -3, 34, -44}, new byte[]{-101, 30, 42, 16, -120, 94, -32, 36}), C0098a.a(new byte[]{-98, 86, -87, 97, -15, 17, -95}, new byte[]{-12, 63, -61, 8, -124, 109, -108, 68}), C0098a.a(new byte[]{-80, -72, 126, 93, -110, 78, -55}, new byte[]{-38, -47, 20, 52, -25, 50, -1, 35}), C0098a.a(new byte[]{-28, 114, 90, -80, -65, -60, -68}, new byte[]{-114, 27, 48, -39, -54, -72, -117, -57}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{-95, 92, -61, -40, 112, -58, 45, 115, -57, 52, -27, -125}, new byte[]{71, -36, 102, 62, -27, 87, -53, -7}), C0098a.a(new byte[]{25, 52, -97, 75, -89, 66, 29, -128, 99, 124, -99, 21}, new byte[]{-4, -102, 41, -82, 29, -17, -6, 20}), C0098a.a(new byte[]{-22, -55, -20, 68, 43, -119, 8, 105, -127, -82, -34, 38}, new byte[]{12, 73, 73, -95, -90, 56, -31, -18}), C0098a.a(new byte[]{59, -91, 127, -60, -56, -21, 83, -128, 65, -7, 123, -120}, new byte[]{-34, 29, -57, 44, 111, 106, -75, 13}), C0098a.a(new byte[]{29, -32, 50, 27, 27, 108, -48, -50, 76, -114, 38, 88}, new byte[]{-8, 106, -102, -4, -110, -59, 56, 73}), C0098a.a(new byte[]{103, 1, -127, 16, 81, 26, 104, 17, 36, 82, -93, 103}, new byte[]{-127, -76, 54, -10, -27, -111, -114, -111}), C0098a.a(new byte[]{-43, -16, 50, -102, 69, -126, 88, -119, -108, -82, 10, -19}, new byte[]{49, 72, -97, 124, -22, 16, -66, 9}), C0098a.a(new byte[]{21, -5, -95, -104, -85, 80, -105, -10, 120, -103, -69, -8}, new byte[]{-13, 127, 46, 125, 15, -58, 115, 76}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return com.github.catvod.spider.merge.c.h.t(arrayList, Collections.emptyList());
    }

    public String playerContent(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(str2);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        C0074g c0074gO0 = l.e(C0197c.l(C0098a.a(new byte[]{58, 75, -65, -112, 25, -100, 11, -120, 63, 17, -78, -113, 31, -54, 69, -50, 124, 92, -91, -49, 9, -43, 65, -120, 33, 90, -86, -110, 9, -50, 27, -42, 111}, new byte[]{82, 63, -53, -32, 106, -90, 36, -89}) + URLEncoder.encode(str), a())).o0(C0098a.a(new byte[]{66, 99, -71, -71, -36, 102, 87, -116, 26, 121, -72, -67, -63, 40, 83, -56, 66, 124, -75, -85, -38, 40, 93, -45, 94}, new byte[]{108, 16, -36, -40, -82, 5, 63, -95}));
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074gO0) {
            String str2 = this.a + mVar.o0(C0098a.a(new byte[]{-105}, new byte[]{-10, -75, 22, 47, 43, -77, -10, 103})).a(C0098a.a(new byte[]{12, -9, 110, 16}, new byte[]{100, -123, 11, 118, 8, -120, 18, -84}));
            String strB = y.b(new byte[]{18, -68, 68, -81, -99, 24, -37, -53, 25, -27, 11, -82, -124, 71}, new byte[]{122, -119, 106, -61, -12, 118, -66, -26}, mVar);
            String strA = mVar.o0(C0098a.a(new byte[]{104, -117, -34, 4, 125, 93, 17, -104, 110, -104, -48, 1, 127, 93}, new byte[]{12, -1, -16, 104, 18, 58, 126, -75})).a(C0098a.a(new byte[]{-10, 88, -38}, new byte[]{-123, 42, -71, 80, -101, 103, -76, 64}));
            if (!strA.startsWith(C0098a.a(new byte[]{-41, -55, -119, 113, -10}, new byte[]{-65, -67, -3, 1, -123, 101, 35, 79}))) {
                strA = C0134u.b(new byte[]{-90, 41, 64, 84, -20, -65}, new byte[]{-50, 93, 52, 36, -97, -123, 32, 48}, new StringBuilder(), strA);
            }
            arrayList.add(new k(str2, strB, strA));
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
