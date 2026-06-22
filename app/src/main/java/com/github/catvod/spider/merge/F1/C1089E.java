package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1089E extends AbstractC1125d2 {
    private String j;
    private String k;

    C1089E(String str, String str2, String str3, int i, String str4, int i2) {
        i(str3, i, str4, i2);
        this.j = str;
        this.k = str2;
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1125d2
    public final String a() {
        return this.j + ": " + this.k;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.j;
    }
}
