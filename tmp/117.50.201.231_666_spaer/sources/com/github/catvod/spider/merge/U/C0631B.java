package com.github.catvod.spider.merge.u;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0631B implements InterfaceC0654x {
    private final int a;
    private final int b;

    public C0631B(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final void a(com.github.catvod.spider.merge.t.q qVar) {
        qVar.getClass();
    }

    @Override // com.github.catvod.spider.merge.u.InterfaceC0654x
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0631B)) {
            return false;
        }
        C0631B c0631b = (C0631B) obj;
        return this.a == c0631b.a && this.b == c0631b.b;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.F.a.b(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(com.github.catvod.spider.merge.F.a.h(0, 1), this.a), this.b), 3);
    }
}
