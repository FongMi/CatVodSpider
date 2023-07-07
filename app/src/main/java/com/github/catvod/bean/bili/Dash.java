package com.github.catvod.bean.bili;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Dash {

    @SerializedName("duration")
    private String duration;
    @SerializedName("minBufferTime")
    private String minBufferTime;
    @SerializedName("video")
    private List<Media> video;
    @SerializedName("audio")
    private List<Media> audio;

    public static Dash objectFrom(String str) {
        return new Gson().fromJson(str, Dash.class);
    }

    public String getDuration() {
        return duration == null ? "0" : duration;
    }

    public String getMinBufferTime() {
        return minBufferTime == null ? "0" : minBufferTime;
    }

    public List<Media> getVideo() {
        return video == null ? Collections.emptyList() : video;
    }

    public List<Media> getAudio() {
        return audio == null ? Collections.emptyList() : audio;
    }
}
