package com.github.catvod.bean.xtream;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class XCategory {

    @SerializedName("category_id")
    private String categoryId;
    @SerializedName("category_name")
    private String categoryName;

    public static List<XCategory> arrayFrom(String str) {
        Type listType = new TypeToken<List<XCategory>>() {}.getType();
        List<XCategory> items = new Gson().fromJson(str, listType);
        return items == null ? Collections.emptyList() : items;
    }

    public String getCategoryId() {
        return TextUtils.isEmpty(categoryId) ? "" : categoryId;
    }

    public String getCategoryName() {
        return TextUtils.isEmpty(categoryName) ? "" : categoryName;
    }
}
