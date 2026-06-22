package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
abstract class Q {
    int a;
    private int b;
    private int c = -1;

    Q() {
    }

    static void i(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    final void a(int i) {
        this.c = i;
    }

    final boolean b() {
        return this.a == 5;
    }

    final boolean c() {
        return this.a == 4;
    }

    final boolean d() {
        return this.a == 1;
    }

    final boolean e() {
        return this.a == 6;
    }

    final boolean f() {
        return this.a == 3;
    }

    final boolean g() {
        return this.a == 2;
    }

    Q h() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    final void j(int i) {
        this.b = i;
    }
}
