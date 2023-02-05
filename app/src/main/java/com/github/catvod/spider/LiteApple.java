package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import okhttp3.Call;

public class LiteApple extends Spider {
    private static final String siteUrl = "http://ht.grelighting.cn/api.php";

    private HashMap<String, String> getHeaders(String url, String data) {
        HashMap<String, String> headers = new HashMap<>();
        if (data != null) {
            String token = "";
            try {
                token = Base64.encodeToString(b(fakeDevice.getBytes("UTF-8"), tokenKey == null ? "XPINGGUO" : tokenKey), 2);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
            String hash = md5(fakeDevice + data + currentTimeMillis).substring(8, 12);
            headers.put("token", token);
            headers.put("hash", hash);
            headers.put("timestamp", currentTimeMillis + "");
            if (tokenKey == null) {
                headers.put("version", "ANDROID cn.grelighting.xpg1.1.5");
            }
        }
        headers.put("User-Agent", "okhttp/4.9.1");
        return headers;
    }

    private String fakeDevice = null;
    private String tokenKey = null;

    @Override
    public void init(Context context, String extend) {
        super.init(context, extend);
        SharedPreferences sharedPreferences = context.getSharedPreferences("spider_LiteApple", Context.MODE_PRIVATE);
        try {
            fakeDevice = sharedPreferences.getString("didd", null);
        } catch (Throwable th) {
        } finally {
            if (fakeDevice == null) {
                fakeDevice = fakeDid();
                sharedPreferences.edit().putString("didd", fakeDevice).commit();
            }
        }
    }

    void getTokenKey() {
        if (tokenKey != null)
            return;
        String url = siteUrl + "/v2.user/tokenlogin";
        OkHttpUtil.post(OkHttpUtil.defaultClient(), url, null, getHeaders(url, "ANDROID cn.grelighting.xpg1.1.5"), new OKCallBack.OKCallBackString() {
            @Override
            protected void onFailure(Call call, Exception e) {

            }

            @Override
            protected void onResponse(String response) {
                try {
                    tokenKey = new JSONObject(response).getJSONObject("data").getString("user_title");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            getTokenKey();
            String url = siteUrl + "/v2.vod/androidtypes";
            String content = OkHttpUtil.string(url, getHeaders(url, null));
            JSONObject jsonObject = new JSONObject(decryptResponse(content));
            JSONArray jsonArray = jsonObject.getJSONArray("data");

            JSONObject filterConfig = new JSONObject();
            JSONArray classes = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jObj = jsonArray.getJSONObject(i);
                String typeName = jObj.getString("type_name");
                String typeId = jObj.getString("type_id");
                JSONObject newCls = new JSONObject();
                newCls.put("type_id", typeId);
                newCls.put("type_name", typeName);
                classes.put(newCls);

                JSONArray clses = jObj.getJSONArray("classes");
                JSONArray areas = jObj.getJSONArray("areas");
                JSONArray years = jObj.getJSONArray("years");

                JSONArray extendsAll = new JSONArray();
                // 类型
                JSONObject newTypeExtend;
                JSONArray newTypeExtendKV;
                JSONObject kv;
                newTypeExtend = new JSONObject();
                newTypeExtend.put("key", "class");
                newTypeExtend.put("name", "类型");
                newTypeExtendKV = new JSONArray();
                for (int j = 0; j < clses.length(); j++) {
                    String v = clses.getString(j);
                    kv = new JSONObject();
                    kv.put("n", v);
                    kv.put("v", v);
                    newTypeExtendKV.put(kv);
                }
                newTypeExtend.put("value", newTypeExtendKV);
                extendsAll.put(newTypeExtend);
                // 地区
                newTypeExtend = new JSONObject();
                newTypeExtend.put("key", "area");
                newTypeExtend.put("name", "地区");
                newTypeExtendKV = new JSONArray();
                kv = new JSONObject();
                kv.put("n", "全部");
                kv.put("v", "");
                newTypeExtendKV.put(kv);
                for (int j = 0; j < areas.length(); j++) {
                    String area = areas.getString(j);
                    kv = new JSONObject();
                    kv.put("n", area);
                    kv.put("v", area);
                    newTypeExtendKV.put(kv);
                }
                newTypeExtend.put("value", newTypeExtendKV);
                extendsAll.put(newTypeExtend);
                // 年份
                newTypeExtend = new JSONObject();
                newTypeExtend.put("key", "year");
                newTypeExtend.put("name", "年份");
                newTypeExtendKV = new JSONArray();
                kv = new JSONObject();
                kv.put("n", "全部");
                kv.put("v", "");
                newTypeExtendKV.put(kv);
                for (int j = 0; j < years.length(); j++) {
                    String year = years.getString(j);
                    kv = new JSONObject();
                    kv.put("n", year);
                    kv.put("v", year);
                    newTypeExtendKV.put(kv);
                }
                newTypeExtend.put("value", newTypeExtendKV);
                extendsAll.put(newTypeExtend);
                filterConfig.put(typeId, extendsAll);
                // 排序
                newTypeExtend = new JSONObject();
                newTypeExtend.put("key", "sortby");
                newTypeExtend.put("name", "排序");
                newTypeExtendKV = new JSONArray();
                kv = new JSONObject();
                kv.put("n", "时间");
                kv.put("v", "updatetime");
                newTypeExtendKV.put(kv);
                kv = new JSONObject();
                kv.put("n", "人气");
                kv.put("v", "hits");
                newTypeExtendKV.put(kv);
                kv = new JSONObject();
                kv.put("n", "评分");
                kv.put("v", "score");
                newTypeExtendKV.put(kv);
                newTypeExtend.put("value", newTypeExtendKV);
                extendsAll.put(newTypeExtend);
            }

            JSONObject result = new JSONObject();
            result.put("class", classes);
            if (filter) {
                result.put("filters", filterConfig);
            }
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
            for (int id = 1; id < 5; id++) {
                if (videos.length() > 30)
                    break;
                try {
                    String url = siteUrl + "/v2.main/androidhome";
                    String content = OkHttpUtil.string(url, getHeaders(url, null));
                    JSONObject jsonObject = new JSONObject(decryptResponse(content));
                    JSONArray jsonArray = jsonObject.getJSONObject("data").getJSONArray("list");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONArray jsonArraySub = jsonArray.getJSONObject(i).getJSONArray("list");
                        for (int j = 0; j < jsonArraySub.length() && j < 4; j++) {
                            JSONObject vObj = jsonArraySub.getJSONObject(j);
                            JSONObject v = new JSONObject();
                            v.put("vod_id", vObj.getString("id"));
                            v.put("vod_name", vObj.getString("name"));
                            v.put("vod_pic", vObj.getString("pic"));
                            v.put("vod_remarks", vObj.getString("updateInfo"));
                            videos.put(v);
                        }
                    }
                } catch (Exception e) {

                }
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
            getTokenKey();
            String area = extend.containsKey("area") ? extend.get("area") : "";
            String year = extend.containsKey("year") ? extend.get("year") : "";
            String url = siteUrl + "/v2.vod/androidfilter?page=" + pg + "&type=" + tid;
            Set<String> keys = extend.keySet();
            for (String key : keys) {
                String val = extend.get(key).trim();
                if (val.length() == 0)
                    continue;
                url += "&" + key + "=" + URLEncoder.encode(val);
            }
            String content = OkHttpUtil.string(url, getHeaders(url, area + year));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONArray jsonArray = dataObject.getJSONArray("data");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                v.put("vod_id", vObj.getString("id"));
                v.put("vod_name", vObj.getString("name"));
                v.put("vod_pic", vObj.getString("pic"));
                v.put("vod_remarks", vObj.getString("updateInfo"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            int limit = 20;
            int page = Integer.parseInt(pg);
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

    @Override
    public String detailContent(List<String> ids) {
        try {
            String url = siteUrl + "/v2.vod/androiddetail?vod_id=" + ids.get(0);
            String content = OkHttpUtil.string(url, getHeaders(url, ids.get(0)));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONObject vObj = dataObject.getJSONObject("data");
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            JSONObject vodAtom = new JSONObject();
            vodAtom.put("vod_id", vObj.getString("id"));
            vodAtom.put("vod_name", vObj.getString("name"));
            vodAtom.put("vod_pic", vObj.getString("pic"));
            vodAtom.put("type_name", vObj.getString("className"));
            vodAtom.put("vod_year", vObj.getString("year"));
            vodAtom.put("vod_area", vObj.getString("area"));
            vodAtom.put("vod_remarks", vObj.getString("updateInfo"));
            vodAtom.put("vod_actor", vObj.getString("actor"));
            vodAtom.put("vod_content", vObj.getString("content").trim());

            ArrayList<String> playUrls = new ArrayList<>();

            JSONArray urls = vObj.getJSONArray("urls");
            for (int i = 0; i < urls.length(); i++) {
                JSONObject u = urls.getJSONObject(i);
                playUrls.add(u.getString("key") + "$" + u.getString("url"));
            }

            vodAtom.put("vod_play_from", "LiteApple");
            vodAtom.put("vod_play_url", TextUtils.join("#", playUrls));
            list.put(vodAtom);
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
            if (Misc.isVideoFormat(id)) {
                JSONObject result = new JSONObject();
                result.put("parse", 0);
                result.put("header", "");
                result.put("playUrl", "");
                result.put("url", id);
                return result.toString();
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            getTokenKey();
            String url = siteUrl + "/v2.vod/androidsearch?page=1&wd=" + URLEncoder.encode(key);
            String content = OkHttpUtil.string(url, getHeaders(url, key));
            JSONObject dataObject = new JSONObject(decryptResponse(content));
            JSONArray jsonArray = dataObject.getJSONArray("data");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                String title = vObj.getString("name");
                if (!title.contains(key))
                    continue;
                JSONObject v = new JSONObject();
                v.put("vod_id", vObj.getString("id"));
                v.put("vod_name", title);
                v.put("vod_pic", vObj.getString("pic"));
                v.put("vod_remarks", vObj.getString("updateInfo"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    protected String decryptResponse(String src) {
        return src;
    }

    byte[] a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[333];
        for (int i9 = 0; i9 < 333; i9++) {
            bArr[i9] = (byte) i9;
        }
        if (bytes.length == 0) {
            return null;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 333; i12++) {
            i11 = (((bytes[i10] & 255) + (bArr[i12] & 255)) + i11) % 333;
            byte b = bArr[i12];
            bArr[i12] = bArr[i11];
            bArr[i11] = b;
            i10 = (i10 + 1) % bytes.length;
        }
        return bArr;
    }

    byte[] b(byte[] bArr, String str) {
        byte[] a = a(str);
        byte[] bArr2 = new byte[bArr.length];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            i9 = (i9 + 1) % 333;
            i10 = ((a[i9] & 255) + i10) % 333;
            byte b = a[i9];
            a[i9] = a[i10];
            a[i10] = b;
            bArr2[i11] = (byte) (a[((a[i9] & 255) + (a[i10] & 255)) % 333] ^ bArr[i11]);
        }
        return bArr2;
    }

    String randomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    String randomMACAddress() {
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);
        macAddr[0] = (byte) (macAddr[0] & (byte) 254);  //zeroing last 2 bytes to make it unicast and locally adminstrated
        StringBuilder sb = new StringBuilder(18);
        for (byte b : macAddr) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    String fakeDid() {
        String i = "";
        String f = "";
        String d = "N/A";
        try {
            d = Build.class.getField("SERIAL").get((Object) null).toString();
        } catch (Exception unused) {
        }
        String e = "";
        try {
            e = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.build.fingerprint"});
        } catch (Exception unused) {
            return "";
        }
        return (((((((((("" + i) + "||") + f) + "||") + randomMACAddress()) + "||") + randomString(16)) + "||") + d) + "||") + e;
    }

    String md5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception e9) {
            e9.printStackTrace();
            return str;
        }
    }

}
