package com.github.catvod.spider.merge.A0;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zn {
    public final HashMap a = new HashMap();
    public volatile abf b;
    public final int c;
    public final acc d;
    public final boolean e;

    public zn(acc accVar, int i) {
        this.d = accVar;
        this.c = i;
        boolean z = false;
        if ((accVar instanceof t) && ((t) accVar).c) {
            abf abfVar = new abf(new jn(true));
            abfVar.c = new abf[0];
            abfVar.d = false;
            abfVar.g = false;
            this.b = abfVar;
            z = true;
        }
        this.e = z;
    }

    public final void f(int i, abf abfVar) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            try {
                if (i >= this.b.c.length) {
                    this.b.c = (abf[]) Arrays.copyOf(this.b.c, i + 1);
                }
                this.b.c[i] = abfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.b == null ? "" : new abb(this, hn.b, 0).toString();
    }
}
