package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abf {
    public int a = -1;
    public jn b;
    public abf[] c;
    public boolean d;
    public int e;
    public gk f;
    public boolean g;
    public abc[] h;

    public abf(jn jnVar) {
        new ArrayList(7);
        new jm(jl.a);
        this.d = false;
        this.b = jnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abf) {
            return this.b.equals(((abf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return po.e(po.j(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            abc[] abcVarArr = this.h;
            if (abcVarArr != null) {
                sb.append(Arrays.toString(abcVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
