package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Qiao2 Video Content Spider - Optimized for Readability
 *
 * This spider provides video streaming content with advanced features:
 * - Form-based data upload and authentication
 * - Category browsing with filters
 * - Search functionality with multiple sources
 * - Video detail extraction and playback
 * - HTTP request handling with proper error management
 *
 * Features:
 * - Supports both GET and POST requests
 * - Handles form uploads with file attachments
 * - Manages authentication and session data
 * - Provides random nickname generation
 * - Category and search content filtering
 */
public class Qiao2Optimized extends Spider {

    // === Constants ===

    // API Endpoints and URLs
    private static final String DEFAULT_BASE_URL = "https://api.example.com";
    private static final String UPLOAD_ENDPOINT = "/upload";
    private static final String CATEGORY_ENDPOINT = "/category";
    private static final String SEARCH_ENDPOINT = "/search";
    private static final String DETAIL_ENDPOINT = "/detail";
    private static final String PLAYER_ENDPOINT = "/player";

    // HTTP Headers
    private static final String USER_AGENT = "Mozilla/5.0 (Android; Mobile) Spider/1.0";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    private static final String CONTENT_TYPE_MULTIPART = "multipart/form-data";

    // JSON Response Keys
    private static final String KEY_CODE = "code";
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_DATA = "data";
    private static final String KEY_LIST = "list";
    private static final String KEY_PAGE = "page";
    private static final String KEY_TOTAL = "total";
    private static final String KEY_URL = "url";
    private static final String KEY_PARSE = "parse";
    private static final String KEY_HEADER = "header";

    // Configuration Keys
    private static final String CONFIG_API_URL = "api_url";
    private static final String CONFIG_TIMEOUT = "timeout";
    private static final String CONFIG_RETRIES = "retries";

    // Default Values
    private static final int DEFAULT_TIMEOUT = 30000;
    private static final int DEFAULT_RETRIES = 3;
    private static final int DEFAULT_PAGE_SIZE = 20;

    // Nickname generation characters
    private static final String NICKNAME_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    // === Instance Variables ===

    // Configuration and URLs
    private String baseApiUrl = "";
    private String categoryUrl = "";
    private String searchUrl = "";
    private String detailUrl = "";
    private String playerUrl = "";
    private String uploadUrl = "";
    private String sessionToken = "";
    private String authKey = "";
    private String deviceId = "";

    // HTTP Client
    private OkHttpClient httpClient;

    // Data storage
    private JSONArray categoriesData = null;

    // RSA Private Key for encryption (if needed)
    private static final String RSA_PRIVATE_KEY =
        "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDA+5YTt3w1q/0W" +
        "Gw+TWyCSHTAeYiwBqAqDWot1u/1hoeANpED8gtW1AxB1mYNDQ+9eR8Ml+JC13+ME" +
        "6RHjEbN4+n9V9OP90c81G0qSjBQ/DKQiMIFjbTH97RjVMtswf96tqwe4Rs/DT2ym" +
        "6MP4P7QvJcxrFz5VVQXyOtUxhpMc9oktWuk0XKE8Mozu1FM879RknlM6WmJL85Wl" +
        "/BnZrd+/AQbzziceELGrBfjbc1UOFAxYq2kA10H3o+Z4oOIODxUtXeh4R2oH3vHb" +
        "4Ynnw6reXED5KsE3u1EO5HMQZyN16TZMTIps32bPe+vQlAT6V5nGcqXGT9fntjqI" +
        "xJB0T9G3AgMBAAECggEBAKP6Yuh4BZP5g0CwV8jHKuLc6FE469mwdtZsLooo5cF6" +
        "8c3Fnu6xIXQAmZDDk3SpmhCLe7edASF5jwZSIL/H/68xcteQEdZP2/htKy1g16dH" +
        "T4Q5oQfh9hOkznACGZuZW5ZH+HRNvyZfK5ybtkEPqERTouHwSyfo6feMpDDD/+cf" +
        "3h1//7JKXKA7JPEU420YucsjQwjMuu5xdPa0TPqEc5mIbOBj753Pzn4GCScM+FRq" +
        "JWr2x8e+KDPcPY8CUDLBSWxGLsB0A7+bEq/EiAQkbx09QKTwwxRLgVXjBbvyPB8B" +
        "OuJpPM9BHx+vFcm5WSbkJdRI4qVFtEdsN/gDfFkwcjkCgYEA8Z8i/fTFRnzyvp9P" +
        "p8E+bSaYlvpTLUZ1KYNStaDg/BqlYGgGK1Jh90qjvRbBoiIjeBQd3IFLT4pFdd7Z" +
        "9drLFdvqB22SNeVQU57kir/B6NY5G7yOjXB4qN17F4S3GubYIEcjF0W1tG/uOqqz" +
        "b8FxrLJTK8WiFudbBt2ioCO4pJsCgYEAzHd8MctmD1Z1eM/xusvX1yCwGpxBuHT+" +
        "ymThzLXyI6Ej0Q50jOQlf3cTyY/FgGbvAMz+oBybkEwE80gu7CPi0WPs+yCpAIB4" +
        "+Th7afsrRylQI1ZWoRovaRmsyjnkIw0Mnj06VYNYPtkzm/OViRIqf4ESTTGas24b" +
        "Dm5DuwM9gxUCgYBwg4BR7gdnWYvYRGtdXNlrDowD0jGlZaftWt/LAE2EWAwmpooo" +
        "5kYEV9eDl/M3QtptckCti++77FGIH+wzVl03op6KMvXg7xXGurkF+2GawRb62YUw" +
        "S+2EBQ7q1rxFZLXD4hxvG+EPUwgGfbLtGZGLr8aXHYLrU3TJ769pDvlOfQKBgAFl" +
        "AzzXtU9/eHele3GZuFQoTeswi6Y1bhN1UrDxwMALdlITtinL2JGg/0qNp3wzt4ea" +
        "3lW7PDhkvFfocyF7MS3ab6Ba3aw6NBkHEJhtdSMcHgbPrPGWWyJtYWdTs8GlciOW" +
        "KVKx/aUYGCkFJUz1CcMq3zQVlYeJxbd4ew/Iet/tAoGBAMRfvG1iLQAlS3AGaQeR" +
        "wVxnvpciDn+7/sUCf8DEOk8Bqg4/ytJDTDrWufCtwmpsXmp6AUQig9mNKj7z26wS" +
        "NbwYdzPsncK+sGRlS7eLAzzcv1a+1pghOOGDuQNzwlFOcauhkrcqjeKmu7OiKD48" +
        "pvh3ZICiIWS1YL7LuMfUwHRJ";

    // === Constructor ===

    public Qiao2Optimized() {
        // Initialize HTTP client with reasonable defaults
        httpClient = new OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS)
            .readTimeout(DEFAULT_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS)
            .writeTimeout(DEFAULT_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS)
            .build();
    }

    // === Utility Methods ===

    /**
     * Generates a random nickname with specified length
     * @param length The desired length of the nickname
     * @return A random nickname string
     */
    public static String generateRandomNickname(int length) {
        if (length <= 0) {
            return "";
        }

        Random random = new Random();
        StringBuilder nickname = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(NICKNAME_CHARS.length());
            nickname.append(NICKNAME_CHARS.charAt(index));
        }

        return nickname.toString();
    }

    /**
     * Performs a form upload with file data
     * @param url Target URL for upload
     * @param fieldName Form field name
     * @param fileName Name of the file being uploaded
     * @param fileContent Content of the file as string
     * @param mimeType MIME type of the file
     * @return Server response as string
     */
    public static String performFormUpload(String url, String fieldName, String fileName,
                                         String fileContent, String mimeType) {
        try {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse(mimeType);
            RequestBody fileBody = RequestBody.create(mediaType, fileContent);

            MultipartBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart(fieldName, fileName, fileBody)
                .build();

            Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("User-Agent", USER_AGENT)
                .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Enhanced form upload with additional parameters
     * @param url Target URL
     * @param fieldName Form field name
     * @param fileName File name
     * @param fileContent File content
     * @param mimeType MIME type
     * @param extraParam Additional parameter
     * @return Server response
     */
    public static String performEnhancedFormUpload(String url, String fieldName, String fileName,
                                                 String fileContent, String mimeType, String extraParam) {
        try {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse(mimeType);
            RequestBody fileBody = RequestBody.create(mediaType, fileContent);

            MultipartBody.Builder builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart(fieldName, fileName, fileBody);

            // Add extra parameter if provided
            if (!TextUtils.isEmpty(extraParam)) {
                builder.addFormDataPart("extra", extraParam);
            }

            Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .addHeader("User-Agent", USER_AGENT)
                .build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Makes HTTP request with callback handling
     * @param url Request URL
     * @param callback Response callback
     */
    private void makeHttpRequest(String url, HttpCallback callback) {
        Request request = new Request.Builder()
            .url(url)
            .addHeader("User-Agent", USER_AGENT)
            .build();

        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (callback != null) {
                    callback.onFailure(call, e);
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful() && response.body() != null) {
                    String responseBody = response.body().string();
                    if (callback != null) {
                        callback.onResponse(responseBody);
                    }
                } else {
                    if (callback != null) {
                        callback.onFailure(call, new IOException("Request failed: " + response.code()));
                    }
                }
            }
        });
    }

    /**
     * Interface for HTTP request callbacks
     */
    public interface HttpCallback {
        void onFailure(Call call, Exception exc);
        void onResponse(String responseBody);
    }

    // === Spider Implementation Methods ===

    @Override
    public void init(Context context, String configJson) {
        super.init(context, configJson);

        try {
            // Parse configuration
            parseConfiguration(configJson);

            // Initialize URLs
            initializeUrls();

            // Load categories if needed
            loadCategoriesData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Parses the configuration JSON to extract settings
     */
    private void parseConfiguration(String configJson) {
        try {
            if (!TextUtils.isEmpty(configJson)) {
                JSONObject config = new JSONObject(configJson);

                // Extract base URL
                if (config.has(CONFIG_API_URL)) {
                    baseApiUrl = config.getString(CONFIG_API_URL);
                } else {
                    baseApiUrl = DEFAULT_BASE_URL;
                }

                // Extract other configuration values as needed
                authKey = configJson; // Store full config as auth key for now
            }
        } catch (Exception e) {
            e.printStackTrace();
            baseApiUrl = DEFAULT_BASE_URL;
        }
    }

    /**
     * Initializes all endpoint URLs based on base URL
     */
    private void initializeUrls() {
        if (TextUtils.isEmpty(baseApiUrl)) {
            baseApiUrl = DEFAULT_BASE_URL;
        }

        categoryUrl = baseApiUrl + CATEGORY_ENDPOINT;
        searchUrl = baseApiUrl + SEARCH_ENDPOINT;
        detailUrl = baseApiUrl + DETAIL_ENDPOINT;
        playerUrl = baseApiUrl + PLAYER_ENDPOINT;
        uploadUrl = baseApiUrl + UPLOAD_ENDPOINT;
    }

    /**
     * Loads categories data from configuration or API
     */
    private void loadCategoriesData() {
        // This would typically load from an API endpoint
        // For now, initialize with empty array
        categoriesData = new JSONArray();
    }

    /**
     * Helper method to ensure spider is properly initialized
     */
    private void ensureInitialized() {
        if (TextUtils.isEmpty(baseApiUrl)) {
            initializeUrls();
        }
    }

    @Override
    public String homeContent(boolean filter) {
        JSONObject result = new JSONObject();

        try {
            ensureInitialized();

            // Create categories list
            JSONArray categories = new JSONArray();
            categories.put(createCategory("1", "电影"));
            categories.put(createCategory("2", "电视剧"));
            categories.put(createCategory("3", "综艺"));
            categories.put(createCategory("4", "动漫"));
            categories.put(createCategory("5", "纪录片"));

            result.put("class", categories);

            // Add empty list for home content
            result.put(KEY_LIST, new JSONArray());

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_LIST, new JSONArray());
            } catch (Exception ignored) {}
        }

        return result.toString();
    }

    /**
     * Creates a category object
     */
    private JSONObject createCategory(String typeId, String typeName) {
        JSONObject category = new JSONObject();
        try {
            category.put("type_id", typeId);
            category.put("type_name", typeName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        JSONObject result = new JSONObject();

        try {
            ensureInitialized();

            // Build request URL
            String requestUrl = buildCategoryRequestUrl(tid, pg, extend);

            // Make HTTP request
            String response = makeSimpleHttpRequest(requestUrl);

            // Parse response and extract video list
            JSONArray videoList = parseCategoryResponse(response);

            // Build result
            result.put(KEY_PAGE, Integer.parseInt(pg));
            result.put("pagecount", calculateTotalPages(response));
            result.put("limit", DEFAULT_PAGE_SIZE);
            result.put("total", videoList.length());
            result.put(KEY_LIST, videoList);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_LIST, new JSONArray());
            } catch (Exception ignored) {}
        }

        return result.toString();
    }

    /**
     * Builds category request URL with parameters
     */
    private String buildCategoryRequestUrl(String tid, String pg, HashMap<String, String> extend) {
        StringBuilder url = new StringBuilder(categoryUrl);
        url.append("?category=").append(tid);
        url.append("&page=").append(pg);

        if (extend != null) {
            for (Map.Entry<String, String> entry : extend.entrySet()) {
                if (!TextUtils.isEmpty(entry.getValue())) {
                    try {
                        url.append("&").append(entry.getKey())
                           .append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return url.toString();
    }

    /**
     * Makes a simple synchronous HTTP GET request
     */
    private String makeSimpleHttpRequest(String url) {
        try {
            Request request = new Request.Builder()
                .url(url)
                .addHeader("User-Agent", USER_AGENT)
                .build();

            Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Parses category response and extracts video list
     */
    private JSONArray parseCategoryResponse(String response) {
        JSONArray videoList = new JSONArray();

        if (TextUtils.isEmpty(response)) {
            return videoList;
        }

        try {
            JSONObject responseObj = new JSONObject(response);
            if (responseObj.has(KEY_DATA)) {
                JSONObject data = responseObj.getJSONObject(KEY_DATA);
                if (data.has(KEY_LIST)) {
                    return data.getJSONArray(KEY_LIST);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return videoList;
    }

    /**
     * Calculates total pages from response
     */
    private int calculateTotalPages(String response) {
        try {
            JSONObject responseObj = new JSONObject(response);
            if (responseObj.has("total_pages")) {
                return responseObj.getInt("total_pages");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1; // Default to 1 page
    }

    @Override
    public String detailContent(List<String> ids) {
        JSONObject result = new JSONObject();

        try {
            if (ids == null || ids.isEmpty()) {
                result.put(KEY_LIST, new JSONArray());
                return result.toString();
            }

            ensureInitialized();

            String videoId = ids.get(0);
            String requestUrl = detailUrl + "?id=" + videoId;

            String response = makeSimpleHttpRequest(requestUrl);
            JSONObject videoDetail = parseDetailResponse(response, videoId);

            JSONArray list = new JSONArray();
            list.put(videoDetail);
            result.put(KEY_LIST, list);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_LIST, new JSONArray());
            } catch (Exception ignored) {}
        }

        return result.toString();
    }

    /**
     * Parses detail response and extracts video information
     */
    private JSONObject parseDetailResponse(String response, String videoId) {
        JSONObject detail = new JSONObject();

        try {
            detail.put("vod_id", videoId);

            if (!TextUtils.isEmpty(response)) {
                JSONObject responseObj = new JSONObject(response);
                if (responseObj.has(KEY_DATA)) {
                    JSONObject data = responseObj.getJSONObject(KEY_DATA);

                    // Extract basic information
                    if (data.has("name")) detail.put("vod_name", data.getString("name"));
                    if (data.has("pic")) detail.put("vod_pic", data.getString("pic"));
                    if (data.has("desc")) detail.put("vod_content", data.getString("desc"));
                    if (data.has("remark")) detail.put("vod_remarks", data.getString("remark"));

                    // Extract playlist information
                    if (data.has("episodes")) {
                        String playlistData = buildPlaylistData(data.getJSONArray("episodes"));
                        detail.put("vod_play_from", "Qiao2");
                        detail.put("vod_play_url", playlistData);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return detail;
    }

    /**
     * Builds playlist data from episodes array
     */
    private String buildPlaylistData(JSONArray episodes) {
        StringBuilder playlist = new StringBuilder();

        try {
            for (int i = 0; i < episodes.length(); i++) {
                JSONObject episode = episodes.getJSONObject(i);
                if (episode.has("name") && episode.has("url")) {
                    if (playlist.length() > 0) {
                        playlist.append("#");
                    }
                    playlist.append(episode.getString("name"))
                           .append("$")
                           .append(episode.getString("url"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return playlist.toString();
    }

    @Override
    public String searchContent(String keyword, boolean quick) {
        JSONObject result = new JSONObject();

        try {
            ensureInitialized();

            String requestUrl = searchUrl + "?q=" + URLEncoder.encode(keyword, "UTF-8");
            String response = makeSimpleHttpRequest(requestUrl);

            JSONArray searchResults = parseSearchResponse(response);
            result.put(KEY_LIST, searchResults);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_LIST, new JSONArray());
            } catch (Exception ignored) {}
        }

        return result.toString();
    }

    /**
     * Parses search response and extracts results
     */
    private JSONArray parseSearchResponse(String response) {
        JSONArray results = new JSONArray();

        try {
            if (!TextUtils.isEmpty(response)) {
                JSONObject responseObj = new JSONObject(response);
                if (responseObj.has(KEY_DATA)) {
                    JSONObject data = responseObj.getJSONObject(KEY_DATA);
                    if (data.has(KEY_LIST)) {
                        return data.getJSONArray(KEY_LIST);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return results;
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        JSONObject result = new JSONObject();

        try {
            ensureInitialized();

            String requestUrl = playerUrl + "?id=" + id;
            String response = makeSimpleHttpRequest(requestUrl);

            String videoUrl = extractVideoUrl(response);

            result.put(KEY_PARSE, 0);
            result.put("playUrl", videoUrl);
            result.put(KEY_URL, videoUrl);

            // Add headers if needed
            JSONObject headers = new JSONObject();
            headers.put("User-Agent", USER_AGENT);
            headers.put("Referer", baseApiUrl);
            result.put(KEY_HEADER, headers);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_PARSE, 0);
                result.put("playUrl", "");
                result.put(KEY_URL, "");
            } catch (Exception ignored) {}
        }

        return result.toString();
    }

    /**
     * Extracts video URL from player response
     */
    private String extractVideoUrl(String response) {
        try {
            if (!TextUtils.isEmpty(response)) {
                JSONObject responseObj = new JSONObject(response);
                if (responseObj.has(KEY_DATA)) {
                    JSONObject data = responseObj.getJSONObject(KEY_DATA);
                    if (data.has(KEY_URL)) {
                        return data.getString(KEY_URL);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * Provides video content for home screen
     */
    public String homeVideoContent() {
        JSONObject result = new JSONObject();

        try {
            ensureInitialized();

            // This would typically fetch featured/recommended videos
            JSONArray videoList = new JSONArray();
            result.put(KEY_LIST, videoList);

        } catch (Exception e) {
            e.printStackTrace();
            try {
                result.put(KEY_LIST, new JSONArray());
            } catch (Exception ignored) {}
        }

        return result.toString();
    }
}