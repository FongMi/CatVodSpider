package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F implements C {
    private final int a;

    public F(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        tVar.l = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof F) && this.a == ((F) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(0, 0), this.a), 2);
    }

    public final String toString() {
        return String.format(ZrJ.d("1A2B2A232620156B6E2961"), Integer.valueOf(this.a));
    }
}
