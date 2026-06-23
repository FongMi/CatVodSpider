package com.github.catvod.spider.merge.FM.x;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0423A extends RuntimeException {
    private final AbstractC0425C<?, ?> a;
    private final y b;
    private final s c;
    private InterfaceC0427E d;
    private int e;

    public C0423A(AbstractC0425C<?, ?> abstractC0425C, s sVar, y yVar) {
        this.e = -1;
        this.a = abstractC0425C;
        this.c = sVar;
        this.b = yVar;
        if (abstractC0425C != null) {
            this.e = abstractC0425C.g();
        }
    }

    public final com.github.catvod.spider.merge.FM.A.k a() {
        AbstractC0425C<?, ?> abstractC0425C = this.a;
        if (abstractC0425C != null) {
            return abstractC0425C.d().c(this.e, this.b);
        }
        return null;
    }

    public final s b() {
        return this.c;
    }

    public final InterfaceC0427E c() {
        return this.d;
    }

    protected final void d(int i) {
        this.e = i;
    }

    protected final void e(InterfaceC0427E interfaceC0427E) {
        this.d = interfaceC0427E;
    }
}
