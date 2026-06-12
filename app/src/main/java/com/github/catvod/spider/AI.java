package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.g;
import com.github.catvod.spider.merge.C0948d;
import com.github.catvod.spider.merge.C1024e;
import com.github.catvod.spider.merge.C1080f;
import com.github.catvod.spider.merge.C1200g;
import com.github.catvod.spider.merge.C1228h;
import com.github.catvod.spider.merge.C1370pv;
import com.github.catvod.spider.merge.Yy;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class AI extends Spider {

    private static final short[] f0short = {598, 624, 614, 625, 558, 578, 612, 614, 621, 631, 1922, 1947, 1936, 1963, 1924, 1944, 1941, 1933, 1963, 1921, 1926, 1944, 1276, 1253, 1262, 1237, 1274, 1254, 1259, 1267, 1237, 1260, 1272, 1253, 1255, 1724, 1701, 1710, 1685, 1705, 1701, 1700, 1726, 1711, 1700, 1726, 2758, 2783, 2772, 2799, 2772, 2777, 2754, 2773, 2771, 2756, 2783, 2754, 1343, 1318, 1325, 1302, 1320, 1322, 1341, 1318, 1339, 1027, 1050, 1041, 1066, 1031, 1040, 1048, 1044, 1031, 1054, 1030, 3158, 3151, 3140, 3199, 3137, 3154, 3141, 3137, 846, 855, 860, 871, 833, 861, 857, 842, 1819, 1794, 1801, 1842, 1821, 1796, 1806, 466, 459, 448, 507, 458, 453, 457, 449, 2017, 2040, 2035, 1992, 2046, 2035, 2639, 2634, 2640, 2647, 384, 400, 462, 460, 402, 459, 458, 475, 462, 454, 451, 393, 454, 459, 476, 402, 555, 550, 559, 570, 512, 561, 574, 562, 570, 2168, 2145, 2154, 2129, 2157, 2146, 2159, 2173, 2173, 27775, 25790, 21752, 23703, 22131, 22102, -30174, -2025, -29460, 21988, 18705, 22600, 21708, -25204, -2022, -2022, 622, 590, 713, 766, 765, 766, 745, 766, 745, 809, 874, 820, 882, 831, 1890, 1903, 1899, 1902, 1903, 1912, 634, 610, 618, 612, 609, 610, 1738, 1741, 1747, 532, 517, 534, 535, 513, 585, 522, 535, 595, 1969, 1955, 782, 791, 796, 807, 778, 797, 789, 793, 778, 787, 779, 2987, 2994, 3001, 2946, 2989, 2996, 3006, 693, 684, 679, 668, 685, 674, 686, 678, 1478, 1503, 1492, 1519, 1497, 1492, 1594, 1599, 1573, 1570, 2310, 2326, 2376, 2378, 2324, 2399, 2368, 2381, 2380, 2374, 2373, 2368, 2394, 2397, 2319, 2398, 2381, 2324};
    private String apiHost = "";
    private String apiUrl = "";
    private String playParse = "";

    public AI() {
    }

    private HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", this.apiUrl);
        return headers;
    }

    public String detailContent(List<String> ids) {
        String playUrlKey = "vod_play_url";
        String playFromKey = "vod_play_from";
        String contentKey = "vod_content";
        String directorKey = "vod_director";
        String actorKey = "vod_actor";
        String remarksKey = "vod_remarks";
        String areaKey = "vod_area";
        String yearKey = "vod_year";
        String picKey = "vod_pic";
        String nameKey = "vod_name";
        String idKey = "vod_id";
        String listKey = "list";
        try {
            JSONObject vodObj = new JSONObject();
            JSONObject resultObj = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(this.apiHost);
            sb.append("/?ac=detail&ids=");
            sb.append(ids.get(0));
            String detailUrl = sb.toString();
            JSONObject vodData = new JSONObject(Yy.v(detailUrl, getHeaders(detailUrl))).getJSONArray(listKey).optJSONObject(0);
            vodObj.put(idKey, vodData.optString(idKey));
            vodObj.put(nameKey, vodData.optString(nameKey));
            vodObj.put(picKey, vodData.optString(picKey));
            vodObj.put("type_name", vodData.optString("vod_class"));
            vodObj.put(yearKey, vodData.optString(yearKey));
            vodObj.put(areaKey, vodData.optString(areaKey));
            vodObj.put(remarksKey, vodData.optString(remarksKey));
            vodObj.put(actorKey, vodData.optString(actorKey));
            vodObj.put(directorKey, vodData.optString(directorKey));
            vodObj.put(contentKey, "此接口完全免费，请勿上当受骗！！" + vodData.optString(contentKey));
            vodObj.put(playFromKey, vodData.optString(playFromKey));
            vodObj.put(playUrlKey, vodData.optString(playUrlKey));
            JSONArray vodArray = new JSONArray();
            vodArray.put(vodObj);
            resultObj.put(listKey, vodArray);
            return resultObj.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String config) {
        super.init(context, config);
        String[] configParts = C1370pv.l(config).split("\\|");
        this.apiHost = configParts[0];
        this.apiUrl = configParts[1];
        this.playParse = configParts[2];
    }

    public String playerContent(String flag, String playUrl, List<String> vipFlags) {
        try {
            Init2.lj();
            JSONObject headerObj = new JSONObject();
            headerObj.put("Referer", this.playParse);
            JSONObject playerObj = new JSONObject();
            boolean isM3u8 = playUrl.contains(".m3u8");
            String headerKey = "header";
            String qiaojiKey = "qiaoji";
            String urlKey = "url";
            String parseKey = "parse";

            if (!isM3u8) {
                boolean isMp4 = playUrl.contains(".mp4");
                if (!isMp4) {
                    playerObj.put("jx", 1);
                }
            }

            playerObj.put(parseKey, 0);
            playerObj.put(urlKey, playUrl);
            if (!this.playParse.contains(qiaojiKey)) {
                playerObj.put(headerKey, headerObj.toString());
            }

            return playerObj.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String keyword, boolean quick) {
        String remarksKey = "vod_remarks";
        String picKey = "vod_pic";
        String nameKey = "vod_name";
        String idKey = "vod_id";
        String listKey = "list";
        try {
            JSONObject resultObj = new JSONObject();
            String searchUrl = this.apiHost + "/?ac=videolist&wd=" + keyword;
            System.out.println(searchUrl);
            String response = Yy.v(searchUrl, getHeaders(searchUrl));
            JSONArray resultArray = new JSONArray();
            JSONArray videoList = new JSONObject(response).getJSONArray(listKey);
            int index = 0;
            while (index < videoList.length()) {
                JSONObject videoItem = videoList.optJSONObject(index);
                JSONObject itemObj = new JSONObject();
                itemObj.put(idKey, videoItem.optString(idKey));
                itemObj.put(nameKey, videoItem.optString(nameKey));
                itemObj.put(picKey, videoItem.optString(picKey));
                itemObj.put(remarksKey, videoItem.optString(remarksKey));
                resultArray.put(itemObj);
                index++;
            }
            resultObj.put(listKey, resultArray);
            return resultObj.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
