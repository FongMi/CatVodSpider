package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.b.C0536B;
import com.github.catvod.spider.merge.b.C0545i;
import com.github.catvod.spider.merge.b.C0546j;
import com.github.catvod.spider.merge.b.C0548l;
import com.github.catvod.spider.merge.b.P;
import com.github.catvod.spider.merge.b.m;
import com.github.catvod.spider.merge.b.w;
import com.github.catvod.spider.merge.c.C0552c;
import com.github.catvod.spider.merge.c.C0554e;
import com.github.catvod.spider.merge.m.C0597f;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Pan extends Spider {
    private static String a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Pattern f6a = Pattern.compile("(www\\.aliyundrive\\.com|www\\.alipan\\.com)/s/([^/]+)(/folder/([^/]+))?");
    public static final Pattern b = Pattern.compile("pan\\.quark\\.cn/s/([^/?#]+)(?:#/list/share)?(?:\\?pwd=([^&]+))?(?:[#&].*)?$");
    public static final Pattern c = Pattern.compile("drive\\.uc\\.cn/s/([0-9a-fA-F]{8,20})(?:\\?pwd=([^&]+))?(?:\\?public=1)?(?:[#&].*)?$");
    public static final Pattern d = Pattern.compile("cloud\\.189\\.(?:cn|com)/(?:[^/?#]+/)?(?:share\\.html#/)?t/([A-Za-z0-9]+)(?:\\?pwd=([A-Za-z0-9]+)|[（(]访问码：([A-Za-z0-9]+)[）)])?");
    public static final Pattern e = Pattern.compile("(?:www\\.)?123[a-zA-Z0-9]{3}\\.com/s/([^/?#]+)(?:\\?pwd=([^&]+))?(?:[#&].*)?$");
    public static final Pattern f = Pattern.compile("pan\\.baidu\\.com/(?:s/1([^?]+)\\?pwd=([^&]+)$|share/init\\?surl=([^&]+)(?:&pwd=([^&]+))?)");
    public static final Pattern g = Pattern.compile("(?:/w/i/|\\?linkID=|/m/i\\?)([\\w]+)");

    private static C0554e a(Matcher matcher, String str) {
        String strGroup;
        String strGroup2;
        String strGroup3;
        String str2;
        if ("ali".equals(str)) {
            return C0545i.d().k(matcher.group(2), matcher.groupCount() == 4 ? matcher.group(4) : "");
        }
        if ("quark".equals(str)) {
            String strGroup4 = matcher.group(1);
            String strGroup5 = matcher.group(2);
            return w.e().p(strGroup4, strGroup5 != null ? strGroup5 : "");
        }
        if ("uc".equals(str)) {
            String strGroup6 = matcher.group(1);
            String strGroup7 = matcher.group(2);
            return C0536B.c().m(strGroup6, strGroup7 != null ? strGroup7 : "");
        }
        if ("cloud189".equals(str)) {
            String strGroup8 = matcher.group(1);
            if (strGroup8 == null) {
                return new C0554e();
            }
            String strGroup9 = matcher.group(2);
            if (strGroup9 != null) {
                str2 = strGroup9;
            } else {
                String strGroup10 = matcher.group(3);
                str2 = strGroup10 != null ? strGroup10 : "";
            }
            return C0548l.c().q(strGroup8, str2);
        }
        if (!"baidu".equals(str)) {
            if (!"cloud123".equals(str)) {
                if ("mobile".equals(str) && (strGroup = matcher.group(1)) != null) {
                    return P.a().a(strGroup, "");
                }
                return new C0554e();
            }
            String strGroup11 = matcher.group(1);
            if (strGroup11 == null) {
                return new C0554e();
            }
            String strGroup12 = matcher.group(2);
            return m.a().h(strGroup11, strGroup12 != null ? strGroup12 : "");
        }
        String strGroup13 = matcher.group(1);
        if (strGroup13 != null) {
            strGroup2 = strGroup13;
            strGroup3 = matcher.group(2);
        } else {
            strGroup2 = matcher.group(3);
            strGroup3 = matcher.group(4);
        }
        if (strGroup2 == null) {
            strGroup2 = "";
        }
        if (strGroup3 == null) {
            strGroup3 = "";
        }
        return C0546j.f().s(strGroup2, strGroup3);
    }

    public static String a(String str) {
        return str.replaceAll("\\[\\d{4,8}\\]", "");
    }

    public static String processExtractionCode(String str) {
        if (str == null) {
            str = "";
        }
        return Pattern.compile("提取码[\\s:]*").matcher(str).replaceAll("?pwd=");
    }

    public static String processJsonResponse(String str) throws JSONException {
        String str2 = a;
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            jSONObject2.put("vod_content", str2);
            String strOptString = jSONObject2.optString("vod_play_from", "");
            String str3 = "";
            if (!strOptString.isEmpty()) {
                str3 = strOptString.contains("夸克") ? "类型：夸克网盘" : strOptString.contains("UC") ? "类型：UC网盘" : strOptString.contains("天翼") ? "类型：天翼云盘" : strOptString.contains("123") ? "类型：123云盘" : strOptString.contains("百度") ? "类型：百度网盘" : strOptString.contains("阿里") ? "类型：阿里云盘" : strOptString.contains("移动") ? "类型：移动云盘" : "";
            }
            jSONObject2.put("vod_remarks", str3);
        }
        return jSONObject.toString();
    }

    public static String processPan(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("url");
        if (!strOptString.startsWith("http://127.0.0.1:1314")) {
            return str;
        }
        String strOptString2 = jSONObject.optString("header");
        jSONObject.remove("header");
        if (!TextUtils.isEmpty(strOptString2)) {
            String strEncode = strOptString2;
            try {
                strEncode = URLEncoder.encode(strOptString2, "UTF-8");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            strOptString = strOptString + "&header=" + strEncode;
        } else if (0 == 0) {
        }
        jSONObject.put("url", strOptString);
        return jSONObject.toString();
    }

    public static Object[] proxy(Map<String, String> map) {
        int i;
        int i2;
        String str = map.get("site");
        String str2 = map.get("shareId");
        String str3 = map.get("fileId");
        String str4 = map.get("fileToken");
        String[] strArrD = "2".equals(map.get("type")) ? com.github.catvod.spider.merge.F.a.d(str, str2, str3, str4) : com.github.catvod.spider.merge.F.a.c(str, str2, str3, str4);
        String str5 = strArrD[0];
        if (TextUtils.isEmpty(str5)) {
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("播放链接为空".getBytes("UTF-8"))};
        }
        try {
            i = Integer.parseInt(strArrD[1]);
        } catch (NumberFormatException unused) {
            i = 16;
        }
        try {
            i2 = Integer.parseInt(strArrD[2]) * 1024;
        } catch (NumberFormatException unused2) {
            i2 = 131072;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (String str6 : map.keySet()) {
            treeMap.put(str6, map.get(str6));
        }
        treeMap.remove("do");
        treeMap.remove("site");
        treeMap.remove("shareId");
        treeMap.remove("fileId");
        treeMap.remove("fileToken");
        treeMap.remove("url");
        treeMap.remove("host");
        treeMap.remove("thread");
        treeMap.remove("chunkSize");
        treeMap.remove("remote-addr");
        treeMap.remove("http-client-ip");
        return new C0597f(str5, treeMap, i, i2).e();
    }

    public String detailContent(List<String> list) {
        String str;
        String strFilterCloudDiskLinks = C0529a.filterCloudDiskLinks(list.get(0).trim());
        a = strFilterCloudDiskLinks;
        Matcher matcher = f6a.matcher(strFilterCloudDiskLinks);
        if (matcher.find()) {
            str = "ali";
        } else {
            matcher = b.matcher(strFilterCloudDiskLinks);
            if (matcher.find()) {
                str = "quark";
            } else {
                matcher = c.matcher(strFilterCloudDiskLinks);
                if (matcher.find()) {
                    str = "uc";
                } else {
                    matcher = d.matcher(strFilterCloudDiskLinks);
                    if (matcher.find()) {
                        str = "cloud189";
                    } else {
                        matcher = e.matcher(strFilterCloudDiskLinks);
                        if (matcher.find()) {
                            str = "cloud123";
                        } else {
                            matcher = f.matcher(strFilterCloudDiskLinks);
                            if (matcher.find()) {
                                str = "baidu";
                            } else {
                                matcher = g.matcher(strFilterCloudDiskLinks);
                                if (!matcher.find()) {
                                    return "";
                                }
                                str = "mobile";
                            }
                        }
                    }
                }
            }
        }
        return C0529a.processVodData(processJsonResponse(C0552c.m(a(matcher, str))));
    }

    public String detailContentVodPlayFrom(List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= list.size(); i++) {
            int i2 = i - 1;
            int i3 = 0;
            if (list.get(i2).contains(".ali")) {
                while (true) {
                    List<String> aliOptions = Config.getAliOptions();
                    if (i3 < aliOptions.size()) {
                        arrayList.add(aliOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains("quark")) {
                while (true) {
                    List<String> quarkOptions = Config.getQuarkOptions();
                    if (i3 < quarkOptions.size()) {
                        arrayList.add(quarkOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains("uc.")) {
                while (true) {
                    List<String> uCOptions = Config.getUCOptions();
                    if (i3 < uCOptions.size()) {
                        arrayList.add(uCOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains(".189")) {
                while (true) {
                    List<String> tianyiOptions = Config.getTianyiOptions();
                    if (i3 < tianyiOptions.size()) {
                        arrayList.add(tianyiOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains(".123")) {
                while (true) {
                    List<String> list2 = Config.get123Options();
                    if (i3 < list2.size()) {
                        arrayList.add(list2.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains(".baidu")) {
                while (true) {
                    List<String> baiduOptions = Config.getBaiduOptions();
                    if (i3 < baiduOptions.size()) {
                        arrayList.add(baiduOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            } else if (list.get(i2).contains(".139")) {
                while (true) {
                    List<String> mobileOptions = Config.getMobileOptions();
                    if (i3 < mobileOptions.size()) {
                        arrayList.add(mobileOptions.get(i3).concat("#").concat(String.valueOf(i)));
                        i3++;
                    }
                }
            }
        }
        return TextUtils.join("$$$", arrayList);
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strProcessExtractionCode = processExtractionCode(it.next());
            SpiderDebug.log("url:" + strProcessExtractionCode);
            Matcher matcher = f6a.matcher(strProcessExtractionCode);
            if (matcher.find()) {
                arrayList.add(a(matcher, "ali").c());
            }
            Matcher matcher2 = b.matcher(strProcessExtractionCode);
            if (matcher2.find()) {
                arrayList.add(a(matcher2, "quark").c());
            }
            Matcher matcher3 = c.matcher(strProcessExtractionCode);
            if (matcher3.find()) {
                arrayList.add(a(matcher3, "uc").c());
            }
            Matcher matcher4 = d.matcher(strProcessExtractionCode);
            if (matcher4.find()) {
                arrayList.add(a(matcher4, "cloud189").c());
            }
            Matcher matcher5 = e.matcher(strProcessExtractionCode);
            if (matcher5.find()) {
                arrayList.add(a(matcher5, "cloud123").c());
            }
            Matcher matcher6 = f.matcher(strProcessExtractionCode);
            if (matcher6.find()) {
                arrayList.add(a(matcher6, "baidu").c());
            }
            Matcher matcher7 = g.matcher(strProcessExtractionCode);
            if (matcher7.find()) {
                arrayList.add(a(matcher7, "mobile").c());
            }
        }
        return TextUtils.join("$$$", arrayList);
    }

    public void init(Context context, String str) {
        try {
            super.init(context, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        if (str.contains("阿里")) {
            return C0545i.d().q(str2.split("\\+"), str);
        }
        if (str.contains("夸克")) {
            return processPan(w.e().s(str2.split("\\+"), str));
        }
        if (str.contains("UC")) {
            return processPan(C0536B.c().q(str2.split("\\+"), str));
        }
        if (str.contains("天翼")) {
            return C0548l.c().s(str2.split("\\+"), str);
        }
        if (str.contains("123")) {
            return m.a().k(str2.split("\\+"));
        }
        if (!str.contains("百度")) {
            return str.contains("移动") ? processPan(P.a().q(str2.split("\\+"))) : "";
        }
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.A.ac
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String strA = C0602k.a(C0602k.d("bdtime"));
                    if (!strA.trim().isEmpty()) {
                        if (Integer.parseInt(strA) >= Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()))) {
                            return;
                        }
                    }
                    C0546j.processShare(C0546j.f());
                } catch (Throwable th) {
                    PrintStream printStream = System.out;
                    StringBuilder sbA = C0529a.a("processShare异常: ");
                    sbA.append(th.getMessage());
                    printStream.println(sbA.toString());
                }
            }
        }).start();
        return processPan(C0546j.f().q(str2.split("\\+"), str));
    }
}
