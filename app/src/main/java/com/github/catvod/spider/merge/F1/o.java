package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.e1.C1036g;
import com.github.catvod.spider.merge.l.C1290c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class o {
    private static final Pattern a = Pattern.compile("player\\\\/([a-z0-9]{8})\\\\/");
    private static final Pattern b = Pattern.compile("\"jsUrl\":\"(/s/player/[A-Za-z0-9]+/player_ias\\.vflset/[A-Za-z_-]+/base\\.js)\"");

    private static String a(String str) {
        StringBuilder sb;
        String str2;
        if (str.startsWith("//")) {
            sb = new StringBuilder();
            str2 = "https:";
        } else {
            if (!str.startsWith("/")) {
                return str;
            }
            sb = new StringBuilder();
            str2 = "https://www.youtube.com";
        }
        return C1290c.b(sb, str2, str);
    }

    private static String b(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            return com.github.catvod.spider.merge.m1.k.a().f(str, null, com.github.catvod.spider.merge.r1.e.d).c();
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get JavaScript base player's code", e);
        }
    }

    static String c(String str) throws com.github.catvod.spider.merge.p1.i {
        String strE;
        try {
            try {
                String strA = a(d());
                new URL(strA);
                return b(strA);
            } catch (Exception e) {
                throw new com.github.catvod.spider.merge.p1.i("Could not fetch embedded watch page", e);
            }
        } catch (Exception unused) {
            String strC = com.github.catvod.spider.merge.m1.k.a().f("https://www.youtube.com/embed/" + str, null, com.github.catvod.spider.merge.r1.e.d).c();
            C1036g c1036gL0 = com.github.catvod.spider.merge.L1.l.e(strC).l0("script");
            Iterator<com.github.catvod.spider.merge.c1.m> it = c1036gL0.iterator();
            while (it.hasNext()) {
                it.next().P("name", "player/base");
            }
            Iterator<com.github.catvod.spider.merge.c1.m> it2 = c1036gL0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    try {
                        strE = com.github.catvod.spider.merge.L1.k.e(b, strC, 1);
                        break;
                    } catch (com.github.catvod.spider.merge.L1.j e2) {
                        throw new com.github.catvod.spider.merge.p1.i("Embedded watch page didn't provide JavaScript base player's URL", e2);
                    }
                }
                strE = it2.next().c("src");
                if (strE.contains("base.js")) {
                    break;
                }
            }
            String strA2 = a(strE);
            try {
                new URL(strA2);
                return b(strA2);
            } catch (MalformedURLException e3) {
                throw new com.github.catvod.spider.merge.p1.i("The extracted and built JavaScript URL is invalid", e3);
            }
        }
    }

    static String d() throws com.github.catvod.spider.merge.p1.i {
        try {
            try {
                return String.format("https://www.youtube.com/s/player/%s/player_ias.vflset/en_GB/base.js", com.github.catvod.spider.merge.L1.k.e(a, com.github.catvod.spider.merge.m1.k.a().f("https://www.youtube.com/iframe_api", null, com.github.catvod.spider.merge.r1.e.d).c(), 1));
            } catch (com.github.catvod.spider.merge.L1.j e) {
                throw new com.github.catvod.spider.merge.p1.i("IFrame resource didn't provide JavaScript base player's hash", e);
            }
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not fetch IFrame resource", e2);
        }
    }
}
