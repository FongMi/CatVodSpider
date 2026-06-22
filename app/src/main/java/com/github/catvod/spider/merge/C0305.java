package com.github.catvod.spider.merge;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޓ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0305 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0301 f823;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public BigInteger f824;

    public C0305() {
        this(C0301.f810, null);
        this.f824 = C0311.m1198(BigInteger.ONE, this.f823.f816);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0306 m1181() {
        C0301 c0301 = this.f823;
        return new C0306(C0303.m1179(c0301.f817, this.f824, c0301.f816, c0301.f813, c0301.f815), c0301);
    }

    public C0305(C0301 c0301, BigInteger bigInteger) {
        this.f823 = c0301;
        this.f824 = bigInteger;
    }
}
