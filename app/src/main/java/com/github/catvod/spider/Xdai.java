package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.AbstractC0099V3;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0173;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Xdai Spider - A readable version for video content crawling
 * This spider handles content from Xdai video platform
 */
public class Xdai extends Spider {

    // Encryption keys array for string decoding
    private static final short[] ENCRYPTION_KEYS = {449, 453, 454, 474, 474, 478, 385, 413, 384, 415, 410, 384, 407, 1679, 1711, 488, 434, 446, 434, 1234, 1174, 1167, 1171, 1170, 3140, 1854, 1888, 1912, 1888, 967, 905, 920, 897, 966, 920, 896, 920, 503, 502, 502, 667, 650, 650, 727, 667, 650, 659, 727, 652, 671, 648, 659, 668, 643, 727, 649, 659, 669, 660, 886, 871, 871, 826, 866, 894, 826, 890, 888, 883, 882, 881, 884, 890, 885, 873, 2659, 2661, 2675, 2660, 2619, 2679, 2673, 2675, 2680, 2658, 2331, 2314, 2314, 2391, 2319, 2313, 2335, 2312, 2391, 2334, 2335, 2316, 2323, 2329, 2335, 2391, 2323, 2334, 2550, 2535, 2535, 2490, 2550, 2535, 2558, 2490, 2529, 2546, 2533, 2558, 2545, 2542, 2490, 2531, 2558, 2554, 2546, 1681, 1664, 1664, 1757, 1670, 1685, 1666, 1667, 1689, 1695, 1694, 1757, 1683, 1695, 1684, 1685, 2456, 2441, 2447, 2445, 21791, -27489, 2296, 2224, 2226, 2211, 2230, 2215, 2215, 2230, 2215, 2238, 2297, 2238, 2233, 2227, 2226, 2223, 2296, 2211, 2222, 2215, 2226, 2193, 2238, 2235, 2211, 2226, 2213, 2177, 2232, 2227, 2203, 2238, 2212, 2211, 917, 922, 919, 901, 901, 882, 865, 886, 882, 1866, 1863, 1864, 1857, 1436, 1408, 1437, 1435, 28548, 27956, 1578, 1575, 1582, 1595, 1537, 1591, 1594, 1792, 1820, 1816, 1803, 1449, 1464, 1470, 1468, 1466, 1462, 1452, 1463, 1453, 2564, 2561, 2565, 2561, 2588, 1259, 1264, 1259, 1278, 1267, 1850, 1855, 1829, 1826, 1180, 1236, 1238, 1223, 1234, 1219, 1219, 1234, 1219, 1242, 1181, 1242, 1245, 1239, 1238, 1227, 1180, 1221, 1244, 1239, 1271, 1238, 1223, 1234, 1242, 1247, 2372, 2397, 2390, 2413, 2395, 2390, 1781, 1776, 1770, 1773, 325, 269, 271, 286, 267, 282, 282, 267, 282, 259, 324, 259, 260, 270, 271, 274, 325, 259, 260, 259, 286, 1378, 1389, 1376, 1394, 1394, 1873, 1817, 1819, 1802, 1823, 1806, 1806, 1823, 1806, 1815, 1872, 1815, 1808, 1818, 1819, 1798, 1873, 1815, 1808, 1815, 1802, 518, 515, 537, 542, 2950, 2974, 2966, 2968, 2962, 2949, 3231, 3305, 1764, 3288, 3326, 3304, 3327, 3232, 3276, 3306, 3304, 3299, 3321, 1503, 1479, 1487, 1473, 1476, 1479, 1998, 2002, 2002, 2006, 1502, 1420, 1431, 1427, 1437, 1430, 1477, 3292, 3202, 3268, 3209, 924, 923, 901, 1616, 1613, 1545, 2830, 2886, 2884, 2901, 2880, 2897, 2897, 2880, 2897, 2888, 2831, 2888, 2895, 2885, 2884, 2905, 2830, 2903, 2894, 2885, 2929, 2880, 2899, 2898, 2884, 947, 930, 945, 944, 934, 924, 930, 947, 938, 1124, 1151, 1147, 1141, 1150, 1550, 1567, 1548, 1549, 1563, 1345, 1289, 1291, 1306, 1295, 1310, 1310, 1295, 1310, 1287, 1344, 1287, 1280, 1290, 1291, 1302, 1345, 1309, 1291, 1295, 1308, 1293, 1286, 1314, 1287, 1309, 1306, 1351, 1366, 1360, 1362, 2480, 1331, 1342, 1335, 1314, 1304, 1326, 1315, 2644, 2325, 2331, 2311, 2313, 2321, 2316, 2330, 2317, 3137, 3140, 3166, 3161};

    // Configuration and API parameters
    private String searchQuery = "";
    private String apiBaseUrl = C0172.m820(ENCRYPTION_KEYS, 0, 13, 430);
    private String apiKey = "";
    private String userAgent = "";
    private String sessionToken = "";
    private String channelId = "";

    /**
     * Constructor - Initialize Xdai spider
     */
    public Xdai() {
        if (C0182.m859() <= 0) {
            System.out.println(Float.parseFloat(C0176.m789("773")));
        }
    }

    /**
     * Initialize configuration from API endpoints
     * Parses the configuration string and sets up API parameters
     */
    private void initializeApiConfiguration() {
        try {
            String[] configParts = C0152vp.m724Mo(this.channelId).split(C0180.m851(ENCRYPTION_KEYS, 13, 2, 1747));

            if (configParts.length > 0) {
                String firstPart = configParts[0];

                // Check for different API endpoint formats
                if (firstPart.endsWith(C0180.m851(ENCRYPTION_KEYS, 15, 4, 454))) {
                    this.searchQuery = firstPart;
                } else if (firstPart.endsWith(C0165.m798(ENCRYPTION_KEYS, 19, 5, 1276))) {
                    this.searchQuery = firstPart;
                } else {
                    // Default configuration
                    this.searchQuery = firstPart;
                }
            }

            // Set additional configuration if available
            if (configParts.length > 1) {
                this.apiKey = configParts[1];
            }
            if (configParts.length > 2) {
                this.userAgent = configParts[2];
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /**
     * Get category content - retrieves videos by category
     * @param categoryId Category identifier
     * @param pageNumber Page number to retrieve
     * @param isFiltered Whether to apply filters
     * @param params Additional parameters
     * @return JSON string containing category content
     * @throws JSONException if JSON processing fails
     * @throws NumberFormatException if page number is invalid
     */
    public String categoryContent(String categoryId, String pageNumber, boolean isFiltered, HashMap<String, String> params)
            throws JSONException, NumberFormatException {
        try {
            // Parse page number
            int page = Integer.parseInt(pageNumber);

            // Build API request
            String apiUrl = buildCategoryApiUrl(categoryId, page);
            String response = makeApiRequest(apiUrl);

            // Parse and format response
            return formatCategoryResponse(response, page);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to fetch category content");
        }
    }

    /**
     * Get detailed content for a specific video
     * @param videoIds List containing video ID
     * @return JSON string with video details
     * @throws JSONException if JSON processing fails
     */
    public String detailContent(List<String> videoIds) throws JSONException {
        try {
            if (videoIds == null || videoIds.isEmpty()) {
                return buildErrorResponse("No video ID provided");
            }

            String videoId = videoIds.get(0);
            String apiUrl = buildDetailApiUrl(videoId);
            String response = makeApiRequest(apiUrl);

            return formatDetailResponse(response, videoId);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to fetch video details");
        }
    }

    /**
     * Get home page content with categories and featured videos
     * @param isFiltered Whether to apply filters
     * @return JSON string with home page data
     * @throws JSONException if JSON processing fails
     */
    public String homeContent(boolean isFiltered) throws JSONException {
        try {
            String apiUrl = buildHomeApiUrl();
            String response = makeApiRequest(apiUrl);

            return formatHomeResponse(response, isFiltered);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to fetch home content");
        }
    }

    /**
     * Get home page video content
     * @return JSON string with featured videos
     * @throws JSONException if JSON processing fails
     */
    public String homeVideoContent() throws JSONException {
        try {
            String apiUrl = buildHomeVideoApiUrl();
            String response = makeApiRequest(apiUrl);

            return formatHomeVideoResponse(response);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to fetch home videos");
        }
    }

    /**
     * Initialize the spider with context and configuration
     * @param context Application context
     * @param config Configuration string
     */
    public void init(Context context, String config) {
        super.init(context, config);

        try {
            if (config != null && !config.isEmpty()) {
                this.channelId = config;
                initializeApiConfiguration();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
    }

    /**
     * Get player content for video playback
     * @param flag Player flag
     * @param videoUrl Video URL
     * @param vipFlags VIP flags
     * @return JSON string with player data
     * @throws JSONException if JSON processing fails
     */
    public String playerContent(String flag, String videoUrl, List<String> vipFlags) throws JSONException {
        try {
            String apiUrl = buildPlayerApiUrl(videoUrl, flag);
            String response = makeApiRequest(apiUrl);

            return formatPlayerResponse(response, videoUrl);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to get player content");
        }
    }

    /**
     * Search for content based on query string
     * @param query Search query
     * @param isQuickSearch Whether this is a quick search
     * @return JSON string with search results
     * @throws JSONException if JSON processing fails
     */
    public String searchContent(String query, boolean isQuickSearch) throws JSONException {
        try {
            String apiUrl = buildSearchApiUrl(query, isQuickSearch);
            String response = makeApiRequest(apiUrl);

            return formatSearchResponse(response, query);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return buildErrorResponse("Failed to search content");
        }
    }

    // Helper methods for building API URLs

    private String buildCategoryApiUrl(String categoryId, int page) {
        return apiBaseUrl + "/api/category/" + categoryId + "?page=" + page;
    }

    private String buildDetailApiUrl(String videoId) {
        return apiBaseUrl + "/api/video/" + videoId;
    }

    private String buildHomeApiUrl() {
        return apiBaseUrl + "/api/home";
    }

    private String buildHomeVideoApiUrl() {
        return apiBaseUrl + "/api/home/videos";
    }

    private String buildPlayerApiUrl(String videoUrl, String flag) {
        return apiBaseUrl + "/api/player?url=" + videoUrl + "&flag=" + flag;
    }

    private String buildSearchApiUrl(String query, boolean isQuickSearch) {
        String searchType = isQuickSearch ? "quick" : "full";
        return apiBaseUrl + "/api/search?q=" + query + "&type=" + searchType;
    }

    // Helper methods for making API requests

    private String makeApiRequest(String url) {
        try {
            HashMap<String, String> headers = buildRequestHeaders();
            return C0106ZJ.m483F(url, headers);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private HashMap<String, String> buildRequestHeaders() {
        HashMap<String, String> headers = new HashMap<>();

        if (!userAgent.isEmpty()) {
            headers.put("User-Agent", userAgent);
        }

        if (!apiKey.isEmpty()) {
            headers.put("Authorization", "Bearer " + apiKey);
        }

        if (!sessionToken.isEmpty()) {
            headers.put("X-Session-Token", sessionToken);
        }

        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json");

        return headers;
    }

    // Helper methods for formatting responses

    private String formatCategoryResponse(String response, int page) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONObject data = apiResponse.getJSONObject("data");
            JSONArray videos = data.optJSONArray("videos");
            JSONArray formattedVideos = new JSONArray();

            if (videos != null) {
                for (int i = 0; i < videos.length(); i++) {
                    JSONObject video = videos.getJSONObject(i);
                    JSONObject formattedVideo = new JSONObject();

                    formattedVideo.put("vod_id", video.optString("id"));
                    formattedVideo.put("vod_name", video.optString("title"));
                    formattedVideo.put("vod_pic", video.optString("thumbnail"));
                    formattedVideo.put("vod_remarks", video.optString("description"));

                    formattedVideos.put(formattedVideo);
                }
            }

            result.put("page", page);
            result.put("pagecount", data.optInt("totalPages", 1));
            result.put("limit", data.optInt("pageSize", 20));
            result.put("total", data.optInt("total", 0));
            result.put("list", formattedVideos);
        }

        return result.toString();
    }

    private String formatDetailResponse(String response, String videoId) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONObject data = apiResponse.getJSONObject("data");
            JSONObject videoDetail = new JSONObject();

            videoDetail.put("vod_id", videoId);
            videoDetail.put("vod_name", data.optString("title"));
            videoDetail.put("vod_pic", data.optString("thumbnail"));
            videoDetail.put("vod_content", data.optString("description"));
            videoDetail.put("vod_play_from", "Xdai");

            // Format play URLs
            String playUrls = data.optString("playUrl", "");
            if (!playUrls.isEmpty()) {
                videoDetail.put("vod_play_url", playUrls);
            }

            JSONArray videoArray = new JSONArray();
            videoArray.put(videoDetail);
            result.put("list", videoArray);
        }

        return result.toString();
    }

    private String formatHomeResponse(String response, boolean isFiltered) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONObject data = apiResponse.getJSONObject("data");

            // Format categories
            JSONArray categories = data.optJSONArray("categories");
            if (categories != null) {
                JSONArray formattedCategories = new JSONArray();
                for (int i = 0; i < categories.length(); i++) {
                    JSONObject category = categories.getJSONObject(i);
                    JSONObject formattedCategory = new JSONObject();
                    formattedCategory.put("type_id", category.optString("id"));
                    formattedCategory.put("type_name", category.optString("name"));
                    formattedCategories.put(formattedCategory);
                }
                result.put("class", formattedCategories);
            }

            // Add filters if requested
            if (isFiltered) {
                result.put("filters", new JSONObject());
            }
        }

        return result.toString();
    }

    private String formatHomeVideoResponse(String response) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONArray videos = apiResponse.getJSONArray("data");
            JSONArray formattedVideos = new JSONArray();

            for (int i = 0; i < videos.length(); i++) {
                JSONObject video = videos.getJSONObject(i);
                JSONObject formattedVideo = new JSONObject();

                formattedVideo.put("vod_id", video.optString("id"));
                formattedVideo.put("vod_name", video.optString("title"));
                formattedVideo.put("vod_pic", video.optString("thumbnail"));
                formattedVideo.put("vod_remarks", video.optString("description"));

                formattedVideos.put(formattedVideo);
            }

            result.put("list", formattedVideos);
        }

        return result.toString();
    }

    private String formatPlayerResponse(String response, String videoUrl) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONObject data = apiResponse.getJSONObject("data");
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", data.optString("playUrl", videoUrl));

            // Add headers if provided
            if (data.has("headers")) {
                result.put("header", data.getJSONObject("headers").toString());
            }
        } else {
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", videoUrl);
        }

        return result.toString();
    }

    private String formatSearchResponse(String response, String query) throws JSONException {
        if (TextUtils.isEmpty(response)) {
            return buildErrorResponse("Empty response from server");
        }

        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONArray videos = apiResponse.getJSONArray("data");
            JSONArray formattedVideos = new JSONArray();

            for (int i = 0; i < videos.length(); i++) {
                JSONObject video = videos.getJSONObject(i);
                JSONObject formattedVideo = new JSONObject();

                formattedVideo.put("vod_id", video.optString("id"));
                formattedVideo.put("vod_name", video.optString("title"));
                formattedVideo.put("vod_pic", video.optString("thumbnail"));
                formattedVideo.put("vod_remarks", video.optString("description"));

                formattedVideos.put(formattedVideo);
            }

            result.put("list", formattedVideos);
        }

        return result.toString();
    }

    private String buildErrorResponse(String errorMessage) {
        try {
            JSONObject error = new JSONObject();
            error.put("error", errorMessage);
            error.put("list", new JSONArray());
            return error.toString();
        } catch (JSONException e) {
            return "{\"error\":\"" + errorMessage + "\",\"list\":[]}";
        }
    }
}