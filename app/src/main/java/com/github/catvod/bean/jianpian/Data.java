package com.github.catvod.bean.jianpian;

import android.text.TextUtils;

import com.github.catvod.bean.Vod;
import com.github.catvod.utils.Utils;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName(value = "jump_id", alternate = "id")
    private String vodId;
    @SerializedName(value = "thumbnail", alternate = "path")
    private String vodPic;
    @SerializedName(value = "title")
    private String vodName;
    @SerializedName(value = "mask")
    private String vodRemark;
    @SerializedName("description")
    private String description;
    @SerializedName(value = "playlist")
    private Value playlist;
    @SerializedName("year")
    private Value year;
    @SerializedName("area")
    private Value area;
    @SerializedName("types")
    private List<Value> types;
    @SerializedName("actors")
    private List<Value> actors;
    @SerializedName("directors")
    private List<Value> directors;
    @SerializedName("btbo_downlist")
    private List<BtboDown> btboDownlist;

    public String getVodId() {
        return TextUtils.isEmpty(vodId) ? "" : vodId;
    }

    public String getVodPic() {
        return TextUtils.isEmpty(vodPic) ? "" : vodPic + "@Referer=www.jianpianapp.com@User-Agent=jianpian-version362";
    }

    public String getVodName() {
        return TextUtils.isEmpty(vodName) ? "" : vodName;
    }

    public String getVodRemark() {
        return TextUtils.isEmpty(vodRemark) ? getPlaylist() : vodRemark;
    }

    public String getDescription() {
        return TextUtils.isEmpty(description) ? "" : description;
    }

    public String getPlaylist() {
        return playlist == null ? "" : playlist.getTitle();
    }

    public String getYear() {
        return year == null ? "" : year.getTitle();
    }

    public String getArea() {
        return area == null ? "" : area.getTitle();
    }

    public String getTypes() {
        if (types == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Value value : types) sb.append(value.getTitle()).append(" ");
        return Utils.substring(sb.toString());
    }

    public String getActors() {
        if (actors == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Value value : actors) sb.append(value.getLink()).append(" ");
        return Utils.substring(sb.toString());
    }

    public String getDirectors() {
        if (directors == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Value value : directors) sb.append(value.getLink()).append(" ");
        return Utils.substring(sb.toString());
    }

    public String getBtboDownlist() {
        if (btboDownlist == null) return "";
        StringBuilder sb = new StringBuilder();
        for (BtboDown value : btboDownlist) sb.append(value.getVal()).append("#");
        return Utils.substring(sb.toString());
    }

    public Vod vod() {
        return new Vod(getVodId(), getVodName(), getVodPic(), getVodRemark());
    }

    public static class Value {

        @SerializedName(value = "title", alternate = "name")
        private String title;

        public String getTitle() {
            return TextUtils.isEmpty(title) ? "" : title;
        }

        public String getLink() {
            return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}]%s[/a]", getTitle() + "/{pg}", getTitle(), getTitle());
        }
    }

    public static class BtboDown {

        @SerializedName("val")
        private String val;

        public String getVal() {
            return TextUtils.isEmpty(val) ? "" : val.replaceAll("ftp", "tvbox-xg:ftp");
        }
    }
}
