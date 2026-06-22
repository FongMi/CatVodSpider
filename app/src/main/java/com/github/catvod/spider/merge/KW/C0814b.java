package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0814b {
    public final AbstractC0825m a;
    public final int b;
    public X c;
    public int d;
    public final l0 e;

    public C0814b(C0814b c0814b, AbstractC0825m abstractC0825m, X x, l0 l0Var) {
        this.a = abstractC0825m;
        this.b = c0814b.b;
        this.c = x;
        this.e = l0Var;
        this.d = c0814b.d;
    }

    public C0814b(AbstractC0825m abstractC0825m, int i, X x, l0 l0Var) {
        this.a = abstractC0825m;
        this.b = i;
        this.c = x;
        this.e = l0Var;
    }

    public boolean a(C0814b c0814b) {
        X x;
        X x2;
        if (this == c0814b) {
            return true;
        }
        return c0814b != null && this.a.b == c0814b.a.b && this.b == c0814b.b && ((x = this.c) == (x2 = c0814b.c) || (x != null && x.equals(x2))) && this.e.equals(c0814b.e) && c() == c0814b.c();
    }

    public final int b() {
        return this.d & (-1073741825);
    }

    public final boolean c() {
        return (this.d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0814b) {
            return a((C0814b) obj);
        }
        return false;
    }

    public int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.g(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(7, this.a.b), this.b), this.c), this.e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        String strD = ZrJ.d("55");
        sb.append(strD);
        sb.append(this.b);
        if (this.c != null) {
            sb.append(ZrJ.d("5518"));
            sb.append(this.c.toString());
            sb.append(ZrJ.d("24"));
        }
        l0 l0Var = this.e;
        if (l0Var != null && l0Var != l0.a) {
            sb.append(strD);
            sb.append(this.e);
        }
        if (b() > 0) {
            sb.append(ZrJ.d("55363B70"));
            sb.append(b());
        }
        sb.append(')');
        return sb.toString();
    }
}
