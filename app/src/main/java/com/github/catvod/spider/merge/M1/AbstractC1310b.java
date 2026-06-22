package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.q1.C1380a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1310b {
    private final o a;
    private final C1380a b;
    private boolean c = false;
    private final AbstractC0901a d;

    protected AbstractC1310b(o oVar, C1380a c1380a) {
        if (oVar == null) {
            throw new NullPointerException("service is null");
        }
        this.a = oVar;
        if (c1380a == null) {
            throw new NullPointerException("LinkHandler is null");
        }
        this.b = c1380a;
        AbstractC0901a abstractC0901aA = k.a();
        if (abstractC0901aA == null) {
            throw new NullPointerException("downloader is null");
        }
        this.d = abstractC0901aA;
    }

    protected final void a() {
        if (!this.c) {
            throw new IllegalStateException("Page is not fetched. Make sure you call fetchPage()");
        }
    }

    public final void b() {
        if (this.c) {
            return;
        }
        o(this.d);
        this.c = true;
    }

    public final String c() {
        return this.b.a();
    }

    public final AbstractC0901a d() {
        return this.d;
    }

    public final com.github.catvod.spider.merge.r1.a e() {
        o oVar = this.a;
        oVar.getClass();
        com.github.catvod.spider.merge.r1.a aVarB = k.b();
        return oVar.g().contains(aVarB) ? aVarB : com.github.catvod.spider.merge.r1.a.c;
    }

    public final com.github.catvod.spider.merge.r1.e f() {
        return this.a.b();
    }

    public String g() {
        return this.b.b();
    }

    public final C1380a h() {
        return this.b;
    }

    public abstract String i();

    public String j() {
        return this.b.c();
    }

    public final o k() {
        return this.a;
    }

    public final int l() {
        return this.a.d();
    }

    public final com.github.catvod.spider.merge.r1.j m() {
        o oVar = this.a;
        com.github.catvod.spider.merge.r1.e eVarF = f();
        oVar.getClass();
        com.github.catvod.spider.merge.r1.j jVarA = com.github.catvod.spider.merge.r1.k.a(eVarF);
        if (jVarA != null || (!eVarF.a().isEmpty() && (jVarA = com.github.catvod.spider.merge.r1.k.a(new com.github.catvod.spider.merge.r1.e(eVarF.b(), null))) != null)) {
            return jVarA;
        }
        throw new IllegalArgumentException("Localization is not supported (\"" + eVarF + "\")");
    }

    public String n() {
        return this.b.d();
    }

    public abstract void o(AbstractC0901a abstractC0901a);
}
