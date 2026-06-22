package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class N {
    public int a;

    public static void g(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public final boolean a() {
        return this.a == 4;
    }

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a == 6;
    }

    public final boolean d() {
        return this.a == 3;
    }

    public final boolean e() {
        return this.a == 2;
    }

    public abstract void f();
}
