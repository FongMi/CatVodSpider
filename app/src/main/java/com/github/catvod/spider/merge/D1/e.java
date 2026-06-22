package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.I1.j;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.m1.C1311c;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e implements j {
    private final com.github.catvod.spider.merge.D0.e a;

    public e(com.github.catvod.spider.merge.D0.e eVar) {
        this.a = eVar;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String a() {
        return m.p(this.a.g("user").i("permalink_url", null));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean b() {
        return this.a.g("user").c("verified");
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String c() {
        return this.a.g("user").i("username", null);
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() {
        return m.p(this.a.i("permalink_url", null));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long g() {
        return this.a.f("playback_count");
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() {
        return this.a.i("title", null);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long h() {
        return this.a.f("duration") / 1000;
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
        return 3;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean l() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String m() {
        return this.a.i("created_at", null);
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final List<C1311c> o() {
        return com.github.catvod.spider.merge.C1.b.b(this.a.g("user").i("avatar_url", null));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final /* synthetic */ String q() {
        return null;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final com.github.catvod.spider.merge.r1.b r() {
        return com.github.catvod.spider.merge.C1.b.d(this.a.i("created_at", null));
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return com.github.catvod.spider.merge.C1.b.c(this.a);
    }
}
