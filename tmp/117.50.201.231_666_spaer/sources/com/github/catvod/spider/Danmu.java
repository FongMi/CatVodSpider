package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.AB.o.K;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import com.github.catvod.spider.merge.m.C0603l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Danmu extends Spider {
    public static Object[] AppDanmu(Map<String, String> map) throws Exception {
        SpiderDebug.log("开始获取弹幕");
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        String str = map.get("vodName");
        if (TextUtils.isEmpty(str)) {
            return objArr;
        }
        String realName = getRealName(str);
        int iD = d(map.get("vodIndex"));
        boolean z = false;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA) && "彩色".equals(new JSONObject(strA).optString("danmuColor"))) {
            z = true;
        }
        String strB = K.b(realName, iD);
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromOK360(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromOKJinchan(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromJinchanZY(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFrom1314(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            C0590I.i("弹幕加载失败");
            return objArr;
        }
        String danmuUrl2 = formatDanmuUrl2(strB);
        String strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
        if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
            C0590I.i("弹幕加载成功");
        }
        C0603l.a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    public static Object[] Danmu(Map<String, String> map) throws Exception {
        boolean z = false;
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA) && "彩色".equals(new JSONObject(strA).optString("danmuColor"))) {
            z = true;
        }
        String str = map.get("site");
        String strDecode = map.get("url");
        if (!TextUtils.isEmpty(strDecode) && !strDecode.startsWith("http")) {
            strDecode = URLDecoder.decode(strDecode);
        }
        String strUpdateDanmuColors = "";
        if ("js".equals(str)) {
            String danmuUrl2 = formatDanmuUrl2(strDecode);
            strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
            if (TextUtils.isEmpty(strUpdateDanmuColors)) {
                C0590I.i("弹幕加载失败");
            } else {
                C0590I.i("弹幕加载成功");
            }
        } else if ("wangpan".equals(str)) {
            String str2 = getRealName(C0603l.b("danmuvodname")).split(" ")[0];
            int iD = d(C0603l.b("danmuvodindex"));
            String strB = K.b(str2, iD);
            if (TextUtils.isEmpty(strB)) {
                strB = getDanmuFromPanOK360(str2, iD);
            }
            if (TextUtils.isEmpty(strB)) {
                strB = getDanmuFromOKJinchanSpace(str2, iD);
            }
            if (TextUtils.isEmpty(strB)) {
                strB = getDanmuFromJinchanZY(str2, iD);
            }
            if (TextUtils.isEmpty(strB)) {
                strB = getDanmuFrom1314(str2, iD);
            }
            if (TextUtils.isEmpty(strB)) {
                strUpdateDanmuColors = "";
                C0590I.i("弹幕加载失败");
            } else {
                String danmuUrl22 = formatDanmuUrl2(strB);
                strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl22) : updateDanmuWhite(danmuUrl22);
                if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
                    C0590I.i("弹幕加载成功");
                }
            }
        }
        C0603l.a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    public static Object[] DiyDanmu(Map<String, String> map) throws Exception {
        SpiderDebug.log("开始获取弹幕");
        Object[] objArr = {200, "application/xml", new ByteArrayInputStream("".getBytes())};
        JSONObject jSONObject = new JSONObject(C0575b.l("http://127.0.0.1:9978/media", new HashMap()));
        String realName = getRealName(jSONObject.optString("title"));
        String strOptString = jSONObject.optString("artist");
        String str = !TextUtils.isEmpty(strOptString) ? strOptString : realName;
        if (TextUtils.isEmpty(realName)) {
            return objArr;
        }
        int iD = d(str);
        boolean z = false;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA) && "彩色".equals(new JSONObject(strA).optString("danmuColor"))) {
            z = true;
        }
        String strB = K.b(realName, iD);
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromOK360(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromOKJinchan(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFromJinchanZY(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            strB = getDanmuFrom1314(realName, iD);
        }
        if (TextUtils.isEmpty(strB)) {
            C0590I.i("弹幕加载失败");
            return objArr;
        }
        String danmuUrl2 = formatDanmuUrl2(strB);
        String strUpdateDanmuColors = z ? updateDanmuColors(danmuUrl2) : updateDanmuWhite(danmuUrl2);
        if (!TextUtils.isEmpty(strUpdateDanmuColors)) {
            C0590I.i("弹幕加载成功");
        }
        C0603l.a("searchvodname", "");
        objArr[2] = new ByteArrayInputStream(strUpdateDanmuColors.getBytes());
        return objArr;
    }

    private static String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                if (!strOptString.contains("请遵守弹幕礼仪") && !strOptString.contains("官方弹幕库") && !strOptString.contains("未传入链接调用") && !strOptString.contains("弹幕列队") && !strOptString.contains("火花剧场") && !strOptString.contains("云烟小助手") && !strOptString.contains("微信公众号")) {
                    jSONArrayOptJSONArray2.optString(2);
                    String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedRGB());
                    Element elementCreateElement10 = documentNewDocument.createElement("d");
                    elementCreateElement10.setAttribute("p", str2);
                    elementCreateElement10.setTextContent(strOptString);
                    elementCreateElement.appendChild(elementCreateElement10);
                }
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    private static String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                if (!strOptString.contains("请遵守弹幕礼仪") && !strOptString.contains("官方弹幕库") && !strOptString.contains("未传入链接调用") && !strOptString.contains("弹幕列队") && !strOptString.contains("火花剧场") && !strOptString.contains("云烟小助手") && !strOptString.contains("微信公众号")) {
                    jSONArrayOptJSONArray2.optString(2);
                    String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedWhite());
                    Element elementCreateElement10 = documentNewDocument.createElement("d");
                    elementCreateElement10.setAttribute("p", str2);
                    elementCreateElement10.setTextContent(strOptString);
                    elementCreateElement.appendChild(elementCreateElement10);
                }
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    public static int d(String str) {
        if (str != null && !str.isEmpty()) {
            String strReplaceAll = str.replaceAll("\\[.*?\\]", "");
            Matcher matcher = Pattern.compile("第(\\d+)[集话]").matcher(strReplaceAll);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            if (strReplaceAll.contains("S") && strReplaceAll.contains("E")) {
                Matcher matcher2 = Pattern.compile("S\\d+E(\\d{2,3})").matcher(strReplaceAll);
                if (matcher2.find()) {
                    return Integer.parseInt(String.valueOf(Integer.parseInt(matcher2.group(1))));
                }
            } else {
                Matcher matcher3 = Pattern.compile("(\\d{4})[-._]?(\\d{2})[-._]?(\\d{2})").matcher(strReplaceAll);
                if (matcher3.find()) {
                    return Integer.parseInt(matcher3.group(1) + matcher3.group(2) + matcher3.group(3));
                }
                Matcher matcher4 = Pattern.compile("(\\d+)([a-zA-Z]*|(?:\\s+.*)?)").matcher(strReplaceAll.split("\\.")[0]);
                if (matcher4.find()) {
                    return Integer.parseInt(String.valueOf(Integer.parseInt(matcher4.group(1))));
                }
            }
        }
        return 1;
    }

    public static String formatDanmuUrl(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        HashMap map = new HashMap();
        String strL = C0575b.l("https://danmu.huaqi.pro/?url=" + str, map);
        if (strL != null && strL.length() > 0 && strL.startsWith("{") && strL.contains("\"code\":23")) {
            return strL;
        }
        String strL2 = C0575b.l("https://dmku.hls.one/?ac=dm&url=" + str, map);
        if (strL2 != null && strL2.length() > 0 && strL2.startsWith("{") && strL2.contains("\"code\":23")) {
            return strL2;
        }
        String strL3 = C0575b.l("https://danmu.zxz.ee/?type=json&id=" + str, map);
        if (strL3 != null && strL3.length() > 0 && strL3.startsWith("{") && strL3.contains("\"code\":23")) {
            return strL3;
        }
        String strL4 = C0575b.l("https://dm.ruyijx.com?ac=dm&url=" + str, map);
        return (strL4 == null || strL4.length() <= 0 || !strL4.startsWith("{") || !strL4.contains("\"code\":23")) ? "" : strL4;
    }

    public static String formatDanmuUrl2(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")) {
            return str;
        }
        if (str.startsWith("http")) {
            return C0575b.l("http://127.0.0.1:1314/danmu/get?url=" + str + "&format=xml", new HashMap());
        }
        if (!str.startsWith("vodid://")) {
            return "";
        }
        String[] strArrSplit = str.substring("vodid://".length()).split("@");
        return C0575b.l("http://127.0.0.1:1314/danmu/get?url=" + strArrSplit[0] + "&platform=" + strArrSplit[1] + "&format=xml", new HashMap());
    }

    public static String generateCombinedRGB() {
        String[] strArr = {"16711680", "16776960", "65280", "255", "16711935", "8388736", "16753920", "65535", "16777215", "16761087", "16777087", "8978431", "6527999", "16744447", "16756735", "8454143", "16724787", "16777215", "16752723", "16776951", "10000639", "5729279", "16645625", "16185078", "12334518", "13882321", "16777215", "16209488", "16772810", "16766758", "16777014", "16772362", "16773119", "14410239", "11835903", "16777215"};
        return strArr[new Random().nextInt(strArr.length)];
    }

    public static String generateCombinedWhite() {
        String[] strArr = {"16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16777215", "16711680", "16776960", "255", "65280", "8388736"};
        return strArr[new Random().nextInt(strArr.length)];
    }

    public static String getDanmuFrom1314(String str, int i) {
        try {
            String strK = C0575b.k("http://127.0.0.1:1314/danmu/auto?name=" + URLEncoder.encode(str, "UTF-8") + "&episode=" + i + "&format=xml");
            if (TextUtils.isEmpty(strK)) {
                return "";
            }
            return (strK.indexOf("<d") < 0 || strK.indexOf("</d>") < 0) ? "" : strK;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromJinchanZY(String str, int i) throws Exception {
        String strReplaceAll;
        boolean z;
        String strL = C0575b.l("http://127.0.0.1:9978/media", null);
        if (TextUtils.isEmpty(strL) || !strL.startsWith("{")) {
            return "";
        }
        JSONObject jSONObject = new JSONObject(strL);
        String string = jSONObject.has("title") ? jSONObject.getString("title") : "";
        String string2 = jSONObject.has("artist") ? jSONObject.getString("artist") : "";
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return "";
        }
        JSONObject jSONObject2 = new JSONObject(C0575b.l("https://zy.jinchancaiji.com/api.php/provide/vod/?ac=detail&wd=" + URLEncoder.encode(string, "UTF-8"), null));
        if (jSONObject2.getInt("code") != 1) {
            return "";
        }
        Matcher matcher = Pattern.compile("第[0-9一二三四五六七八九十百千万]+期[上中下]?").matcher(string2);
        if (matcher.find()) {
            strReplaceAll = removeLeadingZeroFromEpisode(matcher.group());
            z = false;
        } else {
            strReplaceAll = string2.replaceAll("[^0-9]", "");
            if (strReplaceAll.length() != 8) {
                return "";
            }
            z = true;
        }
        if (strReplaceAll.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("list");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string3 = jSONArray.getJSONObject(i2).getString("vod_play_url");
            if (!TextUtils.isEmpty(string3)) {
                for (String str2 : string3.split("#")) {
                    String[] strArrSplit = str2.split("\\$");
                    if (strArrSplit.length >= 2) {
                        String str3 = strArrSplit[0];
                        if (z) {
                            if (str3.equals(strReplaceAll)) {
                                return strArrSplit[1];
                            }
                        } else if (str3.equals(strReplaceAll)) {
                            return strArrSplit[1];
                        }
                    }
                }
            }
        }
        return "";
    }

    public static String getDanmuFromLogVar(String str, int i) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i2;
        JSONObject jSONObjectOptJSONObject;
        try {
            String strK = C0575b.k(String.format("https://pizazz.us.ci/1314/search/episodes?anime=%s", str));
            if (TextUtils.isEmpty(strK) || (jSONArrayOptJSONArray = new JSONObject(strK).optJSONArray("animes")) == null || jSONArrayOptJSONArray.length() == 0 || (jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONObject(0).optJSONArray("episodes")) == null || jSONArrayOptJSONArray2.length() == 0 || i - 1 < 0 || i2 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2)) == null) {
                return "";
            }
            String strOptString = jSONObjectOptJSONObject.optString("episodeId");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            return "vodid://" + strOptString;
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromOK360(String str, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        try {
            String strK = C0575b.k("http://127.0.0.1:9978/media");
            if (TextUtils.isEmpty(strK) || !strK.startsWith("{")) {
                return "";
            }
            long jOptLong = new JSONObject(strK).optLong("duration");
            if (jOptLong == 0) {
                return "";
            }
            long j = (jOptLong / 1000) / 60;
            String str2 = j < 30 ? "动漫" : j < 70 ? "电视剧" : "电影";
            String strK2 = C0575b.k(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", URLEncoder.encode(str, "UTF-8")));
            if (TextUtils.isEmpty(strK2) || (jSONObjectOptJSONObject = new JSONObject(strK2).optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("longData")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("rows")) == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (str2.equals(jSONObjectOptJSONObject4.optString("cat_name"))) {
                    String strOptString = "";
                    if (str2.equals("电影")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("playlinks");
                        if (jSONObjectOptJSONObject5 != null) {
                            String strOptString2 = jSONObjectOptJSONObject5.optString("qq");
                            if (TextUtils.isEmpty(strOptString2)) {
                                String strOptString3 = jSONObjectOptJSONObject5.optString("qiyi");
                                if (TextUtils.isEmpty(strOptString3)) {
                                    String strOptString4 = jSONObjectOptJSONObject5.optString("youku");
                                    if (TextUtils.isEmpty(strOptString4)) {
                                        String strOptString5 = jSONObjectOptJSONObject5.optString("imgo");
                                        if (!TextUtils.isEmpty(strOptString5)) {
                                            strOptString = strOptString5;
                                        }
                                    } else {
                                        strOptString = strOptString4;
                                    }
                                } else {
                                    strOptString = strOptString3;
                                }
                            } else {
                                strOptString = strOptString2;
                            }
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("seriesPlaylinks");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            return "";
                        }
                        int i3 = (i <= 0 ? 0 : i) - 1;
                        if (i3 < 0 || i3 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3)) == null) {
                            return "";
                        }
                        strOptString = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        return "";
                    }
                    if (strOptString.contains("v.qq.com") && strOptString.contains(".html") && (iIndexOf4 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf4);
                    } else if (strOptString.contains("www.iqiyi.com") && strOptString.contains(".html") && (iIndexOf3 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf3);
                    } else if (strOptString.contains("www.mgtv.com") && strOptString.contains(".html") && (iIndexOf2 = strOptString.indexOf(".html")) != -1) {
                        strOptString = strOptString.substring(0, ".html".length() + iIndexOf2);
                    } else if (strOptString.contains("v.youku.com") && (iIndexOf = strOptString.indexOf("vid=")) != -1) {
                        int i4 = iIndexOf + 4;
                        int iIndexOf5 = strOptString.indexOf("&", i4);
                        if (iIndexOf5 == -1) {
                            iIndexOf5 = strOptString.length();
                        }
                        String strSubstring = strOptString.substring(i4, iIndexOf5);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strOptString = "https://v.youku.com/v_show/id_" + strSubstring + ".html";
                        }
                    }
                    return strOptString;
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public static String getDanmuFromOKJinchan(String str, int i) {
        String str2;
        long jOptLong = 0;
        try {
            String strL = C0575b.l("http://127.0.0.1:9978/media", new HashMap());
            if (TextUtils.isEmpty(strL) || !strL.startsWith("{")) {
                return "";
            }
            jOptLong = new JSONObject(strL).optLong("duration");
        } catch (Exception unused) {
        }
        if (jOptLong == 0) {
            return "";
        }
        char c = 0;
        if (jOptLong > 4203712) {
            c = 1;
            str2 = "电影";
        } else if (jOptLong <= 1800000) {
            c = 2;
            str2 = "动漫";
        } else {
            str2 = "剧集";
        }
        Log.d("Danmu", "时长: " + jOptLong + "ms, " + str2);
        String strReplace = str.replace(" ", "");
        StringBuilder sb = new StringBuilder("https://zy.jinchancaiji.com/api.php/provide/vod/?ac=detail&wd=");
        sb.append(URLEncoder.encode(strReplace, "UTF-8"));
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        try {
            JSONObject jSONObject = new JSONObject(C0575b.l(string, map));
            if (jSONObject.optInt("code") != 1) {
                Log.e("Danmu", "搜索失败: " + string);
                return "";
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && strReplace.equals(jSONObjectOptJSONObject.optString("vod_name"))) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            if (arrayList.size() == 0) {
                return "";
            }
            JSONObject jSONObject2 = null;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                JSONObject jSONObject3 = (JSONObject) arrayList.get(i3);
                String strOptString = jSONObject3.optString("type_name");
                if (c == 1) {
                    if (Pattern.compile(".*片$").matcher(strOptString).matches()) {
                        jSONObject2 = jSONObject3;
                    }
                } else if (c == 2) {
                    if (Pattern.compile(".*漫$").matcher(strOptString).matches()) {
                        jSONObject2 = jSONObject3;
                    }
                } else if (Pattern.compile(".*剧$").matcher(strOptString).matches()) {
                    jSONObject2 = jSONObject3;
                }
            }
            if (jSONObject2 == null) {
                jSONObject2 = (JSONObject) arrayList.get(0);
            }
            String strOptString2 = jSONObject2.optString("vod_play_url");
            if (TextUtils.isEmpty(strOptString2)) {
                return "";
            }
            if (c != 1) {
                for (String str3 : strOptString2.split("#")) {
                    String[] strArrSplit = str3.split("\\$");
                    if (strArrSplit.length >= 2 && strArrSplit[0].replaceAll("\\D", "").equals(String.valueOf(i))) {
                        return strArrSplit[1];
                    }
                }
                return "";
            }
            for (String str4 : strOptString2.split("\\$\\$\\$")) {
                if (!str4.contains("正片")) {
                    break;
                }
                int iIndexOf = str4.indexOf(36);
                if (iIndexOf >= 0) {
                    return str4.substring(iIndexOf + 1);
                }
            }
            return "";
        } catch (Exception e) {
            Log.e("Danmu", "请求失败: " + string, e);
            return "";
        }
    }

    public static String getDanmuFromOKJinchanSpace(String str, int i) throws JSONException {
        String str2;
        String originalVideoName = getOriginalVideoName(str);
        long jOptLong = 0;
        try {
            String strL = C0575b.l("http://127.0.0.1:9978/media", new HashMap());
            if (TextUtils.isEmpty(strL) || !strL.startsWith("{")) {
                return "";
            }
            jOptLong = new JSONObject(strL).optLong("duration");
        } catch (Exception unused) {
        }
        if (jOptLong == 0) {
            return "";
        }
        char c = 0;
        if (jOptLong > 4203712) {
            c = 1;
            str2 = "电影";
        } else if (jOptLong <= 1800000) {
            c = 2;
            str2 = "动漫";
        } else {
            str2 = "剧集";
        }
        Log.d("Danmu", "时长: " + jOptLong + "ms, " + str2);
        String strReplace = originalVideoName.replace(" ", "");
        StringBuilder sb = new StringBuilder("https://zy.jinchancaiji.com/api.php/provide/vod/?ac=detail&wd=");
        sb.append(URLEncoder.encode(strReplace, "UTF-8"));
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        try {
            JSONObject jSONObject = new JSONObject(C0575b.l(string, map));
            if (jSONObject.optInt("code") != 1) {
                Log.e("Danmu", "搜索失败: " + string);
                return "";
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && strReplace.equals(jSONObjectOptJSONObject.optString("vod_name"))) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            if (arrayList.size() == 0) {
                return "";
            }
            JSONObject jSONObject2 = null;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                JSONObject jSONObject3 = (JSONObject) arrayList.get(i3);
                String strOptString = jSONObject3.optString("type_name");
                if (c == 1) {
                    if (Pattern.compile(".*片$").matcher(strOptString).matches()) {
                        jSONObject2 = jSONObject3;
                    }
                } else if (c == 2) {
                    if (Pattern.compile(".*漫$").matcher(strOptString).matches()) {
                        jSONObject2 = jSONObject3;
                    }
                } else if (Pattern.compile(".*剧$").matcher(strOptString).matches()) {
                    jSONObject2 = jSONObject3;
                }
            }
            if (jSONObject2 == null) {
                jSONObject2 = (JSONObject) arrayList.get(0);
            }
            String strOptString2 = jSONObject2.optString("vod_play_url");
            if (TextUtils.isEmpty(strOptString2)) {
                return "";
            }
            if (c != 1) {
                for (String str3 : strOptString2.split("#")) {
                    String[] strArrSplit = str3.split("\\$");
                    if (strArrSplit.length >= 2 && strArrSplit[0].replaceAll("\\D", "").equals(String.valueOf(i))) {
                        return strArrSplit[1];
                    }
                }
                return "";
            }
            for (String str4 : strOptString2.split("\\$\\$\\$")) {
                if (!str4.contains("正片")) {
                    break;
                }
                int iIndexOf = str4.indexOf(36);
                if (iIndexOf >= 0) {
                    return str4.substring(iIndexOf + 1);
                }
            }
            return "";
        } catch (Exception e) {
            Log.e("Danmu", "请求失败: " + string, e);
            return "";
        }
    }

    public static String getDanmuFromPanOK360(String str, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        int iIndexOf4;
        try {
            String strK = C0575b.k("http://127.0.0.1:9978/media");
            if (TextUtils.isEmpty(strK) || !strK.startsWith("{")) {
                return "";
            }
            long jOptLong = new JSONObject(strK).optLong("duration");
            if (jOptLong == 0) {
                return "";
            }
            long j = (jOptLong / 1000) / 60;
            String str2 = j < 30 ? "动漫" : j < 70 ? "电视剧" : "电影";
            String strK2 = C0575b.k(String.format("https://api.so.360kan.com/index?force_v=1&kw=%s&from=&pageno=1&v_ap=1&tab=all", URLEncoder.encode(str, "UTF-8")));
            if (TextUtils.isEmpty(strK2) || (jSONObjectOptJSONObject = new JSONObject(strK2).optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("longData")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("rows")) == null || jSONArrayOptJSONArray.length() == 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject4.optString("titleTxt");
                if ((TextUtils.isEmpty(strOptString) || strOptString.contains(str)) && str2.equals(jSONObjectOptJSONObject4.optString("cat_name"))) {
                    String strOptString2 = "";
                    if (str2.equals("电影")) {
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("playlinks");
                        if (jSONObjectOptJSONObject5 != null) {
                            String strOptString3 = jSONObjectOptJSONObject5.optString("qq");
                            if (TextUtils.isEmpty(strOptString3)) {
                                String strOptString4 = jSONObjectOptJSONObject5.optString("qiyi");
                                if (TextUtils.isEmpty(strOptString4)) {
                                    String strOptString5 = jSONObjectOptJSONObject5.optString("youku");
                                    if (TextUtils.isEmpty(strOptString5)) {
                                        String strOptString6 = jSONObjectOptJSONObject5.optString("imgo");
                                        if (!TextUtils.isEmpty(strOptString6)) {
                                            strOptString2 = strOptString6;
                                        }
                                    } else {
                                        strOptString2 = strOptString5;
                                    }
                                } else {
                                    strOptString2 = strOptString4;
                                }
                            } else {
                                strOptString2 = strOptString3;
                            }
                        }
                    } else {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("seriesPlaylinks");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() == 0) {
                            return "";
                        }
                        int i3 = (i <= 0 ? 0 : i) - 1;
                        if (i3 < 0 || i3 >= jSONArrayOptJSONArray2.length() || (jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3)) == null) {
                            return "";
                        }
                        strOptString2 = jSONObjectOptJSONObject3.optString("url");
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        return "";
                    }
                    if (strOptString2.startsWith("https://v.qq.com/") && strOptString2.contains(".html") && (iIndexOf4 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf4);
                    } else if (strOptString2.startsWith("https://www.iqiyi.com/") && strOptString2.contains(".html") && (iIndexOf3 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf3);
                    } else if (strOptString2.startsWith("http://www.mgtv.com/") && strOptString2.contains(".html") && (iIndexOf2 = strOptString2.indexOf(".html")) != -1) {
                        strOptString2 = strOptString2.substring(0, ".html".length() + iIndexOf2);
                    } else if (strOptString2.startsWith("https://v.youku.com") && (iIndexOf = strOptString2.indexOf("vid=")) != -1) {
                        int i4 = iIndexOf + 4;
                        int iIndexOf5 = strOptString2.indexOf("&", i4);
                        if (iIndexOf5 == -1) {
                            iIndexOf5 = strOptString2.length();
                        }
                        String strSubstring = strOptString2.substring(i4, iIndexOf5);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            strOptString2 = "https://v.youku.com/v_show/id_" + strSubstring + ".html";
                        }
                    }
                    return strOptString2;
                }
            }
            return "";
        } catch (Exception e) {
            SpiderDebug.log(e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    private static String getOriginalVideoName(String str) throws JSONException {
        String strB = C0603l.b("danmuvodname");
        if (TextUtils.isEmpty(strB)) {
            return strB;
        }
        String strB2 = C0603l.b("searchvodname");
        if (!TextUtils.isEmpty(strB2) && !"获取视频名称失败".equals(strB2)) {
            String strB3 = C0603l.b("danmucache");
            if (TextUtils.isEmpty(strB3)) {
                strB3 = "{}";
            }
            JSONObject jSONObject = new JSONObject(strB3);
            if (!jSONObject.has(strB)) {
                jSONObject.put(strB, strB2);
            }
            if (jSONObject.length() > 20) {
                Iterator<String> itKeys = jSONObject.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject2 = new JSONObject();
                for (int size = arrayList.size() - 20; size < arrayList.size(); size++) {
                    String str2 = (String) arrayList.get(size);
                    jSONObject2.put(str2, jSONObject.getString(str2));
                }
                jSONObject = jSONObject2;
            }
            C0603l.a("danmucache", jSONObject.toString());
            C0603l.a("searchvodname", "");
        }
        String strB4 = C0603l.b("danmucache");
        if (TextUtils.isEmpty(strB4)) {
            return strB;
        }
        String strOptString = new JSONObject(strB4).optString(strB);
        return !TextUtils.isEmpty(strOptString) ? strOptString : strB;
    }

    public static String getRealName(String str) {
        return Pattern.compile("[（(【<][臻真]彩[）)】>]").matcher(str).replaceAll("").trim();
    }

    public static String removeLeadingZeroFromEpisode(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        Matcher matcher = Pattern.compile("(第|EP|ep|Ep)(0*)(\\d+)(期|集|话)([上下中]+)?[^.]*").matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        String strGroup3 = matcher.group(3);
        String strGroup4 = matcher.group(4);
        if (strGroup2.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strGroup);
        sb.append(strGroup3);
        sb.append(strGroup4);
        String strGroup5 = matcher.group(5);
        if (strGroup5 != null) {
            sb.append(strGroup5);
        }
        return sb.toString();
    }

    public static String updateDanmuColors(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf("<d p=\"", i);
            if (iIndexOf < 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            int iIndexOf2 = str.indexOf("\">", iIndexOf);
            if (iIndexOf2 <= 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            sb.append(str.substring(i, iIndexOf));
            String[] strArrSplit = str.substring(iIndexOf + 6, iIndexOf2).split(",");
            if (strArrSplit.length < 4) {
                sb.append("<d p=\"");
                sb.append(strArrSplit);
                sb.append("\">");
                i = iIndexOf2 + 2;
            } else {
                strArrSplit[3] = generateCombinedRGB();
                sb.append("<d p=\"");
                sb.append(strArrSplit[0]);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    sb.append(",");
                    sb.append(strArrSplit[i2]);
                }
                sb.append("\">");
                i = iIndexOf2 + 2;
            }
        }
    }

    public static String updateDanmuWhite(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf("<d p=\"", i);
            if (iIndexOf < 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            int iIndexOf2 = str.indexOf("\">", iIndexOf);
            if (iIndexOf2 <= 0) {
                sb.append(str.substring(i));
                return sb.toString();
            }
            sb.append(str.substring(i, iIndexOf));
            String[] strArrSplit = str.substring(iIndexOf + 6, iIndexOf2).split(",");
            if (strArrSplit.length < 4) {
                sb.append("<d p=\"");
                sb.append(strArrSplit);
                sb.append("\">");
                i = iIndexOf2 + 2;
            } else {
                strArrSplit[3] = generateCombinedWhite();
                sb.append("<d p=\"");
                sb.append(strArrSplit[0]);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    sb.append(",");
                    sb.append(strArrSplit[i2]);
                }
                sb.append("\">");
                i = iIndexOf2 + 2;
            }
        }
    }
}
