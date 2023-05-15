package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhixc
 */
public class TuGou extends Ali {

    private final String URL = "https://tugousou.com";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Utils.CHROME);
        header.put("Host", "tugousou.com");
        header.put("Origin", URL);
        header.put("Referer", URL + "/");
        return header;
    }

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        Map<String, String> params = new HashMap<>();
        params.put("keyword", key);
        String html = OkHttp.post(URL + "/search", params, getHeader());
        Element container = Jsoup.parse(html).select(".layui-container").get(1);
        Elements aElements = container.select("p[class=layui-font-16] > a");
        Elements pElements = container.select("p[class=layui-font-14 layui-font-gray text-align-right]");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < aElements.size(); i++) {
            Element item = aElements.get(i);
            String vodId = item.attr("href");
            String name = item.text();
            String pic = "https://inews.gtimg.com/newsapp_bt/0/13263837859/1000";
            String remark = pElements.get(i).text();
            list.add(new Vod(vodId, name, pic, remark));
        }
        return Result.string(list);
    }
}