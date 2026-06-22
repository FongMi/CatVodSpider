package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.m1.C1311c;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0690i implements com.github.catvod.spider.merge.s1.b {
    private final com.github.catvod.spider.merge.D0.e a;
    private final com.github.catvod.spider.merge.D0.e b;
    private final com.github.catvod.spider.merge.D0.e c;
    private final com.github.catvod.spider.merge.D0.e d;
    private int e;

    public C0690i(com.github.catvod.spider.merge.D0.e eVar) {
        this.a = eVar;
        this.b = eVar.g("contentImage").g("collectionThumbnailViewModel").g("primaryThumbnail").g("thumbnailViewModel");
        com.github.catvod.spider.merge.D0.e eVarG = eVar.g("metadata").g("lockupMetadataViewModel");
        this.c = eVarG;
        this.d = eVarG.g("metadata").g("contentMetadataViewModel").b("metadataRows").a(0);
        try {
            this.e = com.github.catvod.spider.merge.F1.B.d(t());
        } catch (com.github.catvod.spider.merge.p1.i unused) {
            this.e = 1;
        }
    }

    private String t() throws com.github.catvod.spider.merge.p1.i {
        String strI = this.a.i("contentId", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            strI = this.a.g("rendererContext").g("commandContext").g("watchEndpoint").i("playlistId", null);
        }
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get playlist ID");
        }
        return strI;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final String a() {
        if (this.e != 1) {
            return null;
        }
        return com.github.catvod.spider.merge.F1.B.r(this.d.b("metadataParts").a(0).g("text").b("commandRuns").a(0).g("onTap").g("innertubeCommand"));
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final boolean b() {
        if (this.e != 1) {
            return false;
        }
        return com.github.catvod.spider.merge.F1.B.v(this.d.b("metadataParts").a(0).g("text").b("attachmentRuns"));
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final String c() {
        return this.d.b("metadataParts").a(0).g("text").i("content", null);
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final long d() throws com.github.catvod.spider.merge.p1.i {
        if (this.e != 1) {
            return -2L;
        }
        try {
            return Long.parseLong(com.github.catvod.spider.merge.L1.m.o(((com.github.catvod.spider.merge.D0.e) ((com.github.catvod.spider.merge.D0.e) this.b.b("overlays").stream().filter(new C0685d(com.github.catvod.spider.merge.D0.e.class, 0)).map(new C0684c(com.github.catvod.spider.merge.D0.e.class, 0)).filter(C0687f.b).findFirst().orElseThrow(C0689h.b)).g("thumbnailOverlayBadgeViewModel").b("thumbnailBadges").stream().filter(new com.github.catvod.spider.merge.D1.c(com.github.catvod.spider.merge.D0.e.class, 1)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 1)).filter(new Predicate() { // from class: com.github.catvod.spider.merge.G1.e
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((com.github.catvod.spider.merge.D0.e) obj).containsKey("thumbnailBadgeViewModel");
                }
            }).findFirst().orElseThrow(new Supplier() { // from class: com.github.catvod.spider.merge.G1.g
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new com.github.catvod.spider.merge.p1.i("Could not get thumbnailBadgeViewModel");
                }
            })).g("thumbnailBadgeViewModel").i("text", null)));
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get playlist stream count", e);
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() {
        if (this.e == 1) {
            try {
                return com.github.catvod.spider.merge.H1.b.s().i(t());
            } catch (Exception unused) {
            }
        }
        return com.github.catvod.spider.merge.F1.B.r(this.a.g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand"));
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final void getDescription() {
        com.github.catvod.spider.merge.I1.c cVar = com.github.catvod.spider.merge.I1.c.d;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() {
        return this.c.g("title").i("content", null);
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final int n() {
        return this.e;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return com.github.catvod.spider.merge.F1.B.m(this.b.g("image").b("sources"));
    }
}
