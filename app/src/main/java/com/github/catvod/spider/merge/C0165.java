package com.github.catvod.spider.merge;

import java.io.StringReader;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ͱ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0165 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private AbstractC0538 f404;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private C0180 f405 = C0180.m640();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private C0435 f406;

    public C0165(AbstractC0538 abstractC0538) {
        this.f404 = abstractC0538;
        this.f406 = abstractC0538.mo1272();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static C0165 m579() {
        return new C0165(new C0332());
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static C0035 m580(String str, String str2) {
        C0332 c0332 = new C0332();
        return c0332.m1734(new StringReader(str), str2, new C0165(c0332));
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0180 m581() {
        return this.f405;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public AbstractC0538 m582() {
        return this.f404;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public boolean m583(String str) {
        return m582().mo1274(str);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public C0435 m584() {
        return this.f406;
    }
}
