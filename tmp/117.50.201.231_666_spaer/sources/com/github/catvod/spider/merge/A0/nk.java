package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class nk extends uz {
    public final StringBuilder b;
    public String c;
    public final StringBuilder d;
    public final StringBuilder e;
    public boolean f;

    public nk() {
        super(1);
        this.b = new StringBuilder();
        this.c = null;
        this.d = new StringBuilder();
        this.e = new StringBuilder();
        this.f = false;
    }

    @Override // com.github.catvod.spider.merge.A0.uz
    public final void a() {
        uz.h(this.b);
        this.c = null;
        uz.h(this.d);
        uz.h(this.e);
        this.f = false;
    }

    public final String toString() {
        return "<!doctype " + this.b.toString() + ">";
    }
}
