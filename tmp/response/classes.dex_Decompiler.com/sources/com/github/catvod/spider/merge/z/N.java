package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class N implements InterfaceC0277C {
    private final int a;

    public N(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.z.InterfaceC0277C
    public final void b(com.github.catvod.spider.merge.y.t tVar) {
        tVar.m = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof N) && this.a == ((N) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.B.l.b(com.github.catvod.spider.merge.B.l.f(com.github.catvod.spider.merge.B.l.f(0, 7), this.a), 2);
    }

    public final String toString() {
        return String.format(oZP.d("0116072444701146"), Integer.valueOf(this.a));
    }
}
