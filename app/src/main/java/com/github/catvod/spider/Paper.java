package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.paper.Data;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ColaMint & FongMi
 */
public class Paper extends Spider {

    private final String url = "https://gitcafe.net/alipaper/";
    private final String api = "https://gitcafe.net/tool/alipaper/";
    private List<String> types;
    private Ali ali;

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        types = Arrays.asList("hyds", "rhds", "omds", "qtds", "hydy", "rhdy", "omdy", "qtdy", "hydm", "rhdm", "omdm", "jlp", "zyp", "jypx", "qtsp");
        ali = new Ali(extend);
    }

    @Override
    public String homeContent(boolean filter) {
        Document doc = Jsoup.parse(OkHttpUtil.string(url, getHeaders()));
        Elements trs = doc.select("table.tableizer-table > tbody > tr");
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        List<Class> classes = new ArrayList<>();
        for (Element tr : trs) {
            List<Filter.Value> values = new ArrayList<>();
            for (Element td : tr.select("td")) {
                if (td.hasClass("tableizer-title")) {
                    String typeId = td.select("a").attr("href").replace("#", "");
                    if (!types.contains(typeId)) continue;
                    classes.add(new Class(typeId, td.text()));
                    filters.put(typeId, Arrays.asList(new Filter("type", "類型", values)));
                } else {
                    String value = td.select("a").attr("onclick").split("'")[1];
                    values.add(new Filter.Value(td.text(), value));
                }
            }
        }
        return Result.string(classes, filters);
    }

    @Override
    public String homeVideoContent() throws Exception {
        List<Vod> list = new ArrayList<>();
        JSONObject homeData = new JSONObject(OkHttpUtil.string(url + "home.json", getHeaders()));
        List<Data> items = Data.arrayFrom(homeData.getJSONObject("info").getJSONArray("new").toString());
        for (Data item : items) if (types.contains(item.getCat())) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String type = extend.containsKey("type") ? extend.get("type") : tid;
        List<Vod> list = new ArrayList<>();
        Map<String, String> params = new HashMap<>();
        params.put("action", "viewcat");
        params.put("cat", type);
        params.put("num", pg);
        String result = OkHttpUtil.post(api, params, getHeaders());
        for (Data item : Data.arrayFrom(result)) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        return ali.detailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        List<Vod> list = new ArrayList<>();
        Map<String, String> params = new HashMap<>();
        params.put("action", "search");
        params.put("keyword", key);
        String result = OkHttpUtil.post(api, params, getHeaders());
        for (Data item : Data.arrayFrom(result)) if (types.contains(item.getCat()) && item.getTitle().contains(key)) list.add(item.getVod());
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return ali.playerContent(flag, id);
    }
}
