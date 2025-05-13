package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;

import com.github.catvod.bean.mqitv.Data;
import com.github.catvod.bean.mqitv.User;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
        boolean fixed = ext.startsWith("http");
        loadUser(data = Data.objectFrom(OkHttp.string(getHost() + "/api/post?item=itv_traffic")).getData());
        for (Data item : data) sb.append(item.getName()).append(",").append("proxy://do=mqitv").append("&id=").append(item.getId()).append("&port=").append(fixed ? item.getPort() : "5003").append("&type=m3u8").append("\n");
        return sb.toString();
    }

    public static Object[] proxy(Map<String, String> params) {
        String id = params.get("id");
        String ip = params.get("ip");
        String port = params.get("port");
        if (port == null) port = "5003";
        if (ip != null) ext = ip;
        String token = getToken();
        String auth = authChannel(id, token);
        SpiderDebug.log("id=" + id + ", token=" + token + ", auth=" + auth);
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/vnd.apple.mpegurl";
        result[2] = new ByteArrayInputStream(getM3u8(id, port, token).getBytes());
        return result;
    }

    private static void loadUser(List<Data> data) {
        Pattern userPattern = Pattern.compile(".*?([0-9a-zA-Z]{11,}).*", Pattern.CASE_INSENSITIVE);
        Pattern macPattern = Pattern.compile(".*?(([a-fA-F0-9]{2}:){5}[a-fA-F0-9]{2}).*", Pattern.CASE_INSENSITIVE);
        if (!users.containsKey(getHost())) users.put(getHost(), new ArrayList<>());
        for (Data item : data) {
            for (String userIp : item.getStat().getUserIpList()) {
                Matcher userMatcher = userPattern.matcher(userIp);
                Matcher macMatcher = macPattern.matcher(userIp);
                String user = userMatcher.matches() ? userMatcher.group(1) : "";
                String mac = macMatcher.matches() ? macMatcher.group(1) : "";
                if (!user.isEmpty() && !mac.isEmpty()) users.get(getHost()).add(new User(user, mac));
            }
        }
    }

    private static User choose() {
        if (users == null) users = new HashMap<>();
        if (!users.containsKey(getHost())) users.put(getHost(), new ArrayList<>());
        if (users.get(getHost()).isEmpty()) loadUser(Data.objectFrom(OkHttp.string(getHost() + "/api/post?item=itv_traffic")).getData());
        return users.get(getHost()).get(ThreadLocalRandom.current().nextInt(users.size()));
    }

    private static String getToken() {
        User user = choose();
        String url = String.format(Locale.getDefault(), "%s/HSAndroidLogin.ecgi?ty=json&net_account=%s&mac_address1=%s&_=%d", getHost(), user.getId(), user.getMac(), System.currentTimeMillis());
        Pattern pattern = Pattern.compile("\"Token\"\\s*:\\s*\"(.*?)\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(OkHttp.string(url));
        if (matcher.find()) return matcher.group(1);
        return getToken();
    }

    private static String authChannel(String id, String token) {
        String data = OkHttp.string(getHost() + "/ualive?cid=" + id + "&token=" + token);
        Matcher matcher = Pattern.compile("\"Reason\":\"(.*?)\"", Pattern.CASE_INSENSITIVE).matcher(data);
        if (matcher.find()) return matcher.group(1);
        return "";
    }

    private static String getM3u8(String id, String port, String token) {
        String base = "http://" + Uri.parse(getHost()).getHost() + ":" + port + "/";
        String m3u8 = base + id + ".m3u8?token=" + token;
        String[] lines = OkHttp.string(m3u8).split("\\r?\\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (!line.startsWith("#")) line = base + line;
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
