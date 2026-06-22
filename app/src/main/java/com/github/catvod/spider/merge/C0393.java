package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡪ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0393 extends RuntimeException {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final AbstractC0394<?, ?> f976;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final C0396 f977;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final InterfaceC0385 f978;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private InterfaceC0398 f979;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private int f980;

    public C0393(AbstractC0394<?, ?> abstractC0394, InterfaceC0385 interfaceC0385, C0391 c0391) {
        this.f980 = -1;
        this.f976 = abstractC0394;
        this.f978 = interfaceC0385;
        this.f977 = c0391;
        if (abstractC0394 != null) {
            this.f980 = abstractC0394.m1532();
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0245 m1523() {
        AbstractC0394<?, ?> abstractC0394 = this.f976;
        if (abstractC0394 != null) {
            return abstractC0394.mo1348().m1547(this.f980, this.f977);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public InterfaceC0385 m1524() {
        return this.f978;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public InterfaceC0398 m1525() {
        return this.f979;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected final void m1526(int i) {
        this.f980 = i;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected final void m1527(InterfaceC0398 interfaceC0398) {
        this.f979 = interfaceC0398;
    }
}
