package com.github.catvod.spider.merge.s0;

import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m0.e;
import com.github.catvod.spider.merge.p0.C1363a;
import com.github.catvod.spider.merge.q0.h;
import com.github.catvod.spider.merge.r0.C1384c;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.s0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1387b implements InterfaceC1386a {
    private static final List<Pattern> b = Arrays.asList(Pattern.compile(";ytplayer\\.config = (\\{.*?\\})\\;ytplayer"), Pattern.compile(";ytplayer\\.config = (\\{.*?\\})\\;"), Pattern.compile("ytInitialPlayerResponse\\s*=\\s*(\\{.+?\\})\\s*\\;"));
    private static final List<Pattern> c = Arrays.asList(Pattern.compile("window\\[\"ytInitialData\"\\] = (\\{.*?\\});"), Pattern.compile("ytInitialData = (\\{.*?\\});"));
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private final C1363a a;

    static {
        Pattern.compile("lang_code=\"(.{2,3})\"");
        d = Pattern.compile("[0-9]+[0-9, ']*");
        e = Pattern.compile("\"assets\":.+?\"js\":\\s*\"([^\"]+)\"");
        f = Pattern.compile("\"jsUrl\":\\s*\"([^\"]+)\"");
    }

    public C1387b(C1363a c1363a) {
        this.a = c1363a;
    }

    public final String a(C1416e c1416e) {
        C1413b c1413bT = c1416e.t("serviceTrackingParams");
        if (c1413bT == null) {
            return "2.20200720.00.02";
        }
        for (int i = 0; i < c1413bT.size(); i++) {
            C1413b c1413bT2 = c1413bT.o(i).t("params");
            for (int i2 = 0; i2 < c1413bT2.size(); i2++) {
                if (c1413bT2.o(i2).x("key").equals("cver")) {
                    return c1413bT2.o(i2).x("value");
                }
            }
        }
        return "2.20200720.00.02";
    }

    public final C1416e b(String str) throws e {
        Iterator<Pattern> it = c.iterator();
        String strGroup = null;
        while (it.hasNext()) {
            Matcher matcher = it.next().matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            }
        }
        if (strGroup == null) {
            throw new e("Could not find initial data on web page");
        }
        try {
            return AbstractC1412a.g(strGroup);
        } catch (Exception unused) {
            throw new e("Initial data contains invalid json");
        }
    }

    public final int c(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(0).replaceAll("[, ']", ""));
        }
        return 0;
    }

    public final String d(C1416e c1416e, String str) throws e {
        String strReplace;
        String strGroup;
        if (c1416e.containsKey("assets")) {
            strReplace = c1416e.u("assets").x("js");
        } else {
            String str2 = (String) ((C1384c) this.a.b(new h(C1290c.a("https://www.youtube.com/embed/", str)))).a();
            Matcher matcher = e.matcher(str2);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = f.matcher(str2);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    strReplace = null;
                }
            }
            strReplace = strGroup.replace("\\", "");
        }
        if (strReplace != null) {
            return C1290c.a("https://youtube.com", strReplace);
        }
        throw new e("Could not extract js url: assets not found");
    }

    public final long e(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(0).replaceAll("[, ']", ""));
        }
        return 0L;
    }

    public final C1416e f(String str) throws e {
        String strGroup;
        Iterator<Pattern> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                strGroup = null;
                break;
            }
            Matcher matcher = it.next().matcher(str);
            if (matcher.find()) {
                strGroup = matcher.group(1);
                break;
            }
        }
        if (strGroup == null) {
            throw new e("Could not find player config on web page");
        }
        try {
            C1416e c1416eG = AbstractC1412a.g(strGroup);
            if (c1416eG.containsKey("args")) {
                return c1416eG;
            }
            C1416e c1416e = new C1416e();
            C1416e c1416e2 = new C1416e();
            c1416e2.n("player_response", c1416eG);
            c1416e.n("args", c1416e2);
            return c1416e;
        } catch (Exception unused) {
            throw new e("Player config contains invalid json");
        }
    }
}
