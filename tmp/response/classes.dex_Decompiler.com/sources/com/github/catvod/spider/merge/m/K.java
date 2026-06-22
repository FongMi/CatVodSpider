package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class K extends Q {
    final StringBuilder d = new StringBuilder();
    String e = null;
    final StringBuilder f = new StringBuilder();
    final StringBuilder g = new StringBuilder();
    boolean h = false;

    K() {
        this.a = 1;
    }

    @Override // com.github.catvod.spider.merge.M.Q
    final Q h() {
        super.h();
        Q.i(this.d);
        this.e = null;
        Q.i(this.f);
        Q.i(this.g);
        this.h = false;
        return this;
    }

    final String k() {
        return this.d.toString();
    }

    public final String toString() {
        return C0133t.a(C0133t.c(oZP.d("494E132E0F210C1F1261")), k(), oZP.d("4B"));
    }
}
