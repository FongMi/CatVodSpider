package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;

public class yyds extends Spider {
    private static final String siteUrl = "https://cmn.yydshd.com";
    public static String email = null;//账号
    public static String password = null;//密码
    public static String token = null;
    public static String alitoken = null;

    @Override
    public void init(Context context,String ext) {
        super.init(context);
        String[] extra = ext.split("\\&");
        if(extra[0].contains("http")){
            alitoken = OkHttpUtil.string(extra[0],getHeaders());
        }else {
            alitoken = extra[0];
        }
        email = extra[1];
        password = extra[2];
    }

    private HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json, text/plain, */*");
        headers.put("origin", "https://yydshd.com");
        headers.put("referer", "https://yydshd.com/index");
        headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        return headers;
    }

    private HashMap<String, String> getHeaders(String url,String Token) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("accept", "application/json, text/plain, */*");
        headers.put("origin", "https://yydshd.com");
        headers.put("referer", "https://yydshd.com/index");
        headers.put("token", Token);
        headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        return headers;
    }

    public void getToken() throws Exception {
        String url = siteUrl + "/api/login";
        JSONObject json = new JSONObject();
        json.put("email", email);
        json.put("password", password);
        OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, json.toString(), getHeaders(url), new OKCallBack.OKCallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {
            }

            @Override
            public String onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response).getJSONObject("data");
                    token = jsonObject.getString("token");
                    return token;
                } catch (JSONException e) {
                }
                return token;
            }
        });

    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONArray classes = new JSONArray();
            String url = siteUrl + "/api/new-categories";
            JSONObject newCls2 = new JSONObject();
            newCls2.put("type_id", "0");
            newCls2.put("type_name", "热门精选");
            classes.put(newCls2);
            JSONObject newCls3 = new JSONObject();
            newCls3.put("type_id", "18");
            newCls3.put("type_name", "华语电影");
            classes.put(newCls3);
            JSONObject newCls4 = new JSONObject();
            newCls4.put("type_id", "15");
            newCls4.put("type_name", "大陆剧");
            classes.put(newCls4);
            JSONObject newCls5 = new JSONObject();
            newCls5.put("type_id", "24");
            newCls5.put("type_name", "华语综艺");
            classes.put(newCls5);
            JSONObject result = new JSONObject();
            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONArray videos = new JSONArray();
            try {
                String url = siteUrl + "/api/posts";
                JSONObject json = new JSONObject();
                json.put("category_id", "-1");
                json.put("skip", "0");
                json.put("limit", "24");
                json.put("keyword", "");
                OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, json.toString(), getHeaders(url), new OKCallBack.OKCallBackString() {
                    @Override
                    public void onFailure(Call call, Exception e) {
                    }

                    @Override
                    public String onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject vObj = jsonArray.getJSONObject(i);
                                JSONObject v = new JSONObject();
                                v.put("vod_id", vObj.getString("id"));
                                v.put("vod_name", vObj.optJSONArray("tags").optJSONObject(0).optString("title") + " "  + vObj.getString("title"));
                                v.put("vod_pic", vObj.optString("cover"));
                                String mark = vObj.optString("subtitle");
                                if (mark.equals("null"))
                                    mark = "";
                                v.put("vod_remarks", mark);
                                videos.put(v);
                            }
                        } catch (JSONException e) {
                        }
                        return response;
                    }
                });
            } catch (Exception e) {

            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {

            int limit = 24;
            int page = Integer.parseInt(pg);
            if (page == 0) {
                page = 1;
            }
            //getToken();
            //System.out.println(token);

            String url = siteUrl + "/api/posts";
            JSONObject json = new JSONObject();
            json.put("category_id", tid);
            json.put("skip", ((page - 1) * limit) + "");
            json.put("limit", limit + "");
            json.put("keyword", "");
            JSONArray videos = new JSONArray();
            OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, json.toString(), getHeaders(url), new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public String onResponse(String response) {
                    try {

                        JSONObject jsonObject = new JSONObject(response);
                        JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject vObj = jsonArray.getJSONObject(i);
                            JSONObject v = new JSONObject();
                            v.put("vod_id", vObj.getString("id"));
                            v.put("vod_name", vObj.optJSONArray("tags").optJSONObject(0).optString("title") + " "  + vObj.getString("title"));//增加页面显示清晰度
                            v.put("vod_pic", vObj.optString("cover"));
                            String mark = vObj.optString("subtitle");
                            if (mark.equals("null"))
                                mark = "";
                            v.put("vod_remarks", mark);
                            videos.put(v);
                        }

                    } catch (JSONException e) {
                    }
                    return response;
                }
            });
            JSONObject result = new JSONObject();
            result.put("page", page);
            int pageCount = videos.length() == limit ? page + 1 : page;
            result.put("pagecount", pageCount);
            result.put("limit", limit);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    Pattern aliyun = Pattern.compile(".*?aliyundrive.com/s/(\\w+)[^\\w]?");

    @Override
    public String detailContent(List<String> ids) {
        try {
            getToken();
            String url = siteUrl + "/api/post-info";
            JSONObject json = new JSONObject();
            json.put("id", ids.get(0));
            JSONObject vodAtom = new JSONObject();
            OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, json.toString(), getHeaders(url,token), new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public String onResponse(String response) {
                    try {
                        JSONObject dataObject = new JSONObject(response);
                        JSONObject vObj = dataObject.getJSONObject("data");

                        vodAtom.put("vod_id", vObj.getString("id"));
                        vodAtom.put("vod_name", vObj.optJSONArray("tags").optJSONObject(0).optString("title") + " "  + vObj.getString("title"));
                        vodAtom.put("vod_pic", vObj.getString("cover"));
                        vodAtom.put("type_name", "");
                        vodAtom.put("vod_year", vObj.getString("year"));
                        vodAtom.put("vod_area", vObj.getString("region"));
                        String mark = vObj.optString("subtitle");
                        if (mark.equals("null"))
                            mark = "";
                        vodAtom.put("vod_remarks", mark);
                        vodAtom.put("vod_actor", vObj.getString("actors"));
                        vodAtom.put("vod_director", vObj.getString("director"));
                        String desc = vObj.optString("desc");
                        if (desc.equals("null"))
                            desc = "";
                        vodAtom.put("vod_content", desc);

                        Map<String, String> vod_play = new LinkedHashMap<>();
                        JSONArray jsonArray = vObj.getJSONArray("links");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject obj = jsonArray.getJSONObject(i).getJSONArray("item").getJSONObject(0);
                            String link = obj.optString("link", "");
                            updatePlaylist(link, vod_play);
                        }
                        if (vod_play.size() == 0 && vObj.optString("content").length() > 0) {
                            updatePlaylist(vObj.optString("content"), vod_play);
                        }
                        if (vod_play.size() > 0) {
                            String vod_play_from = TextUtils.join("$$$", vod_play.keySet());
                            String vod_play_url = TextUtils.join("$$$", vod_play.values());
                            vodAtom.put("vod_play_from", vod_play_from);
                            vodAtom.put("vod_play_url", vod_play_url);
                        }
                    } catch (JSONException e) {
                    }
                    return response;
                }
            });
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vodAtom);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private void updatePlaylist(String link, Map<String, String> vod_play) {
        String shareId = null;
        Matcher matcher = aliyun.matcher(link);
        if (matcher.find()) {
            shareId = matcher.group(1);
        }
        if (shareId != null) {
            String shareToken = getShareTk(shareId, "");
            ArrayList<String> vodItems = new ArrayList<>();
            getFileList(shareToken, shareId, "", "root", vodItems);
            vod_play.put("阿里原画" + (vod_play.size() > 0 ? vod_play.size() : ""), TextUtils.join("#", vodItems));
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            String[] infos = id.split("\\+");
            refreshTk();
            String playurl = getOriginalVideoUrl(infos[0], infos[1], infos[2], infos[3]);
            JSONObject result = new JSONObject();
            JSONObject headers = new JSONObject();
            headers.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            headers.put("referer", "https://www.aliyundrive.com/");
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", headers.toString());
            result.put("url", playurl);
            return result.toString();

        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
    private static HashMap<String, String> getHeaders() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        hashMap.put("Referer", "https://www.aliyundrive.com/");
        return hashMap;
    }

    private static String postJson(String url, String jsonStr, Map<String, String> headerMap) {
        OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {

            }

            @Override
            public String onResponse(String response) {

                return response;
            }
        };
        OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, jsonStr, headerMap, callback);
        return callback.getResult();
    }

    private String getOriginalVideoUrl(String shareId, String shareToken, String fileId, String category) {
        try {
            HashMap<String, String> json = getHeaders();
            json.put("x-share-token", shareToken);
            json.put("authorization", accessTk);
            if (category.equals("video")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("share_id", shareId);
                jSONObject.put("category", "live_transcoding");
                jSONObject.put("file_id", fileId);
                jSONObject.put("template_id", "");
                JSONObject jSONObject2 = new JSONObject(postJson("https://api.aliyundrive.com/v2/file/get_share_link_video_preview_play_info", jSONObject.toString(), json));
                shareId = jSONObject2.getString("share_id");
                fileId = jSONObject2.getString("file_id");
            }
            JSONObject jSONObject3 = new JSONObject();
            if (category.equals("video")) {
                jSONObject3.put("expire_sec", 600);
                jSONObject3.put("file_id", fileId);
                jSONObject3.put("share_id", shareId);
            }
            if (category.equals("audio")) {
                jSONObject3.put("share_id", shareId);
                jSONObject3.put("get_audio_play_info", true);
                jSONObject3.put("file_id", fileId);
            }
            return new JSONObject(postJson("https://api.aliyundrive.com/v2/file/get_share_link_download_url", jSONObject3.toString(), json)).getString("download_url");
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }


    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONArray videos = new JSONArray();
            try {
                String url = siteUrl + "/api/posts";
                JSONObject json = new JSONObject();
                json.put("category_id", "-1");
                json.put("skip", "0");
                json.put("limit", "24");
                json.put("keyword", key);
                OkHttpUtil.postJson(OkHttpUtil.defaultClient(), url, json.toString(), getHeaders(url), new OKCallBack.OKCallBackString() {
                    @Override
                    public void onFailure(Call call, Exception e) {
                    }

                    @Override
                    public String onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject vObj = jsonArray.getJSONObject(i);
                                JSONObject v = new JSONObject();
                                v.put("vod_id", vObj.getString("id"));
                                v.put("vod_name", vObj.optJSONArray("tags").optJSONObject(0).optString("title") + " "  + vObj.getString("title"));
                                v.put("vod_pic", vObj.getString("cover"));
                                v.put("vod_remarks", vObj.getString("subtitle"));
                                videos.put(v);
                            }
                        } catch (JSONException e) {
                        }
                        return response;
                    }
                });

            } catch (Exception e) {

            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    private String aliTk = "";

    private void fetchAliTk() {
        if (aliTk.isEmpty()) {
            aliTk = alitoken;
        }
    }

    private String accessTk = "";

    private void refreshTk() {
        fetchAliTk();
        if (!aliTk.isEmpty() && accessTk.isEmpty()) {
            try {
                JSONObject json = new JSONObject();
                json.put("refresh_token", aliTk);
                OkHttpUtil.postJson(OkHttpUtil.defaultClient(), "https://api.aliyundrive.com/token/refresh", json.toString(), new OKCallBack.OKCallBackString() {
                    @Override
                    public void onFailure(Call call, Exception e) {

                    }

                    @Override
                    public String onResponse(String response) {
                        try {
                            JSONObject obj = new JSONObject(response);
                            accessTk = obj.getString("token_type") + " " + obj.getString("access_token");
                        } catch (Exception e) {
                            SpiderDebug.log(e);
                        }
                        return response;
                    }
                });
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    private String getShareTk(String shareId, String sharePwd) {
        try {
            JSONObject json = new JSONObject();
            json.put("share_id", shareId);
            json.put("share_pwd", "");
            OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {

                }

                @Override
                public String onResponse(String response) {

                    return response;
                }
            };
            OkHttpUtil.postJson(OkHttpUtil.defaultClient(), "https://api.aliyundrive.com/v2/share_link/get_share_token", json.toString(), callback);
            return new JSONObject(callback.getResult()).optString("share_token");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        return "";
    }


    private void getFileList(String shareTk, String shareId, String sharePwd, String root, ArrayList<String> vodItems) {
        try {
            // 取文件夹
            JSONObject json = new JSONObject();
            json.put("share_id", shareId);
            json.put("parent_file_id", root);
            json.put("limit", 100);
            json.put("image_thumbnail_process", "image/resize,w_160/format,jpeg");
            json.put("image_url_process", "image/resize,w_1920/format,jpeg");
            json.put("video_thumbnail_process", "video/snapshot,t_1000,f_jpg,ar_auto,w_300");
            json.put("order_by", "name");
            json.put("order_direction", "ASC");
            HashMap<String, String> headers = new HashMap<>();
            headers.put("x-share-token", shareTk);
            OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {

                }

                @Override
                public String onResponse(String response) {

                    return response;
                }
            };
            OkHttpUtil.postJson(OkHttpUtil.defaultClient(), "https://api.aliyundrive.com/adrive/v3/file/list", json.toString(), headers, callback);
            JSONArray rootList = new JSONObject(callback.getResult()).optJSONArray("items");
            if (rootList != null && rootList.length() > 0) {
                for (int i = 0; i < rootList.length(); i++) {
                    JSONObject item = rootList.getJSONObject(i);
                    if (item.getString("type").equals("folder")) {
                        String dirId = item.getString("file_id");
                        getFileList(shareTk, shareId, sharePwd, dirId, vodItems);
                    } else {
                        if (item.getString("type").equals("file") && !item.getString("file_extension").equals("txt")) {
                            String fileId = item.getString("file_id");
                            String fileName = item.getString("name");
                            String fileCate = item.getString("category");
                            vodItems.add("[" + getSize(item.getDouble("size")) + "]" + fileName + "$" + shareId + "+" + shareTk + "+" + fileId+ "+" + fileCate);
                        }
                    }
                }
            }
            // 取文件列表
        }
        catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }
    public static String getSize(double size) {
        if (size == 0) return "";
        if (size > 1024 * 1024 * 1024 * 1024.0) {
            size /= (1024 * 1024 * 1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "TB");
        } else if (size > 1024 * 1024 * 1024.0) {
            size /= (1024 * 1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "GB");
        } else if (size > 1024 * 1024.0) {
            size /= (1024 * 1024.0);
            return String.format(Locale.getDefault(), "%.2f%s", size, "MB");
        } else {
            size /= 1024.0;
            return String.format(Locale.getDefault(), "%.2f%s", size, "KB");
        }
    }
    @SerializedName("size")
    private double size;
    public double getSize() {
        return size;
    }

}
