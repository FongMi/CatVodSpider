package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Util;
import com.google.gson.annotations.SerializedName;

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
    private List<SourceListSource> source_list_source;
    @SerializedName("dataList")
    private List<DataList> dataList;

    public String getJumpId() {
        return TextUtils.isEmpty(jumpId) ? "" : jumpId;
    }

    public String getId() {
        return TextUtils.isEmpty(id) ? "" : id;
    }

    public String getThumbnail() {
        return TextUtils.isEmpty(thumbnail) ? "" : "http://img1.vbwus.com" + thumbnail;
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

    public List<SourceListSource> getSourcelistsource() {
        return source_list_source == null ? Collections.emptyList() : source_list_source;
    }

    public List<DataList> getDataList() {
        return dataList == null ? Collections.emptyList() : dataList;
    }

    public Vod homeVod() {
        return new Vod(getJumpId(), getTitle(), getThumbnail());
    }

    public Vod vod() {
        return new Vod(getId(), getTitle(), getThumbnail(), getMask());
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
        private List<SourceList> source_list;

        public String getName() {
            return TextUtils.isEmpty(name) ? "" : name;
        }

        public List<SourceList> getSourcelist() {
            return source_list == null ? Collections.emptyList() : source_list;
        }
    }

    public static class SourceList {
        @SerializedName("source_name")
        private String source_name;
        @SerializedName("url")
        private String url;

        public String getSource_name() {
            return TextUtils.isEmpty(source_name) ? "" : source_name;
        }

        public String getUrl() {
            return TextUtils.isEmpty(url) ? "" : url.replaceAll("ftp", "tvbox-xg:ftp");
        }
    }

    public String getVodFrom() {
        StringBuilder result = new StringBuilder();
        List<SourceListSource> sources = getSourcelistsource();

        if (sources != null && !sources.isEmpty()) {
            for (int i = 0; i < sources.size(); i++) {
                if (i > 0) {
                    result.append("$$$");
                }
                result.append(sources.get(i).getName());
            }
        }
        return result.toString();
    }

    public String getVodUrl() {
        StringBuilder result = new StringBuilder();
        List<SourceListSource> sources = getSourcelistsource();

        if (sources != null && !sources.isEmpty()) {
            for (SourceListSource source : sources) {
                List<SourceList> sourceLists = source.getSourcelist();
                if (sourceLists != null && !sourceLists.isEmpty()) {
                    for (SourceList item : sourceLists) {
                        result.append(item.getSource_name())
                                .append("$")
                                .append(item.getUrl())
                                .append("#");
                    }
                    if (result.length() > 0) {
                        result.deleteCharAt(result.length() - 1);
                    }
                    result.append("$$$");
                }
            }
            if (result.length() >= 3) {
                result.delete(result.length() - 3, result.length());
            }
        }
        return result.toString();
    }

    public static class DataList {

        @SerializedName("id")
        private String id;
        @SerializedName(value = "thumbnail", alternate = "path")
        private String thumbnail;
        @SerializedName("title")
        private String title;
        @SerializedName("mask")
        private String mask;

        public String getId() {
            return TextUtils.isEmpty(id) ? "" : id;
        }

        public String getThumbnail() {
            return TextUtils.isEmpty(thumbnail) ? "" : "http://img1.vbwus.com" + thumbnail;
        }

        public String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        public String getMask() {
            return TextUtils.isEmpty(mask) ? "" : mask;
        }

        public Vod vod() {
            return new Vod(getId(), getTitle(), getThumbnail(), getMask());
        }
    }
}