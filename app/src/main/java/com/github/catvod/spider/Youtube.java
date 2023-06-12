package com.github.catvod.spider;

import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Youtube {

    private static HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        return headers;
    }

    public static String fetch(String url) {
        try {
            String result = OkHttp.string(url, getHeader());
            Pattern pattern = Pattern.compile("hlsManifestUrl\\S*?(https\\S*?\\.m3u8)");
            Matcher matcher = pattern.matcher(result);
            if (!matcher.find()) return "";
            String stable = matcher.group(1);
            result = OkHttp.string(stable, getHeader());
            String quality = find(result);
            return quality.isEmpty() ? url : quality;
        } catch (Exception e) {
            e.printStackTrace();
            return url;
        }
    }

    private static String find(String result) {
        String url = "";
        List<String> items = Arrays.asList("301", "300", "96", "95", "94");
        for (String item : items) if (!(url = find(result, "https:/.*/" + item + "/.*index.m3u8")).isEmpty()) break;
        return url;
    }

    private static String find(String result, String rule) {
        Pattern pattern = Pattern.compile(rule);
        Matcher matcher = pattern.matcher(result);
        if (matcher.find()) return matcher.group();
        return "";
    }
}
