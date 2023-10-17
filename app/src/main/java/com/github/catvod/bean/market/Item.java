package com.github.catvod.bean.market;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Item {

    @SerializedName("name")
    private String name;
    @SerializedName("url")
    private String url;
    @SerializedName("icon")
    private String icon;

    public static List<Item> arrayFrom(String str) {
        Type listType = new TypeToken<ArrayList<Item>>() {}.getType();
        return new Gson().fromJson(str, listType);
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

    public Vod vod() {
        return new Vod(getUrl(), getName(), getIcon());
    }
}
