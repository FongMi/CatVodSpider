package com.github.catvod.spider.merge.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0246A extends RuntimeException {
    private final AbstractC0248C<?, ?> a;
    private final y b;
    private final s c;
    private InterfaceC0250E d;
    private int e;

    public C0246A(AbstractC0248C<?, ?> abstractC0248C, s sVar, y yVar) {
        this.e = -1;
        this.a = abstractC0248C;
        this.c = sVar;
        this.b = yVar;
        if (abstractC0248C != null) {
            this.e = abstractC0248C.g();
        }
    }

    public final com.github.catvod.spider.merge.B.k a() {
        AbstractC0248C<?, ?> abstractC0248C = this.a;
        if (abstractC0248C != null) {
            return abstractC0248C.d().c(this.e, this.b);
        }
        return null;
    }

    public final s b() {
        return this.c;
    }

    public final InterfaceC0250E c() {
        return this.d;
    }

    protected final void d(int i) {
        this.e = i;
    }

    protected final void e(InterfaceC0250E interfaceC0250E) {
        this.d = interfaceC0250E;
    }
}
