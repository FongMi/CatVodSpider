package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Util;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Item {

    @SerializedName("name")
    private String name;
    @SerializedName(value = "path", alternate = "parent")
    private String path;
    @SerializedName("type")
    private int type;
    @SerializedName("size")
    private long size;
    @SerializedName(value = "thumb", alternate = "thumbnail")
    private String thumb;
    @SerializedName(value = "url", alternate = "raw_url")
    private String url;
    @SerializedName(value = "modified", alternate = "updated_at")
    private String modified;

    public static Item objectFrom(String str) {
        return new Gson().fromJson(str, Item.class);
    }

    public static List<Item> arrayFrom(String str) {
        Type listType = new TypeToken<List<Item>>() {}.getType();
        return new Gson().fromJson(str, listType);
    }

    public String getName() {
        return TextUtils.isEmpty(name) ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return TextUtils.isEmpty(path) ? "" : path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public String getThumb() {
        return TextUtils.isEmpty(thumb) ? "" : thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url.startsWith("//") ? "http:" + url : url;
    }

    public String getModified() {
        return modified;
    }

    public Date getDate() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
            return format.parse(getModified());
        } catch (Exception e) {
            return new Date();
        }
    }

    public boolean isFolder() {
        return getType() == 1;
    }

    public boolean isMedia(boolean isNew) {
        if (getName().endsWith(".ts") || getName().endsWith(".mpg")) return true;
        if (isNew) return getType() == 2 || getType() == 3;
        return getType() == 3 || getType() == 4;
    }

    public boolean ignore(boolean isNew) {
        if (getName().endsWith(".ts") || getName().endsWith(".mpg")) return false;
        if (isNew) return getType() == 0 || getType() == 4;
        return getType() == 0 || getType() == 2 || getType() == 5;
    }

    public String getExt() {
        return Util.getExt(getName());
    }

    public String getVodId(String id) {
        return id + getPath() + "/" + getName();
    }

    public String getPic(String pic) {
        return getThumb().isEmpty() && isFolder() ? pic : getThumb();
    }

    public String getRemark() {
        return Util.getSize(getSize());
    }

    public Vod getVod(String id, String pic) {
        return new Vod(getVodId(id), getName(), getPic(pic), getRemark(), isFolder());
    }

    public Vod getVod(Drive drive, String pic) {
        return new Vod(getVodId(drive.getName()), getName(), getPic(pic), drive.getName(), isFolder());
    }
}
