package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.b.C0134u;
import com.github.catvod.spider.merge.b.v;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.C0135a;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Wwys extends Spider {
    private static String a;

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{-5, -20, 35, 74, 105, -51, 110, 125, -64, -21}, new byte[]{-82, -97, 70, 56, 68, -116, 9, 24}), C0098a.a(new byte[]{-13, -115, 125, 45, -68, 49, 77, -12, -117, -52, 55, 100, -8, 17, 69, -75, -53, -102, 60, 100, -111, 51, 72, -87, -47, -117, 99, 100, -31, 110, 23, -5, -19, -81, 42, 5, -32, 110, 27, -114, -105, -62, 70, 52, -96, 49, 73, -116, -37, -128, 76, 45, -92, 114, 25, -24, -119, -52, 52, 114, -16, 117, 103, -109, -22, -81, 75, 104, -16, 49, 69, -80, -37, -62, 64, 33, -77, 54, 67, -14, -98, -95, 111, 54, -65, 48, 73, -12, -113, -45, 53, 106, -32, 115, 28, -11, -114, -62, 74, 43, -78, 52, 64, -66, -98, -79, 102, 34, -79, 47, 69, -12, -117, -47, 48, 106, -29, 107, 12, -5, -53, -125, 100, 53}, new byte[]{-66, -30, 7, 68, -48, 93, 44, -37}));
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map.get(C0098a.a(new byte[]{-127, -13, -40, 96, -87, 99}, new byte[]{-30, -110, -84, 5, -32, 7, 121, 71})) != null) {
            str = map.get(C0098a.a(new byte[]{10, 117, 111, -127, -14, 38}, new byte[]{105, 20, 27, -28, -69, 66, 84, 40}));
        }
        Iterator itD = C0133t.d(new byte[]{-7, 75, 31, -77, 53, 31, 24, 33, -69, 80, 9, -76, 124, 91, 93, 18, -66}, new byte[]{-41, 57, 122, -64, 92, 101, 125, 126}, l.e(C0197c.l(a + String.format(C0098a.a(new byte[]{-28, 75, 65, 40, -119, -96, -57, 26, -65, 16, 71, 40, -119, -23, -35, 68, -69, 90, 3, 105, -41, -31, -63, 27, -81, 88, 92, 97, -119, -82, -41, 68, -65, 84, 67, 41, -119, -81, -62, 8, -72, 78, 3, 124, -119, -75, -53, 8, -71, 16, 30, 97, -56, -87, -38, 29, -82, 79, 3, 97, -59, -66, -53, 8, -26, 16, 66, 45, -54, -85, -125, 71, -93, 73, 67, 32}, new byte[]{-53, 61, 46, 76, -92, -52, -82, 105}), str, str2), a())));
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{-106}, new byte[]{-9, 70, 102, -52, 110, -69, -89, -57})).a(C0098a.a(new byte[]{-66, 4, -91, -1}, new byte[]{-42, 118, -64, -103, 48, -46, 112, 41})).replaceAll(C0098a.a(new byte[]{73, -56, 2}, new byte[]{21, -116, 41, -61, 21, 75, 97, 61}), ""), mVar.o0(C0098a.a(new byte[]{-63, -72, -60, 13, -50, 123, 94, 91}, new byte[]{-96, -29, -80, 100, -70, 23, 59, 6})).a(C0098a.a(new byte[]{-39, 99, -49, 51, -54}, new byte[]{-83, 10, -69, 95, -81, 121, 73, -73})), mVar.o0(C0098a.a(new byte[]{-117, -56, -98, 38, -90, -39, 115, 107, -120}, new byte[]{-17, -95, -24, 6, -104, -7, 26, 6})).a(C0098a.a(new byte[]{-124, 38, -108}, new byte[]{-9, 84, -9, 125, -2, -101, 2, -15})), y.b(new byte[]{12, 105, -128, -64, -32, -119, 51, 121, 11, 109, -114, -61}, new byte[]{127, 25, -31, -82, -50, -6, 113, 22}, mVar), arrayList);
        }
        return h.q(arrayList);
    }

    public String detailContent(List<String> list) throws UnsupportedEncodingException {
        String strGroup;
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(a.concat(C0098a.a(new byte[]{78, -61, 11, -111, 32, -77, -114, -73, 0, -36, 8, -40, 100, -77, -58}, new byte[]{97, -75, 100, -11, 13, -41, -21, -61})).concat(list.get(0)).concat(C0098a.a(new byte[]{47, 5, -25, 32, -16}, new byte[]{1, 109, -109, 77, -100, 74, -80, -22})), a()));
        String strDecode = URLDecoder.decode(new String(Base64.getDecoder().decode(C0098a.a(new byte[]{-116, 37, 108, 73, -121, -117, 26, -77, -113, 88, 94, 87, -121, -49, 103, -17, -113, 3, 12, 116, -123, -26, 52, -41, -113, 3, 108, 74, -4, -54, 60, -14, -50, 71, 112, 105, -59, -108, 48, -26, -49, 35, 116, 10, -36, -38, 60, -22, -46, 25, 74, 76, -40, -38, 2, -79, -52, 71, 112, 119, -38, -54, 26, -59, -45, 71, 104, 100, -38, -108, 48, -15, -35, 35, 116, 18, -38, -108, 126, -68, -41, 11, 26, 24}, new byte[]{-70, 108, 39, 37, -77, -65, 85, -124}))), C0098a.a(new byte[]{-29, -7, 54, 74, -125}, new byte[]{-74, -83, 112, 103, -69, -45, -2, 89}));
        String strA = hVarE.o0(C0098a.a(new byte[]{-78, -3, -16, 126, 126, 81, 98, -43, -68, -24, -93, 100, 102, 92, 111, -120, -12, -32, -11, 110, 58, 5, 107}, new byte[]{-100, -119, -103, 10, 18, 52, 66, -21})).a(C0098a.a(new byte[]{-121, 49, 7, -108, -77}, new byte[]{-13, 88, 115, -8, -42, -102, -118, 96}));
        String strA2 = i.a(new byte[]{56, 2, 106, 10, -64, 118, 126, 120, 3, 2, 104, 65, -55, 41, 99, 111, 52, 70, 127, 76, -51, 127, 105, 51, 110, 66, 60, 26, -124, 117, 98, 117, 40, 81, 114, 80, -52, 62, 110, 115, 53, 7, 120, 12, -106, 58}, new byte[]{92, 107, 28, 36, -92, 19, 13, 27}, hVarE);
        String strA3 = hVarE.o0(C0098a.a(new byte[]{43, -114, -9, 94, -54, -18, -32, 67, 37, -64, -74, 88, -107, -83, -4, 79, 40, -99, -2, 80, -61, -89, -96, 22, 44, -34, -88, 25, -58, -82, -17, 29, 107, -118, -2, 20, -52, -85, -31, 75, 97, -42, -89, 16}, new byte[]{5, -2, -106, 57, -81, -61, -120, 39})).a(C0098a.a(new byte[]{-22, 19, 62}, new byte[]{-103, 97, 93, -100, 58, -101, -54, -88}));
        String strA4 = i.a(new byte[]{19, 109, -124, 114, -69, -117, 75, -2, 40, 109, -122, 57, -78, -44, 86, -23, 31, 41, -111, 52, -74, -126, 92, -75, 68, 45, -46, 98, -1, -113}, new byte[]{119, 4, -14, 92, -33, -18, 56, -99}, hVarE);
        StringBuilder sbC = C0133t.c(strDecode);
        sbC.append(hVarE.o0(C0098a.a(new byte[]{-113, -19, -81, -60, -32, 110, 106, 26, -62, -26, -92, -112, -65, 39, 118, 13, -49, -3, -94, -99, -30, 111, 111, 91, -59, -95, -7, -103}, new byte[]{-95, -119, -54, -80, -127, 7, 6, 55})).h());
        String string = sbC.toString();
        String strA5 = i.a(new byte[]{98, -25, 110, 9, -45, 40, -15, 96, 89, -25, 108, 66, -38, 119, -20, 119, 110, -93, 123, 79, -34, 33, -26, 43, 50, -89, 56, 25, -105, 44}, new byte[]{6, -114, 24, 39, -73, 77, -126, 3}, hVarE);
        com.github.catvod.spider.merge.L.h hVarE2 = l.e(C0197c.l(a.concat(C0098a.a(new byte[]{34, -112, 29, 43, -88, 10, 71, -71, 116, -53, 27, 43, -88}, new byte[]{13, -26, 114, 79, -123, 122, 43, -40})).concat(list.get(0)).concat(C0098a.a(new byte[]{108, 12, -119, -21, 24, 95, 92, 124, 52, 18, -42, -71, 27, 6, 5, 127, 45}, new byte[]{65, 127, -5, -120, 53, 110, 113, 18})), a()));
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-2, 38, 16, -93, -61, -85, -2, 112, -82, 96, 91, -89, -5, -2, -52, 55, -70, 96}, new byte[]{-109, 71, 115, -4, -91, -39, -111, 29})).matcher(hVarE2.c0());
        if (matcher.find()) {
            strGroup = matcher.group(1);
            if (strGroup.contains(C0098a.a(new byte[]{36, -58, -111}, new byte[]{0, -30, -75, 115, 21, -85, -74, -39}))) {
                strGroup = strGroup.split(C0098a.a(new byte[]{123, 95, -110, -114, 73, -81}, new byte[]{39, 123, -50, -86, 21, -117, 112, -83}))[1];
            }
        } else {
            strGroup = "";
        }
        Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{-75, 95, 16, -107, -58, -31, 34, 66, -1, 22, 40, -108, -108, -50, 100, 86, -1}, new byte[]{-40, 62, 115, -54, -77, -109, 78, 127})).matcher(hVarE2.c0());
        if (!matcher2.find()) {
            return "";
        }
        String strGroup2 = matcher2.group(1);
        String strA6 = C0098a.a(new byte[]{-99}, new byte[]{-66, 69, -43, -37, -16, -80, 95, -42});
        StringBuilder sb = new StringBuilder();
        v.a(new byte[]{-28}, new byte[]{-104, 37, -5, -92, -92, 70, -24, -74}, sb, strGroup);
        sb.append(C0098a.a(new byte[]{26}, new byte[]{57, -15, 9, -114, 99, 83, -56, -21}));
        String strB = C0134u.b(new byte[]{107}, new byte[]{23, -107, 83, -63, -41, 100, -75, -22}, C0133t.c(strGroup2.replaceAll(strA6, sb.toString())), strGroup);
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA3);
        kVar.h(strA);
        kVar.c(strA4);
        kVar.l(strA2);
        kVar.e(string);
        kVar.f(strA5);
        kVar.j(C0098a.a(new byte[]{82, -8, 18, -120, 100, -35, -91, -51, 26, -126, 46, -47}, new byte[]{-73, 100, -70, 111, -34, 98, 67, 95}));
        kVar.k(strB);
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject(C0098a.a(new byte[]{119, 36, -81, 80, -31, -44, -61, -41, 46, 109, -5, 11, -7, -50, -72, -114, 111, 103, -22, 23, -110, -112, -70, -128, 44, 36, -16, 19, -74, -111, -70, -106, 44, 36, 121, -61, 96, 17, 6, 39, 46, 42, -66, 80, -83, -107, -12, -39, 105, 36, -92, 82, -128, -113, -70, -62, 46, 60, -66, 80, 62, 113, 48, 69, -113, -82, -68, 94, -5, -42, -18, -114, 54, 38, -68, 67, -7, -119, -76, -116, 119, 36, -16, 80, -31, -44, -70, 73, -122, -82, 122, -49, 71, 19, 17, 43, 46, 42, -66, 80, -83, -42, -94, -116, 46, 51, -68, 15, -9, -44, -29, -114, 98, 36, -92, 82, -7, 17, 14, 48, -23, -113, 57, -107, 82, 115, -70, -128, 44, 36, -24, 80, -31, -44, -70, -102, 46, 123, -78, 82, -96, -42, -10, -114, 54, 38, -68, -107, 83, 69, 126, 47, -119, -31, 23, -11, -7, -40, -72, -114, 122, 36, -92, 82, -7, -61, -70, -47, 32, 38, -27, 80, -75, -42, -94, -116, 46, -31, 57, -29, 62, 77, 35, 75, -123, -127, -68, 94, -5, -42, -18, -114, 54, 38, -68, 74, -7, -119, -76, -116, 119, 36, -16, 80, -31, -44, -70, 74, -115, -106, 120, -14, 77, 19, 17, 43, 46, 42, -66, 80, -83, -42, -94, -116, 46, 63, -68, 15, -9, -44, -29, -114, 98, 36, -92, 82, -7, 17, 17, 11, -22, -123, 27, -107, 82, 115, -70, -128, 44, 36, -24, 80, -31, -44, -70, -99, 60, 36, -29, 94, -5, -113, -70, -62, 46, 60, -66, 80, 61, 124, 0, 72, -74, -113, 121, -5, 92, -42, -76, -116, 46, 112, -68, 72, -5, -42, -87, -99, 46, 123, -78, 82, -96, -42, -10, -114, 54, 38, -68, -108, 88, 126, 126, 46, -106, -31, 23, -11, -7, -40, -72, -114, 122, 36, -92, 82, -7, -59, -82, -114, 113, 42, -66, 9, -7, -102, -70, -106, 44, 36, 123, -41, 92, 17, 33, 23, -21, -113, 25, 80, -9, -44, -70, -38, 46, 60, -66, 80, -22, -61, -70, -47, 81, 123, -61, 94, -5, -42, -86, -114, 54, 38, -59, 9, -7, -97, -3, -43, 46, 60, -66, 80, -72, -107, -20, -55, 69, 98, -68, 94, -5, -42, -10, -51, 97, 99, -68, 72, -5, -42, 127, 29, -73, -29, 0, -7, -7, -40, -72, -114, 122, 103, -14, 7, -66, -42, -94, -116, 87, 125, -68, 28, -7, -50, -72, -114, -23, -125, 54, -101, 88, 92, -70, -128, 44, 36, -24, 80, -31, -44, -70, -98, 46, 123, -78, 82, -96, -42, -10, -114, 54, 38, -68, -105, 64, 73, 124, 22, -85, -29, 23, -43, -7, -40, -72, -114, 122, 36, -92, 82, -7, -59, -86, -114, 113, 42, -66, 9, -7, -102, -70, -106, 44, 36, 120, -54, 116, 17, 23, 28, -23, -113, 57, 80, -9, -44, -70, -38, 46, 60, -66, 80, -22, -57, -70, -47, 32, 38, -27, 80, -75, -42, -94, -116, 46, -32, 9, -41, 50, 107, 49, 73, -123, -95, -68, 94, -5, -42, -18, -114, 54, 38, -68, 67, -17, -42, -27, -128, 44, 125, -68, 28, -7, -50, -72, -114, -22, -86, 57, -107, 101, 122, 125, 37, -85, 36, -78, 82, -7, -126, -70, -106, 44, 36, -81, 71, -7, -119, -59, -47, 81, 123}, new byte[]{12, 6, -98, 114, -37, -12, -104, -84}));
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(a, a()));
        Iterator itD = C0133t.d(new byte[]{104, -84, -64, 94, 88, -100, 37, 15, 117, -8, -38, 66, 12, -109, 39, 71, 102, -69, -57, 71, 90, -103, 123, 30, 98, -8, -61, 71}, new byte[]{75, -40, -81, 46, 54, -3, 83, 47}, hVarE);
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            arrayList2.add(new C0135a(mVar.o0(C0098a.a(new byte[]{112}, new byte[]{17, -75, 107, -5, -3, 111, -30, -42})).a(C0098a.a(new byte[]{-5, 49, -79, -88}, new byte[]{-109, 67, -44, -50, -126, 105, -60, -114})).split(C0098a.a(new byte[]{108}, new byte[]{65, -53, -56, 54, 71, -34, -102, -54}))[3], y.b(new byte[]{-125}, new byte[]{-30, -73, -48, -55, 23, 16, 78, 90}, mVar)));
        }
        Iterator itD2 = C0133t.d(new byte[]{32, 87, -113, -111, 11, -24, -32, -47, 62, 93, -120, -33, 12, -13, -26, -46, 48, 90, -123, -119, 6, -81, -67, -42, 115, 12, -52, -127, 11, -15, -76, -111, 39, 90, -63, -122, 10, -18, -30, -101, 123, 0, -59, -59, 23, -21, -96, -115, 54, 65, -123, -97, 7, -40, -30, -106, 32, 70}, new byte[]{83, 50, -20, -27, 98, -121, -114, -1}, hVarE);
        while (itD2.hasNext()) {
            m mVar2 = (m) itD2.next();
            j.a(mVar2.o0(C0098a.a(new byte[]{-26}, new byte[]{-121, -121, 57, 86, 77, -114, 66, -34})).a(C0098a.a(new byte[]{120, 69, -128, 76}, new byte[]{16, 55, -27, 42, -29, -32, 59, -121})).replaceAll(C0098a.a(new byte[]{-84, 32, -47}, new byte[]{-16, 100, -6, -39, -8, 97, 104, -18}), ""), mVar2.o0(C0098a.a(new byte[]{-19}, new byte[]{-116, -30, -74, -20, 14, 116, -63, -29})).a(C0098a.a(new byte[]{-96, 100, 76, -62, -27}, new byte[]{-44, 13, 56, -82, -128, -127, -36, -42})), mVar2.o0(C0098a.a(new byte[]{119, -96, -26, -33, 52, -17, 58, 74, 117, -96, -21, -37, 37}, new byte[]{22, -128, -126, -74, 66, -63, 74, 35})).a(C0098a.a(new byte[]{-68, -35, 25, 123, -21, -113, 7, 106}, new byte[]{-40, -68, 109, 26, -58, -4, 117, 9})), y.b(new byte[]{49, -98, -92, -16, -104, -2, -99, 51, 110, -98, -23, -96, -99, -7, -53, 45, 112, -51, -22, -79, -110}, new byte[]{80, -66, -102, -48, -4, -105, -21, 19}, mVar2), arrayList);
        }
        return h.v(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrSplit = str2.split(C0098a.a(new byte[]{60, -81}, new byte[]{96, -45, 17, -32, -40, -46, -4, 80}));
        int i = 0;
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        v.a(new byte[]{100, 97, -40, 63, 60, -62, -112, -2}, new byte[]{75, 17, -76, 94, 69, -89, -30, -47}, sb, str4);
        Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-63, -114, 16, 67, -67, -87, 2, -102, -115, -43, 84}, new byte[]{-78, -4, 115, 126, -97, -127, 44, -80})).matcher(C0197c.l(C0133t.b(new byte[]{-95, -21, -51}, new byte[]{-113, -127, -66, 66, -121, 123, -4, 110}, sb), a()));
        String strGroup = matcher.find() ? matcher.group(1) : "";
        Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{93, 5, 48, 61, 86, -33, -19, 107, 87, 72, 8, 112, 27, -34, -36, 59, 93, 15, 13, 97, 0, -114, -36, 58, 35, 82, 30, 118, 86, -48, -94, 58, 47, 11, 83, 60, 86, -96, -87}, new byte[]{1, 33, 108, 21, 116, -4, -128, 18})).matcher(C0197c.l(y.a(strGroup, str3), a()));
        String strGroup2 = "";
        String strGroup3 = strGroup2;
        while (matcher2.find()) {
            if (i == 0) {
                strGroup2 = matcher2.group(1);
            } else if (i == 1) {
                strGroup3 = matcher2.group(1);
            }
            i++;
        }
        Matcher matcher3 = Pattern.compile(C0098a.a(new byte[]{-121, -18, 98, -58, 2, -7, 110, -79, -121, -74, 38, -78, 42, -115, 116, -80, -33, -75, 38, -58, 2, -7, 15, -58, -88, -17, 43, -20, 24, -73, 54, -126, -95, -18, 109}, new byte[]{-12, -100, 1, -102, 113, -45, 83, -19})).matcher(C0197c.l(strGroup2, a()));
        Matcher matcher4 = Pattern.compile(C0098a.a(new byte[]{-42, -53, 110, -74, -38, 125, -72, -8, -3, -98, 95, -90, -45, 125}, new byte[]{-93, -71, 2, -116, -6, 90, -112, -93})).matcher(C0197c.l(y.a(matcher3.find() ? matcher3.group(1) : "", str3), a()));
        String strGroup4 = matcher4.find() ? matcher4.group(1) : "";
        if (strGroup4.isEmpty()) {
            Matcher matcher5 = Pattern.compile(C0098a.a(new byte[]{-15, -65, -106, -92, -36, -118, -17, 57, -69, -28, -35}, new byte[]{-124, -51, -6, -103, -5, -94, -63, 19})).matcher(C0197c.l(strGroup3, a()));
            if (matcher5.find()) {
                strGroup4 = matcher5.group(1);
            }
        }
        if (strGroup4.isEmpty()) {
            Matcher matcher6 = Pattern.compile(C0098a.a(new byte[]{97, 21, -115, 47, 66, -6, -109, -98, 43, 78, -58}, new byte[]{20, 103, -31, 18, 101, -46, -67, -76})).matcher(C0197c.l(y.a(strGroup, str3), a()));
            if (matcher6.find()) {
                strGroup4 = matcher6.group(1);
            }
        }
        h hVar = new h();
        hVar.y(strGroup4);
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-38, 27, 14, 36, -69, 59, -13, -120, -118, 11, 79, 110, -6, 8, -10}, new byte[]{-7, 127, 111, 80, -38, 100, -97, -31}, l.e(C0197c.l(a.concat(C0098a.a(new byte[]{-85, -57, 79, -115, 14, -63, -122, -70, -20, -34, 30, -124, 86, -49, -57, -82, -87, -35, 68, -120, 25, -38, -64, -20, -13, -54, 28}, new byte[]{-124, -82, 33, -23, 107, -71, -88, -54})).concat(str), a())));
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            String strA = mVar.o0(C0098a.a(new byte[]{36, 118, 97, -71, 31, -75, 118, 112, 35, 119, 126, -17, 21, -23, 47, 116, 96, 33, 55, -30, 75, -81, 106, 53, 109, 124, 127, -22, 29, -91, 54, 108, 105, 63, 41, -93, 24, -84, 121, 103, 46, 107, 127, -82, 18, -87, 119, 49, 36, 55, 38, -86}, new byte[]{64, 31, 23, -125, 113, -63, 30, 93})).a(C0098a.a(new byte[]{-13, 64, 120, 32, 71, 12, -22, -72}, new byte[]{-105, 33, 12, 65, 106, 127, -104, -37}));
            j.a(mVar.o0(C0098a.a(new byte[]{-11, 97, -93, 72, 48, -103, 65, -31, -14, 96, -68, 30, 58, -59, 24, -27, -79, 54, -11, 19, 100, -125, 93, -92, -68, 107, -67, 27, 50, -119, 1, -3, -72}, new byte[]{-111, 8, -43, 114, 94, -19, 41, -52})).a(C0098a.a(new byte[]{-124, -124, -80, 52}, new byte[]{-20, -10, -43, 82, 96, 69, 21, -17})).replaceAll(C0098a.a(new byte[]{-95, 30, -4}, new byte[]{-3, 90, -41, 124, 31, 3, -74, -105}), ""), y.b(new byte[]{3, -72, -51, -70, 31, 114, -89, 113, 4, -71, -46, -20, 21, 46, -3, 117, 71, -17, -101, -13, 1, 103, -95, 102, 9, -91, -45, -83, 18, 110, -90, 48, 3, -7, -118, -87}, new byte[]{103, -47, -69, -128, 113, 6, -49, 92}, mVar), strA, y.b(new byte[]{18, 66, -53, -9, -63, 98, 44, 18, 21, 67, -44, -95, -53, 62, 118, 22, 86, 21, -99, -66, -33, 119, 42, 5, 24, 95, -43, -32, -52, 126, 45, 83, 18, 3, -114, -28}, new byte[]{118, 43, -67, -51, -81, 22, 68, 63}, mVar), arrayList);
        }
        return h.q(arrayList);
    }
}
