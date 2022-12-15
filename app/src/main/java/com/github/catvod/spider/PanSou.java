package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;
import com.github.catvod.utils.Misc;

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
public class PanSou extends Spider {

    private final String siteUrl = "https://www.alipansou.com";
    private Ali ali;

    private Map<String, String> getHeaders(String id) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Misc.CHROME);
        headers.put("Referer", siteUrl + id);
        headers.put("_bid", "6d14a5dd6c07980d9dc089a693805ad8");
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        ali = new Ali(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = siteUrl + ids.get(0).replace("/s/", "/cv/");
        Map<String, List<String>> respHeaders = new HashMap<>();
        OkHttpUtil.stringNoRedirect(url, getHeaders(ids.get(0)), respHeaders);
        url = OkHttpUtil.getRedirectLocation(respHeaders);
        return ali.detailContent(Arrays.asList(url));
    }

    @Override
    public String searchContent(String key, boolean quick) {
        Map<String, String> types = new HashMap<>();
        types.put("7", "資料夾");
        types.put("1", "影片");
        List<Vod> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : types.entrySet()) {
            String typeId = entry.getKey();
            String typeName = entry.getValue();
            String url = siteUrl + "/search?k=" + URLEncoder.encode(key) + "&t=" + typeId;
            Elements items = Jsoup.parse(OkHttpUtil.string(url)).select("van-row > a");
            for (Element item : items) {
                String title = item.selectFirst("template").text().trim();
                if (!title.contains(key)) continue;
                Vod vod = new Vod();
                vod.setVodId(item.attr("href"));
                vod.setVodName("[" + typeName + "] " + title);
                vod.setVodPic("https://inews.gtimg.com/newsapp_bt/0/13263837859/1000");
                list.add(vod);
            }
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return ali.playerContent(flag, id);
    }
}
