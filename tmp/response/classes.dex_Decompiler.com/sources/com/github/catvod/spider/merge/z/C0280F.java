package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0280F implements InterfaceC0277C {
    private final int a;

    public C0280F(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final void b(com.github.catvod.spider.merge.y.t tVar) {
        tVar.l = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0280F) && this.a == ((C0280F) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(0, 0), this.a), 2);
    }

    public final String toString() {
        return String.format(oZP.d("1607162F02301947522545"), Integer.valueOf(this.a));
    }
}
