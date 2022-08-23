package com.github.catvod.spider.wait;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 不知名
 */
public class Anime1 extends Spider {

    private final JSONArray srcArray = new JSONArray();
    private final String vodPic = "https://sta.anicdn.com/playerImg/8.jpg";
    private String authority = "";
    private String cookies = "";

    private HashMap<String, String> getHeaders3() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authority", "d1zquzjgwo9yb.cloudfront.net");
        headers.put("Accept", "application/json, text/javascript, */*; q=0.01");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7,ja;q=0.6");
        headers.put("Origin", "https://anime1.me");
        headers.put("Referer", "https://anime1.me/");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.134 YaBrowser/22.7.1.755 (beta) Yowser/2.5 Safari/537.36");
        headers.put("Sec-Fetch-Dest", "empty");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Site", "cross-site");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("sec-ch-ua-platform", "\"Windows\"");
        headers.put("sec-ch-ua", " \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\" ");
        return headers;
    }

    private HashMap<String, String> getHeaders2() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authority", "v.anime1.me");
        headers.put("Accept", "*/*");
        headers.put("Accept-Language", "en,zh-TW;q=0.9,zh;q=0.8");
        headers.put("Origin", "https://anime1.me");
        headers.put("Referer", "https://anime1.me/");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.134 YaBrowser/22.7.1.755 (beta) Yowser/2.5 Safari/537.36");
        headers.put("Sec-Fetch-Dest", "empty");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Site", "same-site");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("sec-ch-ua-platform", "\"Windows\"");
        headers.put("sec-ch-ua", " \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\" ");
        return headers;
    }

    private HashMap<String, String> getHeaders1() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Accept", "*/*");
        headers.put("Accept-encoding", "identity;q=1, *;q=0");
        headers.put("Accept-language", "en,zh-TW;q=0.9,zh;q=0.8");
        headers.put("Referer", "https://anime1.me");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.134 YaBrowser/22.7.1.755 (beta) Yowser/2.5 Safari/537.36");
        headers.put("Sec-Fetch-Dest", "video");
        headers.put("Sec-Fetch-Mode", "no-cors");
        headers.put("Sec-Fetch-Site", "same-site");
        headers.put("sec-ch-ua-mobile", "?0");
        headers.put("sec-ch-ua-platform", "\"Windows\"");
        headers.put("sec-ch-ua", " \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\" ");
        headers.put("Authority", authority);
        headers.put("cookie", cookies);
        return headers;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            String srcurl = "https://d1zquzjgwo9yb.cloudfront.net/?_=" + System.currentTimeMillis();
            String srcOrignstr = OkHttpUtil.string(srcurl, getHeaders3());
            JSONArray srcOrign = new JSONArray(srcOrignstr);
            int srclen = srcOrign.length();
            for (int i = 0; i < srclen; i++) {
                JSONObject subobj = new JSONObject();
                subobj.put("link", srcOrign.getJSONArray(i).get(0).toString());
                subobj.put("name", srcOrign.getJSONArray(i).get(1).toString());
                subobj.put("hit", srcOrign.getJSONArray(i).get(2).toString());
                subobj.put("year", srcOrign.getJSONArray(i).get(3).toString());
                subobj.put("season", srcOrign.getJSONArray(i).get(4).toString());
                subobj.put("team", srcOrign.getJSONArray(i).get(5).toString());
                srcArray.put(subobj);
            }
            Result result = new Result();
            List<Class> classes = new ArrayList<>();
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR) + 1;
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    classes.add(new Class(i, "最近更新"));
                } else if (i < 7) {
                    year = year - 1;
                    classes.add(new Class(i, String.valueOf(year)));
                } else {
                    classes.add(new Class(i, "更早"));
                }
            }
            List<Vod> videos = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                String id = srcArray.getJSONObject(i).getString("link");
                String name = srcArray.getJSONObject(i).getString("name");
                String mark = srcArray.getJSONObject(i).getString("hit");
                videos.add(new Vod(id, name, vodPic, mark));
            }
            result.setClasses(classes);
            result.setList(videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONArray array = new JSONArray();
            int cateId = Integer.parseInt(tid);
            Calendar cal = Calendar.getInstance();
            int doy = cal.get(Calendar.YEAR) + 1;
            if (cateId == 0) {
                for (int i = 0; i < 100; i++) {
                    array.put(srcArray.getJSONObject(i));
                }
            } else if (cateId > 0 && cateId < 7) {
                int yearchk = doy - cateId;
                for (int i = 0; i < srcArray.length(); i++) {
                    JSONObject subobj = srcArray.getJSONObject(i);
                    String yystr = subobj.getString("year");
                    if (yystr.contains("/")) yystr = yystr.substring(5);
                    int yy = Integer.parseInt(yystr);
                    if (yy == yearchk) array.put(subobj);
                }
            } else {
                int yy = doy - 6;
                for (int i = 0; i < srcArray.length(); i++) {
                    JSONObject subobj = srcArray.getJSONObject(i);
                    String yearchk = subobj.getString("year");
                    if (yearchk.contains("/")) {
                        yearchk = yearchk.substring(5);
                    }
                    int yearint = Integer.parseInt(yearchk);
                    if (yearint < yy) array.put(subobj);
                }
            }
            List<Vod> videos = new ArrayList<>();
            for (int i = 0; i < array.length(); i++) {
                String id = array.getJSONObject(i).getString("link");
                String name = array.getJSONObject(i).getString("name");
                String mark = array.getJSONObject(i).getString("hit");
                videos.add(new Vod(id, name, vodPic, mark));
            }
            Result result = new Result();
            result.setList(videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String id = ids.get(0);
            JSONObject dtinfo = new JSONObject();
            for (int i = 0; i < srcArray.length(); i++) {
                JSONObject dtobj = srcArray.getJSONObject(i);
                String objid = dtobj.getString("link");
                if (objid.equals(id)) dtinfo = dtobj;
            }
            String title = dtinfo.getString("name");
            String mark = dtinfo.getString("hit");
            String year = dtinfo.getString("year");
            String season = dtinfo.getString("season");
            String team = dtinfo.getString("team");

            Result result = new Result();
            Vod vod = new Vod();
            vod.setVodId(ids.get(0));
            vod.setVodName(title);
            vod.setVodPic(vodPic);
            vod.setVodYear(year);
            vod.setTypeName(season);
            vod.setVodArea("日本");
            vod.setVodActor(team);
            vod.setVodContent(mark);

            String url = "https://anime1.me/?cat=" + id;
            Document doc = Jsoup.parse(OkHttpUtil.string(url, getHeaders2()));
            String nextPage;
            Map<String, String> vod_play_Order = new TreeMap<>();
            do {
                Element nextPageEle = doc.selectFirst("div.nav-previous a");
                if (nextPageEle != null) {
                    nextPage = nextPageEle.attr("href");
                } else {
                    nextPage = "";
                }
                Elements sources = doc.select("article");
                for (int i = 0; i < sources.size(); i++) {
                    Element source = sources.get(i);
                    Element sno = source.selectFirst("h2 > a");
                    String sourceNameori = "";
                    if (sno != null) {
                        sourceNameori = sno.text().trim();
                    } else {
                        Element sno2 = source.selectFirst("h2");
                        if (sno2 != null) {
                            sourceNameori = sno2.text().trim();
                        } else {
                            sourceNameori = "[No Title]";
                        }
                    }
                    int st = sourceNameori.indexOf("[") + 1;
                    int ed = sourceNameori.indexOf("]");
                    String sourceName = sourceNameori.substring(st, ed);
                    Elements playListA = source.select("div.vjscontainer video");
                    for (int j = 0; j < playListA.size(); j++) {
                        String playURL = playListA.get(j).attr("data-apireq");
                        if (playURL.isEmpty()) continue;
                        if (playListA.size() > 1) {
                            if (j < 9) {
                                int jj = j + 1;
                                String nn = sourceName + "0" + jj;
                                vod_play_Order.put(nn, playURL);
                            } else {
                                int jj = j + 1;
                                String nn = sourceName + jj;
                                vod_play_Order.put(nn, playURL);
                            }
                            continue;
                        }
                        String regex = ".*[a-zA-Z\\u4e00-\\u9fa5]+.*";
                        Matcher m = Pattern.compile(regex).matcher(sourceName);
                        if (m.matches()) {
                            vod_play_Order.put(sourceName, playURL);
                        } else {
                            float count = Float.parseFloat(sourceName);
                            if (count < 100.0) {
                                String nnn = "0" + sourceName;
                                vod_play_Order.put(nnn, playURL);
                            } else {
                                vod_play_Order.put(sourceName, playURL);
                            }
                        }
                    }
                }
                if (!nextPage.equals("")) {
                    doc = Jsoup.parse(OkHttpUtil.string(nextPage, getHeaders2()));
                }
            } while (!nextPage.equals(""));
            String playList = "";
            List<String> vodItems = new ArrayList<>();
            Set<Map.Entry<String, String>> entrySet = vod_play_Order.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                String key = entry.getKey();
                String value = entry.getValue();
                String pl = key + "$" + value;
                vodItems.add(pl);
            }
            if (vodItems.size() > 0) playList = TextUtils.join("#", vodItems);
            if (playList.length() == 0) playList = "nothing here";
            Map<String, String> vod_play = new TreeMap<>();
            vod_play.put("Anime1", playList);
            vod.setVodPlayFrom(TextUtils.join("$$$", vod_play.keySet()));
            vod.setVodPlayUrl(TextUtils.join("$$$", vod_play.values()));
            result.setList(Arrays.asList(vod));
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            authority = "";
            String url = "https://v.anime1.me/api";
            String jsonreq = URLDecoder.decode(id, "UTF-8");
            HashMap<String, String> reqpayload = new HashMap<>();
            reqpayload.put("d", jsonreq);
            Map<String, List<String>> respHeaderMap = new HashMap<>();
            String response = OkHttpUtil.string(url, reqpayload, getHeaders2(), respHeaderMap);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) sb.append(respHeaderMap.get("set-cookie").get(i).split(";")[0]).append(";");
            cookies = sb.toString();
            return Result.get().url(getVideoUrl(response)).header(getHeaders1()).toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private String getVideoUrl(String response) throws Exception {
        JSONObject obj = new JSONObject(response);
        JSONArray array = obj.getJSONArray("s");
        String m3u8url = "";
        String mp4url = "";
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj2 = array.getJSONObject(i);
            String m3u8chk = obj2.getString("src");
            if (m3u8chk.contains("m3u8")) {
                m3u8url = m3u8chk;
            } else {
                mp4url = m3u8chk;
            }
        }
        String videoUrl;
        if (m3u8url.length() > 0) {
            authority = m3u8url.split("/")[2];
            videoUrl = "https:" + m3u8url;
            String docm3u8 = OkHttpUtil.string(videoUrl, getHeaders1());
            if (docm3u8.contains("1080p.m3u8")) {
                videoUrl = videoUrl.replace("playlist", "1080p");
            } else if (docm3u8.contains("720p.m3u8")) {
                videoUrl = videoUrl.replace("playlist", "720p");
            } else {
                authority = mp4url.split("/")[2];
                videoUrl = "https:" + mp4url;
            }
        } else {
            authority = mp4url.split("/")[2];
            videoUrl = "https:" + mp4url;
        }
        return videoUrl;
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONArray searchResult = new JSONArray();
            for (int i = 0; i < srcArray.length(); i++) {
                JSONObject srobj = srcArray.getJSONObject(i);
                String kw = srobj.getString("name");
                if (kw.contains(key)) searchResult.put(srobj);
            }
            Result result = new Result();
            List<Vod> videos = new ArrayList<>();
            if (searchResult.length() > 0) {
                int ch = Math.min(searchResult.length(), 10);
                for (int i = 0; i < ch; i++) {
                    String id = searchResult.getJSONObject(i).getString("link");
                    String name = searchResult.getJSONObject(i).getString("name");
                    String mark = searchResult.getJSONObject(i).getString("hit");
                    videos.add(new Vod(id, name, vodPic, mark));
                }
            }
            result.setList(videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
