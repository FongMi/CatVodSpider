package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Util;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("jump_id")
    private String jumpId;
    @SerializedName("id")
    private String id;
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
    private String year;
    @SerializedName("area")
    private String area;
    @SerializedName("types")
    private List<Value> types;
    @SerializedName("actors")
    private List<Value> actors;
    @SerializedName("directors")
    private List<Value> directors;
    @SerializedName("source_list_source")
    private List<SourceListSource> source;
    @SerializedName("dataList")
    private List<Data> dataList;

    public String getJumpId() {
        return TextUtils.isEmpty(jumpId) ? "" : jumpId;
    }

    public String getId() {
        return TextUtils.isEmpty(id) ? "" : id;
    }

    public String getThumbnail(String imgDomain) {
        return TextUtils.isEmpty(thumbnail) ? "" : "http://" + imgDomain + thumbnail;
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
        return playlist == null ? "" : playlist.getTitle();
    }

    public String getYear() {
        return year == null ? "" : year;
    }

    public String getArea() {
        return area == null ? "" : area;
    }

    public String getTypes() {
        return types == null ? "" : getValues(types, false);
    }

    public String getActors() {
        return actors == null ? "" : getValues(actors, true);
    }

    public String getDirectors() {
        return directors == null ? "" : getValues(directors, true);
    }

    public List<SourceListSource> getSource() {
        return source == null ? Collections.emptyList() : source;
    }

    public List<Data> getDataList() {
        return dataList == null ? Collections.emptyList() : dataList;
    }

    public Vod homeVod(String imgDomain) {
        return new Vod(getJumpId(), getTitle(), getThumbnail(imgDomain));
    }

    public Vod vod(String imgDomain) {
        return new Vod(getId(), getTitle(), getThumbnail(imgDomain), getMask());
    }

    public String getValues(List<Value> items, boolean link) {
        StringBuilder sb = new StringBuilder();
        for (Value value : items) sb.append(value.getValue(link)).append(" ");
        return Util.substring(sb.toString());
    }

    public static class Value {

        @SerializedName(value = "title", alternate = "name")
        private String title;

        private String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        private String getLink() {
            return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", getTitle() + "/{pg}", getTitle(), getTitle());
        }

        public String getValue(boolean link) {
            return link ? getLink() : getTitle();
        }
    }

    public static class SourceListSource {

        @SerializedName("name")
        private String name;
        @SerializedName("source_list")
        private List<SourceList> list;

        public String getName() {
            return TextUtils.isEmpty(name) ? "" : name;
        }

        public List<SourceList> getList() {
            return list == null ? Collections.emptyList() : list;
        }
    }

    public static class SourceList {

        @SerializedName("source_name")
        private String name;
        @SerializedName("url")
        private String url;

        public String getName() {
            return TextUtils.isEmpty(name) ? "" : name;
        }

        public String getUrl() {
            return TextUtils.isEmpty(url) ? "" : url.replaceAll("ftp", "tvbox-xg:ftp");
        }
    }

    public String getVodFrom() {
        List<String> items = new ArrayList<>();
        for (SourceListSource source : getSource()) items.add(source.getName());
        return TextUtils.join("$$$", items);
    }

    public String getVodUrl() {
        List<String> items = new ArrayList<>();
        for (SourceListSource source : getSource()) {
            List<String> urls = new ArrayList<>();
            for (SourceList item : source.getList()) urls.add(item.getName() + "$" + item.getUrl());
            items.add(TextUtils.join("#", urls));
        }
        return TextUtils.join("$$$", items);
    }
}