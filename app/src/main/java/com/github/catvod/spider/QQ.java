package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class QQ extends Spider {
    protected JSONObject dn;
    protected JSONObject q = new JSONObject();

    private String q(String str, String str2) {
        String str3;
        try {
            if (str2.startsWith("//")) {
                Uri parse = Uri.parse(str);
                str3 = parse.getScheme() + ":" + str2;
            } else if (str2.contains("://")) {
                return str2;
            } else {
                Uri parse2 = Uri.parse(str);
                str3 = parse2.getScheme() + "://" + parse2.getHost() + str2;
            }
            return str3;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return str2;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        String str3;
        try {
            String str4 = "https://v.qq.com/x/bu/pagesheet/list?_all=1&append=1&channel=" + str + "&listpage=1&offset=" + ((Integer.parseInt(str2) - 1) * 21) + "&pagesize=21&sort=18";
            if (hashMap != null) {
                for (String str5 : hashMap.keySet()) {
                    String trim = hashMap.get(str5).trim();
                    if (trim.length() != 0) {
                        str4 = str4 + "&" + str5 + "=" + URLEncoder.encode(trim);
                    }
                }
            }
            String content = OkHttpUtil.string(str4, getHeaders(str4));
            JSONObject jSONObject = new JSONObject();
            try {
                Elements listItems = Jsoup.parse(content).select(".list_item");
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listItems.size(); i++) {
                    Element item = listItems.get(i);
                    String Pd = item.select("a").attr("title");
                    String q = q(str4, item.select("img").attr("src"));
                    if (item.select(".figure_caption") == null) {
                        str3 = "";
                    } else {
                        str3 = item.select(".figure_caption").text();
                    }
                    String Pd2 = item.select("a").attr("data-float");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", Pd2);
                    jSONObject2.put("vod_name", Pd);
                    jSONObject2.put("vod_pic", q);
                    jSONObject2.put("vod_remarks", str3);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("page", str2);
                jSONObject.put("pagecount", Integer.MAX_VALUE);
                jSONObject.put("limit", 90);
                jSONObject.put("total", Integer.MAX_VALUE);
                jSONObject.put("list", jSONArray);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject.toString(4);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String detailContent(List<String> list) {
        JSONArray jSONArray;
        CharSequence charSequence;
        JSONArray jSONArray2;
        CharSequence charSequence2;
        CharSequence charSequence3 = ",";
        try {
            String str = "https://node.video.qq.com/x/api/float_vinfo2?cid=" + list.get(0);
            JSONObject jSONObject = new JSONObject(OkHttpUtil.string(str, getHeaders(str)));
            JSONObject optJSONObject = jSONObject.optJSONObject("c");
            if (optJSONObject == null) {
                return "";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", optJSONObject.optString("title"));
            jSONObject2.put("vod_pic", q(str, optJSONObject.optString("pic")));
            jSONObject2.put("type_name", jSONObject.optJSONArray("typ").opt(0));
            jSONObject2.put("vod_year", optJSONObject.optString("year"));
            jSONObject.optJSONObject("people");
            JSONArray optJSONArray = jSONObject.optJSONArray("nam").optJSONArray(0);
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.opt(i));
                }
            }
            jSONObject2.put("vod_actor", join(charSequence3, arrayList));
            jSONObject2.put("vod_content", optJSONObject.optString("description"));
            JSONArray jSONArray3 = optJSONObject.getJSONArray("video_ids");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i2 = 1;
            while (i2 <= jSONArray3.length()) {
                arrayList2.add(jSONArray3.optString(i2 - 1));
                if (!(i2 % 30 == 0 || i2 == jSONArray3.length())) {
                    charSequence = charSequence3;
                    jSONArray = jSONArray3;
                    i2++;
                    charSequence3 = charSequence;
                    jSONArray3 = jSONArray;
                }
                String str2 = "https://union.video.qq.com/fcgi-bin/data?otype=json&tid=682&appid=20001238&appkey=6c03bbe9658448a4&union_platform=1&idlist=" + join(charSequence3, arrayList2);
                String h = OkHttpUtil.string(str2, getHeaders(str2));
                JSONArray jSONArray4 = new JSONObject(h.substring(13, h.length() - 1)).getJSONArray("results");
                int i3 = 0;
                while (i3 < jSONArray4.length()) {
                    JSONObject jSONObject3 = jSONArray4.getJSONObject(i3).getJSONObject("fields");
                    if (!jSONObject3.optString("title").contains("预告")) {
                        StringBuilder sb = new StringBuilder();
                        String optString = jSONObject3.optString("title");
                        charSequence2 = charSequence3;
                        StringBuilder sb2 = new StringBuilder();
                        jSONArray2 = jSONArray3;
                        sb2.append(optJSONObject.optString("title"));
                        sb2.append("_");
                        sb.append(optString.replace(sb2.toString(), ""));
                        sb.append("$https://v.qq.com/x/cover/");
                        sb.append(list.get(0));
                        sb.append("/");
                        sb.append(jSONObject3.optString("vid"));
                        sb.append(".html");
                        arrayList3.add(sb.toString());
                    } else {
                        charSequence2 = charSequence3;
                        jSONArray2 = jSONArray3;
                    }
                    i3++;
                    charSequence3 = charSequence2;
                    jSONArray3 = jSONArray2;
                }
                charSequence = charSequence3;
                jSONArray = jSONArray3;
                arrayList2.clear();
                i2++;
                charSequence3 = charSequence;
                jSONArray3 = jSONArray;
            }
            jSONObject2.put("vod_play_from", "qq");
            jSONObject2.put("vod_play_url", join("#", arrayList3));
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(jSONObject2);
            jSONObject4.put("list", jSONArray5);
            return jSONObject4.toString(4);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    protected HashMap<String, String> getHeaders(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        return hashMap;
    }

    public String homeContent(boolean z) {
        try {
            Document doc = Jsoup.parse(OkHttpUtil.string("https://v.qq.com/channel/tv?listpage=1&channel=tv&sort=18&_all=1", getHeaders("https://v.qq.com/channel/tv?listpage=1&channel=tv&sort=18&_all=1")));
            JSONArray jSONArray = new JSONArray();
            Iterator<Element> it = doc.select(".nav_cell").iterator();
            while (it.hasNext()) {
                Element next = it.next();
                JSONObject jSONObject = new JSONObject();
                String Pd = next.select("a").attr("href");
                if (!Pd.contains("/art") && !Pd.contains("feeds_hotspot") && !Pd.contains("wwe") && !Pd.contains("choice") && !Pd.contains("sports_new") && !Pd.contains("games") && !Pd.contains("lols11") && !Pd.contains("ent") && !Pd.contains("news") && !Pd.contains("fashion") && !Pd.contains("tech") && !Pd.contains("auto") && !Pd.contains("house") && !Pd.contains("finance") && !Pd.contains("astro") && !Pd.contains("nba") && !Pd.contains("fun") && !Pd.contains("baby") && !Pd.contains("music") && !Pd.contains("life") && !Pd.contains("travel") && Pd.contains("/channel/")) {
                    jSONObject.put("type_name", next.select("a").text());
                    jSONObject.put("type_id", Pd.split("/channel/")[1]);
                    jSONArray.put(jSONObject);
                }
            }
            String h = OkHttpUtil.string("https://v.qq.com/x/bu/pagesheet/list?_all=1&append=1&channel=choice", getHeaders("https://v.qq.com/x/bu/pagesheet/list?_all=1&append=1&channel=choice"));
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("filters", this.dn);
            }
            jSONObject2.put("class", jSONArray);
            try {
                Elements listItem = Jsoup.parse(h).select(".list_item");
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < listItem.size(); i++) {
                    Element item = listItem.get(i);
                    String title = item.select("a").attr("title");
                    String pic = q("https://v.qq.com/x/bu/pagesheet/list?_all=1&append=1&channel=choice", item.select("img").attr("src"));
                    String remark = item.select(".figure_caption").text();
                    String id = item.select("a").attr("data-float");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", id);
                    jSONObject3.put("vod_name", title);
                    jSONObject3.put("vod_pic", pic);
                    jSONObject3.put("vod_remarks", remark);
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("list", jSONArray2);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject2.toString(4);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            JSONArray jSONArray = new JSONObject(OkHttpUtil.string("https://v.qq.com/api.php/app/index_video?token=", getHeaders("https://v.qq.com/api.php/app/index_video?token="))).getJSONArray("list");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray3 = jSONArray.getJSONObject(i).getJSONArray("vlist");
                int i2 = 0;
                while (i2 < jSONArray3.length() && i2 < 6) {
                    JSONObject jSONObject = jSONArray3.getJSONObject(i2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", jSONObject.optString("vod_id"));
                    jSONObject2.put("vod_name", jSONObject.optString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObject.optString("vod_pic"));
                    jSONObject2.put("vod_remarks", jSONObject.optString("vod_remarks"));
                    jSONArray2.put(jSONObject2);
                    i2++;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray2);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context) {
        QQ.super.init(context);
        try {
            this.dn = new JSONObject("{\"tv\":[{\"name\":\"排序\",\"value\":[{\"v\":\"19\",\"n\":\"最新\"},{\"v\":\"18\",\"n\":\"最热\"},{\"v\":\"16\",\"n\":\"好评\"},{\"v\":\"21\",\"n\":\"口碑好剧\"},{\"v\":\"54\",\"n\":\"高分好评\"},{\"v\":\"22\",\"n\":\"知乎高分\"}],\"key\":\"sort\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"偶像爱情\"},{\"v\":\"2\",\"n\":\"古装历史\"},{\"v\":\"3\",\"n\":\"玄幻史诗\"},{\"v\":\"4\",\"n\":\"都市生活\"},{\"v\":\"14\",\"n\":\"当代主旋律\"},{\"v\":\"5\",\"n\":\"罪案谍战\"},{\"v\":\"6\",\"n\":\"历险科幻\"},{\"v\":\"7\",\"n\":\"军旅抗战\"},{\"v\":\"8\",\"n\":\"喜剧\"},{\"v\":\"9\",\"n\":\"武侠江湖\"},{\"v\":\"10\",\"n\":\"青春校园\"},{\"v\":\"11\",\"n\":\"时代传奇\"},{\"v\":\"12\",\"n\":\"体育电竞\"},{\"v\":\"13\",\"n\":\"真人动漫\"},{\"v\":\"15\",\"n\":\"短剧\"},{\"v\":\"44\",\"n\":\"独播\"}],\"key\":\"feature\"},{\"name\":\"地区\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"814\",\"n\":\"内地\"},{\"v\":\"815\",\"n\":\"美国\"},{\"v\":\"816\",\"n\":\"英国\"},{\"v\":\"818\",\"n\":\"韩国\"},{\"v\":\"9\",\"n\":\"泰国\"},{\"v\":\"10\",\"n\":\"日本\"},{\"v\":\"14\",\"n\":\"中国香港\"},{\"v\":\"817\",\"n\":\"中国台湾\"},{\"v\":\"819\",\"n\":\"其他\"}],\"key\":\"iarea\"},{\"name\":\"年份\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"2020\",\"n\":\"2020\"},{\"v\":\"4061\",\"n\":\"2019\"},{\"v\":\"4060\",\"n\":\"2018\"},{\"v\":\"2017\",\"n\":\"2017\"},{\"v\":\"859\",\"n\":\"2016\"},{\"v\":\"860\",\"n\":\"2015\"},{\"v\":\"861\",\"n\":\"2014\"},{\"v\":\"862\",\"n\":\"2013\"},{\"v\":\"863\",\"n\":\"2012\"},{\"v\":\"864\",\"n\":\"2011\"},{\"v\":\"865\",\"n\":\"2010\"},{\"v\":\"866\",\"n\":\"其他\"}],\"key\":\"year\"},{\"name\":\"资费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"867\",\"n\":\"免费\"},{\"v\":\"6\",\"n\":\"会员\"}],\"key\":\"pay\"}],\"education\":[{\"name\":\"排序\",\"value\":[{\"v\":\"19\",\"n\":\"按更新\"},{\"v\":\"40\",\"n\":\"最热\"}],\"key\":\"sort\"},{\"name\":\"学段\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2\",\"n\":\"小学\"},{\"v\":\"3\",\"n\":\"初中\"},{\"v\":\"4\",\"n\":\"高中\"},{\"v\":\"5\",\"n\":\"大学\"},{\"v\":\"6\",\"n\":\"研究生\"},{\"v\":\"7\",\"n\":\"成人\"}],\"key\":\"section\"},{\"name\":\"学级\",\"value\":[{\"v\":\"1\",\"n\":\"全部\"},{\"v\":\"5\",\"n\":\"一年级\"},{\"v\":\"6\",\"n\":\"二年级\"},{\"v\":\"7\",\"n\":\"三年级\"},{\"v\":\"8\",\"n\":\"四年级\"},{\"v\":\"9\",\"n\":\"五年级\"},{\"v\":\"10\",\"n\":\"六年级\"},{\"v\":\"11\",\"n\":\"初一\"},{\"v\":\"12\",\"n\":\"初二\"},{\"v\":\"13\",\"n\":\"初三\"},{\"v\":\"14\",\"n\":\"高一\"},{\"v\":\"15\",\"n\":\"高二\"},{\"v\":\"16\",\"n\":\"高三\"},{\"v\":\"20\",\"n\":\"大四\"}],\"key\":\"grade\"},{\"name\":\"学科\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"41\",\"n\":\"语文\"},{\"v\":\"42\",\"n\":\"数学\"},{\"v\":\"43\",\"n\":\"英语\"},{\"v\":\"44\",\"n\":\"物理\"},{\"v\":\"45\",\"n\":\"化学\"},{\"v\":\"46\",\"n\":\"生物\"},{\"v\":\"47\",\"n\":\"政治\"},{\"v\":\"50\",\"n\":\"其它\"}],\"key\":\"subject\"}],\"movie\":[{\"name\":\"排序\",\"value\":[{\"v\":\"18\",\"n\":\"最近热播\"},{\"v\":\"19\",\"n\":\"最新上架\"},{\"v\":\"21\",\"n\":\"高分好评\"},{\"v\":\"22\",\"n\":\"知乎高分\"}],\"key\":\"sort\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"100018\",\"n\":\"剧情\"},{\"v\":\"100004\",\"n\":\"喜剧\"},{\"v\":\"100061\",\"n\":\"动作\"},{\"v\":\"100005\",\"n\":\"爱情\"},{\"v\":\"100010\",\"n\":\"惊悚\"},{\"v\":\"4\",\"n\":\"犯罪\"},{\"v\":\"100009\",\"n\":\"悬疑\"},{\"v\":\"100006\",\"n\":\"战争\"},{\"v\":\"100012\",\"n\":\"科幻\"},{\"v\":\"100015\",\"n\":\"动画\"},{\"v\":\"100007\",\"n\":\"恐怖\"},{\"v\":\"100017\",\"n\":\"家庭\"},{\"v\":\"100022\",\"n\":\"传记\"},{\"v\":\"100003\",\"n\":\"冒险\"},{\"v\":\"100016\",\"n\":\"奇幻\"},{\"v\":\"100011\",\"n\":\"武侠\"},{\"v\":\"100021\",\"n\":\"历史\"},{\"v\":\"2\",\"n\":\"运动\"},{\"v\":\"100014\",\"n\":\"歌舞\"},{\"v\":\"100013\",\"n\":\"音乐\"},{\"v\":\"100020\",\"n\":\"纪录\"},{\"v\":\"100019\",\"n\":\"伦理\"},{\"v\":\"3\",\"n\":\"西部\"}],\"key\":\"itype\"},{\"name\":\"地区\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"100024\",\"n\":\"内地\"},{\"v\":\"100025\",\"n\":\"中国香港\"},{\"v\":\"100029\",\"n\":\"美国\"},{\"v\":\"100032\",\"n\":\"欧洲\"},{\"v\":\"100026\",\"n\":\"中国台湾\"},{\"v\":\"100027\",\"n\":\"日本\"},{\"v\":\"100028\",\"n\":\"韩国\"},{\"v\":\"100030\",\"n\":\"印度\"},{\"v\":\"100031\",\"n\":\"泰国\"},{\"v\":\"15\",\"n\":\"英国\"},{\"v\":\"16\",\"n\":\"法国\"},{\"v\":\"17\",\"n\":\"德国\"},{\"v\":\"18\",\"n\":\"加拿大\"},{\"v\":\"19\",\"n\":\"西班牙\"},{\"v\":\"20\",\"n\":\"意大利\"},{\"v\":\"21\",\"n\":\"澳大利亚\"},{\"v\":\"22\",\"n\":\"北欧\"},{\"v\":\"23\",\"n\":\"拉丁美洲\"},{\"v\":\"100033\",\"n\":\"其它\"}],\"key\":\"iarea\"},{\"name\":\"特色\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"院线\"},{\"v\":\"2\",\"n\":\"自制电影\"},{\"v\":\"5\",\"n\":\"独播\"},{\"v\":\"8\",\"n\":\"原声\"},{\"v\":\"9\",\"n\":\"粤语\"},{\"v\":\"3\",\"n\":\"蓝光\"},{\"v\":\"6\",\"n\":\"奥斯卡\"}],\"key\":\"characteristic\"},{\"name\":\"年份\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"2020\",\"n\":\"2020\"},{\"v\":\"20\",\"n\":\"2019\"},{\"v\":\"2018\",\"n\":\"2018\"},{\"v\":\"2017\",\"n\":\"2017\"},{\"v\":\"2016\",\"n\":\"2016\"},{\"v\":\"100063\",\"n\":\"2015\"},{\"v\":\"100034\",\"n\":\"2014\"},{\"v\":\"100035\",\"n\":\"2013-2011\"},{\"v\":\"100036\",\"n\":\"2010-2006\"},{\"v\":\"100037\",\"n\":\"2005-2000\"},{\"v\":\"100038\",\"n\":\"90年代\"},{\"v\":\"100039\",\"n\":\"80年代\"},{\"v\":\"100040\",\"n\":\"其它\"}],\"key\":\"year\"},{\"name\":\"资费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"免费\"},{\"v\":\"2\",\"n\":\"包月\"},{\"v\":\"3\",\"n\":\"用券\"},{\"v\":\"4\",\"n\":\"付费\"}],\"key\":\"charge\"}],\"variety\":[{\"name\":\"排序\",\"value\":[{\"v\":\"4\",\"n\":\"最热\"},{\"v\":\"5\",\"n\":\"最新\"}],\"key\":\"sort\"},{\"name\":\"独家\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"腾讯自制\"},{\"v\":\"2\",\"n\":\"独播\"}],\"key\":\"exclusive\"},{\"name\":\"地区\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"国内\"},{\"v\":\"2\",\"n\":\"海外\"}],\"key\":\"iarea\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"10\",\"n\":\"游戏\"},{\"v\":\"11\",\"n\":\"音乐\"},{\"v\":\"24\",\"n\":\"养成\"},{\"v\":\"12\",\"n\":\"情感\"},{\"v\":\"14\",\"n\":\"喜剧\"},{\"v\":\"2\",\"n\":\"脱口秀\"},{\"v\":\"16\",\"n\":\"表演\"},{\"v\":\"25\",\"n\":\"体验\"},{\"v\":\"17\",\"n\":\"亲子\"},{\"v\":\"26\",\"n\":\"文化\"},{\"v\":\"19\",\"n\":\"美食\"},{\"v\":\"20\",\"n\":\"职场\"},{\"v\":\"21\",\"n\":\"体育\"},{\"v\":\"15\",\"n\":\"潮流文化\"},{\"v\":\"3\",\"n\":\"访谈\"},{\"v\":\"22\",\"n\":\"生活服务\"},{\"v\":\"23\",\"n\":\"萌宠\"},{\"v\":\"7\",\"n\":\"资讯\"},{\"v\":\"6\",\"n\":\"晚会\"}],\"key\":\"itype\"},{\"name\":\"年份\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"50\",\"n\":\"2020\"},{\"v\":\"7\",\"n\":\"2019\"},{\"v\":\"1\",\"n\":\"2018\"},{\"v\":\"2\",\"n\":\"2017\"},{\"v\":\"3\",\"n\":\"2016\"},{\"v\":\"4\",\"n\":\"2015\"},{\"v\":\"5\",\"n\":\"2014\"},{\"v\":\"6\",\"n\":\"2013\"},{\"v\":\"2012\",\"n\":\"2012\"},{\"v\":\"2011\",\"n\":\"2011\"},{\"v\":\"2010\",\"n\":\"2010\"},{\"v\":\"99\",\"n\":\"更早\"}],\"key\":\"iyear\"},{\"name\":\"付费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"会员\"}],\"key\":\"ipay\"}],\"cartoon\":[{\"name\":\"排序\",\"value\":[{\"v\":\"40\",\"n\":\"最热\"},{\"v\":\"23\",\"n\":\"最新\"},{\"v\":\"20\",\"n\":\"好评\"},{\"v\":\"22\",\"n\":\"知乎高分\"}],\"key\":\"sort\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2\",\"n\":\"冒险\"},{\"v\":\"5\",\"n\":\"战斗\"},{\"v\":\"1\",\"n\":\"搞笑\"},{\"v\":\"3\",\"n\":\"经典\"},{\"v\":\"4\",\"n\":\"科幻\"},{\"v\":\"9\",\"n\":\"玄幻\"},{\"v\":\"6\",\"n\":\"魔幻\"},{\"v\":\"13\",\"n\":\"武侠\"},{\"v\":\"7\",\"n\":\"恋爱\"},{\"v\":\"14\",\"n\":\"推理\"},{\"v\":\"11\",\"n\":\"腾讯出品\"},{\"v\":\"15\",\"n\":\"日常\"},{\"v\":\"16\",\"n\":\"校园\"},{\"v\":\"17\",\"n\":\"悬疑\"},{\"v\":\"18\",\"n\":\"真人\"},{\"v\":\"19\",\"n\":\"历史\"},{\"v\":\"20\",\"n\":\"竞技\"},{\"v\":\"12\",\"n\":\"其他\"}],\"key\":\"itype\"},{\"name\":\"地区\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"内地\"},{\"v\":\"2\",\"n\":\"日本\"},{\"v\":\"3\",\"n\":\"欧美\"},{\"v\":\"4\",\"n\":\"其他\"}],\"key\":\"iarea\"},{\"name\":\"时间\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2022\",\"n\":\"2022\"},{\"v\":\"2021\",\"n\":\"2021\"},{\"v\":\"50\",\"n\":\"2020\"},{\"v\":\"11\",\"n\":\"2019\"},{\"v\":\"2018\",\"n\":\"2018\"},{\"v\":\"2017\",\"n\":\"2017\"},{\"v\":\"1\",\"n\":\"2016\"},{\"v\":\"2\",\"n\":\"2015\"},{\"v\":\"3\",\"n\":\"2014\"},{\"v\":\"4\",\"n\":\"2013\"},{\"v\":\"5\",\"n\":\"2012\"},{\"v\":\"6\",\"n\":\"2011\"},{\"v\":\"7\",\"n\":\"00年代\"},{\"v\":\"8\",\"n\":\"90年代\"},{\"v\":\"9\",\"n\":\"80年代\"},{\"v\":\"10\",\"n\":\"更早\"}],\"key\":\"iyear\"},{\"name\":\"资费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"免费\"},{\"v\":\"2\",\"n\":\"会员\"}],\"key\":\"ipay\"},{\"name\":\"状态\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"46\",\"n\":\"预告片\"},{\"v\":\"44\",\"n\":\"连载\"},{\"v\":\"45\",\"n\":\"完结\"}],\"key\":\"anime_status\"},{\"name\":\"分类\",\"value\":[{\"v\":\"1\",\"n\":\"全部\"},{\"v\":\"2\",\"n\":\"3D动画\"},{\"v\":\"3\",\"n\":\"2D动画\"},{\"v\":\"4\",\"n\":\"特摄\"},{\"v\":\"5\",\"n\":\"其他\"}],\"key\":\"item\"}],\"doco\":[{\"name\":\"排序\",\"value\":[{\"v\":\"19\",\"n\":\"最新\"},{\"v\":\"18\",\"n\":\"最热\"},{\"v\":\"20\",\"n\":\"好评\"},{\"v\":\"22\",\"n\":\"知乎高分\"}],\"key\":\"sort\"},{\"name\":\"出品机构\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"BBC\"},{\"v\":\"4\",\"n\":\"国家地理\"},{\"v\":\"3175\",\"n\":\"HBO\"},{\"v\":\"2\",\"n\":\"NHK\"},{\"v\":\"7\",\"n\":\"历史频道\"},{\"v\":\"3530\",\"n\":\"ITV\"},{\"v\":\"3174\",\"n\":\"探索频道\"},{\"v\":\"3176\",\"n\":\"ZDF\"},{\"v\":\"3172\",\"n\":\"ARTE\"},{\"v\":\"15\",\"n\":\"腾讯自制\"},{\"v\":\"6\",\"n\":\"合作机构\"},{\"v\":\"5\",\"n\":\"其他\"}],\"key\":\"itrailer\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"4\",\"n\":\"自然\"},{\"v\":\"9\",\"n\":\"美食\"},{\"v\":\"3\",\"n\":\"社会\"},{\"v\":\"5\",\"n\":\"人文\"},{\"v\":\"1\",\"n\":\"历史\"},{\"v\":\"2\",\"n\":\"军事\"},{\"v\":\"7\",\"n\":\"科技\"},{\"v\":\"13\",\"n\":\"财经\"},{\"v\":\"15\",\"n\":\"探险\"},{\"v\":\"6\",\"n\":\"罪案\"},{\"v\":\"11\",\"n\":\"竞技\"},{\"v\":\"10\",\"n\":\"旅游\"}],\"key\":\"itype\"},{\"name\":\"资费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"免费\"},{\"v\":\"2\",\"n\":\"会员\"}],\"key\":\"pay\"}],\"child\":[{\"name\":\"排序\",\"value\":[{\"v\":\"19\",\"n\":\"最新\"},{\"v\":\"18\",\"n\":\"最热\"},{\"v\":\"20\",\"n\":\"好评\"}],\"key\":\"sort\"},{\"name\":\"地区\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"欧美\"},{\"v\":\"2\",\"n\":\"日韩\"},{\"v\":\"3\",\"n\":\"国内\"}],\"key\":\"iarea\"},{\"name\":\"年龄\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"0-3岁\"},{\"v\":\"2\",\"n\":\"4-6岁\"},{\"v\":\"3\",\"n\":\"7-9岁\"},{\"v\":\"4\",\"n\":\"10岁以上\"}],\"key\":\"iyear\"},{\"name\":\"性别\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"男孩\"},{\"v\":\"2\",\"n\":\"女孩\"}],\"key\":\"gender\"},{\"name\":\"类型\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"儿歌\"},{\"v\":\"2\",\"n\":\"益智\"},{\"v\":\"3\",\"n\":\"手工·绘画\"},{\"v\":\"4\",\"n\":\"玩具\"},{\"v\":\"5\",\"n\":\"英语\"},{\"v\":\"7\",\"n\":\"早教\"},{\"v\":\"6\",\"n\":\"数学\"},{\"v\":\"8\",\"n\":\"国学\"},{\"v\":\"9\",\"n\":\"合家欢\"},{\"v\":\"10\",\"n\":\"冒险\"},{\"v\":\"11\",\"n\":\"交通工具\"},{\"v\":\"12\",\"n\":\"魔幻·科幻\"},{\"v\":\"13\",\"n\":\"动物\"},{\"v\":\"14\",\"n\":\"真人特摄\"},{\"v\":\"15\",\"n\":\"探索\"},{\"v\":\"16\",\"n\":\"其他\"}],\"key\":\"itype\"},{\"name\":\"资费\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"1\",\"n\":\"免费\"},{\"v\":\"2\",\"n\":\"会员\"}],\"key\":\"ipay\"}],\"knowledge\":[{\"name\":\"排序\",\"value\":[{\"v\":\"41\",\"n\":\"最热\"},{\"v\":\"10\",\"n\":\"最新\"}],\"key\":\"sort\"},{\"name\":\"分类\",\"value\":[{\"v\":\"-1\",\"n\":\"全部\"},{\"v\":\"2\",\"n\":\"文化历史\"},{\"v\":\"3\",\"n\":\"亲子育儿\"},{\"v\":\"4\",\"n\":\"职场\"},{\"v\":\"5\",\"n\":\"商业理财\"},{\"v\":\"7\",\"n\":\"生活\"},{\"v\":\"9\",\"n\":\"情感心理\"},{\"v\":\"8\",\"n\":\"运动健身\"},{\"v\":\"6\",\"n\":\"艺术兴趣\"},{\"v\":\"12\",\"n\":\"游戏\"},{\"v\":\"14\",\"n\":\"科学科普\"},{\"v\":\"15\",\"n\":\"健康\"},{\"v\":\"16\",\"n\":\"IT/互联网\"}],\"key\":\"pay_level_one\"}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    public String join(@NonNull CharSequence charSequence, @NonNull Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(charSequence);
            sb.append(it.next());
        }
        return sb.toString();
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("parse", 1);
                jSONObject.put("jx", "1");
                jSONObject.put("url", str2);
                return jSONObject.toString();
            } catch (Exception e) {
                SpiderDebug.log(e);
                return jSONObject.toString();
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String searchContent(String str, boolean quick) {
        try {
            String str2 = "http://node.video.qq.com/x/api/msearch?keyWord=" + str;
            JSONArray jSONArray = new JSONObject(OkHttpUtil.string(str2, getHeaders(str2))).getJSONArray("uiData");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i).getJSONArray("data").getJSONObject(0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", jSONObject.optString("id"));
                jSONObject2.put("vod_name", jSONObject.optString("title"));
                jSONObject2.put("vod_pic", jSONObject.optString("posterPic"));
                jSONObject2.put("vod_remarks", jSONObject.optString("publishDate"));
                jSONArray2.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("list", jSONArray2);
            return jSONObject3.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
