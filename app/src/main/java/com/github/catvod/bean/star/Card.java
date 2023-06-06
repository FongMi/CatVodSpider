package com.github.catvod.bean.star;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class Card {

    @SerializedName("name")
    private String name;
    @SerializedName(value = "img", alternate = "picurl")
    private String img;
    @SerializedName("id")
    private String id;
    @SerializedName("countStr")
    private String countStr;
    @SerializedName("url")
    private String url;
    @SerializedName("cards")
    private List<Card> cards;

    public static List<Card> arrayFrom(String str) {
        Type listType = new TypeToken<List<Card>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getImg() {
        return TextUtils.isEmpty(img) ? "" : img;
    }

    public String getId() {
        return TextUtils.isEmpty(id) ? "" : id;
    }

    public String getCountStr() {
        return TextUtils.isEmpty(countStr) ? "" : countStr;
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url;
    }

    public List<Card> getCards() {
        return cards == null ? Collections.emptyList() : cards;
    }

    public Vod vod() {
        return new Vod(getId(), getName(), getImg(), getCountStr());
    }
}
