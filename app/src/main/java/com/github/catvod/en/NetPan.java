package com.github.catvod.en;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.J.k;
import com.github.catvod.spider.merge.K.i;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class NetPan extends Spider {
    public static final Pattern a = Pattern.compile("(www.aliyundrive.com|www.alipan.com)/s/([^/]+)(/folder/([^/]+))?");
    public static Quark b = new Quark();
    public static Uc c = new Uc();
    public static YunPan139 d = new YunPan139();
    public static YunPan189 e = new YunPan189();
    public static YunPan123 f = new YunPan123();
    public static Yun115 g = new Yun115();
    public static k h = new k();
    public static XunleiSpider i = new XunleiSpider();
    public static GuangYaPan j = new GuangYaPan();
    public static JSONObject k;

    public static native /* synthetic */ void a(NetPan netPan, String str, Map map, String str2);

    private native void b(String str, String str2, Map map);

    private static native void c(String str, JSONObject jSONObject);

    public static native boolean containPuHua();

    private static native void d(JSONObject jSONObject);

    private native i e(String str, String str2, Matcher matcher, String str3);

    public static native String extractNetName(String str);

    public static native List filterNetPanLinks(List list, Integer num);

    public static native List findMatches(String str, String str2);

    public static native String getIsoDownloadUrl(String str);

    public static native String getNetPanType(String str);

    public static native String getYunPanPic(String str);

    public static native void initOrder(List list);

    public static native void initOrderByVodId(List list);

    public static native void initProxy(JSONObject jSONObject);

    public static native void initTg(boolean z, JSONObject jSONObject);

    public static native boolean isAliPan(String str);

    public static native boolean isBaidu(String str);

    public static native boolean isGuangYa(String str);

    public static native boolean isNetPan(String str);

    public static native boolean isQuark(String str);

    public static native boolean isUc(String str);

    public static native boolean isXunlei(String str);

    public static native boolean isYun115(String str);

    public static native boolean isYun123(String str);

    public static native boolean isYunPan139(String str);

    public static native boolean isYunPan189(String str);

    public static native boolean isYunSelf115(String str);

    public static native boolean isYunSelfBaidu(String str);

    public static native boolean isYunSelfGuangya(String str);

    public static native boolean isYunSelfQuark(String str);

    public static native boolean isYunSelfUc(String str);

    public static native Object[] proxy(Map map);

    public static native void writeTvTg();

    public native String detailContent(String str, String str2, List list);

    public native String detailContent(List list);

    public native String detailContentVodPlayFrom(List list);

    public native String detailContentVodPlayUrl(String str, List list);

    public native void init(Context context, String str);

    public native String playerContent(String str, String str2, List list);
}
