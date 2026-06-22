package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class K extends Q {
    final StringBuilder d = new StringBuilder();
    String e = null;
    final StringBuilder f = new StringBuilder();
    final StringBuilder g = new StringBuilder();
    boolean h = false;

    K() {
        this.a = 1;
    }

    @Override // com.github.catvod.spider.merge.Mp.Q
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
        return com.github.catvod.spider.merge.bY.v.b(C0925t.b(ZrJ.d("45622F222B3100332E6D")), k(), ZrJ.d("47"));
    }
}
