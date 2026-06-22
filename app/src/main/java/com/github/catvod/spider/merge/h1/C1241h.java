package com.github.catvod.spider.merge.h1;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.h1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1241h extends AbstractC1239f {
    private BigInteger o;

    public C1241h() {
        this.b = 83;
    }

    public C1241h(int i, String str, BigInteger bigInteger) {
        super(i);
        this.b = 83;
        P(str);
        this.j = str.length();
        this.o = bigInteger;
    }

    @Override // com.github.catvod.spider.merge.f1.Q1
    public final BigInteger l() {
        return this.o;
    }
}
