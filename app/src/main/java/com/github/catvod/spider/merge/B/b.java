package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.A.C0004e;
import com.github.catvod.spider.merge.A.h0;
import com.github.catvod.spider.merge.A.r;
import com.github.catvod.spider.merge.z.x;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b {
    public final HashMap a = new HashMap();
    public volatile e b;
    public final int c;
    public final r d;
    public final boolean e;

    public b(r rVar, int i) {
        this.d = rVar;
        this.c = i;
        boolean z = false;
        if ((rVar instanceof h0) && ((h0) rVar).j) {
            e eVar = new e(new C0004e(true));
            eVar.c = new e[0];
            eVar.d = false;
            eVar.g = false;
            this.b = eVar;
            z = true;
        }
        this.e = z;
    }

    public final void a(int i, e eVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            try {
                if (i >= this.b.c.length) {
                    this.b.c = (e[]) Arrays.copyOf(this.b.c, i + 1);
                }
                this.b.c[i] = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b == null ? "" : new c(this, x.e).toString();
    }
}
