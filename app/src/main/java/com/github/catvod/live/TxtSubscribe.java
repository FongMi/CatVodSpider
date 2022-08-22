package com.github.catvod.live;

import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Trans;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TxtSubscribe {

    public static void subscribe(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> allLives, String url, HashMap<String, String> headers) {
        String content = OkHttpUtil.string(url, headers);
        parse(allLives, content);
    }

    public static void parse(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> allLives, String txt) {
        try {
            BufferedReader br = new BufferedReader(new StringReader(txt));
            String line = br.readLine();
            LinkedHashMap<String, ArrayList<String>> noGroup = new LinkedHashMap<>();
            LinkedHashMap<String, ArrayList<String>> groupLives = noGroup;
            while (line != null) {
                if (line.trim().isEmpty()) {
                    line = br.readLine();
                    continue;
                }
                String[] lineInfo = line.split(",");
                if (lineInfo.length < 2) {
                    line = br.readLine();
                    continue;
                }
                if (line.contains("#genre#")) {
                    String group = Trans.get(lineInfo[0].trim());
                    if (!allLives.containsKey(group)) {
                        groupLives = new LinkedHashMap<>();
                        allLives.put(group, groupLives);
                    } else {
                        groupLives = allLives.get(group);
                    }
                } else {
                    String title = Trans.get(lineInfo[0].trim());
                    String[] urlMix = lineInfo[1].trim().split("#");
                    for (String mix : urlMix) {
                        String url = mix.trim();
                        if (url.isEmpty()) continue;
                        if (url.startsWith("http") || url.startsWith("rtsp") || url.startsWith("rtmp")) {
                            ArrayList<String> urls;
                            if (!groupLives.containsKey(title)) {
                                urls = new ArrayList<>();
                                groupLives.put(title, urls);
                            } else {
                                urls = groupLives.get(title);
                            }
                            if (!urls.contains(url)) urls.add(url);
                        }
                    }
                }
                line = br.readLine();
            }
            br.close();
            if (!noGroup.isEmpty()) {
                allLives.put("未分類", noGroup);
            }
        } catch (Exception ignored) {

        }
    }

    public static String live2Json(LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> lives) {
        JSONArray groups = new JSONArray();
        for (String group : lives.keySet()) {
            JSONArray channels = new JSONArray();
            LinkedHashMap<String, ArrayList<String>> allChannel = lives.get(group);
            if (allChannel.isEmpty()) continue;
            for (String channel : allChannel.keySet()) {
                ArrayList<String> allUrls = allChannel.get(channel);
                if (allUrls.isEmpty()) continue;
                JSONArray urls = new JSONArray();
                for (int i = 0; i < allUrls.size(); i++) {
                    urls.put(allUrls.get(i));
                }
                JSONObject newChannel = new JSONObject();
                try {
                    newChannel.put("name", channel);
                    newChannel.put("urls", urls);
                } catch (JSONException ignored) {
                }
                channels.put(newChannel);
            }
            JSONObject newGroup = new JSONObject();
            try {
                newGroup.put("group", group);
                newGroup.put("channels", channels);
            } catch (JSONException ignored) {
            }
            groups.put(newGroup);
        }
        return groups.toString();
    }

    public static Object[] load(String ext) {
        try {
            LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> allLives = new LinkedHashMap<>();
            TxtSubscribe.subscribe(allLives, ext, null);
            String json = TxtSubscribe.live2Json(allLives);
            Object[] result = new Object[3];
            result[0] = 200;
            result[1] = "text/plain; charset=utf-8";
            ByteArrayInputStream baos = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
            result[2] = baos;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
