package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.MN;
import com.github.catvod.spider.merge.Yy;
import com.github.catvod.spider.merge.xv;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

public class APPTT extends Spider {

    private String l8 = "";
    private String S = "";
    private String T4 = "";
    private String b = "";
    private String OL = "";
    private String l = "MIIEpQIBAAKCAQEA5iLxDPp5E1Lr6TRSEWXHJ909jw63wXRG5U0kEsP1Ys+AgziF/G2vYplf28ZVFh2EROTu3fj6WSKhcWuzJ/tUpoNe0APCUabkFde+2B1PBviSNvSLLMli5mflXYVaXVkAq7eftIAxO6EHnZ1GNQt2F4HLjqHPtEWUEP+x0VszBdiHhcOl3ev2sKZzJKM3c8Qn+/aXXWIh9NxJwFztizfEWAaSLGHGDlLxetmaW1RmTLVpgtJOYzLoQrxPP/ghMOMstuM2VYP0fIKlXgG8Cmrs9AnrwlhwSl0Mc5+M1DRpF2JVxlxtoQuc+K4qQMtmBeA++9vWj7v78371DobHYcceLQIDAQABAoIBAQCOJcb+XTer1+wff1GxrUv2M5Fya4TU2R1xRNSjQqavAbw/UQpxgM5z+IhdF4Q2xMSOSVnBgaggpmNRy1Q9vd/refl2Qtwj0xHO7BPVKUVG6QJnL2VHpJyR9FqYCWZngjIH3sOmmgfO7QfnMt3KpemrW2CAGTJSBygN1+HdjpdVY91gsi1Q60ecwE74PYZ1Cg63hnqun2aKvQbX4Y88ZSmp9lczFdmmDPqJE0rTHWOBwsuZ3bQElG19cYHChwDJgDLPrP+9RbHOVJxPz0zSjPlPVhUl1OAkViY2E+CXGEKpQmmPOMytu3qbmIpwWiTtr/yl1b7AAEI/4QSuSEwGr0wBAoGBAPjNEtRyZMUI8n5usG/b7U+q6+HF0ezJCjbFIhF7pPrzOA66tFl2u98EySUZPAzG74bPQADELQZfTc7KxqywB3g+ErFnJ0f/DLNs87rLYlQwWQaL61z8RdSdoc2dPWGUgsiULct68pBfEQ/qR9alAhAWYbjOHGeHNLpNkD/uUUQ5AoGBAOzLnYEPF1RphlkiVyoH2T/ruNYKWGvzIk3xDuZlDCvaYnCQWvp7A4ogK9rO5M3kPZrhc3R2SvqqxiI6czRzFzm8AMnf9ZJB7EPfx5nSmgbgvDMmx7M4s2HaE3WvOAe0OEYNVetdssyBNT+EoCmJNb6lAa0ZqUeFXQVu66MUx7GVAoGBALzs1ECYQObRnXneSYIXSYO2cXm2gmrAWk4usWj/L88Tg1zD75EDtTNraeYO3GeDZH1EwQAT93CgS/AcUHLvFCz9TaqCfvSPurBAqm8MY7U0JVXwR6ALPGdv71636NVBNXJj+sZJrQlt9wHT0Aswr3lR1ZDEihMfOy3BGilBqVoZAoGBAIXe+3WqTXs4iW68/mBRvZ3oqz++64xkEYHVBaJ1gDMOrNaMlhLEFxUw6Po0O6C3J6j3SqmN8wfSIl/ZgaYmZvwJ8LwwtInyYRtiWVr6eH/o8B1PEFmfdbKdcqD25YtddO8NvQRqnZoGdk8psM6qtsrISLFPL6eymwtmUSuKpPcdAoGACxQPMb2wMxhexC8efCmDx85HY5yDBG3plejXLJ4pCBRJcUcCdWQnASsJracm05D09FZZcZjOaE13lHoeNj1zMipMnuHgn2vmMBGjeztSqIErnm1NzfRubByrpW+UfIdkLxck+Nga4Nby5I9r+OvKvRgqfJQbx9xPlVFZ5yhpEZE=";

    public APPTT() {
    }

    public static String decrypt(String str, String str2, String str3) {
        try {
            byte[] bytes = str2.getBytes();
            byte[] bytes2 = str3.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
            byte[] bArrL8 = MN.l8(str);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArrL8));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String str, String str2, String str3) {
        try {
            byte[] bytes = str2.getBytes();
            byte[] bytes2 = str3.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bytes2);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return MN.S(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private HashMap<String, String> l8(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "okhttp/3.12.11");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str3 = this.l8 + "api.php/v1.vod?type=" + str;
            if (map == null) {
                map = new HashMap<>();
            }
            if (!map.containsKey("class")) {
                map.put("class", "");
            }
            if (!map.containsKey("lang")) {
                map.put("lang", "");
            }
            if (!map.containsKey("area")) {
                map.put("area", "");
            }
            if (!map.containsKey("year")) {
                map.put("year", "");
            }
            if (!map.containsKey("type")) {
                map.put("type", "");
            }
            if (!map.containsKey("排序")) {
                map.put("排序", "");
            }
            String str4 = (((((str3 + "&class=" + map.get("type")) + "&lang=" + map.get("lang")) + "&area=" + map.get("area")) + "&year=" + map.get("year")) + "&page=" + str2 + "&by=rnd") + "&limit=24&token=" + getToken2();
            TreeMap treeMap = new TreeMap();
            String strA = Yy.A(str4, l8(str4), treeMap);
            List list = (List) treeMap.get("key");
            String strS = xv.S((String) list.get(0), this.l);
            JSONObject jSONObject2 = new JSONObject(decrypt(new JSONObject(strA).optString("data"), strS.substring(16, 48), strS.substring(0, 16)));
            JSONArray jSONArray = jSONObject2.getJSONArray("list");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                int i11 = Integer.parseInt(jSONObjectOptJSONObject.optString("vod_year"));
                if (i11 > 2022) {
                    boolean zContains = jSONObjectOptJSONObject.optString("vod_area").contains("日本");
                    if (!zContains) {
                        boolean zContains2 = jSONObjectOptJSONObject.optString("vod_lang").contains("未知");
                        if (!zContains2) {
                            boolean zContains3 = jSONObjectOptJSONObject.optString("vod_area").contains("其它");
                            if (!zContains3) {
                                jSONObject3.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                                jSONObject3.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                                jSONObject3.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                                jSONObject3.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                                jSONArray2.put(jSONObject3);
                            }
                        }
                    }
                }
            }
            int i19 = jSONObject2.getInt("total");
            int i20 = i19 / jSONObject2.getInt("limit");
            jSONObject.put("page", jSONObject2.getInt("page"));
            jSONObject.put("pagecount", i20);
            jSONObject.put("limit", jSONObject2.getInt("limit"));
            jSONObject.put("total", i19);
            jSONObject.put("list", jSONArray2);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.l8);
            sb.append("api.php/v1.vod/detilldata?vod_id=");
            sb.append(list.get(0));
            sb.append("&token=");
            sb.append(getToken2());
            String string = sb.toString();
            System.out.println(string);
            TreeMap treeMap = new TreeMap();
            String strA = Yy.A(string, l8(string), treeMap);
            String strS = xv.S((String) ((List) treeMap.get("key")).get(0), this.l);
            String strSubstring = strS.substring(0, 16);
            String strSubstring2 = strS.substring(16, 48);
            JSONObject jSONObjectOptJSONObject = new JSONObject(decrypt(new JSONObject(strA).optString("data"), strSubstring2, strSubstring)).optJSONObject("videoInfo");
            JSONObject jSONObject3 = new JSONObject(decrypt(new JSONObject(strA).optString("data"), strSubstring2, strSubstring));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            jSONObject.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
            jSONObject.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
            jSONObject.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
            jSONObject.put("vod_year", jSONObjectOptJSONObject.optString("vod_year"));
            jSONObject.put("vod_area", jSONObjectOptJSONObject.optString("vod_area"));
            jSONObject.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
            jSONObject.put("vod_actor", jSONObjectOptJSONObject.optString("vod_actor"));
            jSONObject.put("vod_director", jSONObjectOptJSONObject.optString("vod_director"));
            jSONObject.put("vod_content", jSONObjectOptJSONObject.optString("vod_content"));
            JSONArray jSONArray = jSONObject3.getJSONArray("source");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optJSONObject("player_info").optString("show");
                String strOptString2 = jSONObjectOptJSONObject2.optJSONObject("player_info").optString("parse");
                if (strOptString2.isEmpty()) {
                    strOptString2 = "qiaoji";
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArray2 = new JSONArray(jSONObjectOptJSONObject2.optString("list"));
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    arrayList3.add(jSONArray2.get(i4).toString() + "|" + strOptString2);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(strOptString);
                    arrayList2.add(TextUtils.join("#", arrayList3));
                }
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            jSONObject.put("vod_play_from", strJoin);
            jSONObject.put("vod_play_url", strJoin2);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(jSONObject);
            jSONObject2.put("list", jSONArray3);
            return jSONObject2.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String getToken2() {
        long currentTimeMillis = System.currentTimeMillis();
        String strE = String.valueOf(currentTimeMillis);
        String strE2 = "-";
        String strReplaceAll = this.T4;
        strReplaceAll = strReplaceAll.replaceAll(strE, strE2);
        strE2 = "_";
        strE = "/";
        String strEncrypt = encrypt(strE, strE2, strReplaceAll);
        strReplaceAll = strEncrypt.replaceAll("\\+", strE);
        return strReplaceAll.replaceAll(strEncrypt, strE2);
    }

    public String getToken3(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        String str2 = "_";
        sb.append(str2);
        String str3 = "*";
        sb.append(str3);
        sb.append(currentTimeMillis);
        String strB = sb.toString();
        String strReplaceAll = this.OL;
        String strEncrypt = encrypt(strB, str, strReplaceAll);
        str = strEncrypt.replaceAll("\\+", strB);
        str = strReplaceAll.replaceAll(strB, str);
        strReplaceAll = strEncrypt.replaceAll(str3, str2);
        return str;
    }

    public String homeContent(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class", new JSONArray("[{\"type_id\":\"1\",\"type_name\":\"电影\"},{\"type_id\":\"2\",\"type_name\":\"电视剧\"},{\"type_id\":\"4\",\"type_name\":\"综艺\"},{\"type_id\":\"3\",\"type_name\":\"动漫\"}]"));
            if (z) {
                jSONObject.put("filters", new JSONObject("{\"1\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"},{\"n\":\"网络电影\",\"v\":\"网络电影\"},{\"n\":\"情色\",\"v\":\"情色\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"法语\",\"v\":\"法语\"},{\"n\":\"德语\",\"v\":\"德语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"国产\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"排序\",\"name\":\"排序\",\"value\":[{\"n\":\"时间\",\"v\":\"time\"},{\"n\":\"人气\",\"v\":\"hits\"},{\"n\":\"评分\",\"v\":\"score\"}]}]}"));
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        int i = 0;
        try {
            String str = this.l8 + "api.php/v1.vod/curnavitemlist?token=" + getToken2();
            System.out.println(str);
            TreeMap treeMap = new TreeMap();
            String strA = Yy.A(str, l8(str), treeMap);
            String strS = xv.S((String) ((List) treeMap.get("key")).get(0), this.l);
            String strSubstring = strS.substring(0, 16);
            String strSubstring2 = strS.substring(16, 48);
            JSONObject jSONObject = new JSONObject(strA);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(decrypt(jSONObject.optString("data"), strSubstring2, strSubstring)).getJSONArray("swiperList");
            for (i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray);
            return jSONObject3.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        String strL = C1370pv.l(str);
        String[] strArrSplit = strL.split("\\|");
        String str4 = strArrSplit[2];
        String str5 = strArrSplit[1];
        this.l8 = strArrSplit[0];
        this.S = str5;
        this.T4 = strL;
        this.OL = strArrSplit[3];
        this.b = strArrSplit[4];
        strArrSplit = strL.split(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            Init2.lj();
            JSONObject jSONObject = new JSONObject();
            String[] strArrSplit = str2.split("\\|");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            if (str3.contains(".m3u8") || str3.contains(".mp4")) {
                String str5 = str4 + str3 + "&token=" + getToken2() + "&sc=" + getToken3(str3);
                String strOptString = new JSONObject(C1370pv.HM(Yy.v(str5, l8(str5)).replace("-", "+").replace("_", "/"), "UTF-8", this.S, this.T4)).optString("url");
                jSONObject.put("parse", 0);
                jSONObject.put("url", strOptString);
            } else {
                jSONObject.put("parse", 0);
                jSONObject.put("url", str3);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            System.out.println(th);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.l8 + "api.php/v1.vod?page=1&limit=10&wd=" + URLEncoder.encode(str) + "&token=" + getToken2();
            TreeMap treeMap = new TreeMap();
            String strA = Yy.A(str2, l8(str2), treeMap);
            List list = (List) treeMap.get("key");
            int i = 0;
            String strS = xv.S((String) list.get(0), this.l);
            String strSubstring = strS.substring(0, 16);
            String strSubstring2 = strS.substring(16, 48);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONObject(decrypt(new JSONObject(strA).optString("data"), strSubstring2, strSubstring)).getJSONArray("list");
            for (i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", jSONObjectOptJSONObject.optString("vod_id"));
                jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("vod_name"));
                jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("vod_pic"));
                jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("vod_remarks"));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
