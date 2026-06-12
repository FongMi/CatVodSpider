package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.LogUtils;
import com.github.catvod.spider.merge.I.Q0;
import com.github.catvod.spider.merge.K.VodResult;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Yun115 extends Spider {
    public static final Pattern a = Pattern.compile("https://(?:115|anxia|115cdn)\\.com/s/([a-zA-Z0-9]+)\\?password=([a-zA-Z0-9]+)");

    public static void test() {
        System.out.println(new Yun115().detailContent("", Arrays.asList("https://115.com/s/swzew4m3nc6?password=i0d7#_2920619578952252542")));
    }

    public String detailContent(String str, List<String> list) {
        String[] strArrSplit = list.get(0).trim().split("_");
        String str2 = strArrSplit[0];
        Subtitle.b("115 detailContent url:", str2);
        Matcher matcher = a.matcher(str2);
        if (!matcher.find()) {
            return "";
        }
        return VodResult.m(Q0.c().g(str2, matcher.group(1), strArrSplit.length > 1 ? strArrSplit[1] : "0", str, matcher.groupCount() == 2 ? matcher.group(2) : ""));
    }

    public void init(Context context, String str) {
        Q0.c().getClass();
        SpiderDebug.log("QuarkPanApi init extend:" + str);
    }

    public String playerContent(String str, String str2, List list) {
        Q0.c().getClass();
        return playerContentInternal(str, str2, list);
    }

    public String playerContentInternal(String str, String str2, List<String> list) {
        SpiderDebug.log("quark playerContent id:" + str2);
        String[] strArrSplit = str2.split("\\+");
        SpiderDebug.log("quark playerContent flag:" + str);
        return Q0.c().k(strArrSplit, str);
    }

    public String detailContent(List<String> list) {
        String strTrim = list.get(0).trim();
        Subtitle.b("115 detailContent url:", strTrim);
        Matcher matcher = a.matcher(strTrim);
        if (!matcher.find()) {
            return "";
        }
        return VodResult.m(Q0.c().g(strTrim, matcher.group(1), matcher.groupCount() == 3 ? matcher.group(3) : "", "", matcher.groupCount() == 2 ? matcher.group(2) : ""));
    }
}
