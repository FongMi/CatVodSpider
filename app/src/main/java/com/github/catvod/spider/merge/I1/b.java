package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.F1.C0628d;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends e {
    private final int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    private final String n;
    private final Locale o;
    private final int p;
    private C0628d q;

    /* JADX WARN: Illegal instructions before constructor call */
    b(a aVar) {
        String unused = aVar.a;
        String str = aVar.b;
        boolean z = aVar.c;
        EnumC1316h enumC1316h = aVar.e;
        int i = aVar.d;
        String unused2 = aVar.f;
        super(str, z, enumC1316h, i);
        this.g = -1;
        if (aVar.l != null) {
            this.q = aVar.l;
            this.g = aVar.l.c;
            aVar.l.getClass();
            this.h = aVar.l.e();
            this.i = aVar.l.k();
            this.j = aVar.l.j();
            this.k = aVar.l.i();
            this.l = aVar.l.h();
            this.m = aVar.l.f();
        }
        this.f = aVar.g;
        this.n = aVar.h;
        String unused3 = aVar.i;
        this.o = aVar.j;
        this.p = aVar.k;
    }

    @Override // com.github.catvod.spider.merge.I1.e
    public final boolean b(e eVar) {
        if (!super.b(eVar) || !(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        if (this.f != bVar.f) {
            return false;
        }
        String str = this.n;
        String str2 = bVar.n;
        if (!(str == str2 || (str != null && str.equals(str2))) || this.p != bVar.p) {
            return false;
        }
        Locale locale = this.o;
        Locale locale2 = bVar.o;
        return locale == locale2 || (locale != null && locale.equals(locale2));
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.m;
    }

    public final int g() {
        return this.l;
    }

    public final int h() {
        return this.k;
    }

    public final int i() {
        return this.j;
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.g;
    }

    public final C0628d l() {
        return this.q;
    }
}
