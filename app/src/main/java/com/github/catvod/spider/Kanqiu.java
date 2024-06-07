package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Qile
 */
public class Kanqiu extends Spider {

    private static String siteUrl = "http://www.88kanqiu.tw";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        if (!extend.isEmpty()) siteUrl = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("", "1", "8", "21");
        List<String> typeNames = Arrays.asList("全部直播", "篮球直播", "足球直播", "其他直播");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        String f = "{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"NBA\", \"v\": \"1\"}, {\"n\": \"CBA\", \"v\": \"2\"}, {\"n\": \"篮球综合\", \"v\": \"4\"}, {\"n\": \"纬来体育\", \"v\": \"21\"}]}],\"8\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"英超\", \"v\": \"8\"}, {\"n\": \"西甲\", \"v\": \"9\"}, {\"n\": \"意甲\", \"v\": \"10\"}, {\"n\": \"欧冠\", \"v\": \"12\"}, {\"n\": \"欧联\", \"v\": \"13\"}, {\"n\": \"德甲\", \"v\": \"14\"}, {\"n\": \"法甲\", \"v\": \"15\"}, {\"n\": \"欧国联\", \"v\": \"16\"}, {\"n\": \"足总杯\", \"v\": \"27\"}, {\"n\": \"国王杯\", \"v\": \"33\"}, {\"n\": \"中超\", \"v\": \"7\"}, {\"n\": \"亚冠\", \"v\": \"11\"}, {\"n\": \"足球综合\", \"v\": \"23\"}, {\"n\": \"欧协联\", \"v\": \"28\"}, {\"n\": \"美职联\", \"v\": \"26\"}]}], \"29\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"网球\", \"v\": \"29\"}, {\"n\": \"斯洛克\", \"v\": \"30\"}, {\"n\": \"MLB\", \"v\": \"38\"}, {\"n\": \"UFC\", \"v\": \"32\"}, {\"n\": \"NFL\", \"v\": \"25\"}, {\"n\": \"CCTV5\", \"v\": \"18\"}]}]}";
        JSONObject filterConfig = new JSONObject(f);
        return Result.string(classes, filterConfig);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String cateId = extend.get("cateId") == null ? tid : extend.get("cateId");
        String urlPath = cateId == null || cateId.isEmpty() ? "" : String.format("/match/%s/live", cateId);
        Elements lis = Jsoup.parse(OkHttp.string(siteUrl + urlPath, getHeader())).select(".list-group-item");
        List<Vod> list = new ArrayList<>();
        for (Element li : lis) {
            String vid = siteUrl + li.select(".btn.btn-primary").attr("href");
            String name = li.select(".row.d-none").text();
            if (name.isEmpty()) name = li.text();
            String pic = li.select(".col-xs-1").eq(0).select("img").attr("src");
            if (pic.isEmpty()) pic = "https://pic.imgdb.cn/item/657673d6c458853aeff94ab9.jpg";
            if (!pic.startsWith("http")) pic = siteUrl + pic;
            String remark = li.select(".btn.btn-primary").text();
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.get().page(1, 1, 0, lis.size()).vod(list).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (ids.get(0).equals(siteUrl)) return Result.error("比赛尚未开始");
        String content = OkHttp.string(ids.get(0) + "-url", getHeader());
        String result = new JSONObject(content).optString("data");
        result = result.substring(6);
        result = result.substring(0, result.length() - 2);
        String json = new String(Base64.decode(result, Base64.DEFAULT));
        JSONArray linksArray = new JSONObject(json).getJSONArray("links");
        List<String> vodItems = new ArrayList<>();
        for (int i = 0; i < linksArray.length(); i++) {
            JSONObject linkObject = linksArray.getJSONObject(i);
            String text = linkObject.optString("name");
            String href = linkObject.optString("url").replace("#", "***");
            vodItems.add(text + "$" + href);
        }
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPlayFrom("Qile");
        vod.setVodPlayUrl(TextUtils.join("#", vodItems));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id.replace("***", "#")).parse().header(getHeader()).string();
    }
}
