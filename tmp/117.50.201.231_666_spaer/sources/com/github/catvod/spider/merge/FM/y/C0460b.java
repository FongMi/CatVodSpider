package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0460b {
    public final AbstractC0471m a;
    public final int b;
    public X c;
    public int d;
    public final l0 e;

    public C0460b(C0460b c0460b, AbstractC0471m abstractC0471m, X x, l0 l0Var) {
        this.a = abstractC0471m;
        this.b = c0460b.b;
        this.c = x;
        this.e = l0Var;
        this.d = c0460b.d;
    }

    public C0460b(AbstractC0471m abstractC0471m, int i, X x, l0 l0Var) {
        this.a = abstractC0471m;
        this.b = i;
        this.c = x;
        this.e = l0Var;
    }

    public boolean a(C0460b c0460b) {
        X x;
        X x2;
        if (this == c0460b) {
            return true;
        }
        return c0460b != null && this.a.b == c0460b.a.b && this.b == c0460b.b && ((x = this.c) == (x2 = c0460b.c) || (x != null && x.equals(x2))) && this.e.equals(c0460b.e) && c() == c0460b.c();
    }

    public final int b() {
        return this.d & (-1073741825);
    }

    public final boolean c() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0460b) {
            return a((C0460b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.j(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        if (this.c != null) {
            sb.append(",[");
            sb.append(this.c.toString());
            sb.append("]");
        }
        l0 l0Var = this.e;
        if (l0Var != null && l0Var != l0.a) {
            sb.append(",");
            sb.append(this.e);
        }
        if (b() > 0) {
            sb.append(",up=");
            sb.append(b());
        }
        sb.append(')');
        return sb.toString();
    }
}
