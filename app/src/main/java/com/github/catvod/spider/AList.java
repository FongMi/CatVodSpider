package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.alist.Item;
import com.github.catvod.bean.alist.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.Trans;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AList extends Spider {

    private LinkedHashMap<String, String> ext;
    private Map<String, String> map;
    private String extend;

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
        ext = new LinkedHashMap<>();
        for (int i = 0; i < array.length(); i++) {
            String key = array.getString(i);
            ext.put(key, object.getString(key));
        }
    }

    private void parseText(String extend) {
        String[] array = extend.split("#");
        ext = new LinkedHashMap<>();
        for (String text : array) {
            String[] arr = text.split("\\$");
            if (arr.length == 2) ext.put(arr[0], arr[1]);
        }
    }

    private boolean v3(String key) {
        if (!map.containsKey(key)) map.put(key, OkHttpUtil.string(ext.get(key) + "/api/public/settings").contains("v3.") ? "3" : "2");
        return Objects.equals(map.get(key), "3");
    }

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(new Filter("type", "排序類型", Arrays.asList(new Filter.Value("名稱", "name"), new Filter.Value("大小", "size"), new Filter.Value("修改時間", "date"))));
        items.add(new Filter("order", "排序方式", Arrays.asList(new Filter.Value("⬆", "asc"), new Filter.Value("⬇", "desc"))));
        return items;
    }

    private void fetchRule() throws Exception {
        if (ext != null && !ext.isEmpty()) return;
        if (extend.startsWith("http")) extend = OkHttpUtil.string(extend);
        if (isJson(extend)) parseJson(extend);
        else parseText(extend);
    }

    @Override
    public void init(Context context, String extend) {
        try {
            this.map = new HashMap<>();
            this.extend = extend;
            fetchRule();
        } catch (Exception ignored) {
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        fetchRule();
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (String key : ext.keySet()) classes.add(new Class(key, key, "1"));
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
        for (Item item : getList(tid, true)) {
            if (item.isFolder()) folders.add(item);
            else files.add(item);
        }
        Sorter.sort(type, order, folders);
        Sorter.sort(type, order, files);
        for (Item item : folders) list.add(item.getVod(tid));
        for (Item item : files) list.add(item.getVod(tid));
        return Result.get().vod(list).pageSetup(1, 1, 0, 1).string();
    }

    @Override
    public String detailContent(List<String> ids) {
        String id = ids.get(0);
        Item item = getDetail(id);
        String path = id.substring(0, id.lastIndexOf("/"));
        List<Item> parents = getList(path, false);
        Vod vod = new Vod();
        vod.setVodId(item.getVodId(id));
        vod.setVodName(item.getName());
        vod.setVodPic(item.getPic());
        vod.setVodTag(item.getVodTag());
        vod.setVodPlayFrom("播放");
        vod.setVodPlayUrl(Trans.get(item.getName()) + "$" + item.getUrl() + findSubs(path, parents));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String keyword, boolean quick) throws Exception {
        List<Vod> list = new ArrayList<>();
        JSONObject params = new JSONObject();
        params.put("path", "/");
        params.put("keyword", keyword);
        for (String key : ext.keySet()) list.addAll(getList(params.toString(), key));
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String[] ids = id.split("\\+");
        return Result.get().url(ids[0]).sub(getSub(ids)).string();
    }

    private List<Vod> getList(String param, String key) {
        try {
            if (v3(key)) return Collections.emptyList();
            List<Vod> list = new ArrayList<>();
            String url = ext.get(key) + "/api/public/search";
            String response = OkHttpUtil.postJson(url, param);
            String json = new JSONObject(response).getJSONArray("data").toString();
            List<Item> items = Item.arrayFrom(json);
            for (Item item : items) if (!item.isFolder() && !item.ignore(false)) list.add(item.getVod(key));
            return list;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    private List<Item> getList(String id, boolean filter) {
        try {
            String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
            String path = id.contains("/") ? id.substring(id.indexOf("/") + 1) : "";
            String url = ext.get(key) + (v3(key) ? "/api/fs/list" : "/api/public/path");
            JSONObject params = new JSONObject();
            params.put("path", path);
            String response = OkHttpUtil.postJson(url, params.toString());
            String json = new JSONObject(response).getJSONObject("data").getJSONArray(v3(key) ? "content" : "files").toString();
            List<Item> items = Item.arrayFrom(json);
            Iterator<Item> iterator = items.iterator();
            if (filter) while (iterator.hasNext()) if (iterator.next().ignore(v3(key))) iterator.remove();
            return items;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    private Item getDetail(String id) {
        try {
            String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
            String path = id.contains("/") ? id.substring(id.indexOf("/") + 1) : "";
            String url = ext.get(key) + (v3(key) ? "/api/fs/get" : "/api/public/path");
            JSONObject params = new JSONObject();
            params.put("path", path);
            String response = OkHttpUtil.postJson(url, params.toString());
            String json = v3(key) ? new JSONObject(response).getJSONObject("data").toString() : new JSONObject(response).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString();
            return Item.objectFrom(json);
        } catch (Exception e) {
            return new Item();
        }
    }

    private String findSubs(String path, List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) if (Misc.isSub(item.getExt())) sb.append("+").append(Trans.get(item.getName())).append("@").append(Misc.getSubMimeType(item.getExt())).append("@").append(item.getVodId(path));
        return sb.toString();
    }

    private String getSub(String[] ids) {
        StringBuilder sb = new StringBuilder();
        for (String text : ids) {
            if (!text.contains("@")) continue;
            String[] arr = text.split("@");
            sb.append(arr[0]).append("#").append(arr[1]).append("#").append(getDetail(arr[2]).getUrl()).append("$$$");
        }
        return Misc.substring(sb.toString(), 3);
    }
}