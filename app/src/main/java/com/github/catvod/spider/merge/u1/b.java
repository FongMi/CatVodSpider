package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.d1.F;
import com.github.catvod.spider.merge.m1.C1311c;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b {
    private static final List<com.github.catvod.spider.merge.L1.a> a;
    public static final /* synthetic */ int b = 0;

    static {
        com.github.catvod.spider.merge.L1.a[] aVarArr = {new com.github.catvod.spider.merge.L1.a("10.jpg", -1, 1200, 1), new com.github.catvod.spider.merge.L1.a("101.jpg", 90, -1, 3), new com.github.catvod.spider.merge.L1.a("170.jpg", 422, -1, 2), new com.github.catvod.spider.merge.L1.a("171.jpg", 646, -1, 2), new com.github.catvod.spider.merge.L1.a("20.jpg", -1, 1024, 1), new com.github.catvod.spider.merge.L1.a("200.jpg", 420, -1, 2), new com.github.catvod.spider.merge.L1.a("201.jpg", 280, -1, 2), new com.github.catvod.spider.merge.L1.a("202.jpg", 140, -1, 3), new com.github.catvod.spider.merge.L1.a("204.jpg", 360, -1, 2), new com.github.catvod.spider.merge.L1.a("205.jpg", 240, -1, 2), new com.github.catvod.spider.merge.L1.a("206.jpg", 180, -1, 2), new com.github.catvod.spider.merge.L1.a("207.jpg", 120, -1, 3), new com.github.catvod.spider.merge.L1.a("43.jpg", 100, -1, 3), new com.github.catvod.spider.merge.L1.a("44.jpg", 200, -1, 2)};
        ArrayList arrayList = new ArrayList(14);
        for (int i = 0; i < 14; i++) {
            com.github.catvod.spider.merge.L1.a aVar = aVarArr[i];
            aVar.getClass();
            arrayList.add(aVar);
        }
        a = Collections.unmodifiableList(arrayList);
    }

    public static com.github.catvod.spider.merge.D0.e a(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            com.github.catvod.spider.merge.D0.f<com.github.catvod.spider.merge.D0.e> fVarD = com.github.catvod.spider.merge.D0.g.d();
            AbstractC0901a abstractC0901aA = com.github.catvod.spider.merge.m1.k.a();
            Map mapEmptyMap = Collections.emptyMap();
            com.github.catvod.spider.merge.D0.i iVarA = com.github.catvod.spider.merge.D0.k.a();
            iVarA.j();
            com.github.catvod.spider.merge.D0.i iVarU = iVarA.u("band_id", str);
            iVarU.g();
            return fVarD.a(abstractC0901aA.m("https://bandcamp.com/api/mobile/22/band_details", mapEmptyMap, iVarU.w().getBytes(StandardCharsets.UTF_8)).c());
        } catch (com.github.catvod.spider.merge.D0.h | com.github.catvod.spider.merge.p1.k | IOException e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not download band details", e);
        }
    }

    private static List<C1311c> b(String str) {
        return (List) a.stream().map(new a(str, 0)).collect(Collectors.toList());
    }

    public static List<C1311c> c(long j, boolean z) {
        if (j == 0) {
            return Collections.emptyList();
        }
        return b("https://f4.bcbits.com/img/" + (z ? 'a' : "") + j + "_");
    }

    public static List<C1311c> d(String str) {
        return m.j(str) ? Collections.emptyList() : b(str.replaceFirst("_\\d+\\.\\w+", "_"));
    }

    public static boolean e(String str) throws com.github.catvod.spider.merge.p1.i {
        if (str.toLowerCase().matches("https?://.+\\.bandcamp\\.com(/.*)?")) {
            return true;
        }
        if (str.toLowerCase().matches("https?://bandcamp\\.com(/.*)?")) {
            return false;
        }
        try {
            return F.d(com.github.catvod.spider.merge.m1.k.a().d(m.p(str)).c()).X("cart-wrapper").get(0).Y().get(0).c("href").equals("https://bandcamp.com/cart");
        } catch (com.github.catvod.spider.merge.p1.k | IOException unused) {
            throw new com.github.catvod.spider.merge.p1.i("Could not determine whether URL is custom domain (not available? network error?)");
        } catch (IndexOutOfBoundsException | NullPointerException unused2) {
            return false;
        }
    }

    public static boolean f(String str) {
        return str.toLowerCase().matches("https?://bandcamp\\.com/\\?show=\\d+");
    }

    public static com.github.catvod.spider.merge.r1.b g(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            return new com.github.catvod.spider.merge.r1.b(ZonedDateTime.parse(str, DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH)).toInstant(), false);
        } catch (DateTimeException e) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse date '", str, "'"), e);
        }
    }
}
