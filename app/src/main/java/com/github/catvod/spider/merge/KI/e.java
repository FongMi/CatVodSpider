package com.github.catvod.spider.merge.KI;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e<T> {
    private int a = 0;
    private String b = "";
    private T c;

    public static <T> e<T> a(String str) {
        e<T> eVar = new e<>();
        ((e) eVar).a = 1;
        ((e) eVar).b = str;
        return eVar;
    }

    public static <T> e<T> h(T t) {
        e<T> eVar = new e<>();
        ((e) eVar).c = t;
        return eVar;
    }

    public final int b() {
        return this.a;
    }

    public final T c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final void e(int i) {
        this.a = i;
    }

    public final void f(T t) {
        this.c = t;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.XI.f.a(new byte[]{-36, 100, 99, 47, -56, 6, 86, 117, -77}, new byte[]{-114, 1, 16, 84, -85, 105, 50, 16}) + this.a + com.github.catvod.spider.merge.XI.f.a(new byte[]{14, 81, 43, -103, 20, 99, -93}, new byte[]{34, 113, 70, -22, 115, 94, -124, -72}) + this.b + '\'' + com.github.catvod.spider.merge.XI.f.a(new byte[]{-95, 68, 87, -28, -113, -23, 1}, new byte[]{-115, 100, 51, -123, -5, -120, 60, -73}) + this.c + '}';
    }
}
