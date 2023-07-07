package com.github.catvod.bean.bili;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.jsoup.Jsoup;

import java.lang.reflect.Type;
import java.util.List;

public class Resp {

    @SerializedName("code")
    private Integer code;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Data data;

    public static Resp objectFrom(String str) {
        return new Gson().fromJson(str, Resp.class);
    }

    public Data getData() {
        return data == null ? new Data() : data;
    }

    public static class Result {

        @SerializedName("bvid")
        private String bvid;
        @SerializedName("title")
        private String title;
        @SerializedName("pic")
        private String pic;
        @SerializedName("duration")
        private String duration;

        public static List<Result> arrayFrom(JsonElement str) {
            Type listType = new TypeToken<List<Result>>() {}.getType();
            return new Gson().fromJson(str, listType);
        }

        public String getBvId() {
            return TextUtils.isEmpty(bvid) ? "" : bvid;
        }

        public String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        public String getDuration() {
            return TextUtils.isEmpty(duration) ? "" : duration;
        }

        public String getPic() {
            return TextUtils.isEmpty(pic) ? "" : pic;
        }

        public Vod getVod() {
            Vod vod = new Vod();
            vod.setVodId(getBvId());
            vod.setVodName(Jsoup.parse(getTitle()).text());
            vod.setVodRemarks(getDuration().split(":")[0] + "分鐘");
            vod.setVodPic(getPic().startsWith("//") ? "https:" + getPic() : getPic());
            return vod;
        }
    }
}
