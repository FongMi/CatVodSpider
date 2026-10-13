package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Web {

    @SerializedName("url")
    private String url;
    @SerializedName("mode")
    private String mode;
    @SerializedName("cookie")
    private List<Cookie> cookie;

    private Web() {
    }

    public static Web create() {
        return new Web();
    }

    public Web url(String url) {
        this.url = url;
        return this;
    }

    public Web mode(String mode) {
        this.mode = mode;
        return this;
    }

    public Web cookie(List<Cookie> cookie) {
        this.cookie = cookie;
        return this;
    }

    public static class Cookie {

        @SerializedName("url")
        private String url;
        @SerializedName("keys")
        private List<String> keys;

        private Cookie() {
        }

        public static Cookie create() {
            return new Cookie();
        }

        public Cookie url(String url) {
            this.url = url;
            return this;
        }

        public Cookie keys(List<String> keys) {
            this.keys = keys;
            return this;
        }
    }
}
