package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class k1 {
    protected F a;
    C0017a b;
    T c;
    protected com.github.catvod.spider.merge.L.h d;
    protected ArrayList<com.github.catvod.spider.merge.L.m> e;
    protected String f;
    protected Q g;
    protected E h;
    protected Map<String, G> i;
    private N j = new N();
    private M k = new M();

    k1() {
    }

    protected final com.github.catvod.spider.merge.L.m a() {
        int size = this.e.size();
        return size > 0 ? this.e.get(size - 1) : this.d;
    }

    protected final boolean b(String str) {
        com.github.catvod.spider.merge.L.m mVarA;
        return (this.e.size() == 0 || (mVarA = a()) == null || !mVarA.i0().equals(str)) ? false : true;
    }

    abstract E c();

    @ParametersAreNonnullByDefault
    protected void d(Reader reader, String str, F f) {
        com.github.catvod.spider.merge.J.c.h(str, oZP.d("170E042439271C"));
        com.github.catvod.spider.merge.J.c.g(f);
        com.github.catvod.spider.merge.L.h hVar = new com.github.catvod.spider.merge.L.h(str);
        this.d = hVar;
        hVar.B0(f);
        this.a = f;
        this.h = f.f();
        C0017a c0017a = new C0017a(reader, 32768);
        this.b = c0017a;
        c0017a.O(f.c());
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
    final com.github.catvod.spider.merge.L.h f(Reader reader, String str, F f) {
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

    public boolean i(com.github.catvod.spider.merge.L.c cVar) {
        N n = this.j;
        Q q = this.g;
        String strD = oZP.d("1C01073418");
        if (q == n) {
            n = new N();
            n.d = strD;
            n.n = cVar;
        } else {
            n.h();
            n.d = strD;
            n.n = cVar;
        }
        n.e = com.github.catvod.spider.merge.B.l.c(strD);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.M.G>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.M.G>] */
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
