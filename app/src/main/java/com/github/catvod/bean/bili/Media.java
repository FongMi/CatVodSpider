package com.github.catvod.bean.bili;

import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("id")
    private String id;
    @SerializedName("baseUrl")
    private String baseUrl;
    @SerializedName("bandwidth")
    private String bandwidth;
    @SerializedName("mimeType")
    private String mimeType;
    @SerializedName("codecs")
    private String codecs;
    @SerializedName("width")
    private String width;
    @SerializedName("height")
    private String height;
    @SerializedName("frameRate")
    private String frameRate;
    @SerializedName("sar")
    private String sar;
    @SerializedName("startWithSap")
    private String startWithSap;
    @SerializedName("SegmentBase")
    private Segment segmentBase;
    @SerializedName("codecid")
    private String codecid;

    public String getId() {
        return id;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBandWidth() {
        return bandwidth;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getCodecs() {
        return codecs;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public String getSar() {
        return sar;
    }

    public String getStartWithSap() {
        return startWithSap;
    }

    public Segment getSegmentBase() {
        return segmentBase;
    }

    public String getCodecId() {
        return codecid;
    }
}
