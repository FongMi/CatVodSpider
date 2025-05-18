package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;

import com.github.catvod.bean.mqitv.Data;
import com.github.catvod.bean.mqitv.User;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MQiTV extends Spider {

    private static Map<String, List<User>> users;
    private static String ext;

    private static String getHost() {
        if (ext.startsWith("http")) return ext;
        else return "http://" + ext;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        users = new HashMap<>();
        ext = extend;
    }

    @Override
    public String liveContent(String url) {
        List<Data> data;
        StringBuilder sb = new StringBuilder();
        loadUser(data = Data.objectFrom(OkHttp.string(getHost() + "/api/post?item=itv_traffic")).getData());
        for (Data item : data) sb.append(item.getName()).append(",").append(getProxyUrl(item)).append("\n");
        return sb.toString();
    }

    private String getProxyUrl(Data item) {
        boolean fixed = ext.startsWith("http");
        String port = fixed ? item.getPort() : "5003";
        return "proxy://do=mqitv" + "&id=" + item.getId() + "&ip=" + ext + "&playing=" + item.getPlaying() + "&port=" + port + "&type=m3u8";
    }

    public static Object[] proxy(Map<String, String> params) {
        String ip = params.get("ip");
        String port = params.get("port");
        if (port == null) port = "5003";
        if (ip != null) ext = ip;
        String token = getUser().getToken();
        if (token.isEmpty()) {
            Map<String, String> header = new HashMap<>();
            String playing = params.get("playing");
            header.put("Location", getStaticUrl(port, playing));
            Object[] result = new Object[4];
            result[0] = 302;
            result[1] = "text/plain";
            result[2] = new ByteArrayInputStream("302 Found".getBytes());
            result[3] = header;
            return result;
        } else {
            String id = params.get("id");
            String auth = authChannel(id, token);
            if (!"OK".equals(auth)) {
                users.get(getHost()).clear();
                return proxy(params);
            }
            Object[] result = new Object[3];
            result[0] = 200;
            result[1] = "application/vnd.apple.mpegurl";
            result[2] = new ByteArrayInputStream(getM3u8(id, port, token).getBytes());
            return result;
        }
    }

    private static void loadUser(List<Data> data) {
        Pattern userPattern = Pattern.compile(".*?([0-9a-zA-Z]{11,}).*", Pattern.CASE_INSENSITIVE);
        Pattern macPattern = Pattern.compile(".*?(([a-fA-F0-9]{2}:){5}[a-fA-F0-9]{2}).*", Pattern.CASE_INSENSITIVE);
        if (!users.containsKey(getHost())) users.put(getHost(), new ArrayList<>());
        for (Data item : data) {
            for (String userIp : item.getStat().getUserIpList()) {
                if (users.get(getHost()).size() >= 5) continue;
                Matcher userMatcher = userPattern.matcher(userIp);
                Matcher macMatcher = macPattern.matcher(userIp);
                String user = userMatcher.matches() ? userMatcher.group(1) : "";
                String mac = macMatcher.matches() ? macMatcher.group(1) : "";
                if (!user.isEmpty() && !mac.isEmpty()) {
                    User u = new User(user, mac).getToken(getHost());
                    if (!u.getToken().isEmpty()) users.get(getHost()).add(u);
                }
            }
        }
    }

    private static User getUser() {
        if (users == null) users = new HashMap<>();
        if (!users.containsKey(getHost())) users.put(getHost(), new ArrayList<>());
        if (users.get(getHost()).isEmpty()) loadUser(Data.objectFrom(OkHttp.string(getHost() + "/api/post?item=itv_traffic")).getData());
        return users.get(getHost()).isEmpty() ? new User("", "") : users.get(getHost()).get(ThreadLocalRandom.current().nextInt(users.size()));
    }

    private static String authChannel(String id, String token) {
        String data = OkHttp.string(getHost() + "/ualive?cid=" + id + "&token=" + token);
        Matcher matcher = Pattern.compile("\"Reason\":\"(.*?)\"", Pattern.CASE_INSENSITIVE).matcher(data);
        if (matcher.find()) return matcher.group(1);
        return "";
    }

    private static String getM3u8(String id, String port, String token) {
        String base = "http://" + Uri.parse(getHost()).getHost() + ":" + port + "/";
        String m3u8 = OkHttp.string(base + id + ".m3u8?token=" + token);
        if (m3u8.contains("\"Reason\"")) return "";
        String[] lines = m3u8.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (!line.startsWith("#")) line = base + line;
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    private static String getStaticUrl(String port, String playing) {
        return "http://" + Uri.parse(getHost()).getHost() + ":" + port + "/" + playing;
    }
}
