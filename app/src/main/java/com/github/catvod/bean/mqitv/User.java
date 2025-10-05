package com.github.catvod.bean.mqitv;

import com.github.catvod.net.OkHttp;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String id;
    private String mac;
    private String token;

    public User(String id, String mac) {
        this.id = id;
        this.mac = mac;
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

    public User getToken(String url) {
        String result = OkHttp.string(String.format(Locale.getDefault(), "%s/HSAndroidLogin.ecgi?ty=json&net_account=%s&mac_address1=%s&_=%d", url, getId(), getMac(), System.currentTimeMillis()));
        Pattern pattern = Pattern.compile("\"Token\"\\s*:\\s*\"(.*?)\"", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(result);
        token = matcher.find() ? matcher.group(1) : "";
        return this;
    }
}
