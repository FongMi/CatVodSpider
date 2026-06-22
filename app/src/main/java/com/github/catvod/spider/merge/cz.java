package com.github.catvod.spider.merge;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class cz {
    private String S;
    private int l8;

    cz(int i, String str) {
        this.l8 = i;
        this.S = str;
    }

    public String toString() {
        return this.l8 + ": " + this.S;
    }

    cz(int i, String str, Object... objArr) {
        this.S = String.format(str, objArr);
        this.l8 = i;
    }
}
