package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.bean.VodCategory;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import com.github.catvod.bean.VodItem;
import com.github.catvod.bean.VodResult;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.json.JSONObject;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PTT extends Spider {
    private String baseUrl = "https://ptt.red/";
    private String b;

    private Map<String, String> buildHeader() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        map.put("Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        return map;

    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(baseUrl + "p/" + str).buildUpon();
        if (!TextUtils.isEmpty(map.get("c"))) {
            StringBuilder sbB = new StringBuilder("c/");
            sbB.append(map.get("c"));
            builderBuildUpon.appendEncodedPath(sbB.toString());
        }
        if (!TextUtils.isEmpty(map.get("area"))) {
            builderBuildUpon.appendQueryParameter("area_id", map.get("area"));
        }
        if (!TextUtils.isEmpty(map.get("year"))) {
            builderBuildUpon.appendQueryParameter("year", map.get("year"));
        }
        if (!TextUtils.isEmpty(map.get("sort"))) {
            builderBuildUpon.appendQueryParameter("sort", map.get("sort"));
        }
        builderBuildUpon.appendQueryParameter("page", str2);
        Document doc = Jsoup.parse(OkHttpUtil.string(builderBuildUpon.toString(), buildHeader()));
        ArrayList arrayList = new ArrayList();
        for (Element mVar : doc.select("div.card > div.embed-responsive")) {
            Element mVar2 = mVar.select("a").get(0);
            Element mVar3 = mVar2.select("img").get(0);
            String strS0 = mVar.select("span.badge.badge-success").get(0).text();
            String strC = mVar3.attr("src").startsWith("http") ? mVar3.attr("src") : baseUrl + mVar3.attr("src");
            String strC2 = mVar3.attr("alt");
            if (!TextUtils.isEmpty(strC2)) {
                arrayList.add(new VodItem(mVar2.attr("href").substring(3), strC2, strC, strS0));
            }
        }
        return VodResult.n(arrayList);
    }

    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(baseUrl);
        Document doc = Jsoup.parse(OkHttpUtil.string(sb.toString() + list.get(0) + "/1", buildHeader()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Element mVar : doc.select("ul#w1 > li > a")) {
            linkedHashMap.put(mVar.attr("href").split("/")[3], mVar.attr("title"));
        }
        Elements c1036gL0 = doc.select("div > a.seq.border");
        for (String str : linkedHashMap.keySet()) {
            ArrayList arrayList2 = new ArrayList();
            for (Element mVar2 : c1036gL0) {
                arrayList2.add(mVar2.text() + "$" + list.get(0) + "/" + mVar2.attr("href").split("/")[2] + "/" + str);
            }
            if (arrayList2.isEmpty()) {
                StringBuilder sbB = new StringBuilder("1$");
                sbB.append(list.get(0));
                sbB.append("/1/");
                sbB.append(str);
                arrayList2.add(sbB.toString());
            }
            arrayList.add(TextUtils.join("#", arrayList2));
        }
        VodItem iVar = new VodItem();
        iVar.o(TextUtils.join("$$$", linkedHashMap.values()));
        iVar.p(TextUtils.join("$$$", arrayList));
        return VodResult.m(iVar);
    }

    public String homeContent(boolean z) {
        Document doc = Jsoup.parse(OkHttpUtil.string(baseUrl, buildHeader()));
        ArrayList arrayList = new ArrayList();
        for (Element mVar : doc.select("li > a.px-2.px-sm-3.py-2.nav-link")) {
            arrayList.add(new VodCategory(mVar.attr("href").replace("/p/", ""), mVar.text()));
        }
        return VodResult.o(arrayList, new JSONObject(TextUtils.isEmpty(this.b) ? "{}" : OkHttpUtil.string(this.b)));
    }

    public void init(Context context, String str) {
        this.b = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcher = Pattern.compile("contentUrl\":\"(.*?)\"").matcher(OkHttpUtil.string(baseUrl + str2));
        if (!matcher.find()) {
            return VodResult.c("");
        }
        VodResult gVar = new VodResult();
        gVar.w(matcher.group(1).replace("\\", ""));
        return gVar.toString();
    }

    public String searchContent(String str, boolean z) {
        return searchContent(str, z, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        Document doc = Jsoup.parse(OkHttpUtil.string(baseUrl + String.format("q/%s?page=%s", str, str2), buildHeader()));
        ArrayList arrayList = new ArrayList();
        for (Element mVar : doc.select("div.card > div.embed-responsive")) {
            Element mVar2 = mVar.select("a").get(0);
            Element mVar3 = mVar2.select("img").get(0);
            String strS0 = mVar.select("span.badge.badge-success").get(0).text();
            String strC = mVar3.attr("src").startsWith("http") ? mVar3.attr("src") : this.baseUrl + mVar3.attr("src");
            String strC2 = mVar3.attr("alt");
            if (!TextUtils.isEmpty(strC2)) {
                arrayList.add(new VodItem(mVar2.attr("href").substring(3), strC2, strC, strS0));
            }
        }
        return VodResult.n(arrayList);
    }
}
