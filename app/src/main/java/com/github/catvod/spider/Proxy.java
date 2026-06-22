package com.github.catvod.spider;

import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.parser.MixDemo;
import com.github.catvod.parser.MixWeb;
import com.github.catvod.spider.merge.C0281;
import com.github.catvod.spider.merge.C0295;
import com.github.catvod.spider.merge.I.AliDriveApi;
import com.github.catvod.spider.merge.I.BuilderUtils;
import com.github.catvod.spider.merge.I0.GeneralUtils;
import com.github.catvod.spider.merge.xc;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.Map;

public class Proxy extends Spider {
    private static int serverPort = -1;

    public class AnonymousClass3 extends Spider {

        public static int proxyPort = -1;

        public static String localProxyUrl() {
            m48();
            return "http://127.0.0.1:" + proxyPort + "/proxy";
        }

        public static Object[] proxy(Map<String, String> params) {
            try {
                String action = params.get("do");
                boolean isLive = action.equals("live");
                String charset = "UTF-8";
                if (isLive) {
                    if (!params.get("type").equals("txt")) {
                        return null;
                    }
                    String extContent = params.get("ext");
                    if (!extContent.startsWith("http")) {
                        extContent = new String(Base64.decode(extContent, 10), charset);
                    }
                    return C0281.m1034(extContent);
                }
                if (action.equals("ck")) {
                    return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(charset))};
                }
                if (action.equals("push")) {
                    return xc.vod(params);
                }
                boolean isParseWeb = action.equals("parseWeb");
                String flag = "flag";
                String urlKey = "url";
                if (isParseWeb) {
                    return MixWeb.loadHtml(params.get(flag), params.get(urlKey));
                }
                if (action.equals("parseMix")) {
                    return MixDemo.loadHtml(params.get(flag), params.get(urlKey));
                }
                if (action.equals("czspp")) {
                    return Czsapp.loadsub(params.get(urlKey));
                }
                if (action.equals("ddys")) {
                    return Ddys.loadsub(params.get(urlKey));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        static void m48() {
            if (proxyPort > 0) {
                return;
            }
            for (int i = 9978; i < 10000; i++) {
                if (C0295.m1089("http://127.0.0.1:" + i + "/proxy?do=ck", null).equals("ok")) {
                    SpiderDebug.log("Found local server port " + i);
                    proxyPort = i;
                    return;
                }
            }
        }
    }

    public static String getUrl() {
        if (serverPort <= 0) {
            int i = 9978;
            while (true) {
                if (i >= 10000) {
                    break;
                }
                if (com.github.catvod.spider.merge.f0.HttpClient.m("http://127.0.0.1:" + i + "/proxy?do=ck", null, null).equals("ok")) {
                    SpiderDebug.log("Found local server port " + i);
                    serverPort = i;
                    break;
                }
                i++;
            }
        }
        StringBuilder urlBuilder = BuilderUtils.b("http://127.0.0.1:");
        urlBuilder.append(serverPort);
        urlBuilder.append("/proxy");
        return urlBuilder.toString();
    }

    public static Object[] processPush(Map<String, String> params) {
        if (com.github.catvod.spider.merge.P0.StringUtils.d(params.get("url"))) {
            AliDriveApi.r().r = AliDriveApi.r().F(params.get("url"), "1");
            StringBuilder urlBuilder = BuilderUtils.b("弹幕来自推送 地址：");
            urlBuilder.append(AliDriveApi.r().r);
            urlBuilder.append(" 可能需要重新刷新播放页");
            GeneralUtils.w(urlBuilder.toString());
            com.github.catvod.spider.merge.f0.HttpClient.l("http://127.0.0.1:9978/action?do=refresh&type=danmaku&path=" + URLEncoder.encode(AliDriveApi.r().r));
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
        }
        if (com.github.catvod.spider.merge.P0.StringUtils.d(params.get("input"))) {
            BaseApi.get().VodResult.setText(params.get("input"));
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
        }
        if (!com.github.catvod.spider.merge.P0.StringUtils.d(params.get("subtitleContent"))) {
            return new Object[]{200, "text/html; charset=utf-8", Proxy.class.getClassLoader().getResourceAsStream("assets/push.html")};
        }
        String subtitlePath = com.github.catvod.spider.merge.VodResult.VodCategory.a("tv/zm", params.get("subtitleName"));
        com.github.catvod.spider.merge.VodResult.VodCategory.g(new File(subtitlePath), params.get("subtitleContent"));
        com.github.catvod.spider.merge.f0.HttpClient.l("http://127.0.0.1:9978/action?do=refresh&type=subtitle&path=http://127.0.0.1:9978/file/" + subtitlePath);
        return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
    }

    public static Object[] proxy(Map<String, String> params) {
        SpiderDebug.log("proxy" + params);
        String action = params.get("do");
        action.getClass();
        switch (action) {
            case "webdav":
            case "pushdanmu":
            case "danmuku":
                return processPush(params);
            case "ck":
                return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes("UTF-8"))};
            case "ali":
                return NetPan.proxy(params);
            default:
                return null;
        }
    }
}
