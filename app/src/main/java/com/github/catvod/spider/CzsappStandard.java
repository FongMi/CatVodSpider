package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
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
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0127lK;
import com.github.catvod.spider.merge.C0147tG;
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
import com.github.catvod.spider.merge.C0177;
import com.github.catvod.spider.merge.C0178;
import com.github.catvod.spider.merge.C0180;
import com.github.catvod.spider.merge.C0181;
import com.github.catvod.spider.merge.C0182;
import com.github.catvod.spider.merge.C0183;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Czsapp Video Spider - Standard Implementation
 *
 * This spider handles video content with advanced features:
 * - AES encryption/decryption for secure communication
 * - MD5 hashing for data integrity
 * - Complex HTML parsing with regex patterns
 * - Category filtering and search functionality
 * - Player content processing with encryption support
 */
public class CzsappStandard extends Spider {

    // Encoded string array for decoding operations
    private static final short[] DECODE_ARRAY = {
        1513, 1507, 1424, 1429, 1513, 1430, 1504, 1506, 1513, 1520, 1469, 1450, 1465, 1515, 1424, 1431, 1455, 1431, 1468, 1430,
        1504, 1526, 1453, 1470, 1445, 1448, 1471, 1442, 1444, 1445, 1515, 1455, 1445, 1448, 1465, 1458, 1509, 1505, 1446, 1455,
        1534, 1509, 1454, 1445, 1448, 1509, 1438, 1471, 1453, 1523, 1509, 1467, 1450, 1465, 1464, 1454, 1431, 1507, 1513, 1507,
        1424, 1431, 1455, 1431, 1468, 1430, 1504, 1506, 1513, 1509, 1505, 1446, 1455, 1534, 1509, 1454, 1445, 1448, 1509, 1438,
        1471, 1453, 1523, 1509, 1467, 1450, 1465, 1464, 1454, 1431, 1507, 1507, 1424, 1431, 1455, 1430, 1504, 1506, 1431, 1506,
        412, 387, 398, 399, 389, 464, 458, 438, 401, 415, 408, 390, 464, 458, 456, 450, 433, 436, 456, 439, 449, 451, 456, 677,
        675, 692, 674, 703, 674, 698, 691, 748, 758, 650, 685, 675, 676, 698, 748, 756, 766, 653, 648, 756, 651, 765, 650, 760,
        672, 674, 674, 767, 756, 3098, 3094, 3095, 3082, 3085, 3109, 3082, 3154, 3092, 3072, 3082, 3087, 3102, 3109, 3082, 3155,
        3140, 3109, 3082, 3155, 3166, 3153, 3106, 3111, 3166, 3108, 3154, 3152, 3166, 1970, 2032, 2034, 2027, 2036, 2040, 1970,
        1973, 1985, 2041, 1974, 1972, 1971, 2037, 2025, 2032, 2033, 1722, 1765, 1780, 1778, 1776, 1722, 1725, 1737, 1777, 1726,
        1724, 2179, 2266, 2291, 2268, 2240, 2253, 2261, 2179, 2180, 2178, 2182, 2181, 2288, 2178, 2244, 2264, 2241, 2240, 2962,
        2949, 2966, 3012, 2962, 2959, 2945, 2973, 3012, 3033, 3012, 3007, 3011, 3014, 3001, 3020, 3007, 3002, 3011, 3014, 3001,
        3023, 3021, 3007, 3011, 3014, 3001, 1644, 1659, 1640, 1594, 1660, 1644, 1649, 1663, 1635, 1594, 1575, 1594, 1601, 1597,
        1592, 1607, 1586, 1601, 1604, 1597, 1592, 1607, 1585, 1587, 1601, 1597, 1592, 1607, 2269, 2250, 2265, 2187, 2270, 2250,
        2187, 2198, 2187, 2288, 2188, 2185, 2294, 2179, 2288, 2293, 2188, 2185, 2294, 2176, 2178, 2288, 2188, 2185, 2294, 1978,
        1965, 1982, 2028, 1967, 1957, 1980, 2028, 2033, 2028, 1943, 2027, 2030, 1937, 2020, 1943, 1938, 2027, 2030, 1937, 2023,
        2021, 1943, 2027, 2030, 1937, 2735, 2744, 2731, 2809, 2733, 2736, 2740, 2748, 2809, 2788, 2809, 2690, 2814, 2811, 2692,
        2801, 2690, 2695, 2814, 2811, 2692, 2802, 2800, 2690, 2814, 2811, 2692, 1100, 1115, 1096, 1050, 1103, 1096, 1110, 1050,
        1031, 1050, 1121, 1053, 1048, 1127, 1042, 1121, 1124, 1053, 1048, 1127, 1041, 1043, 1121, 1053, 1048, 1127, 1755, 1749,
        1737, 1677, 1771, 1687, 1682, 1773, 1688, 1771, 1774, 1687, 1682, 1773, 1691, 1689, 1771, 1687, 1682, 1773, 2176, 2199,
        2202, 2179, 2195, 2251, 2221, 2257, 2260, 2219, 2270, 2221, 2216, 2257, 2260, 2219, 2269, 2271, 2221, 2257, 2260, 2219,
        // Additional array elements for extended decoding support
        1332, 1341, 1356, 445, 800, 2369, 3170, 495, 1683, 2571, 2636, 1742, 2707, 3156, 1053, 1879, 3080, 1607, 506, 476, 458,
        477, 386, 494, 456, 458, 449, 475, 1557, 1591, 1570, 1585, 1588, 1588, 1593, 1655, 1645, 1654, 1640, 1656, 1648, 1585
    };

    // Regex patterns for content parsing
    private static final Pattern VIDEO_LIST_PATTERN = Pattern.compile(decodeString(0, 100, 1483));
    private static final Pattern VIDEO_DETAIL_PATTERN = Pattern.compile(decodeString(100, 23, 490));
    private static final Pattern CATEGORY_PATTERN = Pattern.compile(decodeString(123, 30, 726));
    private static final Pattern SEARCH_PATTERN = Pattern.compile(decodeString(153, 29, 3193));
    private static final Pattern PLAYER_PATTERN = Pattern.compile(decodeString(182, 17, 1949));

    // Configuration fields
    private String baseUrl = "";

    /**
     * Constructor - initializes the spider
     */
    public CzsappStandard() {
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
        return C0175.m834(DECODE_ARRAY, offset, length, key);
    }

    /**
     * Escapes special regex characters in a string
     * @param input Input string
     * @return Escaped string
     */
    public static String escapeRegexSpecialChars(String input) {
        if (input.isEmpty()) {
            return input;
        }

        // Characters that need escaping in regex
        String[] specialChars = {
            "\\", "^", "$", ".", "|", "?", "*", "+", "(", ")", "[", "]", "{", "}"
        };

        String result = input;
        for (String specialChar : specialChars) {
            if (result.contains(specialChar)) {
                result = result.replace(specialChar, "\\" + specialChar);
            }
        }

        return result;
    }

    /**
     * Creates HTTP headers for requests
     * @return HashMap containing headers
     */
    private HashMap<String, String> createHeaders() {
        HashMap<String, String> headers = new HashMap<>();

        // Standard headers
        headers.put("User-Agent", decodeString(447, 10, 431));
        headers.put("Referer", this.baseUrl);
        headers.put("Accept", decodeString(601, 15, 2973));
        headers.put("Accept-Language", decodeString(630, 16, 1341));

        return headers;
    }

    /**
     * Generates MD5 hash of input string
     * @param input Input string
     * @return MD5 hash as hex string
     * @throws NoSuchAlgorithmException if MD5 algorithm not available
     */
    private String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(input.getBytes());
        byte[] digest = md5.digest();

        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() < 2) {
                hex = "0" + hex;
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

    /**
     * Encrypts data using AES algorithm
     * @param data Data to encrypt
     * @param key Encryption key
     * @param iv Initialization vector
     * @return Encrypted data as Base64 string
     * @throws Exception if encryption fails
     */
    public String encryptAES(String data, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());

        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
        byte[] encrypted = cipher.doFinal(data.getBytes());

        return Base64.encodeToString(encrypted, Base64.DEFAULT);
    }

    /**
     * Decrypts AES encrypted data
     * @param encryptedData Base64 encoded encrypted data
     * @param key Decryption key
     * @param iv Initialization vector
     * @return Decrypted string
     * @throws Exception if decryption fails
     */
    public String decryptAES(String encryptedData, String key, String iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());

        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
        byte[] decodedData = Base64.decode(encryptedData, Base64.DEFAULT);
        byte[] decrypted = cipher.doFinal(decodedData);

        return new String(decrypted);
    }

    /**
     * Makes HTTP request and returns response content
     * @param url Request URL
     * @return Response content
     */
    private String makeHttpRequest(String url) {
        try {
            return C0106ZJ.m484FN(url, createHeaders());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Retrieves detailed content for a specific video
     * @param ids List containing video ID
     * @return JSON string with video details
     */
    @Override
    public String detailContent(List<String> ids) throws JSONException {
        try {
            JSONObject response = new JSONObject();
            JSONArray videoList = new JSONArray();
            JSONObject videoDetail = new JSONObject();

            // Build detail URL
            String detailUrl = this.baseUrl + "/detail/" + ids.get(0) + ".html";
            String htmlContent = makeHttpRequest(detailUrl);

            // Parse HTML content
            C0082OO document = C0093Tt.m440q(htmlContent);

            // Extract video information
            String title = document.m654b(".video-title").m596u().trim();
            String imageUrl = document.m654b(".video-pic img").m595q("src");

            // Parse video details from page content
            Iterator<C0127lK> detailElements = document.m654b(".video-info-item").iterator();

            String director = "";
            String actor = "";
            String area = "";
            String language = "";
            String year = "";
            String category = "";

            while (detailElements.hasNext()) {
                String detailText = detailElements.next().m653a().trim();
                if (detailText.length() >= 4) {
                    String label = detailText.substring(0, 2);
                    String value = detailText.substring(3);

                    switch (label) {
                        case "导演":
                            director = value;
                            break;
                        case "主演":
                            actor = value;
                            break;
                        case "地区":
                            area = value;
                            break;
                        case "语言":
                            language = value;
                            break;
                        case "年份":
                            year = value;
                            break;
                        case "类型":
                            category = value;
                            break;
                    }
                }
            }

            // Build video detail object
            videoDetail.put("vod_id", ids.get(0));
            videoDetail.put("vod_name", title);
            videoDetail.put("vod_pic", imageUrl);
            videoDetail.put("vod_director", director);
            videoDetail.put("vod_actor", actor);
            videoDetail.put("vod_area", area);
            videoDetail.put("vod_lang", language);
            videoDetail.put("vod_year", year);
            videoDetail.put("type_name", category);

            // Extract play URLs
            String playInfo = extractPlayInfo(document);
            videoDetail.put("vod_play_from", "Czsapp");
            videoDetail.put("vod_play_url", playInfo);

            videoList.put(videoDetail);
            response.put("list", videoList);

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
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
                String episodeName = element.m653a().trim();
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
     * Initializes spider with context and configuration
     * @param context Android context
     * @param configStr Configuration string
     */
    @Override
    public void init(Context context, String configStr) {
        super.init(context, configStr);
        this.baseUrl = C0152vp.m724Mo(configStr);

        // Debug output for configuration
        if (C0183.m864() <= 0) {
            System.out.println(Integer.valueOf(C0182.m862("efQtDAA8xueJfnyO86")));
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
    public String playerContent(String flag, String id, List<String> vodFlags)
            throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException,
                   InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            JSONObject response = new JSONObject();

            // Check if direct play URL
            if (id.startsWith("http")) {
                response.put("parse", 0);
                response.put("playUrl", 0);
                response.put("url", id);

                // Add encryption headers if needed
                if (id.contains("encrypt")) {
                    JSONObject headers = new JSONObject();
                    headers.put("User-Agent", createHeaders().get("User-Agent"));
                    response.put("header", headers.toString());
                }
            } else {
                // Process encrypted content
                String playUrl = this.baseUrl + "/play/" + id;
                String htmlContent = makeHttpRequest(playUrl);

                // Extract real play URL from page
                String realUrl = extractRealPlayUrl(htmlContent);

                response.put("parse", 0);
                response.put("playUrl", 0);
                response.put("url", realUrl);

                // Add decryption headers
                JSONObject headers = new JSONObject();
                headers.put("Referer", this.baseUrl);
                response.put("header", headers.toString());
            }

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Extracts real play URL from HTML content
     * @param htmlContent HTML content
     * @return Real play URL
     */
    private String extractRealPlayUrl(String htmlContent) {
        try {
            // Parse HTML to find play URL
            C0082OO document = C0093Tt.m440q(htmlContent);

            // Look for video source in script tags
            C0116dX scriptElements = document.m654b("script");
            for (int i = 0; i < scriptElements.size(); i++) {
                String scriptContent = scriptElements.get(i).m653a();

                // Extract URL from JavaScript
                Matcher matcher = PLAYER_PATTERN.matcher(scriptContent);
                if (matcher.find()) {
                    return matcher.group(1);
                }
            }

            // Fallback: look for direct video tags
            String videoSrc = document.m654b("video source").m595q("src");
            if (!TextUtils.isEmpty(videoSrc)) {
                return videoSrc;
            }

            return "";

        } catch (Exception e) {
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
            JSONObject response = new JSONObject();
            JSONArray resultList = new JSONArray();

            // Build search URL
            String searchUrl = this.baseUrl + "/search.php?searchword=" +
                             URLEncoder.encode(keyword, "UTF-8");

            String htmlContent = makeHttpRequest(searchUrl);
            C0082OO document = C0093Tt.m440q(htmlContent);

            // Parse search results
            C0116dX searchResults = document.m654b(".search-item");
            for (int i = 0; i < searchResults.size(); i++) {
                C0127lK resultElement = searchResults.get(i);

                JSONObject resultItem = new JSONObject();

                // Extract basic info
                String title = resultElement.m654b(".item-title").m653a().trim();
                String detailUrl = resultElement.m654b(".item-title a").m595q("href");
                String imageUrl = resultElement.m654b(".item-pic img").m595q("src");
                String category = resultElement.m654b(".item-category").m653a().trim();

                // Extract ID from URL
                String videoId = extractVideoIdFromUrl(detailUrl);

                resultItem.put("vod_id", videoId);
                resultItem.put("vod_name", title);
                resultItem.put("vod_pic", imageUrl);
                resultItem.put("type_name", category);

                resultList.put(resultItem);
            }

            response.put("list", resultList);
            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
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
            // Extract ID from URL pattern like "/detail/12345.html"
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
     * Processes category content (if needed for this spider)
     * @param tid Category type ID
     * @param pg Page number
     * @param filter Additional filters
     * @param extend Extended parameters
     * @return JSON string with category content
     */
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject response = new JSONObject();
            JSONArray videoList = new JSONArray();

            // Build category URL
            String categoryUrl = this.baseUrl + "/category/" + tid + "/page/" + pg;
            String htmlContent = makeHttpRequest(categoryUrl);

            // Parse category page similar to search results
            C0082OO document = C0093Tt.m440q(htmlContent);
            C0116dX categoryResults = document.m654b(".video-item");

            for (int i = 0; i < categoryResults.size(); i++) {
                C0127lK videoElement = categoryResults.get(i);

                JSONObject videoItem = new JSONObject();
                String title = videoElement.m654b(".video-title").m653a().trim();
                String detailUrl = videoElement.m654b("a").m595q("href");
                String imageUrl = videoElement.m654b("img").m595q("src");

                String videoId = extractVideoIdFromUrl(detailUrl);

                videoItem.put("vod_id", videoId);
                videoItem.put("vod_name", title);
                videoItem.put("vod_pic", imageUrl);

                videoList.put(videoItem);
            }

            response.put("list", videoList);
            response.put("page", pg);
            response.put("pagecount", 999); // Default high page count

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}