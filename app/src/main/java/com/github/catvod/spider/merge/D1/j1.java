package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.c1.C0947c;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class j1 {
    protected F a;
    C0973a b;
    S c;
    protected com.github.catvod.spider.merge.c1.h d;
    protected ArrayList<com.github.catvod.spider.merge.c1.m> e;
    protected String f;
    protected P g;
    protected C0972E h;
    protected Map<String, G> i;
    private N j = new N();
    private M k = new M();

    j1() {
    }

    protected final com.github.catvod.spider.merge.c1.m a() {
        int size = this.e.size();
        return size > 0 ? this.e.get(size - 1) : this.d;
    }

    protected final boolean b(String str) {
        com.github.catvod.spider.merge.c1.m mVarA;
        return (this.e.size() == 0 || (mVarA = a()) == null || !mVarA.f0().equals(str)) ? false : true;
    }

    protected void c(Reader reader, String str, F f) {
        C0899d.i(str, "baseUri");
        C0899d.h(f);
        com.github.catvod.spider.merge.c1.h hVar = new com.github.catvod.spider.merge.c1.h(str);
        this.d = hVar;
        hVar.D0(f);
        this.a = f;
        this.h = f.g();
        C0973a c0973a = new C0973a(reader, 32768);
        this.b = c0973a;
        c0973a.O(f.c());
        this.g = null;
        this.c = new S(this.b, f.a());
        this.e = new ArrayList<>(32);
        this.i = new HashMap();
        this.f = str;
    }

    final com.github.catvod.spider.merge.c1.h d(Reader reader, String str, F f) {
        P pU;
        c(reader, str, f);
        S s = this.c;
        do {
            pU = s.u();
            e(pU);
            pU.h();
        } while (pU.a != 6);
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
        return this.d;
    }

    protected abstract boolean e(P p);

    protected final boolean f(String str) {
        P p = this.g;
        M m = this.k;
        if (p == m) {
            M m2 = new M();
            m2.v(str);
            return e(m2);
        }
        m.h();
        m.v(str);
        return e(m);
    }

    public boolean g(C0947c c0947c) {
        N n = this.j;
        if (this.g == n) {
            n = new N();
            n.d = "input";
            n.n = c0947c;
        } else {
            n.h();
            n.d = "input";
            n.n = c0947c;
        }
        n.e = com.github.catvod.spider.merge.g.b.b("input");
        return e(n);
    }

    protected final boolean h(String str) {
        N n = this.j;
        if (this.g == n) {
            n = new N();
        } else {
            n.h();
        }
        n.v(str);
        return e(n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.d1.G>] */
    protected final G i(String str, C0972E c0972e) {
        G g = (G) this.i.get(str);
        if (g != null) {
            return g;
        }
        G gM = G.m(str, c0972e);
        this.i.put(str, gM);
        return gM;
    }
}
