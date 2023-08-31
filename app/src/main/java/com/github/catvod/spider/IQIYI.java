package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rxhttp.wrapper.annotations.NonNull;

public class IQIYI extends Spider {
    protected JSONObject a;
    protected JSONArray xr;
    protected JSONObject q = new JSONObject();
    protected HashMap<String, String> dn = new HashMap<>();

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
        IQIYI iqiyi = this;
        try {
            String str3 = "https://pcw-api.iqiyi.com/search/video/videolists?channel_id=" + str + "&is_purchase=&mode=24&pageNum=" + str2 + "&pageSize=24";
            if (hashMap != null) {
                Set<String> keySet = hashMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (String str4 : keySet) {
                    String trim = hashMap.get(str4).trim();
                    if (str4.matches("\\d+")) {
                        arrayList.add(trim + ";must");
                    } else {
                        str3 = str3 + "&" + str4 + "=" + trim;
                    }
                }
                str3 = str3 + "&three_category_id=" + iqiyi.join(",", arrayList);
            }
            String h = OkHttpUtil.string(str3, getHeaders(str3));
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray optJSONArray = new JSONObject(h).optJSONObject("data").optJSONArray("list");
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name");
                    String q = iqiyi.q(str3, optJSONObject.optString("imageUrl"));
                    String optString2 = optJSONObject.optString("score");
                    String optString3 = optJSONObject.optString("playUrl");
                    if (!optJSONObject.optString("albumId").equals("")) {
                        if (optJSONObject.optInt("sourceId") != 0) {
                            optString3 = "/video/video/baseinfo/" + optJSONObject.optString("tvId") + "?userInfo=verify&jsonpCbName=videoInfo39";
                        } else {
                            optString3 = "/albums/album/avlistinfo?aid=" + optJSONObject.optString("albumId") + "&size=5000&page=1&url=" + optString3;
                        }
                    } else if (optJSONObject.optLong("tvId") != 0) {
                        optString3 = "/video/video/baseinfo/" + optJSONObject.optString("tvId") + "?userInfo=verify&jsonpCbName=videoInfo39";
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", optString3);
                    jSONObject2.put("vod_name", optString);
                    jSONObject2.put("vod_pic", q);
                    jSONObject2.put("vod_remarks", optString2);
                    jSONArray.put(jSONObject2);
                    i++;
                    iqiyi = this;
                    optJSONArray = optJSONArray;
                    str3 = str3;
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
        try {
            String url = "https://pcw-api.iqiyi.com" + list.get(0);
            JSONObject jSONObject = new JSONObject(OkHttpUtil.string(url, getHeaders(url))).getJSONObject("data");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject optJSONObject = jSONObject.optJSONArray("epsodelist") != null ? jSONObject.optJSONArray("epsodelist").optJSONObject(0) : jSONObject;
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", optJSONObject.optString("name").replaceAll("第\\d+(?:集|期)", ""));
            jSONObject2.put("vod_pic", q(url, optJSONObject.optString("imageUrl")));
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("people");
            JSONArray optJSONArray = optJSONObject2.optJSONArray("main_charactor");
            if (optJSONArray == null) {
                optJSONArray = optJSONObject2.optJSONArray("producer");
            }
            if (optJSONArray == null) {
                optJSONArray = optJSONObject2.optJSONArray("guest");
            }
            if (optJSONArray == null) {
                optJSONArray = optJSONObject2.optJSONArray("singer");
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optJSONObject(i).optString("name"));
                }
            }
            JSONArray optJSONArray2 = optJSONObject2.optJSONArray("director");
            if (optJSONArray2 == null) {
                optJSONArray2 = optJSONObject2.optJSONArray("screen_writer");
            }
            if (optJSONArray2 == null) {
                optJSONArray2 = optJSONObject2.optJSONArray("host");
            }
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList2.add(optJSONArray2.optJSONObject(i2).optString("name"));
                }
            }
            jSONObject2.put("vod_remarks", optJSONObject.optString("duration"));
            jSONObject2.put("vod_actor", join(",", arrayList));
            jSONObject2.put("vod_director", join(",", arrayList2));
            jSONObject2.put("vod_content", optJSONObject.optString("description"));
            JSONArray optJSONArray3 = jSONObject.optJSONArray("epsodelist");
            if (optJSONArray3 == null) {
                optJSONArray3 = new JSONArray();
                optJSONArray3.put(jSONObject);
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
                arrayList3.add(optJSONObject3.optString("order") + " " + optJSONObject3.optString("subtitle") + "$" + optJSONObject3.optString("playUrl"));
            }
            jSONObject2.put("vod_play_from", "iqiyi");
            jSONObject2.put("vod_play_url", join("#", arrayList3));
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject3.put("list", jSONArray);
            return jSONObject3.toString(4);
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
        IQIYI iqiyi = this;
        try {
            String str = "https://pcw-api.iqiyi.com/search/video/videolists?channel_id=2&is_purchase=&mode=24&pageNum=1&pageSize=24&data_type=1&site=iqiyi";
            String h = OkHttpUtil.string(str, iqiyi.getHeaders(str));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class", iqiyi.xr);
            if (z) {
                jSONObject.put("filters", iqiyi.a);
            }
            try {
                JSONArray optJSONArray = new JSONObject(h).optJSONObject("data").optJSONArray("list");
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                while (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name");
                    String q = iqiyi.q(str, optJSONObject.optString("imageUrl"));
                    String optString2 = optJSONObject.optString("score");
                    String optString3 = optJSONObject.optString("playUrl");
                    if (!optJSONObject.optString("albumId").equals("")) {
                        if (optJSONObject.optInt("sourceId") != 0) {
                            optString3 = "/video/video/baseinfo/" + optJSONObject.optString("tvId") + "?userInfo=verify&jsonpCbName=videoInfo39";
                        } else {
                            optString3 = "/albums/album/avlistinfo?aid=" + optJSONObject.optString("albumId") + "&size=5000&page=1&url=" + optString3;
                        }
                    } else if (optJSONObject.optLong("tvId") != 0) {
                        optString3 = "/video/video/baseinfo/" + optJSONObject.optString("tvId") + "?userInfo=verify&jsonpCbName=videoInfo39";
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", optString3);
                    jSONObject2.put("vod_name", optString);
                    jSONObject2.put("vod_pic", q);
                    jSONObject2.put("vod_remarks", optString2);
                    jSONArray.put(jSONObject2);
                    i++;
                    iqiyi = this;
                    str = str;
                }
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

    public String homeVideoContent() {
        try {
            JSONArray jSONArray = new JSONObject(OkHttpUtil.string("https://pcw-api.iqiyi.com/api.php/app/index_video?token=", getHeaders("https://pcw-api.iqiyi.com/api.php/app/index_video?token="))).getJSONArray("list");
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
        IQIYI.super.init(context);
        try {
            this.xr = new JSONArray("[{\"type_name\":\"电视\",\"type_id\":\"2\"},{\"type_name\":\"电影\",\"type_id\":\"1\"},{\"type_name\":\"综艺\",\"type_id\":\"6\"},{\"type_name\":\"动漫\",\"type_id\":\"4\"},{\"type_name\":\"纪录\",\"type_id\":\"3\"},{\"type_name\":\"教育\",\"type_id\":\"12\"},{\"type_name\":\"游戏\",\"type_id\":\"8\"},{\"type_name\":\"资讯\",\"type_id\":\"25\"},{\"type_name\":\"娱乐\",\"type_id\":\"7\"},{\"type_name\":\"财经\",\"type_id\":\"24\"},{\"type_name\":\"网络\",\"type_id\":\"1\"},{\"type_name\":\"片花\",\"type_id\":\"10\"},{\"type_name\":\"音乐\",\"type_id\":\"5\"},{\"type_name\":\"军事\",\"type_id\":\"28\"},{\"type_name\":\"体育\",\"type_id\":\"17\"},{\"type_name\":\"儿童\",\"type_id\":\"15\"},{\"type_name\":\"旅游\",\"type_id\":\"9\"},{\"type_name\":\"时尚\",\"type_id\":\"13\"},{\"type_name\":\"生活\",\"type_id\":\"21\"},{\"type_name\":\"汽车\",\"type_id\":\"26\"},{\"type_name\":\"搞笑\",\"type_id\":\"22\"},{\"type_name\":\"广告\",\"type_id\":\"20\"},{\"type_name\":\"原创\",\"type_id\":\"27\"},{\"type_name\":\"母婴\",\"type_id\":\"29\"},{\"type_name\":\"科技\",\"type_id\":\"30\"},{\"type_name\":\"健康\",\"type_id\":\"32\"}]");
            this.a = new JSONObject("{\"22\":[{\"name\":\"分类\",\"value\":[{\"v\":\"22169\",\"n\":\"欢乐精选\"},{\"v\":\"29115\",\"n\":\"娱乐八卦\"},{\"v\":\"29116\",\"n\":\"搞笑短片\"},{\"v\":\"29139\",\"n\":\"影视剧吐槽\"},{\"v\":\"22172\",\"n\":\"雷人囧事\"},{\"v\":\"22171\",\"n\":\"爆笑节目\"},{\"v\":\"1905\",\"n\":\"萌宠\"},{\"v\":\"1909\",\"n\":\"童趣\"},{\"v\":\"1900\",\"n\":\"奇闻趣事\"},{\"v\":\"1902\",\"n\":\"恶搞配音\"},{\"v\":\"22170\",\"n\":\"猎奇\"}],\"key\":\"18074\"},{\"name\":\"地域\",\"value\":[{\"v\":\"1907\",\"n\":\"国内\"},{\"v\":\"1908\",\"n\":\"国外\"}],\"key\":\"18075\"}],\"24\":[{\"name\":\"分类\",\"value\":[{\"v\":\"2233\",\"n\":\"宏观\"},{\"v\":\"2234\",\"n\":\"民生\"},{\"v\":\"2235\",\"n\":\"产经\"},{\"v\":\"2236\",\"n\":\"市场\"},{\"v\":\"2237\",\"n\":\"理财\"},{\"v\":\"2238\",\"n\":\"访谈\"}],\"key\":\"18079\"}],\"25\":[{\"name\":\"类型\",\"value\":[{\"v\":\"20031\",\"n\":\"社会\"},{\"v\":\"20321\",\"n\":\"科技\"},{\"v\":\"21314\",\"n\":\"军事\"},{\"v\":\"21315\",\"n\":\"评论\"},{\"v\":\"21739\",\"n\":\"国内\"},{\"v\":\"21740\",\"n\":\"国际\"}],\"key\":\"20030\"}],\"26\":[{\"name\":\"内容\",\"value\":[{\"v\":\"20529\",\"n\":\"资讯\"},{\"v\":\"20530\",\"n\":\"专访\"},{\"v\":\"20531\",\"n\":\"新车\"},{\"v\":\"20532\",\"n\":\"试驾\"},{\"v\":\"20533\",\"n\":\"用车\"},{\"v\":\"20534\",\"n\":\"赛事\"},{\"v\":\"20535\",\"n\":\"交通\"},{\"v\":\"20536\",\"n\":\"娱乐\"},{\"v\":\"20537\",\"n\":\"车模\"},{\"v\":\"20538\",\"n\":\"改装\"},{\"v\":\"20539\",\"n\":\"车微剧\"},{\"v\":\"20540\",\"n\":\"爱汽车制造\"},{\"v\":\"28463\",\"n\":\"品牌\"},{\"v\":\"28464\",\"n\":\"车展\"},{\"v\":\"28534\",\"n\":\"航空\"},{\"v\":\"28535\",\"n\":\"游艇\"},{\"v\":\"28536\",\"n\":\"轨道\"}],\"key\":\"20528\"},{\"name\":\"车型\",\"value\":[{\"v\":\"20542\",\"n\":\"微型车\"},{\"v\":\"20543\",\"n\":\"小型车\"},{\"v\":\"20544\",\"n\":\"紧凑型车\"},{\"v\":\"20545\",\"n\":\"中型车\"},{\"v\":\"20546\",\"n\":\"中高型车\"},{\"v\":\"20547\",\"n\":\"豪华车\"},{\"v\":\"20548\",\"n\":\"MPV\"},{\"v\":\"20549\",\"n\":\"SUV\"},{\"v\":\"20550\",\"n\":\"跑车\"},{\"v\":\"20551\",\"n\":\"皮卡\"},{\"v\":\"20552\",\"n\":\"微客\"},{\"v\":\"22179\",\"n\":\"新概念\"},{\"v\":\"28465\",\"n\":\"电动车\"},{\"v\":\"28466\",\"n\":\"摩托车\"}],\"key\":\"20541\"},{\"name\":\"地区\",\"value\":[{\"v\":\"20554\",\"n\":\"自主品牌\"},{\"v\":\"20555\",\"n\":\"欧洲品牌\"},{\"v\":\"20556\",\"n\":\"亚洲品牌\"},{\"v\":\"20557\",\"n\":\"北美品牌\"}],\"key\":\"20553\"}],\"27\":[{\"name\":\"分类\",\"value\":[{\"v\":\"21317\",\"n\":\"动画\"},{\"v\":\"27986\",\"n\":\"短片\"},{\"v\":\"28034\",\"n\":\"网络剧\"},{\"v\":\"28053\",\"n\":\"创意广告\"},{\"v\":\"21318\",\"n\":\"微电影\"}],\"key\":\"21316\"}],\"28\":[{\"name\":\"分类\",\"value\":[{\"v\":\"21789\",\"n\":\"军情\"},{\"v\":\"21790\",\"n\":\"深度\"},{\"v\":\"21791\",\"n\":\"兵器\"},{\"v\":\"21792\",\"n\":\"战史\"},{\"v\":\"21793\",\"n\":\"人物\"},{\"v\":\"30090\",\"n\":\"航空航天\"}],\"key\":\"21788\"}],\"29\":[{\"name\":\"类型\",\"value\":[{\"v\":\"24083\",\"n\":\"萌宝乐园\"},{\"v\":\"24084\",\"n\":\"孕期\"},{\"v\":\"24085\",\"n\":\"分娩\"},{\"v\":\"24086\",\"n\":\"妈咪饮食\"},{\"v\":\"24087\",\"n\":\"宝宝饮食\"},{\"v\":\"24088\",\"n\":\"早教课堂\"},{\"v\":\"24089\",\"n\":\"婴幼儿常见疾病\"},{\"v\":\"27345\",\"n\":\"时尚辣妈圈\"},{\"v\":\"27350\",\"n\":\"亲子生活馆\"},{\"v\":\"29619\",\"n\":\"宝宝养育\"},{\"v\":\"29746\",\"n\":\"趣味玩具\"},{\"v\":\"30086\",\"n\":\"行业动态\"}],\"key\":\"24082\"},{\"name\":\"年龄段\",\"value\":[{\"v\":\"24121\",\"n\":\"0-1岁\"},{\"v\":\"24122\",\"n\":\"1-3岁\"},{\"v\":\"24123\",\"n\":\"3-6岁\"},{\"v\":\"24124\",\"n\":\"6岁以上\"}],\"key\":\"24120\"}],\"30\":[{\"name\":\"类型\",\"value\":[{\"v\":\"27936\",\"n\":\"评测\"},{\"v\":\"27937\",\"n\":\"教程\"},{\"v\":\"27938\",\"n\":\"活动\"},{\"v\":\"27939\",\"n\":\"广告\"},{\"v\":\"27974\",\"n\":\"资讯\"},{\"v\":\"28522\",\"n\":\"专访\"},{\"v\":\"27975\",\"n\":\"其他\"}],\"key\":\"24125\"},{\"name\":\"地区\",\"value\":[{\"v\":\"24132\",\"n\":\"国内\"},{\"v\":\"24133\",\"n\":\"国际\"}],\"key\":\"24131\"},{\"name\":\"内容\",\"value\":[{\"v\":\"27972\",\"n\":\"IT业界\"},{\"v\":\"27973\",\"n\":\"互联网\"},{\"v\":\"28521\",\"n\":\"APP\"},{\"v\":\"27942\",\"n\":\"手机\"},{\"v\":\"27943\",\"n\":\"笔记本\"},{\"v\":\"27944\",\"n\":\"智能硬件\"},{\"v\":\"27945\",\"n\":\"平板电脑\"},{\"v\":\"27946\",\"n\":\"数码相机\"},{\"v\":\"27948\",\"n\":\"PC\"},{\"v\":\"27949\",\"n\":\"家电\"},{\"v\":\"27950\",\"n\":\"游戏机\"},{\"v\":\"27951\",\"n\":\"前沿技术\"},{\"v\":\"27952\",\"n\":\"科学探索\"},{\"v\":\"27953\",\"n\":\"爱科技出品\"}],\"key\":\"27940\"}],\"31\":[{\"name\":\"语言\",\"value\":[{\"v\":\"27515\",\"n\":\"普通话\"},{\"v\":\"27516\",\"n\":\"英语\"},{\"v\":\"27517\",\"n\":\"韩语\"},{\"v\":\"27518\",\"n\":\"日语\"}],\"key\":\"27499\"},{\"name\":\"类型\",\"value\":[{\"v\":\"27507\",\"n\":\"文化\"},{\"v\":\"27508\",\"n\":\"娱乐\"},{\"v\":\"27509\",\"n\":\"访谈\"},{\"v\":\"27510\",\"n\":\"社会\"},{\"v\":\"27511\",\"n\":\"搞笑\"},{\"v\":\"27512\",\"n\":\"财经\"},{\"v\":\"27513\",\"n\":\"时尚\"},{\"v\":\"27514\",\"n\":\"历史\"},{\"v\":\"29117\",\"n\":\"电台\"},{\"v\":\"30290\",\"n\":\"科技\"},{\"v\":\"31318\",\"n\":\"相声评书\"},{\"v\":\"31319\",\"n\":\"演讲\"}],\"key\":\"27500\"},{\"name\":\"地区\",\"value\":[{\"v\":\"27502\",\"n\":\"内地\"},{\"v\":\"27503\",\"n\":\"台湾地区\"},{\"v\":\"27504\",\"n\":\"香港地区\"},{\"v\":\"27505\",\"n\":\"日本\"},{\"v\":\"27506\",\"n\":\"韩国\"},{\"v\":\"27824\",\"n\":\"美国\"}],\"key\":\"27501\"}],\"10\":[{\"name\":\"内容分类\",\"value\":[{\"v\":\"1007\",\"n\":\"电影\"},{\"v\":\"1006\",\"n\":\"电视剧\"}],\"key\":\"18031\"},{\"name\":\"电影地区\",\"value\":[{\"v\":\"29801\",\"n\":\"华语\"},{\"v\":\"29802\",\"n\":\"美国\"},{\"v\":\"29811\",\"n\":\"印度\"},{\"v\":\"29805\",\"n\":\"其它\"}],\"key\":\"18032\"},{\"name\":\"电视剧地区\",\"value\":[{\"v\":\"29927\",\"n\":\"内地\"},{\"v\":\"29929\",\"n\":\"韩剧\"},{\"v\":\"29930\",\"n\":\"美剧\"},{\"v\":\"29932\",\"n\":\"日剧\"},{\"v\":\"29934\",\"n\":\"台湾地区\"}],\"key\":\"21260\"},{\"name\":\"电视剧类型\",\"value\":[{\"v\":\"29973\",\"n\":\"网剧\"}],\"key\":\"21238\"}],\"32\":[{\"name\":\"类型\",\"value\":[{\"v\":\"28068\",\"n\":\"资讯\"},{\"v\":\"28069\",\"n\":\"医疗\"},{\"v\":\"28081\",\"n\":\"两性\"},{\"v\":\"28082\",\"n\":\"养生\"},{\"v\":\"28441\",\"n\":\"健身\"},{\"v\":\"28449\",\"n\":\"美容\"},{\"v\":\"28450\",\"n\":\"心理\"},{\"v\":\"28451\",\"n\":\"常识\"},{\"v\":\"28452\",\"n\":\"儿科\"},{\"v\":\"28456\",\"n\":\"老年\"},{\"v\":\"28459\",\"n\":\"宠物\"},{\"v\":\"28462\",\"n\":\"交流分享\"}],\"key\":\"28067\"}],\"11\":[{\"name\":\"类型\",\"value\":[{\"v\":\"990\",\"n\":\"经济\"},{\"v\":\"991\",\"n\":\"人文\"},{\"v\":\"992\",\"n\":\"艺术\"},{\"v\":\"994\",\"n\":\"科技\"},{\"v\":\"995\",\"n\":\"社会\"},{\"v\":\"996\",\"n\":\"哲学\"},{\"v\":\"997\",\"n\":\"心理\"},{\"v\":\"998\",\"n\":\"其它\"}],\"key\":\"18030\"}],\"33\":[{\"name\":\"类型\",\"value\":[{\"v\":\"28900\",\"n\":\"资讯\"},{\"v\":\"28541\",\"n\":\"娱乐\"},{\"v\":\"28542\",\"n\":\"体育\"},{\"v\":\"28543\",\"n\":\"电影\"},{\"v\":\"28544\",\"n\":\"微电影\"},{\"v\":\"28545\",\"n\":\"纪录片\"},{\"v\":\"28546\",\"n\":\"综艺\"},{\"v\":\"28547\",\"n\":\"脱口秀\"},{\"v\":\"28548\",\"n\":\"片花\"},{\"v\":\"28549\",\"n\":\"广告\"},{\"v\":\"28550\",\"n\":\"音乐\"},{\"v\":\"28551\",\"n\":\"动漫\"},{\"v\":\"28552\",\"n\":\"少儿\"},{\"v\":\"28553\",\"n\":\"游戏\"},{\"v\":\"28554\",\"n\":\"教育\"},{\"v\":\"28555\",\"n\":\"生活\"},{\"v\":\"28556\",\"n\":\"原创\"},{\"v\":\"28557\",\"n\":\"搞笑\"},{\"v\":\"28558\",\"n\":\"旅游\"},{\"v\":\"28559\",\"n\":\"时尚\"},{\"v\":\"28560\",\"n\":\"财经\"},{\"v\":\"28561\",\"n\":\"科技\"},{\"v\":\"28562\",\"n\":\"健康\"},{\"v\":\"28563\",\"n\":\"母婴\"},{\"v\":\"28564\",\"n\":\"汽车\"}],\"key\":\"28537\"},{\"name\":\"性质\",\"value\":[{\"v\":\"28895\",\"n\":\"其他\"},{\"v\":\"28565\",\"n\":\"环保\"},{\"v\":\"28566\",\"n\":\"捐款\"},{\"v\":\"28567\",\"n\":\"大病救助\"},{\"v\":\"28568\",\"n\":\"救灾\"},{\"v\":\"28569\",\"n\":\"动物保护\"},{\"v\":\"28570\",\"n\":\"社会关注\"}],\"key\":\"28538\"},{\"name\":\"分类\",\"value\":[{\"v\":\"28595\",\"n\":\"公益资讯\"},{\"v\":\"28596\",\"n\":\"公益人物\"},{\"v\":\"28597\",\"n\":\"公益活动\"},{\"v\":\"28598\",\"n\":\"公益作品\"},{\"v\":\"28599\",\"n\":\"公益影像\"},{\"v\":\"28600\",\"n\":\"公益组织\"}],\"key\":\"28539\"},{\"name\":\"国家/地区\",\"value\":[{\"v\":\"28601\",\"n\":\"国内\"},{\"v\":\"28602\",\"n\":\"国外\"}],\"key\":\"28540\"}],\"12\":[{\"name\":\"分类\",\"value\":[{\"v\":\"32641\",\"n\":\"中小学\"},{\"v\":\"32655\",\"n\":\"大学\"},{\"v\":\"32659\",\"n\":\"职业考证\"},{\"v\":\"32669\",\"n\":\"外语\"},{\"v\":\"32674\",\"n\":\"职场\"},{\"v\":\"32684\",\"n\":\"IT/互联网\"},{\"v\":\"32692\",\"n\":\"财经\"},{\"v\":\"32697\",\"n\":\"文史\"},{\"v\":\"32704\",\"n\":\"艺术\"},{\"v\":\"32712\",\"n\":\"运动健身\"},{\"v\":\"32718\",\"n\":\"健康\"},{\"v\":\"32722\",\"n\":\"心理\"},{\"v\":\"32725\",\"n\":\"亲子\"},{\"v\":\"32732\",\"n\":\"生活\"},{\"v\":\"32890\",\"n\":\"党政\"}],\"key\":\"32640\"}],\"13\":[{\"name\":\"行业\",\"value\":[{\"v\":\"1208\",\"n\":\"服饰\"},{\"v\":\"1209\",\"n\":\"美容\"},{\"v\":\"1210\",\"n\":\"生活\"},{\"v\":\"1211\",\"n\":\"其它\"}],\"key\":\"18051\"},{\"name\":\"季节\",\"value\":[{\"v\":\"1224\",\"n\":\"早春\"},{\"v\":\"1225\",\"n\":\"春夏\"},{\"v\":\"1226\",\"n\":\"早秋\"},{\"v\":\"1227\",\"n\":\"秋冬\"},{\"v\":\"1228\",\"n\":\"其它\"}],\"key\":\"18053\"},{\"name\":\"类型\",\"value\":[{\"v\":\"1229\",\"n\":\"公告牌\"},{\"v\":\"1230\",\"n\":\"奇艺自制\"},{\"v\":\"1231\",\"n\":\"热门综艺\"},{\"v\":\"1232\",\"n\":\"名利场\"},{\"v\":\"1233\",\"n\":\"趋势报道\"},{\"v\":\"1234\",\"n\":\"本季流行\"},{\"v\":\"1235\",\"n\":\"秀场\"},{\"v\":\"1236\",\"n\":\"广告大片\"},{\"v\":\"1237\",\"n\":\"街拍\"},{\"v\":\"1238\",\"n\":\"人物\"},{\"v\":\"1240\",\"n\":\"乐活\"},{\"v\":\"1241\",\"n\":\"其它\"}],\"key\":\"18054\"}],\"14\":[{\"name\":\"地区\",\"value\":[{\"v\":\"1278\",\"n\":\"内地\"},{\"v\":\"1279\",\"n\":\"港台\"},{\"v\":\"1280\",\"n\":\"日韩\"},{\"v\":\"1281\",\"n\":\"欧美\"},{\"v\":\"1282\",\"n\":\"其它\"}],\"key\":\"18055\"},{\"name\":\"类型\",\"value\":[{\"v\":\"1247\",\"n\":\"播报\"},{\"v\":\"1248\",\"n\":\"访谈\"},{\"v\":\"1249\",\"n\":\"搞笑\"},{\"v\":\"1250\",\"n\":\"游戏\"},{\"v\":\"1251\",\"n\":\"选秀\"},{\"v\":\"1252\",\"n\":\"时尚\"},{\"v\":\"1253\",\"n\":\"杂谈\"},{\"v\":\"1254\",\"n\":\"情感\"},{\"v\":\"1255\",\"n\":\"盛会\"},{\"v\":\"1256\",\"n\":\"曲艺\"},{\"v\":\"1257\",\"n\":\"美食\"},{\"v\":\"1258\",\"n\":\"粤语\"},{\"v\":\"1276\",\"n\":\"时尚综艺\"}],\"key\":\"18056\"}],\"15\":[{\"name\":\"地区\",\"value\":[{\"v\":\"1261\",\"n\":\"欧美\"},{\"v\":\"1259\",\"n\":\"大陆\"},{\"v\":\"1260\",\"n\":\"港台\"},{\"v\":\"28933\",\"n\":\"韩国\"},{\"v\":\"1263\",\"n\":\"其它\"}],\"key\":\"18057\"},{\"name\":\"年龄段\",\"value\":[{\"v\":\"4489\",\"n\":\"0-3岁\"},{\"v\":\"28929\",\"n\":\"4-6岁\"},{\"v\":\"4493\",\"n\":\"7-10岁\"},{\"v\":\"4494\",\"n\":\"11-13岁\"}],\"key\":\"20288\"},{\"name\":\"课程类型\",\"value\":[{\"v\":\"28983\",\"n\":\"儿歌\"},{\"v\":\"28984\",\"n\":\"故事\"},{\"v\":\"28985\",\"n\":\"学英语\"},{\"v\":\"28986\",\"n\":\"百科\"},{\"v\":\"28987\",\"n\":\"国学\"},{\"v\":\"28988\",\"n\":\"手工\"},{\"v\":\"28989\",\"n\":\"识字\"},{\"v\":\"28990\",\"n\":\"数学\"},{\"v\":\"28991\",\"n\":\"美术\"},{\"v\":\"28993\",\"n\":\"舞蹈\"},{\"v\":\"30918\",\"n\":\"音乐\"},{\"v\":\"30919\",\"n\":\"诗词\"},{\"v\":\"28994\",\"n\":\"其他\"}],\"key\":\"28982\"}],\"16\":[{\"name\":\"类型\",\"value\":[{\"v\":\"1296\",\"n\":\"喜剧\"},{\"v\":\"1297\",\"n\":\"爱情\"},{\"v\":\"1298\",\"n\":\"动作\"}],\"key\":\"18061\"}],\"17\":[{\"name\":\"大项\",\"value\":[{\"v\":\"1673\",\"n\":\"足球\"},{\"v\":\"1688\",\"n\":\"篮球\"},{\"v\":\"1700\",\"n\":\"网球\"},{\"v\":\"1707\",\"n\":\"高尔夫\"},{\"v\":\"1708\",\"n\":\"赛车\"},{\"v\":\"1712\",\"n\":\"台球\"},{\"v\":\"32632\",\"n\":\"街舞\"},{\"v\":\"22178\",\"n\":\"健身\"},{\"v\":\"1715\",\"n\":\"综合\"}],\"key\":\"18067\"},{\"name\":\"类型\",\"value\":[{\"v\":\"1724\",\"n\":\"集锦\"},{\"v\":\"1725\",\"n\":\"花絮\"},{\"v\":\"1727\",\"n\":\"整场\"},{\"v\":\"1728\",\"n\":\"节目\"},{\"v\":\"1729\",\"n\":\"纪录片\"},{\"v\":\"1730\",\"n\":\"教学\"},{\"v\":\"1837\",\"n\":\"资讯\"},{\"v\":\"22180\",\"n\":\"瞬间\"},{\"v\":\"22182\",\"n\":\"球星\"},{\"v\":\"1731\",\"n\":\"其它\"}],\"key\":\"18066\"}],\"18\":[{\"name\":\"大项\",\"value\":[{\"v\":\"1322\",\"n\":\"足球\"},{\"v\":\"1323\",\"n\":\"网球\"},{\"v\":\"1324\",\"n\":\"曲棍球\"},{\"v\":\"1325\",\"n\":\"羽毛球\"},{\"v\":\"1326\",\"n\":\"手球\"},{\"v\":\"1327\",\"n\":\"排球\"},{\"v\":\"1328\",\"n\":\"乒乓球\"},{\"v\":\"1329\",\"n\":\"篮球\"},{\"v\":\"1330\",\"n\":\"游泳\"},{\"v\":\"1331\",\"n\":\"花样游泳\"},{\"v\":\"1332\",\"n\":\"跳水\"},{\"v\":\"1333\",\"n\":\"水球\"},{\"v\":\"1334\",\"n\":\"田径\"},{\"v\":\"1335\",\"n\":\"自行车\"},{\"v\":\"1336\",\"n\":\"体操\"},{\"v\":\"1337\",\"n\":\"马术\"},{\"v\":\"1338\",\"n\":\"射箭\"},{\"v\":\"1339\",\"n\":\"射击\"},{\"v\":\"1340\",\"n\":\"击剑\"},{\"v\":\"1341\",\"n\":\"举重\"},{\"v\":\"1342\",\"n\":\"拳击\"},{\"v\":\"1343\",\"n\":\"柔道\"},{\"v\":\"1344\",\"n\":\"摔跤\"},{\"v\":\"1345\",\"n\":\"跆拳道\"},{\"v\":\"1346\",\"n\":\"皮划艇\"},{\"v\":\"1347\",\"n\":\"赛艇\"},{\"v\":\"1348\",\"n\":\"帆船\"},{\"v\":\"1349\",\"n\":\"现代五项\"},{\"v\":\"1350\",\"n\":\"铁人三项\"}],\"key\":\"18062\"},{\"name\":\"类型\",\"value\":[{\"v\":\"1316\",\"n\":\"比赛\"},{\"v\":\"1317\",\"n\":\"花絮\"},{\"v\":\"1318\",\"n\":\"节目\"},{\"v\":\"1319\",\"n\":\"访谈\"},{\"v\":\"1320\",\"n\":\"资讯\"},{\"v\":\"1321\",\"n\":\"历史\"}],\"key\":\"18064\"}],\"1\":[{\"name\":\"地区\",\"value\":[{\"v\":\"1\",\"n\":\"华语\"},{\"v\":\"2\",\"n\":\"美国\"},{\"v\":\"3\",\"n\":\"欧洲\"},{\"v\":\"4\",\"n\":\"韩国\"},{\"v\":\"308\",\"n\":\"日本\"},{\"v\":\"28999\",\"n\":\"印度\"},{\"v\":\"5\",\"n\":\"其它\"}],\"key\":\"18000\"},{\"name\":\"类型\",\"value\":[{\"v\":\"8\",\"n\":\"喜剧\"},{\"v\":\"6\",\"n\":\"爱情\"},{\"v\":\"11\",\"n\":\"动作\"},{\"v\":\"131\",\"n\":\"枪战\"},{\"v\":\"291\",\"n\":\"犯罪\"},{\"v\":\"128\",\"n\":\"惊悚\"},{\"v\":\"10\",\"n\":\"恐怖\"},{\"v\":\"289\",\"n\":\"悬疑\"},{\"v\":\"12\",\"n\":\"动画\"},{\"v\":\"27356\",\"n\":\"家庭\"},{\"v\":\"1284\",\"n\":\"奇幻\"},{\"v\":\"9\",\"n\":\"科幻\"},{\"v\":\"7\",\"n\":\"战争\"},{\"v\":\"130\",\"n\":\"青春\"}],\"key\":\"18001\"},{\"name\":\"规格\",\"value\":[{\"v\":\"27397\",\"n\":\"巨制\"},{\"v\":\"27815\",\"n\":\"院线\"},{\"v\":\"30149\",\"n\":\"独播\"},{\"v\":\"27401\",\"n\":\"网络电影\"}],\"key\":\"27396\"}],\"2\":[{\"name\":\"地区\",\"value\":[{\"v\":\"15\",\"n\":\"内地\"},{\"v\":\"17\",\"n\":\"韩剧\"},{\"v\":\"18\",\"n\":\"美剧\"},{\"v\":\"309\",\"n\":\"日剧\"},{\"v\":\"1117\",\"n\":\"台湾地区\"}],\"key\":\"18002\"},{\"name\":\"类型\",\"value\":[{\"v\":\"24\",\"n\":\"古装\"},{\"v\":\"20\",\"n\":\"言情\"},{\"v\":\"23\",\"n\":\"武侠\"},{\"v\":\"30\",\"n\":\"偶像\"},{\"v\":\"1654\",\"n\":\"家庭\"},{\"v\":\"1653\",\"n\":\"青春\"},{\"v\":\"24064\",\"n\":\"都市\"},{\"v\":\"135\",\"n\":\"喜剧\"},{\"v\":\"32\",\"n\":\"悬疑\"},{\"v\":\"149\",\"n\":\"罪案\"},{\"v\":\"148\",\"n\":\"穿越\"},{\"v\":\"139\",\"n\":\"宫廷\"},{\"v\":\"21\",\"n\":\"历史\"},{\"v\":\"145\",\"n\":\"神话\"},{\"v\":\"34\",\"n\":\"科幻\"},{\"v\":\"27\",\"n\":\"年代\"},{\"v\":\"140\",\"n\":\"商战\"},{\"v\":\"24063\",\"n\":\"剧情\"},{\"v\":\"24065\",\"n\":\"网剧\"}],\"key\":\"18003\"}],\"3\":[{\"name\":\"地区\",\"value\":[{\"v\":\"20323\",\"n\":\"国内\"},{\"v\":\"20324\",\"n\":\"国外\"}],\"key\":\"20322\"},{\"name\":\"类型\",\"value\":[{\"v\":\"70\",\"n\":\"人文\"},{\"v\":\"33908\",\"n\":\"美食\"},{\"v\":\"33924\",\"n\":\"医疗\"},{\"v\":\"33933\",\"n\":\"自然\"},{\"v\":\"33945\",\"n\":\"萌宠\"},{\"v\":\"33953\",\"n\":\"财经\"},{\"v\":\"33960\",\"n\":\"罪案\"},{\"v\":\"33967\",\"n\":\"竞技\"},{\"v\":\"33974\",\"n\":\"灾难\"},{\"v\":\"74\",\"n\":\"历史\"},{\"v\":\"73\",\"n\":\"探险\"},{\"v\":\"71\",\"n\":\"社会\"},{\"v\":\"28119\",\"n\":\"科技\"},{\"v\":\"310\",\"n\":\"旅游\"}],\"key\":\"18004\"},{\"name\":\"出品方\",\"value\":[{\"v\":\"31283\",\"n\":\"爱奇艺出品\"}],\"key\":\"28467\"},{\"name\":\"片种\",\"value\":[{\"v\":\"29077\",\"n\":\"纪录电影\"},{\"v\":\"29078\",\"n\":\"系列纪录片\"},{\"v\":\"29082\",\"n\":\"网络纪录片\"},{\"v\":\"29083\",\"n\":\"纪实栏目\"}],\"key\":\"29076\"}],\"4\":[{\"name\":\"地区\",\"value\":[{\"v\":\"37\",\"n\":\"中国大陆\"},{\"v\":\"38\",\"n\":\"日本\"},{\"v\":\"30218\",\"n\":\"欧美\"}],\"key\":\"18005\"},{\"name\":\"版本\",\"value\":[{\"v\":\"30220\",\"n\":\"动画\"},{\"v\":\"32784\",\"n\":\"动画电影\"},{\"v\":\"33482\",\"n\":\"轻动画\"},{\"v\":\"33483\",\"n\":\"短剧\"}],\"key\":\"30219\"},{\"name\":\"风格\",\"value\":[{\"v\":\"30230\",\"n\":\"搞笑\"},{\"v\":\"30232\",\"n\":\"热血\"},{\"v\":\"30233\",\"n\":\"催泪\"},{\"v\":\"30234\",\"n\":\"治愈\"},{\"v\":\"30237\",\"n\":\"励志\"},{\"v\":\"30241\",\"n\":\"机战\"},{\"v\":\"30243\",\"n\":\"恋爱\"},{\"v\":\"30245\",\"n\":\"科幻\"},{\"v\":\"30247\",\"n\":\"奇幻\"},{\"v\":\"30248\",\"n\":\"推理\"},{\"v\":\"30249\",\"n\":\"校园\"},{\"v\":\"30252\",\"n\":\"日常\"},{\"v\":\"30255\",\"n\":\"美食\"},{\"v\":\"30256\",\"n\":\"职场\"},{\"v\":\"30258\",\"n\":\"偶像\"},{\"v\":\"30265\",\"n\":\"泡面\"},{\"v\":\"30267\",\"n\":\"冒险\"},{\"v\":\"30268\",\"n\":\"竞技\"},{\"v\":\"30270\",\"n\":\"合家欢\"},{\"v\":\"32792\",\"n\":\"武侠\"},{\"v\":\"32793\",\"n\":\"玄幻\"}],\"key\":\"30225\"},{\"name\":\"新类型\",\"value\":[{\"v\":\"32796\",\"n\":\"轻小说改编\"},{\"v\":\"32797\",\"n\":\"漫画改编\"},{\"v\":\"32798\",\"n\":\"游戏改编\"},{\"v\":\"32799\",\"n\":\"原创\"}],\"key\":\"32795\"}],\"5\":[{\"name\":\"地区\",\"value\":[{\"v\":\"221\",\"n\":\"内地\"},{\"v\":\"220\",\"n\":\"港台\"},{\"v\":\"219\",\"n\":\"欧美\"},{\"v\":\"218\",\"n\":\"日韩\"},{\"v\":\"217\",\"n\":\"拉美\"},{\"v\":\"216\",\"n\":\"亚洲地区\"},{\"v\":\"215\",\"n\":\"非洲\"}],\"key\":\"18008\"},{\"name\":\"语种\",\"value\":[{\"v\":\"91\",\"n\":\"普通话\"},{\"v\":\"92\",\"n\":\"粤语\"},{\"v\":\"93\",\"n\":\"闽南语\"},{\"v\":\"94\",\"n\":\"英语\"},{\"v\":\"95\",\"n\":\"日语\"},{\"v\":\"96\",\"n\":\"韩语\"},{\"v\":\"97\",\"n\":\"其它\"}],\"key\":\"18009\"}],\"6\":[{\"name\":\"地区\",\"value\":[{\"v\":\"151\",\"n\":\"内地\"},{\"v\":\"152\",\"n\":\"港台\"},{\"v\":\"33306\",\"n\":\"韩国\"},{\"v\":\"154\",\"n\":\"欧美\"},{\"v\":\"1113\",\"n\":\"其它\"}],\"key\":\"18013\"},{\"name\":\"类型\",\"value\":[{\"v\":\"155\",\"n\":\"播报\"},{\"v\":\"156\",\"n\":\"访谈\"},{\"v\":\"158\",\"n\":\"游戏\"},{\"v\":\"292\",\"n\":\"晚会\"},{\"v\":\"2118\",\"n\":\"脱口秀\"},{\"v\":\"2224\",\"n\":\"真人秀\"},{\"v\":\"33860\",\"n\":\"竞演\"}],\"key\":\"18014\"}],\"7\":[{\"name\":\"内容类型\",\"value\":[{\"v\":\"169\",\"n\":\"独家\"},{\"v\":\"170\",\"n\":\"热点\"},{\"v\":\"171\",\"n\":\"原创\"},{\"v\":\"175\",\"n\":\"八卦\"},{\"v\":\"176\",\"n\":\"选秀\"},{\"v\":\"180\",\"n\":\"搞笑\"},{\"v\":\"182\",\"n\":\"颁奖\"},{\"v\":\"183\",\"n\":\"活动\"},{\"v\":\"349\",\"n\":\"结婚\"},{\"v\":\"350\",\"n\":\"去世\"},{\"v\":\"351\",\"n\":\"生子\"},{\"v\":\"352\",\"n\":\"探班\"},{\"v\":\"353\",\"n\":\"事故\"},{\"v\":\"637\",\"n\":\"票房\"},{\"v\":\"951\",\"n\":\"纠纷\"},{\"v\":\"1001\",\"n\":\"星座\"},{\"v\":\"1088\",\"n\":\"演唱会\"},{\"v\":\"1658\",\"n\":\"慈善\"},{\"v\":\"32512\",\"n\":\"话剧\"},{\"v\":\"32513\",\"n\":\"舞蹈\"},{\"v\":\"32514\",\"n\":\"戏曲\"},{\"v\":\"32515\",\"n\":\"儿童剧\"},{\"v\":\"32516\",\"n\":\"歌剧\"},{\"v\":\"32517\",\"n\":\"音乐剧\"},{\"v\":\"32518\",\"n\":\"音乐会\"},{\"v\":\"32519\",\"n\":\"相声\"},{\"v\":\"32520\",\"n\":\"马戏\"},{\"v\":\"32521\",\"n\":\"魔术\"},{\"v\":\"32522\",\"n\":\"展览\"},{\"v\":\"32523\",\"n\":\"其它\"}],\"key\":\"18016\"},{\"name\":\"地区\",\"value\":[{\"v\":\"184\",\"n\":\"内地\"},{\"v\":\"185\",\"n\":\"港台\"},{\"v\":\"186\",\"n\":\"韩国\"},{\"v\":\"187\",\"n\":\"海外\"},{\"v\":\"188\",\"n\":\"其它\"}],\"key\":\"18017\"},{\"name\":\"类型\",\"value\":[{\"v\":\"1077\",\"n\":\"电影\"},{\"v\":\"1078\",\"n\":\"电视\"},{\"v\":\"1079\",\"n\":\"音乐\"},{\"v\":\"1080\",\"n\":\"演出\"},{\"v\":\"1081\",\"n\":\"明星\"},{\"v\":\"1082\",\"n\":\"综艺\"},{\"v\":\"1656\",\"n\":\"公益\"},{\"v\":\"32507\",\"n\":\"展览\"},{\"v\":\"32508\",\"n\":\"艺术节\"},{\"v\":\"32538\",\"n\":\"韩娱演出\"},{\"v\":\"1083\",\"n\":\"其它\"}],\"key\":\"18042\"}],\"8\":[{\"name\":\"类型\",\"value\":[{\"v\":\"21276\",\"n\":\"电子竞技\"},{\"v\":\"21275\",\"n\":\"网络游戏\"},{\"v\":\"21277\",\"n\":\"单机游戏\"},{\"v\":\"21278\",\"n\":\"手机游戏\"},{\"v\":\"30902\",\"n\":\"少儿游戏\"},{\"v\":\"21279\",\"n\":\"游戏美女\"}],\"key\":\"18024\"}],\"9\":[{\"name\":\"类型\",\"value\":[{\"v\":\"354\",\"n\":\"风光\"},{\"v\":\"355\",\"n\":\"饮食\"},{\"v\":\"356\",\"n\":\"住宿\"},{\"v\":\"357\",\"n\":\"新闻\"},{\"v\":\"30150\",\"n\":\"钓鱼\"},{\"v\":\"638\",\"n\":\"出行方式\"},{\"v\":\"29134\",\"n\":\"户外\"},{\"v\":\"29135\",\"n\":\"文化\"},{\"v\":\"639\",\"n\":\"奇趣\"}],\"key\":\"18029\"}],\"20\":[{\"name\":\"分类\",\"value\":[{\"v\":\"1859\",\"n\":\"明星\"},{\"v\":\"1860\",\"n\":\"公益\"},{\"v\":\"1861\",\"n\":\"欧美\"},{\"v\":\"1862\",\"n\":\"形象\"},{\"v\":\"1863\",\"n\":\"搞笑\"},{\"v\":\"1864\",\"n\":\"时尚\"},{\"v\":\"1865\",\"n\":\"儿童\"},{\"v\":\"1866\",\"n\":\"生活\"},{\"v\":\"1868\",\"n\":\"热门\"}],\"key\":\"18070\"},{\"name\":\"行业\",\"value\":[{\"v\":\"1883\",\"n\":\"IT数码\"},{\"v\":\"1884\",\"n\":\"汽车\"},{\"v\":\"1885\",\"n\":\"金融\"},{\"v\":\"1886\",\"n\":\"房地产\"},{\"v\":\"1887\",\"n\":\"化妆品\"},{\"v\":\"1888\",\"n\":\"食品饮料\"},{\"v\":\"1889\",\"n\":\"烟酒\"},{\"v\":\"1890\",\"n\":\"运动户外\"},{\"v\":\"1891\",\"n\":\"服装\"},{\"v\":\"1892\",\"n\":\"鞋包配件\"},{\"v\":\"1893\",\"n\":\"家具电器\"},{\"v\":\"1894\",\"n\":\"医药\"},{\"v\":\"1895\",\"n\":\"珠宝手表\"},{\"v\":\"1896\",\"n\":\"日化用品\"},{\"v\":\"28481\",\"n\":\"游戏\"},{\"v\":\"2295\",\"n\":\"其他\"}],\"key\":\"18073\"},{\"name\":\"版块\",\"value\":[{\"v\":\"2291\",\"n\":\"大赏\"},{\"v\":\"2292\",\"n\":\"微短片\"},{\"v\":\"2293\",\"n\":\"创意\"},{\"v\":\"2294\",\"n\":\"经典\"},{\"v\":\"29114\",\"n\":\"特约播映\"}],\"key\":\"18081\"}],\"21\":[{\"name\":\"分类\",\"value\":[{\"v\":\"2218\",\"n\":\"美食\"},{\"v\":\"31322\",\"n\":\"窍门\"},{\"v\":\"1879\",\"n\":\"家居\"},{\"v\":\"2228\",\"n\":\"宠物\"},{\"v\":\"1878\",\"n\":\"健康\"},{\"v\":\"2226\",\"n\":\"舞蹈\"},{\"v\":\"2230\",\"n\":\"情感\"},{\"v\":\"1876\",\"n\":\"奇闻\"},{\"v\":\"2227\",\"n\":\"休闲\"}],\"key\":\"18071\"},{\"name\":\"地域\",\"value\":[{\"v\":\"1881\",\"n\":\"国内\"},{\"v\":\"1882\",\"n\":\"国外\"}],\"key\":\"18072\"}]}");
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
            String url = "https://search.video.iqiyi.com/o?if=html5&key=" + str + "&pageNum=1&pos=1&pageSize=20";
            String json = OkHttpUtil.string(url, getHeaders(url));
            JSONArray optJSONArray = new JSONObject(json).optJSONObject("data").optJSONArray("docinfos");

            JSONArray videos = new JSONArray();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.getJSONObject(i).optJSONObject("albumDocInfo");
                JSONObject video = new JSONObject();
                String optString = optJSONObject.optString("albumLink");
                video.put("vod_id", "/albums/album/avlistinfo?aid=" + optJSONObject.optString("qipu_id") + "&size=5000&page=1&url=" + optString);
                video.put("vod_name", optJSONObject.optString("albumTitle"));
                video.put("vod_pic", optJSONObject.optString("albumImg"));
                video.put("vod_remarks", optJSONObject.optString("releaseDate"));
                videos.put(video);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", videos);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
