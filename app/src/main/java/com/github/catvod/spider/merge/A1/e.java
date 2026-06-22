package com.github.catvod.spider.merge.A1;

import com.github.catvod.spider.merge.I1.j;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.l;
import com.github.catvod.spider.merge.q1.C1380a;
import com.github.catvod.spider.merge.z1.f;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e implements j {
    protected final com.github.catvod.spider.merge.D0.e a;
    private String b;

    public e(com.github.catvod.spider.merge.D0.e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String a() {
        String strG = com.github.catvod.spider.merge.L1.b.g(this.a, "account.name");
        String strG2 = com.github.catvod.spider.merge.L1.b.g(this.a, "account.host");
        l.b.getClass();
        return com.github.catvod.spider.merge.B1.a.t().o("accounts/" + strG + "@" + strG2, this.b).d();
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean b() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String c() {
        return com.github.catvod.spider.merge.L1.b.g(this.a, "account.displayName");
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String f() {
        String strG = com.github.catvod.spider.merge.L1.b.g(this.a, "uuid");
        l.b.getClass();
        com.github.catvod.spider.merge.B1.c cVarO = com.github.catvod.spider.merge.B1.c.o();
        String str = this.b;
        if (strG == null) {
            throw new NullPointerException("ID cannot be null");
        }
        String strJ = cVarO.j(strG, str);
        return new C1380a(strJ, strJ, strG).d();
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long g() {
        return this.a.f("views");
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final String getName() {
        return com.github.catvod.spider.merge.L1.b.g(this.a, "name");
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final long h() {
        return this.a.f("duration");
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
        return this.a.d("isLive") ? 4 : 2;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final boolean l() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final String m() {
        return com.github.catvod.spider.merge.L1.b.g(this.a, "publishedAt");
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final List<C1311c> o() {
        return f.a(this.b, this.a.g("account"));
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final /* synthetic */ String q() {
        return null;
    }

    @Override // com.github.catvod.spider.merge.I1.j
    public final com.github.catvod.spider.merge.r1.b r() {
        return com.github.catvod.spider.merge.r1.b.a(com.github.catvod.spider.merge.L1.b.g(this.a, "publishedAt"));
    }

    @Override // com.github.catvod.spider.merge.m1.InterfaceC1314f
    public final List<C1311c> s() {
        return f.b(this.b, this.a);
    }
}
