package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Value;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.alist.Drive;
import com.github.catvod.bean.alist.Item;
import com.github.catvod.bean.alist.Sorter;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Response;
import com.github.catvod.utils.Util;
import com.github.catvod.utils.VodUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AList extends Spider {

    private static final int PAGE_SIZE = 100;
    private ExecutorService executor;
    private List<Drive> drives;
    private String ext;

    private static Map<String, String> getPlayHeader(String url) {
        Map<String, String> header = new HashMap<>();
        String host = Uri.parse(url).getHost();
        if (host == null) return header;
        if (host.contains("115")) header.put("User-Agent", Util.CHROME);
        if (host.contains("baidupcs.com")) header.put("User-Agent", "pan.baidu.com");
        return header;
    }

    private List<Filter> getFilter() {
        List<Filter> items = new ArrayList<>();
        items.add(Filter.create().key("type").name("排序類型").value(Arrays.asList(Value.create().n("預設").v(""), Value.create().n("名稱").v("name"), Value.create().n("大小").v("size"), Value.create().n("修改時間").v("date"))));
        items.add(Filter.create().key("order").name("排序方式").value(Arrays.asList(Value.create().n("預設").v(""), Value.create().n("⬆").v("asc"), Value.create().n("⬇").v("desc"))));
        return items;
    }

    private void fetchRule() {
        if (drives != null && !drives.isEmpty()) return;
        if (ext.startsWith("http")) ext = net.get(ext);
        drives = Drive.arrayFrom(ext);
    }

    private Drive getDrive(String name) {
        return drives.get(drives.indexOf(Drive.create().name(name))).check(net);
    }

    private String post(Drive drive, String url, String param) throws JSONException {
        return post(drive, url, param, true);
    }

    private String post(Drive drive, String url, String param, boolean retry) throws JSONException {
        JSONObject options = new JSONObject().put("method", "POST").put("headers", new JSONObject(drive.getHeader())).put("data", new JSONObject(param));
        JSONObject result = new JSONObject(net.req(url, options.toString()));
        if (result.has("error")) throw new IllegalStateException(result.getString("error"));
        int status = result.getInt("code");
        JSONObject response = new JSONObject(result.getString("content"));
        if (retry && response.optString("message").contains("Guest user is disabled")) {
            login(drive);
            return post(drive, url, param, false);
        }
        if (status < 200 || status >= 300) throw new IllegalStateException("HTTP " + status);
        return checkResponse(response).toString();
    }

    private JSONObject checkResponse(JSONObject response) throws JSONException {
        int code = response.getInt("code");
        if (code != 200) throw new IllegalStateException("AList API " + code + ": " + response.optString("message"));
        return response;
    }

    @Override
    public void init(Context context, String extend) {
        executor = Executors.newFixedThreadPool(4);
        ext = extend;
        fetchRule();
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        for (Drive drive : drives) if (!drive.hidden()) classes.add(drive.toType());
        for (Class item : classes) filters.put(item.getTypeId(), getFilter());
        return Response.create().classes(classes).filters(filters).string();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws JSONException {
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
        for (Item item : folders) list.add(item.getVod(tid));
        for (Item item : files) list.add(item.getVod(tid));
        return Response.create().vods(list).page().string();
    }

    @Override
    public String detailContent(List<String> ids) throws JSONException {
        String id = ids.get(0);
        String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
        String path = id.substring(0, id.lastIndexOf("/"));
        String name = path.substring(path.lastIndexOf("/") + 1);
        Drive drive = getDrive(key);
        List<String> playUrls = new ArrayList<>();
        List<Item> parents = getList(path, false);
        for (Item item : parents) if (item.isMedia(drive.isNew())) playUrls.add(item.getName() + "$" + encodeVodId(item.getVodId(path) + findSubs(path, parents)));
        Vod vod = Vod.create().playFrom(key).id(id).name(name).playUrl(TextUtils.join("#", playUrls));
        return Response.create().vod(vod).string();
    }

    private String encodeVodId(String vodId) {
        if (vodId.contains("#")) return vodId.replace("#", "***");
        return vodId;
    }

    private String decodeVodId(String vodId) {
        if (vodId.contains("***")) return vodId.replace("***", "#");
        return vodId;
    }

    @Override
    public String searchContent(String keyword, boolean quick) throws Exception {
        return searchContent(keyword, quick, "1");
    }

    @Override
    public String searchContent(String keyword, boolean quick, String pg) throws Exception {
        int page = Math.max(1, Integer.parseInt(pg));
        List<Drive> sources = new ArrayList<>();
        List<Callable<SearchPage>> jobs = new ArrayList<>();
        for (Drive drive : drives) {
            if (!drive.search()) continue;
            sources.add(drive);
            jobs.add(() -> search(drive, keyword, page));
        }
        List<Vod> list = new ArrayList<>();
        int count = 1;
        try {
            List<Future<SearchPage>> results = executor.invokeAll(jobs, 15, TimeUnit.SECONDS);
            for (int i = 0; i < results.size(); i++) {
                SearchPage result = awaitSearch(results.get(i), sources.get(i));
                list.addAll(result.items());
                count = Math.max(count, result.count());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw e;
        }
        return Response.create().vods(list).put("page", page).put("pagecount", count).put("limit", PAGE_SIZE * Math.max(1, sources.size())).string();
    }

    private SearchPage awaitSearch(Future<SearchPage> future, Drive drive) throws IOException, InterruptedException {
        if (future.isCancelled()) throw new SocketTimeoutException("搜尋來源逾時：" + drive.getName());
        try {
            return future.get();
        } catch (ExecutionException e) {
            throw new IOException("搜尋來源失敗：" + drive.getName(), e.getCause());
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws JSONException {
        String[] ids = decodeVodId(id).split("~~~");
        String url = getDetail(ids[0]).getUrl();
        return Response.create().url(url).header(getPlayHeader(url)).subs(getSubs(ids)).string();
    }

    @Override
    public void destroy() {
        executor.shutdownNow();
    }

    private void login(Drive drive) throws JSONException {
        if (drive.getLogin() == null) throw new IllegalStateException("來源需要登入：" + drive.getName());
        JSONObject params = new JSONObject();
        params.put("username", drive.getLogin().getUsername());
        params.put("password", drive.getLogin().getPassword());
        JSONObject options = new JSONObject().put("method", "POST").put("data", params);
        JSONObject response = checkResponse(new JSONObject(net.json(drive.loginApi(), options.toString())));
        drive.token(response.getJSONObject("data").getString("token"));
    }

    private Item getDetail(String id) throws JSONException {
        String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
        String path = id.contains("/") ? id.substring(id.indexOf("/")) : "";
        Drive drive = getDrive(key);
        path = path.startsWith(drive.getPath()) ? path : drive.getPath() + path;
        JSONObject params = new JSONObject();
        params.put("path", path);
        params.put("password", drive.findPass(path));
        String response = post(drive, drive.getApi(), params.toString());
        return Item.objectFrom(getDetailJson(drive.isNew(), response));
    }

    private List<Item> getList(String id, boolean filter) throws JSONException {
        String key = id.contains("/") ? id.substring(0, id.indexOf("/")) : id;
        String path = id.contains("/") ? id.substring(id.indexOf("/")) : "";
        Drive drive = getDrive(key);
        path = path.startsWith(drive.getPath()) ? path : drive.getPath() + path;
        JSONObject params = new JSONObject();
        params.put("path", path);
        params.put("password", drive.findPass(path));
        String response = post(drive, drive.listApi(), params.toString());
        List<Item> items = Item.arrayFrom(getListJson(drive.isNew(), response));
        Iterator<Item> iterator = items.iterator();
        if (filter) while (iterator.hasNext()) if (iterator.next().ignore(drive.isNew())) iterator.remove();
        return items;
    }

    private String getListJson(boolean isNew, String response) throws JSONException {
        JSONObject data = new JSONObject(response).getJSONObject("data");
        String key = isNew ? "content" : "files";
        if (data.has(key) && data.isNull(key)) return "[]";
        return data.getJSONArray(key).toString();
    }

    private String getDetailJson(boolean isNew, String response) throws JSONException {
        if (isNew) {
            return new JSONObject(response).getJSONObject("data").toString();
        } else {
            return new JSONObject(response).getJSONObject("data").getJSONArray("files").getJSONObject(0).toString();
        }
    }

    private String getSearchJson(boolean isNew, String response) throws JSONException {
        if (isNew) return getListJson(true, response);
        JSONObject data = new JSONObject(response);
        if (data.has("data") && data.isNull("data")) return "[]";
        return data.getJSONArray("data").toString();
    }

    private String findSubs(String path, List<Item> items) {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            String ext = VodUtil.getExt(item.getName());
            if (VodUtil.isSub(ext)) sb.append("~~~").append(item.getName()).append("@@@").append(ext).append("@@@").append(item.getVodId(path));
        }
        return sb.toString();
    }

    private List<Sub> getSubs(String[] ids) throws JSONException {
        List<Sub> sub = new ArrayList<>();
        for (String text : ids) {
            if (!text.contains("@@@")) continue;
            String[] split = text.split("@@@");
            String name = split[0];
            String ext = split[1];
            String url = getDetail(split[2]).getUrl();
            sub.add(Sub.create().name(name).format(ext).url(url));
        }
        return sub;
    }

    private SearchPage search(Drive drive, String keyword, int page) throws JSONException {
        drive.check(net);
        String response = post(drive, drive.searchApi(), drive.params(keyword, page, PAGE_SIZE));
        List<Item> items = Item.arrayFrom(getSearchJson(drive.isNew(), response));
        List<Vod> list = new ArrayList<>();
        for (Item item : items) if (!item.ignore(drive.isNew())) list.add(item.getVod(drive));
        if (drive.isNew()) return new SearchPage(list, pageCount(new JSONObject(response).getJSONObject("data").getLong("total")));
        int start = (int) Math.min(list.size(), (long) (page - 1) * PAGE_SIZE);
        int end = Math.min(list.size(), start + PAGE_SIZE);
        return new SearchPage(list.subList(start, end), pageCount(list.size()));
    }

    private int pageCount(long total) {
        return total <= 0 ? 1 : (int) Math.min(Integer.MAX_VALUE, (total - 1) / PAGE_SIZE + 1);
    }

    private record SearchPage(List<Vod> items, int count) {
    }
}
