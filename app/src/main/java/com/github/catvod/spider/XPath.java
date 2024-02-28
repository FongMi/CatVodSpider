package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.xpath.Rule;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class XPath extends Spider {

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", rule.getUa().isEmpty() ? Util.CHROME : rule.getUa());
        return headers;
    }

    @Override
    public void init(Context context, String extend) {
        this.ext = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        fetchRule();
        List<Vod> list = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        if (rule.getCateManual().size() > 0) {
            Set<String> keys = rule.getCateManual().keySet();
            for (String k : keys) {
                classes.add(new Class(rule.getCateManual().get(k), k));
            }
        }
        String webUrl = rule.getHomeUrl();
        JXDocument doc = JXDocument.create(fetch(webUrl));
        if (rule.getCateManual().size() == 0) {
            List<JXNode> navNodes = doc.selN(rule.getCateNode());
            for (int i = 0; i < navNodes.size(); i++) {
                String name = navNodes.get(i).selOne(rule.getCateName()).asString().trim();
                name = rule.getCateNameR(name);
                String id = navNodes.get(i).selOne(rule.getCateId()).asString().trim();
                id = rule.getCateIdR(id);
                classes.add(new Class(id, name));
            }
        }
        if (!rule.getHomeVodNode().isEmpty()) {
            List<JXNode> vodNodes = doc.selN(rule.getHomeVodNode());
            for (int i = 0; i < vodNodes.size(); i++) {
                String name = vodNodes.get(i).selOne(rule.getHomeVodName()).asString().trim();
                name = rule.getHomeVodNameR(name);
                String id = vodNodes.get(i).selOne(rule.getHomeVodId()).asString().trim();
                id = rule.getHomeVodIdR(id);
                String pic = vodNodes.get(i).selOne(rule.getHomeVodImg()).asString().trim();
                pic = rule.getHomeVodImgR(pic);
                pic = Util.fixUrl(webUrl, pic);
                String mark = "";
                if (!rule.getHomeVodMark().isEmpty()) {
                    try {
                        mark = vodNodes.get(i).selOne(rule.getHomeVodMark()).asString().trim();
                        mark = rule.getHomeVodMarkR(mark);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                list.add(new Vod(id, name, pic, mark));
            }
        }
        return Result.string(classes, list, rule.getFilter());
    }

    protected String categoryUrl(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return rule.getCateUrl().replace("{cateId}", tid).replace("{catePg}", pg);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        fetchRule();
        List<Vod> list = new ArrayList<>();
        String webUrl = categoryUrl(tid, pg, filter, extend);
        JXDocument doc = JXDocument.create(fetch(webUrl));
        List<JXNode> vodNodes = doc.selN(rule.getCateVodNode());
        for (int i = 0; i < vodNodes.size(); i++) {
            String name = vodNodes.get(i).selOne(rule.getCateVodName()).asString().trim();
            name = rule.getCateVodNameR(name);
            String id = vodNodes.get(i).selOne(rule.getCateVodId()).asString().trim();
            id = rule.getCateVodIdR(id);
            String pic = vodNodes.get(i).selOne(rule.getCateVodImg()).asString().trim();
            pic = rule.getCateVodImgR(pic);
            pic = Util.fixUrl(webUrl, pic);
            String mark = "";
            if (!rule.getCateVodMark().isEmpty()) {
                try {
                    mark = vodNodes.get(i).selOne(rule.getCateVodMark()).asString().trim();
                    mark = rule.getCateVodMarkR(mark);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            list.add(new Vod(id, name, pic, mark));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) {
        fetchRule();
        String webUrl = rule.getDetailUrl().replace("{vid}", ids.get(0));
        String webContent = fetch(webUrl);
        JXDocument doc = JXDocument.create(webContent);
        JXNode vodNode = doc.selNOne(rule.getDetailNode());
        String cover = "", title = "", desc = "", category = "", area = "", year = "", remark = "", director = "", actor = "";
        title = vodNode.selOne(rule.getDetailName()).asString().trim();
        title = rule.getDetailNameR(title);
        cover = vodNode.selOne(rule.getDetailImg()).asString().trim();
        cover = rule.getDetailImgR(cover);
        cover = Util.fixUrl(webUrl, cover);
        if (!rule.getDetailCate().isEmpty()) {
            try {
                category = vodNode.selOne(rule.getDetailCate()).asString().trim();
                category = rule.getDetailCateR(category);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailYear().isEmpty()) {
            try {
                year = vodNode.selOne(rule.getDetailYear()).asString().trim();
                year = rule.getDetailYearR(year);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailArea().isEmpty()) {
            try {
                area = vodNode.selOne(rule.getDetailArea()).asString().trim();
                area = rule.getDetailAreaR(area);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailMark().isEmpty()) {
            try {
                remark = vodNode.selOne(rule.getDetailMark()).asString().trim();
                remark = rule.getDetailMarkR(remark);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailActor().isEmpty()) {
            try {
                actor = vodNode.selOne(rule.getDetailActor()).asString().trim();
                actor = rule.getDetailActorR(actor);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailDirector().isEmpty()) {
            try {
                director = vodNode.selOne(rule.getDetailDirector()).asString().trim();
                director = rule.getDetailDirectorR(director);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
        if (!rule.getDetailDesc().isEmpty()) {
            try {
                desc = vodNode.selOne(rule.getDetailDesc()).asString().trim();
                desc = rule.getDetailDescR(desc);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }

        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(title);
        vod.setVodPic(cover);
        vod.setTypeName(category);
        vod.setVodYear(year);
        vod.setVodArea(area);
        vod.setVodRemarks(remark);
        vod.setVodActor(actor);
        vod.setVodDirector(director);
        vod.setVodContent(desc);

        ArrayList<String> playFrom = new ArrayList<>();
        List<JXNode> fromNodes = doc.selN(rule.getDetailFromNode());
        for (int i = 0; i < fromNodes.size(); i++) {
            String name = fromNodes.get(i).selOne(rule.getDetailFromName()).asString().trim();
            name = rule.getDetailFromNameR(name);
            playFrom.add(name);
        }

        ArrayList<String> playList = new ArrayList<>();
        List<JXNode> urlListNodes = doc.selN(rule.getDetailUrlNode());
        for (int i = 0; i < urlListNodes.size(); i++) {
            List<JXNode> urlNodes = urlListNodes.get(i).sel(rule.getDetailUrlSubNode());
            List<String> vodItems = new ArrayList<>();
            for (int j = 0; j < urlNodes.size(); j++) {
                String name = urlNodes.get(j).selOne(rule.getDetailUrlName()).asString().trim();
                name = rule.getDetailUrlNameR(name);
                String id = urlNodes.get(j).selOne(rule.getDetailUrlId()).asString().trim();
                id = rule.getDetailUrlIdR(id);
                vodItems.add(name + "$" + id);
            }
            // 排除播放列表為空的播放源
            if (vodItems.size() == 0 && playFrom.size() > i) {
                playFrom.set(i, "");
            }
            playList.add(TextUtils.join("#", vodItems));
        }
        // 排除播放列表為空的播放源
        for (int i = playFrom.size() - 1; i >= 0; i--) {
            if (playFrom.get(i).isEmpty()) playFrom.remove(i);
        }
        for (int i = playList.size() - 1; i >= 0; i--) {
            if (playList.get(i).isEmpty()) playList.remove(i);
        }
        for (int i = playList.size() - 1; i >= 0; i--) {
            if (i >= playFrom.size()) playList.remove(i);
        }
        vod.setVodPlayFrom(TextUtils.join("$$$", playFrom));
        vod.setVodPlayUrl(TextUtils.join("$$$", playList));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        fetchRule();
        String webUrl = rule.getPlayUrl().isEmpty() ? id : rule.getPlayUrl().replace("{playUrl}", id);
        SpiderDebug.log(webUrl);
        HashMap<String, String> headers = new HashMap<>();
        if (rule.getPlayUa().length() > 0) headers.put("User-Agent", rule.getPlayUa());
        if (rule.getPlayReferer().length() > 0) headers.put("Referer", rule.getPlayReferer());
        return Result.get().parse().url(webUrl).header(headers).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        fetchRule();
        if (rule.getSearchUrl().isEmpty()) return "";
        String webUrl = rule.getSearchUrl().replace("{wd}", URLEncoder.encode(key));
        String webContent = fetch(webUrl);
        List<Vod> list = new ArrayList<>();
        if (rule.getSearchVodNode().startsWith("json:")) {
            String[] node = rule.getSearchVodNode().substring(5).split(">");
            JSONObject data = new JSONObject(webContent);
            for (int i = 0; i < node.length; i++) {
                if (i == node.length - 1) {
                    JSONArray vodArray = data.getJSONArray(node[i]);
                    for (int j = 0; j < vodArray.length(); j++) {
                        JSONObject vod = vodArray.getJSONObject(j);
                        String name = vod.optString(rule.getSearchVodName()).trim();
                        name = rule.getSearchVodNameR(name);
                        String id = vod.optString(rule.getSearchVodId()).trim();
                        id = rule.getSearchVodIdR(id);
                        String pic = vod.optString(rule.getSearchVodImg()).trim();
                        pic = rule.getSearchVodImgR(pic);
                        pic = Util.fixUrl(webUrl, pic);
                        String mark = vod.optString(rule.getSearchVodMark()).trim();
                        mark = rule.getSearchVodMarkR(mark);
                        list.add(new Vod(id, name, pic, mark));
                    }
                } else {
                    data = data.getJSONObject(node[i]);
                }
            }
        } else {
            JXDocument doc = JXDocument.create(webContent);
            List<JXNode> vodNodes = doc.selN(rule.getSearchVodNode());
            for (int i = 0; i < vodNodes.size(); i++) {
                String name = vodNodes.get(i).selOne(rule.getSearchVodName()).asString().trim();
                name = rule.getSearchVodNameR(name);
                String id = vodNodes.get(i).selOne(rule.getSearchVodId()).asString().trim();
                id = rule.getSearchVodIdR(id);
                String pic = vodNodes.get(i).selOne(rule.getSearchVodImg()).asString().trim();
                pic = rule.getSearchVodImgR(pic);
                pic = Util.fixUrl(webUrl, pic);
                String mark = "";
                if (!rule.getCateVodMark().isEmpty()) {
                    try {
                        mark = vodNodes.get(i).selOne(rule.getSearchVodMark()).asString().trim();
                        mark = rule.getSearchVodMarkR(mark);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                list.add(new Vod(id, name, pic, mark));
            }
        }
        return Result.string(list);
    }

    @Override
    public boolean manualVideoCheck() {
        return false;
    }

    @Override
    public boolean isVideoFormat(String url) {
        return Util.isVideoFormat(url);
    }

    protected String ext = null;
    protected Rule rule = null;

    protected void fetchRule() {
        if (rule == null) {
            if (ext != null) {
                if (ext.startsWith("http")) {
                    String json = OkHttp.string(ext, null);
                    rule = Rule.fromJson(json);
                    loadRuleExt(json);
                } else {
                    rule = Rule.fromJson(ext);
                    loadRuleExt(ext);
                }
            }
        }
    }

    protected void loadRuleExt(String json) {
    }

    protected String fetch(String webUrl) {
        SpiderDebug.log(webUrl);
        return OkHttp.string(webUrl, getHeaders());
    }
}