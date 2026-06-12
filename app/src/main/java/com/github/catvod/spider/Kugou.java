package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.Bk.l;
import com.github.catvod.spider.merge.KI.h;
import com.github.catvod.spider.merge.KI.k;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.bY.C0926u;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class Kugou extends Spider {
    private String fetchUrl(String url) {
        return com.github.catvod.spider.merge.nU.FilterValue.l(url, null);
    }

    private Map<String, String> buildHeaders() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        return map;
    }

    public String categoryContent(String typeId, String filterId, boolean filterGenre, HashMap<String, String> extend) {
        return !"1".equals(filterId) ? "" : getKuGouRank(typeId);
    }

    public String detailContent(List<String> ids) {
        String id = ids.get(0);
        return id.startsWith("kugou") ? getKuGouMusicList(id.split("_")[1]) : id.startsWith("aiting") ? getAiTingMusicList(id.split("_")[1]) : "";
    }

    public String getAiTingMusicList(String musicId) {
        try {
            JSONObject musicInfo = new JSONObject(com.github.catvod.spider.merge.nU.FilterValue.l("https://catbox.n13.club/yy.php?ac=videolist&ids=" + musicId, null)).optJSONArray("list").optJSONObject(0);
            k kVar = new k();
            kVar.g(musicId);
            kVar.h(jSONObjectOptJSONObject.optString("vod_name"));
            kVar.l("爱音乐爱生活");
            kVar.e("花语提醒你:如无法播放请使用影视...");
            kVar.j("爱音乐:爱生活");
            kVar.k(jSONObjectOptJSONObject.optString("vod_play_url").replace("$http", "$aiting-http"));
            return Subtitle.p(kVar);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAiTingMusicPlayUrl(String playUrl) {
        Subtitle result = new Subtitle();
        result.y(playUrl);
        result.l();
        return result.toString();
    }

    public String getAiTingRank() {
        try {
            int i = 7;
            byte b = 49;
            JSONArray rankArray = new JSONObject(com.github.catvod.spider.merge.nU.FilterValue.l("https://catbox.n13.club/yy.php?ac=videolist&t=djwuqu&pg=1", null)).optJSONArray("list");
            ArrayList<Subtitle> rankItems = new ArrayList<>();
            int index = 0;
            while (index < rankArray.length()) {
                JSONObject rankItem = rankArray.optJSONObject(index);
                k kVar = new k();
                StringBuilder nameBuilder = new StringBuilder();
                byte[] bArr = new byte[i];
                bArr[0] = -66;
                bArr[1] = 117;
                bArr[2] = 92;
                bArr[3] = 90;
                bArr[4] = 94;
                bArr[5] = 100;
                bArr[6] = b;
                nameBuilder.append(com.github.catvod.spider.merge.XI.f.a(bArr, new byte[]{-33, 28, 40, 51, 48, 3, 110, -4}));
                nameBuilder.append(rankItem.optString("vod_id"));
                kVar.g(nameBuilder.toString());
                kVar.h(rankItem.optString("vod_name"));
                kVar.i(rankItem.optString("vod_pic"));
                rankItems.add(kVar);
                index++;
                b = 49;
                i = 7;
            }
            return Subtitle.q(rankItems);
        } catch (Exception unused) {
            return "";
        }
    }

    public String getKuGouMusicList(String musicId) {
        try {
            StringBuilder sb = new StringBuilder();
            char c = 1;
            char c2 = 2;
            char c3 = 3;
            char c4 = 4;
            char c5 = 5;
            char c6 = 6;
            int i = 8;
            sb.append("http://mobilecdnbj.kugou.com/api/v3/rank/song?version=9108&ranktype=0&plat=0&pagesize=200&area_code=1&page=1&volid=35050&rankid=");
            sb.append(musicId);
            sb.append("&with_res_tag=0");
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(a(sb.toString())).optJSONObject("data").optJSONArray("info");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    byte[] bArr = new byte[i];
                    bArr[0] = -27;
                    bArr[c] = 13;
                    bArr[c2] = -102;
                    bArr[c3] = 48;
                    bArr[c4] = 76;
                    bArr[c5] = -15;
                    bArr[c6] = -74;
                    bArr[7] = 89;
                    byte[] bArr2 = new byte[i];
                    bArr2[0] = -125;
                    bArr2[c] = 100;
                    bArr2[c2] = -10;
                    bArr2[c3] = 85;
                    bArr2[c4] = 34;
                    bArr2[c5] = -112;
                    bArr2[6] = -37;
                    bArr2[7] = 60;
                    String strOptString = jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr, bArr2));
                    byte[] bArr3 = new byte[i];
                    bArr3[0] = -107;
                    bArr3[c] = -37;
                    bArr3[c2] = -28;
                    bArr3[c3] = 85;
                    bArr3[c4] = -89;
                    bArr3[c5] = 42;
                    bArr3[6] = -119;
                    bArr3[7] = -16;
                    byte[] bArr4 = new byte[i];
                    bArr4[0] = -12;
                    bArr4[c] = -73;
                    bArr4[c2] = -122;
                    bArr4[c3] = 32;
                    bArr4[c4] = -54;
                    bArr4[5] = 117;
                    bArr4[6] = -32;
                    bArr4[7] = -108;
                    String strOptString2 = jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr3, bArr4));
                    byte[] bArr5 = new byte[14];
                    bArr5[0] = -90;
                    bArr5[c] = 126;
                    bArr5[c2] = 101;
                    bArr5[c3] = i;
                    bArr5[4] = 84;
                    bArr5[5] = -75;
                    bArr5[6] = 61;
                    bArr5[7] = -81;
                    bArr5[i] = -93;
                    bArr5[9] = 123;
                    bArr5[10] = 104;
                    bArr5[11] = 34;
                    bArr5[12] = 80;
                    bArr5[13] = -114;
                    byte[] bArr6 = new byte[i];
                    bArr6[0] = -57;
                    bArr6[c] = 18;
                    bArr6[c2] = 7;
                    bArr6[c3] = 125;
                    bArr6[4] = 57;
                    bArr6[5] = -22;
                    bArr6[6] = 92;
                    bArr6[7] = -38;
                    String strOptString3 = jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr5, bArr6));
                    byte[] bArr7 = new byte[6];
                    bArr7[0] = 119;
                    bArr7[c] = -81;
                    bArr7[c2] = 80;
                    bArr7[c3] = -44;
                    bArr7[4] = 66;
                    bArr7[5] = -99;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 4;
                    bArr8[c] = -34;
                    bArr8[c2] = 56;
                    bArr8[3] = -75;
                    bArr8[4] = 49;
                    bArr8[5] = -11;
                    bArr8[6] = -41;
                    bArr8[7] = -124;
                    String strOptString4 = jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr7, bArr8));
                    if (TextUtils.isEmpty(strOptString4)) {
                        byte[] bArr9 = new byte[4];
                        bArr9[0] = -81;
                        bArr9[c] = 31;
                        bArr9[c2] = 119;
                        bArr9[3] = 103;
                        byte[] bArr10 = new byte[8];
                        bArr10[0] = -57;
                        bArr10[c] = 126;
                        bArr10[c2] = 4;
                        bArr10[3] = 15;
                        bArr10[4] = 103;
                        bArr10[5] = 63;
                        bArr10[6] = -128;
                        bArr10[7] = -79;
                        strOptString4 = jSONObjectOptJSONObject.optString(com.github.catvod.spider.merge.XI.f.a(bArr9, bArr10));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    byte[] bArr11 = new byte[11];
                    bArr11[0] = -104;
                    bArr11[c] = 39;
                    bArr11[2] = 45;
                    bArr11[3] = 105;
                    bArr11[4] = -52;
                    bArr11[5] = 105;
                    bArr11[6] = -20;
                    bArr11[7] = -5;
                    bArr11[8] = -52;
                    bArr11[9] = 127;
                    bArr11[10] = 7;
                    sb2.append(com.github.catvod.spider.merge.XI.f.a(bArr11, new byte[]{-68, 76, 88, 14, -93, 28, -63, -106}));
                    sb2.append(strOptString4);
                    sb2.append("_");
                    sb2.append(strOptString2);
                    sb2.append("_");
                    sb2.append(strOptString3);
                    arrayList.add(sb2.toString());
                    String strOptString5 = jSONObjectOptJSONObject.optString("mvhash");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        arrayList2.add(strOptString + "$kugou-mv_" + strOptString5);
                    }
                    i2++;
                    c = 1;
                    c2 = 2;
                    c3 = 3;
                    c4 = 4;
                    c5 = 5;
                    c6 = 6;
                    i = 8;
                }
                k kVar = new k();
                kVar.g(musicId);
                kVar.h("酷狗音乐");
                kVar.l("爱音乐爱生活");
                kVar.e("花语提醒你:如无法播放请使用影视...");
                kVar.j("MP3$$MV");
                kVar.k(TextUtils.join("#", arrayList) + "$$" + TextUtils.join("#", arrayList2));
                return Subtitle.p(kVar);
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    public java.lang.String getKuGouRank(java.lang.String rankType) {
        // TODO: Method not decompiled by JADX - needs manual reconstruction
        return "";
    }

    public String getKugouMusicPlayUrl(String playUrl) {
        String resolvedUrl;
        String resultUrl = "";
        if (!playUrl.startsWith("mp3")) {
            String musicId = playUrl.split("_")[1];
            StringBuilder sb = new StringBuilder();
            com.github.catvod.spider.merge.bY.v.c(new byte[]{-107, -110, -101, 38, 13, 126, -28, 74, -112, -56, -124, 35, 25, 43, -66, 75, -98, -119, -126, 121, 31, 52, -69, 74, -108, -55, -126, 32, 80, 52, -93, 21, -62, -123, -126, 50, 67, 117, -5, 85, -37, -114, -114, 37, 22, 121}, new byte[]{-3, -26, -17, 86, 126, 68, -53, 101}, sb, musicId);
            JSONObject playInfo = new JSONObject(com.github.catvod.spider.merge.nU.FilterValue.l(C0925t.a(new byte[]{18, -9, 115, 28, 115, -120, 92, -114, 18, -5, 120, 5, 62, -42, 17, -117}, new byte[]{52, -98, 0, 113, 3, -69, 97, -65}, sb), null)).optJSONObject("mvdata");
            if (playInfo.has("sq")) {
                Subtitle result = new Subtitle();
                result.y(playInfo.optJSONObject("sq").optString("downurl"));
                result.l();
                result.f(buildHeaders());
                return result.toString();
            }
            if (!playInfo.has("le")) {
                return "";
            }
            Subtitle result2 = new Subtitle();
            result2.y(playInfo.optJSONObject("le").optString("downurl"));
            result2.l();
            result2.f(buildHeaders());
            return result2.toString();
        }
        JSONObject musicDetail = new JSONObject(com.github.catvod.spider.merge.nU.FilterValue.l(C0926u.a(new byte[]{-84, -111, -117, -106, 30, -45, -19, -118, -87, -53, -108, -109, 10, -122, -73, -117, -89, -118, -110, -55, 12, -103, -78, -118, -83, -54, -104, -125, 25, -70, -83, -53, -93, -84, -111, -128, 2, -57, -78, -51, -76, -38, -100, -117, 9, -44, -78, -55, -91, -100, -74, -120, 11, -122, -28, -51, -91, -106, -105, -37}, new byte[]{-60, -27, -1, -26, 109, -23, -62, -91}, new StringBuilder(), playUrl.split("_")[1]), null));
        if (musicDetail.optString("error").contains("要付费")) {
            String songName = musicDetail.optString("songName");
            String artistName = musicDetail.optString("author_name");
            Iterator itC = C0925t.c(new byte[]{-22, 15, 88, -101, -108, 122, -127, -114, -65, 15, 31, -42, -33, 54, -64}, new byte[]{-97, 99, 118, -10, -31, 22, -95, -80}, l.e(com.github.catvod.spider.merge.nU.FilterValue.l("https://www.sq0527.cn/search?ac=" + URLEncoder.encode(songName), null)));
            while (true) {
                if (!itC.hasNext()) {
                    strC = "";
                    break;
                }
                GeneralUtils mVar = (m) itC.next();
                String linkText = mVar.v0();
                if (linkText.contains(songName) && linkText.contains(artistName)) {
                    resolvedUrl = mVar.c("href");
                    break;
                }
            }
            if (!TextUtils.isEmpty(resolvedUrl)) {
                resultUrl = l.e(com.github.catvod.spider.merge.nU.FilterValue.l("https://www.sq0527.cn" + resolvedUrl, null)).o0("#btn-download-mp3").a("href");
            }
        } else {
            resultUrl = !TextUtils.isEmpty(musicDetail.optString("url")) ? musicDetail.optString("url") : musicDetail.optJSONArray("backup_url").optString(0);
        }
        Subtitle finalResult = new Subtitle();
        finalResult.y(resultUrl);
        finalResult.l();
        return finalResult.toString();
    }

    public String homeContent(boolean filterGenre) {
        ArrayList categories = new ArrayList<>();
        JSONObject categoryData = new JSONObject("{\"热门榜\":\"hot\",\"特色榜\":\"special\",\"全球榜\":\"global\"}");
        Iterator<String> keys = categoryData.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            categories.add(new com.github.catvod.spider.merge.KI.a(categoryData.optString(key), key));
        }
        return Subtitle.t(categories, new ArrayList<>());
    }

    public String playerContent(String key, String playFlag, List<String> vipFlags) {
        return playFlag.startsWith("kugou") ? getKugouMusicPlayUrl(playFlag.split("-")[1]) : playFlag.startsWith("aiting") ? getAiTingMusicPlayUrl(playFlag.split("-")[1]) : "";
    }
}
