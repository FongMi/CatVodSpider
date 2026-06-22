package com.github.catvod.spider.merge;

import android.content.Context;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.xx;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class zm extends Spider {
    public static String HM = null;
    private static long S = 0;
    private static String l8 = "";
    private static final Map<String, String> T4 = new HashMap();
    private static final Map<String, Long> b = new HashMap();
    private static final Map<String, Map<String, String>> OL = new HashMap();
    private static final ReentrantLock l = new ReentrantLock();
    private static final Pattern tT = Pattern.compile("(https://www.aliyundrive.com/s/[^\"]+)");
    public static Pattern N = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    private static synchronized String OL(String str, String str2) {
        try {
            long jT4 = T4();
            Map<String, String> map = T4;
            String str3 = map.get(str);
            Map<String, Long> map2 = b;
            Long l2 = map2.get(str);
            if (!TextUtils.isEmpty(str3) && l2.longValue() - jT4 > 600) {
                return str3;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_id", str);
            jSONObject.put("share_pwd", str2);
            JSONObject jSONObject2 = new JSONObject(S("https://api.aliyundrive.com/v2/share_link/get_share_token", jSONObject.toString(), l8()));
            String strOptString = jSONObject2.optString("share_token");
            map2.put(str, Long.valueOf(jT4 + jSONObject2.getLong("expires_in")));
            map.put(str, strOptString);
            return strOptString;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static Object[] ProxyMedia(Map<String, String> map) {
        try {
            String str = map.get("share_id");
            String str2 = map.get("file_id");
            String str3 = map.get("media_id");
            String strOL = OL(str, "");
            ReentrantLock reentrantLock = l;
            reentrantLock.lock();
            Map<String, Map<String, String>> map2 = OL;
            String str4 = map2.get(str2).get(str3);
            if (new Long(new UrlQuerySanitizer(str4).getValue("x-oss-expires")).longValue() - T4() <= 60) {
                b(str, strOL, str2);
                str4 = map2.get(str2).get(str3);
            }
            reentrantLock.unlock();
            new HashMap();
            xx.aA aAVar = new xx.aA() { // from class: com.github.catvod.spider.merge.zm.1
                @Override // com.github.catvod.spider.merge.xx
                protected void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.xx
                public String onResponse(Response response) {
                    return null;
                }
            };
            Yy.b(Yy.T4(), str4, null, l8(), aAVar);
            return new Object[]{200, "video/MP2T", aAVar.getResult().body().byteStream()};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private static String S(String str, String str2, Map<String, String> map) {
        xx.ut utVar = new xx.ut() { // from class: com.github.catvod.spider.merge.zm.2
            @Override // com.github.catvod.spider.merge.xx
            protected void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.xx
            public String onResponse(String str3) {
                return str3;
            }
        };
        Yy.N(Yy.T4(), str, str2, map, utVar);
        return utVar.getResult();
    }

    protected static long T4() {
        return (System.currentTimeMillis() / 1000) + 0;
    }

    private static String b(String str, String str2, String str3) {
        int i;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_id", str);
            jSONObject.put("category", "live_transcoding");
            jSONObject.put("file_id", str3);
            jSONObject.put("template_id", "");
            HashMap<String, String> mapL8 = l8();
            mapL8.put("x-share-token", str2);
            mapL8.put("authorization", l8);
            JSONObject jSONObject2 = new JSONObject(S("https://api.aliyundrive.com/v2/file/get_share_link_video_preview_play_info", jSONObject.toString(), mapL8));
            ArrayList arrayList = new ArrayList();
            arrayList.add("FHD");
            arrayList.add("HD");
            arrayList.add("SD");
            JSONArray jSONArray = jSONObject2.optJSONObject("video_preview_play_info").getJSONArray("live_transcoding_task_list");
            Iterator it = arrayList.iterator();
            String strOptString = "";
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str4 = (String) it.next();
                if (!strOptString.isEmpty()) {
                    break;
                }
                while (true) {
                    if (i < jSONArray.length()) {
                        jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject.optString("template_id").equals(str4)) {
                            break;
                        }
                        i++;
                    }
                }
                strOptString = jSONObjectOptJSONObject.optString("url");
            }
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONArray.optJSONObject(0).optString("url");
            }
            HashMap map = new HashMap();
            Yy.Kf(strOptString, l8(), map);
            String strOL = Yy.OL(map);
            String strV = Yy.v(strOL, l8());
            String str5 = strOL.substring(0, strOL.lastIndexOf("/")) + "/";
            ArrayList arrayList2 = new ArrayList();
            HashMap map2 = new HashMap();
            String[] strArrSplit = strV.split("\n");
            int length = strArrSplit.length;
            int i2 = 0;
            while (i < length) {
                String str6 = strArrSplit[i];
                if (str6.contains("x-oss-expires")) {
                    i2++;
                    map2.put("" + i2, str5 + str6);
                    str6 = com.github.catvod.spider.u.localProxyUrl() + "?do=push&type=media&share_id=" + str + "&file_id=" + str3 + "&media_id=" + i2;
                }
                arrayList2.add(str6);
                i++;
            }
            OL.put(str3, map2);
            return TextUtils.join("\n", arrayList2);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public static Object[] getFile(Map<String, String> map) {
        try {
            String str = map.get("share_id");
            return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(b(str, OL(str, ""), map.get("file_id")).getBytes())};
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    private static void l() {
        long jT4 = T4();
        if (l8.isEmpty() || S - jT4 <= 600) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("refresh_token", HM);
                JSONObject jSONObject2 = new JSONObject(S("https://api.aliyundrive.com/token/refresh", jSONObject.toString(), l8()));
                l8 = jSONObject2.optString("token_type") + " " + jSONObject2.optString("access_token");
                S = jT4 + jSONObject2.getLong("expires_in");
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
        }
    }

    private static HashMap<String, String> l8() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        map.put("Referer", "https://www.aliyundrive.com/");
        return map;
    }

    private static HashMap<String, String> tT() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        return map;
    }

    public static Object[] vod(Map<String, String> map) {
        String str = map.get("type");
        if (str.equals("m3u8")) {
            return getFile(map);
        }
        if (str.equals("media")) {
            return ProxyMedia(map);
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14 = "";
        try {
            String str15 = list.get(0);
            Pattern pattern = N;
            Matcher matcher = tT.matcher(str15);
            Matcher matcher2 = pattern.matcher(str15);
            String str16 = "vod_remarks";
            String str17 = "vod_area";
            if (ZP.l(str15) && !str15.contains("qq.com") && !str15.contains("mgtv.com")) {
                String strOL = YS.l8(Yy.v(str15, null)).LD("head > title").OL();
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", str15);
                jSONObject2.put("vod_name", strOL);
                jSONObject2.put("vod_pic", "https://img.zcool.cn/community/0123545c74c5aea801213f261297df.png");
                jSONObject2.put("type_name", "官源");
                jSONObject2.put("vod_year", "");
                jSONObject2.put("vod_area", "");
                jSONObject2.put("vod_remarks", "");
                jSONObject2.put("vod_actor", "");
                jSONObject2.put("vod_director", "");
                jSONObject2.put("vod_content", "");
                jSONObject2.put("vod_play_from", "jx");
                jSONObject2.put("vod_play_url", "立即播放$" + str15);
                jSONArray.put(jSONObject2);
                jSONObject.put("list", jSONArray);
                return jSONObject.toString();
            }
            if (ZP.l(str15) && str15.contains("qq.com")) {
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                g9 g9VarL8 = YS.l8(Yy.v(str15, tT()));
                String strOL2 = g9VarL8.LD("head > title").OL();
                jk jkVarLD = g9VarL8.LD("div.episode-list-rect__item");
                try {
                    if (jkVarLD.isEmpty()) {
                        str11 = "";
                        str12 = "vod_remarks";
                        str13 = "vod_area";
                        jSONObject4.put("vod_play_url", "立即播放$" + str15);
                    } else {
                        int i = 0;
                        while (i < jkVarLD.size()) {
                            Iw iw = jkVarLD.get(i);
                            jk jkVar = jkVarLD;
                            String str18 = str16;
                            String strL8 = iw.LD("div").l8("data-vid");
                            String str19 = str17;
                            String strL82 = iw.LD("div").l8("data-cid");
                            StringBuilder sb = new StringBuilder();
                            String str20 = str14;
                            sb.append("https://v.qq.com/x/cover/");
                            sb.append(strL82);
                            sb.append("/");
                            sb.append(strL8);
                            String string = sb.toString();
                            arrayList.add(iw.LD("div span").OL() + "$" + string);
                            i++;
                            jkVarLD = jkVar;
                            str16 = str18;
                            str17 = str19;
                            str14 = str20;
                        }
                        str11 = str14;
                        str12 = str16;
                        str13 = str17;
                        jSONObject4.put("vod_play_url", TextUtils.join("#", arrayList));
                    }
                    jSONObject4.put("vod_id", str15);
                    jSONObject4.put("vod_name", strOL2);
                    jSONObject4.put("vod_pic", "https://img2.baidu.com/it/u=2655029475,2190949369&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=593");
                    jSONObject4.put("type_name", "腾讯TV");
                    String str21 = str11;
                    jSONObject4.put("vod_year", str21);
                    jSONObject4.put(str13, str21);
                    jSONObject4.put(str12, str21);
                    jSONObject4.put("vod_actor", str21);
                    jSONObject4.put("vod_director", str21);
                    jSONObject4.put("vod_content", str15);
                    jSONObject4.put("vod_play_from", "jx");
                    jSONArray2.put(jSONObject4);
                    jSONObject3.put("list", jSONArray2);
                    return jSONObject3.toString();
                } catch (Throwable unused) {
                    return str11;
                }
            }
            String str22 = "list";
            if (!ZP.l(str15)) {
                str = str22;
                str2 = "vod_play_from";
                str3 = "vod_content";
            } else {
                if (str15.contains("mgtv.com")) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject5 = new JSONObject();
                    JSONArray jSONArray3 = new JSONArray();
                    JSONObject jSONObject6 = new JSONObject();
                    Matcher matcher3 = Pattern.compile("https://\\S+mgtv.com/b/(\\d+)/(\\d+).html.*").matcher(str15);
                    if (matcher3.find()) {
                        str8 = "vod_actor";
                        StringBuilder sb2 = new StringBuilder();
                        str7 = "vod_remarks";
                        sb2.append("https://pcweb.api.mgtv.com/episode/list?video_id=");
                        sb2.append(matcher3.group(2));
                        str6 = "vod_area";
                        JSONObject jSONObject7 = new JSONObject(Yy.v(sb2.toString(), l8()));
                        String strOptString = jSONObject7.optJSONObject("data").optJSONObject("info").optString("title");
                        JSONArray jSONArray4 = new JSONArray(jSONObject7.optJSONObject("data").optString(str22));
                        if (jSONArray4.length() > 0) {
                            int i2 = 0;
                            while (i2 < jSONArray4.length()) {
                                JSONObject jSONObjectOptJSONObject = jSONArray4.optJSONObject(i2);
                                JSONArray jSONArray5 = jSONArray4;
                                if (jSONObjectOptJSONObject.optString("isIntact").equals("1")) {
                                    String strOptString2 = jSONObjectOptJSONObject.optString("t4");
                                    String strOptString3 = jSONObjectOptJSONObject.optString("video_id");
                                    StringBuilder sb3 = new StringBuilder();
                                    str10 = str22;
                                    sb3.append("https://www.mgtv.com/b/");
                                    sb3.append(matcher3.group(1));
                                    sb3.append("/");
                                    sb3.append(strOptString3);
                                    sb3.append(".html");
                                    arrayList2.add(strOptString2 + "$" + sb3.toString());
                                } else {
                                    str10 = str22;
                                }
                                i2++;
                                jSONArray4 = jSONArray5;
                                str22 = str10;
                            }
                            str5 = str22;
                            jSONObject6.put("vod_play_url", TextUtils.join("#", arrayList2));
                        } else {
                            str5 = str22;
                            jSONObject6.put("vod_play_url", "立即播放$" + str15);
                        }
                        str9 = strOptString;
                    } else {
                        str5 = str22;
                        str6 = "vod_area";
                        str7 = "vod_remarks";
                        str8 = "vod_actor";
                        str9 = "";
                    }
                    jSONObject6.put("vod_id", str15);
                    jSONObject6.put("vod_name", str9);
                    jSONObject6.put("vod_pic", "https://img2.baidu.com/it/u=2562822927,704100654&fm=253&fmt=auto&app=138&f=JPEG?w=600&h=380");
                    jSONObject6.put("type_name", "芒果TV");
                    jSONObject6.put("vod_year", "");
                    jSONObject6.put(str6, "");
                    jSONObject6.put(str7, "");
                    jSONObject6.put(str8, "");
                    jSONObject6.put("vod_director", "");
                    jSONObject6.put("vod_content", str15);
                    jSONObject6.put("vod_play_from", "jx");
                    jSONArray3.put(jSONObject6);
                    jSONObject5.put(str5, jSONArray3);
                    return jSONObject5.toString();
                }
                str = str22;
                str3 = "vod_content";
                str2 = "vod_play_from";
            }
            if (ZP.OL(str15)) {
                JSONObject jSONObject8 = new JSONObject();
                JSONArray jSONArray6 = new JSONArray();
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("vod_id", str15);
                jSONObject9.put("vod_name", str15);
                jSONObject9.put("vod_pic", "https://img.zcool.cn/community/0123545c74c5aea801213f261297df.png");
                jSONObject9.put("type_name", "直连");
                jSONObject9.put(str2, "player");
                jSONObject9.put("vod_play_url", "立即播放$" + str15);
                jSONArray6.put(jSONObject9);
                jSONObject8.put(str, jSONArray6);
                return jSONObject8.toString();
            }
            if (str15.startsWith("magnet")) {
                if (str15.length() > 100) {
                    str4 = str15.substring(0, 30) + "..." + str15.substring(str15.length() - 10);
                } else {
                    str4 = str15;
                }
                JSONObject jSONObject10 = new JSONObject();
                JSONArray jSONArray7 = new JSONArray();
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put("vod_id", str15);
                jSONObject11.put("vod_name", str4);
                jSONObject11.put("vod_pic", "https://img2.baidu.com/it/u=1609185522,4130752057&fm=253&f=JPEG");
                jSONObject11.put("type_name", "磁力");
                jSONObject11.put(str2, "磁力测试");
                jSONObject11.put("vod_play_url", "立即播放$" + str15);
                jSONArray7.put(jSONObject11);
                jSONObject10.put(str, jSONArray7);
                return jSONObject10.toString();
            }
            if (str15.startsWith("http") && matcher.find()) {
                return getAliContent(list);
            }
            if (!str15.startsWith("http") || matcher2.find() || matcher.find()) {
                return "";
            }
            String strOL3 = YS.l8(Yy.v(str15, null)).LD("head > title").OL();
            JSONObject jSONObject12 = new JSONObject();
            JSONArray jSONArray8 = new JSONArray();
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("vod_id", str15);
            jSONObject13.put("vod_name", strOL3);
            jSONObject13.put("vod_pic", "https://pic.rmb.bdstatic.com/bjh/1d0b02d0f57f0a42201f92caba5107ed.jpeg");
            jSONObject13.put("type_name", "嗅探");
            jSONObject13.put(str3, str15);
            jSONObject13.put(str2, "嗅探");
            jSONObject13.put("vod_play_url", "立即播放嗅探$" + str15);
            jSONArray8.put(jSONObject13);
            jSONObject12.put(str, jSONArray8);
            return jSONObject12.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String getAliContent(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            Matcher matcher = N.matcher(strTrim);
            if (!matcher.find()) {
                return "";
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.groupCount() == 3 ? matcher.group(3) : "";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("share_id", strGroup);
            JSONObject jSONObject2 = new JSONObject(S("https://api.aliyundrive.com/adrive/v3/share_link/get_share_by_anonymous", jSONObject.toString(), l8()));
            JSONArray jSONArray = jSONObject2.getJSONArray("file_infos");
            if (jSONArray.length() == 0) {
                return "";
            }
            JSONObject jSONObjectOptJSONObject = null;
            if (TextUtils.isEmpty(strGroup2)) {
                jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
                strGroup2 = jSONObjectOptJSONObject.optString("file_id");
            } else {
                int i = 0;
                while (true) {
                    if (i >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2.optString("file_id").equals(jSONObjectOptJSONObject2.optString("file_id"))) {
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject2;
                        break;
                    }
                    i++;
                }
                if (jSONObjectOptJSONObject == null) {
                    return "";
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", strTrim);
            jSONObject3.put("vod_name", jSONObject2.optString("share_name"));
            jSONObject3.put("vod_pic", jSONObject2.optString("avatar"));
            jSONObject3.put("vod_content", strTrim);
            jSONObject3.put("vod_play_from", "AliYun");
            ArrayList arrayList = new ArrayList();
            if (!jSONObjectOptJSONObject.optString("type").equals("folder")) {
                if (jSONObjectOptJSONObject.optString("type").equals("file")) {
                    jSONObjectOptJSONObject.optString("category").equals("video");
                }
                return "";
            }
            String strOL = OL(strGroup, "");
            Map<String, String> map = new HashMap<>();
            listFiles(map, strGroup, strOL, strGroup2);
            ArrayList<String> arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            for (String str : arrayList2) {
                arrayList.add(str + "$" + map.get(str));
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                arrayList3.add(TextUtils.join("#", arrayList));
            }
            jSONObject3.put("vod_play_url", TextUtils.join("$$$", arrayList3));
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject3);
            jSONObject4.put("list", jSONArray2);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.startsWith("http")) {
            HM = Yy.v(str, null);
        } else {
            HM = str;
        }
    }

    public void listFiles(Map<String, String> map, String str, String str2, String str3) {
        String str4;
        String str5;
        HashMap<String, String> map2;
        JSONObject jSONObject;
        String str6 = "_";
        try {
            String str7 = "https://api.aliyundrive.com/adrive/v3/file/list";
            HashMap<String, String> mapL8 = l8();
            mapL8.put("x-share-token", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("image_thumbnail_process", "image/resize,w_160/format,jpeg");
            jSONObject2.put("image_url_process", "image/resize,w_1920/format,jpeg");
            jSONObject2.put("limit", 200);
            jSONObject2.put("order_by", "updated_at");
            jSONObject2.put("order_direction", "DESC");
            jSONObject2.put("parent_file_id", str3);
            jSONObject2.put("share_id", str);
            jSONObject2.put("video_thumbnail_process", "video/snapshot,t_1000,f_jpg,ar_auto,w_300");
            String strOptString = "";
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (i <= 50 && (i < 2 || !TextUtils.isEmpty(strOptString))) {
                jSONObject2.put("marker", strOptString);
                JSONObject jSONObject3 = new JSONObject(S(str7, jSONObject2.toString(), mapL8));
                JSONArray jSONArray = jSONObject3.getJSONArray("items");
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject.optString("type").equals("folder")) {
                        arrayList.add(jSONObjectOptJSONObject.optString("file_id"));
                        str5 = str6;
                        str4 = str7;
                    } else {
                        str4 = str7;
                        if (jSONObjectOptJSONObject.optString("mime_type").contains("video")) {
                            String strReplace = jSONObjectOptJSONObject.optString("name").replace("#", str6).replace("$", str6);
                            str5 = str6;
                            if (strReplace.length() > 20) {
                                StringBuilder sb = new StringBuilder();
                                map2 = mapL8;
                                jSONObject = jSONObject2;
                                sb.append(strReplace.substring(0, 10));
                                sb.append("...");
                                sb.append(strReplace.substring(strReplace.length() - 10));
                                strReplace = sb.toString();
                            } else {
                                map2 = mapL8;
                                jSONObject = jSONObject2;
                            }
                            map.put(strReplace, str + "+" + str2 + "+" + jSONObjectOptJSONObject.optString("file_id"));
                            i2++;
                            str7 = str4;
                            str6 = str5;
                            mapL8 = map2;
                            jSONObject2 = jSONObject;
                        } else {
                            str5 = str6;
                        }
                    }
                    map2 = mapL8;
                    jSONObject = jSONObject2;
                    i2++;
                    str7 = str4;
                    str6 = str5;
                    mapL8 = map2;
                    jSONObject2 = jSONObject;
                }
                strOptString = jSONObject3.optString("next_marker");
                i++;
                str7 = str7;
                str6 = str6;
                mapL8 = mapL8;
                jSONObject2 = jSONObject2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    listFiles(map, str, str2, (String) it.next());
                } catch (Exception e) {
                    try {
                        SpiderDebug.log(e);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        SpiderDebug.log(e);
                        return;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        byte b2 = -1;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -985752863) {
                if (iHashCode != 3406) {
                    if (iHashCode != 706173) {
                        if (iHashCode == 1963852404 && str.equals("AliYun")) {
                            b2 = 3;
                        }
                    } else if (str.equals("嗅探")) {
                        b2 = 2;
                    }
                } else if (str.equals("jx")) {
                    b2 = 0;
                }
            } else if (str.equals("player")) {
                b2 = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
        }
        if (b2 == 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parse", 1);
            jSONObject.put("jx", "1");
            jSONObject.put("url", str2);
            return jSONObject.toString();
        }
        if (b2 == 1) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", 0);
            jSONObject2.put("playUrl", "");
            jSONObject2.put("url", str2);
            return jSONObject2.toString();
        }
        if (b2 == 2) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("parse", 1);
            jSONObject3.put("playUrl", "");
            jSONObject3.put("url", str2);
            return jSONObject3.toString();
        }
        if (b2 == 3) {
            l();
            String[] strArrSplit = str2.split("\\+");
            String str3 = com.github.catvod.spider.u.localProxyUrl() + "?do=push&type=m3u8&share_id=" + strArrSplit[0] + "&file_id=" + strArrSplit[2];
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("parse", "0");
            jSONObject4.put("playUrl", "");
            jSONObject4.put("url", str3);
            jSONObject4.put("header", "");
            return jSONObject4.toString();
        }
        return "";
    }
}
