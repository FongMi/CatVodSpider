package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.N0;
import com.github.catvod.spider.merge.K.VodResult;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class YunPan189 extends Spider {
    public static final Pattern a = Pattern.compile("cloud.189.cn/t/?(.*)");

    public static void test() {
        new YunPan189().detailContent(Arrays.asList("https://cloud.189.cn/web/share?code=neQFre2uENr2"));
    }

    public String detailContent(String str, List<String> list) {
        String strReplaceAll = list.get(0).trim().replaceAll("h5.cloud.189.cn/share.html#", "cloud.189.cn");
        if (strReplaceAll.contains("web/share?code=")) {
            strReplaceAll = strReplaceAll.replace("web/share?code=", "t/");
        }
        Matcher matcher = a.matcher(strReplaceAll);
        if (!matcher.find()) {
            return "";
        }
        String strReplace = matcher.group(1).replace("?", "");
        if (matcher.groupCount() == 4) {
            matcher.group(4);
        }
        return VodResult.m(N0.a().d(strReplaceAll, strReplace));
    }

    public String detailContent(List<String> list) {
        return detailContent("189推送", list);
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        SpiderDebug.log("playerContent ids" + str2);
        N0 n0A = N0.a();
        String[] strArrSplit = str2.split("\\+");
        str.split("#")[0].equals("天意原畫");
        return n0A.f(strArrSplit);
    }
}
