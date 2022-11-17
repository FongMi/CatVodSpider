package com.github.catvod.bean.ali;

import android.text.TextUtils;

import com.github.catvod.utils.Misc;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Item {

    @SerializedName("items")
    private List<Item> items;
    @SerializedName("next_marker")
    private String nextMarker;
    @SerializedName("file_id")
    private String fileId;
    @SerializedName("share_id")
    private String shareId;
    @SerializedName("name")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("file_extension")
    private String fileExtension;
    @SerializedName("category")
    private String category;
    @SerializedName("size")
    private double size;

    public static Item objectFrom(String str) {
        return new Gson().fromJson(str, Item.class);
    }

    public Item(String fileId) {
        this.fileId = fileId;
    }

    public List<Item> getItems() {
        return items == null ? Collections.emptyList() : items;
    }

    public String getNextMarker() {
        return TextUtils.isEmpty(nextMarker) ? "" : nextMarker;
    }

    public String getFileId() {
        return TextUtils.isEmpty(fileId) ? "" : fileId;
    }

    public String getShareId() {
        return TextUtils.isEmpty(shareId) ? "" : shareId;
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public String getType() {
        return TextUtils.isEmpty(type) ? "" : type;
    }

    public String getExt() {
        return TextUtils.isEmpty(fileExtension) ? "" : fileExtension;
    }

    public String getCategory() {
        return TextUtils.isEmpty(category) ? "" : category;
    }

    public double getSize() {
        return size;
    }

    public String getDisplayName() {
        return getSize() == 0 ? getName() : "[" + Misc.getSize(getSize()) + "] " + getName();
    }

    public String removeExt() {
        return getName().indexOf(".") > 0 ? getName().substring(0, getName().lastIndexOf(".")) : getName();
    }
}
