package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.jianpian.Data;
import com.github.catvod.bean.jianpian.Detail;
import com.github.catvod.bean.jianpian.Resp;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Json;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Qile
 */
public class Jianpian extends Spider {

    private final String siteUrl = "http://api2.rinhome.com";
    private String extend;

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "jianpian-android/360");
        headers.put("JPAUTH", "y261ow7kF2dtzlxh1GS9EB8nbTxNmaK/QQIAjctlKiEv");
        return headers;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("0", "1", "2", "3", "4");
        List<String> typeNames = Arrays.asList("全部", "电影", "电视剧", "动漫", "综艺");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, Json.parse(OkHttp.string(extend)));
    }

    @Override
    public String homeVideoContent() {
        List<Vod> list = new ArrayList<>();
        String url = siteUrl + "/api/slide/list?code=unknown9039b6856c3a3306&pos_id=888&channel=wandoujia";
        Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
        for (Data data : resp.getData()) list.add(data.vod());
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (tid.endsWith("/{pg}")) return searchContent(tid.split("/")[0], pg);
        List<Vod> list = new ArrayList<>();
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) ext.putAll(extend);
        String cateId = ext.get("cateId") == null ? tid : ext.get("cateId");
        String area = ext.get("area") == null ? "0" : ext.get("area");
        String year = ext.get("year") == null ? "0" : ext.get("year");
        String by = ext.get("by") == null ? "hot" : ext.get("by");
        String url = siteUrl + String.format("/api/crumb/list?area=%s&category_id=%s&page=%s&type=0&limit=24&sort=%s&year=%s", area, cateId, pg, by, year);
        Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
        for (Data data : resp.getData()) list.add(data.vod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = siteUrl + "/api/node/detail?channel=wandoujia&token=&id=" + ids.get(0);
        Data data = Detail.objectFrom(OkHttp.string(url, getHeader())).getData();
        Vod vod = data.vod();
        vod.setVodPlayFrom("Jianpian");
        vod.setVodYear(data.getYear());
        vod.setVodArea(data.getArea());
        vod.setTypeName(data.getTypes());
        vod.setVodActor(data.getActors());
        vod.setVodPlayUrl(data.getPlayUrl());
        vod.setVodDirector(data.getDirectors());
        vod.setVodContent(data.getDescription());
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeader()).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, pg);
    }

    public String searchContent(String key, String pg) throws Exception {
        List<Vod> list = new ArrayList<>();
        String url = siteUrl + "/api/video/search?page=" + pg + "&key=" + URLEncoder.encode(key);
        Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
        for (Data data : resp.getData()) list.add(data.vod());
        return Result.string(list);
    }
}