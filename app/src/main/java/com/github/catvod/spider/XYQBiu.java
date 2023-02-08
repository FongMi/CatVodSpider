package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Utils;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;

public class XYQBiu extends Spider {

//    private String btcookie = "";

    @Override
    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String extend) {
        super.init(context, extend);
        this.ext = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            fetchRule();
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();

            String[] fenleis = getRuleVal("class_name", "").split("&");
            String[] fenleisval = getRuleVal("class_value", "").split("&");
            for (int i = 0; i < fenleis.length; i++) {
                JSONObject fenjson = new JSONObject();
                fenjson.put("type_id", fenleisval[i].replaceAll("＆＆", "&"));
                fenjson.put("type_name", fenleis[i]);
                classes.put(fenjson);
            }
            result.put("class", classes);
            String getclan = getRuleVal("filterdata", "");
            InetAddress addr = InetAddress.getLocalHost();
            String locadd = "http://" + addr.getHostAddress() + ":9978/file/";
            String filepath = null;
            JSONObject filterdata = null;
            if (getclan.startsWith("clan://") || getclan.startsWith("http")) {
                if (getclan.startsWith("clan://")) {
                    if (getclan.startsWith("clan://localhost/")) {
                        filepath = getclan.replace("clan://localhost/", locadd);
                    } else {
                        filepath = getclan.replace("clan://", locadd);
                    }
                } else {
                    filepath = getclan;
                }
                try {
                    String filtejson = OkHttpUtil.string(filepath, null);
                    filterdata = new JSONObject(filtejson);
                } catch (
                        Exception e) {
                    SpiderDebug.log(e);
                }
            } else {
                filterdata = rule.optJSONObject("filterdata");
            }
            if (filter && filterdata != null) {
                result.put("filters", filterdata);
            }
            return result.toString();
        } catch (
                Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    protected HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        String ua = getRuleVal("UserAgent", "okhttp/3.12.11").trim();
        if (ua.isEmpty()) {
            ua = "okhttp/3.12.11";
        } else if (ua.equals("PC_UA")) {
            ua = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
        } else if (ua.equals("MOBILE_UA")) {
            ua = "Mozilla/5.0 (Linux; Android 11; Mi 10 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.152 Mobile Safari/537.36";
        }
        headers.put("User-Agent", ua);

        if (!getRuleVal("Referer").isEmpty()) {
            String webref = getRuleVal("Referer").trim();
            if (webref.startsWith("http")) {
                headers.put("Referer", webref);
            }
        }
        return headers;
    }

    @Override
    public String homeVideoContent() {
        try {
            fetchRule();
            if (getRuleVal("homeContent").equals("1")) {
                JSONArray videos = new JSONArray();
                String[] fenleis = getRuleVal("class_value", "").split("&");
                for (String fenlei : fenleis) {
                    JSONObject data = category(fenlei.replaceAll("＆＆", "&"), "1", false, new HashMap<>());
                    if (data != null) {
                        JSONArray vids = data.optJSONArray("list");
                        if (vids != null) {
                            for (int i = 0; i < vids.length() && i < 5; i++) {
                                videos.put(vids.getJSONObject(i));
                            }
                        }
                    }
                    if (videos.length() >= 20)
                        break;
                }
                JSONObject result = new JSONObject();
                result.put("list", videos);
                return result.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private JSONObject category(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            fetchRule();
            String fistpg = String.valueOf(Integer.parseInt(getRuleVal("firstpage", "1")));
            ////页码
            if (fistpg.equals("0")) {
                pg = String.valueOf(Integer.parseInt(pg) - 1 * 1);
            } else {
                pg = String.valueOf(Integer.parseInt(pg) - 1 + Integer.parseInt(getRuleVal("firstpage", "1")));
            }
            //web链接
            String webUrl = getRuleVal("class_url");
            if (webUrl.contains("firstPage=")) {
                if (pg.equals("1")) {
                    webUrl = webUrl.split("\\[firstPage=")[1].split("\\]")[0];
                } else {
                    webUrl = webUrl.split("\\[firstPage=")[0];
                }
            }
            //筛选开始
            if (filter && extend != null && extend.size() > 0) {
                for (Iterator<String> it = extend.keySet().iterator(); it.hasNext(); ) {
                    String key = it.next();
                    String value = extend.get(key);
                    if (value.length() > 0) {
                        webUrl = webUrl.replace("{" + key + "}", URLEncoder.encode(value));
                    }
                }
            }
            webUrl = webUrl.replaceAll("\\{cateId\\}", tid).replaceAll("\\{catePg\\}", pg);
            Matcher m = Pattern.compile("\\{(.*?)\\}").matcher(webUrl);
            while (m.find()) {
                String n = m.group(0).replace("{", "").replace("}", "");
                webUrl = webUrl.replace(m.group(0), "").replace("/" + n + "/", "");
            }
            //筛选结束
            String html = null;
//            String btwatUrl = "";
            //取网页
            if (webUrl.contains(";post")) {
                OKCallBack.OKCallBackString callBack = new OKCallBack.OKCallBackString() {

                    public void onResponse(String response) {
                    }

                    @Override
                    protected void onFailure(Call call, Exception exc) {
                    }
                };
                String posturl = webUrl.split("\\?")[0].replaceAll("？？", "?").trim();
                String postbody = webUrl.split("\\?")[1].split(";")[0].replaceAll("？？", "?").trim();
                if (!postbody.isEmpty() && postbody != null) {
                    if (postbody.startsWith("{") && postbody.endsWith("}")) {
                        JSONObject jsbody = new JSONObject(postbody);
                        OkHttpUtil.postJson(OkHttpUtil.defaultClient(), posturl, jsbody.toString(), getHeaders(posturl), callBack);
                    } else {
                        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
                        String[] userbody = postbody.split("&");
                        for (String userbd : userbody) {
                            int loca = userbd.indexOf("=");
                            params.put(userbd.substring(0, loca), userbd.substring(loca + 1));
                        }
                        OkHttpUtil.post(OkHttpUtil.defaultClient(), posturl, params, getHeaders(posturl), callBack);
                    }
                } else {
                    OkHttpUtil.post(OkHttpUtil.defaultClient(), posturl, null, getHeaders(posturl), callBack);
                }
                html = convertUnicodeToCh(callBack.getResult().replaceAll("\r|\n", ""));
//                btwatUrl = posturl;
            } else {
                html = convertUnicodeToCh(fetch(webUrl));
//                btwatUrl = webUrl;
            }

//            html = jumpbtwaf(btwatUrl,html);//5秒盾
            String parseContent = html;
            String mark = "";
            String pic = "";
            boolean fenleiJson = getRuleVal("cat_mode").equals("0");
            boolean picneetproxy = getRuleVal("PicNeedProxy").equals("1");

            JSONArray videos = new JSONArray();
            JSONObject result = new JSONObject();
            if (fenleiJson) {
                JSONObject data = new JSONObject(parseContent);
                JSONArray vodArray = null;
                String[] keylen = getRuleVal("catjsonlist", "data").split("\\.");
                if (keylen.length == 1) {
                    vodArray = data.getJSONArray(keylen[0]);
                } else if (keylen.length == 2) {
                    vodArray = data.getJSONObject(keylen[0]).getJSONArray(keylen[1]);
                } else if (keylen.length == 3) {
                    vodArray = data.getJSONObject(keylen[0]).getJSONObject(keylen[1]).getJSONArray(keylen[2]);
                }
                //JSONArray vodArray = data.getJSONArray(getRuleVal("catjsonlist","list"));
                for (int j = 0; j < vodArray.length(); j++) {
                    try {
                        JSONObject vod = vodArray.getJSONObject(j);
                        String name = vod.optString(getRuleVal("catjsonname")).trim();
                        String id = vod.optString(getRuleVal("catjsonid")).trim();
                        id = getRuleVal("cat_prefix", "") + id + getRuleVal("cat_suffix", "");
                        if (!getRuleVal("catjsonpic").isEmpty()) {
                            try {
                                pic = vod.optString(getRuleVal("catjsonpic")).trim();
                                pic = Utils.fixUrl(webUrl, pic);
                                if (picneetproxy) {
                                    pic = fixCover(pic, webUrl);
                                }
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        try {
                            mark = vod.optString(getRuleVal("catjsonstitle")).trim();
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                        JSONObject v = new JSONObject();
                        v.put("vod_id", name + "$$$" + pic + "$$$" + id);
                        v.put("vod_name", name);
                        v.put("vod_pic", pic);
                        v.put("vod_remarks", mark);
                        videos.put(v);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
            } else {
                boolean shifouercijiequ = getRuleVal("cat_YN_twice").equals("1");
                if (shifouercijiequ) {
                    String jiequqian = getRuleVal("cat_twice_pre");
                    String jiequhou = getRuleVal("cat_twice_suf");
                    parseContent = subContent(html, jiequqian, jiequhou).get(0);
                }
                String jiequshuzuqian = getRuleVal("cat_arr_pre");
                String jiequshuzuhou = getRuleVal("cat_arr_suf");

                ArrayList<String> jiequContents = subContent(parseContent, jiequshuzuqian, jiequshuzuhou);
                for (int i = 0; i < jiequContents.size(); i++) {
                    try {
                        String jiequContent = jiequContents.get(i);
                        String title = subContent(jiequContent, getRuleVal("cat_title").split("&&")[0], getRuleVal("cat_title").split("&&")[1]).get(0).replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                        if (!getRuleVal("cat_pic").isEmpty()) {
                            try {
                                pic = subContent(jiequContent, getRuleVal("cat_pic").split("&&")[0], getRuleVal("cat_pic").split("&&")[1]).get(0);
                                pic = Utils.fixUrl(webUrl, pic);
                                if (picneetproxy) {
                                    pic = fixCover(pic, webUrl);
                                }
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        String link = subContent(jiequContent, getRuleVal("cat_url").split("&&")[0], getRuleVal("cat_url").split("&&")[1]).get(0);
                        link = getRuleVal("cat_prefix", "") + link + getRuleVal("cat_suffix", "");
                        if (!getRuleVal("cat_subtitle").isEmpty()) {
                            try {
                                mark = subContent(jiequContent, getRuleVal("cat_subtitle").split("&&")[0], getRuleVal("cat_subtitle").split("&&")[1]).get(0).replaceAll("\\s+", "").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        JSONObject v = new JSONObject();
                        v.put("vod_id", title + "$$$" + pic + "$$$" + link);
                        v.put("vod_name", title);
                        v.put("vod_pic", pic);
                        v.put("vod_remarks", mark);
                        videos.put(v);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        break;
                    }
                }
            }

            result.put("page", pg);
            result.put("pagecount", Integer.MAX_VALUE);
            result.put("limit", 90);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", videos);
            return result;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return null;
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        JSONObject obj = category(tid, pg, filter, extend);
        return obj != null ? obj.toString() : "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            fetchRule();
            String[] idInfo = ids.get(0).split("\\$\\$\\$");
            String webUrl = idInfo[2];

            String cover = idInfo[1], vodtitle = idInfo[0], area = "";
            String desc = "";
            String director = "";
            String actor = "";
            String remark = "";
            String year = "";
            String category = "";

            ArrayList<String> playList = new ArrayList<>();
            ArrayList<String> playFrom = new ArrayList<>();
            boolean isMagnet = false;
            boolean zhijiebofang = getRuleVal("force_play").equals("1");
            boolean picneetproxy = getRuleVal("PicNeedProxy").equals("1");
            try {
                if (picneetproxy) {
                    cover = fixCover(cover, webUrl);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            if (zhijiebofang) {
                //直接播放
                playFrom.add(idInfo[0]);
                playList.add(idInfo[0] + "$" + idInfo[2]);
                if (idInfo[2].startsWith("magnet")) {
                    isMagnet = true;
                }
            } else {
                //非直接播放
                String html = fetch(webUrl).trim();
//                html = jumpbtwaf(webUrl,html);//5秒盾
                html = convertUnicodeToCh(html);
                String parseContent = html;
                boolean bfshifouercijiequ = getRuleVal("list_YN_twice").equals("1");
                if (bfshifouercijiequ) {
                    String jiequqian = getRuleVal("list_twice_pre");
                    String jiequhou = getRuleVal("list_twice_suf");
                    parseContent = subContent(html, jiequqian, jiequhou).get(0);
                }

                String jiequshuzuqian = getRuleVal("list_arr_pre");
                String jiequshuzuhou = getRuleVal("list_arr_suf");
                boolean bfyshifouercijiequ = getRuleVal("epi_YN_twice").equals("1");
                ArrayList<String> jiequContents = subContent(parseContent, jiequshuzuqian, jiequshuzuhou);
                for (int i = 0; i < jiequContents.size(); i++) {
                    try {
                        String jiequContent = jiequContents.get(i);
                        String parseJqContent = bfyshifouercijiequ ? subContent(jiequContent, getRuleVal("epi_twice_pre"), getRuleVal("epi_twice_suf")).get(0) : jiequContent;
                        ArrayList<String> lastParseContents = subContent(parseJqContent, getRuleVal("epi_arr_pre"), getRuleVal("epi_arr_suf"));
                        List<String> vodItems = new ArrayList<>();
                        for (int j = 0; j < lastParseContents.size(); j++) {
                            String title = subContent(lastParseContents.get(j), getRuleVal("epi_title").split("&&")[0], getRuleVal("epi_title").split("&&")[1]).get(0);
                            String link = subContent(lastParseContents.get(j), getRuleVal("epi_url").split("&&")[0], getRuleVal("epi_url").split("&&")[1]).get(0);
                            link = getRuleVal("epiurl_prefix", "") + link + getRuleVal("epiurl_suffix", "");
                            vodItems.add(title + "$" + link);
                            if (link.startsWith("magnet")) {
                                isMagnet = true;
                                break;
                            }
                        }
                        playList.add(TextUtils.join("#", vodItems));
                        if (isMagnet) {
                            break;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        break;
                    }
                }

                //线路代码
                String xlparseContent = html;
                //没有线路规则代码时
                if (!getRuleVal("tab_title").isEmpty() && !getRuleVal("tab_arr_pre").isEmpty()) {
                    //代码取线路名
                    boolean xlshifouercijiequ = getRuleVal("tab_YN_twice").equals("1");
                    if (xlshifouercijiequ) {
                        String xljiequqian = getRuleVal("tab_twice_pre");
                        String xljiequhou = getRuleVal("tab_twice_suf");
                        xlparseContent = subContent(html, xljiequqian, xljiequhou).get(0);
                    }

                    String xljiequshuzuqian = getRuleVal("tab_arr_pre");
                    String xljiequshuzuhou = getRuleVal("tab_arr_suf");
                    ArrayList<String> xljiequContents = subContent(xlparseContent, xljiequshuzuqian, xljiequshuzuhou);
                    for (int i = 0; i < playList.size(); i++) {
                        try {
                            String xltitle = subContent(xljiequContents.get(i), getRuleVal("tab_title").split("&&")[0], getRuleVal("tab_title").split("&&")[1]).get(0).replaceAll("\\s+", "").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                            playFrom.add(xltitle);
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                    }
                } else {
                    for (int i = 0; i < playList.size(); i++) {
                        playFrom.add("播放列表" + (i + 1));
                    }
                }

                if (!getRuleVal("proj_actor").isEmpty()) {
                    try {
                        actor = subContent(html, getRuleVal("proj_actor").split("&&")[0], getRuleVal("proj_actor").split("&&")[1]).get(0).replaceAll("\\s+", "");
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                if (!getRuleVal("proj_plot").isEmpty()) {
                    try {
                        desc = subContent(html, getRuleVal("proj_plot").split("&&")[0], getRuleVal("proj_plot").split("&&")[1]).get(0);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
            }
            //非直接播放结束
            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", vodtitle);
            vod.put("vod_pic", cover);
            vod.put("type_name", category);
            vod.put("vod_year", year);
            vod.put("vod_area", area);
            vod.put("vod_remarks", remark);
            vod.put("vod_actor", actor);
            vod.put("vod_director", director);
            vod.put("vod_content", desc);

            String vod_play_from = TextUtils.join("$$$", playFrom);
            String vod_play_url = TextUtils.join("$$$", playList);
            vod.put("vod_play_from", vod_play_from);
            vod.put("vod_play_url", vod_play_url);

            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vod);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }


    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            fetchRule();
            String webUrl = id;
            //WebView嗅探请求头
            JSONObject webheaders = new JSONObject();
            String webua = getRuleVal("UserAgent", "okhttp/3.12.11").trim();
            if (webua.isEmpty()) {
                webua = "okhttp/3.12.11";
            } else if (webua.equals("PC_UA")) {
                webua = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
            } else if (webua.equals("MOBILE_UA")) {
                webua = "Mozilla/5.0 (Linux; Android 11; Mi 10 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.152 Mobile Safari/537.36";
            }
            webheaders.put("User-Agent", webua);

            if (!getRuleVal("Referer").isEmpty()) {
                String webref = getRuleVal("Referer").trim();
                if (webref.startsWith("http")) {
                    webheaders.put("Referer", webref);
                } else if (webref.equals("WebView")) {
                    webheaders.put("Referer", webUrl);
                }
            }
            //嗅探请求头结束

            JSONObject result = new JSONObject();
            boolean enforceplay = (getRuleVal("force_play").equals("1") || getRuleVal("force_play").equals("2"));
            //强制视频链接
            if (enforceplay) {
                webUrl = getRuleVal("play_prefix", "") + webUrl + getRuleVal("play_suffix", "");
                //请求头代码
                if (!getRuleVal("play_header").isEmpty()) {
                    JSONObject uaresult = rule.optJSONObject("play_header");
                    if (uaresult != null) {
                        result.put("header", uaresult.toString());
                    } else {
                        String[] usera = getRuleVal("play_header").split("#");
                        JSONObject strua = new JSONObject();
                        for (String user : usera) {
                            String[] head = user.split("\\$");
                            strua.put(head[0], " " + head[1]);
                        }
                        result.put("header", strua.toString());
                    }
                } else {
                    result.put("header", webheaders.toString());
                }
                //视频格式识别
                if (webUrl.contains("#isVideo=true#") || Utils.isVideoFormat(webUrl)) {
                    if (webUrl.contains("#isVideo=true#")) {
                        webUrl = webUrl.replaceAll("#isVideo=true#", "");
                    }
                    result.put("parse", 0);
                    result.put("playUrl", "");
                } else if (Utils.isVip(webUrl)) {
                    result.put("parse", 1);
                    result.put("jx", "1");
                    result.put("url", webUrl);
                    return result.toString();
                } else {
                    //不是视频就转嗅探
                    result.put("parse", 1);
                    result.put("playUrl", "");
                }
                result.put("url", webUrl);
                return result.toString();
            }
            //直接播放代码结束

            //普通链接开始
            //分析mac链接解析
            boolean enMacPlayer = getRuleVal("Anal_MacPlayer").equals("1");
            String videoUrl = null;
            String fromflag = null;

            if (enMacPlayer && enforceplay == false) {
                try {
                    Document doc = Jsoup.parse(fetch(webUrl));
                    Elements allScript = doc.select("script");
                    for (int i = 0; i < allScript.size(); i++) {
                        String scContent = allScript.get(i).html().trim();
                        if (scContent.startsWith("var player_")) {
                            int start = scContent.indexOf('{');
                            int end = scContent.lastIndexOf('}') + 1;
                            String json = scContent.substring(start, end);
                            JSONObject player = new JSONObject(json);
                            String videoUrlTmp = player.getString("url");

                            fromflag = player.getString("from");
                            if (player.has("encrypt")) {
                                int encrypt = player.getInt("encrypt");
                                if (encrypt == 1) {
                                    videoUrlTmp = URLDecoder.decode(videoUrlTmp);
                                } else if (encrypt == 2) {
                                    videoUrlTmp = new String(Base64.decode(videoUrlTmp, Base64.DEFAULT));
                                    videoUrlTmp = URLDecoder.decode(videoUrlTmp);
                                }
                            }
                            videoUrl = videoUrlTmp;
                            break;
                        }
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }


            //视频不为null时进行处理解析
            if (videoUrl != null) {
                if (Utils.isVip(videoUrl)) { // 使用jx:1
                    try {
                        result.put("parse", 1);
                        result.put("jx", "1");
                        result.put("url", videoUrl);
                        return result.toString();
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                } else if (fromflag.matches("duoduozy|ddzy")) {

                    result.put("header", webheaders.toString());
                    result.put("parse", 1);
                    result.put("playUrl", "");
                    result.put("url", webUrl);
                    return result.toString();
                } else if (Utils.isVideoFormat(videoUrl)) {
                    try {
                        result.put("parse", 0);
                        result.put("playUrl", "");
                        result.put("url", videoUrl);
                        result.put("header", "");
                        return result.toString();
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
            }
            //视频不为null代码结束

            result.put("header", webheaders.toString());
            result.put("parse", 1);
            result.put("playUrl", "");
            result.put("url", webUrl);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public boolean manualVideoCheck() {
        fetchRule();
        if (getRuleVal("ManualSniffer").equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    //private String[] videoFormatList = getRuleVal("videoformat",".m3u8#.mp4#.flv").split("#");

    @Override
    public boolean isVideoFormat(String url) {
        fetchRule();
        String[] videoFormatList = getRuleVal("VideoFormat", ".m3u8#.mp4#.flv#.mp3#.m4a").split("#");
        String[] videoFilterList = getRuleVal("VideoFilter", "=http#.html").split("#");
        url = url.toLowerCase();

        if (url.contains("=http") || url.contains("=https") || url.contains("=https%3a%2f") || url.contains("=http%3a%2f")) {
            return false;
        }
        for (String format : videoFormatList) {
            if (url.contains(format)) {
                for (String videoFilter : videoFilterList) {
                    if (url.contains(videoFilter)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            fetchRule();
            String webUrlTmp = getRuleVal("search_url").replaceAll("\\{wd\\}", key);
            String webUrl = webUrlTmp.split(";")[0];
            String webContent = null;

            if (webUrlTmp.contains(";post")) {
                OKCallBack.OKCallBackString callBack = new OKCallBack.OKCallBackString() {

                    public void onResponse(String response) {
                    }

                    @Override
                    protected void onFailure(Call call, Exception exc) {
                    }
                };

                String postbody = getRuleVal("sea_PtBody").replaceAll("\\{wd\\}", key).trim();
                if (!postbody.isEmpty() && postbody != null) {
                    if (postbody.startsWith("{") && postbody.endsWith("}")) {
                        JSONObject jsbody = new JSONObject(postbody);
                        OkHttpUtil.postJson(OkHttpUtil.defaultClient(), webUrl, jsbody.toString(), getHeaders(webUrl), callBack);
                    } else {
                        LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
                        //params.put(postbody, key);
                        String[] userbody = postbody.split("&");
                        for (String userbd : userbody) {
                            int loca = userbd.indexOf("=");
                            //int end = userbd.lastIndexOf('=') + 1;
                            //String[] bdhead = userbd.split("=");
                            params.put(userbd.substring(0, loca), userbd.substring(loca + 1));
                        }
                        OkHttpUtil.post(OkHttpUtil.defaultClient(), webUrl, params, getHeaders(webUrl), callBack);
                    }
                } else {
                    OkHttpUtil.post(OkHttpUtil.defaultClient(), webUrl, null, getHeaders(webUrl), callBack);
                }
                webContent = convertUnicodeToCh(callBack.getResult().replaceAll("\r|\n", ""));
            } else {
                webContent = convertUnicodeToCh(fetch(webUrl));
            }

            String mark = "";
            String pic = "";
            boolean ssmoshiJson = getRuleVal("search_mode").equals("0");
            boolean picneetproxy = getRuleVal("PicNeedProxy").equals("1");

            JSONObject result = new JSONObject();
            JSONArray videos = new JSONArray();
            if (ssmoshiJson) {
                JSONObject data = new JSONObject(webContent);
                JSONArray vodArray = null;
                String[] keylen = getRuleVal("jsonlist", "list").split("\\.");
                if (keylen.length == 1) {
                    vodArray = data.getJSONArray(keylen[0]);
                } else if (keylen.length == 2) {
                    vodArray = data.getJSONObject(keylen[0]).getJSONArray(keylen[1]);
                } else if (keylen.length == 3) {
                    vodArray = data.getJSONObject(keylen[0]).getJSONObject(keylen[1]).getJSONArray(keylen[2]);
                }
                //JSONArray vodArray = data.getJSONArray(getRuleVal("jsonlist","list"));
                for (int j = 0; j < vodArray.length(); j++) {
                    try {
                        JSONObject vod = vodArray.getJSONObject(j);
                        String name = vod.optString(getRuleVal("jsonname")).trim();
                        String id = vod.optString(getRuleVal("jsonid")).trim();
                        id = getRuleVal("cat_prefix", "") + id + getRuleVal("cat_suffix", "");
                        if (!getRuleVal("jsonpic").isEmpty()) {
                            try {
                                pic = vod.optString(getRuleVal("jsonpic")).trim();
                                pic = Utils.fixUrl(webUrl, pic);
                                if (picneetproxy) {
                                    pic = fixCover(pic, webUrl);
                                }
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        try {
                            mark = vod.optString(getRuleVal("jsonstitle")).trim();
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                        JSONObject v = new JSONObject();
                        v.put("vod_id", name + "$$$" + pic + "$$$" + id);
                        v.put("vod_name", name);
                        v.put("vod_pic", pic);
                        v.put("vod_remarks", mark);
                        videos.put(v);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
            } else {
                String parseContent = webContent;
                boolean shifouercijiequ = getRuleVal("sea_YN_twice").equals("1");
                if (shifouercijiequ) {
                    String jiequqian = getRuleVal("sea_twice_pre");
                    String jiequhou = getRuleVal("sea_twice_suf");
                    parseContent = subContent(webContent, jiequqian, jiequhou).get(0);
                }
                String jiequshuzuqian = getRuleVal("sea_arr_pre");
                String jiequshuzuhou = getRuleVal("sea_arr_suf");
                ArrayList<String> jiequContents = subContent(parseContent, jiequshuzuqian, jiequshuzuhou);
                for (int i = 0; i < jiequContents.size(); i++) {
                    try {
                        String jiequContent = jiequContents.get(i);
                        String title = subContent(jiequContent, getRuleVal("sea_title").split("&&")[0], getRuleVal("sea_title").split("&&")[1]).get(0).replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                        if (!getRuleVal("sea_pic").isEmpty()) {
                            try {
                                pic = subContent(jiequContent, getRuleVal("sea_pic").split("&&")[0], getRuleVal("sea_pic").split("&&")[1]).get(0);
                                pic = Utils.fixUrl(webUrl, pic);
                                if (picneetproxy) {
                                    pic = fixCover(pic, webUrl);
                                }
                            } catch (Exception e) {
                                SpiderDebug.log(e);
                            }
                        }
                        String link = subContent(jiequContent, getRuleVal("sea_url").split("&&")[0], getRuleVal("sea_url").split("&&")[1]).get(0);
                        link = getRuleVal("search_prefix") + link + getRuleVal("search_suffix");
                        try {
                            mark = subContent(jiequContent, getRuleVal("sea_subtitle").split("&&")[0], getRuleVal("sea_subtitle").split("&&")[1]).get(0).replaceAll("\\s+", "").replaceAll("\\&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                        JSONObject v = new JSONObject();
                        v.put("vod_id", title + "$$$" + pic + "$$$" + link);
                        v.put("vod_name", title);
                        v.put("vod_pic", pic);
                        v.put("vod_remarks", mark);
                        videos.put(v);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        break;
                    }
                }
            }
            result.put("list", videos);
            return result.toString();
        } catch (
                Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    protected String ext = null;
    protected JSONObject rule = null;

    protected void fetchRule() {
        if (rule == null) {
            if (ext != null) {
                try {
                    if (ext.startsWith("http")) {
                        String json = OkHttpUtil.string(ext, null);
                        rule = new JSONObject(json);
                    } else {
                        rule = new JSONObject(ext);
                    }
                } catch (JSONException e) {
                }
            }
        }
    }

//    protected String fetch(String webUrl) {
//        SpiderDebug.log(webUrl);
//        return OkHttpUtil.string(webUrl, getHeaders(webUrl)).replaceAll("\r|\n", "");        
        
//    }
    

    private static String convertUnicodeToCh(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\w{4}))");
        Matcher matcher = pattern.matcher(str);

        // 迭代，将str中的所有unicode转换为正常字符
        while (matcher.find()) {
            String unicodeFull = matcher.group(1); // 匹配出的每个字的unicode，比如\u67e5
            String unicodeNum = matcher.group(2); // 匹配出每个字的数字，比如\u67e5，会匹配出67e5

            // 将匹配出的数字按照16进制转换为10进制，转换为char类型，就是对应的正常字符了
            char singleChar = (char) Integer.parseInt(unicodeNum, 16);

            // 替换原始字符串中的unicode码
            str = str.replace(unicodeFull, singleChar + "");
        }
        return str;
    }

    private String getRuleVal(String key, String defaultVal) {
        String v = rule.optString(key);
        if (v.isEmpty() || v.equals("空") || v.equals("&&"))
            return defaultVal;
        return v;
    }

    private String getRuleVal(String key) {
        return getRuleVal(key, "");
    }

    private ArrayList<String> subContent(String content, String startFlag, String endFlag) {
        ArrayList<String> result = new ArrayList<>();
        if (startFlag.isEmpty() && endFlag.isEmpty()) {
            result.add(content);
            return result;
        }
        try {
            Pattern pattern = Pattern.compile(escapeExprSpecialWord(startFlag) + "(.*?)" + escapeExprSpecialWord(endFlag));
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                result.add(matcher.group(1).trim());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (result.isEmpty()) result.add("");
        return result;
    }

    public static String escapeExprSpecialWord(String keyword) {
        if (!keyword.isEmpty()) {
            String[] fbsArr = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
            for (String key : fbsArr) {
                if (keyword.contains(key)) {
                    keyword = keyword.replace(key, "\\" + key);
                }
            }
        }
        return keyword;
    }

    protected String fixCover(String cover, String site) {
        try {
            return "proxy://do=XYQBiu&site=" + site + "&pic=" + cover;
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return cover;
    }

    private static HashMap<String, String> XYQPicHeader = null;

    public static Object[] loadPic(Map<String, String> prmap) {
        try {
            //pic = new String(Base64.decode(pic, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), "UTF-8");
            String site = prmap.get("site");
            String pic = prmap.get("pic");

            if (XYQPicHeader == null) {
                XYQPicHeader = new HashMap<>();
                XYQPicHeader.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                XYQPicHeader.put("referer", site);
            }
            OKCallBack.OKCallBackDefault callBack = new OKCallBack.OKCallBackDefault() {
                @Override
                protected void onFailure(Call call, Exception e) {

                }

                @Override
                protected void onResponse(Response response) {

                }
            };
            OkHttpUtil.get(OkHttpUtil.defaultClient(), pic, null, XYQPicHeader, callBack);
            if (callBack.getResult().code() == 200) {
                Headers headers = callBack.getResult().headers();
                String type = headers.get("Content-Type");
                if (type == null) {
                    type = "application/octet-stream";
                }
                Object[] result = new Object[3];
                result[0] = 200;
                result[1] = type;
                System.out.println(pic);
                System.out.println(type);
                result[2] = callBack.getResult().body().byteStream();
                return result;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    
    protected String fetch(String webUrl) {
        String html = OkHttpUtil.string(webUrl, getHeaders(webUrl));
        html = this.jumpbtwaf(webUrl, html);
        return html.replaceAll("<!--.+?-->", "").replace("\r\n","").replace("\n","");  // 移除注释
    }

    protected String jumpbtwaf(String webUrl, String html) {

        try {
            // 没有配置btwaf不执行下面的代码
            if (!rule.optBoolean("btwaf", false)) {
                return html;
            }
            
         for (int i = 0; i < 3; i++) {
            if (html.contains("检测中") && html.contains("跳转中") && html.contains("btwaf")) {
                String btwaf = subContent(html, "btwaf=", "\"").get(0);
                String bturl = webUrl + "?btwaf=" + btwaf;

                Map<String, List<String>> cookies = new HashMap<>();
                OkHttpUtil.string(bturl, getHeaders(webUrl), cookies);
                for (Map.Entry<String, List<String>> entry : cookies.entrySet()) {
                    if (entry.getKey().equals("set-cookie") || entry.getKey().equals("Set-Cookie")) {
                        String btcookie = TextUtils.join(";", entry.getValue());
                        if (!rule.has("header")) {
                            rule.put("header", new JSONObject());
                        }
                        rule.getJSONObject("header").put("cookie", btcookie);
                        break;
                    }
                }
                html = fetch(webUrl);
            }
            if (!html.contains("检测中") && !html.contains("btwaf")) {
                return html;
            }
         }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }
    
    
}