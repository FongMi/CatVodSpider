package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Douban extends Spider {
    private final String hostURL = "https://frodo.douban.com/api/v2";
    private final String apikey = "0ac44ae016490db2204ce0a042db2916";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("Host", "frodo.douban.com");
        header.put("Connection", "Keep-Alive");
        header.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
        header.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
        return header;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject hotMovie = new JSONObject()
                    .put("type_id", "hot_gaia")
                    .put("type_name", "热门电影");

            JSONObject hotTV = new JSONObject()
                    .put("type_id", "tv_hot")
                    .put("type_name", "热播剧集");

            JSONObject hotShow = new JSONObject()
                    .put("type_id", "show_hot")
                    .put("type_name", "热播综艺");

            JSONObject movie = new JSONObject()
                    .put("type_id", "movie")
                    .put("type_name", "电影筛选");

            JSONObject tv = new JSONObject()
                    .put("type_id", "tv")
                    .put("type_name", "电视筛选");

            JSONObject rankListMovie = new JSONObject()
                    .put("type_id", "rank_list_movie")
                    .put("type_name", "电影榜单");

            JSONObject rankListTV = new JSONObject()
                    .put("type_id", "rank_list_tv")
                    .put("type_name", "电视剧榜单");

            JSONArray classes = new JSONArray()
                    .put(hotMovie)
                    .put(hotTV)
                    .put(hotShow)
                    .put(movie)
                    .put(tv)
                    .put(rankListMovie)
                    .put(rankListTV);
            // filter 二级筛选 start
            String f = "{\"hot_gaia\": [{\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"热度\", \"v\": \"recommend\"}, {\"n\": \"最新\", \"v\": \"time\"}, {\"n\": \"评分\", \"v\": \"rank\"}]}, {\"key\": \"area\", \"name\": \"地区\", \"value\": [{\"n\": \"全部\", \"v\": \"全部\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}]}], \"tv_hot\": [{\"key\": \"type\", \"name\": \"分类\", \"value\": [{\"n\": \"综合\", \"v\": \"tv_hot\"}, {\"n\": \"国产剧\", \"v\": \"tv_domestic\"}, {\"n\": \"欧美剧\", \"v\": \"tv_american\"}, {\"n\": \"日剧\", \"v\": \"tv_japanese\"}, {\"n\": \"韩剧\", \"v\": \"tv_korean\"}, {\"n\": \"动画\", \"v\": \"tv_animation\"}]}], \"show_hot\": [{\"key\": \"type\", \"name\": \"分类\", \"value\": [{\"n\": \"综合\", \"v\": \"show_hot\"}, {\"n\": \"国内\", \"v\": \"show_domestic\"}, {\"n\": \"国外\", \"v\": \"show_foreign\"}]}], \"movie\": [{\"key\": \"类型\", \"name\": \"类型\", \"value\": [{\"n\": \"全部类型\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"传记\", \"v\": \"传记\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"情色\", \"v\": \"情色\"}, {\"n\": \"灾难\", \"v\": \"灾难\"}, {\"n\": \"西部\", \"v\": \"西部\"}, {\"n\": \"纪录片\", \"v\": \"纪录片\"}, {\"n\": \"短片\", \"v\": \"短片\"}]}, {\"key\": \"地区\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"俄罗斯\", \"v\": \"俄罗斯\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"澳大利亚\", \"v\": \"澳大利亚\"}, {\"n\": \"爱尔兰\", \"v\": \"爱尔兰\"}, {\"n\": \"瑞典\", \"v\": \"瑞典\"}, {\"n\": \"巴西\", \"v\": \"巴西\"}, {\"n\": \"丹麦\", \"v\": \"丹麦\"}]}, {\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"近期热度\", \"v\": \"T\"}, {\"n\": \"首映时间\", \"v\": \"R\"}, {\"n\": \"高分优先\", \"v\": \"S\"}]}, {\"key\": \"年代\", \"name\": \"年代\", \"value\": [{\"n\": \"全部年代\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2010年代\", \"v\": \"2010年代\"}, {\"n\": \"2000年代\", \"v\": \"2000年代\"}, {\"n\": \"90年代\", \"v\": \"90年代\"}, {\"n\": \"80年代\", \"v\": \"80年代\"}, {\"n\": \"70年代\", \"v\": \"70年代\"}, {\"n\": \"60年代\", \"v\": \"60年代\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}], \"tv\": [{\"key\": \"类型\", \"name\": \"类型\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"电视剧\", \"v\": \"电视剧\"}, {\"n\": \"综艺\", \"v\": \"综艺\"}]}, {\"key\": \"电视剧形式\", \"name\": \"电视剧形式\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"喜剧\", \"v\": \"喜剧\"}, {\"n\": \"爱情\", \"v\": \"爱情\"}, {\"n\": \"悬疑\", \"v\": \"悬疑\"}, {\"n\": \"动画\", \"v\": \"动画\"}, {\"n\": \"武侠\", \"v\": \"武侠\"}, {\"n\": \"古装\", \"v\": \"古装\"}, {\"n\": \"家庭\", \"v\": \"家庭\"}, {\"n\": \"犯罪\", \"v\": \"犯罪\"}, {\"n\": \"科幻\", \"v\": \"科幻\"}, {\"n\": \"恐怖\", \"v\": \"恐怖\"}, {\"n\": \"历史\", \"v\": \"历史\"}, {\"n\": \"战争\", \"v\": \"战争\"}, {\"n\": \"动作\", \"v\": \"动作\"}, {\"n\": \"冒险\", \"v\": \"冒险\"}, {\"n\": \"传记\", \"v\": \"传记\"}, {\"n\": \"剧情\", \"v\": \"剧情\"}, {\"n\": \"奇幻\", \"v\": \"奇幻\"}, {\"n\": \"惊悚\", \"v\": \"惊悚\"}, {\"n\": \"灾难\", \"v\": \"灾难\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}]}, {\"key\": \"综艺形式\", \"name\": \"综艺形式\", \"value\": [{\"n\": \"不限\", \"v\": \"\"}, {\"n\": \"真人秀\", \"v\": \"真人秀\"}, {\"n\": \"脱口秀\", \"v\": \"脱口秀\"}, {\"n\": \"音乐\", \"v\": \"音乐\"}, {\"n\": \"歌舞\", \"v\": \"歌舞\"}]}, {\"key\": \"地区\", \"name\": \"地区\", \"value\": [{\"n\": \"全部地区\", \"v\": \"\"}, {\"n\": \"华语\", \"v\": \"华语\"}, {\"n\": \"欧美\", \"v\": \"欧美\"}, {\"n\": \"国外\", \"v\": \"国外\"}, {\"n\": \"韩国\", \"v\": \"韩国\"}, {\"n\": \"日本\", \"v\": \"日本\"}, {\"n\": \"中国大陆\", \"v\": \"中国大陆\"}, {\"n\": \"中国香港\", \"v\": \"中国香港\"}, {\"n\": \"美国\", \"v\": \"美国\"}, {\"n\": \"英国\", \"v\": \"英国\"}, {\"n\": \"泰国\", \"v\": \"泰国\"}, {\"n\": \"中国台湾\", \"v\": \"中国台湾\"}, {\"n\": \"意大利\", \"v\": \"意大利\"}, {\"n\": \"法国\", \"v\": \"法国\"}, {\"n\": \"德国\", \"v\": \"德国\"}, {\"n\": \"西班牙\", \"v\": \"西班牙\"}, {\"n\": \"俄罗斯\", \"v\": \"俄罗斯\"}, {\"n\": \"瑞典\", \"v\": \"瑞典\"}, {\"n\": \"巴西\", \"v\": \"巴西\"}, {\"n\": \"丹麦\", \"v\": \"丹麦\"}, {\"n\": \"印度\", \"v\": \"印度\"}, {\"n\": \"加拿大\", \"v\": \"加拿大\"}, {\"n\": \"爱尔兰\", \"v\": \"爱尔兰\"}, {\"n\": \"澳大利亚\", \"v\": \"澳大利亚\"}]}, {\"key\": \"sort\", \"name\": \"排序\", \"value\": [{\"n\": \"近期热度\", \"v\": \"T\"}, {\"n\": \"首播时间\", \"v\": \"R\"}, {\"n\": \"高分优先\", \"v\": \"S\"}]}, {\"key\": \"年代\", \"name\": \"年代\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"2023\", \"v\": \"2023\"}, {\"n\": \"2022\", \"v\": \"2022\"}, {\"n\": \"2021\", \"v\": \"2021\"}, {\"n\": \"2020\", \"v\": \"2020\"}, {\"n\": \"2019\", \"v\": \"2019\"}, {\"n\": \"2010年代\", \"v\": \"2010年代\"}, {\"n\": \"2000年代\", \"v\": \"2000年代\"}, {\"n\": \"90年代\", \"v\": \"90年代\"}, {\"n\": \"80年代\", \"v\": \"80年代\"}, {\"n\": \"70年代\", \"v\": \"70年代\"}, {\"n\": \"60年代\", \"v\": \"60年代\"}, {\"n\": \"更早\", \"v\": \"更早\"}]}, {\"key\": \"平台\", \"name\": \"平台\", \"value\": [{\"n\": \"全部\", \"v\": \"\"}, {\"n\": \"腾讯视频\", \"v\": \"腾讯视频\"}, {\"n\": \"爱奇艺\", \"v\": \"爱奇艺\"}, {\"n\": \"优酷\", \"v\": \"优酷\"}, {\"n\": \"湖南卫视\", \"v\": \"湖南卫视\"}, {\"n\": \"Netflix\", \"v\": \"Netflix\"}, {\"n\": \"HBO\", \"v\": \"HBO\"}, {\"n\": \"BBC\", \"v\": \"BBC\"}, {\"n\": \"NHK\", \"v\": \"NHK\"}, {\"n\": \"CBS\", \"v\": \"CBS\"}, {\"n\": \"NBC\", \"v\": \"NBC\"}, {\"n\": \"tvN\", \"v\": \"tvN\"}]}], \"rank_list_movie\": [{\"key\": \"榜单\", \"name\": \"榜单\", \"value\": [{\"n\": \"实时热门电影\", \"v\": \"movie_real_time_hotest\"}, {\"n\": \"一周口碑电影榜\", \"v\": \"movie_weekly_best\"}, {\"n\": \"豆瓣电影Top250\", \"v\": \"movie_top250\"}]}], \"rank_list_tv\": [{\"key\": \"榜单\", \"name\": \"榜单\", \"value\": [{\"n\": \"实时热门电视\", \"v\": \"tv_real_time_hotest\"}, {\"n\": \"华语口碑剧集榜\", \"v\": \"tv_chinese_best_weekly\"}, {\"n\": \"全球口碑剧集榜\", \"v\": \"tv_global_best_weekly\"}, {\"n\": \"国内口碑综艺榜\", \"v\": \"show_chinese_best_weekly\"}, {\"n\": \"国外口碑综艺榜\", \"v\": \"show_global_best_weekly\"}]}]}";
            JSONObject filterConfig = new JSONObject(f);
            // filter 二级筛选 end
            JSONObject result = new JSONObject()
                    .put("class", classes)
                    .put("filters", filterConfig);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            HashMap<String, String> ext = new HashMap<>();
            if (extend != null && extend.size() > 0) {
                ext.putAll(extend);
            }
            String sort = ext.get("sort") == null ? "T" : ext.get("sort");
            String tags = URLEncoder.encode(getTags(ext));
            int start = (Integer.parseInt(pg) - 1) * 20;
            String cateURL = "";
            String itemKey = "items";
            switch (tid) {
                case "hot_gaia": // 热播电影
                    sort = ext.get("sort") == null ? "recommend" : ext.get("sort");
                    String area = ext.get("area") == null ? "全部" : ext.get("area");
                    sort = sort + "&area=" + URLEncoder.encode(area);
                    cateURL = hostURL + "/movie/hot_gaia" + "?apikey=" + apikey + "&sort=" + sort + "&start=" + start + "&count=20";
                    break;
                case "tv_hot": // 热播电视剧
                    String type = ext.get("type") == null ? "tv_hot" : ext.get("type");
                    cateURL = hostURL + "/subject_collection/" + type + "/items" + "?apikey=" + apikey + "&start=" + start + "&count=20";
                    itemKey = "subject_collection_items";
                    break;
                case "show_hot": // 热播综艺
                    String showType = ext.get("type") == null ? "show_hot" : ext.get("type");
                    cateURL = hostURL + "/subject_collection/" + showType + "/items" + "?apikey=" + apikey + "&start=" + start + "&count=20";
                    itemKey = "subject_collection_items";
                    break;
                case "tv": // 电视 / 综艺 筛选
                    cateURL = hostURL + "/tv/recommend" + "?apikey=" + apikey + "&sort=" + sort + "&tags=" + tags + "&start=" + start + "&count=20";
                    break;
                case "rank_list_movie": // 电影榜单
                    String rankMovieType = ext.get("榜单") == null ? "movie_real_time_hotest" : ext.get("榜单");
                    cateURL = hostURL + "/subject_collection/" + rankMovieType + "/items" + "?apikey=" + apikey + "&start=" + start + "&count=20";
                    itemKey = "subject_collection_items";
                    break;
                case "rank_list_tv": // 电视剧榜单
                    String rankTVType = ext.get("榜单") == null ? "tv_real_time_hotest" : ext.get("榜单");
                    cateURL = hostURL + "/subject_collection/" + rankTVType + "/items" + "?apikey=" + apikey + "&start=" + start + "&count=20";
                    itemKey = "subject_collection_items";
                    break;
                default: // 电影筛选
                    cateURL = hostURL + "/movie/recommend" + "?apikey=" + apikey + "&sort=" + sort + "&tags=" + tags + "&start=" + start + "&count=20";
            }
            String jsonStr = OkHttp.string(cateURL, getHeader());
            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray items = jsonObject.getJSONArray(itemKey);
            JSONArray videos = new JSONArray();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                String id = item.optString("id");
                String name = item.optString("title");
                String pic = getPic(item);
                String remark = getRating(item);
                String vid = id + "###" + name + "###" + pic;
                JSONObject vod = new JSONObject()
                        .put("vod_id", vid)
                        .put("vod_name", name)
                        .put("vod_pic", pic)
                        .put("vod_remarks", remark);
                videos.put(vod);
            }
            JSONObject result = new JSONObject()
                    .put("pagecount", 999)
                    .put("list", videos);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getRating(JSONObject item) {
        try {
            return "评分：" + item.getJSONObject("rating").optString("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getPic(JSONObject item) {
        try {
            return item.getJSONObject("pic").optString("normal") + "@Referer=https://api.douban.com/@User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    private String getTags(HashMap<String, String> ext) {
        try {
            StringBuilder tags = new StringBuilder();
            for (String key : ext.keySet()) {
                if (key.equals("sort")) continue;
                String value = ext.get(key);
                tags.append(value).append(",");
            }
            return tags.substring(0, tags.lastIndexOf(","));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    @Override
    public String detailContent(List<String> ids) {
        try {
            String[] split = ids.get(0).split("###");

            String name = split[1];
            String pic = split[2];
            String tips = "如果15秒内不能播放，请看其他片或进行搜索";
            JSONObject vodInfo = new JSONObject()
                    .put("vod_id", ids.get(0))
                    .put("vod_name", name)
                    .put("vod_pic", pic)
                    .put("type_name", "")
                    .put("vod_year", "")
                    .put("vod_area", "")
                    .put("vod_remarks", "")
                    .put("vod_actor", tips)
                    .put("vod_director", tips)
                    .put("vod_content", tips);

            JSONArray jsonArray = new JSONArray()
                    .put(vodInfo);
            JSONObject result = new JSONObject()
                    .put("list", jsonArray);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}