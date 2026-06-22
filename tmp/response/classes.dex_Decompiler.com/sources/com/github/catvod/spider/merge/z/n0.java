package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class n0 extends X {
    public final X c;
    public final int d;

    n0(X x, int i) {
        super(x != null ? com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.g(1, x), i), 2) : com.github.catvod.spider.merge.B.l.b(1, 0));
        this.c = x;
        this.d = i;
    }

    public static n0 i(X x, int i) {
        return (i == Integer.MAX_VALUE && x == null) ? X.b : new n0(x, i);
    }

    @Override // com.github.catvod.spider.merge.z.X
    public X c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.z.X
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.z.X
    public boolean equals(Object obj) {
        X x;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0) || this.a != obj.hashCode()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.d == n0Var.d && (x = this.c) != null && x.equals(n0Var.c);
    }

    @Override // com.github.catvod.spider.merge.z.X
    public int h() {
        return 1;
    }

    public String toString() {
        X x = this.c;
        String string = x != null ? x.toString() : "";
        if (string.length() == 0) {
            int i = this.d;
            return i == Integer.MAX_VALUE ? oZP.d("51") : String.valueOf(i);
        }
        return String.valueOf(this.d) + oZP.d("55") + string;
    }
}
