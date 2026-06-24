package com.github.catvod.utils.merge;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * 播放结果（返回给播放器的 JSON 数据）
 */
public final class PlayResult {

    @SerializedName("url")
    private Object playUrl;

    @SerializedName("parse")
    private int parse;

    @SerializedName("playUrl")
    private String playUrlPrefix = "";

    @SerializedName("header")
    private String headerJson;

    @SerializedName("format")
    private String format;

    @SerializedName("subs")
    private List<?> subtitles;

    /** 设置播放地址 */
    public void setUrl(String url) {
        this.playUrl = url;
    }

    /** 设置格式为 octet-stream（二进制流） */
    public void setOctetStream() {
        this.format = "application/octet-stream";
    }

    /** 设置额外数据（如 header JSON 字符串） */
    public void setExtra(Object extra) {
        if (extra instanceof String) {
            this.headerJson = (String) extra;
        }
    }

    /** 设置请求头 Map */
    public void setHeaders(Map<String, String> headers) {
        if (headers != null && !headers.isEmpty()) {
            this.headerJson = new Gson().toJson(headers);
        }
    }

    /** 设置字幕列表 */
    public void setSubtitles(List<?> subs) {
        this.subtitles = subs;
    }

    /** Obfuscated alias for setSubtitles(). */
    public void v(List<?> subs) {
        setSubtitles(subs);
    }

    @Override
    public String toString() {
        return new Gson().newBuilder().disableHtmlEscaping().create().toJson(this);
    }
}
