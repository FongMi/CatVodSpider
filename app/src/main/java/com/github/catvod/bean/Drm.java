package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Drm {

    @SerializedName("key")
    private String key;
    @SerializedName("type")
    private String type;
    @SerializedName("forceKey")
    private Boolean forceKey;
    @SerializedName("header")
    private Map<String, String> header;

    private Drm() {
    }

    public static Drm create() {
        return new Drm();
    }

    public Drm key(String key) {
        this.key = key;
        return this;
    }

    public Drm type(String type) {
        this.type = type;
        return this;
    }

    public Drm forceKey(boolean forceKey) {
        this.forceKey = forceKey;
        return this;
    }

    public Drm header(Map<String, String> header) {
        this.header = header;
        return this;
    }
}
