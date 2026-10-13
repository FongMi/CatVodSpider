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

    public Class(String typeId, String typeName) {
        this(typeId, typeName, null);
    }

    public Class(String typeId, String typeName, String typeFlag) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeFlag = typeFlag;
    }

    public String getTypeId() {
        return typeId == null ? "" : typeId;
    }

    public Class setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public Class setLand(int land) {
        this.land = land;
        return this;
    }

    public Class setCircle(int circle) {
        this.circle = circle;
        return this;
    }

    public Class setRatio(float ratio) {
        this.ratio = ratio;
        return this;
    }
}
