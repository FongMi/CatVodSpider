package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A0.ku;
import com.github.catvod.spider.merge.A0.wh;
import com.github.catvod.spider.merge.A0.ya;
import com.github.catvod.spider.merge.A0.yi;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class PushAgent extends Spider {
    public static String a = "false";
    public static String b = "";
    public static String c = "";
    public static String d = ".m3u8#.mp4#.flv#video/tos#.mp3#.m4a#.wma";
    public static String e = "=http#.html#?http";

    /* JADX INFO: renamed from: com.github.catvod.spider.PushAgent$1, reason: invalid class name */
    class AnonymousClass1 extends ya {
        @Override // com.github.catvod.spider.merge.A0.xh
        public final void onFailure(Call call, Exception exc) {
        }

        @Override // com.github.catvod.spider.merge.A0.xh
        public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        }
    }

    public static boolean checkstring(String str) {
        String[] strArr = {"m3u8.pw/Cache", "from=https://banyung.pw", "getm3u8?url=http"};
        for (int i = 0; i < 3; i++) {
            if (str.contains(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            HashMap map2 = new HashMap();
            map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            map2.put("referer", str);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            yi.g(yi.f(), str2, map2, anonymousClass1);
            if (((Response) anonymousClass1.getResult()).code() != 200) {
                return null;
            }
            String str3 = ((Response) anonymousClass1.getResult()).headers().get("Content-Type");
            if (str3 == null) {
                str3 = "application/octet-stream";
            }
            return new Object[]{200, str3, ((Response) anonymousClass1.getResult()).body().byteStream()};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String repl(String str) {
        String[] strArr = {"#ignoreImg=true#", "#ignoreVideo=true#", "#ignoreMusic=true#", "#isVideo=true#", "#isMusic=true#", "#ignoreM3U8#", "#isM3u8#", "video://"};
        if (!str.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                str = str.replace(strArr[i], "");
            }
        }
        return str.replaceAll("；；", ";");
    }

    public static Object[] vod(Map<String, String> map) {
        if (map.get("type").equals("picproxy")) {
            return loadPic(map);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0539  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r42) {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.PushAgent.detailContent(java.util.List):java.lang.String");
    }

    public String hikernetpush(List<String> list) {
        try {
            String strTrim = list.get(0).trim();
            if (strTrim.startsWith("{") && strTrim.endsWith("}") && strTrim.contains("\"url")) {
                JSONObject jSONObject = new JSONObject(strTrim);
                if (jSONObject.has("url")) {
                    strTrim = repl(jSONObject.getString("url"));
                } else if (jSONObject.has("urls")) {
                    strTrim = repl(strTrim);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("vod_id", list.get(0));
            jSONObject3.put("vod_name", strTrim.contains("/redirectPlayUrl") ? "海阔投屏直链" : "海阔网页投屏");
            jSONObject3.put("vod_pic", "");
            jSONObject3.put("type_name", "海阔视界投屏解析");
            jSONObject3.put("vod_content", "使用说明，投屏新链接后请按播放界面的重播按钮刷新视频。");
            jSONObject3.put("vod_play_from", "海阔投屏");
            jSONObject3.put("vod_play_url", strTrim);
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String hikerpush(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str6;
        String strReplaceAll;
        String str7;
        JSONObject jSONObject2;
        String str8 = "subtitle";
        String str9 = "headers";
        try {
            String strTrim = list.get(0).trim();
            JSONObject jSONObject3 = new JSONObject(strTrim);
            String strRepl = jSONObject3.has("url") ? repl(jSONObject3.getString("url")) : jSONObject3.has("urls") ? repl(strTrim) : "";
            if (strRepl.contains(":52020") && !strRepl.contains("/redirectPlayUrl")) {
                return hikernetpush(list);
            }
            String string = (jSONObject3.has("name") || jSONObject3.has("title")) ? jSONObject3.has("name") ? jSONObject3.getString("name") : jSONObject3.getString("title") : "";
            String string2 = jSONObject3.has("pic") ? jSONObject3.getString("pic") : "";
            String string3 = jSONObject3.has("actor") ? jSONObject3.getString("actor") : "";
            String string4 = jSONObject3.has("director") ? jSONObject3.getString("director") : "海阔视界";
            String strOptString = jSONObject3.has("content") ? jSONObject3.optString("content") : "";
            String str10 = "&";
            if (jSONObject3.has("headers")) {
                str2 = string;
                str3 = string4;
                str = string3;
                b = jSONObject3.optString("headers").replaceAll("＆＆", "&").replaceAll("；；", ";");
            } else {
                str = string3;
                str2 = string;
                str3 = string4;
            }
            if (jSONObject3.has("manual")) {
                a = !jSONObject3.optString("manual").isEmpty() ? jSONObject3.optString("manual") : a;
            }
            if (jSONObject3.has("format")) {
                d = !jSONObject3.optString("format").isEmpty() ? jSONObject3.optString("format") : d;
            }
            if (jSONObject3.has("filters")) {
                e = !jSONObject3.optString("filters").isEmpty() ? jSONObject3.optString("filters") : e;
            }
            if (string2.contains("@Referer=")) {
                String[] strArrSplit = string2.split("@Referer=");
                string2 = (strArrSplit.length <= 1 || !strArrSplit[1].startsWith("http")) ? strArrSplit[0] : Proxy.getUrl() + "?do=push&type=picproxy&site=" + strArrSplit[1] + "&pic=" + strArrSplit[0];
            }
            String string5 = jSONObject3.has("from") ? jSONObject3.getString("from") : "";
            if (jSONObject3.has("subtitle")) {
                c = jSONObject3.getString("subtitle");
            }
            String str11 = string5;
            String str12 = string2;
            if (strRepl.startsWith("{") && strRepl.endsWith("}")) {
                JSONObject jSONObject4 = new JSONObject(strRepl);
                if (jSONObject4.has("urls")) {
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("urls");
                    strRepl = "";
                    str4 = strTrim;
                    int i = 0;
                    while (i < jSONArray2.length()) {
                        String string6 = jSONArray2.getString(i);
                        if (string6.contains("##")) {
                            String[] strArrSplit2 = string6.split("##");
                            jSONArray = jSONArray2;
                            string6 = (strArrSplit2[0].startsWith("file://") || strArrSplit2[0].startsWith("http://127.0") || strArrSplit2[0].startsWith("http://0.0")) ? strArrSplit2[1] : strArrSplit2[0];
                        } else {
                            jSONArray = jSONArray2;
                        }
                        String strReplace = string6.contains("?") ? string6.replace("#", str10) : string6.replace("#", "?");
                        String str13 = str8;
                        if (jSONObject4.has("names")) {
                            str6 = str10;
                            strReplaceAll = jSONObject4.getJSONArray("names").getString(i).replaceAll("#", "_").replaceAll("$", "_");
                        } else {
                            str6 = str10;
                            strReplaceAll = "线路" + (i + 1);
                        }
                        if (!jSONObject4.has(str9) || (jSONObject2 = jSONObject4.getJSONArray(str9).getJSONObject(i)) == null) {
                            str7 = str9;
                        } else {
                            str7 = str9;
                            strReplace = strReplace + "|" + jSONObject2.toString();
                        }
                        strRepl = i < 1 ? strReplaceAll + "$|" + strReplace : strRepl + "#" + strReplaceAll + "$|" + strReplace;
                        i++;
                        jSONArray2 = jSONArray;
                        str8 = str13;
                        str10 = str6;
                        str9 = str7;
                    }
                    str5 = str8;
                } else {
                    str4 = strTrim;
                    if (jSONObject4.has("url")) {
                        String strRepl2 = repl(jSONObject4.getString("url"));
                        if (strRepl2.contains("##")) {
                            String[] strArrSplit3 = strRepl2.split("##");
                            strRepl2 = (strArrSplit3[0].startsWith("file://") || strArrSplit3[0].startsWith("http://127.0") || strArrSplit3[0].startsWith("http://0.0")) ? strArrSplit3[1] : strArrSplit3[0];
                        }
                        String strReplace2 = strRepl2.contains("?") ? strRepl2.replace("#", "&") : strRepl2.replace("#", "?");
                        if (jSONObject4.has("headers") && (jSONObject = jSONObject4.getJSONObject("headers")) != null) {
                            strReplace2 = strReplace2 + "|" + jSONObject.toString();
                        }
                        strRepl = "|" + strReplace2;
                    }
                    str5 = "subtitle";
                }
                if (jSONObject4.has(str5)) {
                    c = jSONObject4.getString(str5);
                }
            } else {
                str4 = strTrim;
                if (!strRepl.contains(";{") && !strRepl.startsWith("{") && !strRepl.endsWith("}") && strRepl.contains("##")) {
                    String[] strArrSplit4 = strRepl.split("##");
                    String str14 = (strArrSplit4[0].startsWith("file://") || strArrSplit4[0].startsWith("http://127.0") || strArrSplit4[0].startsWith("http://0.0")) ? strArrSplit4[1] : strArrSplit4[0];
                    strRepl = str14.contains("?") ? str14.replace("#", "&") : str14.replace("#", "?");
                } else if (strRepl.contains(";{")) {
                    String[] strArrSplit5 = strRepl.split(";\\{")[1].split("\\}")[0].split("&&");
                    String str15 = strRepl.split(";\\{")[0];
                    if (str15.contains("##")) {
                        String[] strArrSplit6 = str15.split("##");
                        str15 = (strArrSplit6[0].startsWith("file://") || strArrSplit6[0].startsWith("http://127.0") || strArrSplit6[0].startsWith("http://0.0")) ? strArrSplit6[1] : strArrSplit6[0];
                    }
                    String strReplace3 = str15.contains("?") ? str15.replace("#", "&") : str15.replace("#", "?");
                    String str16 = "";
                    for (int i2 = 0; i2 < strArrSplit5.length; i2++) {
                        String str17 = strArrSplit5[i2].split("@")[0] + "=" + URLEncoder.encode(strArrSplit5[i2].split("@")[1]);
                        str16 = i2 < 1 ? str17 : str16 + "&" + str17;
                    }
                    strRepl = "|" + strReplace3 + "|" + str16;
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("vod_id", str4);
            jSONObject6.put("vod_actor", str);
            jSONObject6.put("vod_director", str3);
            jSONObject6.put("vod_name", str2);
            jSONObject6.put("vod_content", strOptString);
            jSONObject6.put("vod_pic", str12);
            jSONObject6.put("type_name", "海阔视界推送");
            jSONObject6.put("vod_play_from", str11.isEmpty() ? "海阔视界" : str11);
            jSONObject6.put("vod_play_url", strRepl);
            jSONArray3.put(jSONObject6);
            jSONObject5.put("list", jSONArray3);
            return jSONObject5.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public boolean isVideoFormat(String str) {
        String strReplaceAll = d.replaceAll("＆＆", "&");
        String strReplaceAll2 = e.replaceAll("＆＆", "&");
        String[] strArrSplit = strReplaceAll.toLowerCase().split("#");
        String[] strArrSplit2 = strReplaceAll2.toLowerCase().split("#");
        String lowerCase = str.toLowerCase();
        if ((lowerCase.contains("=http") || lowerCase.contains(".html")) && !checkstring(lowerCase)) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (lowerCase.contains(str2)) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.contains(str3) && !checkstring(lowerCase)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean manualVideoCheck() {
        String str = a;
        return str.equals("1") || str.equals("是") || str.equalsIgnoreCase("true");
    }

    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        String str4 = str2;
        try {
            String str5 = "url";
            if (str4.startsWith("ftp://") && str4.contains("gbl.114s")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 0);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", "tvbox-xg:".concat(str4));
                return jSONObject.toString();
            }
            if (str.equals("jx") || str.equals("解析")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("parse", 1);
                jSONObject2.put("jx", "1");
                jSONObject2.put("url", str4);
                return jSONObject2.toString();
            }
            if (str.equals("嗅探")) {
                String strP = ((str4.contains("vip.ffzy") || str4.contains("vip.lz") || str4.contains("hd.lz") || str4.contains("suonizy")) && str4.contains("/share/") && !str4.contains("/redirectPlayUrl")) ? wh.p(str2) : str4;
                JSONObject jSONObject3 = new JSONObject();
                if (strP.contains("/redirectPlayUrl") || strP.contains("index.m3u8")) {
                    jSONObject3.put("parse", 0);
                } else {
                    jSONObject3.put("parse", 1);
                }
                jSONObject3.put("playUrl", "");
                jSONObject3.put("url", strP);
                return jSONObject3.toString();
            }
            if (str.equals("海阔投屏")) {
                JSONObject jSONObject4 = new JSONObject();
                if (str4.contains("/redirectPlayUrl")) {
                    HashMap map = new HashMap();
                    yi.n(str4, null, map);
                    jSONObject4.put("url", yi.h(map));
                } else {
                    JSONObject jSONObject5 = new JSONObject(yi.k(str4.concat("/playUrl?enhance=true"), null));
                    if (jSONObject5.has("headers")) {
                        jSONObject4.put("header", jSONObject5.getJSONObject("headers").toString());
                    }
                    if (jSONObject5.has("subtitle") && jSONObject5.getString("subtitle").startsWith("http")) {
                        jSONObject4.put("subt", jSONObject5.getString("subtitle").split(";\\{")[0]);
                    }
                    jSONObject4.put("url", jSONObject5.getString("url"));
                }
                jSONObject4.put("parse", 0);
                jSONObject4.put("playUrl", "");
                return jSONObject4.toString();
            }
            if (str.equals("magnet") || str.equals("JianPian") || str.equals("视频")) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("parse", 0);
                jSONObject6.put("playUrl", "");
                jSONObject6.put("url", str4);
                return jSONObject6.toString();
            }
            JSONObject jSONObject7 = new JSONObject();
            if (!str2.trim().startsWith("|")) {
                str4 = "|" + str2.trim();
            }
            String[] strArrSplit = str4.trim().split("\\|");
            String strP2 = strArrSplit[1].split(";\\{")[0];
            if (strArrSplit[1].contains(";{") && strArrSplit[1].contains("@") && strArrSplit.length == 2) {
                JSONObject jSONObject8 = new JSONObject();
                String[] strArrSplit2 = strArrSplit[1].split(";\\{")[1].split("\\}")[0].split("&&");
                int i = 0;
                while (i < strArrSplit2.length) {
                    jSONObject8.put(strArrSplit2[i].split("@")[0], strArrSplit2[i].split("@")[1]);
                    i++;
                    str5 = str5;
                }
                str3 = str5;
                jSONObject7.put("header", jSONObject8.toString());
            } else {
                str3 = "url";
                if (strArrSplit.length == 3) {
                    JSONObject jSONObject9 = new JSONObject();
                    if (strArrSplit[2].startsWith("{") && strArrSplit[2].endsWith("}")) {
                        jSONObject7.put("header", new JSONObject(strArrSplit[2]).toString());
                    } else {
                        String str6 = strArrSplit[2];
                        String[] strArrSplit3 = str6.split("&");
                        if (strArrSplit3.length > 0) {
                            int length = strArrSplit3.length;
                            int i2 = 0;
                            while (i2 < length) {
                                String[] strArr = strArrSplit3;
                                String[] strArrSplit4 = strArrSplit3[i2].split("=");
                                int i3 = length;
                                if (strArrSplit4.length == 2) {
                                    jSONObject9.put(strArrSplit4[0], URLDecoder.decode(strArrSplit4[1], "UTF-8"));
                                }
                                i2++;
                                strArrSplit3 = strArr;
                                length = i3;
                            }
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            jSONObject7.put("header", jSONObject9.toString());
                        }
                    }
                } else if (b.startsWith("{") && b.endsWith("}")) {
                    jSONObject7.put("header", new JSONObject(b).toString());
                }
            }
            if ((strP2.contains("vip.ffzy") || strP2.contains("vip.lz") || strP2.contains("hd.lz") || strP2.contains("suonizy")) && strP2.contains("/share/")) {
                strP2 = wh.p(strP2);
            }
            if (strP2.startsWith("ftp://") && strP2.contains("gbl.114s")) {
                strP2 = "tvbox-xg:" + strP2;
            }
            if (ku.e(strP2) || (strP2.contains("pds.uc.cn") && strP2.contains("oss-traffic"))) {
                if (!TextUtils.isEmpty(c) && c.startsWith("http")) {
                    jSONObject7.put("subt", c.split(";\\{")[0]);
                }
                jSONObject7.put("parse", 0);
            } else if (!ku.f(strP2) || strP2.contains("=http")) {
                jSONObject7.put("parse", 1);
            } else {
                jSONObject7.put("parse", 1);
                jSONObject7.put("jx", "1");
            }
            jSONObject7.put("playUrl", "");
            jSONObject7.put(str3, strP2);
            return jSONObject7.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String strTrim = str.trim();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", strTrim);
            jSONObject.put("vod_name", strTrim);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
