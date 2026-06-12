package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0082OO;
import com.github.catvod.spider.merge.C0093Tt;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0116dX;
import com.github.catvod.spider.merge.C0117f4;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0147tG;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0173;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import com.github.catvod.spider.merge.C0177;
import com.github.catvod.spider.merge.C0178;
import com.github.catvod.spider.merge.C0179;
import com.github.catvod.spider.merge.C0181;
import com.github.catvod.spider.merge.C0183;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Ddrk Video Spider - Standard Implementation
 *
 * This spider handles video content with features:
 * - Search functionality with regex pattern matching
 * - Player content processing with proxy support
 * - HTML parsing for video information extraction
 * - Category and home content management
 */
public class DdrkStandard extends Spider {

    // Encoded string array for decoding operations
    private static final short[] DECODE_ARRAY = {
        1175, 1243, 1241, 1228, 1245, 1247, 1239, 1226, 1217, 1175, 1168, 1252, 1259, 1171, 1169, 1175, 1422, 1426, 1426, 1430,
        1429, 1500, 1481, 1481, 1410, 1410, 1439, 1429, 1480, 1430, 1428, 1417, 1481, 1486, 1466, 1461, 1485, 1487, 1481, 1233,
        1246, 1190, 1186, 1277, 1260, 1258, 1256, 1186, 1189, 1233, 1246, 1190, 1188, 1233, 1246, 1190, 2918, 2921, 2833, 2834,
        2898, 2894, 2894, 2890, 2918, 2921, 2833, 2909, 2835, 1003, 996, 924, 927, 921, 925, 926, 2574, 2591, 2591, 2563, 2566,
        2572, 2574, 2587, 2566, 2560, 2561, 2624, 2560, 2572, 2587, 2570, 2587, 2626, 2588, 2587, 2589, 2570, 2574, 2562, 2200,
        2186, 2189, 2201, 2203, 2203, 3073, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149,
        3154, 3099, 3156, 3079, 3189, 3149, 3154, 3098, 3156, 3079, 3074, 3189, 3149, 3154, 3099, 3156, 3091, 3189, 3149, 3154,
        3099, 3156, 3091, 3189, 3149, 3154, 3099, 3156, 3079, 3189, 3149, 3154, 3098, 3156, 3072, 3079, 3075, 2811, 2798, 2462,
        2538, 2514, 2509, 2436, 2507, 2444, 2538, 2514, 2509, 2436, 2507, 2456, 2538, 2514, 2509, 2437, 2507, 2463, 2456, 2460,
        2441, 2462, 2454, 2459, 2459, 2440, 2454, 2463, 2462, 2538, 2514, 2509, 2436, 2507, 2444, 2538, 2514, 2509, 2436, 2507,
        2456, 2538, 2514, 2509, 2437, 2507, 2463, 2456, 2460, 3006, 3006, 2996, 2986, 3007, 2986, 3004, 3006, 3006, 2996, 2986,
        3005, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3188, 3078,
        3134, 3105, 3177, 3111, 3188, 3185, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134, 3105, 3176, 3111, 3168, 3078, 3134,
        3105, 3176, 3111, 3188, 3078, 3134, 3105, 3177, 3111, 834, 1758, 1784, 1774, 1785, 1702, 1738, 1772, 1774, 1765, 1791,
        3026, 3007, 2973, 2952, 2971, 2974, 2974, 2963, 3037, 3015, 3036, 3010, 3026, 3034, 3007, 2963, 2961, 2971, 2972, 2950,
        2973, 2945, 2970, 3017, 3026, 3003, 2972, 2950, 2967, 2974, 3026, 3007, 2963, 2961, 3026, 3005, 2977, 3026, 2986, 3026,
        3011, 3010, 2989, 3011, 3015, 2989, 3013, 3035, 3026, 2995, 2946, 2946, 2974, 2967, 2981, 2967, 2960, 3001, 2971, 2950,
        3037, 3015, 3009, 3013, 3036, 3009, 3012, 3026, 3034, 3001, 3002, 2982, 3007, 3006, 3038, 3026, 2974, 2971, 2969, 2967,
        3026, 2997, 2967, 2961, 2969, 2973, 3035, 3026, 2993, 2970, 2944, 2973, 2975, 2967, 3037, 3019, 3011, 3036, 3010, 3036,
        3014, 3014, 3013, 3008, 3036, 3011, 3011, 3014, 3026, 2977, 2963, 2964, 2963, 2944, 2971, 3037, 3015, 3009, 3013, 3036,
        3009, 3012, 1060, 1043, 1040, 1043, 1028, 1043, 1028, 3114, 3170, 3198, 3198, 3194, 3193, 3120, 3109, 3109, 3182, 3182,
        3187, 3193, 3108, 3194, 3192, 3173, 3109, 948, 914, 900, 915, 972, 928, 902, 900, 911, 917, 2158, 2051, 2081, 2100, 2087,
        2082, 2082, 2095, 2145, 2171, 2144, 2174, 2158, 2150, 2073, 2087, 2080, 2090, 2081, 2105, 2109, 2158, 2048, 2074, 2158,
        2175, 2174, 2144, 2174, 2165, 2158, 2073, 2087, 2080, 2168, 2170, 2165, 2158, 2102, 2168, 2170, 2151, 2158, 2063, 2110,
        2110, 2082, 2091, 2073, 2091, 2092, 2053, 2087, 2106, 2145, 2171, 2173, 2169, 2144, 2173, 2168, 2158, 2150, 2053, 2054,
        2074, 2051, 2050, 2146, 2158, 2082, 2087, 2085, 2091, 2158, 2057, 2091, 2093, 2085, 2081, 2151, 2158, 2061, 2086, 2108,
        2081, 2083, 2091, 2145, 2175, 2175, 2175, 2144, 2174, 2144, 2174, 2144, 2174, 2158, 2077, 2095, 2088, 2095, 2108, 2087,
        // Truncated for readability - full array continues...
        2145, 2171, 2173, 2169, 2144, 2173, 2168, 2158, 2059, 2090, 2089, 2145, 2175, 2175, 2175, 2144, 2174, 2144, 2175, 2168,
        2168, 2175, 2144, 2170, 2170, 2091, 2076, 2079, 2076, 2059, 2076, 2059, 1937, 2009, 1989, 1989, 1985, 1986, 1931, 1950,
        1950, 2005, 2005, 1992, 1986, 1951, 1985, 1987, 2014, 1950, 2058, 2132, 2123, 2135, 2128, 2057, 2118, 2123, 2140, 2057,
        2128, 2125, 2128, 2120, 2113, 2052, 2117, 2939, 1602, 1630, 1630, 1626, 1625, 1552, 1541, 1541, 1614, 1614, 1619, 1625,
        1540, 1626, 1624, 1605, 1541
    };

    // Regex patterns for content parsing
    protected Pattern videoListPattern = Pattern.compile(decodeString(0, 16, 1208));
    protected Pattern videoDetailPattern = Pattern.compile(decodeString(16, 23, 1510));
    protected Pattern episodePattern = Pattern.compile(decodeString(39, 17, 1165));
    protected Pattern titlePattern = Pattern.compile(decodeString(56, 13, 2874));
    protected Pattern urlPattern = Pattern.compile(decodeString(69, 7, 951));

    // Configuration fields
    protected JSONObject config;

    /**
     * Constructor - initializes the spider
     */
    public DdrkStandard() {
        // Simple initialization
    }

    /**
     * Decodes string from the encoded array
     * @param offset Start position in array
     * @param length Number of elements to decode
     * @param key Decoding key
     * @return Decoded string
     */
    private static String decodeString(int offset, int length, int key) {
        return C0168.m805(DECODE_ARRAY, offset, length, key);
    }

    /**
     * Creates HTTP headers for requests
     * @param url Request URL
     * @return HashMap containing headers
     */
    protected HashMap<String, String> createHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();

        // Add standard headers
        headers.put(decodeString(428, 10, 993), // "User-Agent"
                   decodeString(438, 130, 2126)); // User agent string

        headers.put(decodeString(568, 7, 2169), // "Referer"
                   decodeString(575, 18, 1969)); // Referer URL

        return headers;
    }

    /**
     * Initializes spider with context and configuration
     * @param context Android context
     * @param configStr Configuration string
     */
    @Override
    public void init(Context context, String configStr) {
        super.init(context, configStr);

        try {
            if (!TextUtils.isEmpty(configStr)) {
                this.config = new JSONObject(configStr);
            } else {
                this.config = new JSONObject();
            }
        } catch (JSONException e) {
            this.config = new JSONObject();
        }
    }

    /**
     * Retrieves home page content with categories
     * @param filter Whether to apply filters
     * @return JSON string with home content
     */
    @Override
    public String homeContent(boolean filter) throws JSONException {
        try {
            JSONObject response = new JSONObject();
            JSONArray categoryList = new JSONArray();

            // Add default categories
            addCategory(categoryList, "1", "电影", "movie");
            addCategory(categoryList, "2", "电视剧", "tv");
            addCategory(categoryList, "3", "综艺", "variety");
            addCategory(categoryList, "4", "动漫", "anime");
            addCategory(categoryList, "5", "纪录片", "documentary");

            response.put("class", categoryList);

            // Add filter configuration if needed
            if (filter) {
                JSONObject filters = new JSONObject();
                // Add filter options here
                response.put("filters", filters);
            }

            return response.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Helper method to add category to list
     * @param categoryList Category list array
     * @param id Category ID
     * @param name Category name
     * @param type Category type
     */
    private void addCategory(JSONArray categoryList, String id, String name, String type) throws JSONException {
        JSONObject category = new JSONObject();
        category.put("type_id", id);
        category.put("type_name", name);
        category.put("type_flag", "1");
        categoryList.put(category);
    }

    /**
     * Retrieves detailed content for a specific video
     * @param ids List containing video ID
     * @return JSON string with video details
     */
    @Override
    public String detailContent(List<String> ids) {
        try {
            JSONObject response = new JSONObject();
            JSONArray videoList = new JSONArray();
            JSONObject videoDetail = new JSONObject();

            String videoId = ids.get(0);

            // Build detail URL
            String detailUrl = "https://ddrk.me/detail/" + videoId + ".html";
            String htmlContent = C0106ZJ.m484FN(detailUrl, createHeaders(detailUrl));

            // Parse HTML content
            C0082OO document = C0093Tt.m440q(htmlContent);

            // Extract video information
            String title = document.m654b(".video-title").m596u().trim();
            String imageUrl = document.m654b(".video-pic img").m595q("src");
            String description = document.m654b(".video-desc").m596u().trim();

            // Extract additional metadata
            C0116dX infoElements = document.m654b(".video-info .info-item");
            String director = "";
            String actor = "";
            String area = "";
            String language = "";
            String year = "";
            String category = "";

            for (int i = 0; i < infoElements.size(); i++) {
                C0127lK element = infoElements.get(i);
                String infoText = element.m596u().trim();

                if (infoText.contains("导演")) {
                    director = extractInfoValue(infoText, "导演");
                } else if (infoText.contains("主演")) {
                    actor = extractInfoValue(infoText, "主演");
                } else if (infoText.contains("地区")) {
                    area = extractInfoValue(infoText, "地区");
                } else if (infoText.contains("语言")) {
                    language = extractInfoValue(infoText, "语言");
                } else if (infoText.contains("年份")) {
                    year = extractInfoValue(infoText, "年份");
                } else if (infoText.contains("类型")) {
                    category = extractInfoValue(infoText, "类型");
                }
            }

            // Build video detail object
            videoDetail.put("vod_id", videoId);
            videoDetail.put("vod_name", title);
            videoDetail.put("vod_pic", imageUrl);
            videoDetail.put("vod_content", description);
            videoDetail.put("vod_director", director);
            videoDetail.put("vod_actor", actor);
            videoDetail.put("vod_area", area);
            videoDetail.put("vod_lang", language);
            videoDetail.put("vod_year", year);
            videoDetail.put("type_name", category);

            // Extract play URLs
            String playInfo = extractPlayInfo(document);
            videoDetail.put("vod_play_from", "Ddrk");
            videoDetail.put("vod_play_url", playInfo);

            videoList.put(videoDetail);
            response.put("list", videoList);

            return response.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Extracts info value from formatted string
     * @param infoText Full info text
     * @param label Label to extract
     * @return Extracted value
     */
    private String extractInfoValue(String infoText, String label) {
        try {
            String[] parts = infoText.split(":");
            if (parts.length >= 2 && parts[0].trim().equals(label)) {
                return parts[1].trim();
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Extracts play information from document
     * @param document Parsed HTML document
     * @return Play URL string
     */
    private String extractPlayInfo(C0082OO document) {
        try {
            StringBuilder playUrls = new StringBuilder();
            C0116dX playElements = document.m654b(".play-list a");

            for (int i = 0; i < playElements.size(); i++) {
                C0127lK element = playElements.get(i);
                String episodeName = element.m596u().trim();
                String episodeUrl = element.m595q("href");

                if (playUrls.length() > 0) {
                    playUrls.append("#");
                }
                playUrls.append(episodeName).append("$").append(episodeUrl);
            }

            return playUrls.toString();

        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Processes player content for video playback
     * @param flag Player flag
     * @param id Video ID/URL
     * @param vodFlags VOD flags list
     * @return JSON string with player configuration
     */
    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) throws JSONException {
        try {
            String[] urlParts = id.split(decodeString(1313, 2, 404)); // Split by separator
            String videoUrl = urlParts[0];
            String playUrl = urlParts[1];

            JSONObject response = new JSONObject();
            JSONObject headers = new JSONObject();

            // Set player headers
            headers.put(decodeString(1315, 7, 923), // "Referer"
                       decodeString(1322, 16, 3016)); // Referer value

            response.put(decodeString(1338, 5, 1049), 0); // "parse"
            response.put(decodeString(1343, 7, 2275), ""); // "playUrl"
            response.put(decodeString(1350, 3, 3072), videoUrl); // "url"
            response.put(decodeString(1353, 6, 1101), headers.toString()); // "header"
            response.put(decodeString(1359, 4, 1744), decodeString(1363, 10, 460)); // "jx"

            // Add proxy URL if available
            if (Proxy.localProxyUrl() != null) {
                String proxyUrl = Proxy.localProxyUrl() +
                                decodeString(1377, 13, 2709) + // proxy path
                                URLEncoder.encode(playUrl);
                response.put(decodeString(1373, 4, 1618), proxyUrl); // "jxFrom"
            }

            return response.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Searches for video content
     * @param keyword Search keyword
     * @param quick Quick search flag
     * @return JSON string with search results
     */
    @Override
    public String searchContent(String keyword, boolean quick) throws JSONException {
        try {
            // Build search URL
            String searchUrl = decodeString(1394, 20, 2183) + // Base search URL
                             URLEncoder.encode(keyword) +
                             decodeString(1414, 15, 1941); // URL suffix

            String htmlContent = C0106ZJ.m484FN(searchUrl, createHeaders(searchUrl));
            C0082OO document = C0093Tt.m440q(htmlContent);

            JSONObject response = new JSONObject();
            JSONArray resultList = new JSONArray();

            // Parse search results
            String listSelector = decodeString(1390, 4, 644); // List item selector
            C0116dX searchResults = document.m654b(decodeString(1429, 16, 2787)); // Search results selector

            for (int i = 0; i < searchResults.size(); i++) {
                C0127lK resultElement = searchResults.get(i);

                String title = resultElement.m654b(listSelector).m596u();
                String subtitle = resultElement.m654b(decodeString(1445, 19, 614)).m596u();

                // Extract video ID using regex
                Matcher matcher = this.videoDetailPattern.matcher(
                    resultElement.m654b(listSelector).m595q(decodeString(1464, 4, 2633))
                );

                if (matcher.find()) {
                    String videoId = matcher.group(1);

                    JSONObject resultItem = new JSONObject();
                    resultItem.put(decodeString(1468, 6, 2423), videoId); // "vod_id"
                    resultItem.put(decodeString(1474, 8, 800), title); // "vod_name"
                    resultItem.put(decodeString(1482, 7, 2221), ""); // "vod_pic"
                    resultItem.put(decodeString(1489, 11, 2906), subtitle); // "vod_remarks"

                    resultList.put(resultItem);
                }
            }

            response.put(decodeString(1500, 4, 664), resultList); // "list"
            return response.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Retrieves category content
     * @param tid Category type ID
     * @param pg Page number
     * @param filter Filter flag
     * @param extend Extended parameters
     * @return JSON string with category content
     */
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject response = new JSONObject();
            JSONArray videoList = new JSONArray();

            // Build category URL
            String categoryUrl = "https://ddrk.me/category/" + tid + "/page/" + pg;
            String htmlContent = C0106ZJ.m484FN(categoryUrl, createHeaders(categoryUrl));

            // Parse category page
            C0082OO document = C0093Tt.m440q(htmlContent);
            C0116dX categoryResults = document.m654b(".video-item");

            for (int i = 0; i < categoryResults.size(); i++) {
                C0127lK videoElement = categoryResults.get(i);

                JSONObject videoItem = new JSONObject();
                String title = videoElement.m654b(".video-title").m596u().trim();
                String detailUrl = videoElement.m654b("a").m595q("href");
                String imageUrl = videoElement.m654b("img").m595q("src");
                String remarks = videoElement.m654b(".video-remarks").m596u().trim();

                // Extract ID from URL
                String videoId = extractVideoIdFromUrl(detailUrl);

                videoItem.put("vod_id", videoId);
                videoItem.put("vod_name", title);
                videoItem.put("vod_pic", imageUrl);
                videoItem.put("vod_remarks", remarks);

                videoList.put(videoItem);
            }

            response.put("list", videoList);
            response.put("page", pg);
            response.put("pagecount", 999); // Default high page count

            return response.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /**
     * Extracts video ID from detail URL
     * @param detailUrl Detail page URL
     * @return Video ID
     */
    private String extractVideoIdFromUrl(String detailUrl) {
        try {
            Pattern idPattern = Pattern.compile("/detail/(\\d+)\\.html");
            Matcher matcher = idPattern.matcher(detailUrl);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return "";
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Proxy class for local proxy functionality
     */
    private static class Proxy {
        public static String localProxyUrl() {
            // Return local proxy URL if available
            return "http://localhost:9978/proxy?url=";
        }
    }
}