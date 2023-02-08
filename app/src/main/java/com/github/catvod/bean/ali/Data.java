package com.github.catvod.bean.ali;

import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class Data {

    @SerializedName("data")
    private Data data;
    @SerializedName("content")
    private Data content;
    @SerializedName("t")
    private String t;
    @SerializedName("ck")
    private String ck;
    @SerializedName("codeContent")
    private String codeContent;
    @SerializedName("qrCodeStatus")
    private String qrCodeStatus;
    @SerializedName("bizExt")
    private String bizExt;

    public static Data objectFrom(String str) {
        try {
            Data data = new Gson().fromJson(str, Data.class);
            return data == null ? new Data() : data;
        } catch (Exception e) {
            return new Data();
        }
    }

    public Data getData() {
        return data == null ? new Data() : data;
    }

    public Data getContent() {
        return content == null ? new Data() : content;
    }

    public String getT() {
        return t == null ? "" : t;
    }

    public String getCk() {
        return ck == null ? "" : ck;
    }

    public String getCodeContent() {
        return codeContent == null ? "" : codeContent;
    }

    public String getQrCodeStatus() {
        return qrCodeStatus == null ? "" : qrCodeStatus;
    }

    public String getBizExt() {
        return bizExt == null ? "" : bizExt;
    }

    public String getToken() {
        return Biz.objectFrom(new String(Base64.decode(getBizExt(), Base64.DEFAULT))).getPdsLoginResult().getRefreshToken();
    }

    public boolean hasToken() {
        return getQrCodeStatus().equals("CONFIRMED") && getBizExt().length() > 0;
    }

    public Map<String, String> getParams() {
        Map<String, String> params = new HashMap<>();
        params.put("t", getT());
        params.put("ck", getCk());
        params.put("appName", "aliyun_drive");
        params.put("appEntrance", "web");
        params.put("isMobile", "false");
        params.put("lang", "zh_CN");
        params.put("returnUrl", "");
        params.put("fromSite", "52");
        params.put("bizParams", "");
        params.put("navlanguage", "zh-CN");
        params.put("navPlatform", "MacIntel");
        return params;
    }
}
