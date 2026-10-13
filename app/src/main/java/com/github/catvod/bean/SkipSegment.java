package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class SkipSegment {

    @SerializedName("type")
    private String type;
    @SerializedName("start")
    private Long start;
    @SerializedName("end")
    private Long end;

    private SkipSegment() {
    }

    public static SkipSegment create() {
        return new SkipSegment();
    }

    public SkipSegment type(String type) {
        this.type = type;
        return this;
    }

    public SkipSegment start(long start) {
        this.start = start;
        return this;
    }

    public SkipSegment end(long end) {
        this.end = end;
        return this;
    }
}
