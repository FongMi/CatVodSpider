package com.github.catvod.bean.bili;

import com.google.gson.annotations.SerializedName;

public class Segment {

    @SerializedName("Initialization")
    private String initialization;
    @SerializedName("indexRange")
    private String indexRange;

    public String getInitialization() {
        return initialization;
    }

    public String getIndexRange() {
        return indexRange;
    }
}
