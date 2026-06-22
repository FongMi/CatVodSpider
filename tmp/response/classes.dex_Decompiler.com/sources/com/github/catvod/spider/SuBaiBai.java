package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import com.github.catvod.spider.merge.p.C0208a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class SuBaiBai extends Spider {
    private static String b;
    private String a;

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{17, -35, -68, -16, -40, -81, -111, -55, 42, -38}, new byte[]{68, -82, -39, -126, -11, -18, -10, -84}), C0098a.a(new byte[]{47, -27, 84, -25, -46, 43, -59, -103, 87, -92, 30, -82, -106, 46, -12, -34, 13, -28, 75, -75, -98, 4, -12, -29, 66, -29, 126, -26, -47, 41, -63, -106, 45, -39, 14, -65, -115, 24, -106, -23, 81, -86, 66, -25, -43, 34, -124, -5, 3, -23, 14, -63, -19, 103, -4, -97, 66, -53, 94, -2, -46, 34, -13, -45, 0, -63, 71, -6, -111, 114, -105, -127, 76, -71, 24, -82, -98, 111, -17, -2, 54, -57, 98, -94, -98, 43, -51, -35, 7, -86, 105, -21, -35, 44, -53, -97, 66, -36, 75, -4, -51, 46, -53, -40, 77, -69, 29, -96, -114, 103, -23, -39, 0, -29, 66, -21, -111, 118, -111, -13, 83, -66, 22, -82, -19, 38, -62, -41, 16, -29, 1, -69, -115, 112, -118, -123, 84}, new byte[]{98, -118, 46, -114, -66, 71, -92, -74}));
        map.put(C0098a.a(new byte[]{123, 40, -16, 122, 57, -114, -30, 69, 91, 37, -12, 106, 40, -99, -86}, new byte[]{58, 75, -109, 31, 73, -6, -49, 9}), C0098a.a(new byte[]{-29, 55, -7, 46, 39, 121, -31, 41, -94, 46, -23, 93, 71, 108}, new byte[]{-103, 95, -44, 109, 105, 85, -101, 65}));
        map.put(C0098a.a(new byte[]{4, -24, -46, 115, 23, 91, -15, -79, 40, -96, -28, 59, 49, 71, -32, -86}, new byte[]{92, -59, -128, 22, 102, 46, -108, -62}), C0098a.a(new byte[]{-99, 77, -31, 117, 8, -11, 121, -34, -96, 113, -40, 78, 25, -11}, new byte[]{-59, 0, -83, 61, 124, -127, 9, -116}));
        if (!TextUtils.isEmpty(this.a)) {
            map.put(C0098a.a(new byte[]{-113, -49, -101, -107, -107, -80}, new byte[]{-52, -96, -12, -2, -4, -43, -11, 75}), this.a);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = b + String.format(C0098a.a(new byte[]{54, -32, 13, 79, 8, 19, -2, 23, 54, -32, 13}, new byte[]{25, -59, 126, 96, 120, 114, -103, 114}), str, str2);
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{32, -29, -26, 52, -6, 100, 103}, new byte[]{114, -122, -128, 81, -120, 1, 21, 13}), str3);
        h hVarE = l.e(C0197c.l(str3, mapA));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-17, -120, 93, 36, 124, -65, -122, 118, -91, -59, 10, 91, 103, -74, -7, 35, -31, -119, 93}, new byte[]{-63, -27, 52, 123, 18, -38, -39, 29}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{86}, new byte[]{55, 9, -115, -7, 110, 78, -79, -92})).a(C0098a.a(new byte[]{51, -80, 120, 126}, new byte[]{91, -62, 29, 24, -18, -112, 109, 103})).replaceAll(C0098a.a(new byte[]{97, 24, 12}, new byte[]{61, 92, 39, -103, 46, 19, -50, 71}), ""), y.b(new byte[]{15, -1, -56, 39, -47, -34}, new byte[]{33, -101, -79, 83, -72, -86, -68, -112}, mVar), mVar.o0(C0098a.a(new byte[]{78, 35, 73}, new byte[]{39, 78, 46, -53, 56, 24, 71, -94})).a(C0098a.a(new byte[]{104, 72, 37, 89, -70, 87, -19, -79, 107, 64, 63, 89, -5}, new byte[]{12, 41, 81, 56, -105, 56, -97, -40})), y.b(new byte[]{-18, 8, 127, -81, 125}, new byte[]{-64, 98, 22, -53, 20, -109, -40, 39}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(C0098a.a(new byte[]{-66, 118, -83, -104, -80, -75, 1}, new byte[]{-111, 27, -62, -18, -39, -48, 46, 124}));
        sb.append(list.get(0));
        String strB = C0133t.b(new byte[]{2, 45, -20, 81, -116}, new byte[]{44, 69, -104, 60, -32, 18, 102, -80}, sb);
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{-34, 124, -76, -98, -51, 16, 109}, new byte[]{-116, 25, -46, -5, -65, 117, 31, -56}), strB);
        h hVarE = l.e(C0197c.l(strB, mapA));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{109, 0, 111, -48, 9, 5, 47, -81, 48, 4, 81, -34, 4, 52, 99, -89}, new byte[]{67, 112, 14, -68, 112, 90, 67, -58}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            String strC = mVar.c(C0098a.a(new byte[]{44, 106, 15, 104}, new byte[]{68, 24, 106, 14, 111, 91, -38, 64}));
            String strV0 = mVar.v0();
            String strSubstring = strC.substring(strC.indexOf(C0098a.a(new byte[]{-99, -18, 116, 72, 58, 26, -52}, new byte[]{-78, -104, 43, 56, 86, 123, -75, -125})));
            StringBuilder sbC = C0133t.c(strV0);
            sbC.append(C0098a.a(new byte[]{-71}, new byte[]{-99, 108, 53, 15, 93, -3, 8, 23}));
            sbC.append(strSubstring);
            arrayList.add(sbC.toString());
        }
        String strJoin = TextUtils.join(C0098a.a(new byte[]{75, -100, -53}, new byte[]{111, -72, -17, 105, -32, -115, -104, -86}), Collections.singletonList(TextUtils.join(C0098a.a(new byte[]{-41}, new byte[]{-12, 0, -82, -45, -77, -93, -64, -93}), arrayList)));
        String strA = i.a(new byte[]{105, 59, 122, -109, -56, 69, -85, -3, 34, 55, 124, -119, -2, 84, -69}, new byte[]{71, 86, 21, -27, -95, 32, -49, -119}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{-126, 89, -48, -54, -14, 124}, new byte[]{-84, 61, -87, -93, -97, 27, -109, 26})).a(C0098a.a(new byte[]{-6, 99, -13}, new byte[]{-119, 17, -112, 107, -127, -3, 84, -25}));
        String str = C0098a.a(new byte[]{-75, -115, 30, 38, -20, 96, -3, -54, -29, -33, 46, 126, -118, 72, -80, -94, -49, -104, 75, 74, -1, 50, -109, -46, -76, -66, 5, -1, -121, 116, -94, -91, -39, -125, 74, 94, -41, 63, -86, -31, -70, -101, 43, 44, -51, 74, -16, -7, -19, -39, 60, 79, -116, 91, -98, -93, -46, -73, 74, 107, -17, 63, -82, -53, 104}, new byte[]{82, 60, -83, -59, 111, -37, 21, 64}) + hVarE.o0(C0098a.a(new byte[]{112, -79, 68, 114, 85, -31, -128, 99, 59, -80, 64}, new byte[]{94, -56, 52, 45, 54, -114, -18, 23})).h();
        Iterator itD2 = C0133t.d(new byte[]{104, 92, 15, -94, 14, 60, 45, -54, 35, 80, 9, -72, 56, 53, 32, -51, 50, 17, 12, -67}, new byte[]{70, 49, 96, -44, 103, 89, 73, -66}, hVarE);
        String strB2 = "";
        String strB3 = "";
        String strB4 = strB3;
        String strB5 = strB4;
        String strB6 = strB5;
        while (itD2.hasNext()) {
            m mVar2 = (m) itD2.next();
            String strV02 = mVar2.v0();
            if (strV02.startsWith(C0098a.a(new byte[]{100, -116, 31, 87, 70, -35, 56, -64, 25}, new byte[]{-125, 61, -92, -78, -40, 86, -41, 124}))) {
                strB6 = y.b(new byte[]{-104}, new byte[]{-7, 104, 112, 25, 29, -39, -115, -72}, mVar2);
            } else if (strV02.startsWith(C0098a.a(new byte[]{-87, 89, -31, -1, 46, 50, 56, 68, -42}, new byte[]{76, -59, 81, 26, -94, -120, -41, -8}))) {
                strB3 = y.b(new byte[]{21}, new byte[]{116, -75, 71, 17, 54, -26, 109, -120}, mVar2);
            } else if (strV02.startsWith(C0098a.a(new byte[]{-66, 110, -107, 13, 14, -20, 105, 123, -63}, new byte[]{91, -41, 33, -23, -75, 81, -122, -57}))) {
                strB2 = y.b(new byte[]{-97}, new byte[]{-2, 95, 3, 76, 50, -110, -39, -112}, mVar2);
            } else if (strV02.startsWith(C0098a.a(new byte[]{20, 122, -94, 68, 79, -50, 41, 11, 107}, new byte[]{-15, -43, 30, -94, -13, 90, -58, -73}))) {
                strB5 = y.b(new byte[]{-18}, new byte[]{-113, 28, 106, 26, 21, 126, 112, -80}, mVar2);
            } else if (strV02.startsWith(C0098a.a(new byte[]{-59, 62, 90, -22, 41, -86, -46, 83, -69}, new byte[]{33, -122, -31, 12, -107, 62, 61, -17}))) {
                strB4 = y.b(new byte[]{-52}, new byte[]{-83, -17, -59, 71, 115, 80, -15, -92}, mVar2);
            }
        }
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA2);
        kVar.n(strB2);
        kVar.h(strA);
        kVar.d(strB3);
        kVar.c(strB4);
        kVar.e(str);
        kVar.f(strB5);
        kVar.b(strB6);
        kVar.j(C0098a.a(new byte[]{95, -106, 66, 91, 75, -71, -65, 105, 23, -20, 126, 2}, new byte[]{-70, 10, -22, -68, -15, 6, 89, -5}));
        kVar.k(strJoin);
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{89, -68, 108, 89, 96, 96, -33}, new byte[]{11, -39, 10, 60, 18, 5, -83, 67}), b);
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i = 1;
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-11, -115, -76, -119, 19, 18, 60, 10, -2}, new byte[]{-101, -24, -61, -92, 126, 125, 74, 99}), C0098a.a(new byte[]{75, -5, 84, -60, -51, 83, -85, -92}, new byte[]{63, -115, 121, -96, -65, 50, -58, -59}), C0098a.a(new byte[]{54, -76, -62, 15, -35, -55, -26, 20, 54}, new byte[]{94, -37, -74, 34, -80, -90, -120, 96}), C0098a.a(new byte[]{-22, 88, 113, -11, -9, 1, 9, 6, -21, 84}, new byte[]{-126, 49, 22, -99, -38, 108, 102, 112}), C0098a.a(new byte[]{-25, 18, -128, -29, 104, 116, -128, 101, -23, 28, -124, -2, 98}, new byte[]{-124, 115, -14, -105, 7, 27, -18, 72}), C0098a.a(new byte[]{-84, 120, -56, -60, 58, 101, -79, -125, -23, 122, -55, -43, 56, 111}, new byte[]{-60, 23, -90, -93, 81, 10, -33, -28}), C0098a.a(new byte[]{-102, -96, -105, 61, 101, 95, 19, -69, -45, -85, -120, 57, 123, 74}, new byte[]{-2, -49, -6, 88, 22, 43, 122, -40}), C0098a.a(new byte[]{113, -29, -4, -31, 27, -97, -2, 60, 61, -22, -21, -14, 31, -99}, new byte[]{16, -114, -103, -109, 114, -4, -97, 82}), C0098a.a(new byte[]{-63, 88, 127, -4, 5, -66, -30, -66, -40, 86, 96, -8}, new byte[]{-86, 55, 13, -103, 100, -48, -49, -38}), C0098a.a(new byte[]{24, -3, -79, -12, 44, -34, -10, -124, 24, -2, -71}, new byte[]{121, -109, -40, -103, 73, -13, -110, -10}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{-30, -53, 103, 37, -31, 3}, new byte[]{5, 95, -46, -64, 92, -78, -79, 24}), C0098a.a(new byte[]{41, -103, 57, 35, 5, 50, 122, 1, 105}, new byte[]{-50, 13, -116, -53, -94, -76, -97, -120}), C0098a.a(new byte[]{60, 102, -128, 108, -56, -63, -11, -20, 110, 0, -112, 52}, new byte[]{-37, -27, 45, -123, 95, 105, 18, 120}), C0098a.a(new byte[]{-29, -123, -125, 68, 85, -93, -38, 122, -65, -53, -90, 16}, new byte[]{10, 46, 27, -95, -35, 37, 61, -18}), C0098a.a(new byte[]{-90, -72, 44, -29, 74, -84, -5, 90, -10, -41, 57, -76}, new byte[]{67, 50, -124, 5, -10, 7, 28, -50}), C0098a.a(new byte[]{-68, -115, -81, -30, -104, 4, -61, 8, -32, -50, -117, -75}, new byte[]{85, 43, 54, 4, 32, -85, 36, -100}), C0098a.a(new byte[]{89, -40, -49, 14, -119, -64, -63, -10, 27}, new byte[]{-68, 67, 114, -22, 51, 103, 36, 127}), C0098a.a(new byte[]{-87, 61, -76, -9, 68, -119, -50, -124, -24}, new byte[]{79, -111, 19, 16, -6, 7, 43, 13}), C0098a.a(new byte[]{-115, -128, -66, -17, 52, -97}, new byte[]{100, 31, 23, 10, -67, 56, 109, -18}), C0098a.a(new byte[]{-80, -37, -107, -82, -3, -61, 123, -18, -14}, new byte[]{85, 81, 61, 72, 65, 104, -98, 103}));
        for (int i2 = 0; i2 < listAsList.size(); i2++) {
            arrayList.add(new C0135a((String) listAsList.get(i2), (String) listAsList2.get(i2)));
        }
        C0199e c0199eB = C0197c.b(b, mapA);
        List<String> list = c0199eB.c().get(C0098a.a(new byte[]{53, 46, -103, -70, -123, 14, -52, -72, 47, 46}, new byte[]{70, 75, -19, -105, -26, 97, -93, -45}));
        if (!v.c(list) && !list.isEmpty()) {
            this.a = list.get(0);
        }
        h hVarE = l.e(c0199eB.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-2, 41, -75, -35, 24, 74, -1, -38, -66, 100, -14, -32, 14, 97, -11, -40, -73, 100, -30, -94, 15, 82, -68, -117, -16, 40, -75}, new byte[]{-48, 68, -36, -126, 122, 62, -100, -75}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList2.size() > 11) {
                break;
            }
            byte[] bArr = new byte[i];
            bArr[c] = -106;
            j.a(mVar.o0(C0098a.a(bArr, new byte[]{-9, -42, 63, 70, -60, 36, -87, -46})).a(C0098a.a(new byte[]{66, 65, -73, -48}, new byte[]{42, 51, -46, -74, 80, -20, -101, 25})).replaceAll(C0098a.a(new byte[]{-73, 116, 66}, new byte[]{-21, 48, 105, 98, 83, 33, 37, -96}), ""), y.b(new byte[]{-51, 122, 6, -52, 3, -58}, new byte[]{-29, 30, 127, -72, 106, -78, 57, -120}, mVar), mVar.o0(C0098a.a(new byte[]{-8, 75, 93}, new byte[]{-111, 38, 58, 92, 47, -51, -77, -117})).a(C0098a.a(new byte[]{-54, -48, 49, 11, -114, 121, -38, 56, -55, -40, 43, 11, -49}, new byte[]{-82, -79, 69, 106, -93, 22, -88, 81})), y.b(new byte[]{-115, 107, 65, -46, -11}, new byte[]{-93, 1, 40, -74, -100, -82, 10, 51}, mVar), arrayList2);
            c = 0;
            i = 1;
        }
        return com.github.catvod.spider.merge.c.h.t(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = b + str2;
            HashMap<String, String> mapA = a();
            mapA.put(C0098a.a(new byte[]{91, -10, 84, 120, 71, 33, -52}, new byte[]{9, -109, 50, 29, 53, 68, -66, 27}), str3);
            Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-33, -95, 83, -5, 15, 29, -82, -31, -11, -109, 10, -4, 26, 2, -73, -25, -125, -80, 64, -89, 86, 69, -48, -31, -117, -24, 125, -122, 14, 9, -82, -107, -128, -18, 11, -91, 68, 82, -1, -84, -11, -24, 9, -119, 118, 11, -91, -107, -128}, new byte[]{-87, -64, 33, -43, 37, 32, -116, -55})).matcher(C0197c.l(str3, mapA));
            if (matcher.find()) {
                Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{-128, 1, -73, -88, 97, -98, 65, 8, -87, 32, -16, -83, 104, -98, 65}, new byte[]{-11, 115, -37, -110, 65, -62, 99, 32})).matcher(C0208a.b(matcher.group(1), matcher.group(2), matcher.group(3)));
                if (matcher2.find()) {
                    String strGroup = matcher2.group(1);
                    com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
                    hVar.y(strGroup);
                    hVar.f(a());
                    return hVar.toString();
                }
            }
        } catch (Exception unused) {
        }
        com.github.catvod.spider.merge.c.h hVar2 = new com.github.catvod.spider.merge.c.h();
        hVar2.y(b + str2);
        hVar2.l();
        hVar2.f(a());
        return hVar2.toString();
    }

    public String searchContent(String str, boolean z) {
        String str2 = b + C0098a.a(new byte[]{22, -19, 4, -83, -96, 74, 77, -57, 72, -93}, new byte[]{57, -98, 97, -52, -46, 41, 37, -8}) + URLEncoder.encode(str);
        HashMap<String, String> mapA = a();
        mapA.put(C0098a.a(new byte[]{118, 110, 35, 86, 90, -100, -116}, new byte[]{36, 11, 69, 51, 40, -7, -2, -58}), str2);
        h hVarE = l.e(C0197c.l(str2, mapA));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{49, 119, -102, -116, 111, 61, 46, -56, 115, 109, -116, -103, 61, 96, 102, -30, 115, 36, -63, -51, 113, 55}, new byte[]{31, 4, -1, -19, 29, 94, 70, -105}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{-82}, new byte[]{-49, 117, -57, -128, 122, 68, -92, 125})).a(C0098a.a(new byte[]{-101, 88, 92, 39}, new byte[]{-13, 42, 57, 65, -84, 39, 109, -80})).replaceAll(C0098a.a(new byte[]{48, -16, 44}, new byte[]{108, -76, 7, 20, 58, -107, 76, -7}), ""), y.b(new byte[]{-115, 79, -12, 93, 34, 50}, new byte[]{-93, 43, -115, 41, 75, 70, 48, 59}, mVar), mVar.o0(C0098a.a(new byte[]{126, -115, -26}, new byte[]{23, -32, -127, 75, 41, 67, -55, 32})).a(C0098a.a(new byte[]{36, 46, -73, -48, -9, -74, -92, 56, 39, 38, -83, -48, -74}, new byte[]{64, 79, -61, -79, -38, -39, -42, 81})), y.b(new byte[]{31, 17, 44, 80, -6}, new byte[]{49, 123, 69, 52, -109, 70, 83, -111}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
