package com.github.catvod.bean.xpath;

import com.github.catvod.crawler.SpiderDebug;

import org.json.JSONObject;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rule {
    /**
     * user-agent
     */
    private String ua;
    /**
     * 取得分類和首頁推薦的Url
     */
    private String homeUrl;
    /**
     * 分類節點 xpath
     */
    private String cateNode;
    /**
     * 分類節點名 xpath
     */
    private String cateName;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateNameR;
    /**
     * 分類節點 id xpath
     */
    private String cateId;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateIdR;
    /**
     * 手動指定分類如果有則不從 homeUrl 中獲取分類
     */
    private final LinkedHashMap<String, String> cateManual = new LinkedHashMap<>();

    /**
     * 篩選
     */
    private JSONObject filter;

    /**
     * 更新推薦影片節點 xpath
     */
    private String homeVodNode;
    /**
     * 更新推薦影片名稱 xpath
     */
    private String homeVodName;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern homeVodNameR;
    /**
     * 更新推薦影片 id xpath
     */
    private String homeVodId;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern homeVodIdR;
    /**
     * 更新推薦影片圖片 xpath
     */
    private String homeVodImg;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern homeVodImgR;
    /**
     * 更新推薦影片簡介 xpath
     */
    private String homeVodMark;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern homeVodMarkR;
    /**
     * 分類頁地址
     */
    private String cateUrl;
    /**
     * 分類頁影片節點 xpath
     */
    private String cateVodNode;
    /**
     * 分類頁影片名稱 xpath
     */
    private String cateVodName;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateVodNameR;
    /**
     * 分類頁影片影片id xpath
     */
    private String cateVodId;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateVodIdR;
    /**
     * 分類頁影片影片圖片 xpath
     */
    private String cateVodImg;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateVodImgR;
    /**
     * 分類頁影片影片簡介 xpath
     */
    private String cateVodMark;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern cateVodMarkR;

    /**
     * 詳情頁面
     */
    private String dtUrl;
    /**
     * 詳情節點 xpath
     */
    private String dtNode;
    /**
     * 詳情影片 xpath
     */
    private String dtName;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtNameR;
    /**
     * 詳情影片圖片 xpath
     */
    private String dtImg;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtImgR;
    /**
     * 詳情影片分類 xpath
     */
    private String dtCate;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtCateR;
    /**
     * 詳情影片年份 xpath
     */
    private String dtYear;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtYearR;
    /**
     * 詳情影片地區 xpath
     */
    private String dtArea;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtAreaR;
    /**
     * 詳情影片簡介 xpath
     */
    private String dtMark;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtMarkR;
    /**
     * 詳情演員 xpath
     */
    private String dtActor;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtActorR;
    /**
     * 詳情導演 xpath
     */
    private String dtDirector;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtDirectorR;
    /**
     * 詳情說明 xpath
     */
    private String dtDesc;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern dtDescR;

    /**
     * 詳情播放來源節點
     */
    private String dtFromNode;
    /**
     * 詳情播放來源名稱 xpath
     */
    private String dtFromName;
    /**
     * 詳情
     */
    private Pattern dtFromNameR;
    /**
     * 詳情播放地址列表節點  xpath
     */
    private String dtUrlNode;
    /**
     * 詳情播放地址節點  xpath
     */
    private String dtUrlSubNode;
    /**
     * 詳情播放地址id  xpath
     */
    private String dtUrlId;
    /**
     * 詳情
     */
    private Pattern dtUrlIdR;
    /**
     * 詳情播放地址名稱  xpath
     */
    private String dtUrlName;
    /**
     * 詳情
     */
    private Pattern dtUrlNameR;
    /**
     * 播放頁面url
     */
    private String playUrl;
    /**
     * 播放解析調用ua
     */
    private String playUa;
    /**
     * 播放解析調用referer
     */
    private String playReferer;

    /**
     * 搜尋頁地址
     */
    private String searchUrl;

    /**
     * 搜尋頁影片節點 xpath
     */
    private String scVodNode;
    /**
     * 搜尋頁影片名稱 xpath
     */
    private String scVodName;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern scVodNameR;
    /**
     * 搜尋頁影片id xpath
     */
    private String scVodId;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern scVodIdR;
    /**
     * 搜尋頁影片圖片 xpath
     */
    private String scVodImg;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern scVodImgR;
    /**
     * 搜尋頁影片簡介 xpath
     */
    private String scVodMark;
    /**
     * 正則對取到的數據進行二次處理
     */
    private Pattern scVodMarkR;

    private static Pattern getPattern(JSONObject json, String key) {
        String v = json.optString(key).trim();
        if (v.isEmpty())
            return null;
        else {
            try {
                return Pattern.compile(v);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        return null;
    }

    private static String doReplaceRegex(Pattern pattern, String src) {
        if (pattern == null)
            return src;
        try {
            Matcher matcher = pattern.matcher(src);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return src;
    }

    public static Rule fromJson(String json) {
        try {
            JSONObject jsonObj = new JSONObject(json);
            Rule rule = new Rule();
            rule.ua = jsonObj.optString("ua");
            rule.homeUrl = jsonObj.optString("homeUrl").trim();
            rule.cateNode = jsonObj.optString("cateNode").trim();
            rule.cateName = jsonObj.optString("cateName").trim();
            rule.cateNameR = getPattern(jsonObj, "cateNameR");
            rule.cateId = jsonObj.optString("cateId").trim();
            rule.cateIdR = getPattern(jsonObj, "cateIdR");
            JSONObject navs = jsonObj.optJSONObject("cateManual");
            if (navs != null) {
                Iterator<String> keys = navs.keys();
                while (keys.hasNext()) {
                    String name = keys.next();
                    rule.cateManual.put(name.trim(), navs.getString(name).trim());
                }
            }
            rule.filter = jsonObj.optJSONObject("filter");
            rule.homeVodNode = jsonObj.optString("homeVodNode").trim();
            rule.homeVodName = jsonObj.optString("homeVodName").trim();
            rule.homeVodNameR = getPattern(jsonObj, "homeVodNameR");
            rule.homeVodId = jsonObj.optString("homeVodId").trim();
            rule.homeVodIdR = getPattern(jsonObj, "homeVodIdR");
            rule.homeVodImg = jsonObj.optString("homeVodImg").trim();
            rule.homeVodImgR = getPattern(jsonObj, "homeVodImgR");
            rule.homeVodMark = jsonObj.optString("homeVodMark").trim();
            rule.homeVodMarkR = getPattern(jsonObj, "homeVodMarkR");
            rule.cateUrl = jsonObj.optString("cateUrl").trim();
            rule.cateVodNode = jsonObj.optString("cateVodNode").trim();
            rule.cateVodName = jsonObj.optString("cateVodName").trim();
            rule.cateVodNameR = getPattern(jsonObj, "cateVodNameR");
            rule.cateVodId = jsonObj.optString("cateVodId").trim();
            rule.cateVodIdR = getPattern(jsonObj, "cateVodIdR");
            rule.cateVodImg = jsonObj.optString("cateVodImg").trim();
            rule.cateVodImgR = getPattern(jsonObj, "cateVodImgR");
            rule.cateVodMark = jsonObj.optString("cateVodMark").trim();
            rule.cateVodMarkR = getPattern(jsonObj, "cateVodMarkR");
            rule.dtUrl = jsonObj.optString("dtUrl");
            rule.dtNode = jsonObj.optString("dtNode");
            rule.dtName = jsonObj.optString("dtName");
            rule.dtNameR = getPattern(jsonObj, "dtNameR");
            rule.dtImg = jsonObj.optString("dtImg");
            rule.dtImgR = getPattern(jsonObj, "dtImgR");
            rule.dtCate = jsonObj.optString("dtCate");
            rule.dtCateR = getPattern(jsonObj, "dtCateR");
            rule.dtYear = jsonObj.optString("dtYear");
            rule.dtYearR = getPattern(jsonObj, "dtYearR");
            rule.dtArea = jsonObj.optString("dtArea");
            rule.dtAreaR = getPattern(jsonObj, "dtAreaR");
            rule.dtMark = jsonObj.optString("dtMark");
            rule.dtMarkR = getPattern(jsonObj, "dtMarkR");
            rule.dtActor = jsonObj.optString("dtActor");
            rule.dtActorR = getPattern(jsonObj, "dtActorR");
            rule.dtDirector = jsonObj.optString("dtDirector");
            rule.dtDirectorR = getPattern(jsonObj, "dtDirectorR");
            rule.dtDesc = jsonObj.optString("dtDesc");
            rule.dtDescR = getPattern(jsonObj, "dtDescR");
            rule.dtFromNode = jsonObj.optString("dtFromNode");
            rule.dtFromName = jsonObj.optString("dtFromName");
            rule.dtFromNameR = getPattern(jsonObj, "dtFromNameR");
            rule.dtUrlNode = jsonObj.optString("dtUrlNode");
            rule.dtUrlSubNode = jsonObj.optString("dtUrlSubNode");
            rule.dtUrlId = jsonObj.optString("dtUrlId");
            rule.dtUrlIdR = getPattern(jsonObj, "dtUrlIdR");
            rule.dtUrlName = jsonObj.optString("dtUrlName");
            rule.dtUrlNameR = getPattern(jsonObj, "dtUrlNameR");
            rule.playUrl = jsonObj.optString("playUrl");
            rule.playUa = jsonObj.optString("playUa");
            rule.playReferer = jsonObj.optString("playReferer");
            rule.searchUrl = jsonObj.optString("searchUrl");
            rule.scVodNode = jsonObj.optString("scVodNode").trim();
            rule.scVodName = jsonObj.optString("scVodName").trim();
            rule.scVodNameR = getPattern(jsonObj, "scVodNameR");
            rule.scVodId = jsonObj.optString("scVodId").trim();
            rule.scVodIdR = getPattern(jsonObj, "scVodIdR");
            rule.scVodImg = jsonObj.optString("scVodImg").trim();
            rule.scVodImgR = getPattern(jsonObj, "scVodImgR");
            rule.scVodMark = jsonObj.optString("scVodMark").trim();
            rule.scVodMarkR = getPattern(jsonObj, "scVodMarkR");
            return rule;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return null;
    }

    public String getUa() {
        return ua;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public String getCateNode() {
        return cateNode;
    }

    public String getCateName() {
        return cateName;
    }

    public String getCateNameR(String src) {
        return doReplaceRegex(cateNameR, src);
    }

    public String getCateId() {
        return cateId;
    }

    public String getCateIdR(String src) {
        return doReplaceRegex(cateIdR, src);
    }

    public LinkedHashMap<String, String> getCateManual() {
        return cateManual;
    }

    public JSONObject getFilter() {
        return filter;
    }

    public String getHomeVodNode() {
        return homeVodNode;
    }

    public String getHomeVodName() {
        return homeVodName;
    }

    public String getHomeVodNameR(String src) {
        return doReplaceRegex(homeVodNameR, src);
    }

    public String getHomeVodId() {
        return homeVodId;
    }

    public String getHomeVodIdR(String src) {
        return doReplaceRegex(homeVodIdR, src);
    }

    public String getHomeVodImg() {
        return homeVodImg;
    }

    public String getHomeVodImgR(String src) {
        return doReplaceRegex(homeVodImgR, src);
    }

    public String getHomeVodMark() {
        return homeVodMark;
    }

    public String getHomeVodMarkR(String src) {
        return doReplaceRegex(homeVodMarkR, src);
    }

    public String getCateUrl() {
        return cateUrl;
    }

    public String getCateVodNode() {
        return cateVodNode;
    }

    public String getCateVodName() {
        return cateVodName;
    }

    public String getCateVodNameR(String src) {
        return doReplaceRegex(cateVodNameR, src);
    }

    public String getCateVodId() {
        return cateVodId;
    }

    public String getCateVodIdR(String src) {
        return doReplaceRegex(cateVodIdR, src);
    }

    public String getCateVodImg() {
        return cateVodImg;
    }

    public String getCateVodImgR(String src) {
        return doReplaceRegex(cateVodImgR, src);
    }

    public String getCateVodMark() {
        return cateVodMark;
    }

    public String getCateVodMarkR(String src) {
        return doReplaceRegex(cateVodNameR, src);
    }

    public String getDetailUrl() {
        return dtUrl;
    }

    public String getDetailNode() {
        return dtNode;
    }

    public String getDetailName() {
        return dtName;
    }

    public String getDetailNameR(String src) {
        return doReplaceRegex(dtNameR, src);
    }

    public String getDetailImg() {
        return dtImg;
    }

    public String getDetailImgR(String src) {
        return doReplaceRegex(dtImgR, src);
    }

    public String getDetailCate() {
        return dtCate;
    }

    public String getDetailCateR(String src) {
        return doReplaceRegex(dtCateR, src);
    }

    public String getDetailYear() {
        return dtYear;
    }

    public String getDetailYearR(String src) {
        return doReplaceRegex(dtYearR, src);
    }

    public String getDetailArea() {
        return dtArea;
    }

    public String getDetailAreaR(String src) {
        return doReplaceRegex(dtAreaR, src);
    }

    public String getDetailMark() {
        return dtMark;
    }

    public String getDetailMarkR(String src) {
        return doReplaceRegex(dtMarkR, src);
    }

    public String getDetailActor() {
        return dtActor;
    }

    public String getDetailActorR(String src) {
        return doReplaceRegex(dtActorR, src);
    }

    public String getDetailDirector() {
        return dtDirector;
    }

    public String getDetailDirectorR(String src) {
        return doReplaceRegex(dtDirectorR, src);
    }

    public String getDetailDesc() {
        return dtDesc;
    }

    public String getDetailDescR(String src) {
        return doReplaceRegex(dtDescR, src);
    }

    public String getDetailFromNode() {
        return dtFromNode;
    }

    public String getDetailFromName() {
        return dtFromName;
    }

    public String getDetailFromNameR(String src) {
        return doReplaceRegex(dtFromNameR, src);
    }

    public String getDetailUrlNode() {
        return dtUrlNode;
    }

    public String getDetailUrlSubNode() {
        return dtUrlSubNode;
    }

    public String getDetailUrlId() {
        return dtUrlId;
    }

    public String getDetailUrlIdR(String src) {
        return doReplaceRegex(dtUrlIdR, src);
    }

    public String getDetailUrlName() {
        return dtUrlName;
    }

    public String getDetailUrlNameR(String src) {
        return doReplaceRegex(dtUrlNameR, src);
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public String getPlayUa() {
        return playUa;
    }

    public String getPlayReferer() {
        return playReferer;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public String getSearchVodNode() {
        return scVodNode;
    }

    public String getSearchVodName() {
        return scVodName;
    }

    public String getSearchVodNameR(String src) {
        return doReplaceRegex(scVodNameR, src);
    }

    public String getSearchVodId() {
        return scVodId;
    }

    public String getSearchVodIdR(String src) {
        return doReplaceRegex(scVodIdR, src);
    }

    public String getSearchVodImg() {
        return scVodImg;
    }

    public String getSearchVodImgR(String src) {
        return doReplaceRegex(scVodImgR, src);
    }

    public String getSearchVodMark() {
        return scVodMark;
    }

    public String getSearchVodMarkR(String src) {
        return doReplaceRegex(scVodMarkR, src);
    }
}