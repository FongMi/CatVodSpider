package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.p.C0208a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class FourK extends Spider {
    private static String a = C0098a.a(new byte[]{89, 57, -121, 54, -54, 85, -113, -91, 70, 58, -124, 104, -45, 11, -39, -7, 31, 44, -127, 50}, new byte[]{49, 77, -13, 70, -71, 111, -96, -118});

    private Map<String, String> a() {
        HashMap map = new HashMap();
        map.put(C0098a.a(new byte[]{-17, -95, -23, -80, -82, 114, -81, -69, -44, -90}, new byte[]{-70, -46, -116, -62, -125, 51, -56, -34}), C0098a.a(new byte[]{-25, 89, 35, -104, -44, 61, -21, 19, -97, 24, 105, -47, -112, 6, -29, 82, -50, 89, 46, -126, -104, 31, -34, 28, -101, 6, 119, -63, -125, 113, -35, 85, -60, 0, 109, -54, -104, 41, -68, 8, -125, 22, 24, -127, -56, 61, -17, 107, -49, 84, 18, -104, -52, 126, -65, 15, -99, 24, 106, -57, -104, 121, -63, 116, -2, 123, 21, -35, -104, 61, -29, 87, -49, 22, 30, -108, -37, 58, -27, 21, -118, 117, 49, -125, -41, 60, -17, 19, -101, 7, 110, -33, -120, 127, -70, 18, -102, 22, 10, -112, -34, 48, -8, 85, -123, 3, 106, -58, -106, 98, -68}, new byte[]{-86, 54, 89, -15, -72, 81, -118, 60}));
        map.put(C0098a.a(new byte[]{-30, 84, 68, -44, -76, 87, -33}, new byte[]{-80, 49, 34, -79, -58, 50, -83, -28}), a + C0098a.a(new byte[]{-9}, new byte[]{-40, -25, 109, 34, -128, 111, 31, -49}));
        map.put(C0098a.a(new byte[]{-116, 87, -107, 52, 102, -108, 10, -55, -66}, new byte[]{-33, 50, -10, 25, 37, -4, 39, -100}), C0098a.a(new byte[]{8, 44, 33, -71, -32, -76, -1, 99, 88, 3, 32, -87, -30, -50, -78, 28, 8, 80, 122, -17, -20, -43, -26, 98, 66, 16, 33, -96, -87, -128, -87, 3, 17, 20, 115, -17, -15, -60, -14, 3}, new byte[]{42, 98, 78, -51, -64, -11, -60, 33}));
        map.put(C0098a.a(new byte[]{-57, 4, 57, -33, -46, 64, 68, -40, -11, 76, 23, -99, -13, 65, 5, -24}, new byte[]{-108, 97, 90, -14, -111, 40, 105, -115}), C0098a.a(new byte[]{-122, 17}, new byte[]{-71, 33, 124, -16, -44, -128, -58, 54}));
        map.put(C0098a.a(new byte[]{30, 3, -126, 117, 118, 126, 115, -16, 44, 75, -79, 52, 84, 98, 56, -54, 63, 11}, new byte[]{77, 102, -31, 88, 53, 22, 94, -91}), C0098a.a(new byte[]{-55, -46, -50, 91, 3, -114, 88}, new byte[]{-98, -69, -96, 63, 108, -7, 43, 33}));
        map.put(C0098a.a(new byte[]{117, 40, 58, 9, 78, 127, 69, 14, 85, 37, 62, 25, 95, 108, 13}, new byte[]{52, 75, 89, 108, 62, 11, 104, 66}), C0098a.a(new byte[]{32, -2, 15, -72, 90, -38, 33, -62, 97, -25, 31, -53, 58, -49}, new byte[]{90, -106, 34, -5, 20, -10, 91, -86}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        return h.q(parseVodList(l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-12, 122, 30, 82, 110, -24, -69, 68, -12, 122, 30, 82}, new byte[]{-37, 95, 109, 125, 30, -119, -36, 33}), str, str2), a())).o0(C0098a.a(new byte[]{-67, -110, 102, -109, 20, -90, -104, -126, -77, -47, 109, -72, 40, -96, -101, -111, -77, -63, 47, -71, 27, -23, -56, -42, -1, -106}, new byte[]{-109, -1, 15, -52, 119, -55, -10, -10}))));
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(C0133t.b(new byte[]{35}, new byte[]{12, -106, 98, -24, -51, 103, -32, -44}, sb), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{98, -11, -41, 40, -42, -65, -106, 65, 63, -15, -23, 38, -37, -114, -38, 73}, new byte[]{76, -123, -74, 68, -81, -32, -6, 40}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            String strC = mVar.c(C0098a.a(new byte[]{103, -119, -57, 115}, new byte[]{15, -5, -94, 21, 112, 5, 116, 40}));
            String strV0 = mVar.v0();
            String strSubstring = strC.substring(strC.indexOf(C0098a.a(new byte[]{-20, -84, -7, -108, -84, 108, -17}, new byte[]{-61, -38, -90, -28, -64, 13, -106, -17})));
            StringBuilder sbC = C0133t.c(strV0);
            sbC.append(C0098a.a(new byte[]{-31}, new byte[]{-59, 105, -127, 66, -102, -39, -48, 98}));
            sbC.append(strSubstring);
            arrayList.add(sbC.toString());
        }
        String strJoin = TextUtils.join(C0098a.a(new byte[]{-110, 121, -9}, new byte[]{-74, 93, -45, -17, -36, 21, -96, 42}), Collections.singletonList(TextUtils.join(C0098a.a(new byte[]{115}, new byte[]{80, -33, 116, 101, -91, 88, -104, 29}), arrayList)));
        String strA = i.a(new byte[]{-103, 117, 53, 69, 53, 61, -42, 48, -46, 121, 51, 95, 3, 44, -58, 100, -33, 41}, new byte[]{-73, 24, 90, 51, 92, 88, -78, 68}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{-114, -120, 77, -58, 118, 105, 115, 105, -60, -59, 64, -32, 104, 126, 73, 34, -114, -127, 93, -16, 117, 107, 12, 34, -55, -120, 67}, new byte[]{-96, -27, 36, -103, 24, 12, 44, 2})).a(C0098a.a(new byte[]{-49, -77, 38}, new byte[]{-68, -63, 69, -6, -96, 115, 10, -41}));
        String strReplace = i.a(new byte[]{-17, -126, 56, -37, 98, -84, 116, 7, -2, -102, 115, -41, 100, -74, 66, 14, -13, -99, 98, -106, 97, -77, 39, 12, -18, -122, 59, -43, 101, -77, 113, 6, -78, -37, 63}, new byte[]{-102, -18, 22, -74, 13, -38, 29, 98}, hVarE).replace(C0098a.a(new byte[]{-72, -72, 56, -90, 30, 1, 86, 89, -58}, new byte[]{92, 0, -78, 64, -122, -95, -71, -27}), "");
        String strReplaceAll = i.a(new byte[]{96, -8, 13, -20, 60, -121, -48, 64, 43, -7, 9, -109, 47}, new byte[]{78, -127, 125, -77, 95, -24, -66, 52}, hVarE).replaceAll(C0098a.a(new byte[]{92, -69, 18}, new byte[]{0, -56, 57, 47, 12, -38, 110, -51}), "");
        String strA3 = i.a(new byte[]{12, 21, 6, -14, -71, -106, 103, 92, 29, 13, 77, -2, -65, -116, 81, 85, 16, 10, 92, -65, -70, -119, 52, 87, 13, 17, 5, -4, -66, -119, 98, 93, 81, 72, 1, -65, -73}, new byte[]{121, 121, 40, -97, -42, -32, 14, 57}, hVarE);
        String strA4 = i.a(new byte[]{33, 96, -112, 10, 88, -128, -118, -112, 48, 120, -37, 6, 94, -102, -68, -103, 61, 127, -54, 71, 91, -97, -39, -101, 32, 100, -109, 4, 95, -97, -113, -111, 124, 62, -105, 71, 86}, new byte[]{84, 12, -66, 103, 55, -10, -29, -11}, hVarE);
        String strA5 = i.a(new byte[]{-94, -76, 127, 9, 22, 74, -67, 70, -77, -84, 52, 5, 16, 80, -117, 79, -66, -85, 37, 68, 21, 85, -18, 77, -93, -80, 124, 7, 17, 85, -72, 71, -1, -21, 120, 68, 24}, new byte[]{-41, -40, 81, 100, 121, 60, -44, 35}, hVarE);
        String strA6 = i.a(new byte[]{-55, 77, -117, 94, -100, 15, 95, -106, -40, 85, -64, 82, -102, 21, 105, -97, -43, 82, -47, 19, -97, 16, 12, -99, -56, 73, -120, 80, -101, 16, 90, -105, -108, 25, -116, 19, -110}, new byte[]{-68, 33, -91, 51, -13, 121, 54, -13}, hVarE);
        String strA7 = i.a(new byte[]{-79, -35, -40, -81, 92, 90, -8, -15, -96, -59, -109, -93, 90, 64, -50, -8, -83, -62, -126, -30, 95, 69, -85, -6, -80, -39, -37, -95, 91, 69, -3, -16, -20, -121, -33, -30, 82}, new byte[]{-60, -79, -10, -62, 51, 44, -111, -108}, hVarE);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA2);
        kVar.h(strA);
        kVar.d(strA4);
        kVar.n(strA5);
        kVar.c(strA6);
        kVar.e(strReplaceAll);
        kVar.l(strReplace);
        kVar.f(strA7);
        kVar.b(strA3);
        kVar.j(C0098a.a(new byte[]{-88, -83, 53, -77, -45, 109, 120, -105, -32, -41, 9, -22}, new byte[]{77, 49, -99, 84, 105, -46, -98, 5}));
        kVar.k(strJoin.toString());
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(C0133t.b(new byte[]{115, 18, 106, 84, 65, 105, 34, 8}, new byte[]{92, 115, 9, 32, 40, 6, 76, 39}, sb), a()));
        Iterator itD = C0133t.d(new byte[]{-110, -41, -26, -8, 16, -27, -88, -61, -119, -106, -91, -12, 84, -32, -94, -62, -54, -33, -89, -25, 23, -95, -14, -122, -117, -46, -24, -82, 89, -32}, new byte[]{-25, -69, -56, -112, 121, -127, -52, -90}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList.size() > 8) {
                break;
            }
            String[] strArrSplit = mVar.c(C0098a.a(new byte[]{69, -88, 29, -53}, new byte[]{45, -38, 120, -83, 24, 48, 79, 34})).split(C0098a.a(new byte[]{105}, new byte[]{70, -30, 80, -14, -67, -65, 104, -42}));
            arrayList.add(new C0135a(strArrSplit[strArrSplit.length - 1], mVar.v0()));
        }
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{-61, -96, 70, -26, 120, -37, -127, -41, -51, -29, 77, -51, 68, -35, -126, -60, -51, -13, 15, -52, 119, -108, -47, -125, -127, -92}, new byte[]{-19, -51, 47, -71, 27, -76, -17, -93}));
        return h.t(arrayList, parseVodList(new C0074g(c0074gO0.subList(0, Math.min(c0074gO0.size(), 10)))));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public List<k> parseVodList(C0074g c0074g) {
        ArrayList arrayList = new ArrayList();
        for (m mVar : c0074g) {
            j.a(mVar.o0(C0098a.a(new byte[]{-33}, new byte[]{-66, 19, 93, 105, -11, -55, -49, 50})).a(C0098a.a(new byte[]{-107, 113, 39, 27}, new byte[]{-3, 3, 66, 125, 69, -53, -121, 43})), mVar.o0(C0098a.a(new byte[]{27, 89, -18, -113, -15}, new byte[]{122, 121, -121, -30, -106, 40, -70, -83})).a(C0098a.a(new byte[]{-47, 22, -1}, new byte[]{-80, 122, -117, -47, -22, 119, -101, 97})), mVar.o0(C0098a.a(new byte[]{83, -94, -75}, new byte[]{58, -49, -46, -112, 31, -75, 114, 79})).a(C0098a.a(new byte[]{-38, -124, 36}, new byte[]{-87, -10, 71, 103, -38, -82, 38, -97})), y.b(new byte[]{-67, -86, -68, -42, 2, 91, 55, 124, -94, -69, -92, -47, 66, 89, 33}, new byte[]{-50, -38, -35, -72, 44, 63, 78, 12}, mVar), arrayList);
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Matcher matcher = Pattern.compile(C0098a.a(new byte[]{37, 23, 36, 117, 60, -109, 77, -7, 15, 37, 125, 114, 41, -116, 84, -1, 121, 6, 55, 41, 101, -53, 51, -7, 113, 94, 10, 8, 61, -121, 77, -115, 122, 88, 124, 43, 119, -36, 28, -76, 15, 94, 126, 7, 69, -123, 70, -115, 122}, new byte[]{83, 118, 86, 91, 22, -82, 111, -47})).matcher(C0197c.l(a + str2, a()));
            if (matcher.find()) {
                Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{-51, 58, -93, 77, -56, 8, -89, -44, -28, 27, -28, 72, -63, 8, -89}, new byte[]{-72, 72, -49, 119, -24, 84, -123, -4})).matcher(C0208a.b(matcher.group(1), matcher.group(2), matcher.group(3)));
                if (matcher2.find()) {
                    String strGroup = matcher2.group(1);
                    h hVar = new h();
                    hVar.y(strGroup);
                    hVar.f(a());
                    return hVar.toString();
                }
            }
        } catch (Exception unused) {
        }
        h hVar2 = new h();
        hVar2.y(a + str2);
        hVar2.l();
        hVar2.f(a());
        return hVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(a + C0098a.a(new byte[]{-77, -43, 112, 32}, new byte[]{-100, -22, 3, 29, 8, -29, -68, -110}) + URLEncoder.encode(str), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-51, 14, 55, 75, 93, -79, -7, 49, -113, 20, 33, 94, 15, -20, -79, 27, -113, 93, 108, 10, 67, -69}, new byte[]{-29, 125, 82, 42, 47, -46, -111, 110}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{11}, new byte[]{106, -126, 102, -46, -55, 60, 52, -121})).a(C0098a.a(new byte[]{-107, 111, 91, -13}, new byte[]{-3, 29, 62, -107, 45, 118, 29, 74})), mVar.o0(C0098a.a(new byte[]{52, 52, -84}, new byte[]{93, 89, -53, -59, 40, -70, -55, 124})).a(C0098a.a(new byte[]{-56, 43, 122}, new byte[]{-87, 71, 14, 7, -65, 58, -123, -111})), mVar.o0(C0098a.a(new byte[]{-86, -61, -41, 120, -79}, new byte[]{-53, -29, -66, 21, -42, 96, 84, 40})).a(C0098a.a(new byte[]{19, 113, 100}, new byte[]{96, 3, 7, -66, 19, -119, -95, 9})), y.b(new byte[]{-25, 50, -111, -56, 115, 65, -11, -106, -8, 35, -119, -49, 51, 67, -29}, new byte[]{-108, 66, -16, -90, 93, 37, -116, -26}, mVar), arrayList);
        }
        return h.q(arrayList);
    }
}
