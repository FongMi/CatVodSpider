package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class uz {
    public final int g;

    public uz(int i) {
        this.g = i;
    }

    public static void h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public abstract void a();

    public final boolean i() {
        return this.g == 5;
    }

    public final boolean j() {
        return this.g == 4;
    }

    public final boolean k() {
        return this.g == 1;
    }

    public final boolean l() {
        return this.g == 6;
    }

    public final boolean m() {
        return this.g == 3;
    }

    public final boolean n() {
        return this.g == 2;
    }
}
