package com.github.catvod.bean.market;

import android.text.TextUtils;

import com.github.catvod.bean.Style;
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

    private Item() {
    }

    public static Item create() {
        return new Item();
    }

    public Item url(String url) {
        this.url = url;
        return this;
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
        return Vod.create().id("").name(getName()).pic(getIcon()).remarks(getVersion()).style(Style.create().type("rect").ratio(1.0f)).action(getUrl());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item it = (Item) obj;
        return getUrl().equals(it.getUrl());
    }
}
