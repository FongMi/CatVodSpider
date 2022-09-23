package com.github.catvod.bean.paper;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Data {

    @SerializedName("key")
    private String key;
    @SerializedName("cat")
    private String cat;
    @SerializedName("title")
    private String title;
    @SerializedName("date")
    private String date;

    public static List<Data> arrayFrom(String str) {
        Type listType = new TypeToken<List<Data>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public String getKey() {
        return key;
    }

    public String getCat() {
        return cat;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public Vod getVod() {
        return new Vod("https://www.aliyundrive.com/s/" + getKey(), getTitle(), "https://www.lgstatic.com/i/image2/M01/15/7E/CgoB5lysLXCADg6ZAABapAHUnQM321.jpg", getDate());
    }
}
