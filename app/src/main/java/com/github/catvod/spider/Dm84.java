package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.KI.h;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.Mp.P;
import com.github.catvod.spider.merge.NQ.j;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.bY.C0924s;
import com.github.catvod.spider.merge.bY.C0925t;
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

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
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

    private com.github.catvod.spider.merge.KI.FilterValue b(String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String strReplace : list) {
            if (!strReplace.isEmpty()) {
                String strReplace2 = strReplace.replace("按", "");
                if (str2.equals("by")) {
                    strReplace = strReplace.replace("按时间", "time").replace("按人气", "hits").replace("按评分", "score");
                }
                arrayList.add(new com.github.catvod.spider.merge.KI.b(strReplace2, strReplace));
            }
        }
        return new com.github.catvod.spider.merge.KI.c(str2, str, arrayList);
    }

    private HashMap<String, String> c() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
        map.put("accept-language", "zh-CN,zh;q=0.9");
        map.put("Sec-Fetch-User", "?1");
        map.put("Sec-Fetch-Dest", "document");
        map.put("Sec-Fetch-Mode", "navigate");
        map.put("Sec-Fetch-Site", "none");
        if (!TextUtils.isEmpty(this.b)) {
            map.put("Cookie", this.b);
        }
        return map;
    }

    private String d(String str, String str2, Map<String, String> map) {
        try {
            OkHttpClient okHttpClientBuild = new OkHttpClient().newBuilder().build();
            Request.Builder builderMethod = new Request.Builder().url(str).method("POST", RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"), str2));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderMethod.addHeader(entry.getKey(), entry.getValue());
            }
            return new JSONObject(okHttpClientBuild.newCall(builderMethod.build()).execute().body().string()).getString("url");
        } catch (Exception unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map.get("type") == null) {
            map.put("type", "");
        }
        if (map.get("year") == null) {
            map.put("year", "");
        }
        if (map.get("by") == null) {
            map.put("by", "time");
        }
        Iterator itC = C0925t.c(new byte[]{102, -32, 49, -45, 55, 22, -61, -110}, new byte[]{2, -119, 71, -3, 94, 98, -90, -1}, l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a + String.format("/show-%s--%s-%s--%s-%s.html", str, map.get("by"), URLEncoder.encode(map.get("type")), map.get("year"), str2), c())));
        while (itC.hasNext()) {
            GeneralUtils mVar = (m) itC.next();
            C0924s.b(mVar.o0("a.title").a("href").split("/")[2], P.a(new byte[]{-43, -5, 45, 53, 26, 92, 7}, new byte[]{-76, -43, 89, 92, 110, 48, 98, 90}, mVar), mVar.o0("a.cover").a("data-bg"), P.a(new byte[]{-92, 40, -77, -26, -61, 15, 4, -53, -76}, new byte[]{-41, 88, -46, -120, -19, 107, 97, -72}, mVar), arrayList);
        }
        return Subtitle.q(arrayList);
    }

    public String detailContent(List<String> list) {
        char c = 0;
        com.github.catvod.spider.merge.UY.Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a.concat("/v/").concat(list.get(0)), c()));
        String strA = JsonUtils.a(new byte[]{10, 18, 100, 5, -27, 86, 57, -11, 14, 70}, new byte[]{98, 35, 74, 115, -70, 34, 80, -127}, hVarE);
        String strA2 = JsonUtils.a(new byte[]{105, -99, -30, -35, -45, 34, 118, -71, 57, -115, -76, -15, -57, 38, 107, -12, 125, -42, -25, -31}, new byte[]{25, -77, -108, -126, -73, 71, 5, -38}, hVarE);
        String strA3 = hVarE.o0("meta[property=og:image]").a("content");
        String strA4 = hVarE.o0("meta[name=og:video:area]").a("content");
        String strA5 = hVarE.o0("meta[name=og:video:class]").a("content");
        String strA6 = hVarE.o0("meta[name=og:video:actor]").a("content");
        String strA7 = hVarE.o0("meta[property=og:description]").a("content");
        String strA8 = hVarE.o0("meta[name=og:video:release_date]").a("content");
        String strA9 = hVarE.o0("meta[name=og:video:director]").a("content");
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
        C0724g c0724gO0 = hVarE.o0("ul.tab_control > li");
        C0724g c0724gO02 = hVarE.o0("ul.play_list");
        int i = 0;
        while (i < c0724gO0.size()) {
            String strV0 = c0724gO0.get(i).v0();
            GeneralUtils mVar = c0724gO02.get(i);
            byte[] bArr = new byte[1];
            bArr[c] = 127;
            C0724g c0724gO03 = mVar.o0(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{30, 66, -48, -93, 10, 2, 119, 41}));
            ArrayList arrayList = new ArrayList();
            int size = c0724gO03.size() - 1;
            while (size >= 0) {
                GeneralUtils mVar2 = c0724gO03.get(size);
                StringBuilder sb = new StringBuilder();
                sb.append(mVar2.v0());
                byte[] bArr2 = new byte[1];
                bArr2[c] = -116;
                sb.append(com.github.catvod.spider.merge.XI.f.a(bArr2, new byte[]{-88, -49, -18, -15, 2, 56, 92, -43}));
                sb.append(mVar2.c("href"));
                arrayList.add(sb.toString());
                size--;
                c = 0;
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strV0, TextUtils.join("#", arrayList));
            }
            i++;
            c = 0;
        }
        if (linkedHashMap.size() > 0) {
            kVar.j(TextUtils.join("$$", linkedHashMap.keySet()));
            kVar.k(TextUtils.join("$$", linkedHashMap.values()));
        }
        return Subtitle.p(kVar);
    }

    public String homeContent(boolean z) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        ArrayList<com.github.catvod.spider.merge.KI.a> arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, String> mapC = c();
        mapC.put("Referer", this.a);
        com.github.catvod.spider.merge.nU.StringUtils eVarB = com.github.catvod.spider.merge.nU.FilterValue.b(this.a, mapC);
        List<String> list = eVarB.c().get("set-cookie");
        int i3 = 0;
        if (!(list == null) && !list.isEmpty()) {
            this.b = list.get(0);
        }
        com.github.catvod.spider.merge.UY.Subtitle hVarE = l.e(eVarB.a());
        Iterator itC = C0925t.c(new byte[]{-98, 117, 62, -124, 41, 38, 29, -111, -124, 110, 48, -44, 104, 60, 43, -61, -43, 57, 113}, new byte[]{-21, 25, 16, -22, 72, 80, 66, -29}, hVarE);
        while (true) {
            i = 5;
            i2 = 4;
            if (!itC.hasNext()) {
                break;
            }
            GeneralUtils mVar = (m) itC.next();
            if (mVar.c("href").startsWith("/list")) {
                arrayList2.add(new com.github.catvod.spider.merge.KI.a(mVar.c("href").split("-")[1].substring(0, 1), mVar.v0().substring(0, 2)));
            }
        }
        for (com.github.catvod.spider.merge.KI.a aVar : arrayList2) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("/list-");
            sb.append(aVar.a());
            byte[] bArr = new byte[i];
            // fill-array-data instruction
            bArr[0] = -94;
            bArr[1] = 116;
            bArr[2] = -76;
            bArr[3] = -13;
            bArr[4] = -62;
            com.github.catvod.spider.merge.UY.Subtitle hVarE2 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(C0925t.a(bArr, new byte[]{-116, 28, -64, -98, -82, 50, -6, -12}, sb), c()));
            C0724g c0724gO0 = hVarE2.o0("ul.list_filter > li > div");
            ArrayList arrayList3 = new ArrayList();
            String strA = "類型";
            byte[] bArr2 = new byte[i2];
            // fill-array-data instruction
            bArr2[0] = 50;
            bArr2[1] = -17;
            bArr2[2] = 119;
            bArr2[3] = 11;
            String strA2 = com.github.catvod.spider.merge.XI.f.a(bArr2, new byte[]{70, -106, 7, 110, -2, -27, 107, -37});
            GeneralUtils mVar2 = c0724gO0.get(i3);
            byte[] bArr3 = new byte[1];
            bArr3[i3] = -120;
            arrayList3.add(b(strA, strA2, mVar2.o0(com.github.catvod.spider.merge.XI.f.a(bArr3, new byte[]{-23, 107, -5, 40, -37, 99, 102, 121})).c()));
            arrayList3.add(b("時間", "year", c0724gO0.get(1).o0("a").c()));
            arrayList3.add(b("排序", "by", c0724gO0.get(2).o0("a").c()));
            linkedHashMap.put(aVar.a(), arrayList3);
            i3 = 0;
            i = 5;
            i2 = 4;
            hVarE = hVarE2;
        }
        Iterator itC2 = C0925t.c(new byte[]{109, 71, 60, -26, 17, -8, 122, 66}, new byte[]{9, 46, 74, -56, 120, -116, 31, 47}, hVarE);
        while (itC2.hasNext()) {
            GeneralUtils mVar3 = (m) itC2.next();
            C0924s.b(mVar3.o0("a.title").a("href").split("/")[2], P.a(new byte[]{52, 13, 56, -74, -79, -23, 53}, new byte[]{85, 35, 76, -33, -59, -123, 80, 43}, mVar3), mVar3.o0("a.cover").a("data-bg"), P.a(new byte[]{-85, 48, -58, 104, -90, 32, -69, -56, -69}, new byte[]{-40, 64, -89, 6, -120, 68, -34, -69}, mVar3), arrayList);
        }
        return Subtitle.u(arrayList2, arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strA = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a.concat(str2), c())).o0("iframe").a("src");
        try {
            byte b = 4;
            C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.k(strA)).o0("script");
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            String strA2 = "";
            int i = 0;
            while (i < c0724gO0.size()) {
                String string = c0724gO0.get(i).toString();
                byte[] bArr = {60, -119, -65};
                byte[] bArr2 = new byte[8];
                bArr2[0] = 87;
                bArr2[1] = -20;
                bArr2[2] = -58;
                bArr2[3] = -100;
                bArr2[b] = 117;
                bArr2[5] = 117;
                bArr2[6] = -21;
                bArr2[7] = 48;
                if (string.contains(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2))) {
                    byte[] bArr3 = {-16, -58, -105};
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = -123;
                    bArr4[1] = -76;
                    bArr4[2] = -5;
                    bArr4[3] = 27;
                    bArr4[b] = -74;
                    bArr4[5] = 58;
                    bArr4[6] = 12;
                    bArr4[7] = -82;
                    if (string.contains(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4))) {
                        byte[] bArr5 = new byte[24];
                        bArr5[0] = 102;
                        bArr5[1] = 25;
                        bArr5[2] = 101;
                        bArr5[3] = 15;
                        bArr5[b] = 33;
                        bArr5[5] = -124;
                        bArr5[6] = 106;
                        bArr5[7] = 44;
                        bArr5[8] = 124;
                        bArr5[9] = 36;
                        bArr5[10] = 100;
                        bArr5[11] = 121;
                        bArr5[12] = 111;
                        bArr5[13] = -13;
                        bArr5[14] = 108;
                        bArr5[15] = 116;
                        bArr5[16] = 50;
                        bArr5[17] = 80;
                        bArr5[18] = 57;
                        bArr5[19] = 121;
                        bArr5[20] = 109;
                        bArr5[21] = -122;
                        bArr5[22] = 61;
                        bArr5[23] = 101;
                        byte[] bArr6 = new byte[8];
                        bArr6[0] = 16;
                        bArr6[1] = 120;
                        bArr6[2] = 23;
                        bArr6[3] = 83;
                        bArr6[b] = 82;
                        bArr6[5] = -81;
                        bArr6[6] = 31;
                        bArr6[7] = 94;
                        String strA3 = com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6);
                        byte[] bArr7 = new byte[22];
                        bArr7[0] = -119;
                        bArr7[1] = -98;
                        bArr7[2] = 28;
                        bArr7[3] = 48;
                        bArr7[b] = -107;
                        bArr7[5] = b;
                        bArr7[6] = -19;
                        bArr7[7] = -114;
                        bArr7[8] = -116;
                        bArr7[9] = -43;
                        bArr7[10] = 83;
                        bArr7[11] = 48;
                        bArr7[12] = -107;
                        bArr7[13] = 5;
                        bArr7[14] = -69;
                        bArr7[15] = -6;
                        bArr7[16] = -47;
                        bArr7[17] = -43;
                        bArr7[18] = 81;
                        bArr7[19] = 69;
                        bArr7[20] = -60;
                        bArr7[21] = 20;
                        byte[] bArr8 = new byte[8];
                        bArr8[0] = -1;
                        bArr8[1] = -1;
                        bArr8[2] = 110;
                        bArr8[3] = 108;
                        bArr8[b] = -26;
                        bArr8[5] = 47;
                        bArr8[6] = -103;
                        bArr8[7] = -46;
                        String strA4 = com.github.catvod.spider.merge.XI.f.a(bArr7, bArr8);
                        byte[] bArr9 = new byte[24];
                        bArr9[0] = -127;
                        bArr9[1] = 38;
                        bArr9[2] = 30;
                        bArr9[3] = 77;
                        bArr9[b] = 43;
                        bArr9[5] = 111;
                        bArr9[6] = 52;
                        bArr9[7] = -7;
                        bArr9[8] = -114;
                        bArr9[9] = 27;
                        bArr9[10] = 31;
                        bArr9[11] = 59;
                        bArr9[12] = 101;
                        bArr9[13] = 24;
                        bArr9[14] = 44;
                        bArr9[15] = -74;
                        bArr9[16] = -43;
                        bArr9[17] = 111;
                        bArr9[18] = 66;
                        bArr9[19] = 59;
                        bArr9[20] = 103;
                        bArr9[21] = 109;
                        bArr9[22] = 125;
                        bArr9[23] = -89;
                        byte[] bArr10 = new byte[8];
                        bArr10[0] = -9;
                        bArr10[1] = 71;
                        bArr10[2] = 108;
                        bArr10[3] = 17;
                        bArr10[b] = 88;
                        bArr10[5] = 68;
                        bArr10[6] = 95;
                        bArr10[7] = -100;
                        String strA5 = com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10);
                        byte[] bArr11 = new byte[24];
                        bArr11[0] = 98;
                        bArr11[1] = 64;
                        bArr11[2] = -11;
                        bArr11[3] = 100;
                        bArr11[b] = -59;
                        bArr11[5] = 3;
                        bArr11[6] = -11;
                        bArr11[7] = -8;
                        bArr11[8] = 96;
                        bArr11[9] = 125;
                        bArr11[10] = -12;
                        bArr11[11] = 18;
                        bArr11[12] = -117;
                        bArr11[13] = 116;
                        bArr11[14] = -25;
                        bArr11[15] = -79;
                        bArr11[16] = 54;
                        bArr11[17] = 9;
                        bArr11[18] = -87;
                        bArr11[19] = 18;
                        bArr11[20] = -119;
                        bArr11[21] = 1;
                        bArr11[22] = -74;
                        bArr11[23] = -96;
                        byte[] bArr12 = new byte[8];
                        bArr12[0] = 20;
                        bArr12[1] = 33;
                        bArr12[2] = -121;
                        bArr12[3] = 56;
                        bArr12[b] = -74;
                        bArr12[5] = 40;
                        bArr12[6] = -108;
                        bArr12[7] = -101;
                        String strA6 = com.github.catvod.spider.merge.XI.f.a(bArr11, bArr12);
                        byte[] bArr13 = new byte[25];
                        bArr13[0] = 11;
                        bArr13[1] = -115;
                        bArr13[2] = 115;
                        bArr13[3] = -42;
                        bArr13[b] = 17;
                        bArr13[5] = 125;
                        bArr13[6] = -120;
                        bArr13[7] = -25;
                        bArr13[8] = 28;
                        bArr13[9] = -107;
                        bArr13[10] = 93;
                        bArr13[11] = -7;
                        bArr13[12] = 72;
                        bArr13[13] = 107;
                        bArr13[14] = -92;
                        bArr13[15] = -8;
                        bArr13[16] = 87;
                        bArr13[17] = -50;
                        bArr13[18] = 41;
                        bArr13[19] = -92;
                        bArr13[20] = 72;
                        bArr13[21] = 105;
                        bArr13[22] = -47;
                        bArr13[23] = -87;
                        bArr13[24] = 70;
                        String strA7 = com.github.catvod.spider.merge.XI.f.a(bArr13, new byte[]{125, -20, 1, -118, 98, 86, -8, -117});
                        String strA8 = a(string, strA3);
                        String strA9 = a(string, strA4);
                        String strA10 = a(string, strA5);
                        String strA11 = a(string, strA6);
                        str5 = strA10;
                        strA2 = a(string, strA7);
                        str6 = strA11;
                        str4 = strA9;
                        str3 = strA8;
                    }
                }
                i++;
                b = 4;
            }
            URL url = new URL(strA);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String str7 = port == -1 ? String.format("%s://%s", protocol, host) : String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
            String str8 = String.format("url=%s&t=%s&key=%s&act=%s&play=%s", str3, str4, str5, str6, strA2);
            HashMap map = new HashMap();
            map.put("accept", "application/json, text/javascript, */*; q=0.01");
            map.put("accept-language", "zh-CN,zh;q=0.9,en;q=0.8");
            map.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            map.put("origin", str7);
            map.put("priority", "u=1, i");
            map.put("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126\"");
            map.put("sec-ch-ua-mobile", "?0");
            map.put("sec-ch-ua-platform", "\"Windows\"");
            map.put("sec-fetch-dest", "empty");
            map.put("sec-fetch-mode", "cors");
            map.put("sec-fetch-site", "same-origin");
            map.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("x-requested-with", "XMLHttpRequest");
            map.put("referer", strA);
            if (!TextUtils.isEmpty(this.b)) {
                map.put("Cookie", this.b);
            }
            String strD = d(str7 + "/api.php", str8, map);
            if (!strD.equals("")) {
                Subtitle hVarE = Subtitle.e();
                hVarE.y(strD);
                hVarE.f(c());
                return hVarE.o();
            }
            Subtitle hVarE2 = Subtitle.e();
            hVarE2.y(strA);
            hVarE2.l();
            hVarE2.f(c());
            return hVarE2.o();
        } catch (Exception unused) {
            Subtitle hVarE3 = Subtitle.e();
            hVarE3.y(strA);
            hVarE3.l();
            hVarE3.f(c());
            return hVarE3.o();
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itC = C0925t.c(new byte[]{-76, -85, -70, 117, 73, 82, 60, 1}, new byte[]{-48, -62, -52, 91, 32, 38, 89, 108}, l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a.concat("/s----------.html?wd=").concat(str), c())));
        while (itC.hasNext()) {
            GeneralUtils mVar = (m) itC.next();
            C0924s.b(mVar.o0("a.title").a("href").split("/")[2], P.a(new byte[]{124, 27, -13, -15, -65, -102, 41}, new byte[]{29, 53, -121, -104, -53, -10, 76, -86}, mVar), mVar.o0("a.cover").a("data-bg"), P.a(new byte[]{-9, -85, 63, 82, -1, -83, -85, -75, -25}, new byte[]{-124, -37, 94, 60, -47, -55, -50, -58}, mVar), arrayList);
        }
        return Subtitle.q(arrayList);
    }
}
