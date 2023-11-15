package com.fongmi.tools.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Data {

	@SerializedName("name")
	private String name;
	@SerializedName("epg")
	private String epg;
	@SerializedName("logo")
	private String logo;

	public static List<Data> arrayFrom(String str) {
		Type listType = new TypeToken<ArrayList<Data>>() {}.getType();
		return new Gson().fromJson(str, listType);
	}

	public String getName() {
		return name;
	}

	public String getEpg() {
		return epg;
	}

	public String getLogo() {
		return logo;
	}
}
