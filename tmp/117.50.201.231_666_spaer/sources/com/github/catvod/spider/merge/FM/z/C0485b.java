package com.github.catvod.spider.merge.FM.z;

import com.github.catvod.spider.merge.FM.x.C0432J;
import com.github.catvod.spider.merge.FM.y.AbstractC0479v;
import com.github.catvod.spider.merge.FM.y.C0464f;
import com.github.catvod.spider.merge.FM.y.p0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0485b {
    public final Map<C0488e, C0488e> a = new HashMap();
    public volatile C0488e b;
    public final int c;
    public final AbstractC0479v d;
    private final boolean e;

    public C0485b(AbstractC0479v abstractC0479v, int i) {
        this.d = abstractC0479v;
        this.c = i;
        boolean z = true;
        if ((abstractC0479v instanceof p0) && ((p0) abstractC0479v).j) {
            C0488e c0488e = new C0488e(new C0464f(true));
            c0488e.c = new C0488e[0];
            c0488e.d = false;
            c0488e.g = false;
            this.b = c0488e;
        } else {
            z = false;
        }
        this.e = z;
    }

    public final C0488e a(int i) {
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

    public final void c(int i, C0488e c0488e) {
        if (!this.e) {
            throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
        }
        if (i < 0) {
            return;
        }
        synchronized (this.b) {
            if (i >= this.b.c.length) {
                this.b.c = (C0488e[]) Arrays.copyOf(this.b.c, i + 1);
            }
            this.b.c[i] = c0488e;
        }
    }

    public final String toString() {
        return this.b == null ? "" : new C0486c(this, C0432J.e).toString();
    }
}
