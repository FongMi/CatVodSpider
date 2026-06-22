package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class J extends Q {
    private String e;
    private final StringBuilder d = new StringBuilder();
    boolean f = false;

    J() {
        this.a = 4;
    }

    @Override // com.github.catvod.spider.merge.Mp.Q
    final Q h() {
        super.h();
        Q.i(this.d);
        this.e = null;
        this.f = false;
        return this;
    }

    final J k(char c) {
        String str = this.e;
        if (str != null) {
            this.d.append(str);
            this.e = null;
        }
        this.d.append(c);
        return this;
    }

    final J l(String str) {
        String str2 = this.e;
        if (str2 != null) {
            this.d.append(str2);
            this.e = null;
        }
        if (this.d.length() == 0) {
            this.e = str;
        } else {
            this.d.append(str);
        }
        return this;
    }

    final String m() {
        String str = this.e;
        return str != null ? str : this.d.toString();
    }

    public final String toString() {
        return com.github.catvod.spider.merge.bY.v.b(C0925t.b(ZrJ.d("45626660")), m(), ZrJ.d("546E75"));
    }
}
