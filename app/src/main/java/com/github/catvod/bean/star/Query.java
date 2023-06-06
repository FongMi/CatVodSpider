package com.github.catvod.bean.star;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("country")
    private String country;
    @SerializedName("label")
    private String label;
    @SerializedName("chName")
    private String chName;
    @SerializedName("startTime")
    private Integer startTime;
    @SerializedName("endTime")
    private Integer endTime;
    @SerializedName("pageSize")
    private Integer pageSize;
    @SerializedName("page")
    private Integer page;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    private int getStart(String year) {
        return 1900 + (year.contains("年代") ? Integer.parseInt(year.split("年代")[0]) : 70);
    }

    public void setYear(String year) {
        if (year.contains("更早") || year.contains("年代")) {
            int start = getStart(year);
            setStartTime(start);
            setEndTime(start + 9);
        } else if (year.contains("年")) {
            setStartTime(Integer.parseInt(year.replace("年", "")));
            setEndTime(Integer.parseInt(year.replace("年", "")));
        } else if (year.contains("-")) {
            setStartTime(Integer.parseInt(year.split("-")[1]));
            setEndTime(Integer.parseInt(year.split("-")[0]));
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
