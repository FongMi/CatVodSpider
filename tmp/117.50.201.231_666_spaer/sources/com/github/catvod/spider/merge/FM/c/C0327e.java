package com.github.catvod.spider.merge.FM.c;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0327e<T> {
    private int a = 0;
    private String b;
    private T c;

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final void d(int i) {
        this.a = i;
    }

    public final void e(T t) {
        this.c = t;
    }

    public final void f(String str) {
        this.b = str;
    }

    public final String toString() {
        return "Res{code=" + this.a + ", msg='" + this.b + "', data=" + this.c + '}';
    }
}
