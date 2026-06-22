package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.utils.merge.Yun139Api;
import com.github.catvod.bean.VodItem;
import com.github.catvod.bean.VodResult;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class YunPan139 extends Spider {
    public static final Pattern a = Pattern.compile("(?:caiyun|yun)\\.139\\.com/(?:shareweb/#/)?([wm])/i/?(.*)");

    private VodItem a(String str, Matcher matcher, String str2) {
        String strReplace = matcher.group(2).replace("?", "");
        if (matcher.groupCount() == 4) {
            matcher.group(4);
        }
        return Yun139Api.a().e(str, str2, strReplace);
    }

    public static void main(String[] strArr) {
        new YunPan139().detailContent(Arrays.asList("https://caiyun.139.com/w/i/1R5BSsm7w5g4h"));
    }

    public String detailContent(String str, List<String> list) {
        String strTrim = list.get(0).trim();
        Matcher matcher = a.matcher(strTrim);
        return matcher.find() ? VodResult.m(a(str, matcher, strTrim)) : "";
    }

    public String detailContent(List<String> list) {
        String strTrim = list.get(0).trim();
        Matcher matcher = a.matcher(strTrim);
        return matcher.find() ? VodResult.m(a("推送异动", matcher, strTrim)) : "";
    }

    public void init(Context context, String str) {
    }

    public String playerContent(String str, String str2, List<String> list) {
        SpiderDebug.log("playerContent ids" + str2);
        return BaseApi.isOk("Yun139") ? "" : Yun139Api.a().g(str2.split("\\+"), str.split("#")[0].equals("异动原畫"));
    }
}
