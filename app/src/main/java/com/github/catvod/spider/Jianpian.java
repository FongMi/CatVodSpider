package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.jianpian.Data;
import com.github.catvod.bean.jianpian.Detail;
import com.github.catvod.bean.jianpian.Resp;
import com.github.catvod.bean.jianpian.Search;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.google.gson.JsonParser;

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

    private final String siteUrl = "http://api.ubj83.com";
    private String extend;

    private Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("user-agent", "Mozilla/5.0 (Linux; Android 11; Redmi K30 Pro Zoom Edition Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/90.0.4430.210 Mobile Safari/537.36;webank/h5face;webank/1.0;netType:NETWORK_WIFI;appVersion:416;packageName:com.jp3.xg3");
        headers.put("accept", "application/json, text/plain, */*");
        headers.put("x-requested-with", "com.jp3.xg3");
        return headers;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        this.extend = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("1", "2", "3", "4", "50", "99");
        List<String> typeNames = Arrays.asList("電影", "電視劇", "動漫", "綜藝", "紀錄片", "Netflix");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, JsonParser.parseString(OkHttp.string(extend)));
    }

    @Override
    public String homeVideoContent() {
        List<Vod> list = new ArrayList<>();
        String url = siteUrl + "/api/slide/list?pos_id=88";
        Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
        for (Data data : resp.getData()) list.add(data.homeVod());
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (tid.endsWith("/{pg}")) return searchContent(tid.split("/")[0], pg);
        if (tid.equals("50") || tid.equals("99") || tid.equals("111")) {
            List<Vod> list = new ArrayList<>();
            String url = siteUrl + String.format("/api/dyTag/list?category_id=%s&page=%s", tid, pg);
            Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
            for (Data data : resp.getData()) for (Data dataList : data.getDataList()) list.add(dataList.vod());
            return Result.get().page().vod(list).string();
        } else {
            List<Vod> list = new ArrayList<>();
            HashMap<String, String> ext = new HashMap<>();
            if (extend != null && !extend.isEmpty()) ext.putAll(extend);
            String area = ext.get("area") == null ? "0" : ext.get("area");
            String year = ext.get("year") == null ? "0" : ext.get("year");
            String by = ext.get("by") == null ? "updata" : ext.get("by");
            String url = siteUrl + String.format("/api/crumb/list?fcate_pid=%s&area=%s&year=%s&type=0&sort=%s&page=%s&category_id=", tid, area, year, by, pg);
            Resp resp = Resp.objectFrom(OkHttp.string(url, getHeader()));
            for (Data data : resp.getData()) list.add(data.vod());
            return Result.string(list);
        }
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = siteUrl + "/api/video/detailv2?id=" + ids.get(0);
        Data data = Detail.objectFrom(OkHttp.string(url, getHeader())).getData();
        Vod vod = data.vod();
        vod.setVodPlayFrom(data.getVodFrom());
        vod.setVodYear(data.getYear());
        vod.setVodArea(data.getArea());
        vod.setTypeName(data.getTypes());
        vod.setVodActor(data.getActors());
        vod.setVodPlayUrl(data.getVodUrl());
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
        String url = siteUrl + String.format("/api/v2/search/videoV2?key=%s&category_id=88&page=%s&pageSize=20", URLEncoder.encode(key), pg);
        Search search = Search.objectFrom(OkHttp.string(url, getHeader()));
        for (Search data : search.getData()) list.add(data.vod());
        return Result.string(list);
    }
}