package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.MixWeb;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.k.C0575b;
import com.github.catvod.spider.merge.m.C0588G;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class Proxy extends Spider {
    private static int a = -1;

    static void a() {
        if (a > 0) {
            return;
        }
        for (int i = 9978; i < 10000; i++) {
            if (C0575b.l("http://127.0.0.1:" + i + "/proxy?do=ck", null).equals("ok")) {
                SpiderDebug.log("Found local server port " + i);
                a = i;
                return;
            }
        }
    }

    public static String getOriginUrl() {
        a();
        return "http://127.0.0.1:" + a;
    }

    public static int getPort() {
        a();
        return a;
    }

    public static String getUrl() {
        a();
        StringBuilder sbA = C0529a.a("http://127.0.0.1:");
        sbA.append(a);
        sbA.append("/proxy");
        return sbA.toString();
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get("do");
        if (str == null) {
            return null;
        }
        if (str.equals("ck")) {
            return new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream("ok".getBytes(StandardCharsets.UTF_8))};
        }
        if (str.equals("appdanmu")) {
            return Danmu.AppDanmu(map);
        }
        if (str.equals("bili")) {
            return Bili.proxy(map);
        }
        if (str.equals("biliys")) {
            return BiliYS.proxy(map);
        }
        if (str.equals("czsp")) {
            return Czsapp.loadSub(map);
        }
        if (str.equals("hxq")) {
            return Hxq.proxy(map);
        }
        if (str.equals("kugou")) {
            return Kugou.proxy(map);
        }
        if (str.equals("danmu")) {
            return Danmu.Danmu(map);
        }
        if (str.equals("diydanmu")) {
            return Danmu.DiyDanmu(map);
        }
        if (str.equals("wallpaper")) {
            return Wallpaper.proxy(map);
        }
        if (str.equals("pan")) {
            return Pan.proxy(map);
        }
        if (str.equals("push")) {
            return C0588G.q().t(map);
        }
        if (str.equals("tzPic")) {
            return PanWebTz.proxy(map);
        }
        if (str.equals("xbpq")) {
            return XBPQ.loadPic(map);
        }
        if (str.equals("parseWeb")) {
            return MixWeb.loadHtml(map.get("flag"), map.get("url"));
        }
        return null;
    }
}
