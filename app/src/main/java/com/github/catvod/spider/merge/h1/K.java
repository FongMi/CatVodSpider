package com.github.catvod.spider.merge.h1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K extends AbstractC1239f {
    private String o;
    private U p;

    public K() {
        this.b = 39;
    }

    public K(int i, String str) {
        super(i);
        this.b = 39;
        f0(str);
        this.j = str.length();
    }

    @Override // com.github.catvod.spider.merge.f1.Q1
    public final void M(U u) {
        this.p = u;
    }

    public final String d0() {
        return this.o;
    }

    public final int e0() {
        String str = this.o;
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public final void f0(String str) {
        P(str);
        this.o = str;
        this.j = str.length();
    }

    @Override // com.github.catvod.spider.merge.f1.Q1
    public final U t() {
        return this.p;
    }
}
