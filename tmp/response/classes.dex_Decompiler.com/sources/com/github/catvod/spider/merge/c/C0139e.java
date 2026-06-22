package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.a.C0098a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0139e<T> {
    private int a = 0;
    private String b = "";
    private T c;

    public static <T> C0139e<T> a(String str) {
        C0139e<T> c0139e = new C0139e<>();
        ((C0139e) c0139e).a = 1;
        ((C0139e) c0139e).b = str;
        return c0139e;
    }

    public static <T> C0139e<T> h(T t) {
        C0139e<T> c0139e = new C0139e<>();
        ((C0139e) c0139e).c = t;
        return c0139e;
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
        return C0098a.a(new byte[]{-124, 44, 61, 85, -12, 55, 18, 16, -21}, new byte[]{-42, 73, 78, 46, -105, 88, 118, 117}) + this.a + C0098a.a(new byte[]{-57, 65, -70, -67, -127, 19, 83}, new byte[]{-21, 97, -41, -50, -26, 46, 116, 34}) + this.b + '\'' + C0098a.a(new byte[]{39, 43, 12, 4, 40, -98, -2}, new byte[]{11, 11, 104, 101, 92, -1, -61, -119}) + this.c + '}';
    }
}
