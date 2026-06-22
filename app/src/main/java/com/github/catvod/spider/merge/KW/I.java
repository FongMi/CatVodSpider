package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I implements C {
    private final int a;

    public I(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.KW.C
    public final void b(com.github.catvod.spider.merge.yZ.t tVar) {
        tVar.o = this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof I) && this.a == ((I) obj).a;
    }

    public final int hashCode() {
        return com.github.catvod.spider.merge.Bk.l.b(com.github.catvod.spider.merge.Bk.l.f(com.github.catvod.spider.merge.Bk.l.f(0, 2), this.a), 2);
    }

    public final String toString() {
        return String.format(ZrJ.d("142C2F2860601D6A"), Integer.valueOf(this.a));
    }
}
