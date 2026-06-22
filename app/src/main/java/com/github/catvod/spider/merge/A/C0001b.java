package com.github.catvod.spider.merge.A;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0001b {
    public final AbstractC0008i a;
    public final int b;
    public Q c;
    public int d;
    public final d0 e;

    public C0001b(C0001b c0001b, AbstractC0008i abstractC0008i, Q q, d0 d0Var) {
        this.a = abstractC0008i;
        this.b = c0001b.b;
        this.c = q;
        this.e = d0Var;
        this.d = c0001b.d;
    }

    public boolean a(C0001b c0001b) {
        Q q;
        Q q2;
        if (this == c0001b) {
            return true;
        }
        return c0001b != null && this.a.b == c0001b.a.b && this.b == c0001b.b && ((q = this.c) == (q2 = c0001b.c) || (q != null && q.equals(q2))) && this.e.equals(c0001b.e) && b() == c0001b.b();
    }

    public final boolean b() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0001b) {
            return a((C0001b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.c(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.b(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        if (this.c != null) {
            sb.append(",[");
            sb.append(this.c.toString());
            sb.append("]");
        }
        d0 d0Var = this.e;
        if (d0Var != null && d0Var != d0.a) {
            sb.append(",");
            sb.append(d0Var);
        }
        if ((this.d & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.d & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }

    public C0001b(AbstractC0008i abstractC0008i, int i, Q q) {
        this(abstractC0008i, i, q, d0.a);
    }

    public C0001b(AbstractC0008i abstractC0008i, int i, Q q, d0 d0Var) {
        this.a = abstractC0008i;
        this.b = i;
        this.c = q;
        this.e = d0Var;
    }
}
