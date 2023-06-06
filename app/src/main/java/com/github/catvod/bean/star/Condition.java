package com.github.catvod.bean.star;

import com.github.catvod.bean.Filter;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Condition {

    @SerializedName("label")
    private List<List<String>> label;
    @SerializedName("country")
    private List<String> country;
    @SerializedName("time")
    private List<Integer> time;

    public static Condition objectFrom(String str) {
        return new Gson().fromJson(str, Condition.class);
    }

    public List<List<String>> getLabel() {
        return label == null ? Collections.emptyList() : label;
    }

    public List<String> getCountry() {
        return country == null ? Collections.emptyList() : country;
    }

    public List<Integer> getTime() {
        return time == null ? Collections.emptyList() : time;
    }

    public List<Filter> getFilter() {
        List<Filter> filters = new ArrayList<>();
        filters.add(new Filter("type", "類型", getTypeValues()));
        filters.add(new Filter("area", "地區", getAreaValues()));
        filters.add(new Filter("year", "年份", getYearValues()));
        return filters;
    }

    private List<Filter.Value> getTypeValues() {
        List<Filter.Value> values = new ArrayList<>();
        values.add(new Filter.Value("全部", ""));
        for (List<String> list : getLabel()) values.add(new Filter.Value(list.get(0)));
        return values;
    }

    private List<Filter.Value> getAreaValues() {
        List<Filter.Value> values = new ArrayList<>();
        values.add(new Filter.Value("全部", ""));
        for (String text : getCountry()) values.add(new Filter.Value(text));
        return values;
    }

    private List<Filter.Value> getYearValues() {
        List<Filter.Value> values = new ArrayList<>();
        values.add(new Filter.Value("全部", ""));
        Collections.sort(getTime(), Collections.reverseOrder());
        for (Integer year : getTime()) if (year >= 2010) values.add(new Filter.Value(String.valueOf(year)));
        return values;
    }
}
