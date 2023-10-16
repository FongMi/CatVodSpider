package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Utils;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName(value = "jump_id", alternate = "id")
    private String jumpId;
    @SerializedName(value = "thumbnail", alternate = "path")
    private String thumbnail;
    @SerializedName("title")
    private String title;
    @SerializedName("mask")
    private String mask;
    @SerializedName("description")
    private String description;
    @SerializedName("playlist")
    private Value playlist;
    @SerializedName("year")
    private Value year;
    @SerializedName("area")
    private Value area;
    @SerializedName("types")
    private List<Value> types;
    @SerializedName("actors")
    private List<Value> actors;
    @SerializedName("directors")
    private List<Value> directors;
    @SerializedName("btbo_downlist")
    private List<Value> btboDownlist;

    public String getJumpId() {
        return TextUtils.isEmpty(jumpId) ? "" : jumpId;
    }

    public String getThumbnail() {
        return TextUtils.isEmpty(thumbnail) ? "" : thumbnail + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362";
    }

    public String getTitle() {
        return TextUtils.isEmpty(title) ? "" : title;
    }

    public String getMask() {
        return TextUtils.isEmpty(mask) ? getPlaylist() : mask;
    }

    public String getDescription() {
        return TextUtils.isEmpty(description) ? "" : description.replace("　", "");
    }

    public String getPlaylist() {
        return playlist == null ? "" : playlist.getValue();
    }

    public String getYear() {
        return year == null ? "" : year.getValue();
    }

    public String getArea() {
        return area == null ? "" : area.getValue();
    }

    public String getTypes() {
        return types == null ? "" : getValues(types, false, " ");
    }

    public String getActors() {
        return actors == null ? "" : getValues(actors, true, " ");
    }

    public String getDirectors() {
        return directors == null ? "" : getValues(directors, true, " ");
    }

    public String getPlayUrl() {
        return btboDownlist == null ? "" : getValues(btboDownlist, false, "#");
    }

    public Vod vod() {
        return new Vod(getJumpId(), getTitle(), getThumbnail(), getMask());
    }

    public String getValues(List<Value> items, boolean link, String join) {
        StringBuilder sb = new StringBuilder();
        for (Value value : items) sb.append(value.getValue(link)).append(join);
        return Utils.substring(sb.toString());
    }

    public static class Value {

        @SerializedName(value = "val", alternate = {"name", "title"})
        private String value;

        private String getValue() {
            if (TextUtils.isEmpty(value)) return "";
            if (value.startsWith("ftp://")) return "tvbox-xg:" + value;
            return value;
        }

        private String getLink() {
            return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", getValue() + "/{pg}", getValue(), getValue());
        }

        public String getValue(boolean link) {
            return link ? getLink() : getValue();
        }
    }
}
