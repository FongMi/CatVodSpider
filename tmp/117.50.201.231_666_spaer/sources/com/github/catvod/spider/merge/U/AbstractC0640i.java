package com.github.catvod.spider.merge.u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0640i {
    public int c;
    public com.github.catvod.spider.merge.w.i f;
    public C0632a a = null;
    public int b = -1;
    public boolean d = false;
    protected final List<i0> e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    public final void a(i0 i0Var) {
        int size = this.e.size();
        boolean z = false;
        if (this.e.isEmpty()) {
            this.d = i0Var.b();
        } else if (this.d != i0Var.b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.b));
            this.d = false;
        }
        for (i0 i0Var2 : this.e) {
            if (i0Var2.a.b == i0Var.a.b && ((i0Var2.c() != null && i0Var.c() != null && i0Var2.c().equals(i0Var.c())) || (i0Var2.b() && i0Var.b()))) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        this.e.add(size, i0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    public final int b() {
        return this.e.size();
    }

    public abstract int c();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    public final i0 d(int i) {
        return (i0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0640i) && this.b == ((AbstractC0640i) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
