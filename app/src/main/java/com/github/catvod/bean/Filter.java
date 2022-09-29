package com.github.catvod.bean;

import com.github.catvod.utils.Trans;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Filter {

    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;
    @SerializedName("value")
    private List<Value> value;

    public Filter(String key, String name, List<Value> value) {
        this.key = key;
        this.name = Trans.get(name);
        this.value = value;
    }

    public void trans() {
        name = Trans.get(name);
        for (Value item : value) item.n = Trans.get(item.n);
    }

    public static class Value {

        @SerializedName("n")
        private String n;
        @SerializedName("v")
        private String v;

        public Value(String value) {
            this.n = Trans.get(value);
            this.v = value;
        }

        public Value(String n, String v) {
            this.n = Trans.get(n);
            this.v = v;
        }
    }
}
