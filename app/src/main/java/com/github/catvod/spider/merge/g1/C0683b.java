package com.github.catvod.spider.merge.G1;

import com.github.catvod.spider.merge.m1.C1311c;
import java.net.MalformedURLException;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0683b implements com.github.catvod.spider.merge.s1.b {
    private final com.github.catvod.spider.merge.D0.e a;

    public C0683b(com.github.catvod.spider.merge.D0.e eVar) {
        this.a = eVar;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final String a() {
        return null;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final boolean b() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final String c() {
        return com.github.catvod.spider.merge.F1.B.o(this.a.g("longBylineText"), false);
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final long d() throws com.github.catvod.spider.merge.p1.i {
        if (com.github.catvod.spider.merge.F1.B.o(this.a.g("videoCountShortText"), false) == null) {
            throw new com.github.catvod.spider.merge.p1.i("Could not extract item count for playlist/mix info item");
        }
        try {
            return Integer.parseInt(r0);
        } catch (NumberFormatException unused) {
            return -2L;
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() throws com.github.catvod.spider.merge.p1.i {
        String strI = this.a.i("shareUrl", null);
        if (com.github.catvod.spider.merge.L1.m.j(strI)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get url");
        }
        return strI;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final void getDescription() {
        com.github.catvod.spider.merge.I1.c cVar = com.github.catvod.spider.merge.I1.c.d;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() throws com.github.catvod.spider.merge.p1.i {
        String strO = com.github.catvod.spider.merge.F1.B.o(this.a.g("title"), false);
        if (com.github.catvod.spider.merge.L1.m.j(strO)) {
            throw new com.github.catvod.spider.merge.p1.i("Could not get name");
        }
        return strO;
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final int n() throws com.github.catvod.spider.merge.p1.i {
        String strF = f();
        int i = com.github.catvod.spider.merge.F1.B.j;
        try {
            return com.github.catvod.spider.merge.F1.B.d(com.github.catvod.spider.merge.L1.m.f(com.github.catvod.spider.merge.L1.m.q(strF), "list"));
        } catch (MalformedURLException e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not extract playlist type from malformed url", e);
        }
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return com.github.catvod.spider.merge.F1.B.q(this.a);
    }
}
