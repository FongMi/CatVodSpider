package com.github.catvod.bean;

import com.github.catvod.utils.Trans;
import com.google.gson.annotations.SerializedName;

public class Vod {

    @SerializedName("type_name")
    private String typeName;
    @SerializedName("vod_id")
    private String vodId;
    @SerializedName("vod_name")
    private String vodName;
    @SerializedName("vod_pic")
    private String vodPic;
    @SerializedName("vod_remarks")
    private String vodRemarks;
    @SerializedName("vod_year")
    private String vodYear;
    @SerializedName("vod_area")
    private String vodArea;
    @SerializedName("vod_actor")
    private String vodActor;
    @SerializedName("vod_director")
    private String vodDirector;
    @SerializedName("vod_content")
    private String vodContent;
    @SerializedName("vod_play_from")
    private String vodPlayFrom;
    @SerializedName("vod_play_url")
    private String vodPlayUrl;
    @SerializedName("vod_tag")
    private String vodTag;

    public Vod() {
    }

    public Vod(String vodId, String vodName, String vodPic) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
    }

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks, String vodTag) {
        setVodId(vodId);
        setVodName(vodName);
        setVodPic(vodPic);
        setVodRemarks(vodRemarks);
        setVodTag(vodTag);
    }

    public void setTypeName(String typeName) {
        this.typeName = Trans.get(typeName);
    }

    public void setVodId(String vodId) {
        this.vodId = vodId;
    }

    public void setVodName(String vodName) {
        this.vodName = Trans.get(vodName);
    }

    public void setVodPic(String vodPic) {
        this.vodPic = vodPic;
    }

    public void setVodRemarks(String vodRemarks) {
        this.vodRemarks = Trans.get(vodRemarks);
    }

    public void setVodYear(String vodYear) {
        this.vodYear = Trans.get(vodYear);
    }

    public void setVodArea(String vodArea) {
        this.vodArea = Trans.get(vodArea);
    }

    public void setVodActor(String vodActor) {
        this.vodActor = Trans.get(vodActor);
    }

    public void setVodDirector(String vodDirector) {
        this.vodDirector = Trans.get(vodDirector);
    }

    public void setVodContent(String vodContent) {
        this.vodContent = Trans.get(vodContent);
    }

    public String getVodContent() {
        return vodContent;
    }

    public void setVodPlayFrom(String vodPlayFrom) {
        this.vodPlayFrom = Trans.get(vodPlayFrom);
    }

    public void setVodPlayUrl(String vodPlayUrl) {
        this.vodPlayUrl = vodPlayUrl;
    }

    public void setVodTag(String vodTag) {
        this.vodTag = vodTag;
    }
}
