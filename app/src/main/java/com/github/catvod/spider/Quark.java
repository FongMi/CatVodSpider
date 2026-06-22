package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.I.QuarkDriveApi;
import com.github.catvod.spider.merge.K.VodResult;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quark extends Spider {
    public static final Pattern PAN_URL_PATTERN = Pattern.compile("pan.quark.cn/s/([^#/]+)(#*/list/share/([^\\-]+))?");

    public static void test() {
        System.out.println(new Quark().detailContent(Arrays.asList("https://pan.quark.cn/s/1ca9adc1d480")));
    }

    public String detailContent(String extend, List<String> ids) {
        SpiderDebug.log("网盘集合 detailContent ids 3:" + ids);
        String url = ids.get(0).trim();
        Subtitle.b("quark detailContent url:", url);
        Matcher matcher = PAN_URL_PATTERN.matcher(url);
        if (matcher.find()) {
            return VodResult.m(QuarkDriveApi.o().y(url, matcher.group(1), matcher.groupCount() == 3 ? matcher.group(3) : "", extend));
        }
        return "";
    }

    public void init(Context context, String extend) {
        QuarkDriveApi.o().getClass();
        SpiderDebug.log("QuarkPanApi init extend:" + extend);
    }

    public String playerContent(String flag, String playUrl, List danmaku) {
        QuarkDriveApi.o().getClass();
        return playerContentInternal(flag, playUrl, danmaku);
    }

    public String playerContentInternal(String flag, String playUrl, List<String> danmaku) {
        SpiderDebug.log("quark playerContent id:" + playUrl);
        String[] videoParts = playUrl.split("\\+");
        return (flag.startsWith("代理原畫") || flag.startsWith("極速GO原畫")) ? QuarkDriveApi.o().E(videoParts, flag) : flag.startsWith("轉存原畫") ? QuarkDriveApi.o().D(videoParts) : QuarkDriveApi.o().E(videoParts, flag);
    }

    public String detailContent(List<String> ids) {
        String url = ids.get(0).trim();
        Subtitle.b("quark detailContent url:", url);
        Matcher matcher = PAN_URL_PATTERN.matcher(url);
        if (matcher.find()) {
            return VodResult.m(QuarkDriveApi.o().y(url, matcher.group(1), matcher.groupCount() == 3 ? matcher.group(3) : "", ""));
        }
        return "";
    }
}
