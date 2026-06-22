package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0283b {
    public final AbstractC0294m a;
    public final int b;
    public X c;
    public int d;
    public final l0 e;

    public C0283b(C0283b c0283b, AbstractC0294m abstractC0294m, X x, l0 l0Var) {
        this.a = abstractC0294m;
        this.b = c0283b.b;
        this.c = x;
        this.e = l0Var;
        this.d = c0283b.d;
    }

    public C0283b(AbstractC0294m abstractC0294m, int i, X x, l0 l0Var) {
        this.a = abstractC0294m;
        this.b = i;
        this.c = x;
        this.e = l0Var;
    }

    public boolean a(C0283b c0283b) {
        X x;
        X x2;
        if (this == c0283b) {
            return true;
        }
        return c0283b != null && this.a.b == c0283b.a.b && this.b == c0283b.b && ((x = this.c) == (x2 = c0283b.c) || (x != null && x.equals(x2))) && this.e.equals(c0283b.e) && c() == c0283b.c();
    }

    public final int b() {
        return this.d & (-1073741825);
    }

    public final boolean c() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0283b) {
            return a((C0283b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.g(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        String strD = oZP.d("59");
        sb.append(strD);
        sb.append(this.b);
        if (this.c != null) {
            sb.append(oZP.d("5934"));
            sb.append(this.c.toString());
            sb.append(oZP.d("28"));
        }
        l0 l0Var = this.e;
        if (l0Var != null && l0Var != l0.a) {
            sb.append(strD);
            sb.append(this.e);
        }
        if (b() > 0) {
            sb.append(oZP.d("591A077C"));
            sb.append(b());
        }
        sb.append(')');
        return sb.toString();
    }
}
