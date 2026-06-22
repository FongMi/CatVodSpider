package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.m1.C1311c;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class S implements com.github.catvod.spider.merge.I1.j {
    private static final DateTimeFormatter h = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
    public static final /* synthetic */ int i = 0;
    private final com.github.catvod.spider.merge.D0.e a;
    private final com.github.catvod.spider.merge.r1.j b;
    private int c;
    private String d;
    private Optional<String> e;
    private O f;
    private com.github.catvod.spider.merge.D0.c g;

    public S(com.github.catvod.spider.merge.D0.e eVar, com.github.catvod.spider.merge.r1.j jVar) {
        this.a = eVar;
        this.b = jVar;
    }

    private Optional<com.github.catvod.spider.merge.D0.e> A(int i2, final int i3) {
        if (this.g == null) {
            this.g = com.github.catvod.spider.merge.L1.b.a(this.a, "metadata.lockupMetadataViewModel.metadata.contentMetadataViewModel.metadataRows");
        }
        return this.g.b().skip(i2).limit(1L).flatMap(new Function() { // from class: com.github.catvod.spider.merge.G1.K
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.github.catvod.spider.merge.D0.e) obj).b("metadataParts").b().skip(i3).limit(1L);
            }
        }).findFirst();
    }

    private String B(String str) {
        com.github.catvod.spider.merge.H1.a aVarS = com.github.catvod.spider.merge.H1.a.s();
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return aVarS.i(str);
    }

    public static boolean t(com.github.catvod.spider.merge.D0.e eVar) {
        if ("THUMBNAIL_OVERLAY_BADGE_STYLE_LIVE".equals(eVar.i("badgeStyle", null))) {
            return true;
        }
        return eVar.g("icon").b("sources").b().map(C0693l.d).anyMatch(new com.github.catvod.spider.merge.F1.x("LIVE", 1));
    }

    public static String u(S s, com.github.catvod.spider.merge.D0.e eVar) {
        s.getClass();
        return eVar.g("text").i("content", null);
    }

    private O w() throws com.github.catvod.spider.merge.p1.i {
        O p;
        if (this.f == null) {
            com.github.catvod.spider.merge.D0.e eVarG = this.a.g("metadata").g("lockupMetadataViewModel").g("image");
            com.github.catvod.spider.merge.D0.e eVarH = eVarG.h("decoratedAvatarViewModel", null);
            if (eVarH != null) {
                p = new Q(eVarH);
            } else {
                com.github.catvod.spider.merge.D0.e eVarH2 = eVarG.h("avatarStackViewModel", null);
                if (eVarH2 == null) {
                    throw new com.github.catvod.spider.merge.p1.i("Failed to determine channel image view model");
                }
                p = new P(eVarH2);
            }
            this.f = p;
        }
        return this.f;
    }

    private Optional<String> x() {
        if (this.e == null) {
            this.e = A(1, 1).map(new z(this, 1));
        }
        return this.e;
    }

    private boolean y() {
        return k() != 2;
    }

    private boolean z() {
        return ((Boolean) x().map(new Function() { // from class: com.github.catvod.spider.merge.G1.L
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i2 = S.i;
                return Boolean.valueOf(((String) obj).contains("Premieres "));
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String a() throws com.github.catvod.spider.merge.p1.i {
        com.github.catvod.spider.merge.D0.e eVarG = w().b().g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand");
        com.github.catvod.spider.merge.D0.e eVarG2 = eVarG.g("browseEndpoint");
        String strI = eVarG2.i("browseId", null);
        if (strI != null && strI.startsWith("UC")) {
            return com.github.catvod.spider.merge.H1.a.s().i("channel/" + strI);
        }
        String strI2 = eVarG2.i("canonicalBaseUrl", null);
        if (!com.github.catvod.spider.merge.L1.m.j(strI2)) {
            return B(strI2);
        }
        String strI3 = eVarG.g("commandMetadata").g("webCommandMetadata").i("url", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI3)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get uploader url");
        }
        return B(strI3);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean b() {
        return ((Boolean) A(0, 0).map(C0692k.c).map(C0695n.d).orElse(Boolean.FALSE)).booleanValue();
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String c() {
        return (String) A(0, 0).map(new C0684c(this, 3)).filter(C0687f.d).orElseThrow(C0689h.c);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() throws com.github.catvod.spider.merge.p1.i {
        try {
            String strI = this.a.i("contentId", null);
            if (com.github.catvod.spider.merge.L1.m.j(strI)) {
                strI = com.github.catvod.spider.merge.L1.b.g(this.a, "rendererContext.commandContext.onTap.innertubeCommand.watchEndpoint.videoId");
            }
            return com.github.catvod.spider.merge.H1.c.r().i(strI);
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get url", e);
        }
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long g() {
        if (z()) {
            return -1L;
        }
        Optional<U> map = A(1, 0).map(new com.github.catvod.spider.merge.x1.b(this, 2));
        if (!map.isPresent()) {
            return !y() ? -1L : 0L;
        }
        String str = (String) map.get();
        if (str.toLowerCase().contains("no views")) {
            return 0L;
        }
        if (str.toLowerCase().contains("recommended")) {
            return -1L;
        }
        return com.github.catvod.spider.merge.L1.m.m(str);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() throws com.github.catvod.spider.merge.p1.i {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strG = com.github.catvod.spider.merge.L1.b.g(this.a, "metadata.lockupMetadataViewModel.title.content");
        if (com.github.catvod.spider.merge.L1.m.j(strG)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get name");
        }
        this.d = strG;
        return strG;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long h() throws com.github.catvod.spider.merge.p1.i {
        if (y() || z()) {
            return -1L;
        }
        List list = (List) com.github.catvod.spider.merge.L1.b.a(this.a, "contentImage.thumbnailViewModel.overlays").b().flatMap(N.b).map(M.b).collect(Collectors.toList());
        if (list.isEmpty()) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get duration: No parsable durations detected");
        }
        com.github.catvod.spider.merge.p1.i e = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                return com.github.catvod.spider.merge.F1.B.C((String) it.next());
            } catch (com.github.catvod.spider.merge.p1.i e2) {
                e = e2;
            }
        }
        throw new com.github.catvod.spider.merge.p1.i("Could not get duration", e);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final /* synthetic */ int i() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final int k() {
        if (this.c == 0) {
            this.c = com.github.catvod.spider.merge.L1.b.a(this.a, "contentImage.thumbnailViewModel.overlays").b().flatMap(N.c).map(M.c).anyMatch(t.d) ? 4 : 2;
        }
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean l() throws com.github.catvod.spider.merge.p1.i {
        String name = getName();
        return "[Private video]".equals(name) || "[Deleted video]".equals(name);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String m() {
        if (y()) {
            return null;
        }
        Optional<String> optionalX = x();
        return z() ? (String) optionalX.map(C0695n.e).orElse(null) : optionalX.orElse(null);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final List<C1311c> o() {
        return com.github.catvod.spider.merge.F1.B.m(com.github.catvod.spider.merge.L1.b.a(w().a(), "avatarViewModel.image.sources"));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final /* synthetic */ String q() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.time.ZonedDateTime] */
    @Override // com.github.catvod.spider.merge.I1.j
    public final com.github.catvod.spider.merge.r1.b r() throws com.github.catvod.spider.merge.p1.i {
        String strM;
        if (this.b == null || (strM = m()) == null) {
            return null;
        }
        if (!z()) {
            return this.b.d(strM);
        }
        String str = (String) x().map(C0695n.e).orElse(null);
        if (str == null) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get upload date from premiere");
        }
        try {
            return new com.github.catvod.spider.merge.r1.b(LocalDateTime.parse(str, h).atZone((ZoneId) ZoneOffset.UTC).toInstant(), false);
        } catch (DateTimeParseException e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not parse premiere upload date", e);
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return com.github.catvod.spider.merge.F1.B.m(com.github.catvod.spider.merge.L1.b.a(this.a, "contentImage.thumbnailViewModel.image.sources"));
    }
}
