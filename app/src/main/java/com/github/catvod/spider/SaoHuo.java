package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.Mp.P;
import com.github.catvod.spider.merge.NQ.j;
import com.github.catvod.spider.merge.UY.h;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0924s;
import com.github.catvod.spider.merge.bY.C0925t;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class SaoHuo extends Spider {
    private String a;
    String b = "";

    public SaoHuo() {
        "/search.php?scheckAC=check&page=&searchtype=&order=&tid=&area=&year=&letter=&yuyan=&state=&money=&ver=&jq=";
    }

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        map.put("accept-language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        if (!TextUtils.isEmpty(this.b)) {
            map.put("Cookie", this.b);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a + String.format("/list/%s-%s.html", str, str2), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itC = C0925t.c(new byte[]{-75, -1, -30, -124, -38, -43, -45, 67, -75, -1, -30, -127, -34, -63}, new byte[]{-101, -119, -67, -24, -77, -90, -89, 99}, hVarE);
        while (itC.hasNext()) {
            GeneralUtils mVar = (m) itC.next();
            C0924s.b(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), P.a(new byte[]{16, -118, -4, -38, 80, -100, 59}, new byte[]{62, -4, -93, -76, 63, -24, 94, -71}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.KI.Subtitle.q(arrayList);
    }

    public String detailContent(List<String> list) {
        char c = 0;
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(list.get(0), a()));
        C0724g c0724gO0 = hVarE.o0("#play_link li");
        C0724g c0724gO02 = hVarE.o0(".play_from ul.from_list li");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < c0724gO0.size()) {
            String strV0 = c0724gO02.get(i).v0();
            ArrayList arrayList = new ArrayList();
            GeneralUtils mVar = c0724gO0.get(i);
            byte[] bArr = new byte[1];
            bArr[c] = 29;
            C0724g c0724gO03 = mVar.o0(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{124, -114, -64, 29, -113, -19, 35, 69}));
            int size = c0724gO03.size() - 1;
            while (size >= 0) {
                String strC = c0724gO03.get(size).c("href");
                StringBuilder sbB = C0925t.b(c0724gO03.get(size).v0());
                byte[] bArr2 = new byte[1];
                bArr2[c] = 70;
                sbB.append(com.github.catvod.spider.merge.XI.f.a(bArr2, new byte[]{98, 2, -98, 99, -82, -26, -44, -29}));
                sbB.append(strC);
                arrayList.add(sbB.toString());
                size--;
                c = 0;
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strV0, TextUtils.join("#", arrayList));
            }
            i++;
            c = 0;
        }
        String strA = JsonUtils.a(new byte[]{-66, -59, 92, 68, 75, 7, -75, 11, -70, -111}, new byte[]{-42, -12, 114, 50, 20, 115, -36, 127}, hVarE);
        StringBuilder sbB2 = C0925t.b(URLDecoder.decode(new String(Base64.getDecoder().decode("6IKl44O754yr4p2k5o+Q6YaS5oKoOuivt+WLv+ebuOS/oeinhumikeW5v+WRiuOAi+OAi+eugOS7i++8mg==")), "UTF-8"));
        sbB2.append(hVarE.o0("p.p_txt").h());
        String string = sbB2.toString();
        String[] strArrSplit = JsonUtils.a(new byte[]{-31, -114, 27, -116, 49, -2, 107, -56, -83, -105, 60, -59, 47}, new byte[]{-49, -8, 68, -27, 95, -104, 4, -105}, hVarE).split(" / 导演:| / 主演:");
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        String str3 = strArrSplit[2];
        k kVar = new k();
        kVar.g(list.get(0));
        kVar.h(strA);
        kVar.b(str);
        kVar.c(str3);
        kVar.e(string);
        kVar.f(str2);
        kVar.j(TextUtils.join("$$", linkedHashMap.keySet()));
        kVar.k(TextUtils.join("$$", linkedHashMap.values()));
        return com.github.catvod.spider.merge.KI.Subtitle.p(kVar);
    }

    public String homeContent(boolean z) {
        HashMap<String, String> mapA = a();
        mapA.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "20", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "国产剧", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.KI.a((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject(ZrJ.d("02617A6F7265223869262D3C5B796B6F2B240D2602296A695961252C25205B796B6FAFF4C2A6D5C66A6959613D2C24301C61716D133E5B2D697768679CC6E3A4CBED5B6F6B6F3E674363697C6A385563306F2667436369A8DED99CCAEC6F64655B35697768674F613661683E5B2D697768679ECBFAABCBC05B6F6B6F3E674363697A6A385563306F2667436369ABC9D59FC3DD6F64655B356977686741613661683E5B2D697768679CC9E3A9F5D95B6F6B6F3E67436369746A385563306F2667436369AAEFD49CFAF06F64655B35697768674873693064650261256F72655BA5C3D5ACFFF061676D6A335B796B6F79745B3E676D33671761716D6AA2F3ECACF0E2675563693B6A7F59617A7F6A385563306F2667436369A8C2ED9ED7F06F64655B35697768674870693064650261256F72655BA6EECAADFCC261676D6A335B796B6F79715B3E676D33671761716D6AA0F0E4ADCECD675563693B6A7F59617A786A385563306F2667436369A8CED790DAE26F64655B35697768674875693064650261256F72655BA5C9E1AFD3E861676D6A335B796B6F79725B3E676D33671761716D6AA3FAC9ADCFD2675563693B6A7F59617A756A385563306F2667436369A8CDF39DF8DD6F64655B35697768674B7369301538246F697F6A7F5918306F23200061716D6A2618372E042C675563692329281C61716D6AA2C8F8AED3C3675563693B29290C266977681E0261256F72655BA6CEE5A1C6D161676D6A335B796B6F7A67046F6B366A2B5B796B6FADDEC4A7F1EAADCCDE61676D6A335B796B6F7A755B3E676D33671761716D6A112F01696168670F61716D6A7748613661683E5B2D6977686790DCE2A8C1E25B6F6B6F3E674363697F7A67046F6B366A2B5B796B6FAFFBF7A6C2EA6A6959613D6F72655B71786F3569593869236A7F5961ADDAEDA0F0E4696168670F61716D6A774D613661683E5B2D6977686791C8FAA8C1E25B6F6B6F3E674363697F7D67046F6B366A2B5B796B6FADCAC9A6C2EA6A6959613D6F72655B717D6F3569593869236A7F5961AEC8FEA1C2D5696168670F61716D6A774E61361035185561786F7265223869262D3C5B796B6F2B240D2602296A695961252C25205B796B6FAFF4C2A6D5C66A6959613D2C24301C61716D133E5B2D697768679CC6E3A4CBED5B6F6B6F3E67436369796A385563306F2667436369ABD8DB9EEFDA6F64655B35697768674A7B693064650261256F72655BA5CAC6AFCDC861676D6A335B796B6F7B7C5B3E676D33671761716D6AA2FAEEA3ECC8675563693B6A7F59617F7D6A385563306F2667436369ABE8F99FD5DC6F64655B35697768674D72693064650261256F72655BA4F5C3ADF5E8A6EEFE6A6959613D6F72655B77796F3569593869236A7F5961A2E0DCA3CAD6696168670F61716D6A714A613661683E5B2D697768679FDFF1ABC0DD5B6F6B6F3E67436369797C67046F6B366A2B5B796B6FAEE5D8A6D0E06A6959613D6F72655B777E6F3569593869236A7F5961AFF7FAA0D4D3696168670F61716D6A714F613661683E5B2D697768679EE8EEA5E7D85B6F6B6F3E67436369797F67046F6B366A2B5B796B6FADC3EBAAD2E46A6959613D6F72655B77736F3569593869236A7F5961ACD1D7A1C3F9696168670F61716D6A7140613661683E5B2D69776867350C07046A6959613D6F72655B767B6F3569593869236A7F5961AEC8FEA1C2D5696168670F61716D6A7048613610351804"));
        com.github.catvod.spider.merge.nU.StringUtils eVarB = com.github.catvod.spider.merge.nU.FilterValue.b(this.a, mapA);
        List<String> list = eVarB.c().get("set-cookie");
        if (!(list == null) && !list.isEmpty()) {
            this.b = list.get(0);
        }
        Subtitle hVarE = l.e(eVarB.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator itC = C0925t.c(new byte[]{-49, 57, 37, 18, -104, 31, 46, -86, -49, 57, 37, 23, -100, 11}, new byte[]{-31, 79, 122, 126, -15, 108, 90, -118}, hVarE);
        while (itC.hasNext()) {
            GeneralUtils mVar = (m) itC.next();
            if (arrayList2.size() > 5) {
                break;
            }
            C0924s.b(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), P.a(new byte[]{-91, -33, 58, 88, 62, 87, 82}, new byte[]{-117, -87, 101, 54, 81, 35, 55, -19}, mVar), arrayList2);
        }
        return com.github.catvod.spider.merge.KI.Subtitle.v(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        HashMap<String, String> mapA = a();
        mapA.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        super.init(context, str);
        C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l("http://shapp.us/", mapA)).o0(".content-top a");
        String strC = c0724gO0.isEmpty() ? "" : c0724gO0.get(0).c("href");
        if (!strC.isEmpty()) {
            str = strC;
        }
        this.a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strA = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a.concat(str2), a())).o0("iframe").a("src");
        com.github.catvod.spider.merge.KI.Subtitle hVar = new com.github.catvod.spider.merge.KI.h();
        hVar.y(strA);
        hVar.l();
        hVar.f(a());
        return hVar.toString();
    }

    public String searchContent(String str, boolean z) {
        Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(this.a + "/s----------.html?wd=" + URLEncoder.encode(str), a()));
        ArrayList arrayList = new ArrayList();
        Iterator itC = C0925t.c(new byte[]{61, 68, 2, -78, 18, 92, -117, 11, 61, 68, 2, -73, 22, 72}, new byte[]{19, 50, 93, -34, 123, 47, -1, 43}, hVarE);
        while (itC.hasNext()) {
            GeneralUtils mVar = (m) itC.next();
            C0924s.b(this.a + mVar.o0("a").a("href"), mVar.o0("a").a("title"), mVar.o0("img").a("data-original"), P.a(new byte[]{98, 77, 74, 48, -22, 11, -53}, new byte[]{76, 59, 21, 94, -123, 127, -82, -51}, mVar), arrayList);
        }
        return com.github.catvod.spider.merge.KI.Subtitle.q(arrayList);
    }
}
