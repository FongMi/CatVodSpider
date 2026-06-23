package com.github.catvod.spider.merge.u;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class d0 extends S {
    public final S c;
    public final int d;

    d0(S s, int i) {
        super(s != null ? com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.i(1, s), i), 2) : com.github.catvod.spider.merge.F.a.b(1, 0));
        this.c = s;
        this.d = i;
    }

    public static d0 i(S s, int i) {
        return (i == Integer.MAX_VALUE && s == null) ? S.b : new d0(s, i);
    }

    @Override // com.github.catvod.spider.merge.u.S
    public S c(int i) {
        return this.c;
    }

    @Override // com.github.catvod.spider.merge.u.S
    public int d(int i) {
        return this.d;
    }

    @Override // com.github.catvod.spider.merge.u.S
    public boolean equals(Object obj) {
        S s;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0) || this.a != obj.hashCode()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.d == d0Var.d && (s = this.c) != null && s.equals(d0Var.c);
    }

    @Override // com.github.catvod.spider.merge.u.S
    public int h() {
        return 1;
    }

    public String toString() {
        S s = this.c;
        String string = s != null ? s.toString() : "";
        if (string.length() == 0) {
            int i = this.d;
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(this.d) + " " + string;
    }
}
