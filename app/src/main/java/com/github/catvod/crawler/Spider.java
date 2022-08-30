package com.github.catvod.crawler;

import android.content.Context;

import org.json.JSONException;

import java.util.HashMap;
import java.util.List;

public abstract class Spider {

    public void init(Context context) {
    }

    public void init(Context context, String extend) {
        init(context);
    }

    public String homeContent(boolean filter) throws JSONException {
        return "";
    }

    public String homeVideoContent() throws JSONException {
        return "";
    }

    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws JSONException {
        return "";
    }

    public String detailContent(List<String> ids) throws JSONException {
        return "";
    }

    public String searchContent(String key, boolean quick) throws JSONException {
        return "";
    }

    public String playerContent(String flag, String id, List<String> vipFlags) throws JSONException {
        return "";
    }
}
