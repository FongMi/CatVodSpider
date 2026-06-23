package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.t.C0623E;
import com.github.catvod.spider.merge.u.C0634c;
import com.github.catvod.spider.merge.u.f0;
import com.github.catvod.spider.merge.u.r;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b {
    public final Map<d, d> a = new HashMap();
    public volatile d b;
    public final int c;
    public final r d;
    private final boolean e;

    public b(r rVar, int i) {
        this.d = rVar;
        this.c = i;
        boolean z = true;
        if ((rVar instanceof f0) && ((f0) rVar).j) {
            d dVar = new d(new C0634c(true));
            dVar.c = new d[0];
            dVar.d = false;
            dVar.g = false;
            this.b = dVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final d a(int i) {
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

    public final void c(int i, d dVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (d[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = dVar;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, C0623E.e).toString();
    }
}
