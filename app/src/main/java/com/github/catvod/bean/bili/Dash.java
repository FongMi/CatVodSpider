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

    public static class Media {

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
        private SegmentBase segmentBase;
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

        public SegmentBase getSegmentBase() {
            return segmentBase;
        }

        public String getCodecId() {
            return codecid;
        }
    }

    public static class SegmentBase {

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
}
