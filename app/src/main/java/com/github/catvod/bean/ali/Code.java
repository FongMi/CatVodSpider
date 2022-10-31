package com.github.catvod.bean.ali;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Code {

    @SerializedName("data")
    private Data data;
    @SerializedName("pds_login_result")
    private Data result;

    public static Code objectFrom(String str) {
        try {
            return new Gson().fromJson(str, Code.class);
        } catch (Exception e) {
            return new Code();
        }
    }

    public Data getData() {
        return data == null ? new Data() : data;
    }

    public Data getResult() {
        return result == null ? new Data() : result;
    }

    public boolean hasToken() {
        return getResult().getRefreshToken().length() > 0;
    }

    public static class Data {

        @SerializedName("t")
        private String t;
        @SerializedName("ck")
        private String ck;
        @SerializedName("codeContent")
        private String codeContent;
        @SerializedName("refreshToken")
        private String refreshToken;

        public String getT() {
            return t;
        }

        public String getCk() {
            return ck;
        }

        public String getCodeContent() {
            return codeContent == null ? "" : codeContent;
        }

        public String getRefreshToken() {
            return refreshToken == null ? "" : refreshToken;
        }
    }
}
