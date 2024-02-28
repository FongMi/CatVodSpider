package com.github.catvod.spider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.security.Key;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class NiNi extends Spider {

    private static final String desktopUrl = "https://api.nivodz.com/index/desktop/WEB/3.4";
    private static final String rankingUrl = "https://api.nivodz.com/index/ranking/list/WEB/3.2";
    private static final String filterUrl = "https://api.nivodz.com/show/filter/condition/WEB/3.2";
    private static final String searchUrl = "https://api.nivodz.com/show/search/WEB/3.2";
    private static final String categoryUrl = "https://api.nivodz.com/show/filter/WEB/3.2";
    private static final String detailUrl = "https://api.nivodz.com/show/detail/WEB/3.2";
    private static final String playUrl = "https://api.nivodz.com/show/play/info/WEB/3.2";
    private static final String des_key = "diao.com";
    private boolean adult;

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Referer", "https://m.nbys.tv/");
        return headers;
    }

    private Filter getFilter(String name, String key, JSONArray target, String n, String v) throws JSONException {
        List<Filter.Value> values = new ArrayList<>();
        if (!key.equals("by")) values.add(new Filter.Value("全部", ""));
        for (int j = 0; j < target.length(); j++) values.add(new Filter.Value(target.getJSONObject(j).get(n).toString(), target.getJSONObject(j).get(v).toString()));
        return new Filter(key, name, values);
    }

    private void checkExtend(HashMap<String, String> extend, String key, String value) {
        if (extend.get(key) == null || extend.get(key).equals("")) extend.put(key, value);
    }

    @Override
    public void init(Context context, String extend) {
        adult = !TextUtils.isEmpty(extend);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();
        JSONObject object = new JSONObject(get(filterUrl));
        for (int i = 0; i < object.getJSONArray("channels").length(); i++) {
            String typeId = object.getJSONArray("channels").getJSONObject(i).get("channelId").toString();
            String typeName = object.getJSONArray("channels").getJSONObject(i).get("channelName").toString();
            if (!adult && typeName.contains("午夜")) continue;
            classes.add(adult && typeName.contains("午夜") ? 0 : classes.size(), new Class(typeId, typeName));
            List<Filter> array = new ArrayList<>();
            array.add(getFilter("排序", "by", object.getJSONObject("sortsMap").getJSONArray(typeId), "title", "id"));
            array.add(getFilter("語言", "lang", object.getJSONArray("langs"), "langName", "langId"));
            array.add(getFilter("地區", "area", object.getJSONArray("regions"), "regionName", "regionId"));
            array.add(getFilter("類型", "class", object.getJSONObject("typesMap").getJSONArray(typeId), "showTypeName", "showTypeId"));
            array.add(getFilter("年份", "year", object.getJSONArray("yearRanges"), "name", "code"));
            filters.put(typeId, array);
        }
        return Result.string(classes, filters);
    }

    private String getAdultHome() throws Exception {
        Map<String, String> params = new TreeMap<>();
        params.put("channel_id", "7");
        params.put("start", "0");
        params.put("more", "1");
        JSONObject object = new JSONObject(post(desktopUrl, params));
        JSONArray array = object.getJSONArray("list");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONArray rows = array.getJSONObject(i).getJSONArray("rows");
            for (int j = 0; j < rows.length(); j++) {
                JSONArray cells = rows.getJSONObject(j).getJSONArray("cells");
                for (int k = 0; k < cells.length(); k++) {
                    JSONObject item = cells.getJSONObject(k).getJSONObject("show");
                    String id = item.getString("showIdCode");
                    String name = item.getString("showTitle");
                    String pic = item.getString("showImg");
                    list.add(new Vod(id, name, getPic(pic), getRemarks(item)));
                }
            }
        }
        return Result.string(list);
    }

    @Override
    public String homeVideoContent() throws Exception {
        if (adult) return getAdultHome();
        JSONObject object = new JSONObject(get(rankingUrl));
        JSONArray array = object.getJSONArray("list");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONArray dataItem = array.getJSONArray(i);
            for (int j = 0; j < dataItem.length(); j++) {
                JSONObject item = dataItem.getJSONObject(j);
                String id = item.getString("showIdCode");
                String name = item.getString("showTitle");
                String pic = item.getString("showImg");
                list.add(new Vod(id, name, getPic(pic), getRemarks(item)));
            }
        }
        return Result.string(list);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        int page = Integer.parseInt(pg) - 1;
        if (tid.endsWith("/{pg}")) return searchContent(tid.split("/")[0], page);
        checkExtend(extend, "by", "3");
        checkExtend(extend, "area", "0");
        checkExtend(extend, "lang", "0");
        checkExtend(extend, "year", "");
        checkExtend(extend, "class", "0");
        Map<String, String> params = new TreeMap<>();
        params.put("sort_by", extend.get("by"));
        params.put("channel_id", tid);
        params.put("show_type_id", extend.get("class"));
        params.put("region_id", extend.get("area"));
        params.put("lang_id", extend.get("lang"));
        params.put("year_range", extend.get("year"));
        params.put("start", String.valueOf(page * 20));
        JSONObject object = new JSONObject(post(categoryUrl, params));
        JSONArray array = object.getJSONArray("list");
        List<Vod> list = new ArrayList<>();
        boolean land = tid.equals("7") || tid.equals("16");
        for (int i = 0; i < array.length(); i++) {
            JSONObject item = array.getJSONObject(i);
            String id = item.getString("showIdCode");
            String name = item.getString("showTitle");
            String pic = item.getString("showImg");
            if (land) list.add(new Vod(id, name, getPic(pic), getRemarks(item), Vod.Style.rect(1.33f)));
            else list.add(new Vod(id, name, getPic(pic), getRemarks(item)));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Map<String, String> params = new TreeMap<>();
        params.put("show_id_code", ids.get(0));
        JSONObject object = new JSONObject(post(detailUrl, params));
        JSONObject entity = object.getJSONObject("entity");
        JSONArray plays = entity.getJSONArray("plays");
        String id = entity.optString("showIdCode");
        List<String> vodItems = new ArrayList<>();
        for (int j = 0; j < plays.length(); j++) {
            JSONObject item = plays.getJSONObject(j);
            String episodeName = item.getString("episodeName");
            episodeName = TextUtils.isEmpty(episodeName) ? "播放" : episodeName;
            vodItems.add(episodeName + "$" + id + "_" + item.getString("playIdCode"));
        }
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodName(entity.optString("showTitle"));
        vod.setVodPic(getPic(entity.optString("showImg")));
        vod.setVodContent(entity.optString("showDesc"));
        vod.setVodDirector(convert(entity.optString("director")));
        vod.setVodActor(convert(entity.optString("actors")));
        vod.setVodYear(entity.optString("postYear"));
        vod.setVodArea(entity.optString("regionName"));
        vod.setTypeName((entity.optString("channelName")));
        vod.setVodPlayUrl(TextUtils.join("#", vodItems));
        vod.setVodRemarks(getRemarks(entity));
        vod.setVodPlayFrom("泥巴");
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] ids = id.split("_");
        Map<String, String> params = new TreeMap<>();
        params.put("show_id_code", ids[0]);
        params.put("play_id_code", ids[1]);
        params.put("oid", "1");
        JSONObject object = new JSONObject(post(playUrl, params));
        String playUrl = object.getJSONObject("entity").optString("playUrl");
        return Result.get().url(playUrl).header(getHeaders()).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, 0);
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        return searchContent(key, Integer.parseInt(pg) - 1);
    }

    public String searchContent(String key, int pg) throws Exception {
        Map<String, String> params = new TreeMap<>();
        params.put("keyword", key);
        params.put("start", String.valueOf(pg * 20));
        params.put("cat_id", adult ? "2" : "1");
        params.put("keyword_type", "0");
        JSONObject object = new JSONObject(post(searchUrl, params));
        JSONArray array = object.getJSONArray("list");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            JSONObject item = array.getJSONObject(i);
            String id = item.getString("showIdCode");
            String name = item.getString("showTitle");
            String pic = item.getString("showImg");
            list.add(new Vod(id, name, getPic(pic), getRemarks(item)));
        }
        return Result.string(list);
    }

    private String genUrl(String url, Map<String, String> bodys) {
        String randomStr = "AABBCC";
        String oidTime = String.valueOf(new Date().getTime() - 10 * 60 * 1000);
        String oid = encode(oidTime + "_" + randomStr);
        Map<String, String> params = new TreeMap<>();
        params.put("_ts", String.valueOf(new Date().getTime()));
        params.put("app_version", "1.0");
        params.put("platform", "3");
        params.put("market_id", "web_nivod");
        params.put("device_code", "web");
        params.put("versioncode", "1");
        params.put("oid", oid);
        StringBuilder sign_query = new StringBuilder("__QUERY::");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue().equals("")) continue;
            sign_query.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        StringBuilder sign_body = new StringBuilder("__BODY::");
        for (Map.Entry<String, String> entry : bodys.entrySet()) {
            if (entry.getValue().equals("")) continue;
            sign_body.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        String _SECRET_PREFIX = "__KEY::";
        String secretKey = "2x_Give_it_a_shot";
        String has = Util.MD5(sign_query + sign_body.toString() + _SECRET_PREFIX + secretKey, "UTF-8");
        url += "?_ts=" + params.get("_ts") + "&app_version=" + params.get("app_version") + "&platform=" + params.get("platform") + "&market_id=" + params.get("market_id") + "&device_code=" + params.get("device_code") + "&versioncode=" + params.get("versioncode") + "&oid=" + params.get("oid") + "&sign=" + has;
        return url;
    }

    private String getPic(String pic) {
        return pic.replace(".nivod4.", ".nivod.");
    }

    private String getRemarks(JSONObject item) {
        String remark = item.optString("episodesTxt");
        remark = TextUtils.isEmpty(remark) || remark.equals("null") ? "" : remark;
        return remark;
    }

    private String convert(String text) {
        StringBuilder sb = new StringBuilder();
        for (String s : text.split(",")) sb.append(String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", s + "/{pg}", s, s)).append(",");
        return Util.substring(sb.toString());
    }

    private String get(String url) {
        return decode(OkHttp.string(genUrl(url, new HashMap<>()), getHeaders()));
    }

    private String post(String url, Map<String, String> params) {
        return decode(OkHttp.post(genUrl(url, params), params, getHeaders()).getBody());
    }

    @SuppressLint("GetInstance")
    private Cipher getCipher(int mode) {
        try {
            DESKeySpec dks = new DESKeySpec(des_key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            Key secretKey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS7Padding");
            cipher.init(mode, secretKey);
            return cipher;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private String encode(String data) {
        try {
            if (data == null || data.isEmpty()) return "";
            Cipher cipher = getCipher(Cipher.ENCRYPT_MODE);
            if (cipher == null) return "";
            byte[] byteHex = cipher.doFinal(data.getBytes("UTF-8"));
            return byteToHexString(byteHex);
        } catch (Exception e) {
            return "";
        }
    }

    private String decode(String data) {
        try {
            if (data == null || data.isEmpty()) return "";
            byte[] b = hex2byte(data);
            Cipher cipher = getCipher(Cipher.DECRYPT_MODE);
            if (cipher == null) return "";
            return new String(cipher.doFinal(b), "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    private String byteToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length);
        String sTemp;
        for (byte aByte : bytes) {
            sTemp = Integer.toHexString(0xFF & aByte);
            if (sTemp.length() < 2) sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString().toLowerCase();
    }

    private byte[] hex2byte(String hex) throws IllegalArgumentException {
        char[] arr = hex.toCharArray();
        byte[] b = new byte[hex.length() / 2];
        for (int i = 0, j = 0, l = hex.length(); i < l; i++, j++) {
            String swap = String.valueOf(arr[i++]) + arr[i];
            int byteInt = Integer.parseInt(swap, 16) & 0xFF;
            b[j] = Integer.valueOf(byteInt).byteValue();
        }
        return b;
    }
}
