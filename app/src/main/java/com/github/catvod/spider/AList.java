package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.alist.Drive;
import com.github.catvod.bean.alist.Item;
import com.github.catvod.bean.alist.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class AList extends Spider {

    private List<Drive> drives;
    private String vodPic;
    private String token;
    private String ext;

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(new Filter("type", "排序類型", Arrays.asList(new Filter.Value("預設", ""), new Filter.Value("名稱", "name"), new Filter.Value("大小", "size"), new Filter.Value("修改時間", "date"))));
        items.add(new Filter("order", "排序方式", Arrays.asList(new Filter.Value("預設", ""), new Filter.Value("⬆", "asc"), new Filter.Value("⬇", "desc"))));
        return items;
    }

    private void fetchRule() {
        if (drives != null && !drives.isEmpty()) return;
        if (ext.startsWith("http")) ext = OkHttp.string(ext);
        Drive drive = Drive.objectFrom(ext);
        drives = drive.getDrives();
        vodPic = drive.getVodPic();
    }

    private Drive getDrive(String name) {
        return drives.get(drives.indexOf(new Drive(name))).check();
    }

    public HashMap<String, String> getHeader() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Utils.CHROME);
        if (token != null) headers.put("Authorization", token);
        return headers;
    }

    private String post(Drive drive, String url, String param) {
        return post(drive, url, param, true);
    }

    private String post(Drive drive, String url, String param, boolean retry) {
        String response = OkHttp.postJson(url, param, getHeader()).getBody();
        if (retry && response.contains("Guest user is disabled") && login(drive)) return post(drive, url, param, false);
        return response;
    }

    @Override
    public void init(Context context, String extend) {
        try {
            ext = extend;
            fetchRule();
        } catch (Exception ignored) {
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        fetchRule();
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Drive drive : drives) classes.add(drive.toType());
        for (Class item : classes) filters.put(item.getTypeId(), getFilter());
        return Result.string(classes, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        fetchRule();
        String type = extend.containsKey("type") ? extend.get("type") : "";
        String order = extend.containsKey("order") ? extend.get("order") : "";
        List<Item> folders = new ArrayList<>();
        List<Item> files = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        for (Item item : getList(tid, true)) {
            if (item.isFolder()) folders.add(item);
            else files.add(item);
        }
        if (!TextUtils.isEmpty(type) && !TextUtils.isEmpty(order)) {
            Sorter.sort(type, order, folders);
            Sorter.sort(type, order, files);
        }
        for (Item item : folders) list.add(item.getVod(tid, vodPic));
        for (Item item : files) list.add(item.getVod(tid, vodPic));
        return Result.get().vod(list).page().string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        fetchRule();
        String id = ids.get(0);
        String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
        String path = id.substring(0, id.lastIndexOf("/"));
        String name = path.substring(path.lastIndexOf("/") + 1);
        Drive drive = getDrive(key);
        List<Item> parents = getList(path, false);
        Sorter.sort("name", "asc", parents);
        List<String> playUrls = new ArrayList<>();
        for (Item item : parents) {
            if (item.isMedia(drive.isNew())) {
                playUrls.add(item.getName() + "$" + item.getVodId(path) + findSubs(path, parents));
            }
        }
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodName(name);
        vod.setVodPic(vodPic);
        vod.setVodPlayFrom(key);
        vod.setVodPlayUrl(TextUtils.join("#", playUrls));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String keyword, boolean quick) throws Exception {
        fetchRule();
        List<Vod> list = new ArrayList<>();
        CountDownLatch cd = new CountDownLatch(drives.size());
        for (Drive drive : drives) new Thread(() -> search(cd, list, drive.check(), keyword)).start();
        cd.await();
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String[] ids = id.split("~~~");
        return Result.get().url(getDetail(ids[0]).getUrl()).subs(getSub(ids)).string();
    }

    private boolean login(Drive drive) {
        try {
            JSONObject params = new JSONObject();
            params.put("username", drive.getLogin().getUsername());
            params.put("password", drive.getLogin().getPassword());
            String response = OkHttp.postJson(drive.loginApi(), params.toString()).getBody();
            token = new JSONObject(response).getJSONObject("data").getString("token");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Item getDetail(String id) {
        try {
            String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
            String path = id.contains("/") ? id.substring(id.indexOf("/")) : "";
            Drive drive = getDrive(key);
            path = path.startsWith(drive.getPath()) ? path : drive.getPath() + path;
            JSONObject params = new JSONObject();
            params.put("path", path);
            params.put("password", drive.getParams().get(path));
            String response = post(drive, drive.getApi(), params.toString());
            return Item.objectFrom(getDetailJson(drive.isNew(), response));
        } catch (Exception e) {
            return new Item();
        }
    }

    private List<Item> getList(String id, boolean filter) {
        try {
            String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
            String path = id.contains("/") ? id.substring(id.indexOf("/")) : "";
            Drive drive = getDrive(key);
            path = path.startsWith(drive.getPath()) ? path : drive.getPath() + path;
            JSONObject params = new JSONObject();
            params.put("path", path);
            params.put("password", drive.getParams().get(path));
            String response = post(drive, drive.listApi(), params.toString());
            List<Item> items = Item.arrayFrom(getListJson(drive.isNew(), response));
            Iterator<Item> iterator = items.iterator();
            if (filter) while (iterator.hasNext()) if (iterator.next().ignore(drive.isNew())) iterator.remove();
            return items;
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    private void search(CountDownLatch cd, List<Vod> list, Drive drive, String keyword) {
        try {
            String response = post(drive, drive.searchApi(), drive.params(keyword));
            List<Item> items = Item.arrayFrom(getSearchJson(drive.isNew(), response));
            for (Item item : items) if (!item.ignore(drive.isNew())) list.add(item.getVod(drive, vodPic));
        } catch (Exception ignored) {
        } finally {
            cd.countDown();
        }
    }

    private String getListJson(boolean isNew, String response) throws Exception {
        if (isNew) {
            return new JSONObject(response).getJSONObject("data").getJSONArray("content").toString();
        } else {
            return new JSONObject(response).getJSONObject("data").getJSONArray("files").toString();
        }
    }

    private String getDetailJson(boolean isNew, String response) throws Exception {
        if (isNew) {
            return new JSONObject(response).getJSONObject("data").toString();
        } else {
            return new JSONObject(response).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString();
        }
    }

    private String getSearchJson(boolean isNew, String response) throws Exception {
        if (isNew) {
            return new JSONObject(response).getJSONObject("data").getJSONArray("content").toString();
        } else {
            return new JSONObject(response).getJSONArray("data").toString();
        }
    }

    private String findSubs(String path, List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) if (Utils.isSub(item.getExt())) sb.append("~~~").append(item.getName()).append("@@@").append(item.getExt()).append("@@@").append(item.getVodId(path));
        return sb.toString();
    }

    private List<Sub> getSub(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = getDetail(split[2]).getUrl();
            sub.add(Sub.create().name(name).ext(ext).url(url));
        }
        return sub;
    }
}