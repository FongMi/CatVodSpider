package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0176;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * TTian Spider - A readable version for video content crawling
 * This spider handles content from TTian video platform with API-based access
 */
public class TTian extends Spider {

    // Encryption keys array for string decoding
    private static final short[] ENCRYPTION_KEYS = {2172, 2092, 2107, 2171, 2089, 2085, 2095, 2169, 2104, 2105, 2163, 2174, 2098, 2095, 2082, 2082, 2169, 2081, 2168, 2169, 2107, 2088, 2098, 2107, 2104, 2088, 2084, 2088, 2175, 2108, 2173, 2088, 2172, 2092, 2174, 2104, 2107, 2087, 1529, 1503, 1481, 1502, 1409, 1517, 1483, 1481, 1474, 1496, 1067, 1071, 1068, 1072, 1072, 1076, 1131, 1136, 1130, 1149, 1130, 1143, 903, 944, 947, 944, 935, 944, 935, 3080, 2208, 2233, 2226, 2185, 2212, 2227, 2235, 2231, 2212, 2237, 2213, 2722, 2747, 2736, 2699, 2746, 2741, 2745, 2737, 2012, 1989, 1998, 2037, 1987, 1998, 2593, 2596, 2622, 2617, 480, 505, 498, 457, 486, 511, 501, 1057, 1144, 1085, 1057, 1126, 1121, 1123, 1131, 1057, 1146, 1143, 1150, 1131, 1105, 1149, 1131, 1135, 1148, 1133, 1126, 2206, 2203, 2190, 2203, 2219, 2226, 2233, 2178, 2221, 2228, 2238, 2178, 2217, 2229, 2216, 2224, 2239, 2469, 2484, 2482, 2480, 1748, 1733, 1731, 1729, 1735, 1739, 1745, 1738, 1744, 3321, 3324, 3320, 3324, 3297, 282, 257, 282, 271, 258, 1221, 1221, 1221, 1876, 1869, 1862, 1917, 1857, 1869, 1868, 1878, 1863, 1868, 1878, 969, 976, 987, 992, 987, 982, 973, 986, 988, 971, 976, 973, 861, 836, 847, 884, 842, 840, 863, 836, 857, 2599, 2622, 2613, 2574, 2595, 2612, 2620, 2608, 2595, 2618, 2594, 868, 893, 886, 845, 883, 864, 887, 883, 2787, 2810, 2801, 2762, 2796, 2800, 2804, 2791, 3080, 3089, 3098, 3105, 3088, 3103, 3091, 3099, 2286, 2295, 2300, 2247, 2289, 2300, 1752, 1737, 1754, 1755, 1741, 1783, 1757, 1754, 1732, 1755, 2426, 2403, 2408, 2387, 2428, 2405, 2415, 2770, 2699, 2766, 2770, 2709, 2706, 2704, 2712, 2770, 2699, 2706, 2713, 2722, 2713, 2712, 2697, 2716, 2708, 2705, 2702, 759, 754, 743, 754, 2123, 2130, 2137, 2146, 2125, 2132, 2142, 2146, 2121, 2133, 2120, 2128, 2143, 706, 719, 710, 723, 745, 728, 727, 731, 723, 3320, 3297, 3306, 3281, 3309, 3298, 3311, 3325, 3325};

    // Configuration URLs and credentials
    private String apiBaseUrl;
    private String userToken = "";
    private String clientVersion;

    /**
     * Constructor - Initialize TTian spider with configuration
     */
    public TTian() {
        String decodedUrl = C0165.m798(ENCRYPTION_KEYS, 0, 38, 2123);
        this.clientVersion = decodedUrl;
        this.apiBaseUrl = decodedUrl;

        if (C0171.m818() >= 0) {
            System.out.println(Integer.decode(C0174.m831("83ApVsexO2MBI1TVK")));
        }
    }

    /**
     * Generate random nickname for user authentication
     * @param length Length of the random string to generate
     * @return Random numeric string
     */
    public static String generateRandomNickname(int length) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(random.nextInt(10));
        }

        return result.toString();
    }

    /**
     * Build HTTP request headers for API calls
     * @param url Target URL for the request
     * @return HashMap containing request headers
     */
    private HashMap<String, String> buildRequestHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();

        // Add standard headers
        String userAgentHeader = C0174.m828(ENCRYPTION_KEYS, 38, 10, 1452);
        String userAgentValue = C0180.m851(ENCRYPTION_KEYS, 60, 7, 981);
        headers.put(userAgentHeader, userAgentValue);

        String contentTypeHeader = C0172.m820(ENCRYPTION_KEYS, 67, 1, 3112);
        headers.put(userAgentHeader, contentTypeHeader);

        // Add authentication headers if token is available
        if (!userToken.isEmpty()) {
            String authHeader = C0172.m820(ENCRYPTION_KEYS, 48, 12, 1089);
            headers.put(authHeader, "Bearer " + userToken);
        }

        return headers;
    }

    /**
     * Get category content - retrieves videos by category
     * @param categoryId Category identifier
     * @param pageNumber Page number to retrieve
     * @param isFiltered Whether to apply filters
     * @param params Additional parameters
     * @return JSON string containing category content
     */
    public String categoryContent(String categoryId, String pageNumber, boolean isFiltered, HashMap<String, String> params) {
        try {
            // Build API request URL
            String apiUrl = buildCategoryApiUrl(categoryId, pageNumber);
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatCategoryResponse(response);
        } catch (Exception e) {
            return buildErrorResponse("Failed to fetch category content: " + e.getMessage());
        }
    }

    /**
     * Get detailed content for a specific video
     * @param videoIds List containing video ID
     * @return JSON string with video details
     */
    public String detailContent(List<String> videoIds) {
        try {
            if (videoIds == null || videoIds.isEmpty()) {
                return buildErrorResponse("No video ID provided");
            }

            String videoId = videoIds.get(0);
            String apiUrl = buildDetailApiUrl(videoId);
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatDetailResponse(response, videoId);
        } catch (Exception e) {
            return buildErrorResponse("Failed to fetch video details: " + e.getMessage());
        }
    }

    /**
     * Get home page content with categories and featured videos
     * @param isFiltered Whether to apply filters
     * @return JSON string with home page data
     */
    public String homeContent(boolean isFiltered) {
        try {
            String apiUrl = buildHomeApiUrl();
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatHomeResponse(response, isFiltered);
        } catch (Exception e) {
            return buildErrorResponse("Failed to fetch home content: " + e.getMessage());
        }
    }

    /**
     * Get home page video content
     * @return JSON string with featured videos
     */
    public String homeVideoContent() {
        try {
            String apiUrl = buildHomeVideoApiUrl();
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatHomeVideoResponse(response);
        } catch (Exception e) {
            return buildErrorResponse("Failed to fetch home videos: " + e.getMessage());
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
            // Parse configuration
            if (config != null && !config.isEmpty()) {
                JSONObject configJson = new JSONObject(config);
                if (configJson.has("token")) {
                    this.userToken = configJson.getString("token");
                }
                if (configJson.has("baseUrl")) {
                    this.apiBaseUrl = configJson.getString("baseUrl");
                }
            }
        } catch (JSONException e) {
            // Use default configuration if parsing fails
        }
    }

    /**
     * Get player content for video playback
     * @param flag Player flag
     * @param videoUrl Video URL
     * @param vipFlags VIP flags
     * @return JSON string with player data
     */
    public String playerContent(String flag, String videoUrl, List<String> vipFlags) {
        try {
            String apiUrl = buildPlayerApiUrl(videoUrl);
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatPlayerResponse(response, videoUrl);
        } catch (Exception e) {
            return buildErrorResponse("Failed to get player content: " + e.getMessage());
        }
    }

    /**
     * Search for content based on query string
     * @param query Search query
     * @param isQuickSearch Whether this is a quick search
     * @return JSON string with search results
     */
    public String searchContent(String query, boolean isQuickSearch) {
        try {
            String apiUrl = buildSearchApiUrl(query, isQuickSearch);
            HashMap<String, String> headers = buildRequestHeaders(apiUrl);

            // Make HTTP request
            String response = makeHttpRequest(apiUrl, headers);

            // Parse and format response
            return formatSearchResponse(response, query);
        } catch (Exception e) {
            return buildErrorResponse("Failed to search content: " + e.getMessage());
        }
    }

    // Helper methods for building API URLs

    private String buildCategoryApiUrl(String categoryId, String pageNumber) {
        return apiBaseUrl + "/api/category/" + categoryId + "?page=" + pageNumber;
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

    private String buildPlayerApiUrl(String videoUrl) {
        return apiBaseUrl + "/api/player?url=" + videoUrl;
    }

    private String buildSearchApiUrl(String query, boolean isQuickSearch) {
        String searchType = isQuickSearch ? "quick" : "full";
        return apiBaseUrl + "/api/search?q=" + query + "&type=" + searchType;
    }

    // Helper methods for making HTTP requests

    private String makeHttpRequest(String url, HashMap<String, String> headers) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(url);

        // Add headers
        for (String key : headers.keySet()) {
            requestBuilder.addHeader(key, headers.get(key));
        }

        Request request = requestBuilder.build();
        return client.newCall(request).execute().body().string();
    }

    private String makePostRequest(String url, String jsonBody, HashMap<String, String> headers) throws IOException {
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(mediaType, jsonBody);

        Request.Builder requestBuilder = new Request.Builder()
                .url(url)
                .post(body);

        // Add headers
        for (String key : headers.keySet()) {
            requestBuilder.addHeader(key, headers.get(key));
        }

        Request request = requestBuilder.build();
        return client.newCall(request).execute().body().string();
    }

    // Helper methods for formatting responses

    private String formatCategoryResponse(String response) throws JSONException {
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

            result.put("page", data.optInt("page", 1));
            result.put("pagecount", data.optInt("totalPages", 1));
            result.put("limit", data.optInt("pageSize", 20));
            result.put("total", data.optInt("total", 0));
            result.put("list", formattedVideos);
        }

        return result.toString();
    }

    private String formatDetailResponse(String response, String videoId) throws JSONException {
        JSONObject apiResponse = new JSONObject(response);
        JSONObject result = new JSONObject();

        if (apiResponse.has("data")) {
            JSONObject data = apiResponse.getJSONObject("data");
            JSONObject videoDetail = new JSONObject();

            videoDetail.put("vod_id", videoId);
            videoDetail.put("vod_name", data.optString("title"));
            videoDetail.put("vod_pic", data.optString("thumbnail"));
            videoDetail.put("vod_content", data.optString("description"));
            videoDetail.put("vod_play_from", "TTian");
            videoDetail.put("vod_play_url", data.optString("playUrl"));

            JSONArray videoArray = new JSONArray();
            videoArray.put(videoDetail);
            result.put("list", videoArray);
        }

        return result.toString();
    }

    private String formatHomeResponse(String response, boolean isFiltered) throws JSONException {
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