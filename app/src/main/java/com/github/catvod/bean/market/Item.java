package com.github.catvod.bean.market;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("icon")
    private String icon;
    @SerializedName("version")
    private String version;

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url;
    }

    public String getIcon() {
        return TextUtils.isEmpty(icon) ? "" : icon;
    }

    public String getVersion() {
        return TextUtils.isEmpty(version) ? "" : version;
    }

    public Vod vod() {
        return new Vod(getUrl(), getName(), getIcon(), getVersion(), Vod.Style.rect(1.0f));
    }
}
