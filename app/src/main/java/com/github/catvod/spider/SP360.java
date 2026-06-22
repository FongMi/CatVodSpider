package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.K0.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class SP360 extends Spider {
    protected JSONObject a = null;

    protected final HashMap<String, String> a() {
        return BuilderUtils.c("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4 = "upinfo";
        String str5 = "total";
        try {
            String str6 = "https://api.web.360kan.com/v1/filter/list?catid=" + str + "&pageno=" + str2;
            for (String str7 : map.keySet()) {
                String strTrim = map.get(str7).trim();
                if (strTrim.length() != 0) {
                    str6 = str6 + "&" + str7 + "=" + URLEncoder.encode(strTrim);
                }
            }
            JSONObject jSONObject = new JSONObject(StringUtils.d(str6, a())).getJSONObject("data");
            JSONArray jSONArray = jSONObject.getJSONArray("movies");
            JSONArray jSONArray2 = new JSONArray();
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                String string = jSONObject2.getString("cover");
                JSONArray jSONArray3 = jSONArray;
                String str8 = str5;
                JSONObject jSONObject4 = jSONObject;
                int i2 = i;
                if (jSONObject2.has(str4)) {
                    String string2 = jSONObject2.getString(str4);
                    str3 = str4;
                    jSONObject3.put("vod_id", str + "_" + jSONObject2.getString("id"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", "https:" + string);
                    jSONObject3.put("vod_remarks", string2);
                } else {
                    str3 = str4;
                    jSONObject3.put("vod_id", str + "_" + jSONObject2.getString("id"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", "https:" + string);
                    jSONObject3.put("vod_remarks", "");
                }
                jSONArray2.put(jSONObject3);
                i = i2 + 1;
                jSONArray = jSONArray3;
                str5 = str8;
                jSONObject = jSONObject4;
                str4 = str3;
            }
            String str9 = str5;
            JSONObject jSONObject5 = jSONObject;
            JSONObject jSONObject6 = new JSONObject();
            int i3 = Integer.parseInt(jSONObject5.getString("current_page"));
            int i4 = jSONObject5.getInt(str9);
            int i5 = i4 % 24 == 0 ? i4 / 24 : (i4 / 24) + 1;
            jSONObject6.put("page", i3);
            jSONObject6.put("pagecount", i5);
            jSONObject6.put("limit", 24);
            jSONObject6.put(str9, i4);
            jSONObject6.put("list", jSONArray2);
            return jSONObject6.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        JSONObject jSONObject;
        Iterator it;
        String string;
        JSONObject jSONObject2;
        String str;
        JSONObject jSONObject3;
        String str2;
        StringBuilder sb = new StringBuilder();
        String str3 = "data";
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject4 = new JSONObject();
        try {
            String[] strArrSplit = list.get(0).split("_");
            String str4 = String.format("%s?cat=%s&id=%s", "https://api.web.360kan.com/v1/detail", strArrSplit[0], strArrSplit[1]);
            JSONObject jSONObject5 = new JSONObject(StringUtils.d(str4, a())).getJSONObject("data");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject6 = new JSONObject();
            jSONArray.put(jSONObject6);
            jSONObject4.put("list", jSONArray);
            jSONObject6.put("vod_id", strArrSplit[0] + "_" + jSONObject5.optString("ent_id"));
            jSONObject6.put("vod_name", jSONObject5.optString("title"));
            jSONObject6.put("vod_pic", jSONObject5.optString("cdncover"));
            JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray("moviecategory");
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList2.add(jSONArrayOptJSONArray.getString(i));
            }
            jSONObject6.put("type_name", TextUtils.join("/", arrayList2));
            jSONObject6.put("vod_year", jSONObject5.optString("pubdate"));
            JSONArray jSONArrayOptJSONArray2 = jSONObject5.optJSONArray("area");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList3.add(jSONArrayOptJSONArray2.getString(i2));
            }
            jSONObject6.put("vod_area", TextUtils.join("/", arrayList3));
            jSONObject6.put("vod_remarks", jSONObject5.optString("doubanscore"));
            JSONArray jSONArrayOptJSONArray3 = jSONObject5.optJSONArray("actor");
            ArrayList arrayList4 = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                arrayList4.add(jSONArrayOptJSONArray3.getString(i3));
            }
            jSONObject6.put("vod_actor", TextUtils.join("/", arrayList4));
            JSONArray jSONArrayOptJSONArray4 = jSONObject5.optJSONArray("director");
            ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                arrayList5.add(jSONArrayOptJSONArray4.getString(i4));
            }
            jSONObject6.put("vod_director", TextUtils.join("/", arrayList5));
            jSONObject6.put("vod_content", jSONObject5.optString("description"));
            JSONArray jSONArrayOptJSONArray5 = jSONObject5.optJSONArray("playlink_sites");
            ArrayList<String> arrayList6 = new ArrayList();
            for (int i5 = 0; i5 < jSONArrayOptJSONArray5.length(); i5++) {
                arrayList6.add(jSONArrayOptJSONArray5.getString(i5));
            }
            jSONObject6.put("vod_play_from", TextUtils.join("$$$", arrayList6));
            JSONObject jSONObjectOptJSONObject = jSONObject5.optJSONObject("playlinksdetail");
            JSONObject jSONObjectOptJSONObject2 = jSONObject5.optJSONObject("allepidetail");
            JSONArray jSONArrayOptJSONArray6 = jSONObject5.optJSONArray("defaultepisode");
            JSONObject jSONObjectOptJSONObject3 = jSONObject5.optJSONObject("allupinfo");
            String str5 = "allepidetail";
            if (jSONArrayOptJSONArray6 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (int i6 = 0; i6 < jSONArrayOptJSONArray6.length(); i6++) {
                    try {
                        URL url = new URL(jSONArrayOptJSONArray6.getJSONObject(i6).optString("url"));
                        arrayList7.add(jSONArrayOptJSONArray6.getJSONObject(i6).optString("sort") + "$" + url.getProtocol() + "://" + url.getHost() + url.getPath());
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                jSONObject6.put("vod_play_url", TextUtils.join("#", arrayList7));
                return jSONObject4.toString();
            }
            if (jSONObjectOptJSONObject2 == null) {
                ArrayList arrayList8 = new ArrayList();
                for (String str6 : arrayList6) {
                    try {
                        URL url2 = new URL(jSONObjectOptJSONObject.getJSONObject(str6).optString("default_url"));
                        arrayList8.add(jSONObjectOptJSONObject.getJSONObject(str6).optString("sort") + "$" + url2.getProtocol() + "://" + url2.getHost() + url2.getPath());
                    } catch (Exception e2) {
                        SpiderDebug.log(e2);
                    }
                }
                jSONObject6.put("vod_play_url", TextUtils.join("$$$", arrayList8));
                jSONObject = jSONObject4;
            } else {
                ArrayList arrayList9 = new ArrayList();
                Iterator it2 = arrayList6.iterator();
                ArrayList arrayList10 = arrayList;
                while (it2.hasNext()) {
                    String str7 = (String) it2.next();
                    int i7 = Integer.parseInt(jSONObjectOptJSONObject3.optString(str7, "0"));
                    if (i7 > 50 || i7 == 0) {
                        it = it2;
                        string = str4 + "&start=1&end=50&site=" + str7;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str4);
                        it = it2;
                        sb2.append("&start=1&end=");
                        sb2.append(i7);
                        sb2.append("&site=");
                        sb2.append(str7);
                        string = sb2.toString();
                    }
                    ArrayList arrayList11 = arrayList10;
                    String str8 = str5;
                    JSONObject jSONObjectOptJSONObject4 = new JSONObject(StringUtils.d(string, a())).getJSONObject(str3).optJSONObject(str8);
                    ArrayList arrayList12 = new ArrayList();
                    JSONArray jSONArray2 = jSONObjectOptJSONObject4.getJSONArray(str7);
                    String str9 = str4;
                    JSONObject jSONObject7 = jSONObjectOptJSONObject3;
                    int i8 = 0;
                    ArrayList arrayList13 = arrayList9;
                    Exception e;
                    while (true) {
                        jSONObject2 = jSONObject4;
                        if (i8 >= jSONArray2.length()) {
                            break;
                        }
                        String str10 = str3;
                        JSONObject jSONObject8 = jSONObject6;
                        int i9 = i7;
                        try {
                        } catch (Exception e3) {
                            e = e3;
                            arrayList13 = arrayList11;
                        }
                        try {
                            arrayList12.add(jSONArray2.getJSONObject(i8).optString("playlink_num") + "$" + jSONArray2.getJSONObject(i8).optString("url"));
                        } catch (Exception e4) {
                            e = e4;
                            SpiderDebug.log(e);
                            i8++;
                        }
                        arrayList11 = arrayList13;
                        i8++;
                        arrayList13 = arrayList11;
                        jSONObject4 = jSONObject2;
                        i7 = i9;
                        jSONObject6 = jSONObject8;
                        str3 = str10;
                    }
                    if (i7 >= jSONArray2.length()) {
                        int i10 = 51;
                        while (i10 < i7) {
                            int i11 = i10 + 49;
                            if (i11 > i7) {
                                i11 = i7;
                            }
                            int i12 = i7;
                            jSONObject3 = jSONObject6;
                            JSONObject jSONObjectOptJSONObject5 = new JSONObject(StringUtils.d(String.format("%s?cat=%s&id=%s&start=%s&end=%s&site=%s", "https://api.web.360kan.com/v1/detail", strArrSplit[0], strArrSplit[1], Integer.valueOf(i10), Integer.valueOf(i11), str7), a())).optJSONObject(str3);
                            if (jSONObjectOptJSONObject5 == null) {
                                str = str3;
                                break;
                            }
                            JSONArray jSONArray3 = jSONObjectOptJSONObject5.getJSONObject(str8).getJSONArray(str7);
                            int i13 = 0;
                            while (i13 < jSONArray3.length()) {
                                try {
                                    String strOptString = jSONArray3.getJSONObject(i13).optString("url");
                                    try {
                                        sb = new StringBuilder();
                                        str2 = str3;
                                    } catch (Exception e5) {
                                        e = e5;
                                        str2 = str3;
                                    }
                                    try {
                                        sb.append(jSONArray3.getJSONObject(i13).optString("playlink_num"));
                                        sb.append("$");
                                        sb.append(strOptString);
                                        arrayList12.add(sb.toString());
                                    } catch (Exception e6) {
                                        e = e6;
                                        try {
                                            SpiderDebug.log(e);
                                            i13++;
                                        } catch (Exception unused) {
                                        }
                                    }
                                } catch (Exception unused2) {
                                    str2 = str3;
                                }
                                i13++;
                                str3 = str2;
                            }
                            i10 = i11 + 1;
                            i7 = i12;
                            jSONObject6 = jSONObject3;
                        }
                        str = str3;
                        jSONObject3 = jSONObject6;
                    } else {
                        str = str3;
                        jSONObject3 = jSONObject6;
                    }
                    arrayList13.add(TextUtils.join("#", arrayList12));
                    arrayList9 = arrayList13;
                    it2 = it;
                    str4 = str9;
                    jSONObjectOptJSONObject3 = jSONObject7;
                    jSONObject4 = jSONObject2;
                    jSONObject6 = jSONObject3;
                    str3 = str;
                    str5 = str8;
                    arrayList10 = arrayList11;
                }
                jSONObject = jSONObject4;
                jSONObject6.put("vod_play_url", TextUtils.join("$$$", arrayList9));
            }
            return jSONObject.toString();
        } catch (Exception e7) {
            SpiderDebug.log(e7);
            return "";
        }
    }

    public String homeContent(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("class", this.a.getJSONArray("classes"));
            if (z) {
                jSONObject.put("filters", this.a.getJSONObject("filter"));
            }
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String homeVideoContent() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = StringUtils.d("https://api.web.360kan.com/v1/rank?cat=1", new HashMap());
            SpiderDebug.log("响应请求：https://api.web.360kan.com/v1/rank?cat=1");
            JSONArray jSONArrayOptJSONArray = new JSONObject(strD).optJSONArray("data");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("vod_id", jSONObject2.optString("cat") + "_" + jSONObject2.optString("ent_id"));
                jSONObject3.put("vod_name", jSONObject2.optString("title"));
                jSONObject3.put("vod_pic", jSONObject2.optString("cover"));
                jSONObject3.put("vod_remarks", jSONObject2.optString("upinfo"));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("list", jSONArray);
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public void init(Context context) throws Exception {
        super.init(context);
        try {
            this.a = new JSONObject("{\"classes\":[{\"type_name\":\"电影\",\"type_id\":\"1\"},{\"type_name\":\"电视剧\",\"type_id\":\"2\"},{\"type_name\":\"综艺\",\"type_id\":\"3\"},{\"type_name\":\"动漫\",\"type_id\":\"4\"}],\"filter\":{\"1\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"纪录\",\"v\":\"纪录\"},{\"n\":\"传记\",\"v\":\"传记\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"伦理\",\"v\":\"伦理\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"更早\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"},{\"n\":\"最受好评\",\"v\":\"rankpoint\"}]}],\"2\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"言情\",\"v\":\"言情\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"伦理\",\"v\":\"伦理\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"军事\",\"v\":\"军事\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"神话\",\"v\":\"神话\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"青春\",\"v\":\"青春剧\"},{\"n\":\"家庭\",\"v\":\"家庭剧\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"其他\",\"v\":\"其他\"},{\"n\":\"全部\",\"v\":\"\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"更早\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"},{\"n\":\"最受好评\",\"v\":\"rankpoint\"}]}],\"3\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"脱口秀\",\"v\":\"脱口秀\"},{\"n\":\"真人秀\",\"v\":\"真人秀\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"八卦\",\"v\":\"八卦\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"晚会\",\"v\":\"晚会\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"职场\",\"v\":\"职场\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"时尚\",\"v\":\"时尚\"},{\"n\":\"游戏\",\"v\":\"游戏\"},{\"n\":\"少儿\",\"v\":\"少儿\"},{\"n\":\"体育\",\"v\":\"体育\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"科教\",\"v\":\"科教\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"汽车\",\"v\":\"汽车\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"}]}],\"4\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"美少女\",\"v\":\"美少女\"},{\"n\":\"魔幻\",\"v\":\"魔幻\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"少儿\",\"v\":\"少儿\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"恋爱\",\"v\":\"恋爱\"},{\"n\":\"治愈\",\"v\":\"治愈\"},{\"n\":\"幻想\",\"v\":\"幻想\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动物\",\"v\":\"动物\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"儿歌\",\"v\":\"儿歌\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"怪物\",\"v\":\"怪物\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"童话\",\"v\":\"童话\"},{\"n\":\"竞技\",\"v\":\"竞技\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"友情\",\"v\":\"友情\"},{\"n\":\"真人版\",\"v\":\"真人版\"},{\"n\":\"电影版\",\"v\":\"电影版\"},{\"n\":\"OVA版\",\"v\":\"OVA版\"},{\"n\":\"TV版\",\"v\":\"TV版\"},{\"n\":\"新番动画\",\"v\":\"新番动画\"},{\"n\":\"完结动画\",\"v\":\"完结动画\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"}]}]}}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("parse", 1);
            jSONObject.put("url", str2);
            jSONObject.put("jx", "1");
            jSONObject.put("playUrl", "");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectOptJSONObject2 = new JSONObject(StringUtils.d(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", str), a())).optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("longData")) != null) {
                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("rows");
                JSONArray jSONArray2 = new JSONArray();
                jSONObject.put("list", jSONArray2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.optString("cat_id") + "_" + jSONObject2.optString("en_id"));
                    jSONObject3.put("vod_name", jSONObject2.optString("titleTxt"));
                    jSONObject3.put("vod_pic", jSONObject2.optString("cover"));
                    jSONObject3.put("vod_remarks", jSONObject2.optString("score"));
                    jSONArray2.put(jSONObject3);
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return jSONObject.toString();
    }
}
