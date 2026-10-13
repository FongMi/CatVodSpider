package com.github.catvod.utils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Response {

    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().create();

    private final JsonObject data = new JsonObject();

    private Response() {
    }

    public static Response create() {
        return new Response().put("parse", 0).put("jx", 0);
    }

    public static String notify(String msg) {
        return create().put("msg", msg).string();
    }

    public static Response page(List<Vod> items, int page, int limit) {
        if (limit < 1) throw new IllegalArgumentException("Page limit must be positive");
        page = Math.max(1, page);
        int total = items.size();
        int start = (int) Math.min(total, (long) (page - 1) * limit);
        int end = (int) Math.min(total, (long) start + limit);
        int count = Math.max(1, (int) ((total + (long) limit - 1) / limit));
        return create().vods(items.subList(start, end)).page(page, count, limit, total);
    }

    public Response put(String name, Object value) {
        if (value == null) data.remove(name);
        else data.add(name, GSON.toJsonTree(value));
        return this;
    }

    public Response classes(List<Class> items) {
        return put("class", items);
    }

    public Response vod(Vod item) {
        return vods(Collections.singletonList(item));
    }

    public Response vods(List<Vod> items) {
        return put("list", items);
    }

    public Response filters(Map<String, List<Filter>> filters) {
        return put("filters", filters);
    }

    public Response url(String url) {
        return put("url", url);
    }

    public Response header(Map<String, String> header) {
        return put("header", header == null || header.isEmpty() ? null : GSON.toJson(header));
    }

    public Response subs(List<Sub> subs) {
        return put("subs", subs);
    }

    public Response parse() {
        return put("parse", 1);
    }

    public Response jx() {
        return put("jx", 1);
    }

    public Response page() {
        return put("page", 1).put("pagecount", 1);
    }

    public Response page(int page, int count, int limit, int total) {
        return put("page", Math.max(1, page)).put("pagecount", Math.max(1, count)).put("limit", limit).put("total", total);
    }

    public String string() {
        return GSON.toJson(data);
    }
}
