package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class B {
    private int a;
    private String b;

    B(int i, String str) {
        this.a = i;
        this.b = str;
    }

    B(int i, String str, Object... objArr) {
        this.b = String.format(str, objArr);
        this.a = i;
    }

    public final String toString() {
        return this.a + ": " + this.b;
    }
}
