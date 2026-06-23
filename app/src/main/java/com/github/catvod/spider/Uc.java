package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.merge.UcDriveApi;
import com.github.catvod.bean.VodResult;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Uc extends Spider {
    public static final Pattern a = Pattern.compile("drive.uc.cn/s/([^#/]+)(#*/list/share/([^\\-]+))?");

    public String detailContent(String str, List<String> list) {
        String strReplace = list.get(0).trim().replace("?public=1", "");
        SpiderDebug.log("quark detailContent url:", strReplace);
        Matcher matcher = a.matcher(strReplace);
        if (matcher.find()) {
            return VodResult.m(UcDriveApi.r().A(strReplace, matcher.group(1), matcher.groupCount() == 3 ? matcher.group(3) : "", str));
        }
        return "";
    }

    public void init(Context context, String str) {
        UcDriveApi.r().getClass();
        SpiderDebug.log("UcPanApi init extend:" + str);
    }

    public String playerContent(String str, String str2, List list) {
        UcDriveApi.r().getClass();
        return playerContentInternal(str, str2, list);
    }

    public String playerContentInternal(String str, String str2, List<String> list) {
        SpiderDebug.log("quark playerContent id:" + str2);
        String[] strArrSplit = str2.split("\\+");
        return (str.startsWith("代理原畫") || str.startsWith("極速GO原畫")) ? UcDriveApi.r().G(strArrSplit, str) : str.startsWith("轉存原畫") ? UcDriveApi.r().F(strArrSplit) : UcDriveApi.r().G(strArrSplit, str);
    }

    public void test() {
        System.out.println(detailContent(Arrays.asList("https://drive.uc.cn/s/a4aab66045db4?public=1")));
        System.out.println(playerContent("代理", "6a0a9e9ab3ea4+552b319d0d8f4030bc80c32fc6b141d1_1a5e3cad1549e34c71bfb4f701b3065e+彷徨之刃+Hovering.Blade.2024..4K60FPS.AAC.X265.mp4", null));
    }

    public String detailContent(List<String> list) {
        String strReplace = list.get(0).trim().replace("?public=1", "");
        SpiderDebug.log("quark detailContent url:", strReplace);
        Matcher matcher = a.matcher(strReplace);
        if (matcher.find()) {
            return VodResult.m(UcDriveApi.r().A(strReplace, matcher.group(1), matcher.groupCount() == 3 ? matcher.group(3) : "", ""));
        }
        return "";
    }
}
