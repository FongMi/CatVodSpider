package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.Nx.p0;
import com.github.catvod.spider.merge.gu.I;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    public final Map<m, m> a = new HashMap();
    public volatile m b;
    public final int c;
    public final com.github.catvod.spider.merge.Nx.v d;
    private final boolean e;

    public k(com.github.catvod.spider.merge.Nx.v vVar, int i) {
        this.d = vVar;
        this.c = i;
        boolean z = true;
        if ((vVar instanceof p0) && ((p0) vVar).j) {
            m mVar = new m(new com.github.catvod.spider.merge.Nx.f(true));
            mVar.c = new m[0];
            mVar.d = false;
            mVar.g = false;
            this.b = mVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final m a(int i) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0 || i >= this.b.c.length) {
            return null;
        }
        return this.b.c[i];
    }

    public final boolean b() {
        return this.e;
    }

    public final void c(int i, m mVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (m[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = mVar;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, I.e).toString();
    }
}
