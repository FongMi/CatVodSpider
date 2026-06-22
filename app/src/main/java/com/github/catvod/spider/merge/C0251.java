package com.github.catvod.spider.merge;

import java.util.Queue;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ڏ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0251 implements InterfaceC0465 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    String f642;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    C0250 f643;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    Queue<C0443> f644;

    public C0251(C0250 c0250, Queue<C0443> queue) {
        this.f643 = c0250;
        this.f642 = c0250.getName();
        this.f644 = queue;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private void m913(EnumC0582 enumC0582, InterfaceC0468 interfaceC0468, String str, Object[] objArr, Throwable th) {
        C0443 c0443 = new C0443();
        c0443.m1670(System.currentTimeMillis());
        c0443.m1663(enumC0582);
        c0443.m1664(this.f643);
        c0443.m1665(this.f642);
        c0443.m1666(interfaceC0468);
        c0443.m1667(str);
        c0443.m1668(Thread.currentThread().getName());
        c0443.m1662(objArr);
        c0443.m1669(th);
        this.f644.add(c0443);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m914(EnumC0582 enumC0582, InterfaceC0468 interfaceC0468, String str, Throwable th) {
        m913(enumC0582, interfaceC0468, str, null, th);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0465
    public String getName() {
        return this.f642;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0465
    /* JADX INFO: renamed from: Ϳ */
    public void mo906(String str, Throwable th) {
        m914(EnumC0582.f1284, null, str, th);
    }
}
