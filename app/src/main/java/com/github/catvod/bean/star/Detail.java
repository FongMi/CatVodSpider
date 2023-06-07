package com.github.catvod.bean.star;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Detail {

    @SerializedName("id")
    private String id;
    @SerializedName("videos")
    private List<Video> videos;
    @SerializedName("actor")
    private String actor;
    @SerializedName("country")
    private String country;
    @SerializedName("desc")
    private String desc;
    @SerializedName("label")
    private String label;
    @SerializedName("director")
    private String director;
    @SerializedName("name")
    private String name;
    @SerializedName("picurl")
    private String picurl;
    @SerializedName("time")
    private String time;
    @SerializedName("countStr")
    private String countStr;

    public static Detail objectFrom(String str) {
        return new Gson().fromJson(str, Detail.class);
    }

    public String getId() {
        return id;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public String getActor() {
        return actor;
    }

    public String getCountry() {
        return country;
    }

    public String getDesc() {
        return desc;
    }

    public String getLabel() {
        return label;
    }

    public String getDirector() {
        return director;
    }

    public String getName() {
        return name;
    }

    public String getPicurl() {
        return picurl;
    }

    public String getTime() {
        return time;
    }

    public String getCountStr() {
        return countStr;
    }

    public static class Video {

        @SerializedName("eporder")
        private Integer eporder;
        @SerializedName("purl")
        private String purl;

        public Integer getEporder() {
            return eporder;
        }

        public String getPurl() {
            return purl;
        }
    }
}
