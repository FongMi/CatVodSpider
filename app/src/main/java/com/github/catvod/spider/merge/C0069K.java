package com.github.catvod.spider.merge;

/* renamed from: com.github.catvod.spider.merge.K */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0069K {

    /* renamed from: q */
    private int f433q;

    /* renamed from: xC */
    private String f434xC;

    C0069K(int i, String str) {
        this.f433q = i;
        this.f434xC = str;
    }

    public String toString() {
        return this.f433q + ": " + this.f434xC;
    }

    C0069K(int i, String str, Object... objArr) {
        this.f434xC = String.format(str, objArr);
        this.f433q = i;
    }
}
