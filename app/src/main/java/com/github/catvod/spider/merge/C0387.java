package com.github.catvod.spider.merge;

import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡥ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0387 extends C0393 {

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private final int f956;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final C0407 f957;

    public C0387(AbstractC0386 abstractC0386, InterfaceC0317 interfaceC0317, int i, C0407 c0407) {
        super(abstractC0386, interfaceC0317, null);
        this.f956 = i;
        this.f957 = c0407;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String strM1445;
        int i = this.f956;
        if (i < 0 || i >= m1485().size()) {
            strM1445 = "";
        } else {
            InterfaceC0317 interfaceC0317M1485 = m1485();
            int i2 = this.f956;
            strM1445 = C0376.m1445(interfaceC0317M1485.mo1227(C0125.m418(i2, i2)), false);
        }
        return String.format(Locale.getDefault(), SOY.d("5F21795151045D7B"), C0387.class.getSimpleName(), strM1445);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public InterfaceC0317 m1485() {
        return (InterfaceC0317) super.m1524();
    }
}
