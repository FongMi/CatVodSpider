package com.github.catvod.bean;

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

    public Sub setUrl(String url) {
        this.url = url;
        return this;
    }

    public Sub setName(String name) {
        this.name = name;
        return this;
    }

    public Sub setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Sub setFormat(String format) {
        this.format = format;
        return this;
    }

    public Sub setFlag(int flag) {
        this.flag = flag;
        return this;
    }
}
