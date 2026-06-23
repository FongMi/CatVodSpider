package com.github.catvod.spider.merge.FM.y;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0457F implements InterfaceC0454C {
    private final int a;

    public C0457F(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.FM.y.InterfaceC0454C
    public final void b(com.github.catvod.spider.merge.FM.x.t tVar) {
        tVar.l = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0457F) && this.a == ((C0457F) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.FM.A.l.c(com.github.catvod.spider.merge.FM.A.l.i(com.github.catvod.spider.merge.FM.A.l.i(0, 0), this.a), 2);
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.a));
    }
}
