package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.KI.Subtitle;
import com.github.catvod.spider.merge.ZrJ;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class YGP extends Spider {
    private static final String b = "https://www.6huo.com/";
    private static final String c = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36";
    private JSONObject a;

    private static String b(Pattern pattern, String str) {
        if (pattern == null) {
            return str;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    protected final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("method", "GET");
        map.put("User-Agent", c);
        map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        try {
            char c2 = 0;
            byte b2 = 1;
            char c3 = 2;
            char c4 = 3;
            int i3 = 4;
            String[] strArr = {"", "", "", "", ""};
            String str3 = b + str;
            strArr[4] = str2;
            if (map != null && map.size() > 0) {
                for (String str4 : map.keySet()) {
                    strArr[Integer.parseInt(str4)] = URLEncoder.encode(map.get(str4));
                }
            }
            String strL = com.github.catvod.spider.merge.nU.FilterValue.l(str3 + TextUtils.join("_", strArr), a());
            Subtitle hVarE = l.e(strL);
            JSONObject jSONObject = new JSONObject();
            C0724g c0724gO0 = hVarE.o0("p.page-nav a");
            if (c0724gO0.size() == 0) {
                i2 = Integer.parseInt(str2);
                i = i2;
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < c0724gO0.size(); i5++) {
                    GeneralUtils mVar = c0724gO0.get(i5);
                    if (isNumeric(mVar.v0()) && i4 < Integer.parseInt(mVar.v0())) {
                        i4 = Integer.parseInt(mVar.v0());
                    }
                }
                i = Integer.parseInt(hVarE.o0("p.page-nav a.current").h());
                i2 = i4;
            }
            JSONArray jSONArray = new JSONArray();
            if (!strL.contains("没有找到您想要的结果哦")) {
                C0724g c0724gO02 = hVarE.o0("div.inner-2col-main div.movlist > ul li > a");
                int i6 = 0;
                while (i6 < c0724gO02.size()) {
                    GeneralUtils mVar2 = c0724gO02.get(i6);
                    byte[] bArr = new byte[i3];
                    bArr[c2] = 21;
                    bArr[b2] = -42;
                    bArr[c3] = b2;
                    bArr[c4] = 12;
                    byte[] bArr2 = new byte[8];
                    bArr2[c2] = 125;
                    bArr2[b2] = -92;
                    bArr2[c3] = 100;
                    bArr2[c4] = 106;
                    bArr2[4] = 102;
                    bArr2[5] = -1;
                    bArr2[6] = -1;
                    bArr2[7] = 85;
                    String strC = mVar2.c(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
                    byte[] bArr3 = new byte[4];
                    bArr3[c2] = 118;
                    bArr3[b2] = 95;
                    bArr3[c3] = 18;
                    bArr3[c4] = -76;
                    byte[] bArr4 = new byte[8];
                    bArr4[c2] = 5;
                    bArr4[b2] = 47;
                    bArr4[c3] = 115;
                    bArr4[3] = -38;
                    bArr4[4] = 43;
                    bArr4[5] = -104;
                    bArr4[6] = 16;
                    bArr4[7] = 118;
                    GeneralUtils mVarP0 = mVar2.p0(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                    byte[] bArr5 = new byte[5];
                    bArr5[c2] = 92;
                    bArr5[b2] = 102;
                    bArr5[c3] = -19;
                    bArr5[3] = 6;
                    bArr5[4] = 99;
                    byte[] bArr6 = new byte[8];
                    bArr6[c2] = 40;
                    bArr6[b2] = 15;
                    bArr6[2] = -103;
                    bArr6[3] = 106;
                    bArr6[4] = 6;
                    bArr6[5] = 44;
                    bArr6[6] = 102;
                    bArr6[7] = -93;
                    String strC2 = mVarP0.c(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                    byte[] bArr7 = new byte[3];
                    bArr7[c2] = 43;
                    bArr7[b2] = 107;
                    bArr7[2] = 72;
                    byte[] bArr8 = new byte[8];
                    bArr8[c2] = 66;
                    bArr8[b2] = 6;
                    bArr8[2] = 47;
                    bArr8[3] = 48;
                    bArr8[4] = -114;
                    bArr8[5] = -80;
                    bArr8[6] = 55;
                    bArr8[7] = 67;
                    GeneralUtils mVarP02 = mVar2.p0(com.github.catvod.spider.merge.XI.f.a(bArr7, bArr8));
                    byte[] bArr9 = new byte[3];
                    bArr9[c2] = -5;
                    bArr9[b2] = 127;
                    bArr9[2] = 43;
                    byte[] bArr10 = new byte[8];
                    bArr10[c2] = -120;
                    bArr10[1] = 13;
                    bArr10[2] = 72;
                    bArr10[3] = -26;
                    bArr10[4] = -5;
                    bArr10[5] = -74;
                    bArr10[6] = -28;
                    bArr10[7] = 42;
                    String strC3 = mVarP02.c(com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10));
                    byte[] bArr11 = new byte[4];
                    bArr11[c2] = -82;
                    bArr11[1] = 69;
                    bArr11[2] = -83;
                    bArr11[3] = 80;
                    byte[] bArr12 = new byte[8];
                    bArr12[c2] = -58;
                    bArr12[1] = 49;
                    bArr12[2] = -39;
                    bArr12[3] = 32;
                    bArr12[4] = -23;
                    bArr12[5] = -53;
                    bArr12[6] = -118;
                    bArr12[7] = 97;
                    if (!strC3.contains(com.github.catvod.spider.merge.XI.f.a(bArr11, bArr12))) {
                        strC3 = b + strC3;
                    }
                    byte[] bArr13 = new byte[4];
                    bArr13[c2] = -46;
                    bArr13[1] = 49;
                    bArr13[2] = -90;
                    bArr13[3] = -97;
                    byte[] bArr14 = new byte[8];
                    bArr14[c2] = -95;
                    bArr14[1] = 65;
                    bArr14[2] = -57;
                    bArr14[3] = -15;
                    bArr14[4] = 119;
                    bArr14[5] = 10;
                    bArr14[6] = 25;
                    bArr14[7] = 94;
                    String strV0 = mVar2.o0(com.github.catvod.spider.merge.XI.f.a(bArr13, bArr14)).f().v0();
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] bArr15 = new byte[6];
                    bArr15[c2] = -57;
                    bArr15[1] = 88;
                    bArr15[2] = 86;
                    bArr15[3] = 55;
                    bArr15[4] = -122;
                    bArr15[5] = -104;
                    jSONObject2.put(com.github.catvod.spider.merge.XI.f.a(bArr15, new byte[]{-79, 55, 50, 104, -17, -4, -116, -32}), strC);
                    jSONObject2.put("vod_name", strC2);
                    jSONObject2.put("vod_pic", strC3);
                    jSONObject2.put("vod_remarks", strV0);
                    jSONArray.put(jSONObject2);
                    i6++;
                    c2 = 0;
                    b2 = 1;
                    c3 = 2;
                    c4 = 3;
                    i3 = 4;
                }
            }
            jSONObject.put("page", i);
            jSONObject.put("pagecount", i2);
            jSONObject.put("limit", 30);
            jSONObject.put("total", i2 <= 1 ? jSONArray.length() : i2 * 30);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strA;
        try {
            StringBuilder sb = new StringBuilder();
            String str = b;
            sb.append(str);
            char c2 = 0;
            sb.append(list.get(0));
            Subtitle hVarE = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(sb.toString(), a()));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            hVarE.o0("div.inner-wrapper").get(0);
            String strA2 = hVarE.o0("div.movie-title-mpic > a >img").a("src");
            if (!strA2.contains("http")) {
                strA2 = str + strA2;
            }
            String strH = hVarE.o0("h1.movie-name").h();
            String str2 = "";
            String strV0 = "";
            String str3 = "";
            C0724g c0724gO0 = hVarE.o0("div.movie-title-detail a");
            int i = 0;
            while (i < c0724gO0.size()) {
                GeneralUtils mVar = c0724gO0.get(i);
                byte[] bArr = new byte[4];
                bArr[c2] = -105;
                bArr[1] = 62;
                bArr[2] = -51;
                bArr[3] = -106;
                JSONObject jSONObject3 = jSONObject;
                if (mVar.c(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{-1, 76, -88, -16, 9, -121, 124, -82})).contains("country")) {
                    strV0 = c0724gO0.get(i).v0();
                }
                if (c0724gO0.get(i).c("href").contains("movietype")) {
                    str2 = str2 + c0724gO0.get(i).v0() + "/";
                }
                i++;
                jSONObject = jSONObject3;
                c2 = 0;
            }
            JSONObject jSONObject4 = jSONObject;
            String strB = b(Pattern.compile("导演：(.+)主演"), hVarE.o0("div.movie-title-detail p").h());
            String strB2 = b(Pattern.compile("上映：(\\w+)"), hVarE.o0("div.movie-title-detail p").h());
            String strB3 = b(Pattern.compile("主演：(.+)剧情"), hVarE.o0("div.movie-title-detail p").h());
            String strB4 = b(Pattern.compile("剧情：(.+)\\(详细\\)"), hVarE.o0("div.movie-title-detail p").h());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0724g c0724gO02 = hVarE.o0("#tabwrapper-all > .tlist");
            String strA3 = "";
            String str4 = "";
            int i2 = 0;
            while (i2 < c0724gO02.size()) {
                ArrayList arrayList3 = new ArrayList();
                String str5 = strB3;
                String str6 = str3;
                arrayList.add(c0724gO02.g("th").e().v0());
                C0724g c0724g = c0724gO02;
                C0724g c0724gO03 = c0724gO02.get(i2).o0("td a.tlist-bbs-tdtitle");
                int i3 = 0;
                while (i3 < c0724gO03.size()) {
                    arrayList3.add(c0724gO03.get(i3).v0() + "$" + c0724gO03.get(i3).c("href"));
                    i3++;
                    c0724gO03 = c0724gO03;
                    strV0 = strV0;
                    strB2 = strB2;
                }
                String str7 = strB2;
                String str8 = strV0;
                String strJoin = arrayList3.size() > 1 ? TextUtils.join("#", arrayList3) : (String) arrayList3.get(0);
                arrayList2.add(strJoin);
                if (arrayList2.size() > 1) {
                    String strJoin2 = TextUtils.join("$$", arrayList2);
                    strA3 = TextUtils.join("$$", arrayList);
                    str4 = strJoin2;
                } else {
                    str4 = strJoin;
                    strA3 = (String) arrayList.get(0);
                }
                i2++;
                strB3 = str5;
                str3 = str6;
                c0724gO02 = c0724g;
                strV0 = str8;
                strB2 = str7;
            }
            String str9 = strB2;
            String str10 = str3;
            String str11 = strB3;
            String str12 = strV0;
            if (strA3.equals("")) {
                strA = "暂无预告$www";
                strA3 = "暂无预告";
            } else {
                strA = str4;
            }
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strH);
            jSONObject2.put("vod_pic", strA2);
            jSONObject2.put("type_name", str2);
            jSONObject2.put("vod_year", str9);
            jSONObject2.put("vod_area", str12);
            jSONObject2.put("vod_remarks", str10);
            jSONObject2.put("vod_actor", str11);
            jSONObject2.put("vod_director", strB);
            jSONObject2.put("vod_content", strB4);
            jSONObject2.put("vod_play_from", strA3);
            jSONObject2.put("vod_play_url", strA);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject4.put("list", jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            byte b2 = 7;
            int i = 3;
            int i2 = 4;
            int i3 = 5;
            int i4 = 8;
            jSONObject2.put("type_id", "movlist/");
            jSONObject2.put("type_name", "预告片世界");
            jSONArray.put(jSONObject2);
            jSONObject.put("class", jSONArray);
            if (z) {
                try {
                    jSONObject.put("filters", this.a);
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                    return "";
                }
            }
            C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(b, a())).o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray2 = new JSONArray();
            int i5 = 0;
            while (i5 < 30) {
                GeneralUtils mVar = c0724gO0.get(i5);
                byte[] bArr = new byte[i2];
                bArr[0] = -16;
                bArr[1] = i2;
                bArr[2] = -51;
                bArr[i] = 97;
                byte[] bArr2 = new byte[i4];
                bArr2[0] = -104;
                bArr2[1] = 118;
                bArr2[2] = -88;
                bArr2[i] = b2;
                bArr2[i2] = i2;
                bArr2[i3] = -90;
                bArr2[6] = -12;
                bArr2[b2] = -98;
                String strC = mVar.c(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
                byte[] bArr3 = new byte[i2];
                bArr3[0] = -94;
                bArr3[1] = -11;
                bArr3[2] = 110;
                bArr3[i] = 112;
                byte[] bArr4 = new byte[i4];
                bArr4[0] = -47;
                bArr4[1] = -123;
                bArr4[2] = 15;
                bArr4[i] = 30;
                bArr4[i2] = 22;
                bArr4[i3] = 81;
                bArr4[6] = 111;
                bArr4[7] = 109;
                GeneralUtils mVarP0 = mVar.p0(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                byte[] bArr5 = new byte[i3];
                bArr5[0] = -69;
                bArr5[1] = 70;
                bArr5[2] = -21;
                bArr5[i] = 45;
                bArr5[i2] = 127;
                byte[] bArr6 = new byte[i4];
                bArr6[0] = -49;
                bArr6[1] = 47;
                bArr6[2] = -97;
                bArr6[i] = 65;
                bArr6[i2] = 26;
                bArr6[5] = 112;
                bArr6[6] = 98;
                bArr6[7] = -89;
                String strC2 = mVarP0.c(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                byte[] bArr7 = new byte[i];
                bArr7[0] = 35;
                bArr7[1] = 6;
                bArr7[2] = 87;
                byte[] bArr8 = new byte[i4];
                bArr8[0] = 74;
                bArr8[1] = 107;
                bArr8[2] = 48;
                bArr8[i] = -47;
                bArr8[i2] = 101;
                bArr8[5] = i2;
                bArr8[6] = -120;
                bArr8[7] = -13;
                GeneralUtils mVarP02 = mVar.p0(com.github.catvod.spider.merge.XI.f.a(bArr7, bArr8));
                byte[] bArr9 = new byte[i];
                bArr9[0] = 56;
                bArr9[1] = 7;
                bArr9[2] = 100;
                byte[] bArr10 = new byte[i4];
                bArr10[0] = 75;
                bArr10[1] = 117;
                bArr10[2] = 7;
                bArr10[i] = -109;
                bArr10[4] = -70;
                bArr10[5] = 29;
                bArr10[6] = 24;
                bArr10[7] = 98;
                String strC3 = mVarP02.c(com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10));
                byte[] bArr11 = new byte[4];
                bArr11[0] = 73;
                bArr11[1] = 86;
                bArr11[2] = -123;
                bArr11[i] = 107;
                byte[] bArr12 = new byte[i4];
                bArr12[0] = 33;
                bArr12[1] = 34;
                bArr12[2] = -15;
                bArr12[i] = 27;
                bArr12[4] = 27;
                bArr12[5] = -75;
                bArr12[6] = -121;
                bArr12[7] = -23;
                if (!strC3.contains(com.github.catvod.spider.merge.XI.f.a(bArr11, bArr12))) {
                    strC3 = b + strC3;
                }
                byte[] bArr13 = new byte[4];
                bArr13[0] = 90;
                bArr13[1] = -111;
                bArr13[2] = 111;
                bArr13[i] = 58;
                byte[] bArr14 = new byte[i4];
                bArr14[0] = 41;
                bArr14[1] = -31;
                bArr14[2] = 14;
                bArr14[i] = 84;
                bArr14[4] = -89;
                bArr14[5] = 81;
                bArr14[6] = 14;
                bArr14[7] = -110;
                String strV0 = mVar.o0(com.github.catvod.spider.merge.XI.f.a(bArr13, bArr14)).f().v0();
                JSONObject jSONObject3 = new JSONObject();
                byte[] bArr15 = new byte[6];
                bArr15[0] = -28;
                bArr15[1] = 106;
                bArr15[2] = -15;
                bArr15[i] = -29;
                bArr15[4] = 51;
                bArr15[5] = 93;
                jSONObject3.put(com.github.catvod.spider.merge.XI.f.a(bArr15, new byte[]{-110, 5, -107, -68, 90, 57, -13, -66}), strC);
                jSONObject3.put("vod_name", strC2);
                jSONObject3.put("vod_pic", strC3);
                jSONObject3.put("vod_remarks", strV0);
                jSONArray2.put(jSONObject3);
                i5++;
                b2 = 7;
                i4 = 8;
                i = 3;
                i2 = 4;
                i3 = 5;
            }
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void init(Context context) {
        super.init(context);
        try {
            this.a = new JSONObject(ZrJ.d("026126223E2910303F626A7F223869262D3C5B79697C6A695B2D2A202D674361ACFCF3A0E7C869616A33182F3E286A7F223869236A7F5BA6CEE5A1C6D161676F3E6743616930643E5B2D69776AA0EFDFAEC4EF6755613D6F72679CD5D7A8C1E25B3E67366A2B5B7969AAC0F49FC0CE6F64670F61716FAFCDC8A5C8C86A38553869236A7F5BA5CADDAEC5EF61676F3E674361ADCCD8A3F9D56930643E5B2D69776AA0F3EBAFF0D46755613D6F72679CC9E3A9F5D95B3E67366A2B5B7969AAEFD49CFAF06F64670F61716FAFE2E8A6F2F66A38553869236A7F5BA6C2EAAEC6FC61676F3E674361AEC4EFA3FAC66930643E5B2D69776AA3F1DBAFF7C16755613D6F72679FCBD3A9F2CC5B3E67366A2B5B7969AAC2EA9EFEE16F64670F61716FAFCFD6A4F6E76A38553869236A7F5BA4CAF3A1DFC761676F3E674361ACCCF6ACE3FD6930643E5B2D69776AA0DCC4AEF4F36755613D6F72679CE6CCA8F1FE5B3E67366A2B5B7969ABCAE99ED5DA6F64670F61716FAEC7D5A4DDDC6A38553869236A7F5BA5C8C7AEC7E361676F3E674361ADCEC2A3FBD96930643E5B2D69776AA0FFD1A2D4E16755613D6F72679CC5D9A4D1EC5B3E1630643E5B282E346A7F5B7369616A2B182E2E6F72679CDFFBA8C4FF5B6F693B29290C266977133E5B2D69776AA0FCEBA2CEE06755613D6F72675B3E67366A2B5B7969A8ECE290DACD6F64670F61716FADE1DEAAD2CB6A38553869236A7F5BAAEDD4AEFDD661676F3E674361A2EBD1A3C1EC6930643E5B2D69776AA0F6F3ADF4F66755613D6F72679CCCFBABF1FB5B3E67366A2B5B7969AAF6CB9CD8F66F64670F61716FAFFBF7A6D0F06A38553869236A7F5BA5F8D8ADDEC461676F3E674361ADFEDDA0E2FE6930643E5B2D69776AADF2F2AED6F56755613D6F726791C8FAA8D3F85B3E67366A2B5B7969ABDFE09FDFE76F64670F61716FAED2DCA5D7E16A38553869236A7F5BAAD4E4ADDEC461676F3E674361A2D2E1A0E2FE6930643E5B2D69776AA0C7F4AED6F56755613D6F72679CFDFCA8D3F85B3E67366A2B5B7969ABFBF59CD8F66F64670F61716FAEF6C9A6D0F06A38553869236A7F5BA6C6FDADFFDF61676F3E674361AEC0F8A0C3E56930643E5B2D69776AA0FCF5AFF6DE6755613D6F72679CC6FDA9F3D35B3E1630643E5B282E346A7F5B7169616A2B182E2E6F72679CFAFFA9F3F85B6F693B29290C266977133E5B2D69776AA0FCEBA2CEE06755613D6F72675B3E67366A2B5B79697F78774D61676F3E674361797D7A715B3E67366A2B5B79697F78774A61676F3E674361797D7A765B3E67366A2B5B79697F78774B61676F3E674361797D7A775B3E67366A2B5B79697F78774861676F3E674361797D7A745B3E67366A2B5B79697F78774961676F3E674361797D7A755B3E67366A2B5B79697F78744061676F3E674361797D797C5B3E67366A2B5B79697F78744161676F3E674361797D797D5B3E67366A2B5B79697F78744E61676F3E674361797D79725B3E67366A2B5B79697F78744F61676F3E674361797D79735B3E67366A2B5B79697F78744C61676F3E674361797D79705B3E67366A2B5B79697F78744D61676F3E674361797D79715B3E67366A2B5B79697F78744A61676F3E674361797D79765B3E67366A2B5B79697F78744B61676F3E674361797D79775B3E67366A2B5B79697F78744861676F3E674361797D79745B3E67366A2B5B79697F78744961676F3E674361797D79755B3E67366A2B5B79697F78754061676F3E674361797D787C5B3E67366A2B5B79697F78754161676F3E674361797D787D5B3E67366A2B5B79697F78754E61676F3E674361797D78725B3E67366A2B5B79697F78754F61676F3E674361797D78735B3E67366A2B5B79697F78754C61676F3E674361797D78705B3E67366A2B5B79697F78754D61676F3E674361797D78715B3E67366A2B5B79697F78754A61676F3E674361797D78765B3E67366A2B5B79697F78754B61676F3E674361797D78775B3E67366A2B5B79697F78754861676F3E674361797D78745B3E67366A2B5B79697F78754961676F3E674361797D78755B3E67366A2B5B79697C717C4061676F3E6743617A74717C5B3E67366A2B5B79697C717C4161676F3E6743617A74717D5B3E67366A2B5B79697C717D4961676F3E6743617A7470755B3E1630643E5B282E346A7F5B7069616A2B182E2E6F72679FCDD9A8F2CA5B6F693B29290C266977133E5B2D69776AA3E5C3A3F2D9A3E2F7ADDBF86755613D6F72675B3E67366A2B5B7969AACBE890D4E36F64670F61716F202A0D61366133671761716FACFDF3A5D3EDAED2CFAADCF96A695B3569776A350C213F2425205B3E16301538"));
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = b + str2;
            jSONObject.put("parse", 1);
            jSONObject.put("url", str3);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v23 */
    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            int i = 4;
            int i2 = 5;
            char c2 = 6;
            char c3 = 7;
            int i3 = 8;
            sb.append("https://www.6huo.com/?keyword=");
            sb.append(URLEncoder.encode(str));
            sb.append("&view=search");
            C0724g c0724gO0 = l.e(com.github.catvod.spider.merge.nU.FilterValue.l(sb.toString(), a())).o0("div.inner-2col-main div.movlist > ul li > a");
            JSONArray jSONArray = new JSONArray();
            int i4 = 0;
            while (i4 < c0724gO0.size()) {
                GeneralUtils mVar = c0724gO0.get(i4);
                byte[] bArr = new byte[i];
                bArr[0] = 36;
                bArr[1] = 107;
                bArr[2] = -13;
                bArr[3] = -108;
                byte[] bArr2 = new byte[i3];
                bArr2[0] = 76;
                bArr2[1] = 25;
                bArr2[2] = -106;
                bArr2[3] = -14;
                bArr2[i] = 91;
                bArr2[i2] = 11;
                bArr2[c2] = -103;
                bArr2[c3] = 15;
                String strC = mVar.c(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
                byte[] bArr3 = new byte[i];
                bArr3[0] = 127;
                bArr3[1] = -57;
                bArr3[2] = 33;
                bArr3[3] = 82;
                byte[] bArr4 = new byte[i3];
                bArr4[0] = 12;
                bArr4[1] = -73;
                bArr4[2] = 64;
                bArr4[3] = 60;
                bArr4[i] = -83;
                bArr4[i2] = 46;
                bArr4[c2] = 127;
                bArr4[7] = -10;
                GeneralUtils mVarP0 = mVar.p0(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                byte[] bArr5 = new byte[i2];
                bArr5[0] = 86;
                bArr5[1] = 59;
                bArr5[2] = -43;
                bArr5[3] = -12;
                bArr5[i] = -118;
                byte[] bArr6 = new byte[i3];
                bArr6[0] = 34;
                bArr6[1] = 82;
                bArr6[2] = -95;
                bArr6[3] = -104;
                bArr6[i] = -17;
                bArr6[i2] = 19;
                bArr6[6] = -72;
                bArr6[7] = 18;
                String strC2 = mVarP0.c(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                byte[] bArr7 = new byte[i3];
                bArr7[0] = 43;
                bArr7[1] = 106;
                bArr7[2] = -19;
                bArr7[3] = -98;
                bArr7[i] = 17;
                bArr7[i2] = -13;
                bArr7[6] = -126;
                bArr7[7] = -110;
                byte[] bArr8 = new byte[i3];
                bArr8[0] = 43;
                bArr8[1] = 1;
                bArr8[2] = 55;
                bArr8[3] = 38;
                bArr8[i] = 85;
                bArr8[5] = i;
                bArr8[6] = 24;
                bArr8[7] = 66;
                String strC3 = mVar.p0(com.github.catvod.spider.merge.XI.f.a(new byte[]{66, 7, -118}, bArr7)).c(com.github.catvod.spider.merge.XI.f.a(new byte[]{88, 115, 84}, bArr8));
                byte[] bArr9 = new byte[i];
                bArr9[0] = -24;
                bArr9[1] = 18;
                bArr9[2] = 24;
                bArr9[3] = -19;
                byte[] bArr10 = new byte[i3];
                bArr10[0] = -128;
                bArr10[1] = 102;
                bArr10[2] = 108;
                bArr10[3] = -99;
                bArr10[i] = 67;
                bArr10[5] = -109;
                bArr10[6] = -36;
                bArr10[7] = -123;
                if (!strC3.contains(com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10))) {
                    strC3 = b + strC3;
                }
                byte[] bArr11 = new byte[i];
                bArr11[0] = 96;
                bArr11[1] = -42;
                bArr11[2] = 114;
                bArr11[3] = 33;
                byte[] bArr12 = new byte[i3];
                bArr12[0] = 19;
                bArr12[1] = -90;
                bArr12[2] = 19;
                bArr12[3] = 79;
                bArr12[i] = 46;
                bArr12[5] = 78;
                bArr12[6] = -126;
                bArr12[7] = 23;
                String strV0 = mVar.o0(com.github.catvod.spider.merge.XI.f.a(bArr11, bArr12)).f().v0();
                JSONObject jSONObject2 = new JSONObject();
                byte[] bArr13 = new byte[6];
                bArr13[0] = -82;
                bArr13[1] = 89;
                bArr13[2] = 21;
                bArr13[3] = 83;
                bArr13[i] = 98;
                bArr13[5] = 82;
                jSONObject2.put(com.github.catvod.spider.merge.XI.f.a(bArr13, new byte[]{-40, 54, 113, 12, 11, 54, -87, -95}), strC);
                jSONObject2.put("vod_name", strC2);
                jSONObject2.put("vod_pic", strC3);
                jSONObject2.put("vod_remarks", strV0);
                jSONArray.put(jSONObject2);
                i4++;
                i = 4;
                i2 = 5;
                c2 = 6;
                c3 = 7;
                i3 = 8;
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
