package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Crypto;
import com.github.catvod.utils.LZString;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author leospring
 * 聚合直播
 */
public class Living extends Spider {

    private String host = "https://lemonlive.deno.dev";
    private String cookie;

    @Override
    public void init(Context context, String extend) throws Exception {
        if (!TextUtils.isEmpty(extend)) {
            host = extend;
        }
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classList = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();

        classList.add(new Class("huya", "虎牙"));
        classList.add(new Class("douyu", "斗鱼"));
        classList.add(new Class("douyin", "抖音"));
        classList.add(new Class("bilibili", "哔哩哔哩"));
        classList.add(new Class("cc", "网易CC"));

        List<Filter> huyaFilterList = new ArrayList<>();
        List<Filter.Value> huyaVals = new ArrayList<>();
        huyaVals.add(new Filter.Value("网游", "1"));
        huyaVals.add(new Filter.Value("手游", "3"));
        huyaVals.add(new Filter.Value("娱乐", "8"));
        huyaVals.add(new Filter.Value("单机", "2"));
        huyaFilterList.add(new Filter("type", "分类", huyaVals));
        filters.put("huya", huyaFilterList);

        List<Filter> douyuFilterList = new ArrayList<>();
        List<Filter.Value> douyuVals = new ArrayList<>();
        douyuVals.add(new Filter.Value("网游竞技", "PCgame"));
        douyuVals.add(new Filter.Value("单机热游", "djry"));
        douyuVals.add(new Filter.Value("手游休闲", "syxx"));
        douyuVals.add(new Filter.Value("娱乐天地", "yl"));
        douyuVals.add(new Filter.Value("颜值", "yz"));
        douyuVals.add(new Filter.Value("科技文化", "kjwh"));
        douyuVals.add(new Filter.Value("语言互动", "yp"));
        douyuFilterList.add(new Filter("type", "分类", douyuVals));
        filters.put("douyu", douyuFilterList);

        List<Filter> douyinFilterList = new ArrayList<>();
        List<Filter.Value> douyinVals = new ArrayList<>();
        douyinVals.add(new Filter.Value("竞技游戏", "2"));
        douyinVals.add(new Filter.Value("射击游戏", "1"));
        douyinVals.add(new Filter.Value("单机游戏", "3"));
        douyinVals.add(new Filter.Value("棋牌游戏", "4"));
        douyinVals.add(new Filter.Value("休闲益智", "5"));
        douyinVals.add(new Filter.Value("角色扮演", "6"));
        douyinVals.add(new Filter.Value("策略卡牌", "7"));
        douyinVals.add(new Filter.Value("娱乐天地", "10000"));
        douyinVals.add(new Filter.Value("科技文化", "10001"));
        douyinFilterList.add(new Filter("type", "分类", douyinVals));
        filters.put("douyin", douyinFilterList);

        List<Filter> biliFilterList = new ArrayList<>();
        List<Filter.Value> biliVals = new ArrayList<>();
        biliVals.add(new Filter.Value("网游", "2"));
        biliVals.add(new Filter.Value("手游", "3"));
        biliVals.add(new Filter.Value("单机游戏", "6"));
        biliVals.add(new Filter.Value("娱乐", "1"));
        biliVals.add(new Filter.Value("电台", "5"));
        biliVals.add(new Filter.Value("虚拟主播", "9"));
        biliVals.add(new Filter.Value("聊天室", "14"));
        biliVals.add(new Filter.Value("生活", "10"));
        biliVals.add(new Filter.Value("知识", "11"));
        biliVals.add(new Filter.Value("赛事", "13"));
        biliVals.add(new Filter.Value("互动玩法", "15"));
        biliFilterList.add(new Filter("type", "分类", biliVals));
        filters.put("bilibili", biliFilterList);

        List<Filter> ccFilterList = new ArrayList<>();
        List<Filter.Value> ccVals = new ArrayList<>();
        ccVals.add(new Filter.Value("网游", "1"));
        ccVals.add(new Filter.Value("手游", "2"));
        ccVals.add(new Filter.Value("竞技", "4"));
        ccVals.add(new Filter.Value("综艺", "5"));
        ccFilterList.add(new Filter("type", "分类", ccVals));
        filters.put("cc", ccFilterList);
        return Result.string(classList, filters);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (!tid.contains("_")) {
            String url = host + "/api/" + tid + "/getCategories";
            JSONObject json = request(url);
            String type = extend.get("type");
            if (TextUtils.isEmpty(type)) type = json.optJSONArray("data").optJSONObject(0).optString("id");
            List<Vod> vodList = new ArrayList<>();
            for (int i = 0; i < json.optJSONArray("data").length(); i++) {
                JSONObject data = json.optJSONArray("data").optJSONObject(i);
                if (type.equals(data.optString("id"))) {
                    for (int j = 0; j < data.optJSONArray("list").length(); j++) {
                        JSONObject item = data.optJSONArray("list").optJSONObject(j);
                        vodList.add(new Vod(tid + "_" + item.optString("cid"), item.optString("name"), item.optString("pic"), data.optString("name"), true));
                    }
                }
            }
            return Result.string(vodList);
        } else {
            String[] split = tid.split("_");
            String url = host + "/api/" + split[0] + "/getCategoryRooms?id=" + split[1] + "&pid=" + (split[0].equals("bilibili") ? "2" : "1") + "&page=" + pg;
            if (!TextUtils.isEmpty(cookie)) {
                url = url + "&cookie=" + URLDecoder.decode(cookie, "UTF-8");
            }
            JSONObject json = request(url);
            if (!TextUtils.isEmpty(json.optJSONObject("data").optString("cookie"))) {
                cookie = json.optJSONObject("data").optString("cookie");
            }
            List<Vod> vodList = new ArrayList<>();
            for (int i = 0; i < json.optJSONObject("data").optJSONArray("list").length(); i++) {
                JSONObject data = json.optJSONObject("data").optJSONArray("list").optJSONObject(i);
                vodList.add(new Vod(split[0] + "_" + data.optString("roomId"), data.optString("title"), data.optString("cover"), data.optString("nickname")));
            }
            return Result.string(vodList);
        }
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String[] split = ids.get(0).split("_");
        String url = host + "/api/" + split[0] + "/getRoomDetail?id=" + split[1];
        JSONObject json = request(url).optJSONObject("data");
        Vod vod = new Vod();
        vod.setVodId(json.optString("roomId"));
        vod.setVodName(json.optString("title"));
        vod.setVodArea(json.optString("online"));
        vod.setVodDirector(json.optString("siteId"));
        vod.setVodActor(json.optString("nickname"));
        vod.setVodPic(json.optString("cover"));
        vod.setVodContent(json.optString("url"));
        vod.setTypeName(json.optString("category"));
        JSONObject info = json.optJSONObject("info");
        String params = "";
        if (info != null) {
            params = getHuyaParam(info.optString("name"), info.optString("code"));
        }
        List<String> fromList = new ArrayList<>();
        List<String> playList = new ArrayList<>();
        for (int i = 0; i < json.optJSONArray("stream").length(); i++) {
            JSONObject data = json.optJSONArray("stream").optJSONObject(i);
            fromList.add(data.optString("name"));
            List<String> nameUrls = new ArrayList<>();
            for (int j = 0; j < data.optJSONArray("lines").length(); j++) {
                JSONObject urls = data.optJSONArray("lines").optJSONObject(j);
                String playUrl = urls.optString("url") + params;
                nameUrls.add(urls.optString("name") + "$" + playUrl);
            }
            playList.add(TextUtils.join("#", nameUrls));
        }
        vod.setVodPlayFrom(TextUtils.join("$$$", fromList));
        vod.setVodPlayUrl(TextUtils.join("$$$", playList));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        if (!id.startsWith("http")) id = "https:" + id;
        return Result.get().url(id).toString();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        List<Vod> vodList = new ArrayList<>();
        vodList.addAll(searchWithSite("huya", key, pg));
        vodList.addAll(searchWithSite("douyu", key, pg));
        vodList.addAll(searchWithSite("douyin", key, pg));
        vodList.addAll(searchWithSite("bilibili", key, pg));
        return Result.string(vodList);
    }

    private String getSiteNameByEn(String en) {
        return Objects.equals(en, "huya") ? "虎牙"
                : Objects.equals(en, "douyu") ? "斗鱼"
                : Objects.equals(en, "douyin") ? "抖音"
                : Objects.equals(en, "bilibili") ? "哔哩哔哩"
                : Objects.equals(en, "cc") ? "网易CC" : "";
    }

    private List<Vod> searchWithSite(String site, String key, String pg) {
        try {
            List<Vod> vodList = new ArrayList<>();
            String url = host + "/api/" + site + "/searchRooms?page=" + pg + "&kw=" + key;
            JSONArray jsonArray = request(url).optJSONObject("data").optJSONArray("list");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject item = jsonArray.getJSONObject(i);
                vodList.add(new Vod(site + "_" + item.optString("roomId"), item.optString("nickname"), item.optString("cover"), getSiteNameByEn(site) + "/" + item.optString("category") + "/" + item.optString("title"), false));
            }
            return vodList;
        } catch (Exception ignored) {
            return Collections.emptyList();
        }
    }

    private String getHuyaParam(String name, String code) throws UnsupportedEncodingException {
        String N = "1063681129617";
        long currentTimeMillis = System.currentTimeMillis();
        String i = String.valueOf(currentTimeMillis % 10000000000L * 1000 + (long) (Math.random() * 4294967295L));
        String r = code.split("fs=")[1].split("&")[0];
        String s = Long.toHexString((currentTimeMillis / 1000) | 21600);
        String f = String.valueOf(currentTimeMillis + Long.parseLong(N));
        String fmPart = code.split("fm=")[1].split("&")[0];
        String c = new String(Base64.decode(URLDecoder.decode(fmPart, "UTF-8"), Base64.NO_WRAP)).split("_")[0];
        String u = Crypto.md5(f + "|tars_mp|102");
        return String.format("&wsSecret=%s&uuid=%s&wsTime=%s&uid=%s&seqid=%s&fs=%s&ctype=tars_mp&t=102&ver=1&sv=2401310321", Crypto.md5(c + "_" + N + "_" + name + "_" + u + "_" + s), i, s, N, f, r);
    }

    private JSONObject request(String url) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("sec-fetch-site", "same-origin");
        String str = OkHttp.string(url, map);
        String result = LZString.decompressFromBase64(str.replaceAll(" ", ""));
        return new JSONObject(result);
    }
}
