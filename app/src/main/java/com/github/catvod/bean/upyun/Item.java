package com.github.catvod.bean.upyun;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("title")
    private String title;
    @SerializedName("page_url")
    private String pageUrl;
    @SerializedName("insert_time")
    private String insertTime;

    public String getTitle() {
        return TextUtils.isEmpty(title) ? "" : title.replaceAll("<em>", "").replaceAll("</em>", "");
    }

    public String getPageUrl() {
        return TextUtils.isEmpty(pageUrl) ? "" : pageUrl;
    }

    public String getInsertTime() {
        return TextUtils.isEmpty(insertTime) ? "" : insertTime;
    }

    public Item url(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    public Vod getVod() {
        return new Vod(getPageUrl(), getTitle(), "https://inews.gtimg.com/newsapp_bt/0/13263837859/1000", getInsertTime());
    }
}
