package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.mqitv.Config;
import com.github.catvod.bean.mqitv.Data;
import com.github.catvod.crawler.Spider;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MQiTV extends Spider {

    private static List<Config> configs;

    public static List<Config> getConfigs() {
        return configs = configs == null ? new ArrayList<>() : configs;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        configs = Config.arrayFrom(extend);
    }

    @Override
    public String liveContent(String url) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (Config config : getConfigs()) {
            if (config.getData().isEmpty()) continue;
            sb.append(config.getName()).append(",#genre#").append("\n");
            boolean hasPort = config.getUri().getPort() != -1;
            for (Data item : config.getData()) {
                String port = hasPort ? item.getPort() : "5003";
                String proxy = "proxy://do=mqitv&id=" + item.getId() + "&ip=" + config.getUrl() + "&playing=" + item.getPlaying() + "&port=" + port + "&type=m3u8";
                sb.append(item.getName()).append(",").append(proxy).append("\n");
            }
        }
        return sb.toString();
    }

    private static Config getConfig(String ip) {
        Config config = new Config(ip);
        int index = getConfigs().indexOf(config);
        if (index != -1) return getConfigs().get(index);
        else getConfigs().add(config);
        return config;
    }

    public static Object[] proxy(Map<String, String> params) {
        String ip = params.get("ip");
        String port = params.get("port");
        String playing = params.get("playing");
        if (port == null) port = "5003";
        Config config = getConfig(ip);
        String token = config.getUser().getToken();
        if (token.isEmpty()) {
            return get302(config.getPlayUrl(port, playing));
        } else {
            String id = params.get("id");
            String auth = config.getAuth(id, token);
            if (!"OK".equals(auth)) config.clear();
            if (!"OK".equals(auth)) return proxy(params);
            String m3u8 = config.getM3U8(id, token, port);
            return m3u8.isEmpty() ? get302(config.getPlayUrl(port, playing)) : get200(m3u8);
        }
    }

    private static Object[] get302(String location) {
        Map<String, String> header = new HashMap<>();
        header.put("Location", location);
        Object[] result = new Object[4];
        result[0] = 302;
        result[1] = "text/plain";
        result[2] = new ByteArrayInputStream("302 Found".getBytes());
        result[3] = header;
        return result;
    }

    private static Object[] get200(String m3u8) {
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/vnd.apple.mpegurl";
        result[2] = new ByteArrayInputStream(m3u8.getBytes());
        return result;
    }
}
