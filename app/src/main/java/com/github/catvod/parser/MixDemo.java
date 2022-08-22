package com.github.catvod.parser;

import android.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MixDemo {

    private static final HashMap<String, ArrayList<String>> flagWebJx = new HashMap<>();
    private static HashMap<String, ArrayList<String>> configs = null;

    private static void setConfigs(LinkedHashMap<String, HashMap<String, String>> jx) {
        configs = new HashMap<>();
        for (String key : jx.keySet()) {
            HashMap<String, String> parseBean = jx.get(key);
            String type = parseBean.get("type");
            if (type.equals("1") || type.equals("0")) {
                try {
                    JSONArray flags = new JSONObject(parseBean.get("ext")).getJSONArray("flag");
                    for (int j = 0; j < flags.length(); j++) {
                        String flagKey = flags.getString(j);
                        ArrayList<String> flagJx = configs.get(flagKey);
                        if (flagJx == null) {
                            flagJx = new ArrayList<>();
                            configs.put(flagKey, flagJx);
                        }
                        flagJx.add(key);
                    }
                } catch (Exception ignored) {
                }
            }
        }
    }

    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> jx, String nameMe, String flag, String url) {
        try {
            if (configs == null) setConfigs(jx);
            LinkedHashMap<String, String> jsonJx = new LinkedHashMap<>();
            ArrayList<String> webJx = new ArrayList<>();
            ArrayList<String> flagJx = configs.get(flag);
            if (flagJx != null && !flagJx.isEmpty()) {
                for (int i = 0; i < flagJx.size(); i++) {
                    String key = flagJx.get(i);
                    HashMap<String, String> parseBean = jx.get(key);
                    String type = parseBean.get("type");
                    if (type.equals("1")) {
                        jsonJx.put(key, mixUrl(parseBean.get("url"), parseBean.get("ext")));
                    } else if (type.equals("0")) {
                        webJx.add(parseBean.get("url"));
                    }
                }
            } else {
                for (String key : jx.keySet()) {
                    HashMap<String, String> parseBean = jx.get(key);
                    String type = parseBean.get("type");
                    if (type.equals("1")) {
                        jsonJx.put(key, mixUrl(parseBean.get("url"), parseBean.get("ext")));
                    } else if (type.equals("0")) {
                        webJx.add(parseBean.get("url"));
                    }
                }
            }
            if (!webJx.isEmpty()) flagWebJx.put(flag, webJx);
            JSONObject jsonResult = JsonParallel.parse(jsonJx, url);
            if (jsonResult.has("url")) return jsonResult;
            if (!webJx.isEmpty()) {
                JSONObject webResult = new JSONObject();
                webResult.put("url", "proxy://do=parseMix&flag=" + flag + "&url=" + Base64.encodeToString(url.getBytes(), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP));
                webResult.put("parse", 1);
                return webResult;
            }
        } catch (Exception ignored) {
        }
        return new JSONObject();
    }

    private static String mixUrl(String url, String ext) {
        if (ext.trim().isEmpty()) return url;
        int index = url.indexOf("?");
        if (index == -1) return url;
        return url.substring(0, index + 1) + "cat_ext=" + Base64.encodeToString(ext.getBytes(), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP) + "&" + url.substring(index + 1);
    }
}
