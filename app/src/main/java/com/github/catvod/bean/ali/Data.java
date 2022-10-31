package com.github.catvod.bean.ali;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName(value = "data", alternate = "pds_login_result")
    private Data data;
    @SerializedName("t")
    private String t;
    @SerializedName("ck")
    private String ck;
    @SerializedName("codeContent")
    private String codeContent;
    @SerializedName("refreshToken")
    private String refreshToken;

    public static Data objectFrom(String str) {
        try {
            return new Gson().fromJson(str, Data.class);
        } catch (Exception e) {
            return new Data();
        }
    }

    public Data getData() {
        return data == null ? new Data() : data;
    }

    public boolean hasToken() {
        return getData().getRefreshToken().length() > 0;
    }

    public String getT() {
        return t == null ? "" : t;
    }

    public String getCk() {
        return ck == null ? "" : ck;
    }

    public String getCodeContent() {
        return codeContent == null ? "" : codeContent;
    }

    public String getRefreshToken() {
        return refreshToken == null ? "" : refreshToken;
    }
}
