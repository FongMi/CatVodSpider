package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.K.Subtitle;
import com.github.catvod.spider.merge.K.VodItem;
import com.github.catvod.spider.merge.M.g;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AList extends Spider {
    private List<com.github.catvod.spider.merge.M.b> serverConfigs;
    private String configJson;

    class Job implements Callable<List<VodItem>> {
        private final com.github.catvod.spider.merge.M.VodCategory a;
        private final String b;

        public Job(com.github.catvod.spider.merge.M.VodCategory bVar, String str) {
            this.a = bVar;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        public List<VodItem> call() {
            try {
                ArrayList arrayList = new ArrayList();
                AList aList = AList.this;
                com.github.catvod.spider.merge.M.VodCategory bVar = this.a;
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.e());
                sb.append(bVar.j() ? "/api/fs/search" : "/api/public/search");
                String strA = AList.a(aList, bVar, sb.toString(), this.a.k(this.b));
                AList aList2 = AList.this;
                boolean zJ = this.a.j();
                aList2.getClass();
                for (com.github.catvod.spider.merge.M.FilterGroup dVar : com.github.catvod.spider.merge.M.FilterGroup.a((zJ ? new JSONObject(strA).getJSONObject("data").getJSONArray("content") : new JSONObject(strA).getJSONArray("data")).toString())) {
                    if (!dVar.j(this.a.j())) {
                        arrayList.add(dVar.g(this.a));
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        }
    }

    static String a(AList alist, com.github.catvod.spider.merge.M.VodCategory server, String apiUrl, String body) {
        return alist.requestWithAuth(server, apiUrl, body, true);
    }

    private com.github.catvod.spider.merge.M.FilterGroup getFileEntry(String path) {
        try {
            String serverName = path.contains("/") ? path.substring(0, path.indexOf("/")) : path;
            String filePath = path.contains("/") ? path.substring(path.indexOf("/")) : "";
            com.github.catvod.spider.merge.M.VodCategory server = getServer(serverName);
            if (!filePath.startsWith(server.h())) {
                filePath = server.h() + filePath;
            }
            JSONObject body = new JSONObject();
            body.put("path", filePath);
            body.put("password", server.c(filePath));
            StringBuilder apiUrl = new StringBuilder();
            apiUrl.append(server.e());
            apiUrl.append(server.j() ? "/api/fs/get" : "/api/public/path");
            String response = requestWithAuth(server, apiUrl.toString(), body.toString(), true);
            return (com.github.catvod.spider.merge.M.d) new Gson().fromJson((server.j() ? new JSONObject(response).getJSONObject("data") : new JSONObject(response).getJSONObject("data").getJSONArray("files").getJSONObject(0)).toString(), com.github.catvod.spider.merge.M.FilterGroup.class);
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.M.d();
        }
    }

    private com.github.catvod.spider.merge.M.VodCategory getServer(String serverName) {
        List<com.github.catvod.spider.merge.M.b> configs = this.serverConfigs;
        com.github.catvod.spider.merge.M.VodCategory server = configs.get(configs.indexOf(new com.github.catvod.spider.merge.M.b(serverName)));
        server.b();
        return server;
    }

    private List<com.github.catvod.spider.merge.M.d> listFiles(String path, boolean filterDirs) {
        JSONObject dataObj;
        String arrayKey;
        try {
            String serverName = path.contains("/") ? path.substring(0, path.indexOf("/")) : path;
            String filePath = path.contains("/") ? path.substring(path.indexOf("/")) : "";
            com.github.catvod.spider.merge.M.VodCategory server = getServer(serverName);
            if (!filePath.startsWith(server.h())) {
                filePath = server.h() + filePath;
            }
            JSONObject body = new JSONObject();
            body.put("path", filePath);
            body.put("password", server.c(filePath));
            StringBuilder apiUrl = new StringBuilder();
            apiUrl.append(server.e());
            apiUrl.append(server.j() ? "/api/fs/list" : "/api/public/path");
            String response = requestWithAuth(server, apiUrl.toString(), body.toString(), true);
            if (server.j()) {
                dataObj = new JSONObject(response).getJSONObject("data");
                arrayKey = "content";
            } else {
                dataObj = new JSONObject(response).getJSONObject("data");
                arrayKey = "files";
            }
            List<com.github.catvod.spider.merge.M.d> fileList = com.github.catvod.spider.merge.M.FilterGroup.a(dataObj.getJSONArray(arrayKey).toString());
            Iterator<com.github.catvod.spider.merge.M.d> it = fileList.iterator();
            if (filterDirs) {
                while (it.hasNext()) {
                    if (it.next().j(server.j())) {
                        it.remove();
                    }
                }
            }
            return fileList;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    private String requestWithAuth(com.github.catvod.spider.merge.M.VodCategory server, String url, String body, boolean retryOnGuestDisabled) {
        boolean authSucceeded;
        String response = com.github.catvod.spider.merge.f0.HttpClient.f(url, body, server.d()).a();
        SpiderDebug.log(response);
        if (retryOnGuestDisabled && response.contains("Guest user is disabled")) {
            try {
                JSONObject loginBody = new JSONObject();
                loginBody.put("username", server.f().b());
                loginBody.put("password", server.f().a());
                server.m(new JSONObject(com.github.catvod.spider.merge.f0.HttpClient.f(server.e() + "/api/auth/login", loginBody.toString(), null).a()).getJSONObject("data").getString("token"));
                authSucceeded = true;
            } catch (Exception e) {
                StringUtils.printStackTrace();
                authSucceeded = false;
            }
            if (authSucceeded) {
                return requestWithAuth(server, url, body, false);
            }
        }
        return response;
    }

    public String categoryContent(String typeId, String filterId, boolean filterGenre, HashMap<String, String> extend) {
        String sortType = extend.containsKey("type") ? extend.get("type") : "";
        String sortOrder = extend.containsKey("order") ? extend.get("order") : "";
        ArrayList<com.github.catvod.spider.merge.M.FilterGroup> folders = new ArrayList<>();
        ArrayList<com.github.catvod.spider.merge.M.FilterGroup> files = new ArrayList<>();
        ArrayList<com.github.catvod.spider.merge.K.VodItem> vodItems = new ArrayList<>();
        for (com.github.catvod.spider.merge.M.FilterGroup entry : listFiles(typeId, true)) {
            if (entry.k()) {
                folders.add(entry);
            } else {
                files.add(entry);
            }
        }
        if (!TextUtils.isEmpty(sortType) && !TextUtils.isEmpty(sortOrder)) {
            Collections.sort(folders, new VodResult(sortType, sortOrder));
            Collections.sort(files, new VodResult(sortType, sortOrder));
        }
        for (com.github.catvod.spider.merge.M.d folder : folders) {
            vodItems.add(folder.h(typeId));
        }
        for (com.github.catvod.spider.merge.M.d file : files) {
            vodItems.add(file.h(typeId));
        }
        com.github.catvod.spider.merge.K.VodResult result = new com.github.catvod.spider.merge.K.VodResult();
        result.y(vodItems);
        result.j(1, 1, 0, 1);
        return result.toString();
    }

    public String detailContent(List<String> ids) {
        String fullPath = ids.get(0);
        String serverName = fullPath.contains("/") ? fullPath.substring(0, fullPath.indexOf("/")) : fullPath;
        String parentPath = fullPath.substring(0, fullPath.lastIndexOf("/"));
        String itemName = parentPath.substring(parentPath.lastIndexOf("/") + 1);
        com.github.catvod.spider.merge.M.VodCategory server = getServer(serverName);
        VodItem vodItem = new VodItem();
        vodItem.o(serverName);
        vodItem.l(fullPath);
        vodItem.m(itemName);
        ArrayList<String> playParts = new ArrayList<>();
        List<com.github.catvod.spider.merge.M.d> siblings = listFiles(parentPath, false);
        for (com.github.catvod.spider.merge.M.FilterGroup entry : siblings) {
            if (entry.l(server.j())) {
                StringBuilder playLine = new StringBuilder();
                playLine.append(entry.c());
                playLine.append("$");
                StringBuilder playUrl = new StringBuilder();
                playUrl.append(entry.i(parentPath));
                StringBuilder subtitles = new StringBuilder();
                for (com.github.catvod.spider.merge.M.FilterGroup sibling : siblings) {
                    String subtitleExt = GeneralUtils.j(sibling.c());
                    if (GeneralUtils.r(subtitleExt)) {
                        subtitles.append("~~~");
                        subtitles.append(sibling.c());
                        subtitles.append("@@@");
                        subtitles.append(subtitleExt);
                        subtitles.append("@@@");
                        subtitles.append(sibling.i(parentPath));
                    }
                }
                playUrl.append(subtitles.toString());
                String urlStr = playUrl.toString();
                if (urlStr.contains("#")) {
                    urlStr = urlStr.replace("#", "***");
                }
                playLine.append(urlStr);
                playParts.add(playLine.toString());
            }
        }
        vodItem.p(TextUtils.join("#", playParts));
        return com.github.catvod.spider.merge.K.VodResult.m(vodItem);
    }

    public String homeContent(boolean filterGenre) {
        ArrayList<com.github.catvod.spider.merge.K.VodCategory> categories = new ArrayList<>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.FilterGroup>> filterMap = new LinkedHashMap<>();
        for (com.github.catvod.spider.merge.M.VodCategory server : this.serverConfigs) {
            if (!server.i().booleanValue()) {
                categories.add(new com.github.catvod.spider.merge.K.VodCategory(server.g(), server.g(), "1"));
            }
        }
        for (com.github.catvod.spider.merge.K.VodCategory category : categories) {
            String categoryId = category.b();
            ArrayList<com.github.catvod.spider.merge.K.FilterGroup> filters = new ArrayList<>();
            filters.add(new com.github.catvod.spider.merge.K.FilterGroup("type", "排序類型", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("預設", ""), new com.github.catvod.spider.merge.K.FilterValue("名稱", "name"), new com.github.catvod.spider.merge.K.FilterValue("大小", "size"), new com.github.catvod.spider.merge.K.FilterValue("修改時間", "date"))));
            filters.add(new com.github.catvod.spider.merge.K.FilterGroup("order", "排序方式", Arrays.asList(new com.github.catvod.spider.merge.K.FilterValue("預設", ""), new com.github.catvod.spider.merge.K.FilterValue("⬆", "asc"), new com.github.catvod.spider.merge.K.FilterValue("⬇", "desc"))));
            filterMap.put(categoryId, filters);
        }
        return com.github.catvod.spider.merge.K.VodResult.p(categories, filterMap);
    }

    public void init(Context context, String config) {
        this.configJson = config;
        List<com.github.catvod.spider.merge.M.b> configs = this.serverConfigs;
        if (configs == null || configs.isEmpty()) {
            if (this.configJson.startsWith("http")) {
                this.configJson = com.github.catvod.spider.merge.f0.HttpClient.l(this.configJson);
            }
            this.serverConfigs = com.github.catvod.spider.merge.M.VodCategory.a(this.configJson);
        }
    }

    public String playerContent(String key, String playFlag, List<String> playFrom) {
        HashMap<String, String> headerMap;
        if (playFlag.contains("***")) {
            playFlag = playFlag.replace("***", "#");
        }
        String[] parts = playFlag.split("~~~");
        String playUrl = getFileEntry(parts[0]).f();
        com.github.catvod.spider.merge.K.VodResult result = new com.github.catvod.spider.merge.K.VodResult();
        result.w(playUrl);
        try {
            Uri uri = Uri.parse(playUrl);
            headerMap = new HashMap<>();
            if (uri.getHost().contains("115")) {
                headerMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            }
            if (uri.getHost().contains("baidupcs.com")) {
                headerMap.put("User-Agent", "pan.baidu.com");
            }
        } catch (Exception unused) {
            headerMap = new HashMap<>();
        }
        result.g(headerMap);
        ArrayList<Subtitle> subtitles = new ArrayList<>();
        for (String part : parts) {
            if (part.contains("@@@")) {
                String[] subParts = part.split("@@@");
                String subName = subParts[0];
                String subExt = subParts[1];
                String subUrl = getFileEntry(subParts[2]).f();
                Subtitle subtitle = new Subtitle();
                subtitle.b(subName);
                Subtitle subWithExt = subtitle.a(subExt);
                subWithExt.c(subUrl);
                subtitles.add(subWithExt);
            }
        }
        result.v(subtitles);
        return result.toString();
    }

    public String searchContent(String keyword, boolean quick) {
        ArrayList<VodItem> results = new ArrayList<>();
        ArrayList<Job> jobs = new ArrayList<>();
        ExecutorService executor = Executors.newCachedThreadPool();
        for (com.github.catvod.spider.merge.M.VodCategory server : this.serverConfigs) {
            if (server.l().booleanValue()) {
                server.b();
                jobs.add(new Job(server, keyword));
            }
        }
        for (Future<List<VodItem>> future : executor.invokeAll(jobs, 15L, TimeUnit.SECONDS)) {
            results.addAll(future.get());
        }
        return com.github.catvod.spider.merge.K.VodResult.n(results);
    }
}
