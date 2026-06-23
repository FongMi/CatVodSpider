package com.github.catvod.spider.merge.FM.L;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class k1 {
    protected F a;
    C0217a b;
    T c;
    protected com.github.catvod.spider.merge.FM.K.h d;
    protected ArrayList<com.github.catvod.spider.merge.FM.K.m> e;
    protected String f;
    protected Q g;
    protected E h;
    protected Map<String, G> i;
    private N j = new N();
    private M k = new M();

    k1() {
    }

    protected final com.github.catvod.spider.merge.FM.K.m a() {
        int size = this.e.size();
        return size > 0 ? this.e.get(size - 1) : this.d;
    }

    protected final boolean b(String str) {
        com.github.catvod.spider.merge.FM.K.m mVarA;
        return (this.e.size() == 0 || (mVarA = a()) == null || !mVarA.i0().equals(str)) ? false : true;
    }

    abstract E c();

    @ParametersAreNonnullByDefault
    protected void d(Reader reader, String str, F f) {
        com.github.catvod.spider.merge.FM.I.c.h(str, "baseUri");
        com.github.catvod.spider.merge.FM.I.c.g(f);
        com.github.catvod.spider.merge.FM.K.h hVar = new com.github.catvod.spider.merge.FM.K.h(str);
        this.d = hVar;
        hVar.B0(f);
        this.a = f;
        this.h = f.f();
        C0217a c0217a = new C0217a(reader, 32768);
        this.b = c0217a;
        c0217a.O(f.c());
        this.g = null;
        this.c = new T(this.b, f.a());
        this.e = new ArrayList<>(32);
        this.i = new HashMap();
        this.f = str;
    }

    protected boolean e(String str) {
        return false;
    }

    @ParametersAreNonnullByDefault
    final com.github.catvod.spider.merge.FM.K.h f(Reader reader, String str, F f) {
        Q qU;
        d(reader, str, f);
        T t = this.c;
        do {
            qU = t.u();
            g(qU);
            qU.h();
        } while (qU.a != 6);
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
        return this.d;
    }

    protected abstract boolean g(Q q);

    protected final boolean h(String str) {
        Q q = this.g;
        M m = this.k;
        if (q == m) {
            M m2 = new M();
            m2.v(str);
            return g(m2);
        }
        m.h();
        m.v(str);
        return g(m);
    }

    public boolean i(com.github.catvod.spider.merge.FM.K.c cVar) {
        String str;
        N n = this.j;
        if (this.g == n) {
            n = new N();
            n.d = "input";
            n.n = cVar;
            str = "input";
        } else {
            n.h();
            n.d = "input";
            n.n = cVar;
            str = "input";
        }
        n.e = str;
        return g(n);
    }

    protected final boolean j(String str) {
        N n = this.j;
        if (this.g == n) {
            n = new N();
        } else {
            n.h();
        }
        n.v(str);
        return g(n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.FM.L.G>] */
    protected final G k(String str, E e) {
        G g = (G) this.i.get(str);
        if (g != null) {
            return g;
        }
        G gM = G.m(str, e);
        this.i.put(str, gM);
        return gM;
    }
}
