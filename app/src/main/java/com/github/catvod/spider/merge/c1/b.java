package com.github.catvod.spider.merge.C1;

import com.github.catvod.spider.merge.D0.e;
import com.github.catvod.spider.merge.D0.g;
import com.github.catvod.spider.merge.D0.h;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.L1.j;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.d1.F;
import com.github.catvod.spider.merge.e1.C1036g;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.k;
import com.github.catvod.spider.merge.m1.l;
import com.github.catvod.spider.merge.o1.C1359a;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.p1.i;
import java.net.MalformedURLException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    private static final List<com.github.catvod.spider.merge.L1.a> a;
    private static String b;
    private static final Pattern c;
    public static final /* synthetic */ int d = 0;

    static {
        com.github.catvod.spider.merge.L1.a[] aVarArr = {new com.github.catvod.spider.merge.L1.a("mini", 16, 16, 3), new com.github.catvod.spider.merge.L1.a("t20x20", 20, 20, 3), new com.github.catvod.spider.merge.L1.a("small", 32, 32, 3), new com.github.catvod.spider.merge.L1.a("badge", 47, 47, 3), new com.github.catvod.spider.merge.L1.a("t50x50", 50, 50, 3), new com.github.catvod.spider.merge.L1.a("t60x60", 60, 60, 3), new com.github.catvod.spider.merge.L1.a("t67x67", 67, 67, 3), new com.github.catvod.spider.merge.L1.a("t80x80", 80, 80, 3), new com.github.catvod.spider.merge.L1.a("large", 100, 100, 3), new com.github.catvod.spider.merge.L1.a("t120x120", 120, 120, 3), new com.github.catvod.spider.merge.L1.a("t200x200", 200, 200, 2), new com.github.catvod.spider.merge.L1.a("t240x240", 240, 240, 2), new com.github.catvod.spider.merge.L1.a("t250x250", 250, 250, 2), new com.github.catvod.spider.merge.L1.a("t300x300", 300, 300, 2), new com.github.catvod.spider.merge.L1.a("t500x500", 500, 500, 2)};
        ArrayList arrayList = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            com.github.catvod.spider.merge.L1.a aVar = aVarArr[i];
            aVar.getClass();
            arrayList.add(aVar);
        }
        a = Collections.unmodifiableList(arrayList);
        Object[] objArr = {new com.github.catvod.spider.merge.L1.a("t1240x260", 1240, 260, 2), new com.github.catvod.spider.merge.L1.a("t2480x520", 2480, 520, 2)};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            arrayList2.add(obj);
        }
        Collections.unmodifiableList(arrayList2);
        c = Pattern.compile("^https?://on.soundcloud.com/[0-9a-zA-Z]+$");
    }

    public static synchronized String a() {
        if (!m.j(b)) {
            return b;
        }
        AbstractC0901a abstractC0901aA = k.a();
        C1036g c1036gL0 = F.d(abstractC0901aA.d("https://soundcloud.com").c()).l0("script[src*=\"sndcdn.com/assets/\"][src$=\".js\"]");
        Collections.reverse(c1036gL0);
        Object[] objArr = {"bytes=0-50000"};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < 1; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        Map mapB = a.b(Collections.unmodifiableList(arrayList));
        Iterator<com.github.catvod.spider.merge.c1.m> it = c1036gL0.iterator();
        while (it.hasNext()) {
            String strC = it.next().c("src");
            if (!m.j(strC)) {
                try {
                    String strD = com.github.catvod.spider.merge.L1.k.d(",client_id:\"(.*?)\"", abstractC0901aA.e(strC, mapB).c(), 1);
                    b = strD;
                    return strD;
                } catch (j unused) {
                    continue;
                }
            }
        }
        throw new C1368e("Couldn't extract client id");
    }

    public static List<C1311c> b(String str) {
        if (m.j(str)) {
            return Collections.emptyList();
        }
        return (List) a.stream().map(new com.github.catvod.spider.merge.x1.b(str.replace("-large.", "-%s."), 1)).collect(Collectors.toList());
    }

    public static List<C1311c> c(e eVar) throws i {
        String strI = eVar.i("artwork_url", null);
        if (strI != null) {
            return b(strI);
        }
        String strI2 = eVar.g("user").i("avatar_url", null);
        if (strI2 != null) {
            return b(strI2);
        }
        throw new i("Could not get track or track user's thumbnails");
    }

    public static com.github.catvod.spider.merge.r1.b d(String str) throws i {
        try {
            try {
                return com.github.catvod.spider.merge.r1.b.a(str);
            } catch (DateTimeParseException e) {
                throw new i(t0.a("Could not parse date: \"", str, "\""), e);
            }
        } catch (DateTimeParseException unused) {
            return new com.github.catvod.spider.merge.r1.b(OffsetDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss +0000")).toInstant(), false);
        }
    }

    public static String e(String str) throws i {
        if (c.matcher(str).find()) {
            try {
                AbstractC0901a abstractC0901aA = k.a();
                abstractC0901aA.getClass();
                C1359a c1359a = new C1359a();
                c1359a.i(str);
                c1359a.j(null);
                str = abstractC0901aA.a(c1359a.g()).b().split("\\?")[0];
            } catch (C1368e e) {
                throw new i("Could not follow on.soundcloud.com redirect", e);
            }
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        try {
            try {
                return String.valueOf(com.github.catvod.spider.merge.L1.b.i(g.d().a(k.a().f("https://api-widget.soundcloud.com/resolve?url=" + m.c(m.q(m.n(str.toLowerCase())).toString()) + "&format=json&client_id=" + a(), null, l.a.b()).c()), "id"));
            } catch (h e2) {
                throw new i("Could not parse JSON response", e2);
            } catch (C1368e e3) {
                throw new i("Could not resolve id with embedded player. ClientId not extracted", e3);
            }
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("The given URL is not valid");
        }
    }

    public static String f(String str) {
        return com.github.catvod.spider.merge.L1.l.e(k.a().f(C1290c.a("https://w.soundcloud.com/player/?url=", m.c(str)), null, l.a.b()).c()).l0("link[rel=\"canonical\"]").e().c("abs:href");
    }
}
