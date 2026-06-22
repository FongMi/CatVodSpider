package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class J extends Q {
    private String e;
    private final StringBuilder d = new StringBuilder();
    boolean f = false;

    J() {
        this.a = 4;
    }

    @Override // com.github.catvod.spider.merge.M.Q
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
        return C0133t.a(C0133t.c(oZP.d("494E5A6C")), m(), oZP.d("584249"));
    }
}
