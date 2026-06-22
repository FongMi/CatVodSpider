package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class f0 extends Q {
    public final Q c;
    public final int d;

    public f0(Q q, int i) {
        super(q != null ? com.github.catvod.spider.merge.R.a.a(com.github.catvod.spider.merge.R.a.b(com.github.catvod.spider.merge.R.a.c(1, q), i), 2) : com.github.catvod.spider.merge.R.a.a(1, 0));
        this.c = q;
        this.d = i;
    }

    public static f0 i(Q q, int i) {
        return (i == Integer.MAX_VALUE && q == null) ? Q.b : new f0(q, i);
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public Q c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public boolean equals(Object obj) {
        Q q;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        if (this.a != ((Q) obj).a) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.d == f0Var.d && (q = this.c) != null && q.equals(f0Var.c);
    }

    @Override // com.github.catvod.spider.merge.A.Q
    public int h() {
        return 1;
    }

    public String toString() {
        Q q = this.c;
        String string = q != null ? q.toString() : "";
        int length = string.length();
        int i = this.d;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }
}
