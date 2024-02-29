package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.webdav.Drive;
import com.github.catvod.bean.webdav.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Util;
import com.thegrizzlylabs.sardineandroid.DavResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WebDAV extends Spider {

    private static List<Drive> drives;
    private List<String> allExt;
    private String extend;

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(new Filter("type", "排序類型", Arrays.asList(new Filter.Value("預設", ""), new Filter.Value("名稱", "name"), new Filter.Value("大小", "size"), new Filter.Value("修改時間", "date"))));
        items.add(new Filter("order", "排序方式", Arrays.asList(new Filter.Value("預設", ""), new Filter.Value("⬆", "asc"), new Filter.Value("⬇", "desc"))));
        return items;
    }

    private void fetchRule() {
        if (drives != null && !drives.isEmpty()) return;
        if (extend.startsWith("http")) extend = OkHttp.string(extend);
        Drive drive = Drive.objectFrom(extend);
        drives = drive.getDrives();
    }

    private String getExt(DavResource item) {
        return Util.getExt(item.getName());
    }

    private String removeExt(DavResource item) {
        return Util.removeExt(item.getName());
    }

    private static Drive getDrive(String name) {
        return drives.get(drives.indexOf(new Drive(name)));
    }

    @Override
    public void init(Context context, String extend) {
        this.allExt = new ArrayList<>(Arrays.asList("ass", "ssa", "srt"));
        this.allExt.addAll(Util.MEDIA);
        this.extend = extend;
        fetchRule();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Drive drive : drives) classes.add(drive.toType());
        for (Class item : classes) filters.put(item.getTypeId(), getFilter());
        return Result.string(classes, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
        String path = tid.contains("/") ? tid.substring(tid.indexOf("/")) : "";
        String order = extend.containsKey("order") ? extend.get("order") : "";
        String type = extend.containsKey("type") ? extend.get("type") : "";
        List<DavResource> folders = new ArrayList<>();
        List<DavResource> files = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        Drive drive = getDrive(key);
        for (DavResource item : getList(drive, path, Util.MEDIA)) {
            if (item.isDirectory()) folders.add(item);
            else files.add(item);
        }
        if (!TextUtils.isEmpty(type) && !TextUtils.isEmpty(order)) {
            Sorter.sort(type, order, folders);
            Sorter.sort(type, order, files);
        }
        for (DavResource item : folders) list.add(drive.vod(item, Image.FOLDER));
        for (DavResource item : files) list.add(drive.vod(item, Image.VIDEO));
        return Result.get().vod(list).page().string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0);
        String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
        String parent = id.substring(0, id.lastIndexOf("/"));
        String path = parent.contains("/") ? parent.substring(parent.indexOf("/")) + "/" : "";
        String name = parent.substring(parent.lastIndexOf("/") + 1);
        Drive drive = getDrive(key);
        List<DavResource> parents = getList(drive, path, allExt);
        List<DavResource> subs = getSubs(parents);
        Sorter.sort("name", "asc", parents);
        List<String> playUrls = new ArrayList<>();
        for (DavResource item : parents) {
            if (Util.isMedia(item.getName())) {
                playUrls.add(item.getName() + "$" + drive.getName() + item.getPath() + findSubs(drive, item, subs));
            }
        }
        Vod vod = new Vod();
        vod.setVodId(name);
        vod.setVodName(name);
        vod.setVodPlayFrom(key);
        vod.setVodPic(Image.VIDEO);
        vod.setVodPlayUrl(TextUtils.join("#", playUrls));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] ids = id.split("~~~");
        return Result.get().url(getProxyUrl(ids[0])).subs(getSub(ids)).string();
    }

    private List<DavResource> getList(Drive drive, String path, List<String> ext) throws Exception {
        path = drive.getHost() + (path.startsWith(drive.getPath()) ? path : drive.getPath() + path);
        List<DavResource> items = drive.getWebdav().list(path);
        items.remove(0); //Remove parent
        Iterator<DavResource> iterator = items.iterator();
        while (iterator.hasNext()) {
            DavResource item = iterator.next();
            if (!item.isDirectory() && !item.getName().contains(".")) iterator.remove();
            if (!item.isDirectory() && !ext.contains(getExt(item))) iterator.remove();
        }
        return items;
    }

    private List<DavResource> getSubs(List<DavResource> items) {
        List<DavResource> subs = new ArrayList<>();
        for (DavResource item : items) if (Util.isSub(getExt(item))) subs.add(item);
        return subs;
    }

    private String findSubs(Drive drive, DavResource res, List<DavResource> items) {
        StringBuilder sb = new StringBuilder();
        for (DavResource item : items) if (removeExt(item).equals(removeExt(res))) sb.append("~~~").append(item.getName()).append("@@@").append(getExt(item)).append("@@@").append(drive.getName() + item.getPath());
        return sb.length() > 0 ? sb.toString() : findSubs(drive, items);
    }

    private String findSubs(Drive drive, List<DavResource> items) {
        StringBuilder sb = new StringBuilder();
        for (DavResource item : items) sb.append("~~~").append(item.getName()).append("@@@").append(getExt(item)).append("@@@").append(drive.getName() + item.getPath());
        return sb.toString();
    }

    private List<Sub> getSub(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = getProxyUrl(split[2]);
            sub.add(Sub.create().name(name).ext(ext).url(url));
        }
        return sub;
    }

    private String getProxyUrl(String url) {
        return Proxy.getUrl() + "?do=webdav&url=" + url;
    }

    public static Object[] vod(Map<String, String> params) throws IOException {
        String url = params.get("url");
        String key = url.contains("/") ? url.substring(0, url.indexOf("/")) : url;
        url = url.substring(key.length());
        Drive drive = getDrive(key);
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = "application/octet-stream";
        result[2] = drive.getWebdav().get(drive.getHost() + url, getHeaders(params));
        return result;
    }

    private static Map<String, String> getHeaders(Map<String, String> params) {
        Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        List<String> keys = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String key : params.keySet()) if (keys.contains(key)) headers.put(key, params.get(key));
        return headers;
    }
}
