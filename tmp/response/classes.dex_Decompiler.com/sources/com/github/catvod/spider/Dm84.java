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
import com.github.catvod.spider.merge.c.C0136b;
import com.github.catvod.spider.merge.c.C0137c;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.n.C0199e;
import com.github.catvod.spider.merge.o.i;
import com.github.catvod.spider.merge.o.j;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class Dm84 extends Spider {
    private String a;
    private String b;

    private static String a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private C0137c b(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String strReplace : list) {
            if (!strReplace.isEmpty()) {
                String strReplace2 = strReplace.replace(C0098a.a(new byte[]{0, 103, -27}, new byte[]{-26, -21, 108, 102, 1, -128, -113, -128}), "");
                if (str2.equals(C0098a.a(new byte[]{-105, -84}, new byte[]{-11, -43, 57, -22, -55, 106, 113, -110}))) {
                    strReplace = strReplace.replace(C0098a.a(new byte[]{-53, 62, -73, -78, 20, 0, -115, 124, -103}, new byte[]{45, -78, 62, 84, -125, -74, 100, -21}), C0098a.a(new byte[]{-38, 78, 37, -13}, new byte[]{-82, 39, 72, -106, -91, 47, 82, 68})).replace(C0098a.a(new byte[]{100, -100, 68, -103, 66, 120, 94, -117, 22}, new byte[]{-126, 16, -51, 125, -8, -62, -72, 59}), C0098a.a(new byte[]{27, -3, -33, 48}, new byte[]{115, -108, -85, 67, -58, 32, -32, 0})).replace(C0098a.a(new byte[]{-35, -111, -125, -31, -97, -88, 31, 62, -67}, new byte[]{59, 29, 10, 9, 48, 44, -6, -74}), C0098a.a(new byte[]{60, 110, -92, -101, -94}, new byte[]{79, 13, -53, -23, -57, 105, -109, 5}));
                }
                arrayList.add(new C0136b(strReplace2, strReplace));
            }
        }
        return new C0137c(str2, str, arrayList);
    }

    private HashMap<String, String> c() {
        HashMap<String, String> map = new HashMap<>();
        map.put(C0098a.a(new byte[]{101, -43, -34, -68, -7, 28, -120, 107, 94, -46}, new byte[]{48, -90, -69, -50, -44, 93, -17, 14}), C0098a.a(new byte[]{16, 60, -51, -90, 60, 119, 23, -94, 104, 125, -121, -17, 120, 76, 31, -29, 57, 60, -64, -68, 112, 85, 34, -83, 108, 99, -103, -1, 107, 59, 33, -28, 51, 101, -125, -12, 112, 99, 64, -71, 116, 115, -10, -65, 32, 119, 19, -38, 56, 49, -4, -90, 36, 52, 67, -66, 106, 125, -124, -7, 112, 51, 61, -59, 9, 30, -5, -29, 112, 119, 31, -26, 56, 115, -16, -86, 51, 112, 25, -92, 125, 16, -33, -67, 63, 118, 19, -94, 108, 98, -128, -31, 96, 53, 70, -93, 109, 115, -28, -82, 54, 122, 4, -28, 114, 102, -124, -8, 126, 40, 64}, new byte[]{93, 83, -73, -49, 80, 27, 118, -115}));
        map.put(C0098a.a(new byte[]{-71, -74, -10, -39, -25, 6}, new byte[]{-8, -43, -107, -68, -105, 114, -59, 92}), C0098a.a(new byte[]{21, -76, 107, -82, 19, 103, 54, -61, 13, -3, 114, -86, 76, 99, 43, -51, 0, -91, 122, -75, 82, 32, 58, -58, 21, -68, 127, -15, 68, 98, 46, -126, 0, -95, 99, -74, 85, 108, 35, -38, 8, -66, 125, -11, 68, 98, 46, -107, 16, -20, 35, -12, 5, 35, 43, -61, 0, -74, 118, -11, 93, 121, 43, -56, 77, -72, 126, -69, 91, 106, 109, -39, 4, -77, 99, -10, 85, 98, 35, -55, 4, -2, 114, -86, 82, 104, 110, -124, 78, -5, 40, -85, 1, 63, 108, -106, 77, -80, 99, -86, 80, 102, 33, -49, 21, -72, 124, -76, 19, 124, 43, -55, 15, -76, 119, -9, 89, 119, 33, -58, 0, -65, 116, -65, 7, 121, 127, -52, 82, -22, 98, -25, 12, 33, 117}, new byte[]{97, -47, 19, -38, 60, 15, 66, -82}));
        map.put(C0098a.a(new byte[]{-45, 115, 31, -109, 78, -44, 29, 73, -45, 126, 27, -125, 95, -57, 85}, new byte[]{-78, 16, 124, -10, 62, -96, 48, 37}), C0098a.a(new byte[]{-92, 12, -41, 18, -106, -61, -83, -102, -27, 21, -57, 97, -10, -42}, new byte[]{-34, 100, -6, 81, -40, -17, -41, -14}));
        map.put(C0098a.a(new byte[]{117, 59, 21, -72, -89, -97, 4, -35, 78, 115, 35, -26, -124, -120}, new byte[]{38, 94, 118, -107, -31, -6, 112, -66}), C0098a.a(new byte[]{85, 59}, new byte[]{106, 10, 49, 49, -46, 12, -69, 119}));
        map.put(C0098a.a(new byte[]{107, 62, 8, -69, 4, 25, -109, -23, 80, 118, 47, -13, 49, 8}, new byte[]{56, 91, 107, -106, 66, 124, -25, -118}), C0098a.a(new byte[]{68, 116, -13, 54, -65, 73, -108, 75}, new byte[]{32, 27, -112, 67, -46, 44, -6, 63}));
        map.put(C0098a.a(new byte[]{-22, -128, 72, -102, 96, -59, 8, -16, -47, -56, 102, -40, 66, -59}, new byte[]{-71, -27, 43, -73, 38, -96, 124, -109}), C0098a.a(new byte[]{-33, 0, -123, 95, 23, -7, 16, -88}, new byte[]{-79, 97, -13, 54, 112, -104, 100, -51}));
        map.put(C0098a.a(new byte[]{-37, -10, -40, 0, -53, 26, -125, 40, -32, -66, -24, 68, -7, 26}, new byte[]{-120, -109, -69, 45, -115, 127, -9, 75}), C0098a.a(new byte[]{102, -43, -91, -13}, new byte[]{8, -70, -53, -106, -102, -79, 75, -16}));
        if (!TextUtils.isEmpty(this.b)) {
            map.put(C0098a.a(new byte[]{-31, -53, 115, -92, 7, 52}, new byte[]{-94, -92, 28, -49, 110, 81, 92, 84}), this.b);
        }
        return map;
    }

    private String d(String str, String str2, Map<String, String> map) {
        try {
            OkHttpClient okHttpClientBuild = new OkHttpClient().newBuilder().build();
            Request.Builder builderMethod = new Request.Builder().url(str).method(C0098a.a(new byte[]{-88, -38, -79, 100}, new byte[]{-8, -107, -30, 48, -46, -18, 119, -37}), RequestBody.create(MediaType.parse(C0098a.a(new byte[]{1, 31, 110, -113, 25, 4, 33, 67, 9, 0, 112, -52, 8, 74, 55, 64, 23, 66, 120, -116, 2, 10, 109, 66, 18, 3, 123, -115, 19, 8, 36, 82, 4, 84, 62, -128, 24, 6, 50, 68, 5, 27, 35, -74, 36, 33, 109, 15}, new byte[]{96, 111, 30, -29, 112, 103, 64, 55})), str2));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderMethod.addHeader(entry.getKey(), entry.getValue());
            }
            return new JSONObject(okHttpClientBuild.newCall(builderMethod.build()).execute().body().string()).getString(C0098a.a(new byte[]{56, -108, 126}, new byte[]{77, -26, 18, 76, 74, 60, -4, 123}));
        } catch (Exception unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map.get(C0098a.a(new byte[]{7, 50, -104, 10}, new byte[]{115, 75, -24, 111, 105, -97, -16, 10})) == null) {
            map.put(C0098a.a(new byte[]{-85, 18, -95, 119}, new byte[]{-33, 107, -47, 18, 32, -71, -92, 99}), "");
        }
        if (map.get(C0098a.a(new byte[]{-94, -113, 91, 24}, new byte[]{-37, -22, 58, 106, 55, 94, -19, -2})) == null) {
            map.put(C0098a.a(new byte[]{0, 108, 81, -16}, new byte[]{121, 9, 48, -126, -123, 106, -18, -101}), "");
        }
        if (map.get(C0098a.a(new byte[]{-75, -84}, new byte[]{-41, -43, 19, -53, 7, -125, -108, 104})) == null) {
            map.put(C0098a.a(new byte[]{63, -87}, new byte[]{93, -48, 81, -84, -87, 33, 78, 1}), C0098a.a(new byte[]{-90, 29, 64, 121}, new byte[]{-46, 116, 45, 28, -100, -55, 112, -40}));
        }
        Iterator itD = C0133t.d(new byte[]{76, 103, 8, 119, -8, 26, 62, -62}, new byte[]{40, 14, 126, 89, -111, 110, 91, -81}, l.e(C0197c.l(this.a + String.format(C0098a.a(new byte[]{-23, -107, 115, 61, -101, -9, 90, -69, -21, -53, 62, 33, -63, -1, 12, -27, -21, -61, 104, 127, -55, -87, 81, -96, -78, -117, 119}, new byte[]{-58, -26, 27, 82, -20, -38, 127, -56}), str, map.get(C0098a.a(new byte[]{110, -28}, new byte[]{12, -99, 74, 1, -86, 23, -56, 70})), URLEncoder.encode(map.get(C0098a.a(new byte[]{14, -64, -104, 108}, new byte[]{122, -71, -24, 9, 25, 103, 71, 122}))), map.get(C0098a.a(new byte[]{-108, -75, 32, 56}, new byte[]{-19, -48, 65, 74, 104, -52, 2, 62})), str2), c())));
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{110, -33, -89, 44, 3, -14, -98}, new byte[]{15, -15, -45, 69, 119, -98, -5, -100})).a(C0098a.a(new byte[]{-121, 10, 45, 55}, new byte[]{-17, 120, 72, 81, 105, 60, -114, -128})).split(C0098a.a(new byte[]{-31}, new byte[]{-50, 79, -39, 32, 85, 96, -15, 114}))[2], y.b(new byte[]{-122, -71, 9, 52, 92, -23, 9}, new byte[]{-25, -105, 125, 93, 40, -123, 108, -63}, mVar), mVar.o0(C0098a.a(new byte[]{-44, -57, -79, -36, -37, -13, -70}, new byte[]{-75, -23, -46, -77, -83, -106, -56, 83})).a(C0098a.a(new byte[]{-62, 71, 4, 74, -36, 25, -28}, new byte[]{-90, 38, 112, 43, -15, 123, -125, 79})), y.b(new byte[]{89, -54, -21, -95, 99, 70, 116, -4, 73}, new byte[]{42, -70, -118, -49, 77, 34, 17, -113}, mVar), arrayList);
        }
        return h.q(arrayList);
    }

    public String detailContent(List<String> list) {
        char c = 0;
        com.github.catvod.spider.merge.L.h hVarE = l.e(C0197c.l(this.a.concat(C0098a.a(new byte[]{57, 7, -18}, new byte[]{22, 113, -63, 77, 59, 16, -126, 12})).concat(list.get(0)), c()));
        String strA = i.a(new byte[]{82, -47, -120, 94, 42, 103, -128, -77, 86, -123}, new byte[]{58, -32, -90, 40, 117, 19, -23, -57}, hVarE);
        String strA2 = i.a(new byte[]{-82, -39, 60, -62, -32, 124, 0, -81, -2, -55, 106, -18, -12, 120, 29, -30, -70, -110, 57, -2}, new byte[]{-34, -9, 74, -99, -124, 25, 115, -52}, hVarE);
        String strA3 = hVarE.o0(C0098a.a(new byte[]{-92, -59, -81, -107, 91, -56, -58, 116, -71, -59, -87, -128, 121, -123, -37, 124, -13, -55, -74, -107, 103, -35, -23}, new byte[]{-55, -96, -37, -12, 0, -72, -76, 27})).a(C0098a.a(new byte[]{-89, -67, -106, -18, 3, -126, -27}, new byte[]{-60, -46, -8, -102, 102, -20, -111, -51}));
        String strA4 = hVarE.o0(C0098a.a(new byte[]{7, 89, -42, 101, 91, 32, -64, 8, 15, 1, -51, 99, 58, 56, -56, 1, 15, 83, -104, 101, 114, 43, -64, 56}, new byte[]{106, 60, -94, 4, 0, 78, -95, 101})).a(C0098a.a(new byte[]{-39, -2, -128, 110, -106, -65, -121}, new byte[]{-70, -111, -18, 26, -13, -47, -13, 51}));
        String strA5 = hVarE.o0(C0098a.a(new byte[]{-26, -73, 107, -32, -75, -43, -115, -92, -18, -17, 112, -26, -44, -51, -123, -83, -18, -67, 37, -30, -126, -38, -97, -70, -42}, new byte[]{-117, -46, 31, -127, -18, -69, -20, -55})).a(C0098a.a(new byte[]{109, 20, -83, 31, 42, 42, 61}, new byte[]{14, 123, -61, 107, 79, 68, 73, 16}));
        String strA6 = hVarE.o0(C0098a.a(new byte[]{-14, -64, -77, 120, 67, -128, -125, -47, -6, -104, -88, 126, 34, -104, -117, -40, -6, -54, -3, 120, 123, -102, -115, -50, -62}, new byte[]{-97, -91, -57, 25, 24, -18, -30, -68})).a(C0098a.a(new byte[]{-44, -59, -79, -126, 18, 75, 105}, new byte[]{-73, -86, -33, -10, 119, 37, 29, 80}));
        String strA7 = hVarE.o0(C0098a.a(new byte[]{32, 18, 18, -16, 11, 12, 94, -59, 61, 18, 20, -27, 41, 65, 67, -51, 119, 19, 3, -30, 51, 14, 69, -38, 57, 30, 9, -1, 13}, new byte[]{77, 119, 102, -111, 80, 124, 44, -86})).a(C0098a.a(new byte[]{59, 98, -51, -23, 103, 113, 120}, new byte[]{88, 13, -93, -99, 2, 31, 12, -38}));
        String strA8 = hVarE.o0(C0098a.a(new byte[]{111, -15, -40, -67, 97, -30, -32, -65, 103, -87, -61, -69, 0, -6, -24, -74, 103, -5, -106, -82, 95, -32, -28, -77, 113, -15, -13, -72, 91, -8, -28, -113}, new byte[]{2, -108, -84, -36, 58, -116, -127, -46})).a(C0098a.a(new byte[]{15, 113, -124, 10, 105, 18, -91}, new byte[]{108, 30, -22, 126, 12, 124, -47, 92}));
        String strA9 = hVarE.o0(C0098a.a(new byte[]{15, -5, 21, 14, 6, 81, 43, 23, 7, -93, 14, 8, 103, 73, 35, 30, 7, -15, 91, 11, 52, 77, 47, 25, 22, -15, 19, 50}, new byte[]{98, -98, 97, 111, 93, 63, 74, 122})).a(C0098a.a(new byte[]{41, 76, 26, 53, -37, 121, -41}, new byte[]{74, 35, 116, 65, -66, 23, -93, -84}));
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.i(strA3);
        kVar.n(strA8);
        kVar.h(strA);
        kVar.d(strA4);
        kVar.c(strA6);
        kVar.l(strA2);
        kVar.e(strA7);
        kVar.f(strA9);
        kVar.b(strA5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0074g c0074gO0 = hVarE.o0(C0098a.a(new byte[]{20, 84, 111, 76, -15, -10, 52, -25, 14, 86, 53, 74, -1, -8, 75, -70, 65, 84, 40}, new byte[]{97, 56, 65, 56, -112, -108, 107, -124}));
        C0074g c0074gO02 = hVarE.o0(C0098a.a(new byte[]{27, 116, 80, 60, -90, 114, 89, 4, 2, 113, 13, 56}, new byte[]{110, 24, 126, 76, -54, 19, 32, 91}));
        int i = 0;
        while (i < c0074gO0.size()) {
            String strV0 = c0074gO0.get(i).v0();
            m mVar = c0074gO02.get(i);
            byte[] bArr = new byte[1];
            bArr[c] = 37;
            C0074g c0074gO03 = mVar.o0(C0098a.a(bArr, new byte[]{68, 104, -83, 89, -124, -107, -27, 21}));
            ArrayList arrayList = new ArrayList();
            int size = c0074gO03.size() - 1;
            while (size >= 0) {
                m mVar2 = c0074gO03.get(size);
                StringBuilder sb = new StringBuilder();
                sb.append(mVar2.v0());
                byte[] bArr2 = new byte[1];
                bArr2[c] = -21;
                sb.append(C0098a.a(bArr2, new byte[]{-49, -48, -125, -36, -87, 56, -62, 37}));
                sb.append(mVar2.c(C0098a.a(new byte[]{-104, -76, -92, 66}, new byte[]{-16, -58, -63, 36, 73, -23, 84, -14})));
                arrayList.add(sb.toString());
                size--;
                c = 0;
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strV0, TextUtils.join(C0098a.a(new byte[]{65}, new byte[]{98, 76, 65, -74, 119, 63, 24, 110}), arrayList));
            }
            i++;
            c = 0;
        }
        if (linkedHashMap.size() > 0) {
            kVar.j(TextUtils.join(C0098a.a(new byte[]{-55, 112, -128}, new byte[]{-19, 84, -92, -10, -110, -42, -33, -18}), linkedHashMap.keySet()));
            kVar.k(TextUtils.join(C0098a.a(new byte[]{-49, -91, -115}, new byte[]{-21, -127, -87, -87, 92, -62, 52, 83}), linkedHashMap.values()));
        }
        return h.p(kVar);
    }

    public String homeContent(boolean z) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList<C0135a> arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, String> mapC = c();
        mapC.put(C0098a.a(new byte[]{-20, 62, -80, -51, 65, -103, -39}, new byte[]{-66, 91, -42, -88, 51, -4, -85, 113}), this.a);
        C0199e c0199eB = C0197c.b(this.a, mapC);
        List<String> list = c0199eB.c().get(C0098a.a(new byte[]{33, -51, -47, 56, 37, 34, 77, -60, 59, -51}, new byte[]{82, -88, -91, 21, 70, 77, 34, -81}));
        int i3 = 0;
        if (!(list == null) && !list.isEmpty()) {
            this.b = list.get(0);
        }
        com.github.catvod.spider.merge.L.h hVarE = l.e(c0199eB.a());
        Iterator itD = C0133t.d(new byte[]{16, -71, -6, 99, -113, -41, -63, 38, 10, -94, -12, 51, -50, -51, -9, 116, 91, -11, -75}, new byte[]{101, -43, -44, 13, -18, -95, -98, 84}, hVarE);
        while (true) {
            i = 5;
            i2 = 4;
            if (!itD.hasNext()) {
                break;
            }
            m mVar = (m) itD.next();
            if (mVar.c(C0098a.a(new byte[]{-101, -3, -86, -106}, new byte[]{-13, -113, -49, -16, 6, 99, -109, -112})).startsWith(C0098a.a(new byte[]{92, -38, -88, 86, -49}, new byte[]{115, -74, -63, 37, -69, 16, -47, 4}))) {
                arrayList2.add(new C0135a(mVar.c(C0098a.a(new byte[]{1, -102, 52, 90}, new byte[]{105, -24, 81, 60, -11, -106, -10, -102})).split(C0098a.a(new byte[]{119}, new byte[]{90, 60, 19, -117, 13, -39, 95, 1}))[1].substring(0, 1), mVar.v0().substring(0, 2)));
            }
        }
        for (C0135a c0135a : arrayList2) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(C0098a.a(new byte[]{118, 58, -87, -25, -113, -94}, new byte[]{89, 86, -64, -108, -5, -113, -41, -107}));
            sb.append(c0135a.a());
            byte[] bArr = new byte[i];
            // fill-array-data instruction
            bArr[0] = -49;
            bArr[1] = -110;
            bArr[2] = 22;
            bArr[3] = -125;
            bArr[4] = -39;
            com.github.catvod.spider.merge.L.h hVarE2 = l.e(C0197c.l(C0133t.b(bArr, new byte[]{-31, -6, 98, -18, -75, 102, 69, -79}, sb), c()));
            C0074g c0074gO0 = hVarE2.o0(C0098a.a(new byte[]{-102, -51, -49, 10, -52, 96, 126, -50, -119, -56, -115, 18, -64, 97, 42, -81, -49, -51, -120, 70, -101, 51, 110, -8, -103}, new byte[]{-17, -95, -31, 102, -91, 19, 10, -111}));
            ArrayList arrayList3 = new ArrayList();
            String strA = C0098a.a(new byte[]{-99, 27, 57, 83, -3, 6}, new byte[]{116, -70, -89, -74, 99, -115, -59, -84});
            byte[] bArr2 = new byte[i2];
            // fill-array-data instruction
            bArr2[0] = 53;
            bArr2[1] = -14;
            bArr2[2] = 56;
            bArr2[3] = 62;
            String strA2 = C0098a.a(bArr2, new byte[]{65, -117, 72, 91, -34, -24, 40, 49});
            m mVar2 = c0074gO0.get(i3);
            byte[] bArr3 = new byte[1];
            bArr3[i3] = 121;
            arrayList3.add(b(strA, strA2, mVar2.o0(C0098a.a(bArr3, new byte[]{24, -19, -73, -79, 9, -10, -16, -13})).c()));
            arrayList3.add(b(C0098a.a(new byte[]{110, 23, 100, 71, 14, -66}, new byte[]{-120, -114, -26, -82, -104, 45, 120, -16}), C0098a.a(new byte[]{116, -3, 9, 37}, new byte[]{13, -104, 104, 87, -107, 67, -118, -44}), c0074gO0.get(1).o0(C0098a.a(new byte[]{-63}, new byte[]{-96, -13, -107, 54, 116, -105, 77, -97})).c()));
            arrayList3.add(b(C0098a.a(new byte[]{-15, -93, -23, -105, 51, 103}, new byte[]{23, 45, 123, 114, -119, -24, 19, 17}), C0098a.a(new byte[]{90, 103}, new byte[]{56, 30, 82, -102, 59, -59, 20, 114}), c0074gO0.get(2).o0(C0098a.a(new byte[]{-71}, new byte[]{-40, 118, -111, 45, 127, -87, -46, 13})).c()));
            linkedHashMap.put(c0135a.a(), arrayList3);
            i3 = 0;
            i = 5;
            i2 = 4;
            hVarE = hVarE2;
        }
        Iterator itD2 = C0133t.d(new byte[]{122, 113, -117, 116, 30, 99, 35, 92}, new byte[]{30, 24, -3, 90, 119, 23, 70, 49}, hVarE);
        while (itD2.hasNext()) {
            m mVar3 = (m) itD2.next();
            j.a(mVar3.o0(C0098a.a(new byte[]{59, -7, -17, -96, -12, 119, 105}, new byte[]{90, -41, -101, -55, -128, 27, 12, 42})).a(C0098a.a(new byte[]{-117, 5, 105, 74}, new byte[]{-29, 119, 12, 44, -43, -76, 53, 117})).split(C0098a.a(new byte[]{23}, new byte[]{56, 121, -2, -4, -33, 16, -93, 114}))[2], y.b(new byte[]{-123, -58, 64, -71, -60, -51, -76}, new byte[]{-28, -24, 52, -48, -80, -95, -47, 94}, mVar3), mVar3.o0(C0098a.a(new byte[]{60, -44, -39, 14, -53, 22, 29}, new byte[]{93, -6, -70, 97, -67, 115, 111, 103})).a(C0098a.a(new byte[]{-21, -41, 21, -63, 53, 56, -104}, new byte[]{-113, -74, 97, -96, 24, 90, -1, -33})), y.b(new byte[]{126, 46, 78, 42, -79, 37, 110, 93, 110}, new byte[]{13, 94, 47, 68, -97, 65, 11, 46}, mVar3), arrayList);
        }
        return h.u(arrayList2, arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strA = l.e(C0197c.l(this.a.concat(str2), c())).o0(C0098a.a(new byte[]{46, -76, -126, 100, 65, 102}, new byte[]{71, -46, -16, 5, 44, 3, 116, -97})).a(C0098a.a(new byte[]{-119, -97, -116}, new byte[]{-6, -19, -17, -62, -34, 101, 69, 109}));
        try {
            byte b = 4;
            C0074g c0074gO0 = l.e(C0197c.k(strA)).o0(C0098a.a(new byte[]{85, 124, 65, -123, -5, -89}, new byte[]{38, 31, 51, -20, -117, -45, -26, 26}));
            String strA2 = "";
            String strA3 = "";
            String str3 = "";
            String str4 = "";
            String strA4 = "";
            int i = 0;
            while (i < c0074gO0.size()) {
                String string = c0074gO0.get(i).toString();
                if (string.contains(C0098a.a(new byte[]{b, 37, 84}, new byte[]{111, 64, 45, -37, -109, 79, -64, -13})) && string.contains(C0098a.a(new byte[]{125, 25, 109}, new byte[]{8, 107, 1, 61, 93, -20, 92, -60}))) {
                    String strA5 = C0098a.a(new byte[]{84, -47, -104, -17, -100, 34, -31, -126, 78, -20, -103, -103, -46, 85, -25, -38, 0, -104, -60, -103, -48, 32, -74, -53}, new byte[]{34, -80, -22, -77, -17, 9, -108, -16});
                    String strA6 = C0098a.a(new byte[]{-36, -40, -57, -121, -34, 99, 120, 110, -39, -109, -120, -121, -34, 98, 46, 26, -124, -109, -118, -14, -113, 115}, new byte[]{-86, -71, -75, -37, -83, 72, 12, 50});
                    String strA7 = C0098a.a(new byte[]{40, -96, -6, 126, -27, 43, 5, 85, 39, -99, -5, 8, -85, 92, 29, 26, 124, -23, -90, 8, -87, 41, 76, 11}, new byte[]{94, -63, -120, 34, -106, 0, 110, 48});
                    String strA8 = C0098a.a(new byte[]{30, 24, -102, -98, 108, 21, -66, 88, 28, 37, -101, -24, 34, 98, -84, 17, 74, 81, -58, -24, 32, 23, -3, 0}, new byte[]{104, 121, -24, -62, 31, 62, -33, 59});
                    String strA9 = C0098a.a(new byte[]{90, 127, 101, -82, 6, -73, -68, 74, 77, 103, 75, -127, 95, -95, -112, 85, 6, 60, 63, -36, 95, -93, -27, 4, 23}, new byte[]{44, 30, 23, -14, 117, -100, -52, 38});
                    strA2 = a(string, strA5);
                    strA3 = a(string, strA6);
                    String strA10 = a(string, strA7);
                    String strA11 = a(string, strA8);
                    strA4 = a(string, strA9);
                    str3 = strA10;
                    str4 = strA11;
                }
                i++;
                b = 4;
            }
            URL url = new URL(strA);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String str5 = port == -1 ? String.format(C0098a.a(new byte[]{49, 61, -46, -69, 54, -104, -79}, new byte[]{20, 78, -24, -108, 25, -67, -62, -34}), protocol, host) : String.format(C0098a.a(new byte[]{38, 44, -7, -84, -40, -4, 28, -44, 38, 59}, new byte[]{3, 95, -61, -125, -9, -39, 111, -18}), protocol, host, Integer.valueOf(port));
            String str6 = String.format(C0098a.a(new byte[]{-116, -18, -33, 9, -56, 30, -55, 68, -60, -71, -64, 18, -122, 8, -106, 13, -36, -17, -107, 85, -114, 25, -46, 21, -118, -70, -61, 88, -116, 20, -46, 21, -118}, new byte[]{-7, -100, -77, 52, -19, 109, -17, 48}), strA2, strA3, str3, str4, strA4);
            HashMap map = new HashMap();
            map.put(C0098a.a(new byte[]{115, -35, -4, -90, -104, -31}, new byte[]{18, -66, -97, -61, -24, -107, 109, -67}), C0098a.a(new byte[]{62, -40, -89, -43, 51, -18, 111, 81, 54, -57, -71, -106, 48, -2, 97, 75, 115, -120, -93, -36, 34, -7, 33, 79, 62, -34, -74, -54, 57, -1, 103, 85, 43, -124, -9, -109, 117, -89, 53, 5, 46, -107, -25, -105, 106, -68}, new byte[]{95, -88, -41, -71, 90, -115, 14, 37}));
            map.put(C0098a.a(new byte[]{-122, 21, 57, -91, 67, -86, -69, 105, -122, 24, 61, -75, 82, -71, -13}, new byte[]{-25, 118, 90, -64, 51, -34, -106, 5}), C0098a.a(new byte[]{73, -100, 46, 36, -61, -94, -19, 122, 8, -123, 62, 87, -93, -73, -69, 119, 93, -49, 114, 90, -67, -96, -81}, new byte[]{51, -12, 3, 103, -115, -114, -105, 18}));
            map.put(C0098a.a(new byte[]{49, 4, 26, 54, -49, -29, 41, -56, 38, 18, 4, 39}, new byte[]{82, 107, 116, 66, -86, -115, 93, -27}), C0098a.a(new byte[]{41, 100, 36, 41, -77, 74, -39, 30, 33, 123, 58, 106, -94, 4, -49, 29, 63, 57, 50, 42, -88, 68, -107, 31, 58, 120, 49, 43, -71, 70, -36, 15, 44, 47, 116, 38, -78, 72, -54, 25, 45, 96, 105, 16, -114, 111, -107, 82}, new byte[]{72, 20, 84, 69, -38, 41, -72, 106}));
            map.put(C0098a.a(new byte[]{-33, 123, -111, -111, -11, 119}, new byte[]{-80, 9, -8, -10, -100, 25, -87, -28}), str5);
            map.put(C0098a.a(new byte[]{76, -72, 44, -67, 123, 90, 78, -91}, new byte[]{60, -54, 69, -46, 9, 51, 58, -36}), C0098a.a(new byte[]{113, -13, -9, 114, 93, -12}, new byte[]{4, -50, -58, 94, 125, -99, -59, 107}));
            map.put(C0098a.a(new byte[]{-73, -24, 64, 59, -3, 69, 46, -33, -91}, new byte[]{-60, -115, 35, 22, -98, 45, 3, -86}), C0098a.a(new byte[]{50, -89, -88, -77, 103, 77, 31, -86, 98, -120, -87, -93, 106, 55, 64, -43, 50, -47, -27, -21, 104, 46, 117, -128, 98, -122, -86, -82, 61, 97, 20, -45, 102, -44, -27, -10, 122, 58, 20, -60, 48, -53, -128, -88, 39, 107, 90, -115, 48, -86, -81, -75, 39, 97, 83, -54, 43, -97, -6, -27, 121, 62, 0, -54}, new byte[]{16, -23, -57, -57, 72, 12, 54, -24}));
            map.put(C0098a.a(new byte[]{24, 46, 21, -96, 127, 71, 102, 67, 10, 102, 27, -30, 126, 70, 39, 83}, new byte[]{107, 75, 118, -115, 28, 47, 75, 54}), C0098a.a(new byte[]{-90, -96}, new byte[]{-103, -112, 95, -86, -60, -94, 40, 30}));
            map.put(C0098a.a(new byte[]{116, -28, -27, 100, 123, 102, -107, -9, 102, -84, -10, 37, 121, 122, -34, -19, 117, -20}, new byte[]{7, -127, -122, 73, 24, 14, -72, -126}), C0098a.a(new byte[]{52, -41, 9, -16, -64, 60, -108, -25, 52}, new byte[]{22, -128, 96, -98, -92, 83, -29, -108}));
            map.put(C0098a.a(new byte[]{116, 55, -60, 90, -116, -89, 118, 9, 111, 127, -61, 18, -103, -74}, new byte[]{7, 82, -89, 119, -22, -62, 2, 106}), C0098a.a(new byte[]{-41, 42, -19, 89, -52}, new byte[]{-78, 71, -99, 45, -75, 71, -28, -91}));
            map.put(C0098a.a(new byte[]{37, 90, -14, -81, -2, 57, -40, -15, 62, 18, -4, -19, -4, 57}, new byte[]{86, 63, -111, -126, -104, 92, -84, -110}), C0098a.a(new byte[]{-127, -70, 68, -96}, new byte[]{-30, -43, 54, -45, -69, 9, 37, 50}));
            map.put(C0098a.a(new byte[]{-87, 48, -45, -83, 119, -61, -45, -106, -78, 120, -61, -23, 101, -61}, new byte[]{-38, 85, -80, -128, 17, -90, -89, -11}), C0098a.a(new byte[]{75, 41, 89, 88, -83, -98, -62, 16, 95, 33, 90}, new byte[]{56, 72, 52, 61, -128, -15, -80, 121}));
            map.put(C0098a.a(new byte[]{-51, -52, -55, 65, -88, 116, -64, -26, -42, -53}, new byte[]{-72, -65, -84, 51, -123, 21, -89, -125}), C0098a.a(new byte[]{-26, 37, 107, -40, 0, 86, -31, -100, -98, 100, 33, -111, 68, 109, -23, -35, -49, 37, 102, -62, 76, 116, -44, -109, -102, 122, 63, -127, 87, 26, -41, -38, -59, 124, 37, -118, 76, 66, -74, -121, -126, 106, 80, -63, 28, 86, -27, -28, -50, 40, 90, -40, 24, 21, -75, -128, -100, 100, 34, -121, 76, 18, -53, -5, -1, 7, 93, -99, 76, 86, -23, -40, -50, 106, 86, -44, 15, 81, -17, -102, -117, 9, 121, -61, 3, 87, -27, -100, -102, 123, 38, -97, 92, 20, -80, -99, -101, 106, 66, -48, 10, 91, -14, -38, -124, 127, 34, -122, 66, 9, -74}, new byte[]{-85, 74, 17, -79, 108, 58, -128, -77}));
            map.put(C0098a.a(new byte[]{-67, 1, 53, -60, -6, -15, -95, -7, -79, 73, 35, -116, -4, -19, -80, -30}, new byte[]{-59, 44, 71, -95, -117, -124, -60, -118}), C0098a.a(new byte[]{11, 55, -16, 21, -42, -112, -65, 43, 54, 11, -55, 56, -47, -112}, new byte[]{83, 122, -68, 93, -94, -28, -49, 121}));
            map.put(C0098a.a(new byte[]{-43, -61, -123, 69, 32, 116, 45}, new byte[]{-89, -90, -29, 32, 82, 17, 95, 22}), strA);
            if (!TextUtils.isEmpty(this.b)) {
                map.put(C0098a.a(new byte[]{-4, 95, -125, -82, 28, 75}, new byte[]{-65, 48, -20, -59, 117, 46, -21, 30}), this.b);
            }
            String strD = d(str5 + C0098a.a(new byte[]{10, 7, -58, 78, -98, 112, -10, 74}, new byte[]{37, 102, -74, 39, -80, 0, -98, 58}), str6, map);
            if (!strD.equals("")) {
                h hVarE = h.e();
                hVarE.y(strD);
                hVarE.f(c());
                return hVarE.o();
            }
            h hVarE2 = h.e();
            hVarE2.y(strA);
            hVarE2.l();
            hVarE2.f(c());
            return hVarE2.o();
        } catch (Exception unused) {
            h hVarE3 = h.e();
            hVarE3.y(strA);
            hVarE3.l();
            hVarE3.f(c());
            return hVarE3.o();
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itD = C0133t.d(new byte[]{-98, 71, 111, 113, 53, -67, -77, 61}, new byte[]{-6, 46, 25, 95, 92, -55, -42, 80}, l.e(C0197c.l(this.a.concat(C0098a.a(new byte[]{30, 20, -38, 108, -116, 37, -18, -125, 28, 74, -38, 108, -113, 96, -73, -61, 93, 88, -128, 37, -100}, new byte[]{49, 103, -9, 65, -95, 8, -61, -82})).concat(str), c())));
        while (itD.hasNext()) {
            m mVar = (m) itD.next();
            j.a(mVar.o0(C0098a.a(new byte[]{-76, 26, -17, 111, -107, 78, 90}, new byte[]{-43, 52, -101, 6, -31, 34, 63, 72})).a(C0098a.a(new byte[]{-93, 85, -8, -58}, new byte[]{-53, 39, -99, -96, -122, 31, -60, 70})).split(C0098a.a(new byte[]{-95}, new byte[]{-114, 117, -43, -106, 42, 48, -89, 14}))[2], y.b(new byte[]{69, -58, -99, -45, 56, -4, -53}, new byte[]{36, -24, -23, -70, 76, -112, -82, -15}, mVar), mVar.o0(C0098a.a(new byte[]{87, 96, 64, 97, 63, 126, -125}, new byte[]{54, 78, 35, 14, 73, 27, -15, -107})).a(C0098a.a(new byte[]{83, -62, 84, 61, 34, 16, 62}, new byte[]{55, -93, 32, 92, 15, 114, 89, 5})), y.b(new byte[]{-54, -17, 44, 48, -43, -122, -109, 99, -38}, new byte[]{-71, -97, 77, 94, -5, -30, -10, 16}, mVar), arrayList);
        }
        return h.q(arrayList);
    }
}
