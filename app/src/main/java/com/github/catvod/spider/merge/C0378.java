package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡅ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0378 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private int f935;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private String f936;

    C0378(int i, String str) {
        this.f935 = i;
        this.f936 = str;
    }

    public String toString() {
        return this.f935 + SOY.d("4072") + this.f936;
    }

    C0378(int i, String str, Object... objArr) {
        this.f936 = String.format(str, objArr);
        this.f935 = i;
    }
}
