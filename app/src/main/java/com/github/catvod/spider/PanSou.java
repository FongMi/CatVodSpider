package com.github.catvod.spider;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ColaMint & FongMi
 */
public class PanSou extends Ali {

    private final String siteUrl = "https://www.alipansou.com";

    private Map<String, String> getHeaders(String id) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", siteUrl + id);
        headers.put("_bid", "6d14a5dd6c07980d9dc089a693805ad8");
        return headers;
    }

    private Map<String, String> getHeader() {
        HashMap<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        if (pattern.matcher(ids.get(0)).find()) return super.detailContent(ids);
        String url = siteUrl + ids.get(0).replace("/s/", "/cv/");
        url = OkHttp.getLocation(url, getHeaders(ids.get(0)));
        return super.detailContent(Arrays.asList(url));
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, pg);
    }

    private String searchContent(String key, String pg) {
        String url = siteUrl + "/search?k=" + URLEncoder.encode(key) + "&page=" + pg + "&s=0&t=-1";
        Elements items = Jsoup.parse(OkHttp.string(url, getHeader())).select("van-row > a");
        List<Vod> list = new ArrayList<>();
        for (Element item : items) {
            String title = item.selectFirst("template").text().trim();
            if (!title.contains(key)) continue;
            Vod vod = new Vod();
            vod.setVodId(item.attr("href"));
            vod.setVodPic("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
            vod.setVodName(title);
            list.add(vod);
        }
        return Result.string(list);
    }
}
