package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttpUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & FongMi
 */
public class PanSou extends Spider {

    private final Pattern regexAliUrl = Pattern.compile("(https:\\/\\/www.aliyundrive.com\\/s\\/[^\\\"]+)");
    private final String siteUrl = "https://www.alipansou.com";
    private Ali ali;

    @Override
    public void init(Context context, String extend) {
        ali = new Ali(extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0);
        Matcher matcher = regexAliUrl.matcher(url);
        if (matcher.find()) return ali.detailContent(ids);
        url = siteUrl + ids.get(0);
        String html = OkHttpUtil.string(url);
        matcher = regexAliUrl.matcher(html);
        if (!matcher.find()) return "";
        ids.set(0, matcher.group(1).replace("\\/", "/"));
        return ali.detailContent(ids);
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
