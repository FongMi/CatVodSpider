package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class SP360 extends Spider {
    protected JSONObject ext = null;
    private static final String SiteHost = "https://api.web.360kan.com/v1/rank?cat=1";
    private static final String SiteFilter = "https://api.web.360kan.com/v1/filter/list";
    private static final String SiteDetail = "https://api.web.360kan.com/v1/detail";
    private static final String SiteSearch = "https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all";


    @Override
    public void init(Context context) {
        super.init(context);
        try {
            ext = new JSONObject("{\"classes\":[{\"type_name\":\"电影\",\"type_id\":\"1\"},{\"type_name\":\"电视剧\",\"type_id\":\"2\"},{\"type_name\":\"综艺\",\"type_id\":\"3\"},{\"type_name\":\"动漫\",\"type_id\":\"4\"}],\"filter\":{\"1\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"纪录\",\"v\":\"纪录\"},{\"n\":\"传记\",\"v\":\"传记\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"伦理\",\"v\":\"伦理\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"更早\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"},{\"n\":\"最受好评\",\"v\":\"rankpoint\"}]}],\"2\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"言情\",\"v\":\"言情\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"伦理\",\"v\":\"伦理\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"都市\",\"v\":\"都市\"},{\"n\":\"偶像\",\"v\":\"偶像\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"军事\",\"v\":\"军事\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"神话\",\"v\":\"神话\"},{\"n\":\"谍战\",\"v\":\"谍战\"},{\"n\":\"青春\",\"v\":\"青春剧\"},{\"n\":\"家庭\",\"v\":\"家庭剧\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"其他\",\"v\":\"其他\"},{\"n\":\"全部\",\"v\":\"\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"更早\",\"v\":\"lt_year\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"},{\"n\":\"最受好评\",\"v\":\"rankpoint\"}]}],\"3\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"脱口秀\",\"v\":\"脱口秀\"},{\"n\":\"真人秀\",\"v\":\"真人秀\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"八卦\",\"v\":\"八卦\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"晚会\",\"v\":\"晚会\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"职场\",\"v\":\"职场\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"时尚\",\"v\":\"时尚\"},{\"n\":\"游戏\",\"v\":\"游戏\"},{\"n\":\"少儿\",\"v\":\"少儿\"},{\"n\":\"体育\",\"v\":\"体育\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"科教\",\"v\":\"科教\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"歌舞\",\"v\":\"歌舞\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"汽车\",\"v\":\"汽车\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"}]}],\"4\":[{\"key\":\"cat\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"美少女\",\"v\":\"美少女\"},{\"n\":\"魔幻\",\"v\":\"魔幻\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"少儿\",\"v\":\"少儿\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"恋爱\",\"v\":\"恋爱\"},{\"n\":\"治愈\",\"v\":\"治愈\"},{\"n\":\"幻想\",\"v\":\"幻想\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动物\",\"v\":\"动物\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"儿歌\",\"v\":\"儿歌\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"怪物\",\"v\":\"怪物\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"童话\",\"v\":\"童话\"},{\"n\":\"竞技\",\"v\":\"竞技\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"友情\",\"v\":\"友情\"},{\"n\":\"真人版\",\"v\":\"真人版\"},{\"n\":\"电影版\",\"v\":\"电影版\"},{\"n\":\"OVA版\",\"v\":\"OVA版\"},{\"n\":\"TV版\",\"v\":\"TV版\"},{\"n\":\"新番动画\",\"v\":\"新番动画\"},{\"n\":\"完结动画\",\"v\":\"完结动画\"}]},{\"key\":\"year\",\"name\":\"年代\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"更早\",\"v\":\"更早\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"大陆\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"}]},{\"key\":\"rank\",\"name\":\"排序\",\"value\":[{\"n\":\"最近热映\",\"v\":\"rankhot\"},{\"n\":\"最近上映\",\"v\":\"ranklatest\"}]}]}}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    protected HashMap<String, String> Headers() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        return headers;
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String cover;
        String remark;
        try {
            String url = SiteFilter + "?catid=" + tid + "&pageno=" + pg;
            Set<String> keys = extend.keySet();
            for (String key : keys) {
                String val = extend.get(key).trim();
                if (val.length() == 0)
                    continue;
                url += "&" + key + "=" + URLEncoder.encode(val);
            }
            String content = OkHttpUtil.string(url, Headers());
            JSONObject dataObject = new JSONObject(content).getJSONObject("data");
            JSONArray jsonArray = dataObject.getJSONArray("movies");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                cover = vObj.getString("cover");
                if (vObj.has("upinfo")) {
                    remark = vObj.getString("upinfo");
                    v.put("vod_id", tid + "_" + vObj.getString("id"));
                    v.put("vod_name", vObj.getString("title"));
                    v.put("vod_pic", "https:" + cover);
                    v.put("vod_remarks", remark);
                } else {
                    v.put("vod_id", tid + "_" + vObj.getString("id"));
                    v.put("vod_name", vObj.getString("title"));
                    v.put("vod_pic", "https:" + cover);
                    v.put("vod_remarks", "");
                }
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            int limit = 24;
            int page = Integer.parseInt(dataObject.getString("current_page"));
            int total = dataObject.getInt("total");
            int pageCount = total % limit == 0 ? (total / limit) : (total / limit + 1);
            result.put("page", page);
            result.put("pagecount", pageCount);
            result.put("limit", limit);
            result.put("total", total);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        Iterator it;
        String str;
        String str2;
        Exception e2;
        ArrayList arrayList = new ArrayList();
        Exception e3;
        JSONObject result = new JSONObject();
        try {
            String[] split = ids.get(0).split("_");
            String format = String.format("%s?cat=%s&id=%s", SiteDetail, split[0], split[1]);
            JSONObject jSONObject6 = new JSONObject(OkHttpUtil.string(format, Headers())).getJSONObject("data");
            JSONArray jSONArray = new JSONArray();
            JSONObject list = new JSONObject();
            jSONArray.put(list);
            result.put("list", jSONArray);
            list.put("vod_id", split[0] + "_" + jSONObject6.optString("ent_id"));
            list.put("vod_name", jSONObject6.optString("title"));
            list.put("vod_pic", jSONObject6.optString("cdncover"));
            JSONArray optJSONArray = jSONObject6.optJSONArray("moviecategory");
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList2.add(optJSONArray.getString(i));
            }
            list.put("type_name", TextUtils.join("/", arrayList2));
            list.put("vod_year", jSONObject6.optString("pubdate"));
            JSONArray optJSONArray2 = jSONObject6.optJSONArray("area");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList3.add(optJSONArray2.getString(i2));
            }
            list.put("vod_area", TextUtils.join("/", arrayList3));
            list.put("vod_remarks", jSONObject6.optString("doubanscore"));
            JSONArray optJSONArray3 = jSONObject6.optJSONArray("actor");
            ArrayList arrayList4 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                arrayList4.add(optJSONArray3.getString(i3));
            }
            list.put("vod_actor", TextUtils.join("/", arrayList4));
            JSONArray optJSONArray4 = jSONObject6.optJSONArray("director");
            ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                arrayList5.add(optJSONArray4.getString(i4));
            }
            list.put("vod_director", TextUtils.join("/", arrayList5));
            list.put("vod_content", jSONObject6.optString("description"));
            JSONArray optJSONArray5 = jSONObject6.optJSONArray("playlink_sites");
            ArrayList<String> arrayList6 = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                arrayList6.add(optJSONArray5.getString(i5));
            }
            list.put("vod_play_from", TextUtils.join("$$$", arrayList6));
            JSONObject optJSONObject = jSONObject6.optJSONObject("playlinksdetail");
            JSONObject optJSONObject2 = jSONObject6.optJSONObject("allepidetail");
            JSONArray optJSONArray6 = jSONObject6.optJSONArray("defaultepisode");
            JSONObject optJSONObject3 = jSONObject6.optJSONObject("allupinfo");
            String str7 = "vod_play_url";
            if (optJSONArray6 != null) {
                ArrayList arrayList7 = new ArrayList();
                for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                    try {
                        URL url2 = new URL(optJSONArray6.getJSONObject(i6).optString("url"));
                        arrayList7.add(optJSONArray6.getJSONObject(i6).optString("sort") + "$" + (url2.getProtocol() + "://" + url2.getHost() + url2.getPath()));
                    } catch (Exception e4) {
                        SpiderDebug.log(e4);
                    }
                }
                list.put(str7, TextUtils.join("#", arrayList7));
                return result.toString();
            }
            if (optJSONObject2 == null) {
                ArrayList arrayList8 = new ArrayList();
                for (String str8 : arrayList6) {
                    try {
                        URL url3 = new URL(optJSONObject.getJSONObject(str8).optString("default_url"));
                        arrayList8.add(optJSONObject.getJSONObject(str8).optString("sort") + "$" + (url3.getProtocol() + "://" + url3.getHost() + url3.getPath()));
                    } catch (Exception e5) {
                        SpiderDebug.log(e5);
                    }
                }
                list.put(str7, TextUtils.join("$$$", arrayList8));
            } else {
                ArrayList videos = new ArrayList();
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    String str9 = (String) it2.next();
                    int parseInt = Integer.parseInt(optJSONObject3.optString(str9, "0"));
                    if (parseInt > 50 || parseInt == 0) {
                        it = it2;
                        str = format + "&start=1&end=50&site=" + str9;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(format);
                        it = it2;
                        sb2.append("&start=1&end=");
                        sb2.append(parseInt);
                        sb2.append("&site=");
                        sb2.append(str9);
                        str = sb2.toString();
                    }
                    JSONObject optJSONObject4 = new JSONObject(OkHttpUtil.string(str, Headers())).getJSONObject("data").optJSONObject("allepidetail");
                    ArrayList arrayList10 = new ArrayList();
                    JSONArray jSONArray2 = optJSONObject4.getJSONArray(str9);
                    int i7 = 0;
                    while (true) {
                        str2 = str7;
                        if (i7 >= jSONArray2.length()) {
                            break;
                        }
                        try {
                            String url5 = jSONArray2.getJSONObject(i7).optString("url");
                            arrayList = videos;
                            arrayList10.add(jSONArray2.getJSONObject(i7).optString("playlink_num") + "$" + url5);
                        } catch (Exception e7) {
                            e3 = e7;
                            SpiderDebug.log(e3);
                            i7++;
                        }
                        i7++;
                        str7 = str2;
                        videos = arrayList;
                    }
                    ArrayList arrayList11 = videos;
                    if (parseInt >= jSONArray2.length()) {
                        int i8 = 51;
                        while (i8 < parseInt) {
                            int i9 = i8 + 49;
                            if (i9 > parseInt) {
                                i9 = parseInt;
                            }
                            JSONObject optJSONObject5 = new JSONObject(OkHttpUtil.string(String.format("%s?cat=%s&id=%s&start=%s&end=%s&site=%s", SiteDetail, split[0], split[1], Integer.valueOf(i8), Integer.valueOf(i9), str9), Headers())).optJSONObject("data");
                            if (optJSONObject5 == null) {
                                break;
                            }
                            JSONArray jSONArray3 = optJSONObject5.getJSONObject("allepidetail").getJSONArray(str9);
                            int i10 = 0;
                            while (i10 < jSONArray3.length()) {
                                try {
                                    String url4 = jSONArray3.getJSONObject(i10).optString("url");
                                    try {
                                        arrayList10.add(jSONArray3.getJSONObject(i10).optString("playlink_num") + "$" + url4);
                                    } catch (Exception e8) {
                                        e2 = e8;
                                        SpiderDebug.log(e2);
                                        i10++;
                                    }
                                } catch (Exception e9) {
                                }
                                i10++;
                            }
                            i8 = i9 + 1;
                        }
                    }
                    arrayList11.add(TextUtils.join("#", arrayList10));
                    videos = arrayList11;
                    it2 = it;
                    str7 = str2;
                }
                list.put(str7, TextUtils.join("$$$", videos));
            }
            return result.toString();
        } catch (Exception e10) {
            SpiderDebug.log(e10);
            return "";
        }
    }

    @Override
    public String homeContent(boolean filter) {
        JSONObject results = new JSONObject();
        try {
            results.put("class", ext.getJSONArray("classes"));
            if (filter) {
                results.put("filters", ext.getJSONObject("filter"));
            }
        } catch (JSONException e2) {
            SpiderDebug.log(e2);
        }
        return results.toString();
    }

    @Override
    public String homeVideoContent() {
        JSONObject list = new JSONObject();
        try {
            String str = SiteHost;
            String i = OkHttpUtil.string(str, new HashMap());
            SpiderDebug.log("响应请求：" + str);
            JSONArray optJSONArray = new JSONObject(i).optJSONArray("data");
            JSONArray jSONArray = new JSONArray();
            for (int j = 0; j < optJSONArray.length(); j++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(j);
                JSONObject VideoAtom = new JSONObject();
                VideoAtom.put("vod_id", jSONObject2.optString("cat") + "_" + jSONObject2.optString("ent_id"));
                VideoAtom.put("vod_name", jSONObject2.optString("title"));
                VideoAtom.put("vod_pic", jSONObject2.optString("cover"));
                VideoAtom.put("vod_remarks", jSONObject2.optString("upinfo"));
                jSONArray.put(VideoAtom);
            }
            list.put("list", jSONArray);
        } catch (Exception e2) {
            SpiderDebug.log(e2);
        }
        return list.toString();
    }

    @Override
    public String playerContent(String str, String str2, List<String> list) {
        JSONObject result = new JSONObject();
        try {
            result.put("parse", 1);
            result.put("url", str2);
            result.put("jx", "1");
            result.put("playUrl", "");
        } catch (Exception e2) {
            SpiderDebug.log(e2);
        }
        return result.toString();
    }

    @Override
    public String searchContent(String str, boolean filter) {
        JSONObject optJSONObject;
        JSONObject list = new JSONObject();
        try {
            JSONObject optJSONObject2 = new JSONObject(OkHttpUtil.string(String.format(SiteSearch, str), Headers())).optJSONObject("data");
            if (!(optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("longData")) == null)) {
                JSONArray jSONArray = optJSONObject.getJSONArray("rows");
                JSONArray videos = new JSONArray();
                list.put("list", videos);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject Obj = jSONArray.getJSONObject(i);
                    JSONObject v = new JSONObject();
                    v.put("vod_id", Obj.optString("cat_id") + "_" + Obj.optString("en_id"));
                    v.put("vod_name", Obj.optString("titleTxt"));
                    v.put("vod_pic", Obj.optString("cover"));
                    v.put("vod_remarks", Obj.optString("score"));
                    videos.put(v);
                }
            }
        } catch (Exception e2) {
            SpiderDebug.log(e2);
        }
        return list.toString();
    }
}