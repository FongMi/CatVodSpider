package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
