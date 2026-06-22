package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class I extends N {
    public final StringBuilder b = new StringBuilder();
    public String c = null;
    public final StringBuilder d = new StringBuilder();
    public final StringBuilder e = new StringBuilder();
    public boolean f = false;

    public I() {
        this.a = 1;
    }

    @Override // com.github.catvod.spider.merge.M.N
    public final void f() {
        N.g(this.b);
        this.c = null;
        N.g(this.d);
        N.g(this.e);
        this.f = false;
    }

    public final String toString() {
        return "<!doctype " + this.b.toString() + ">";
    }
}
