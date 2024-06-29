package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Filter {

    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("init")
    private String init;
    @SerializedName("value")
    private List<Value> value;

    public Filter(String key, String name, List<Value> value) {
        this.key = key;
        this.name = name;
        this.value = value;
    }

    public static class Value {

        @SerializedName("n")
        private String n;
        @SerializedName("v")
        private String v;

        public Value(String value) {
            this.n = value;
            this.v = value;
        }

        public Value(String n, String v) {
            this.n = n;
            this.v = v;
        }
    }
}
