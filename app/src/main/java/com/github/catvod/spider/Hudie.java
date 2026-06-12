package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0131mQ;
import com.github.catvod.spider.merge.C0152vp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONObject;

public class Hudie extends Spider {

    private String baseUrl = "";
    private JSONArray categoryCache = null;

    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("user-agent", "okhttp/4.9.1");
        return headers;
    }

    @Override
    public void init(Context context, String str) {
        super.init(context, str);
        this.baseUrl = C0152vp.m724Mo(str);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject response = new JSONObject();
            String url = this.baseUrl + "/api.php/vod/list?state=" + URLEncoder.encode(tid)
                + "&class=%E5%85%A8%E9%83%A8&area=%E5%85%A8%E9%83%A8&year=%E5%85%A8%E9%83%A8"
                + "&version=%E5%85%A8%E9%83%A8&pg=" + pg;
            JSONArray items = new JSONObject(C0106ZJ.m484FN(url, createHeaders()))
                .optJSONObject("data").getJSONArray("list");
            JSONArray list = new JSONArray();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.optJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.optString("vod_id"));
                entry.put("vod_name", item.optString("vod_name"));
                entry.put("vod_pic", item.optString("vod_pic"));
                entry.put("vod_remarks", item.optString("vod_remarks"));
                list.put(entry);
            }
            response.put("page", pg);
            response.put("pagecount", 40);
            response.put("limit", 18);
            response.put("total", 999);
            response.put("list", list);
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            JSONObject response = new JSONObject();
            JSONObject wrapper = new JSONObject();
            String apiUrl = this.baseUrl + "/api.php/vod/detail2";
            HashMap<String, String> params = new HashMap<>();
            params.put("ids", ids.get(0));
            String uniCode = C0131mQ.m679xC(UUID.randomUUID().toString().getBytes());
            params.put("uni_code", uniCode);
            params.put("ac", "detail");
            params.put("token", "");

            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            C0106ZJ.m492i(C0106ZJ.m488QU(), apiUrl, params, createHeaders(),
                new AbstractC0099V3.Qe(this, response, playFromList, playUrlList) {
                    @Override public void onFailure(Call call, Exception exc) {}
                    @Override public String onResponse(String str) {
                        try {
                            JSONObject data = new JSONObject(str).optJSONObject("data");
                            response.put("vod_id", data.optString("vod_id"));
                            response.put("vod_name", data.optString("vod_name"));
                            response.put("vod_pic", data.optString("vod_pic"));
                            response.put("vod_year", data.optString("vod_year"));
                            response.put("vod_area", data.optString("vod_area"));
                            response.put("vod_actor", data.optString("vod_actor"));
                            response.put("vod_director", data.optString("vod_director"));
                            response.put("vod_remarks", data.optString("vod_remarks"));
                            response.put("vod_content", data.optString("vod_content"));
                            response.put("type_name", data.optString("vod_class"));

                            JSONArray playList = data.getJSONArray("vod_play_list");
                            for (int i = 0; i < playList.length(); i++) {
                                JSONObject source = playList.optJSONObject(i);
                                String showName = source.optJSONObject("player_info").optString("show");
                                String fromName = source.optJSONObject("player_info").optString("from");
                                boolean hasParse2 = source.optJSONObject("player_info").has("parse2");
                                String parseUrl = hasParse2
                                    ? source.optJSONObject("player_info").getJSONArray("parse").optString(0)
                                    : source.optJSONObject("player_info").optString("parse2")
                                        .replaceAll("\\.+", ".");

                                ArrayList<String> episodes = new ArrayList<>();
                                JSONArray urls = source.getJSONArray("urls");
                                for (int j = 0; j < urls.length(); j++) {
                                    JSONObject ep = urls.optJSONObject(j);
                                    episodes.add(ep.optString("name") + "$"
                                        + ep.optString("url") + "*" + parseUrl + "*" + fromName);
                                }
                                if (!episodes.isEmpty()) {
                                    playFromList.add(showName);
                                    playUrlList.add(TextUtils.join("#", episodes));
                                }
                            }
                        } catch (Exception e) { throw new RuntimeException(e); }
                        return str;
                    }
                });
            response.put("vod_play_from", TextUtils.join("$$$", playFromList));
            response.put("vod_play_url", TextUtils.join("$$$", playUrlList));
            JSONArray list = new JSONArray();
            list.put(response);
            wrapper.put("list", list);
            return wrapper.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject response = new JSONObject();
            String html = C0106ZJ.m484FN(this.baseUrl + "/api.php/vod/type", createHeaders());
            JSONArray categories = new JSONArray();
            JSONArray types = new JSONObject(html).getJSONArray("list");
            for (int i = 0; i < types.length(); i++) {
                JSONObject item = types.optJSONObject(i);
                if (!item.optString("type_name").contains("直播")) {
                    JSONObject entry = new JSONObject();
                    entry.put("type_id", item.optString("type_name"));
                    entry.put("type_name", item.optString("type_name"));
                    categories.put(entry);
                }
            }
            response.put("class", categories);
            if (filter) {
                response.put("filters", new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}"));
            }
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            String html = C0106ZJ.m484FN(this.baseUrl + "/api.php/vod/like_list?pg=1", createHeaders());
            JSONArray list = new JSONArray();
            JSONArray items = new JSONObject(html).getJSONArray("list");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.optJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.optString("vod_id"));
                entry.put("vod_name", item.optString("vod_name"));
                entry.put("vod_pic", item.optString("vod_pic"));
                entry.put("vod_remarks", item.optString("vod_remarks"));
                list.put(entry);
            }
            JSONObject response = new JSONObject();
            response.put("list", list);
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        try {
            String[] parts = id.split("\\*");
            String videoUrl = parts[0];
            String parseUrl = parts[1];
            String fromName = parts[2];

            JSONObject result = new JSONObject();
            HashMap<String, String> params = new HashMap<>();
            params.put("url", URLEncoder.encode(parseUrl) + videoUrl);
            C0106ZJ.m492i(C0106ZJ.m488QU(),
                this.baseUrl + "/api.php/vod/m_jie_xi", params, createHeaders(),
                new AbstractC0099V3.Qe(this, result) {
                    @Override public void onFailure(Call call, Exception exc) {}
                    @Override public String onResponse(String str) {
                        try {
                            String url = new JSONObject(str).optString("url");
                            result.put("parse", 0);
                            result.put("url", url);
                        } catch (Exception e) { throw new RuntimeException(e); }
                        return str;
                    }
                });
            return result.toString();
        } catch (Throwable e) {
            return "";
        }
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        try {
            JSONObject response = new JSONObject();
            String url = this.baseUrl + "/api.php/vod/search?keywords=" + URLEncoder.encode(keyword) + "&pg=1&type=1";
            JSONArray items = new JSONObject(C0106ZJ.m484FN(url, createHeaders())).getJSONArray("list");
            JSONArray list = new JSONArray();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.optJSONObject(i);
                JSONObject entry = new JSONObject();
                entry.put("vod_id", item.optString("vod_id"));
                entry.put("vod_name", item.optString("vod_name"));
                entry.put("vod_pic", item.optString("vod_pic"));
                entry.put("vod_remarks", item.optString("vod_remarks"));
                list.put(entry);
            }
            response.put("list", list);
            return response.toString();
        } catch (Throwable e) {
            return "";
        }
    }
}
