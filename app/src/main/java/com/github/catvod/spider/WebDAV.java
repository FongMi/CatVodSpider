package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Value;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.webdav.Drive;
import com.github.catvod.bean.webdav.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Net;
import com.github.catvod.net.NetOptions;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Response;
import com.github.catvod.utils.VodUtil;
import com.google.gson.Gson;
import com.thegrizzlylabs.sardineandroid.DavResource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;

import okhttp3.Credentials;

public class WebDAV extends Spider {

    private static final Gson GSON = new Gson();
    private List<Drive> drives;
    private List<String> allExt;
    private String extend;

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(Filter.create().key("type").name("排序類型").value(Arrays.asList(Value.create().n("預設").v(""), Value.create().n("名稱").v("name"), Value.create().n("大小").v("size"), Value.create().n("修改時間").v("date"))));
        items.add(Filter.create().key("order").name("排序方式").value(Arrays.asList(Value.create().n("預設").v(""), Value.create().n("⬆").v("asc"), Value.create().n("⬇").v("desc"))));
        return items;
    }

    private void fetchRule() {
        if (drives != null && !drives.isEmpty()) return;
        if (extend.startsWith("http")) extend = net.get(extend);
        drives = Drive.arrayFrom(extend);
    }

    private String getExt(DavResource item) {
        return VodUtil.getExt(item.getName());
    }

    private String removeExt(DavResource item) {
        return VodUtil.removeExt(item.getName());
    }

    private Drive getDrive(String name) {
        return drives.get(drives.indexOf(Drive.create().name(name)));
    }

    @Override
    public void init(Context context, String extend) {
        this.allExt = new ArrayList<>(VodUtil.SUB);
        this.allExt.addAll(VodUtil.MEDIA);
        this.extend = extend;
        fetchRule();
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Drive drive : drives) classes.add(drive.toType());
        for (Class item : classes) filters.put(item.getTypeId(), getFilter());
        return Response.create().classes(classes).filters(filters).string();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws IOException {
        String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
        String path = tid.contains("/") ? tid.substring(tid.indexOf("/")) : "";
        String order = extend.containsKey("order") ? extend.get("order") : "";
        String type = extend.containsKey("type") ? extend.get("type") : "";
        List<DavResource> folders = new ArrayList<>();
        List<DavResource> files = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        Drive drive = getDrive(key);
        for (DavResource item : getList(drive, path, VodUtil.MEDIA)) {
            if (item.isDirectory()) folders.add(item);
            else files.add(item);
        }
        if (!TextUtils.isEmpty(type) && !TextUtils.isEmpty(order)) {
            Sorter.sort(type, order, folders);
            Sorter.sort(type, order, files);
        }
        for (DavResource item : folders) list.add(drive.vod(item, Image.FOLDER));
        for (DavResource item : files) list.add(drive.vod(item, Image.VIDEO));
        return Response.create().vods(list).page().string();
    }

    @Override
    public String detailContent(List<String> ids) throws IOException {
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
            if (VodUtil.isMedia(item.getName())) {
                playUrls.add(item.getName() + "$" + drive.getName() + item.getPath() + findSubs(drive, item, subs));
            }
        }
        Vod vod = Vod.create().id(name).name(name).pic(Image.VIDEO).playFrom(key).playUrl(TextUtils.join("#", playUrls));
        return Response.create().vod(vod).string();
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String[] ids = id.split("~~~");
        return Response.create().url(getProxyUrl(Map.of("url", ids[0]))).subs(getSub(ids)).string();
    }

    @Override
    public Object[] proxy(Map<String, String> params) throws Exception {
        String url = params.get("url");
        String key = url.contains("/") ? url.substring(0, url.indexOf("/")) : url;
        url = url.substring(key.length());
        Drive drive = getDrive(key);
        Map<String, String> headers = getHeaders(params);
        if (!drive.getUser().isEmpty() || !drive.getPass().isEmpty()) headers.put("Authorization", Credentials.basic(drive.getUser(), drive.getPass()));
        CompletableFuture<Net.StreamResult> pending = net.requestStreamAsync(drive.getUrl(url), NetOptions.from(GSON.toJson(Map.of("headers", headers, "timeout", 15000))));
        Net.StreamResult response = awaitStream(pending);
        Map<String, String> returned = new LinkedHashMap<>();
        response.headers.forEach((name, value) -> returned.put(name, value instanceof List<?> values ? values.get(values.size() - 1).toString() : value.toString()));
        return new Object[]{response.code, response.contentType, response, returned};
    }

    private Net.StreamResult awaitStream(CompletableFuture<Net.StreamResult> pending) throws Exception {
        try {
            return pending.get();
        } catch (InterruptedException e) {
            cancelStream(pending, e);
            Thread.currentThread().interrupt();
            throw e;
        }
    }

    private void cancelStream(CompletableFuture<Net.StreamResult> pending, InterruptedException interrupted) {
        if (pending.cancel(true) || pending.isCompletedExceptionally()) return;
        try {
            pending.join().close();
        } catch (RuntimeException | Error error) {
            interrupted.addSuppressed(error);
        }
    }

    private List<DavResource> getList(Drive drive, String path, List<String> ext) throws IOException {
        path = drive.getUrl(path.startsWith(drive.getPath()) ? path : drive.getPath() + path);
        List<DavResource> items = drive.getWebdav().list(path);
        if (!items.isEmpty()) items.remove(0); //Remove parent
        items.removeIf(item -> !item.isDirectory() && (!item.getName().contains(".") || !ext.contains(getExt(item))));
        return items;
    }

    private List<DavResource> getSubs(List<DavResource> items) {
        List<DavResource> subs = new ArrayList<>();
        for (DavResource item : items) if (VodUtil.isSub(item.getName())) subs.add(item);
        return subs;
    }

    private String findSubs(Drive drive, DavResource res, List<DavResource> items) {
        StringBuilder sb = new StringBuilder();
        for (DavResource item : items) if (removeExt(item).equals(removeExt(res))) sb.append("~~~").append(item.getName()).append("@@@").append(getExt(item)).append("@@@").append(drive.getName()).append(item.getPath());
        return sb.length() > 0 ? sb.toString() : findSubs(drive, items);
    }

    private String findSubs(Drive drive, List<DavResource> items) {
        StringBuilder sb = new StringBuilder();
        for (DavResource item : items) sb.append("~~~").append(item.getName()).append("@@@").append(getExt(item)).append("@@@").append(drive.getName()).append(item.getPath());
        return sb.toString();
    }

    private List<Sub> getSub(String[] ids) {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = getProxyUrl(Map.of("url", split[2]));
            sub.add(Sub.create().name(name).format(ext).url(url));
        }
        return sub;
    }

    private Map<String, String> getHeaders(Map<String, String> params) {
        Map<String, String> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        List<String> keys = Arrays.asList("referer", "icy-metadata", "range", "if-range", "accept-encoding", "user-agent");
        for (String key : params.keySet()) if (keys.contains(key)) headers.put(key, params.get(key));
        return headers;
    }
}
