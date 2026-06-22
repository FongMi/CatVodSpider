package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class L implements C {
    private final int a;

    public L(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        int i = this.a;
        tVar.n.a(tVar.o);
        tVar.o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof L) && this.a == ((L) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(0, 5), this.a), 2);
    }

    public final String toString() {
        return String.format(ZrJ.d("09363825052A1D2663682C6C"), Integer.valueOf(this.a));
    }
}
