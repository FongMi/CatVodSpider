package com.github.catvod.bean.vod;

import com.google.gson.annotations.SerializedName;

/**
 * 筛选项（替代 merge.KI.b）
 */
public final class FilterItem {

    @SerializedName("n")
    public String name;

    @SerializedName("v")
    public String value;

    public FilterItem() {
    }

    public FilterItem(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
