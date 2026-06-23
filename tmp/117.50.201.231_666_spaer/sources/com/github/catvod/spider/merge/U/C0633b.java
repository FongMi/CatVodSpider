package com.github.catvod.spider.merge.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0633b {
    public final AbstractC0640i a;
    public final int b;
    public S c;
    public int d;
    public final b0 e;

    public C0633b(C0633b c0633b, AbstractC0640i abstractC0640i, S s, b0 b0Var) {
        this.a = abstractC0640i;
        this.b = c0633b.b;
        this.c = s;
        this.e = b0Var;
        this.d = c0633b.d;
    }

    public C0633b(AbstractC0640i abstractC0640i, int i, S s, b0 b0Var) {
        this.a = abstractC0640i;
        this.b = i;
        this.c = s;
        this.e = b0Var;
    }

    public boolean a(C0633b c0633b) {
        S s;
        S s2;
        if (this == c0633b) {
            return true;
        }
        return c0633b != null && this.a.b == c0633b.a.b && this.b == c0633b.b && ((s = this.c) == (s2 = c0633b.c) || (s != null && s.equals(s2))) && this.e.equals(c0633b.e) && c() == c0633b.c();
    }

    public final int b() {
        return this.d & (-1073741825);
    }

    public final boolean c() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0633b) {
            return a((C0633b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.i(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(7, this.a.b), this.b), this.c), this.e), 4);
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
        b0 b0Var = this.e;
        if (b0Var != null && b0Var != b0.a) {
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
