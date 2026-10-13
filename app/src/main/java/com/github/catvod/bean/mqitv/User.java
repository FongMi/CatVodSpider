package com.github.catvod.bean.mqitv;

import com.github.catvod.net.Net;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String id;
    private String mac;
    private String token;

    private User() {
    }

    public static User create() {
        return new User();
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public User mac(String mac) {
        this.mac = mac;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getMac() {
        return mac;
    }

    public String getToken() {
        return token == null ? "" : token;
    }

    public User getToken(Net net, String url) {
        String result = net.get(String.format(Locale.getDefault(), "%s/HSAndroidLogin.ecgi?ty=json&net_account=%s&mac_address1=%s&_=%d", url, getId(), getMac(), System.currentTimeMillis()));
        Pattern pattern = Pattern.compile("\"Token\"\\s*:\\s*\"(.*?)\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(result);
        token = matcher.find() ? matcher.group(1) : "";
        return this;
    }
}
