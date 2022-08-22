package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Vod {

    @SerializedName("vod_id")
    private String vodId;
    @SerializedName("vod_name")
    private String vodName;
    @SerializedName("vod_pic")
    private String vodPic;
    @SerializedName("vod_remarks")
    private String vodRemarks;

    public Vod(String vodId, String vodName, String vodPic, String vodRemarks) {
        this.vodId = vodId;
        this.vodName = vodName;
        this.vodPic = vodPic;
        this.vodRemarks = vodRemarks;
    }
}
