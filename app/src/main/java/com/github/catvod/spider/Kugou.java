package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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
public class Kugou extends Spider {

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<Vod> list = new ArrayList<>();
        List<String> typeIds = Arrays.asList("6666|0", "33162|1", "4681|2");
        List<String> typeNames = Arrays.asList("热门榜单", "特色音乐榜", "全球榜");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        return Result.string(classes, list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        HashMap<String, String> ext = new HashMap<>();
        if (extend != null && extend.size() > 0) ext.putAll(extend);
        String[] item = tid.split("\\|");
        String id = item[0];
        String digit = item[1];
        int digitValue = Integer.parseInt(digit);
        String cateId = ext.get("cateId") == null ? id : ext.get("cateId");
        String cateUrl = String.format("https://www.kugou.com/yy/rank/home/1-%s.html?from=rank", cateId);
        Document doc = Jsoup.parse(OkHttp.string(cateUrl, getHeader()));
        Elements lis = doc.select(".pc_rank_sidebar").eq(digitValue).select("ul li a");
        JSONArray videos = new JSONArray();
        for (Element li : lis) {
            String vid = li.attr("href");
            String name = li.attr("title");
            JSONObject vod = new JSONObject().put("vod_id", vid).put("vod_name", name);
            videos.put(vod);
        }
        JSONObject result = new JSONObject().put("total", lis.size()).put("pagecount", 1).put("list", videos);
        return result.toString();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Document doc = Jsoup.parse(OkHttp.string(ids.get(0), getHeader()));
        Elements playlist = doc.select(".pc_temp_songlist ul li");
        List<String> vodItems = new ArrayList<>();
        for (int j = 0; j < playlist.size(); j++) {
            Element a = playlist.get(j);
            String href = a.select("a.pc_temp_songname").attr("href");
            String text = a.select("a.pc_temp_songname").text();
            vodItems.add(text + "$" + href);
        }
        String title = doc.select(".pc_temp_title h3").text();
        String remark = doc.select(".rank_update").text();
        String vod_play_from = "Qile";
        String vod_play_url = TextUtils.join("#", vodItems);
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(title);
        vod.setVodRemarks(remark);
        vod.setVodPlayFrom(vod_play_from);
        vod.setVodPlayUrl(vod_play_url);
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).parse().header(getHeader()).string();
    }
}
