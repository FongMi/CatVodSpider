package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Qile
 */
public class JustLive extends Spider {

    private String siteUrl = "http://live.yj1211.work";

    private Map<String, String> getHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("User-Agent", Util.CHROME);
        return header;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        if (!extend.isEmpty()) siteUrl = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        List<String> typeIds = Arrays.asList("网游", "手游", "单机", "娱乐", "其他");
        List<String> typeNames = Arrays.asList("网游", "手游", "单机", "娱乐", "其他");
        for (int i = 0; i < typeIds.size(); i++) classes.add(new Class(typeIds.get(i), typeNames.get(i)));
        String f = "{\"网游\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"英雄联盟\", \"v\": \"英雄联盟\"},  {\"n\": \"无畏契约\", \"v\": \"无畏契约\"}, {\"n\": \"CS:GO\", \"v\": \"CS:GO\"}, {\"n\": \"APEX英雄\", \"v\": \"APEX英雄\"}, {\"n\": \"永劫无间\", \"v\": \"永劫无间\"}, {\"n\": \"穿越火线\", \"v\": \"穿越火线\"}, {\"n\": \"命运方舟\", \"v\": \"命运方舟\"}, {\"n\": \"DOTA2\", \"v\": \"DOTA2\"}, {\"n\": \"吃鸡行动\", \"v\": \"吃鸡行动\"},  {\"n\": \"逃离塔科夫\", \"v\": \"逃离塔科夫\"}, {\"n\": \"传奇\", \"v\": \"传奇\"}, {\"n\": \"DNF\", \"v\": \"DNF\"}, {\"n\": \"卡拉彼丘\", \"v\": \"卡拉彼丘\"}, {\"n\": \"幕后高手\", \"v\": \"幕后高手\"}, {\"n\": \"生死狙击2\", \"v\": \"生死狙击2\"}, {\"n\": \"洛奇英雄传\", \"v\": \"洛奇英雄传\"}, {\"n\": \"最终幻想14\", \"v\": \"最终幻想14\"}, {\"n\": \"重生边缘\", \"v\": \"重生边缘\"}, {\"n\": \"星际战甲\", \"v\": \"星际战甲\"}, {\"n\": \"梦三国\", \"v\": \"梦三国\"}, {\"n\": \"英魂之刃\", \"v\": \"英魂之刃\"}, {\"n\": \"剑网3\", \"v\": \"剑网3\"}]}], \"手游\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"王者荣耀\", \"v\": \"王者荣耀\"}, {\"n\": \"和平精英\", \"v\": \"和平精英\"}, {\"n\": \"原神\", \"v\": \"原神\"}, {\"n\": \"崩坏：星穹铁道\", \"v\": \"崩坏：星穹铁道\"}, {\"n\": \"第五人格\", \"v\": \"第五人格\"}, {\"n\": \"LOL手游\", \"v\": \"LOL手游\"}, {\"n\": \"明日方舟\", \"v\": \"明日方舟\"}, {\"n\": \"黎明觉醒：生机\", \"v\": \"黎明觉醒：生机\"}, {\"n\": \"蛋仔派对\", \"v\": \"蛋仔派对\"}, {\"n\": \"冒险岛手游\", \"v\": \"冒险岛手游\"}, {\"n\": \"闪耀！优俊少女\", \"v\": \"闪耀！优俊少女\"}, {\"n\": \"斯露德\", \"v\": \"斯露德\"}, {\"n\": \"千年之旅\", \"v\": \"千年之旅\"}, {\"n\": \"白夜极光\", \"v\": \"白夜极光\"}, {\"n\": \"逆水寒手游\", \"v\": \"逆水寒手游\"}, {\"n\": \"率土之滨\", \"v\": \"率土之滨\"}, {\"n\": \"月圆之夜\", \"v\": \"月圆之夜\"}]}],\"单机\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"主机游戏\", \"v\": \"主机游戏\"}, {\"n\": \"我的世界\", \"v\": \"我的世界\"}, {\"n\": \"独立游戏\", \"v\": \"独立游戏\"}, {\"n\": \"怀旧游戏\", \"v\": \"怀旧游戏\"}, {\"n\": \"猛兽派对\", \"v\": \"猛兽派对\"}, {\"n\": \"星空\", \"v\": \"星空\"}, {\"n\": \"塞尔达传说\", \"v\": \"塞尔达传说\"}, {\"n\": \"苍翼：混沌效应\", \"v\": \"苍翼：混沌效应\"}, {\"n\": \"命运2\", \"v\": \"命运2\"}, {\"n\": \"收获日3\", \"v\": \"收获日3\"}, {\"n\": \"机战佣兵VI 境界天火\", \"v\": \"机战佣兵VI 境界天火\"}, {\"n\": \"暗黑破坏神Ⅳ\", \"v\": \"暗黑破坏神Ⅳ\"}, {\"n\": \"匹诺曹的谎言\", \"v\": \"匹诺曹的谎言\"}, {\"n\": \"博德之门3\", \"v\": \"博德之门3\"}, {\"n\": \"绝世好武功\", \"v\": \"绝世好武功\"}, {\"n\": \"恐怖游戏\", \"v\": \"恐怖游戏\"}, {\"n\": \"Dark and Darker\", \"v\": \"Dark and Darker\"}, {\"n\": \"Warlander\", \"v\": \"Warlander\"}, {\"n\": \"FORZA 极限竞速\", \"v\": \"FORZA 极限竞速\"}, {\"n\": \"边境\", \"v\": \"边境\"}, {\"n\": \"生化危机\", \"v\": \"生化危机\"}]}], \"娱乐\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"聊天室\", \"v\": \"聊天室\"}, {\"n\": \"视频唱见\", \"v\": \"视频唱见\"}, {\"n\": \"萌宅领域\", \"v\": \"萌宅领域\"}, {\"n\": \"视频聊天\", \"v\": \"视频聊天\"}, {\"n\": \"舞见\", \"v\": \"舞见\"}, {\"n\": \"唱见电台\", \"v\": \"唱见电台\"}, {\"n\": \"聊天电台\", \"v\": \"聊天电台\"}, {\"n\": \"甜宠电台\", \"v\": \"甜宠电台\"}, {\"n\": \"TopStar\", \"v\": \"TopStar\"}, {\"n\": \"虚拟Singer\", \"v\": \"虚拟Singer\"}, {\"n\": \"虚拟Gamer\", \"v\": \"虚拟Gamer\"}, {\"n\": \"虚拟声优\", \"v\": \"虚拟声优\"}, {\"n\": \"虚拟日常\", \"v\": \"虚拟日常\"}, {\"n\": \"星秀\", \"v\": \"星秀\"}]}], \"其他\": [{\"key\": \"class\", \"name\": \"类型\", \"value\": [{\"n\": \"生活分享\", \"v\": \"生活分享\"}, {\"n\": \"户外\", \"v\": \"户外\"}, {\"n\": \"日常\", \"v\": \"日常\"}, {\"n\": \"情感\", \"v\": \"情感\"}, {\"n\": \"运动\", \"v\": \"运动\"}, {\"n\": \"搞笑\", \"v\": \"搞笑\"}, {\"n\": \"手工绘画\", \"v\": \"手工绘画\"}, {\"n\": \"萌宠\", \"v\": \"萌宠\"}, {\"n\": \"美食\", \"v\": \"美食\"}, {\"n\": \"时尚\", \"v\": \"时尚\"}, {\"n\": \"社科法律心理\", \"v\": \"社科法律心理\"}, {\"n\": \"人文历史\", \"v\": \"人文历史\"}, {\"n\": \"校园学习\", \"v\": \"校园学习\"}, {\"n\": \"职场·技能\", \"v\": \"职场·技能\"}, {\"n\": \"科技\", \"v\": \"科技\"}]}]}";
        JSONObject filterConfig = new JSONObject(f);
        String content = OkHttp.string(siteUrl + "/api/live/getRecommend?page=1&size=20", getHeader());
        List<Vod> list = new ArrayList<>();
        JSONArray dataArray = new JSONObject(content).getJSONArray("data");
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject jsonObject = dataArray.getJSONObject(i);
            String platform = jsonObject.getString("platForm");
            String roomId = jsonObject.getString("roomId");
            String categoryName = jsonObject.getString("categoryName");
            String roomName = jsonObject.getString("roomName");
            String name = categoryName + roomName;
            String pic = jsonObject.getString("roomPic");
            String remark = jsonObject.getString("ownerName");
            String vid = "platform=" + platform + "&roomId=" + roomId;
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(classes, list, filterConfig);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        Map<String, String> ClassTypeMap = new HashMap<>();
        ClassTypeMap.put("网游", "英雄联盟");
        ClassTypeMap.put("手游", "王者荣耀");
        ClassTypeMap.put("单机", "主机游戏");
        ClassTypeMap.put("娱乐", "聊天室");
        ClassTypeMap.put("其他", "生活分享");
        String cateId = extend.get("cateId") == null ? tid : extend.get("cateId");
        String classType = extend.get("class") == null ? ClassTypeMap.get(cateId) : extend.get("class");
        String cateUrl = siteUrl + String.format("/api/live/getRecommendByAreaAll?areaType=%s&area=%s&page=%s", cateId, classType, pg);
        String content = OkHttp.string(cateUrl, getHeader());
        List<Vod> list = new ArrayList<>();
        JSONArray dataArray = new JSONObject(content).getJSONArray("data");
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject jsonObject = dataArray.getJSONObject(i);
            String platform = jsonObject.getString("platForm");
            String roomId = jsonObject.getString("roomId");
            String categoryName = jsonObject.getString("categoryName");
            String name = jsonObject.getString("roomName");
            String pic = jsonObject.getString("roomPic");
            String remark = jsonObject.getString("ownerName");
            remark = remark + "-" + categoryName;
            String vid = "platform=" + platform + "&roomId=" + roomId;
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String getRoomInfo = siteUrl + "/api/live/getRoomInfo?" + ids.get(0);
        String getRealUrl = siteUrl + "/api/live/getRealUrlMultiSource?" + ids.get(0);
        String content = OkHttp.string(getRealUrl, getHeader());
        String content1 = OkHttp.string(getRoomInfo, getHeader());
        JSONObject dataObject = new JSONObject(content).getJSONObject("data");
        List<String> lineNames = new ArrayList<>();
        List<String> vodItems = new ArrayList<>();
        Iterator<String> keys = dataObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            if (key.startsWith("线路")) lineNames.add(key);
        }
        Collections.sort(lineNames, (line1, line2) -> {
            int num1 = Integer.parseInt(line1.substring(2));
            int num2 = Integer.parseInt(line2.substring(2));
            return Integer.compare(num1, num2);
        });
        for (String lineName : lineNames) {
            JSONArray lineArray = dataObject.getJSONArray(lineName);
            List<String> episodeItems = new ArrayList<>();
            for (int i = 0; i < lineArray.length(); i++) {
                JSONObject item = lineArray.getJSONObject(i);
                String qualityName = item.getString("qualityName");
                String playUrl = item.getString("playUrl");
                episodeItems.add(qualityName + "$" + playUrl);
            }
            vodItems.add(TextUtils.join("#", episodeItems));
        }
        String vod_play_from = TextUtils.join("$$$", lineNames);
        String vod_play_urls = TextUtils.join("$$$", vodItems);
        JSONObject data = new JSONObject(content1).getJSONObject("data");
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodPic(data.getString("roomPic"));
        vod.setVodName(data.getString("roomName"));
        vod.setVodArea(data.getString("platForm").replace("douyu", "斗鱼").replace("huya", "虎牙").replace("bilibili", "哔哩哔哩").replace("douyin", "抖音").replace("cc", "网易CC"));
        vod.setVodActor(data.getString("ownerName"));
        vod.setVodRemarks("在线" + data.getInt("online") + "人");
        vod.setVodContent(getRealUrl);
        vod.setVodDirector("Qile");
        vod.setTypeName(data.getString("categoryName"));
        vod.setVodPlayFrom(vod_play_from);
        vod.setVodPlayUrl(vod_play_urls);
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        String searchUrl = siteUrl + "/api/live/search?platform=all&keyWords=" + URLEncoder.encode(key) + "&uid=35717d71548f4ec9ab6f327cc16ad2bf";
        String content = OkHttp.string(searchUrl, getHeader());
        List<Vod> list = new ArrayList<>();
        JSONArray dataArray = new JSONObject(content).getJSONArray("data");
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject jsonObject = dataArray.getJSONObject(i);
            String platform = jsonObject.optString("platform");
            String roomId = jsonObject.optString("roomId");
            String name = jsonObject.optString("nickName");
            String pic = jsonObject.optString("headPic");
            String remark = jsonObject.optString("isLive");
            remark = remark.equals("1") ? "直播中" : "未开播";
            String vid = "platform=" + platform + "&roomId=" + roomId;
            list.add(new Vod(vid, name, pic, remark));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).header(getHeader()).string();
    }
}
