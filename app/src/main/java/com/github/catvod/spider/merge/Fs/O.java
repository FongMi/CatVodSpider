package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class O {
    int a;

    O() {
    }

    static void h(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    final boolean a() {
        return this.a == 5;
    }

    final boolean b() {
        return this.a == 4;
    }

    final boolean c() {
        return this.a == 1;
    }

    final boolean d() {
        return this.a == 6;
    }

    final boolean e() {
        return this.a == 3;
    }

    final boolean f() {
        return this.a == 2;
    }

    abstract O g();
}
