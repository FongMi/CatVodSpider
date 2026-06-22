package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޤ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0329 implements InterfaceC0399<C0328> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final InterfaceC0399<C0328> f865 = new C0329();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected final boolean f866;

    public C0329(boolean z) {
        this.f866 = z;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0399
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0328 mo1262(C0123<InterfaceC0400, InterfaceC0317> c0123, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        InterfaceC0317 interfaceC0317;
        C0328 c0328 = new C0328(c0123, i, i2, i3, i4);
        c0328.m1259(i5);
        c0328.m1258(i6);
        if (str != null) {
            c0328.m1260(str);
        } else if (this.f866 && (interfaceC0317 = c0123.f310) != null) {
            c0328.m1260(interfaceC0317.mo1227(C0125.m418(i3, i4)));
        }
        return c0328;
    }

    public C0329() {
        this(false);
    }
}
