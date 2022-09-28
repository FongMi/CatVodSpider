package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.alist.Item;
import com.github.catvod.bean.alist.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AList extends Spider {

    private LinkedHashMap<String, String> ext;
    private Map<String, List<String>> sub;
    private Map<String, String> map;

    private boolean isJson(String json) {
        try {
            JsonParser.parseString(json);
            return true;
        } catch (JsonSyntaxException e) {
            return false;
        }
    }

    private void parseJson(String extend) throws Exception {
        JSONObject object = new JSONObject(extend);
        JSONArray array = object.names();
        for (int i = 0; i < array.length(); i++) {
            String key = array.getString(i);
            ext.put(key, object.getString(key));
        }
    }

    private void parseText(String extend) {
        String[] array = extend.split("#");
        for (String text : array) {
            String[] arr = text.split("\\$");
            if (arr.length == 2) ext.put(arr[0], arr[1]);
        }
    }

    private String getVersion(String name) {
        if (!map.containsKey(name)) map.put(name, OkHttpUtil.string(ext.get(name) + "/api/public/settings").contains("v3.") ? "3" : "2");
        return map.get(name);
    }

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(new Filter("type", "排序類型", Arrays.asList(new Filter.Value("名稱", "name"), new Filter.Value("大小", "size"), new Filter.Value("修改時間", "date"))));
        items.add(new Filter("order", "排序方式", Arrays.asList(new Filter.Value("⬆", "asc"), new Filter.Value("⬇", "desc"))));
        return items;
    }

    @Override
    public void init(Context context, String extend) {
        try {
            sub = new HashMap<>();
            map = new HashMap<>();
            ext = new LinkedHashMap<>();
            if (extend.startsWith("http")) extend = OkHttpUtil.string(extend);
            if (isJson(extend)) parseJson(extend);
            else parseText(extend);
        } catch (Exception ignored) {
        }
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (String entry : ext.keySet()) classes.add(new Class(entry, entry, "1"));
        for (Class item : classes) filters.put(item.getTypeId(), getFilter());
        return Result.string(classes, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String type = extend.containsKey("type") ? extend.get("type") : "name";
        String order = extend.containsKey("order") ? extend.get("order") : "asc";
        List<Item> folders = new ArrayList<>();
        List<Item> files = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        sub.clear();
        for (Item item : getList(tid)) {
            if (item.ignore()) continue;
            if (item.isSub()) addSub(tid, item);
            else if (item.isFolder()) folders.add(item);
            else files.add(item);
        }
        Sorter.sort(type, order, folders);
        Sorter.sort(type, order, files);
        for (Item item : folders) list.add(item.getVod(tid));
        for (Item item : files) list.add(item.getVod(tid));
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) {
        String tid = ids.get(0);
        Item item = getDetail(tid);
        Vod vod = new Vod();
        vod.setVodId(item.getVodId(tid));
        vod.setVodName(item.getName());
        vod.setVodPic(item.getPic());
        vod.setVodTag(item.getVodTag());
        vod.setVodPlayFrom("播放");
        vod.setVodPlayUrl(item.getName() + "$" + item.getUrl() + findSubs(item.getName()));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String[] ids = id.split("\\+");
        return Result.get().url(ids[0]).sub(getSub(ids)).string();
    }

    private List<Item> getList(String tid) {
        try {
            String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
            String path = tid.contains("/") ? tid.substring(tid.indexOf("/") + 1) : "";
            boolean v3 = getVersion(key).equals("3");
            String url = ext.get(key) + (v3 ? "/api/fs/list" : "/api/public/path");
            JSONObject params = new JSONObject();
            params.put("path", path);
            String response = OkHttpUtil.postJson(url, params.toString());
            String json = new JSONObject(response).getJSONObject("data").getJSONArray(v3 ? "content" : "files").toString();
            return Item.arrayFrom(json);
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    private Item getDetail(String tid) {
        try {
            String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
            String path = tid.contains("/") ? tid.substring(tid.indexOf("/") + 1) : "";
            boolean v3 = getVersion(key).equals("3");
            String url = ext.get(key) + (v3 ? "/api/fs/get" : "/api/public/path");
            JSONObject params = new JSONObject();
            params.put("path", path);
            String response = OkHttpUtil.postJson(url, params.toString());
            String json = v3 ? new JSONObject(response).getJSONObject("data").toString() : new JSONObject(response).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString();
            return Item.objectFrom(json);
        } catch (Exception e) {
            return new Item();
        }
    }

    private void addSub(String tid, Item item) {
        String name = item.getName().substring(0, item.getName().lastIndexOf("."));
        if (!sub.containsKey(name)) sub.put(name, new ArrayList<>());
        Objects.requireNonNull(sub.get(name)).add(item.getName() + "@" + item.getVodId(tid) + "@" + item.getExt());
    }

    private String findSubs(String name) {
        name = name.substring(0, name.lastIndexOf("."));
        List<String> subs = sub.get(name);
        if (subs != null && subs.size() > 0) return combineSubs(subs);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : sub.entrySet()) sb.append(combineSubs(entry.getValue()));
        return sb.toString();
    }

    private String combineSubs(List<String> subs) {
        StringBuilder sb = new StringBuilder();
        for (String sub : subs) sb.append("+").append(sub);
        return sb.toString();
    }

    private String getSub(String[] ids) {
        StringBuilder sb = new StringBuilder();
        for (String text : ids) {
            if (!text.contains("@")) continue;
            String[] arr = text.split("@");
            String url = getDetail(arr[1]).getUrl();
            if (TextUtils.isEmpty(url)) continue;
            sb.append(arr[0]).append("#").append(Misc.getSubMimeType(arr[2])).append("#").append(url).append("$$$");
        }
        return Misc.substring(sb.toString(), 3);
    }
}