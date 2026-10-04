package com.github.catvod.bean.mqitv;

import android.net.Uri;

import androidx.annotation.Nullable;

import com.github.catvod.net.Net;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Config {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;

    private List<User> users;
    private List<Data> data;
    private Uri uri;

    public static List<Config> arrayFrom(String str) {
        Type listType = TypeToken.getParameterized(List.class, Config.class).getType();
        return new Gson().fromJson(str, listType);
    }

    public Config(String url) {
        this.url = url;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public String getUrl() {
        return url == null ? "" : url;
    }

    public List<User> getUsers() {
        return users = users == null ? new ArrayList<>() : users;
    }

    public List<Data> getData(Net net) {
        return data = data == null ? Data.objectFrom(net.get(getApi(), 3000)).getData() : data;
    }

    public Uri getUri() {
        return uri = uri == null ? Uri.parse(getUrl()) : uri;
    }

    public String getApi() {
        return getUrl() + "/api/post?item=itv_traffic";
    }

    public String getPlayUrl(String port, String playing) {
        return "http://" + getUri().getHost() + ":" + port + "/" + playing.replace(":/", "");
    }

    public void loadUser(Net net) {
        Pattern userPattern = Pattern.compile(".*?([0-9a-zA-Z]{11,}).*", Pattern.CASE_INSENSITIVE);
        Pattern macPattern = Pattern.compile(".*?(([a-fA-F0-9]{2}:){5}[a-fA-F0-9]{2}).*", Pattern.CASE_INSENSITIVE);
        for (Data item : getData(net)) {
            for (String userIp : item.getStat().getUserIpList()) {
                if (getUsers().size() >= 5) continue;
                Matcher userMatcher = userPattern.matcher(userIp);
                Matcher macMatcher = macPattern.matcher(userIp);
                String user = userMatcher.matches() ? userMatcher.group(1) : "";
                String mac = macMatcher.matches() ? macMatcher.group(1) : "";
                if (!user.isEmpty() && !mac.isEmpty()) {
                    User u = new User(user, mac).getToken(net, getUrl());
                    if (!u.getToken().isEmpty()) getUsers().add(u);
                }
            }
        }
    }

    public User getUser(Net net) {
        if (getUsers().isEmpty()) loadUser(net);
        return getUsers().isEmpty() ? new User("", "") : getUsers().get(ThreadLocalRandom.current().nextInt(getUsers().size()));
    }

    public String getAuth(Net net, String id, String token) {
        String data = net.get(getUrl() + "/ualive?cid=" + id + "&token=" + token);
        Matcher matcher = Pattern.compile("\"Reason\":\"(.*?)\"", Pattern.CASE_INSENSITIVE).matcher(data);
        if (matcher.find()) return matcher.group(1);
        return "";
    }

    public String getM3U8(Net net, String id, String token, String port) {
        String base = "http://" + getUri().getHost() + ":" + port + "/";
        String m3u8 = net.get(base + id + ".m3u8?token=" + token);
        if (m3u8.isEmpty() || m3u8.contains("\"Reason\"")) return "";
        String[] lines = m3u8.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (!line.startsWith("#") && !line.startsWith("http")) line = base + line;
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public void clear() {
        this.data = null;
        this.users = null;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Config it)) return false;
        return getUrl().equals(it.getUrl());
    }
}
