package com.github.catvod.bean.alist;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Misc;
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
        if (isNew) return getType() == 2 || getType() == 3;
        return getType() == 3 || getType() == 4;
    }

    public boolean ignore(boolean isNew) {
        if (isNew) return getType() == 0 || getType() == 4;
        return getType() == 0 || getType() == 2 || getType() == 5;
    }

    public String getExt() {
        return getName().substring(getName().lastIndexOf(".") + 1);
    }

    public String getVodId(String id) {
        return id + getPath() + "/" + getName();
    }

    public String getPic() {
        return getThumb().isEmpty() && isFolder() ? "http://img1.3png.com/281e284a670865a71d91515866552b5f172b.png" : getThumb();
    }

    public String getRemark() {
        return Misc.getSize(getSize()) + (isFolder() ? " 文件夹" : "");
    }

    public String getVodTag() {
        return isFolder() ? "folder" : "file";
    }

    public Vod getVod(String id) {
        return new Vod(getVodId(id), getName(), getPic(), getRemark(), getVodTag());
    }
}
