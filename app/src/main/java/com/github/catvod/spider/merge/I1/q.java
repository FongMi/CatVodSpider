package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.F1.C0628d;
import com.github.catvod.spider.merge.m1.EnumC1316h;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class q extends e {

    @Deprecated
    public final String f;

    @Deprecated
    public final boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private String q;

    q(String str, String str2, boolean z, EnumC1316h enumC1316h, int i, String str3, boolean z2, String str4, C0628d c0628d) {
        super(str2, z, enumC1316h, i);
        this.h = -1;
        if (c0628d != null) {
            this.h = c0628d.c;
            this.i = c0628d.e();
            this.j = c0628d.k();
            this.k = c0628d.j();
            this.l = c0628d.i();
            this.m = c0628d.h();
            this.q = c0628d.f();
            this.o = c0628d.g();
            this.n = c0628d.o();
            this.p = c0628d.h;
        }
        this.f = str3;
        this.g = z2;
    }

    @Override // com.github.catvod.spider.merge.I1.e
    public final boolean b(e eVar) {
        if (super.b(eVar) && (eVar instanceof q)) {
            q qVar = (q) eVar;
            if (this.f.equals(qVar.f) && this.g == qVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        return this.i;
    }

    public final String f() {
        return this.q;
    }

    public final int g() {
        return this.p;
    }

    public final int h() {
        return this.o;
    }

    public final int i() {
        return this.m;
    }

    public final int j() {
        return this.l;
    }

    public final int k() {
        return this.k;
    }

    public final int l() {
        return this.j;
    }

    public final int m() {
        return this.h;
    }

    public final int n() {
        return this.n;
    }
}
