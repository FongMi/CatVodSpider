package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.b.C0544h;
import com.github.catvod.spider.merge.b.C0547k;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.c.C0550a;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.k.C0575b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Duboku extends Spider {
    public static String a(int i, long j, int i2) {
        String string;
        Random random = new Random((System.currentTimeMillis() / 1000) + j);
        if (i2 == 33) {
            string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        } else if (i2 == 88) {
            string = "XYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i3 = i2; i3 < i2 + 62; i3++) {
                sb.append((char) i3);
            }
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < i; i4++) {
            sb2.append(string.charAt(random.nextInt(string.length())));
        }
        return sb2.toString();
    }

    public static String b() {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int iNextInt = new Random(jCurrentTimeMillis).nextInt(800000000) % 800000001;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String str = (100000000 + iNextInt) + String.valueOf(900000000 - iNextInt);
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(str.length(), strValueOf.length());
        for (int i = 0; i < iMin; i++) {
            sb.append(str.charAt(i));
            sb.append(strValueOf.charAt(i));
        }
        if (str.length() > iMin) {
            sb.append(str.substring(iMin));
        }
        if (strValueOf.length() > iMin) {
            sb.append(strValueOf.substring(iMin));
        }
        String strReplaceAll = Base64.encodeToString(sb.toString().getBytes(), 0).replaceAll("=", ".");
        String strA = a(60, 60 + jCurrentTimeMillis, 33);
        String strA2 = a(38, jCurrentTimeMillis + 38, 88);
        StringBuilder sbE = com.github.catvod.spider.merge.A.a.e("?sign=", strA, "&ssid=");
        sbE.append(strReplaceAll.replaceAll("=", "."));
        sbE.append("&token=");
        sbE.append(strA2);
        return sbE.toString();
    }

    public static HashMap c() {
        HashMap mapC = C0544h.c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)", "Connection", "Keep-Alive");
        mapC.put("Referer", "https://www.duboku.tv/");
        return mapC;
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 10;
            sb.append((CharSequence) new StringBuilder(str.substring(i, Math.min(i2, length))).reverse());
            i = i2;
        }
        return new String(Base64.decode(sb.toString().replaceAll("\\.", "="), 0));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        String string;
        HashMap map2 = new HashMap();
        if (map != null && map.size() > 0) {
            map2.putAll(map);
        }
        String str3 = map.get("cateId") == null ? str : map.get("cateId");
        String str4 = map.get("area") == null ? "" : map.get("area");
        String str5 = map.get("year") == null ? "" : map.get("year");
        String str6 = map.get("by") == null ? "" : map.get("by");
        String str7 = map.get("class") == null ? "" : map.get("class");
        String str8 = map.get("lang") == null ? "" : map.get("lang");
        StringBuilder sb = new StringBuilder("https://api.dbokutv.com");
        StringBuilder sbF = com.github.catvod.spider.merge.A.a.f("/vodshow/", str3, "-", str4, "-");
        x.a(sbF, str6, "-", str7, "-");
        x.a(sbF, str8, "----", str2, "---");
        sbF.append(str5);
        sb.append(sbF.toString());
        sb.append(b());
        String strL = C0575b.l(sb.toString(), c());
        int i = Integer.parseInt(str2);
        int iCeil = (int) Math.ceil(((double) Integer.MAX_VALUE) / ((double) 48));
        C0552c c0552c = new C0552c();
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM7c = com.github.catvod.spider.merge.A.a.m7c(strL, "VodList");
        for (int i2 = 0; i2 < jSONArrayM7c.length(); i2++) {
            JSONObject jSONObject = jSONArrayM7c.getJSONObject(i2);
            String strD = d(jSONObject.getString("DId"));
            String strD2 = d(jSONObject.getString("TnId"));
            String string2 = jSONObject.getString("Name");
            if (jSONObject.has("Tag")) {
                string = jSONObject.getString("Tag");
            } else if (jSONObject.has("Rating")) {
                string = jSONObject.getDouble("Rating") + "分";
            } else {
                string = "";
            }
            C0547k.b(strD, string2, strD2, string, arrayList);
        }
        c0552c.z(arrayList);
        c0552c.m95i(i, iCeil, 48, Integer.MAX_VALUE);
        return c0552c.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        JSONObject jSONObject = new JSONObject(C0575b.l("https://api.dbokutv.com" + str + b(), c()));
        C0554e c0554eB = com.github.catvod.spider.merge.A.a.b(str);
        String string = jSONObject.getString("Name");
        c0554eB.k(string);
        c0554eB.l(d(jSONObject.getString("TnId")));
        c0554eB.q(jSONObject.getString("ReleaseYear"));
        c0554eB.h(jSONObject.getString("Description"));
        c0554eB.f(jSONObject.getJSONArray("Actor").toString());
        c0554eB.i(jSONObject.getString("Director"));
        JSONArray jSONArray = jSONObject.getJSONArray("Playlist");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            StringBuilder sb = new StringBuilder();
            String string2 = jSONObject2.getString("EpisodeName");
            sb.append(string2);
            sb.append("$");
            sb.append(d(jSONObject2.getString("VId")));
            sb.append("|");
            sb.append(string2);
            sb.append("|");
            sb.append(string);
            arrayList.add(sb.toString());
        }
        if (arrayList.size() > 0) {
            linkedHashMap.put("独播库", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            com.github.catvod.spider.merge.A.a.p(linkedHashMap, "$$$", c0554eB, "$$$");
        }
        return C0552c.m(c0554eB);
    }

    public String homeContent(boolean z) throws JSONException {
        String string;
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4", "21", "20", "13", "15", "14");
        List listAsList2 = Arrays.asList("电影", "电视剧", "综艺", "动漫", "短剧", "港剧", "陆剧", "日韩剧", "台泰剧");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new C0550a((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        JSONObject jSONObject = new JSONObject("{\"1\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"澳大利亚\",\"v\":\"澳大利亚\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"法语\",\"v\":\"法语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"13\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"14\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"15\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"2\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"20\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"21\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"3\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"真人秀\",\"v\":\"真人秀\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"竞演\",\"v\":\"竞演\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"竞技\",\"v\":\"竞技\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"脱口秀\",\"v\":\"脱口秀\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"韩国\",\"v\":\"韩国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"韩语\",\"v\":\"韩语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}],\"4\":[{\"key\":\"class\",\"name\":\"class\",\"value\":[{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"年代\",\"v\":\"年代\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"历险\",\"v\":\"历险\"},{\"n\":\"罪案\",\"v\":\"罪案\"},{\"n\":\"宫廷\",\"v\":\"宫廷\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"穿越\",\"v\":\"穿越\"},{\"n\":\"同性\",\"v\":\"同性\"}]},{\"key\":\"area\",\"name\":\"area\",\"value\":[{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"泰国\",\"v\":\"泰国\"}]},{\"key\":\"year\",\"name\":\"year\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"lang\",\"name\":\"lang\",\"value\":[{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"泰语\",\"v\":\"泰语\"},{\"n\":\"日语\",\"v\":\"日语\"}]},{\"key\":\"letter\",\"name\":\"letter\",\"value\":[{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"},{\"n\":\"0~9\",\"v\":\"0~9\"}]},{\"key\":\"by\",\"name\":\"by\",\"value\":[{\"n\":\"时间\",\"v\":\"\"},{\"n\":\"人气\",\"v\":\"人气\"},{\"n\":\"评分\",\"v\":\"评分\"}]}]}");
        String strL = C0575b.l("https://api.dbokutv.com/home" + b(), c());
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = new JSONArray(strL);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i2).getJSONArray("VodList");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                String string2 = jSONObject2.getString("Name");
                String strD = d(jSONObject2.getString("DId"));
                String strD2 = d(jSONObject2.getString("TnId"));
                if (jSONObject2.has("Tag")) {
                    string = jSONObject2.getString("Tag");
                } else if (jSONObject2.has("Rating")) {
                    string = jSONObject2.getDouble("Rating") + "分";
                } else {
                    string = "";
                }
                C0547k.b(strD, string2, strD2, string, arrayList2);
            }
        }
        return C0552c.r(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List list) {
        String[] strArrSplit = str2.split("\\|");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        String str5 = strArrSplit[2];
        JSONObject jSONObject = new JSONObject(C0575b.l("https://api.dbokutv.com" + str3 + b(), c()));
        C0552c c0552c = new C0552c();
        c0552c.w(d(jSONObject.getString("HId")));
        c0552c.a(Proxy.getUrl() + "?do=appdanmu&vodName=" + str5 + "&vodIndex=" + str4);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36");
        map.put("origin", "https://w.duboku.io");
        map.put("referer", "https://w.duboku.io/");
        c0552c.m94e((Map) map);
        return c0552c.toString();
    }

    public String searchContent(String str, String str2) throws JSONException {
        String string;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(C0575b.l("https://api.dbokutv.com/vodsearch" + b() + "&wd=" + URLEncoder.encode(str), c()));
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strD = d(jSONObject.getString("DId"));
            String strD2 = d(jSONObject.getString("TnId"));
            String string2 = jSONObject.getString("Name");
            if (jSONObject.has("Tag")) {
                string = jSONObject.getString("Tag");
            } else if (jSONObject.has("Rating")) {
                string = jSONObject.getDouble("Rating") + "分";
            } else {
                string = "";
            }
            C0547k.b(strD, string2, strD2, string, arrayList);
        }
        return C0552c.i(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return searchContent(str, str2);
    }
}
