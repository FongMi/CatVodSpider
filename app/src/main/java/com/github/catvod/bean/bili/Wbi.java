package com.github.catvod.bean.bili;

import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.utils.Util;
import com.google.gson.annotations.SerializedName;

import java.net.URLEncoder;
import java.util.LinkedHashMap;

public class Wbi {

    private final int[] mixinKeyEncTab = new int[]{46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String imgUrl;
    @SerializedName("sub_url")
    private String subUrl;

    public String getImgUrl() {
        return TextUtils.isEmpty(imgUrl) ? "" : imgUrl;
    }

    public String getSubUrl() {
        return TextUtils.isEmpty(subUrl) ? "" : subUrl;
    }

    private String getMixinKey(String imgKey, String subKey) {
        String s = imgKey + subKey;
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 32; i++) key.append(s.charAt(mixinKeyEncTab[i]));
        return key.toString();
    }

    public String getQuery(LinkedHashMap<String, Object> params) {
        String imgKey = Uri.parse(getImgUrl()).getLastPathSegment().split("\\.")[0];
        String subKey = Uri.parse(getSubUrl()).getLastPathSegment().split("\\.")[0];
        String mixinKey = getMixinKey(imgKey, subKey);
        StringBuilder sb = new StringBuilder();
        params.put("wts", System.currentTimeMillis() / 1000);
        for (String key : params.keySet()) sb.append(key).append("=").append(URLEncoder.encode(params.get(key).toString())).append("&");
        String query = Util.substring(sb.toString());
        String w_rid = Util.MD5(query + mixinKey);
        return query + "&w_rid=" + w_rid;
    }
}
