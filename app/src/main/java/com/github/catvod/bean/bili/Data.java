package com.github.catvod.bean.bili;

import android.text.TextUtils;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Data {

    @SerializedName("result")
    private JsonElement result;
    @SerializedName("isLogin")
    private Boolean isLogin;
    @SerializedName("vipType")
    private Integer vipType;
    @SerializedName("qrcode_key")
    private String qrcodeKey;
    @SerializedName("url")
    private String url;
    @SerializedName("aid")
    private String aid;
    @SerializedName("cid")
    private String cid;
    @SerializedName("title")
    private String title;
    @SerializedName("tname")
    private String tname;
    @SerializedName("pic")
    private String pic;
    @SerializedName("duration")
    private Long duration;
    @SerializedName("desc")
    private String desc;
    @SerializedName("accept_description")
    private List<String> acceptDescription;
    @SerializedName("accept_quality")
    private List<Integer> acceptQuality;
    @SerializedName("pages")
    private List<Page> pages;
    @SerializedName("dash")
    private Dash dash;

    public JsonElement getResult() {
        return result;
    }

    public boolean isLogin() {
        return isLogin != null && isLogin;
    }

    public int getVipType() {
        return vipType == null ? 0 : vipType;
    }

    public String getQrcodeKey() {
        return TextUtils.isEmpty(qrcodeKey) ? "" : qrcodeKey;
    }

    public String getUrl() {
        return TextUtils.isEmpty(url) ? "" : url;
    }

    public String getAid() {
        return TextUtils.isEmpty(aid) ? "" : aid;
    }

    public String getCid() {
        return TextUtils.isEmpty(cid) ? "" : cid;
    }

    public String getTitle() {
        return TextUtils.isEmpty(title) ? "" : title;
    }

    public String getType() {
        return TextUtils.isEmpty(tname) ? "" : tname;
    }

    public String getPic() {
        return TextUtils.isEmpty(pic) ? "" : pic;
    }

    public Long getDuration() {
        return duration == null ? 0 : duration;
    }

    public String getDesc() {
        return TextUtils.isEmpty(desc) ? "" : desc;
    }

    public List<String> getAcceptDescription() {
        return acceptDescription == null ? Collections.emptyList() : acceptDescription;
    }

    public List<Integer> getAcceptQuality() {
        return acceptQuality == null ? Collections.emptyList() : acceptQuality;
    }

    public List<Page> getPages() {
        return pages == null ? Collections.emptyList() : pages;
    }

    public Dash getDash() {
        return dash == null ? new Dash() : dash;
    }
}
