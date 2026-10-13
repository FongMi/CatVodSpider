package com.github.catvod.bean;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class Vod {

    @SerializedName("vod_id")
    private String vodId;
    @SerializedName("vod_name")
    private String vodName;
    @SerializedName("type_name")
    private String typeName;
    @SerializedName("vod_pic")
    private String vodPic;
    @SerializedName("vod_remarks")
    private String vodRemarks;
    @SerializedName("vod_year")
    private String vodYear;
    @SerializedName("vod_area")
    private String vodArea;
    @SerializedName("vod_director")
    private String vodDirector;
    @SerializedName("vod_actor")
    private String vodActor;
    @SerializedName("vod_content")
    private String vodContent;
    @SerializedName("vod_play_from")
    private String vodPlayFrom;
    @SerializedName("vod_play_url")
    private String vodPlayUrl;
    @SerializedName("vod_tag")
    private String vodTag;
    @SerializedName("action")
    private String action;
    @SerializedName("cate")
    private JsonObject cate;
    @SerializedName("style")
    private Style style;
    @SerializedName("land")
    private Integer land;
    @SerializedName("circle")
    private Integer circle;
    @SerializedName("ratio")
    private Float ratio;

    public Vod() {
    }

    public Vod(String vodId, String vodName, String vodPic) {
        this.vodId = vodId;
        this.vodName = vodName;
        this.vodPic = vodPic;
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks) {
        this(vodId, vodName, vodPic);
        this.vodRemarks = vodRemarks;
    }

    public Vod setId(String vodId) {
        this.vodId = vodId;
        return this;
    }

    public Vod setName(String vodName) {
        this.vodName = vodName;
        return this;
    }

    public Vod setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public Vod setPic(String vodPic) {
        this.vodPic = vodPic;
        return this;
    }

    public Vod setRemarks(String vodRemarks) {
        this.vodRemarks = vodRemarks;
        return this;
    }

    public Vod setYear(String vodYear) {
        this.vodYear = vodYear;
        return this;
    }

    public Vod setArea(String vodArea) {
        this.vodArea = vodArea;
        return this;
    }

    public Vod setDirector(String vodDirector) {
        this.vodDirector = vodDirector;
        return this;
    }

    public Vod setActor(String vodActor) {
        this.vodActor = vodActor;
        return this;
    }

    public Vod setContent(String vodContent) {
        this.vodContent = vodContent;
        return this;
    }

    public Vod setPlayFrom(String vodPlayFrom) {
        this.vodPlayFrom = vodPlayFrom;
        return this;
    }

    public Vod setPlayUrl(String vodPlayUrl) {
        this.vodPlayUrl = vodPlayUrl;
        return this;
    }

    public Vod setTag(String vodTag) {
        this.vodTag = vodTag;
        return this;
    }

    public Vod setAction(String action) {
        this.action = action;
        return this;
    }

    public Vod setCate(JsonObject cate) {
        this.cate = cate;
        return this;
    }

    public Vod setStyle(Style style) {
        this.style = style;
        return this;
    }

    public Vod setLand(int land) {
        this.land = land;
        return this;
    }

    public Vod setCircle(int circle) {
        this.circle = circle;
        return this;
    }

    public Vod setRatio(float ratio) {
        this.ratio = ratio;
        return this;
    }
}
