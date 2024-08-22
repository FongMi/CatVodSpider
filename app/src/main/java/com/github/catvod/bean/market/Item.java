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
    @SerializedName("copy")
    private String copy;
    @SerializedName("version")
    private String version;

    public Item(String url) {
        this.url = url;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url;
    }

    public String getIcon() {
        return TextUtils.isEmpty(icon) ? "" : icon;
    }

    public String getCopy() {
        return TextUtils.isEmpty(copy) ? "" : copy;
    }

    public String getVersion() {
        return TextUtils.isEmpty(version) ? "" : version;
    }

    public Vod vod() {
        return new Vod("", getName(), getIcon(), getVersion(), Vod.Style.rect(1.0f), getUrl());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item it = (Item) obj;
        return getUrl().equals(it.getUrl());
    }
}
