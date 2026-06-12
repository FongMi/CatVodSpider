package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C0106ZJ;
import com.github.catvod.spider.merge.C0114dC;
import com.github.catvod.spider.merge.C0118ga;
import com.github.catvod.spider.merge.C0152vp;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONObject;

public class Mayiys extends Spider {

    private String baseUrl = "http://www.rzys.cc";
    private String clientKey = "";
    private String dynamicKey = "";
    private String timestampKey = "";
    private String moKey = "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQCAliLnnNy2iPebSiwsfSlc1dV2gyQZjBVVAACMLmFa4svzF2XsM26dQ2AqXjDIMurDn8EfrevDMuq5TGqIFCaawEYdzWQFE3IMmnxEkxieEK7Lr0o0BjSZ5NLcaTnoWL0/+To837i5XPhzaZWHy4d9G+AaJ9MJDA3FBR5CQ7vi1wIBAw==";

    public Mayiys() {
    }

    private HashMap<String, String> makeHeaders(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "year");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject result = new JSONObject();
            String apiUrl = this.baseUrl + "/x1/v1/macTypes/detail";

            if (map == null) {
                map = new HashMap<>();
            }

            if (!map.containsKey("area")) {
                map.put("area", "");
            }
            if (!map.containsKey("type")) {
                map.put("type", "");
            }
            if (!map.containsKey("year")) {
                map.put("year", "");
            }

            String requestUrl = apiUrl
                    + "?classtype=" + map.get("type")
                    + "&area=" + map.get("area")
                    + "&year=" + map.get("year")
                    + "&typeid=" + str
                    + "&page=" + str2
                    + "&limit=30" + map.get("year")
                    + "&sign=" + getCsrf()
                    + "&os=1";

            JSONObject dataObj = new JSONObject(C0106ZJ.m484FN(requestUrl, makeHeaders(requestUrl)))
                    .optJSONObject("data");
            JSONArray listArray = dataObj.getJSONArray("list");
            JSONArray resultList = new JSONArray();
            for (int i = 0; i < listArray.length(); i++) {
                JSONObject item = listArray.optJSONObject(i);
                JSONObject obj = new JSONObject();
                obj.put("vod_id", item.optString("vod_id"));
                obj.put("vod_name", item.optString("vod_name"));
                obj.put("vod_pic", item.optString("vod_pic"));
                obj.put("vod_remarks", item.optString("vod_remarks"));
                resultList.put(obj);
            }
            int totalPage = dataObj.getInt("limit");
            result.put("page", dataObj.getInt("page"));
            result.put("pagecount", totalPage);
            result.put("total", dataObj.getInt("total"));
            result.put("limit", totalPage * 30);
            result.put("list", resultList);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            Init.m46lj();
            ArrayList<String> playFromList = new ArrayList<>();
            ArrayList<String> playUrlList = new ArrayList<>();
            JSONObject vod = new JSONObject();
            JSONObject result = new JSONObject();

            StringBuilder sb = new StringBuilder();
            sb.append(this.baseUrl);
            sb.append("/x1/v1/vod/details?vodidstr=");
            sb.append(list.get(0));
            sb.append("&sign=");
            sb.append(getCsrf());
            sb.append("&os=1");
            String requestUrl = sb.toString();

            JSONObject data = new JSONObject(new JSONObject(C0106ZJ.m484FN(requestUrl, makeHeaders(requestUrl)))
                    .optString("data"));
            vod.put("vod_id", data.optString("vod_id"));
            vod.put("vod_name", data.optString("vod_name"));
            vod.put("vod_pic", data.optString("vod_pic"));
            vod.put("type_name", data.optString("vod_class"));
            vod.put("vod_year", data.optString("vod_year"));
            vod.put("vod_area", data.optString("vod_area"));
            vod.put("vod_remarks", data.optString("vod_remarks"));
            vod.put("vod_actor", data.optString("vod_actor"));
            vod.put("vod_content", "此接口完全免费，请勿上当受骗！！" + data.optString("vod_content"));

            JSONArray episodes = data.getJSONArray("vod_play_list");
            for (int i = 0; i < episodes.length(); i++) {
                JSONObject source = episodes.optJSONObject(i);
                JSONArray items = source.getJSONArray("urls");
                ArrayList<String> epNames = new ArrayList<>();
                String sourceName = source.optJSONObject("player_info").optString("show");
                for (int j = 0; j < items.length(); j++) {
                    JSONObject ep = items.optJSONObject(j);
                    epNames.add(ep.optString("name") + "$"
                            + ep.optString("from")
                            + "|"
                            + ep.optString("url").replace("$", "@"));
                }
                playFromList.add(sourceName);
                playUrlList.add(TextUtils.join("#", epNames));
            }
            vod.put("vod_play_from", TextUtils.join("$$$", playFromList));
            vod.put("vod_play_url", TextUtils.join("$$$", playUrlList));

            JSONArray listArr = new JSONArray();
            listArr.put(vod);
            result.put("list", listArr);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String getCsrf() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        long timestamp = System.currentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder();
        sb.append(this.dynamicKey);
        sb.append(String.valueOf(timestamp));
        sb.append(this.timestampKey);
        String data = sb.toString();
        String encrypted = C0114dC.m578u(data, this.moKey);
        return URLEncoder.encode(encrypted, "UTF-8");
    }

    public String homeContent(boolean z) {
        try {
            String apiUrl = this.baseUrl + "/x1/v1/macTypes/types?sign=" + getCsrf() + "&os=1";

            JSONArray categories = new JSONObject(C0106ZJ.m484FN(apiUrl, makeHeaders(apiUrl)))
                    .optJSONObject("data")
                    .getJSONArray("list");

            JSONArray resultFilters = new JSONArray();
            for (int i = 0; i < categories.length(); i++) {
                JSONObject filterItem = new JSONObject();
                JSONObject category = categories.optJSONObject(i);
                String name = category.optString("type_name");
                filterItem.put("type_id", category.optString("type_id"));
                filterItem.put("type_name", name);
                resultFilters.put(filterItem);
            }

            JSONObject result = new JSONObject();
            result.put("class", resultFilters);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String homeVideoContent() {
        try {
            String apiUrl = this.baseUrl + "/x1/v1/recommend/recommendList?page=1&limit=4&sign=" + getCsrf() + "&os=1";
            JSONObject data = new JSONObject(C0106ZJ.m484FN(apiUrl, makeHeaders(apiUrl)));
            JSONArray videoList = new JSONArray();
            JSONArray categories = data.optJSONObject("data").getJSONArray("list");

            for (int i = 0; i < categories.length(); i++) {
                JSONArray videos = categories.optJSONObject(i).getJSONArray("vod_list");
                for (int j = 0; j < videos.length(); j++) {
                    JSONObject item = new JSONObject();
                    JSONObject video = videos.optJSONObject(j);
                    item.put("vod_id", video.optString("vod_id"));
                    item.put("vod_name", video.optString("vod_name"));
                    item.put("vod_pic", video.optString("vod_pic"));
                    item.put("vod_remarks", video.optString("vod_remarks"));
                    videoList.put(item);
                }
            }

            JSONObject result = new JSONObject();
            result.put("list", videoList);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        String[] parts = C0106ZJ.m484FN(C0152vp.m724Mo(str), makeHeaders("")).split("\\|");
        this.baseUrl = parts[0];
        try {
            this.dynamicKey = C0114dC.m579xC(this.moKey, new JSONObject(C0106ZJ.m484FN(
                    this.baseUrl + "/x1/v1/app/getS?os=1&version=182&level=14", makeHeaders("")))
                    .optString("data"));
        } catch (Exception e) {
            this.dynamicKey = parts[1];
        }
        this.timestampKey = parts[2];
        this.clientKey = parts[3];
    }

    public String playerContent(String str, String str2, List<String> list) {
        String decryptedUrl;
        try {
            JSONObject result = new JSONObject();
            String[] parts = str2.split("\\|");
            String param = parts[1];
            String flag = parts[0];
            boolean containsFlag = str2.contains("@");

            if (containsFlag) {
                String[] segments = param.split("@");
                decryptedUrl = "";
                for (String segment : segments) {
                    decryptedUrl = decryptedUrl + C0114dC.m579xC(this.moKey, segment);
                }
            } else {
                decryptedUrl = C0114dC.m579xC(this.moKey, param);
            }

            boolean isUrl = C0118ga.m600Mo(decryptedUrl);

            if (isUrl) {
                long currentTime = System.currentTimeMillis();
                String requestUrl = this.baseUrl
                        + "/x1/v1/analysis/newAnalysis?url="
                        + URLEncoder.encode(decryptedUrl)
                        + "&from=" + flag
                        + "&version=182&skip=0&time=" + currentTime
                        + "&sign="
                        + URLEncoder.encode(
                                C0114dC.m578u(this.dynamicKey + (currentTime / 1000) + this.timestampKey, this.moKey),
                                "UTF-8")
                        + "&os=1";
                String encryptedUrl = new JSONObject(C0106ZJ.m484FN(requestUrl, makeHeaders(requestUrl)))
                        .optJSONObject("data")
                        .optString("url");
                if (encryptedUrl.contains("$")) {
                    String[] urlSegments = encryptedUrl.split("\\$");
                    decryptedUrl = "";
                    for (String segment : urlSegments) {
                        decryptedUrl = decryptedUrl + C0114dC.m579xC(this.moKey, segment);
                    }
                } else {
                    decryptedUrl = C0114dC.m574QU(this.moKey, encryptedUrl);
                }
            }

            result.put("parse", 0);
            result.put("url", decryptedUrl);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            JSONObject result = new JSONObject();
            StringBuilder sb = new StringBuilder("d12170");
            sb.append((System.currentTimeMillis() / 1000) + 1549284568);
            String timeStr = String.valueOf(sb);
            String keyVal = "3d5a3422f25af5e8af7352a23ce3a016";

            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.baseUrl);
            sb2.append("/x1/v1/Search/search?a=");
            sb2.append(URLEncoder.encode(C0114dC.m575UJ(this.moKey, timeStr + "$" + keyVal)));
            sb2.append("&sign=");
            sb2.append(URLEncoder.encode(C0152vp.m721F(
                    this.dynamicKey + (System.currentTimeMillis() / 1000) + this.clientKey,
                    timeStr, keyVal)));
            sb2.append("&data=");
            sb2.append(URLEncoder.encode(str));
            sb2.append("&page=1&limit=12&os=1");

            String requestUrl = sb2.toString();
            String response = C0106ZJ.m484FN(requestUrl, makeHeaders(requestUrl));
            JSONArray resultList = new JSONArray();
            JSONArray list = new JSONObject(response).optJSONObject("data").getJSONArray("list");

            for (int i = 0; i < list.length(); i++) {
                JSONObject item = list.optJSONObject(i);
                JSONObject obj = new JSONObject();
                obj.put("vod_id", item.optString("vod_id"));
                obj.put("vod_name", item.optString("vod_name"));
                obj.put("vod_pic", item.optString("vod_pic"));
                obj.put("vod_remarks", item.optString("vod_remarks"));
                resultList.put(obj);
            }

            result.put("list", resultList);
            return result.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
