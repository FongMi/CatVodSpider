package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.m1.C1311c;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class J implements com.github.catvod.spider.merge.I1.j {
    private static final Pattern e = Pattern.compile("([\\d,]+) views$");
    public static final /* synthetic */ int f = 0;
    private final com.github.catvod.spider.merge.D0.e a;
    private final com.github.catvod.spider.merge.r1.j b;
    private int c;
    private Boolean d;

    public J(com.github.catvod.spider.merge.D0.e eVar, com.github.catvod.spider.merge.r1.j jVar) {
        this.a = eVar;
        this.b = jVar;
    }

    private Instant t() throws com.github.catvod.spider.merge.p1.i {
        String strI = this.a.g("upcomingEventData").i("startTime", null);
        try {
            return Instant.ofEpochSecond(Long.parseLong(strI));
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i(t0.a("Could not parse date from premiere: \"", strI, "\""), e2);
        }
    }

    private long u() {
        String strI = this.a.g("title").g("accessibility").g("accessibilityData").i("label", "");
        if (strI.toLowerCase().endsWith("no views")) {
            return 0L;
        }
        return Long.parseLong(com.github.catvod.spider.merge.L1.m.o(com.github.catvod.spider.merge.L1.k.e(e, strI, 1)));
    }

    private long v(String str, boolean z) {
        if (str.toLowerCase().contains("no views")) {
            return 0L;
        }
        if (str.toLowerCase().contains("recommended")) {
            return -1L;
        }
        if (z) {
            return com.github.catvod.spider.merge.L1.m.m(str);
        }
        int i = com.github.catvod.spider.merge.L1.m.c;
        return Long.parseLong(str.replaceAll("\\D+", ""));
    }

    private boolean w() {
        if (this.d == null) {
            this.d = Boolean.valueOf(this.a.containsKey("upcomingEventData"));
        }
        return this.d.booleanValue();
    }

    private boolean x() {
        Iterator<Object> it = this.a.b("badges").iterator();
        while (it.hasNext()) {
            if (((com.github.catvod.spider.merge.D0.e) it.next()).g("metadataBadgeRenderer").i("label", "").equals("Premium")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String a() throws com.github.catvod.spider.merge.p1.i {
        String strR = com.github.catvod.spider.merge.F1.B.r(this.a.g("longBylineText").b("runs").a(0).g("navigationEndpoint"));
        if (com.github.catvod.spider.merge.L1.m.j(strR)) {
            strR = com.github.catvod.spider.merge.F1.B.r(this.a.g("ownerText").b("runs").a(0).g("navigationEndpoint"));
            if (com.github.catvod.spider.merge.L1.m.j(strR)) {
                strR = com.github.catvod.spider.merge.F1.B.r(this.a.g("shortBylineText").b("runs").a(0).g("navigationEndpoint"));
                if (com.github.catvod.spider.merge.L1.m.j(strR)) {
                    throw new com.github.catvod.spider.merge.p1.i("Could not get uploader url");
                }
            }
        }
        return strR;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean b() {
        return com.github.catvod.spider.merge.F1.B.y(this.a.b("ownerBadges"));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String c() throws com.github.catvod.spider.merge.p1.i {
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("longBylineText"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("ownerText"), false);
            if (com.github.catvod.spider.merge.L1.m.j(strO)) {
                strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("shortBylineText"), false);
                if (com.github.catvod.spider.merge.L1.m.j(strO)) {
                    throw new com.github.catvod.spider.merge.p1.i("Could not get uploader name");
                }
            }
        }
        return strO;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() throws com.github.catvod.spider.merge.p1.i {
        try {
            return com.github.catvod.spider.merge.H1.c.r().i(this.a.i("videoId", null));
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get url", e2);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long g() {
        if (x() || w()) {
            return -1L;
        }
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("viewCountText"), false);
        if (!com.github.catvod.spider.merge.L1.m.j(strO)) {
            try {
                return v(strO, false);
            } catch (Exception unused) {
            }
        }
        if (k() != 4) {
            try {
                return u();
            } catch (Exception unused2) {
            }
        }
        if (this.a.containsKey("videoInfo")) {
            try {
                return v(this.a.g("videoInfo").b("runs").a(0).i("text", ""), true);
            } catch (Exception unused3) {
            }
        }
        if (!this.a.containsKey("shortViewCountText")) {
            return -1L;
        }
        try {
            String strO2 = com.github.catvod.spider.merge.F1.B.o(this.a.g("shortViewCountText"), false);
            if (com.github.catvod.spider.merge.L1.m.j(strO2)) {
                return -1L;
            }
            return v(strO2, true);
        } catch (Exception unused4) {
            return -1L;
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() throws com.github.catvod.spider.merge.p1.i {
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("title"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get name");
        }
        return strO;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long h() throws com.github.catvod.spider.merge.p1.i {
        com.github.catvod.spider.merge.D0.e eVar;
        if (k() == 4) {
            return -1L;
        }
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("lengthText"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            strO = this.a.i("lengthSeconds", null);
            if (com.github.catvod.spider.merge.L1.m.j(strO) && (eVar = (com.github.catvod.spider.merge.D0.e) this.a.b("thumbnailOverlays").stream().filter(new com.github.catvod.spider.merge.z1.d(com.github.catvod.spider.merge.D0.e.class, 5)).map(new com.github.catvod.spider.merge.z1.b(com.github.catvod.spider.merge.D0.e.class, 5)).filter(new Predicate() { // from class: com.github.catvod.spider.merge.G1.I
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = J.f;
                    return ((com.github.catvod.spider.merge.D0.e) obj).containsKey("thumbnailOverlayTimeStatusRenderer");
                }
            }).findFirst().orElse(null)) != null) {
                strO = com.github.catvod.spider.merge.F1.B.o(eVar.g("thumbnailOverlayTimeStatusRenderer").g("text"), false);
            }
            if (com.github.catvod.spider.merge.L1.m.j(strO)) {
                if (w()) {
                    return -1L;
                }
                throw new com.github.catvod.spider.merge.p1.i("Could not get duration");
            }
        }
        return com.github.catvod.spider.merge.F1.B.C(strO);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final int i() {
        if (w()) {
            return 5;
        }
        if (this.a.b("badges").stream().filter(new com.github.catvod.spider.merge.D1.c(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 2)).map(new Function() { // from class: com.github.catvod.spider.merge.G1.H
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = J.f;
                return ((com.github.catvod.spider.merge.D0.e) obj).g("metadataBadgeRenderer").i("style", null);
            }
        }).anyMatch(new C0696o("BADGE_STYLE_TYPE_MEMBERS_ONLY", 1))) {
            return 3;
        }
        return x() ? 4 : 2;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean j() throws com.github.catvod.spider.merge.p1.i {
        try {
            String strI = this.a.g("navigationEndpoint").g("commandMetadata").g("webCommandMetadata").i("webPageType", null);
            boolean z = true;
            boolean zContainsKey = !com.github.catvod.spider.merge.L1.m.j(strI) && strI.equals("WEB_PAGE_TYPE_SHORTS");
            if (!zContainsKey) {
                zContainsKey = this.a.g("navigationEndpoint").containsKey("reelWatchEndpoint");
            }
            if (zContainsKey) {
                return zContainsKey;
            }
            com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) this.a.b("thumbnailOverlays").stream().filter(new com.github.catvod.spider.merge.F1.h(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 2)).filter(t.c).map(C0693l.c).findFirst().orElse(null);
            if (com.github.catvod.spider.merge.L1.m.l(eVar)) {
                return zContainsKey;
            }
            if (!eVar.i("style", "").equalsIgnoreCase("SHORTS")) {
                if (!eVar.g("icon").i("iconType", "").toLowerCase().contains("shorts")) {
                    z = false;
                }
            }
            return z;
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not determine if this is short-form content", e2);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final int k() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        for (Object obj : this.a.b("badges")) {
            if (obj instanceof com.github.catvod.spider.merge.D0.e) {
                com.github.catvod.spider.merge.D0.e eVarG = ((com.github.catvod.spider.merge.D0.e) obj).g("metadataBadgeRenderer");
                if (eVarG.i("style", "").equals("BADGE_STYLE_TYPE_LIVE_NOW") || eVarG.i("label", "").equals("LIVE NOW")) {
                    this.c = 4;
                    return 4;
                }
            }
        }
        for (Object obj2 : this.a.b("thumbnailOverlays")) {
            if ((obj2 instanceof com.github.catvod.spider.merge.D0.e) && ((com.github.catvod.spider.merge.D0.e) obj2).g("thumbnailOverlayTimeStatusRenderer").i("style", "").equalsIgnoreCase("LIVE")) {
                this.c = 4;
                return 4;
            }
        }
        this.c = 2;
        return 2;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean l() {
        return x() || getName().equals("[Private video]") || getName().equals("[Deleted video]");
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String m() {
        if (k() == 4) {
            return null;
        }
        if (w()) {
            return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(LocalDateTime.ofInstant(t(), ZoneId.systemDefault()));
        }
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("publishedTimeText"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO) && this.a.containsKey("videoInfo")) {
            strO = this.a.g("videoInfo").b("runs").a(2).i("text", null);
        }
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            return null;
        }
        return strO;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final List<C1311c> o() {
        com.github.catvod.spider.merge.D0.e eVar;
        String str;
        if (this.a.containsKey("channelThumbnailSupportedRenderers")) {
            eVar = this.a;
            str = "channelThumbnailSupportedRenderers.channelThumbnailWithLinkRenderer.thumbnail.thumbnails";
        } else {
            if (!this.a.containsKey("channelThumbnail")) {
                return Collections.emptyList();
            }
            eVar = this.a;
            str = "channelThumbnail.thumbnails";
        }
        return com.github.catvod.spider.merge.F1.B.m(com.github.catvod.spider.merge.L1.b.a(eVar, str));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String q() {
        if (this.a.containsKey("detailedMetadataSnippets")) {
            return com.github.catvod.spider.merge.F1.B.o(this.a.b("detailedMetadataSnippets").a(0).g("snippetText"), false);
        }
        if (this.a.containsKey("descriptionSnippet")) {
            return com.github.catvod.spider.merge.F1.B.o(this.a.g("descriptionSnippet"), false);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final com.github.catvod.spider.merge.r1.b r() throws com.github.catvod.spider.merge.p1.i {
        if (k() == 4) {
            return null;
        }
        if (w()) {
            return new com.github.catvod.spider.merge.r1.b(t(), false);
        }
        String strM = m();
        if (this.b == null || com.github.catvod.spider.merge.L1.m.j(strM)) {
            return null;
        }
        try {
            return this.b.d(strM);
        } catch (com.github.catvod.spider.merge.p1.i e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get upload date", e2);
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return com.github.catvod.spider.merge.F1.B.q(this.a);
    }
}
