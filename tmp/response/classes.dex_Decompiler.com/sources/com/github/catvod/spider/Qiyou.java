package com.github.catvod.spider;

import android.content.Context;
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
import com.github.catvod.spider.merge.o.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Qiyou extends Spider {
    private static String a = C0098a.a(new byte[]{-26, -98, -53, -66, -7, 24, -127, 98, -7, -99, -111, -65, -86, 78, -63, 96, -22, -109, -114, -32, -96, 88, -61}, new byte[]{-114, -22, -65, -50, -61, 55, -82, 21});

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{97, 113, 29, 79, 90, 116, 33, -81, 90, 118}, new byte[]{52, 2, 120, 61, 119, 53, 70, -54}), C0098a.a(new byte[]{100, 112, 95, 62, -97, -72, 77, 52, 28, 49, 21, 119, -37, -125, 69, 117, 77, 112, 82, 36, -45, -102, 120, 59, 24, 47, 11, 103, -56, -12, 123, 114, 71, 41, 17, 108, -45, -84, 26, 47, 0, 63, 100, 39, -125, -72, 73, 76, 76, 125, 110, 62, -121, -5, 25, 40, 30, 49, 22, 97, -45, -4, 103, 83, 125, 82, 105, 123, -45, -72, 69, 112, 76, 63, 98, 50, -112, -65, 67, 50, 9, 92, 77, 37, -100, -71, 73, 52, 24, 46, 18, 121, -61, -6, 28, 53, 25, 63, 118, 54, -107, -75, 94, 114, 6, 42, 22, 96, -35, -25, 26}, new byte[]{41, 31, 37, 87, -13, -44, 44, 27}));
        map.put(C0098a.a(new byte[]{24, 85, -47, 85, -79, -40, 29}, new byte[]{74, 48, -73, 48, -61, -67, 111, 34}), a);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        h hVarE = l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-10, 39, -20, -90, -110, 51, -125, 66, -122, 110, -10, -5, -114, 104, -53, 93}, new byte[]{-39, 75, -123, -43, -26, 28, -90, 49}), str, str2), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{72, 92, -88, -92, 68, -62, -114, 52, 2, 67, -75, -94, 89, -80, -89, 57, 9, 87}, new byte[]{102, 47, -36, -47, 45, -17, -8, 91}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(a + mVar.o0(C0098a.a(new byte[]{-12}, new byte[]{-107, 27, -90, -42, -81, -17, 117, 122})).a(C0098a.a(new byte[]{47, 63, -67, -24}, new byte[]{71, 77, -40, -114, 28, -31, -75, 69})), mVar.o0(C0098a.a(new byte[]{0}, new byte[]{97, -116, 4, 45, 36, 116, 12, 49})).a(C0098a.a(new byte[]{-96, 117, -47, 3, -86}, new byte[]{-44, 28, -91, 111, -49, -70, -38, 51})), mVar.o0(C0098a.a(new byte[]{-66}, new byte[]{-33, 9, -28, 83, -108, 100, 4, 102})).a(C0098a.a(new byte[]{15, 68, 46, -55, 53, 32, -74, 94, 12, 76, 52, -55, 116}, new byte[]{107, 37, 90, -88, 24, 79, -60, 55})), y.b(new byte[]{-5, -95, 34, -55, -118, 57, -69, -109, -95}, new byte[]{-43, -47, 75, -86, -89, 77, -34, -21}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        h hVarE = l.e(C0197c.l(list.get(0), a()));
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{85, -89, 122, 36, -50, 31, -65, -98, 21, -96, 107, 63, -45, 109, -125, -127, 23, -75, 119, 61, -50, 65, -88}, new byte[]{123, -44, 14, 81, -89, 50, -36, -15}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{42, -122, -89, 58, 34, 16, -74, 24, 119, -56, -86, 37}, new byte[]{4, -24, -58, 76, 15, 100, -41, 122}));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < c0074gO0.size(); i++) {
            sb2.append(c0074gO02.get(i).v0());
            sb2.append(C0098a.a(new byte[]{75, 93, 17}, new byte[]{111, 121, 53, 54, -118, 23, -102, 41}));
            C0074g c0074gO03 = c0074gO0.get(i).o0(C0098a.a(new byte[]{-37}, new byte[]{-70, -51, 16, 83, -69, 17, 107, -20}));
            int i2 = 0;
            while (i2 < c0074gO03.size()) {
                m mVar = c0074gO03.get(i2);
                String strC = mVar.c(C0098a.a(new byte[]{-125, 26, 73, 69}, new byte[]{-21, 104, 44, 35, 56, -83, 35, 94}));
                sb.append(mVar.v0());
                sb.append(C0098a.a(new byte[]{95}, new byte[]{123, 34, 70, -10, -32, 74, -3, -44}));
                sb.append(strC);
                sb.append(i2 < c0074gO03.size() - 1 ? C0098a.a(new byte[]{104}, new byte[]{75, -72, 113, 22, -60, -121, 38, -77}) : C0098a.a(new byte[]{-10, -104, 16}, new byte[]{-46, -68, 52, 84, 127, -79, 83, -103}));
                i2++;
            }
        }
        String strA = i.a(new byte[]{70, 117, 65, 64, 23, -98, 69, 92, 6, 114, 80, 91, 10, -20, 121, 87, 13, 114, 84, 92, 18, -109, 24, 19, 0, 55}, new byte[]{104, 6, 53, 53, 126, -77, 38, 51}, hVarE);
        String strA2 = hVarE.o0(C0098a.a(new byte[]{-39, 30, -123, -27, -19, -28, 103, -95, -109, 1, -104, -29, -16, -106, 78, -70, -97, 24, -100, -14}, new byte[]{-9, 109, -15, -112, -124, -55, 17, -50})).a(C0098a.a(new byte[]{57, 104, -102, -39, 47, 33, 61, -100, 58, 96, -128, -39, 110}, new byte[]{93, 9, -18, -72, 2, 78, 79, -11}));
        String strReplace = i.a(new byte[]{-95, -112, -11, 110, 11, 112, 92, 74, -24, -102, -20, 46, 12, 97, 71, 87, -102, -90, -25, 37, 12, 101, 64, 79, -27, -57, -93, 48, 66, 106, 93, 75, -24, -102, -21, 41, 20, 96, 1, 23, -20}, new byte[]{-59, -7, -125, 64, 120, 4, 41, 35}, hVarE).replace(C0098a.a(new byte[]{77, 50, -43, -88, -89, 48, 47, 18, 50}, new byte[]{-88, -99, 105, 78, 27, -92, -64, -82}), "");
        String strReplace2 = i.a(new byte[]{84, -95, -106, -114, 1, -59, -91, 41, 29, -85, -113, -50, 6, -44, -66, 52, 111, -105, -124, -59, 6, -48, -71, 44, 16, -10, -64, -48, 72, -33, -92, 40, 29, -85, -120, -55, 30, -43, -8, 115, 25}, new byte[]{48, -56, -32, -96, 114, -79, -48, 64}, hVarE).replace(C0098a.a(new byte[]{46, -74, 10, -1, 112, -41, -105, 6, 80}, new byte[]{-54, 14, -79, 25, -52, 67, 120, -70}), "");
        String strReplace3 = i.a(new byte[]{-121, 7, -57, -73, 20, 107, 45, -126, -57, 0, -42, -84, 9, 25, 17, -119, -52, 0, -46, -85, 17, 102, 112, -51, -39, 78, -35, -74, 21, 107, 45, -123, -64, 24, -41, -22, 79, 111}, new byte[]{-87, 116, -77, -62, 125, 70, 78, -19}, hVarE).replace(C0098a.a(new byte[]{-98, 3, -11, -123, -60, -76, 77, 33, -29}, new byte[]{121, -78, 78, 96, 90, 63, -94, -99}), "");
        String strReplace4 = i.a(new byte[]{120, 42, -10, 64, 8, 56, -20, -51, 56, 45, -25, 91, 21, 74, -48, -58, 51, 45, -29, 92, 13, 53, -79, -126, 38, 99, -20, 65, 9, 56, -20, -54, 63, 53, -26, 29, 87, 60}, new byte[]{86, 89, -126, 53, 97, 21, -113, -94}, hVarE).replace(C0098a.a(new byte[]{4, 0, 27, -103, 120, -4, 65, 58, 121}, new byte[]{-29, -82, -101, 125, -61, 119, -82, -122}), "");
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(strA);
        kVar.i(strA2);
        kVar.f(strReplace);
        kVar.c(strReplace2);
        kVar.e(strReplace4);
        kVar.b(strReplace3);
        kVar.j(sb2.toString());
        kVar.k(sb.toString());
        return com.github.catvod.spider.merge.c.h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList(C0098a.a(new byte[]{-94}, new byte[]{-109, -76, 53, -95, 20, 27, 61, -64}), C0098a.a(new byte[]{66}, new byte[]{112, 106, 82, -20, -127, -122, 81, 2}), C0098a.a(new byte[]{79}, new byte[]{124, 78, -76, 94, 20, 93, -82, -91}), C0098a.a(new byte[]{-68}, new byte[]{-120, -27, 72, 127, -5, -9, 76, -118}));
        List listAsList2 = Arrays.asList(C0098a.a(new byte[]{-124, -68, -81, 23, 9, 34}, new byte[]{99, 40, 26, -14, -76, -109, -70, -40}), C0098a.a(new byte[]{77, 116, -122, -100, 61, 116, -102, 65, 2}, new byte[]{-91, -53, 24, 123, -122, -39, 127, -56}), C0098a.a(new byte[]{-74, 86, 16, -81, -10, -22}, new byte[]{83, -36, -72, 73, 74, 65, -105, -107}), C0098a.a(new byte[]{-108, 73, 78, 71, -97, -54}, new byte[]{115, -14, -14, -81, 22, 112, 93, -97}));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0135a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        h hVarE = l.e(C0197c.l(a, a()));
        ArrayList arrayList2 = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-92, 123, -74, -46, 52, 76, -114, -68, -18, 100, -85, -44, 41, 62, -89, -79, -27, 112}, new byte[]{-118, 8, -62, -89, 93, 97, -8, -45}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            if (arrayList2.size() > 11) {
                break;
            }
            j.a(a + mVar.o0(C0098a.a(new byte[]{-81}, new byte[]{-50, -23, -56, 125, -89, 26, 41, 91})).a(C0098a.a(new byte[]{87, 95, 45, -94}, new byte[]{63, 45, 72, -60, 51, 45, 89, -38})), mVar.o0(C0098a.a(new byte[]{-63}, new byte[]{-96, 0, -23, -54, -113, -93, 111, 40})).a(C0098a.a(new byte[]{-53, 12, -36, -69, -114}, new byte[]{-65, 101, -88, -41, -21, -127, -124, -62})), mVar.o0(C0098a.a(new byte[]{37}, new byte[]{68, 90, -107, -33, 67, 2, 4, -51})).a(C0098a.a(new byte[]{-48, 107, 15, 13, 102, -88, 103, -111, -45, 99, 21, 13, 39}, new byte[]{-76, 10, 123, 108, 75, -57, 21, -8})), y.b(new byte[]{-83, 1, 15, -114, 53, -95, 50, 25, -9}, new byte[]{-125, 113, 102, -19, 24, -43, 87, 97}, mVar), arrayList2);
        }
        return com.github.catvod.spider.merge.c.h.t(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{113, 116, -37, -5, 114, -56, -59, 101, 99, 73, -38, -115, 60, -65, -64, 38, 37, 61, -14, -7, 35, -66, -104, 37, 37}, new byte[]{7, 21, -87, -89, 1, -29, -77, 12})).matcher(C0197c.l(l.e(C0197c.l(C0133t.a(new StringBuilder(), a, str2), a())).o0(C0098a.a(new byte[]{-55, -92, -54, -120, 21, 26}, new byte[]{-96, -62, -72, -23, 120, 127, -36, -18})).a(C0098a.a(new byte[]{-18, -31, 29}, new byte[]{-99, -109, 126, -74, 22, -36, -31, 22})), a()));
        String strGroup = matcher.find() ? matcher.group(1) : "";
        com.github.catvod.spider.merge.c.h hVar = new com.github.catvod.spider.merge.c.h();
        hVar.y(strGroup);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        String strB = C0133t.b(new byte[]{89, -9, -30, 104, -33, -21, -11, -34, 6, -20, -9}, new byte[]{118, -124, -121, 9, -83, -120, -99, -16}, sb);
        String strB2 = C0134u.b(new byte[]{45, -88, -55, -86, 18, 49, 0, -102, 44, -87, -107}, new byte[]{94, -51, -88, -40, 113, 89, 119, -11}, new StringBuilder(), str);
        HashMap<String, String> mapA = a();
        OkHttpClient okHttpClientA = C0197c.a();
        Request.Builder builderMethod = new Request.Builder().url(strB).method(C0197c.b, RequestBody.create(MediaType.parse(C0098a.a(new byte[]{11, 22, 113, -115, 11, 30, 98, -123, 3, 9, 111, -50, 26, 80, 116, -122, 29, 75, 103, -114, 16, 16, 46, -124, 24, 10, 100, -113, 1, 18, 103, -108, 14, 93, 33, -126, 10, 28, 113, -126, 15, 18, 60, -76, 54, 59, 46, -55}, new byte[]{106, 102, 1, -31, 98, 125, 3, -15})), strB2));
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            builderMethod.addHeader(entry.getKey(), entry.getValue());
        }
        h hVarE = l.e(okHttpClientA.newCall(builderMethod.build()).execute().body().string());
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{123, -124, -86, -63, 107, -70, -30, 14, 49, -101, -73, -57, 118, -56, -53, 12, 48, -109, -73, -43, 34, -5, -3, 65, 52, -39, -83, -64, 119, -2, -71, 23, 58, -109, -78, -35, 113, -29, -53, 62, 33, -97, -85, -39, 96}, new byte[]{85, -9, -34, -76, 2, -105, -108, 97}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(a + mVar.c(C0098a.a(new byte[]{61, -103, -112, -124}, new byte[]{85, -21, -11, -30, -117, 66, -61, -41})), mVar.c(C0098a.a(new byte[]{-59, 84, 84, 106, -35}, new byte[]{-79, 61, 32, 6, -72, -82, 35, 36})), mVar.c(C0098a.a(new byte[]{-66, 66, -44, 32, -66, 109, -95, 71, -67, 74, -50, 32, -1}, new byte[]{-38, 35, -96, 65, -109, 2, -45, 46})), y.b(new byte[]{-45, 91, 93, -47, -126, 69, 97, 82, -119}, new byte[]{-3, 43, 52, -78, -81, 49, 4, 42}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.c.h.q(arrayList);
    }
}
