package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import com.whl.quickjs.android.QuickJSLoader;
import com.whl.quickjs.wrapper.QuickJSContext;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Miss extends Spider {

    private final String url = "https://missav.com/cn/";

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        Document doc = Jsoup.parse(OkHttp.string(url));
        List<String> typeIds = Arrays.asList("chinese-subtitle", "new", "release", "uncensored-leak", "genres/VR", "today-hot", "weekly-hot", "monthly-hot", "siro", "luxu", "gana", "maan", "scute", "ara", "uncensored-leak", "fc2", "heyzo", "tokyohot", "1pondo", "caribbeancom", "caribbeancompr", "10musume", "pacopacomama", "gachinco", "xxxav", "marriedslash", "naughty4610", "naughty0930", "madou", "twav", "furuke");
        for (Element a : doc.select("nav a")) {
            String typeId = a.attr("href").replace(url, "");
            if (!typeIds.contains(typeId)) continue;
            classes.add(new Class(typeId, a.text()));
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
        return searchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, pg);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        QuickJSLoader.init();
        QuickJSContext ctx = QuickJSContext.create();
        String content = OkHttp.string(url + id);
        Pattern pattern = Pattern.compile("(eval\\(.*?\\))\\n", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(content);
        JSONObject js;
        if (matcher.find()) {
            String evalBlock = matcher.group(1);
            ctx.evaluate(evalBlock);
            js = new JSONObject(ctx.getGlobalObject().stringify());
        } else {
            return Result.get().parse().url(url + id).string();
        }
        List<String> url = new ArrayList<>();
        for (Iterator<String> it = js.keys(); it.hasNext();) {
            String key = it.next();
            url.add(key);
            url.add(js.getString(key));
        }
        return Result.get().url(url).string();
    }

    private String searchContent(String key, String pg) {
        List<Vod> list = new ArrayList<>();
        Document doc = Jsoup.parse(OkHttp.string(url + "search/" + key + "?page=" + pg));
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
}
