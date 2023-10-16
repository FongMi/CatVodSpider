package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Utils;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
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
    private List<BtboDown> btboDownlist;

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
        return TextUtils.isEmpty(description) ? "" : description;
    }

    public String getPlaylist() {
        return playlist == null ? "" : playlist.getTitle();
    }

    public String getYear() {
        return year == null ? "" : year.getTitle();
    }

    public String getArea() {
        return area == null ? "" : area.getTitle();
    }

    public String getTypes() {
        return types == null ? "" : getValues(types);
    }

    public String getActors() {
        return actors == null ? "" : getValues(actors);
    }

    public String getDirectors() {
        return directors == null ? "" : getValues(directors);
    }

    public List<BtboDown> getBtboDownlist() {
        return btboDownlist == null ? Collections.emptyList() : btboDownlist;
    }

    public Vod vod() {
        return new Vod(getJumpId(), getTitle(), getThumbnail(), getMask());
    }

    public String getPlayUrl() {
        StringBuilder sb = new StringBuilder();
        for (BtboDown value : getBtboDownlist()) sb.append(value.getVal()).append("#");
        return Utils.substring(sb.toString());
    }

    public String getValues(List<Value> items) {
        StringBuilder sb = new StringBuilder();
        for (Value value : items) sb.append(value.getLink()).append(" ");
        return Utils.substring(sb.toString());
    }

    public static class Value {

        @SerializedName(value = "title", alternate = "name")
        private String title;

        public String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        public String getLink() {
            return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", getTitle() + "/{pg}", getTitle(), getTitle());
        }
    }

    public static class BtboDown {

        @SerializedName("val")
        private String val;

        public String getVal() {
            return TextUtils.isEmpty(val) ? "" : val.replaceAll("ftp", "tvbox-xg:ftp");
        }
    }
}
