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
    public String liveContent(String url) {
        StringBuilder sb = new StringBuilder();
        for (Config config : getConfigs()) {
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
        if (port == null) port = "5003";
        Config config = getConfig(ip);
        String token = config.getUser().getToken();
        if (token.isEmpty()) {
            Map<String, String> header = new HashMap<>();
            String playing = params.get("playing");
            header.put("Location", config.getPlayUrl(port, playing));
            Object[] result = new Object[4];
            result[0] = 302;
            result[1] = "text/plain";
            result[2] = new ByteArrayInputStream("302 Found".getBytes());
            result[3] = header;
            return result;
        } else {
            String id = params.get("id");
            String auth = config.getAuth(id, token);
            if (!"OK".equals(auth)) config.clear();
            if (!"OK".equals(auth)) return proxy(params);
            Object[] result = new Object[3];
            result[0] = 200;
            result[1] = "application/vnd.apple.mpegurl";
            result[2] = new ByteArrayInputStream(config.getM3U8(id, token, port).getBytes());
            return result;
        }
    }
}
