package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

public class Cate {

    @SerializedName("land")
    private Integer land;
    @SerializedName("circle")
    private Integer circle;
    @SerializedName("ratio")
    private Float ratio;

    private Cate() {
    }

    public static Cate create() {
        return new Cate();
    }

    public Cate land(int land) {
        this.land = land;
        return this;
    }

    public Cate circle(int circle) {
        this.circle = circle;
        return this;
    }

    public Cate ratio(float ratio) {
        this.ratio = ratio;
        return this;
    }
}
