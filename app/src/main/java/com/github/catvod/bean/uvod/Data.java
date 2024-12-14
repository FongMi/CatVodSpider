package com.github.catvod.bean.uvod;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("video_fragment_list")
    private List<VideoFragmentList> videoFragmentList;
    @SerializedName(value = "video_latest_list", alternate = {"video_list"})
    private List<VideoLatest> videolatestlist;
    @SerializedName(value = "video", alternate = {"video_soruce"})
    private Video video;

    public static Data objectFrom(String str) {
        JsonObject jsonObject = JsonParser.parseString(str).getAsJsonObject();
        if (jsonObject.has("data")) return new Gson().fromJson(jsonObject.get("data"), Data.class);
        return new Data();
    }

    public List<VideoFragmentList> getVideoFragmentList() {
        return videoFragmentList == null ? Collections.emptyList() : videoFragmentList;
    }

    public List<VideoLatest> getVideoLatest() {
        return videolatestlist == null ? Collections.emptyList() : videolatestlist;
    }

    public Video getVideo() {
        return video == null ? new Video() : video;
    }

    public List<Vod> getList() {
        List<Vod> list = new ArrayList<>();
        for (Data.VideoLatest video : getVideoLatest()) list.add(video.vod());
        return list;
    }

    public static class VideoLatest {

        @SerializedName("id")
        private String id;
        @SerializedName("title")
        private String title;
        @SerializedName("pic")
        private String pic;
        @SerializedName("state")
        private String state;
        @SerializedName("last_fragment_symbol")
        private String lastfragment;
        @SerializedName("year")
        private String year;

        public String getId() {
            return TextUtils.isEmpty(id) ? "" : id;
        }

        public String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        public String getPic() {
            return TextUtils.isEmpty(pic) ? "" : pic;
        }

        public String getState() {
            return TextUtils.isEmpty(state) ? "" : state;
        }

        public String getLastFragment() {
            return TextUtils.isEmpty(lastfragment) ? "" : lastfragment;
        }

        public String getYear() {
            return TextUtils.isEmpty(year) ? "" : year;
        }

        public Vod vod() {
            return new Vod(getId(), getTitle(), getPic(), getState() + getLastFragment());
        }
    }

    public static class Video {

        @SerializedName("year")
        private String year;
        @SerializedName("region")
        private String region;
        @SerializedName("starring")
        private String starring;
        @SerializedName("state")
        private String state;
        @SerializedName("description")
        private String description;
        @SerializedName("director")
        private String director;
        @SerializedName("language")
        private String language;
        @SerializedName("url")
        private String url;

        public String getYear() {
            return TextUtils.isEmpty(year) ? "" : year;
        }

        public String getRegion() {
            return TextUtils.isEmpty(region) ? "" : region;
        }

        public String getStarring() {
            return TextUtils.isEmpty(starring) ? "" : starring;
        }

        public String getDescription() {
            return TextUtils.isEmpty(description) ? "" : description;
        }

        public String getState() {
            return TextUtils.isEmpty(state) ? "" : state;
        }

        public String getDirector() {
            return TextUtils.isEmpty(director) ? "" : director;
        }

        public String getLanguage() {
            return TextUtils.isEmpty(language) ? "" : language;
        }

        public String getUrl() {
            return TextUtils.isEmpty(url) ? "" : url;
        }
    }

    public static class VideoFragmentList {

        @SerializedName("id")
        private String id;
        @SerializedName("symbol")
        private String symbol;
        @SerializedName("qualities")
        private List<Integer> qualities;

        public String getId() {
            return TextUtils.isEmpty(id) ? "" : id;
        }

        public String getSymbol() {
            return TextUtils.isEmpty(symbol) ? "" : symbol;
        }

        public List<Integer> getQualities() {
            if (qualities == null || qualities.isEmpty()) return Collections.emptyList();
            Collections.sort(qualities, Collections.reverseOrder());
            return qualities;
        }

    }
}