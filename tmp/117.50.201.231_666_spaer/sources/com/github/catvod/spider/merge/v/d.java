package com.github.catvod.spider.merge.v;

import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.u.C0634c;
import com.github.catvod.spider.merge.u.C0655y;
import com.github.catvod.spider.merge.u.b0;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class d {
    public int a;
    public C0634c b;
    public d[] c;
    public boolean d;
    public int e;
    public C0655y f;
    public boolean g;
    public a[] h;

    public static class a {
        public b0 a;
        public int b;

        public a(b0 b0Var, int i) {
            this.b = i;
            this.a = b0Var;
        }

        public final String toString() {
            StringBuilder sbA = C0529a.a("(");
            sbA.append(this.a);
            sbA.append(", ");
            sbA.append(this.b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public d() {
        this.a = -1;
        this.b = new C0634c(true);
        this.d = false;
    }

    public d(C0634c c0634c) {
        this.a = -1;
        new C0634c(true);
        this.d = false;
        this.b = c0634c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.b.equals(((d) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            a[] aVarArr = this.h;
            if (aVarArr != null) {
                sb.append(Arrays.toString(aVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
