package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 不知名
 */
public class Yj1211 extends Spider {

    @Override
    public String homeContent(boolean filter) {
        try {
            String srcurl = "http://live.yj1211.work/api/live/getRecommend?page=1&size=20";
            String srcOrignstr = "";
            for (int i = 0; i < 3; i++) {
                srcOrignstr = OkHttpUtil.string(srcurl, getHeaders());
                if (srcOrignstr.length() > 0) {
                    break;
                } else {
                    Thread.sleep(1000);
                }
            }
            JSONObject srcori = new JSONObject(srcOrignstr);
            JSONArray srcoria = srcori.getJSONArray("data");
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            String catestr = "{\"推荐\":\"?\",\"斗鱼\":\"ByPlatform?platform=douyu&\",\"哔哩哔哩\":\"ByPlatform?platform=bilibili&\",\"虎牙\":\"ByPlatform?platform=huya&\",\"网易CC\":\"ByPlatform?platform=cc&\"}";
            JSONObject catedef = new JSONObject(catestr);
            Iterator<String> it = catedef.keys();
            while (it.hasNext()) {
                JSONObject jsonObject = new JSONObject();
                String key = (String) it.next();
                jsonObject.put("type_name", key);
                jsonObject.put("type_id", catedef.getString(key));
                classes.put(jsonObject);
            }
            result.put("class", classes);
            JSONObject filterConfig = new JSONObject();
            String geta = "http://live.yj1211.work/api/live/getAllAreas";
            String aaid = "";
            for (int i = 0; i < 3; i++) {
                aaid = OkHttpUtil.string(geta, getHeaders());
                if (aaid.length() > 0) {
                    break;
                } else {
                    Thread.sleep(1000);
                }
            }
            JSONObject aido = new JSONObject(aaid);
            JSONArray aidoa = aido.getJSONArray("data");
            JSONArray extendsAll = new JSONArray();
            for (int j = 0; j < 13; j++) {
                JSONObject newTypeExtend = new JSONObject();
                String typeName = aidoa.getJSONArray(j).getJSONObject(0).getString("typeName");
                newTypeExtend.put("key", "typeName" + j);
                newTypeExtend.put("name", typeName);
                JSONArray newTypeExtendKV = new JSONArray();
                int fg = Math.min(aidoa.getJSONArray(j).length(), 20);
                JSONObject kv = new JSONObject();
                kv.put("n", "全部");
                kv.put("v", typeName + "=" + "all");
                newTypeExtendKV.put(kv);
                for (int k = 0; k < fg; k++) {
                    kv = new JSONObject();
                    String areaName = aidoa.getJSONArray(j).getJSONObject(k).getString("areaName");
                    kv.put("n", areaName);
                    kv.put("v", typeName + "=" + areaName);
                    newTypeExtendKV.put(kv);
                }
                newTypeExtend.put("value", newTypeExtendKV);
                extendsAll.put(newTypeExtend);
            }
            for (int i = 0; i < 5; i++) {
                String typeId = classes.getJSONObject(i).getString("type_id");
                filterConfig.put(typeId, extendsAll);
            }
            JSONArray videos = new JSONArray();
            int ch = Math.min(srcoria.length(), 10);
            for (int i = 0; i < ch; i++) {
                JSONObject srchome = new JSONObject();
                String platForm = srcoria.getJSONObject(i).getString("platForm");
                String rd = srcoria.getJSONObject(i).getString("roomId");
                String id = platForm + "&" + rd;
                String name = srcoria.getJSONObject(i).getString("ownerName");
                String pic = srcoria.getJSONObject(i).getString("ownerHeadPic");
                String mark = srcoria.getJSONObject(i).getString("categoryName");
                srchome.put("vod_id", id);
                srchome.put("vod_name", name);
                srchome.put("vod_pic", pic);
                srchome.put("vod_remarks", mark);
                videos.put(srchome);
            }
            if (filter) {
                result.put("filters", filterConfig);
            }
            result.put("list", videos);
            return result.toString();
        } catch (
                Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String catt = "";
            switch (tid) {
                case "?":
                    catt = "all";
                    break;
                case "ByPlatform?platform=douyu&":
                    catt = "douyu";
                    break;
                case "ByPlatform?platform=bilibili&":
                    catt = "bilibili";
                    break;
                case "ByPlatform?platform=huya&":
                    catt = "huya";
                    break;
                case "ByPlatform?platform=cc&":
                    catt = "cc";
                    break;
            }
            extend = extend == null ? new HashMap<>() : extend;
            String srcurl = "";
            String[] cate = new String[13];
            int pp = 0;
            for (int i = 0; i < 13; i++) {
                cate[i] = extend.containsKey("typeName" + i) ? extend.get("typeName" + i) : ("typeName" + i + "=" + "all");
                String[] info = cate[i].split("=");
                String area = info[1];
                if (!area.contains("all")) {
                    pp = pp + 1;
                }
            }
            if (pp == 1) {
                for (int i = 0; i < 13; i++) {
                    String[] info = cate[i].split("=");
                    String areaType = info[0];
                    String area = info[1];
                    if (!area.contains("all")) {
                        String urlft = "http://live.yj1211.work/api/live/getRecommendByAreaAll?areaType={areaType}&area={area}&page={pg}";
                        srcurl = urlft.replace("{areaType}", URLEncoder.encode(areaType)).replace("{area}", URLEncoder.encode(area)).replace("{pg}", pg);
                        break;
                    }
                }
            } else if (pp == 0 || pp > 1) {
                String urlft = "http://live.yj1211.work/api/live/getRecommend{tid}page={pg}&size=20";
                srcurl = urlft.replace("{tid}", tid).replace("{pg}", pg);
            }
            String srcOrignstr = "";
            for (int i = 0; i < 3; i++) {
                srcOrignstr = OkHttpUtil.string(srcurl, getHeaders());
                if (srcOrignstr.length() > 0) {
                    break;
                } else {
                    Thread.sleep(1000);
                }
            }
            JSONObject srcori = new JSONObject(srcOrignstr);
            JSONArray srcoria = srcori.getJSONArray("data");
            JSONObject result = new JSONObject();
            JSONArray videos = new JSONArray();
            for (int i = 0; i < srcoria.length(); i++) {
                JSONObject srchome = new JSONObject();
                String platForm = srcoria.getJSONObject(i).getString("platForm");
                if (pp == 1 && !catt.equals("all")) {
                    if (!platForm.equals(catt)) {
                        continue;
                    }
                }
                String rd = srcoria.getJSONObject(i).getString("roomId");
                String id = platForm + "&" + rd;
                String name = srcoria.getJSONObject(i).getString("ownerName");
                String pic = srcoria.getJSONObject(i).getString("ownerHeadPic");
                String mark = srcoria.getJSONObject(i).getString("categoryName");
                srchome.put("vod_id", id);
                srchome.put("vod_name", name);
                srchome.put("vod_pic", pic);
                srchome.put("vod_remarks", mark);
                videos.put(srchome);
            }
            if (videos.length() == 0) {
                JSONObject srchome = new JSONObject();
                srchome.put("vod_id", 111);
                srchome.put("vod_name", "此页无符合");
                srchome.put("vod_pic", "");
                srchome.put("vod_remarks", "nothing");
                videos.put(srchome);
            }
            if (pp == 1) {
                result.put("pagecount", 50);
                result.put("limit", 1);
            } else {
                result.put("pagecount", Integer.MAX_VALUE);
                result.put("limit", 90);
            }
            result.put("list", videos);
            result.put("page", pg);
            result.put("total", Integer.MAX_VALUE);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.134 YaBrowser/22.7.1.755 (beta) Yowser/2.5 Safari/537.36");
        return headers;
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String id = ids.get(0);
            String[] info = id.split("&");
            String platform = info[0];
            String roomId = info[1];
            String srcurl = "http://live.yj1211.work/api/live/getRoomInfo?platform=" + platform + "&roomId=" + roomId;
            String srcplayurl = "http://live.yj1211.work/api/live/getRealUrl?platform=" + platform + "&roomId=" + roomId;
            String srcdtlstr = OkHttpUtil.string(srcurl, getHeaders());
            String srcdtlplay = OkHttpUtil.string(srcplayurl, getHeaders());
            JSONObject srcdtl = new JSONObject(srcdtlstr);
            JSONObject srcdtlo = srcdtl.getJSONObject("data");
            JSONObject srcdtplay = new JSONObject(srcdtlplay);
            JSONObject srcdtplayo = srcdtplay.getJSONObject("data");
            String title = srcdtlo.getString("roomName");
            String pic = srcdtlo.getString("roomPic");
            String director = srcdtlo.getString("ownerName") + " RoomID:" + srcdtlo.getString("roomId");
            String content = srcdtlo.getString("categoryName");
            String actor = "观看人数:" + srcdtlo.getString("online");
            String area = srcdtlo.getString("platForm");
            String typechk = srcdtlo.optString("isLive");
            String type = typechk.equals("") ? "录播" : "正在直播中";
            JSONObject result = new JSONObject();
            JSONObject vodList = new JSONObject();
            vodList.put("vod_id", ids.get(0));
            vodList.put("vod_pic", pic);
            vodList.put("vod_name", title);
            vodList.put("vod_area", area);
            vodList.put("type_name", type);
            vodList.put("vod_actor", actor);
            vodList.put("vod_director", director);
            vodList.put("vod_content", content);
            String playList = "";
            String pl = "";
            List<String> vodItems = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                String[] qq = new String[]{"OD", "HD", "SD", "LD", "FD"};
                String qa = srcdtplayo.optString(qq[i]);
                if (qa.isEmpty()) {
                    continue;
                }
                switch (qq[i]) {
                    case "OD":
                        pl = "原画" + "$" + qa;
                        break;
                    case "HD":
                        pl = "超清" + "$" + qa;
                        break;
                    case "SD":
                        pl = "高清" + "$" + qa;
                        break;
                    case "LD":
                        pl = "清晣" + "$" + qa;
                        break;
                    case "FD":
                        pl = "流畅" + "$" + qa;
                        break;
                }
                vodItems.add(pl);
            }
            if (vodItems.size() > 0)
                playList = TextUtils.join("#", vodItems);

            if (playList.length() == 0)
                playList = "NoStream$nolink";

            Map<String, String> vod_play = new TreeMap<>();
            vod_play.put("YJ1211", playList);
            String vod_play_from = TextUtils.join("$$$", vod_play.keySet());
            String vod_play_url = TextUtils.join("$$$", vod_play.values());
            vodList.put("vod_play_from", vod_play_from);
            vodList.put("vod_play_url", vod_play_url);

            JSONArray list = new JSONArray();
            list.put(vodList);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            JSONObject result = new JSONObject();
            result.put("header", getHeaders());
            result.put("parse", 1);
            result.put("playUrl", "");
            result.put("url", id);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String url = "http://live.yj1211.work/api/live/search?platform=all&keyWords=" + URLEncoder.encode(key) + "&isLive=0";
            String content = "";
            for (int i = 0; i < 3; i++) {
                content = OkHttpUtil.string(url, getHeaders());
                if (content.length() > 0) {
                    break;
                } else {
                    Thread.sleep(1000);
                }
            }
            JSONObject searchResult = new JSONObject(content);
            JSONArray sra = searchResult.getJSONArray("data");
            JSONObject result = new JSONObject();
            JSONArray videos = new JSONArray();
            if (sra.length() > 0) {
                int ch = Math.min(sra.length(), 20);
                for (int i = 0; i < ch; i++) {
                    JSONObject srat = new JSONObject();
                    String platForm = sra.getJSONObject(i).getString("platform");
                    String rd = sra.getJSONObject(i).getString("roomId");
                    String id = platForm + "&" + rd;
                    String name = sra.getJSONObject(i).getString("nickName");
                    String pic = sra.getJSONObject(i).getString("headPic");
                    String mark = "";
                    if (!sra.getJSONObject(i).isNull("cateName")) {
                        mark = sra.getJSONObject(i).getString("cateName");
                    }
                    srat.put("vod_remarks", mark);
                    srat.put("vod_id", id);
                    srat.put("vod_name", name);
                    srat.put("vod_pic", pic);

                    videos.put(srat);
                }
            }
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
