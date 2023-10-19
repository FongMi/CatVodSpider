package com.github.catvod.bean.market;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("name")
    private String name;
    @SerializedName("list")
    private List<Item> list;

    public static List<Data> arrayFrom(String str) {
        Type listType = new TypeToken<ArrayList<Data>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public List<Item> getList() {
        return list == null ? Collections.emptyList() : list;
    }

    public List<Vod> getVod() {
        List<Vod> vodList = new ArrayList<>();
        for (Item item : getList()) vodList.add(item.vod());
        return vodList;
    }

    public Class type() {
        return new Class(getName(), getName());
    }
}
