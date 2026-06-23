package com.github.catvod.spider.merge.C0.R;

import com.github.catvod.spider.merge.C0.P.I;
import com.github.catvod.spider.merge.C0.Q.f;
import com.github.catvod.spider.merge.C0.Q.p0;
import com.github.catvod.spider.merge.C0.Q.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class b {
    public final Map<e, e> a = new HashMap();
    public volatile e b;
    public final int c;
    public final v d;
    private final boolean e;

    public b(v vVar, int i) {
        boolean z = true;
        this.d = vVar;
        this.c = i;
        if ((vVar instanceof p0) && ((p0) vVar).j) {
            e eVar = new e(new f(true));
            eVar.c = new e[0];
            eVar.d = false;
            eVar.g = false;
            this.b = eVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final e a(int i) {
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

    public final void c(int i, e eVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (e[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = eVar;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, I.e).toString();
    }
}
