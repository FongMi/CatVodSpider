package com.github.catvod.spider.merge.u1;

import com.github.catvod.spider.merge.c1.m;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class f implements com.github.catvod.spider.merge.s1.b {
    private final m a;

    public f(m mVar) {
        this.a = mVar;
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
        return this.a.X("by-artist").j().replace("by ", "");
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final long d() {
        return -1L;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() {
        return this.a.X("album-link").a("abs:href");
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final void getDescription() {
        com.github.catvod.spider.merge.I1.c cVar = com.github.catvod.spider.merge.I1.c.d;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() {
        return this.a.X("release-title").j();
    }

    @Override // com.github.catvod.spider.merge.s1.b
    public final /* synthetic */ int n() {
        return 1;
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return b.d(this.a.X("album-art").a("src"));
    }
}
