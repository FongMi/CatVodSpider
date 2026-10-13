package com.github.catvod.bean;

import com.github.catvod.utils.VodUtil;
import com.google.gson.annotations.SerializedName;

public class Sub {

    @SerializedName("url")
    private String url;
    @SerializedName("name")
    private String name;
    @SerializedName("lang")
    private String lang;
    @SerializedName("format")
    private String format;
    @SerializedName("flag")
    private Integer flag;

    private Sub() {
    }

    public static Sub create() {
        return new Sub();
    }

    public Sub url(String url) {
        this.url = url;
        return this;
    }

    public Sub name(String name) {
        this.name = name;
        return this;
    }

    public Sub lang(String lang) {
        this.lang = lang;
        return this;
    }

    public Sub format(String ext) {
        this.format = VodUtil.getSubMimeType(ext);
        return this;
    }

    public Sub flag(int flag) {
        this.flag = flag;
        return this;
    }
}
