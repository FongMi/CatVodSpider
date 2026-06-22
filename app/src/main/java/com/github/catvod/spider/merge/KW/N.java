package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N implements C {
    private final int a;

    public N(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        tVar.m = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof N) && this.a == ((N) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(0, 7), this.a), 2);
    }

    public final String toString() {
        return String.format(ZrJ.d("0D3A3B2860601D6A"), Integer.valueOf(this.a));
    }
}
