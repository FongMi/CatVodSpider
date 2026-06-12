package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.parser.C0165;
import com.github.catvod.parser.C0166;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0152vp;
import com.github.catvod.spider.merge.C0168;
import com.github.catvod.spider.merge.C0169;
import com.github.catvod.spider.merge.C0170;
import com.github.catvod.spider.merge.C0171;
import com.github.catvod.spider.merge.C0172;
import com.github.catvod.spider.merge.C0174;
import com.github.catvod.spider.merge.C0175;
import com.github.catvod.spider.merge.C0177;
import com.github.catvod.spider.merge.C0178;
import com.github.catvod.spider.merge.C0181;
import com.github.catvod.spider.merge.C0182;
import com.github.catvod.spider.merge.C0183;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * AI Video Spider - Standard Implementation
 *
 * This spider handles video content retrieval with:
 * - Basic search functionality
 * - Video detail retrieval
 * - Player content processing
 * - Simple authentication headers
 */
public class C0001AIStandard extends Spider {

    // Encoded string array for decoding operations
    private static final short[] DECODE_ARRAY = {
        2729, 2703, 2713, 2702, 2769, 2749, 2715, 2713, 2706, 2696, 872, 881, 890, 833, 878, 882, 895, 871, 833, 875, 876, 882,
        2467, 2490, 2481, 2442, 2469, 2489, 2484, 2476, 2442, 2483, 2471, 2490, 2488, 1851, 1826, 1833, 1810, 1838, 1826, 1827,
        1849, 1832, 1827, 1849, 994, 1019, 1008, 971, 1008, 1021, 998, 1009, 1015, 992, 1019, 998, 1144, 1121, 1130, 1105, 1135,
        1133, 1146, 1121, 1148, 2317, 2324, 2335, 2340, 2313, 2334, 2326, 2330, 2313, 2320, 2312, 2774, 2767, 2756, 2815, 2753,
        2770, 2757, 2753, 3016, 3025, 3034, 3041, 3015, 3035, 3039, 3020, 2794, 2803, 2808, 2755, 2796, 2805, 2815, 574, 551,
        556, 535, 550, 553, 549, 557, 1577, 1584, 1595, 1536, 1590, 1595, 2921, 2924, 2934, 2929, 1592, 1576, 1654, 1652, 1578,
        1651, 1650, 1635, 1654, 1662, 1659, 1585, 1662, 1651, 1636, 1578, 972, 961, 968, 989, 999, 982, 985, 981, 989, 1381,
        1404, 1399, 1356, 1392, 1407, 1394, 1376, 1376, 27897, 25656, 21630, 23569, 22261, 22224, -30044, -1903, -29590, 21858,
        18839, 22734, 21578, -25334, -1892, -1892, 766, 734, 627, 580, 583, 580, 595, 580, 595, 411, 472, 390, 448, 397, 1557,
        1560, 1564, 1561, 1560, 1551, 2920, 2928, 2936, 2934, 2931, 2928, 1678, 1673, 1687, 2671, 2686, 2669, 2668, 2682, 2762,
        2697, 2708, 2768, 3098, 3080, 256, 281, 274, 297, 260, 275, 283, 279, 260, 285, 261, 2993, 2984, 2979, 2968, 2999, 2990,
        2980, 1490, 1483, 1472, 1531, 1482, 1477, 1481, 1473, 1790, 1767, 1772, 1751, 1761, 1772, 2117, 2112, 2138, 2141, 1768,
        1784, 1702, 1700, 1786, 1713, 1710, 1699, 1698, 1704, 1707, 1710, 1716, 1715, 1761, 1712, 1699, 1786
    };

    // Configuration fields
    private String baseUrl = "";
    private String configString = "";
    private String userAgent = "";

    /**
     * Constructor - initializes the spider
     */
    public C0001AIStandard() {
        // Simple initialization check
        if (C0171.m818() >= 0) {
            // Debug output for configuration
            System.out.println(Long.parseLong(C0177.m839("2XjaVdhkeEp57KzrQM2Qh96G8")));
        }
    }

    /**
     * Creates HTTP headers for requests
     * @param url Request URL
     * @return HashMap containing headers
     */
    private HashMap<String, String> createHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();

        // Add user agent header
        String userAgentKey = decodeString(0, 10, 2812); // "User-Agent"
        headers.put(userAgentKey, this.configString);

        return headers;
    }

    /**
     * Decodes string from the encoded array
     * @param offset Start position in array
     * @param length Number of elements to decode
     * @param key Decoding key
     * @return Decoded string
     */
    private String decodeString(int offset, int length, int key) {
        return C0178.m845(DECODE_ARRAY, offset, length, key);
    }

    /**
     * Retrieves detailed content for a specific video
     * @param ids List containing video ID
     * @return JSON string with video details
     */
    @Override
    public String detailContent(List<String> ids) {
        try {
            // Decode field names
            String typeField = C0166.m801(DECODE_ARRAY, 10, 12, 798);      // "type_name"
            String noteField = C0181.m856(DECODE_ARRAY, 22, 13, 2517);     // "vod_remarks"
            String picField = C0168.m805(DECODE_ARRAY, 35, 11, 1869);      // "vod_pic"
            String nameField = C0174.m828(DECODE_ARRAY, 46, 12, 916);      // "vod_name"
            String areaField = C0183.m866(DECODE_ARRAY, 58, 9, 1038);      // "vod_area"
            String langField = C0174.m828(DECODE_ARRAY, 67, 11, 2427);     // "vod_lang"
            String yearField = C0175.m834(DECODE_ARRAY, 78, 8, 2720);      // "vod_year"
            String actorField = C0165.m798(DECODE_ARRAY, 86, 8, 3006);     // "vod_actor"
            String directorField = C0182.m861(DECODE_ARRAY, 94, 7, 2716);  // "vod_director"
            String contentField = C0166.m801(DECODE_ARRAY, 101, 8, 584);   // "vod_content"
            String idField = C0171.m816(DECODE_ARRAY, 109, 6, 1631);       // "vod_id"
            String listField = C0166.m801(DECODE_ARRAY, 115, 4, 2821);     // "list"

            // Create response object
            JSONObject response = new JSONObject();
            JSONObject videoDetail = new JSONObject();

            // Build API URL
            String apiUrl = this.baseUrl +
                          C0178.m845(DECODE_ARRAY, 119, 16, 1559) + // "/api/video/detail?id="
                          ids.get(0);

            // Make API request
            String apiResponse = C0106ZJ.m484FN(apiUrl, createHeaders(apiUrl));
            JSONObject responseData = new JSONObject(apiResponse);
            JSONObject videoData = responseData.getJSONArray(listField).optJSONObject(0);

            // Map all video fields
            videoDetail.put(idField, videoData.optString(idField));
            videoDetail.put(contentField, videoData.optString(contentField));
            videoDetail.put(directorField, videoData.optString(directorField));
            videoDetail.put(C0172.m820(DECODE_ARRAY, 135, 9, 952),
                           videoData.optString(C0181.m856(DECODE_ARRAY, 144, 9, 1299)));
            videoDetail.put(actorField, videoData.optString(actorField));
            videoDetail.put(yearField, videoData.optString(yearField));
            videoDetail.put(langField, videoData.optString(langField));
            videoDetail.put(areaField, videoData.optString(areaField));
            videoDetail.put(nameField, videoData.optString(nameField));

            // Add image URL prefix
            String imagePrefix = C0174.m828(DECODE_ARRAY, 153, 16, 1949); // Image URL prefix
            videoDetail.put(picField, imagePrefix + videoData.optString(picField));

            videoDetail.put(noteField, videoData.optString(noteField));
            videoDetail.put(typeField, videoData.optString(typeField));

            // Build final response
            JSONArray videoList = new JSONArray();
            videoList.put(videoDetail);
            response.put(listField, videoList);

            return response.toString();

        } catch (Throwable e) {
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

        this.configString = configStr;

        // Parse configuration
        String separator = C0183.m866(DECODE_ARRAY, 169, 2, 674); // separator string
        String decodedConfig = C0152vp.m724Mo(configStr);
        String[] configParts = decodedConfig.split(configStr);

        if (configParts.length >= 3) {
            this.baseUrl = configParts[0];
            configStr = configParts[1];
            this.userAgent = configParts[2];
        }
    }

    /**
     * Processes player content for video playback
     * @param flag Player flag
     * @param id Video ID
     * @param vodFlags VOD flags list
     * @return JSON string with player configuration
     */
    @Override
    public String playerContent(String flag, String id, List<String> vodFlags) {
        try {
            JSONObject playerConfig = new JSONObject();
            JSONObject response = new JSONObject();

            // Decode field names
            String parseField = C0169.m809(DECODE_ARRAY, 171, 7, 545);     // "parse"
            String m3u8Check = C0169.m809(DECODE_ARRAY, 178, 5, 437);      // "m3u8"
            String headerField = C0175.m834(DECODE_ARRAY, 183, 6, 1661);   // "header"
            String jxCheck = C0183.m866(DECODE_ARRAY, 189, 6, 2841);       // "jx"
            String urlField = C0169.m809(DECODE_ARRAY, 195, 3, 1787);      // "url"
            String playUrlField = C0182.m861(DECODE_ARRAY, 198, 5, 2591);  // "playUrl"

            // Set user agent in player config
            playerConfig.put(parseField, this.userAgent);

            // Check if URL contains M3U8
            boolean isM3u8 = id.contains(m3u8Check);

            if (!isM3u8) {
                // Check for MP4 format
                boolean isMp4 = id.contains(C0170.m814(DECODE_ARRAY, 203, 4, 2788)); // "mp4"

                if (isMp4) {
                    // Direct MP4 playback
                    response.put(C0172.m820(DECODE_ARRAY, 207, 2, 3184), 1); // "code"
                    response.put(playUrlField, 0);
                    response.put(urlField, id);

                    // Add headers if JX processing is enabled
                    if (this.userAgent.contains(jxCheck)) {
                        response.put(headerField, playerConfig.toString());
                    }
                } else {
                    // Other format processing
                    response.put(playUrlField, 0);
                    response.put(urlField, id);

                    if (!this.userAgent.contains(jxCheck)) {
                        response.put(headerField, playerConfig.toString());
                    }
                }
            }

            return response.toString();

        } catch (Throwable e) {
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
    public String searchContent(String keyword, boolean quick) {
        try {
            // Decode field names
            String typeNameField = C0183.m866(DECODE_ARRAY, 209, 11, 374);  // "type_name"
            String directorField = C0169.m809(DECODE_ARRAY, 220, 7, 3015);  // "vod_director"
            String actorField = C0165.m798(DECODE_ARRAY, 227, 8, 1444);     // "vod_actor"
            String idField = C0182.m861(DECODE_ARRAY, 235, 6, 1672);        // "vod_id"
            String listField = C0166.m801(DECODE_ARRAY, 241, 4, 2089);      // "list"

            JSONObject response = new JSONObject();

            // Build search URL
            String searchUrl = this.baseUrl +
                             C0169.m809(DECODE_ARRAY, 245, 18, 1735) + // "/api/video/search?text="
                             keyword;

            System.out.println(searchUrl);

            // Make search request
            String searchResponse = C0106ZJ.m484FN(searchUrl, createHeaders(searchUrl));
            JSONObject searchData = new JSONObject(searchResponse);
            JSONArray searchResults = searchData.getJSONArray(listField);

            // Process search results
            JSONArray resultList = new JSONArray();
            for (int i = 0; i < searchResults.length(); i++) {
                JSONObject videoItem = searchResults.optJSONObject(i);
                JSONObject resultItem = new JSONObject();

                resultItem.put(idField, videoItem.optString(idField));
                resultItem.put(actorField, videoItem.optString(actorField));
                resultItem.put(directorField, videoItem.optString(directorField));
                resultItem.put(typeNameField, videoItem.optString(typeNameField));

                resultList.put(resultItem);
            }

            response.put(listField, resultList);
            return response.toString();

        } catch (Throwable e) {
            return "";
        }
    }
}