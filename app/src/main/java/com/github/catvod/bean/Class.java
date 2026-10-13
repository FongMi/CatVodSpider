package com.github.catvod.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Class {

    @SerializedName("type_id")
    private String typeId;
    @SerializedName("type_name")
    private String typeName;
    @SerializedName("type_flag")
    private String typeFlag;
    @SerializedName("filters")
    private List<Filter> filters;
    @SerializedName("land")
    private Integer land;
    @SerializedName("circle")
    private Integer circle;
    @SerializedName("ratio")
    private Float ratio;

    private Class() {
    }

    public static Class create() {
        return new Class();
    }

    public Class id(String typeId) {
        this.typeId = typeId;
        return this;
    }

    public Class name(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public Class flag(String typeFlag) {
        this.typeFlag = typeFlag;
        return this;
    }

    public String getTypeId() {
        return typeId == null ? "" : typeId;
    }

    public Class filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Class land(int land) {
        this.land = land;
        return this;
    }

    public Class circle(int circle) {
        this.circle = circle;
        return this;
    }

    public Class ratio(float ratio) {
        this.ratio = ratio;
        return this;
    }
}
