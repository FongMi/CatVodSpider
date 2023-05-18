package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Miss extends Spider {

    private final String url = "https://missav.com/";

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        List<String> typeIds = Arrays.asList("chinese-subtitle", "new", "release", "uncensored-leak", "siro", "luxu", "gana", "maan", "scute", "ara", "uncensored-leak", "fc2", "heyzo", "tokyohot", "1pondo", "caribbeancom", "caribbeancompr", "10musume", "pacopacomama", "gachinco", "xxxav", "marriedslash", "naughty4610", "naughty0930", "madou", "twav");
        Document doc = Jsoup.parse(OkHttp.string(url));
        for (Element a : doc.select("nav").select("a")) {
            String typeName = a.text();
            String typeId = a.attr("href").replace(url, "");
            if (!typeIds.contains(typeId)) continue;
            classes.add(new Class(typeId, typeName));
            filters.put(typeId, Arrays.asList(new Filter("filters", "過濾", Arrays.asList(new Filter.Value("全部", ""), new Filter.Value("單人作品", "individual"), new Filter.Value("中文字幕", "chinese-subtitle")))));
        }
        for (Element div : doc.select("div.thumbnail")) {
            String id = div.select("a.text-secondary").attr("href").replace(url, "");
            String name = div.select("a.text-secondary").text();
            String pic = div.select("img").attr("data-src");
            if (pic.isEmpty()) pic = div.select("img").attr("src");
            String remark = div.select("span").text();
            if (TextUtils.isEmpty(name)) continue;
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(classes, list, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> list = new ArrayList<>();
        String target = url + tid;
        String filters = extend.get("filters");
        if (TextUtils.isEmpty(filters)) target += "?page=" + pg;
        else target += "?filters=" + extend.get("filters") + "&page=" + pg;
        Document doc = Jsoup.parse(OkHttp.string(target));
        for (Element div : doc.select("div.thumbnail")) {
            String id = div.select("a.text-secondary").attr("href").replace(url, "");
            String name = div.select("a.text-secondary").text();
            String pic = div.select("img").attr("data-src");
            if (pic.isEmpty()) pic = div.select("img").attr("src");
            String remark = div.select("span").text();
            if (TextUtils.isEmpty(name)) continue;
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(url + ids.get(0)));
        String name = doc.select("meta[property=og:title]").attr("content");
        String pic = doc.select("meta[property=og:image]").attr("content");
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(pic);
        vod.setVodName(name);
        vod.setVodPlayFrom("MissAV");
        vod.setVodPlayUrl("播放$" + ids.get(0));
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        List<Vod> list = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(url + "search/" + key));
        for (Element div : doc.select("div.thumbnail")) {
            String id = div.select("a.text-secondary").attr("href").replace(url, "");
            String name = div.select("a.text-secondary").text();
            String pic = div.select("img").attr("data-src");
            if (pic.isEmpty()) pic = div.select("img").attr("src");
            String remark = div.select("span").text();
            if (TextUtils.isEmpty(name)) continue;
            list.add(new Vod(id, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().parse().url(url + id).string();
    }
}
