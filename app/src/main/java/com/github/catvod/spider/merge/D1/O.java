package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.c1.C0947c;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class O extends P {
    protected String d;
    protected String e;
    private String g;
    private String j;
    C0947c n;
    private final StringBuilder f = new StringBuilder();
    private boolean h = false;
    private final StringBuilder i = new StringBuilder();
    private boolean k = false;
    private boolean l = false;
    boolean m = false;

    O() {
    }

    private void r() {
        this.k = true;
        String str = this.j;
        if (str != null) {
            this.i.append(str);
            this.j = null;
        }
    }

    final String A() {
        String str = this.d;
        return str != null ? str : "[unset]";
    }

    final void k(char c) {
        this.h = true;
        String str = this.g;
        if (str != null) {
            this.f.append(str);
            this.g = null;
        }
        this.f.append(c);
    }

    final void l(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.h = true;
        String str2 = this.g;
        if (str2 != null) {
            this.f.append(str2);
            this.g = null;
        }
        if (this.f.length() == 0) {
            this.g = strReplace;
        } else {
            this.f.append(strReplace);
        }
    }

    final void m(char c) {
        r();
        this.i.append(c);
    }

    final void n(String str) {
        r();
        if (this.i.length() == 0) {
            this.j = str;
        } else {
            this.i.append(str);
        }
    }

    final void o(int[] iArr) {
        r();
        for (int i : iArr) {
            this.i.appendCodePoint(i);
        }
    }

    final void p(char c) {
        q(String.valueOf(c));
    }

    final void q(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.d;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.d = strReplace;
        this.e = C0972E.a(strReplace);
    }

    final void s() {
        if (this.h) {
            x();
        }
    }

    final boolean t(String str) {
        C0947c c0947c = this.n;
        return c0947c != null && c0947c.p(str);
    }

    final boolean u() {
        return this.n != null;
    }

    final O v(String str) {
        this.d = str;
        this.e = C0972E.a(str);
        return this;
    }

    final String w() {
        String str = this.d;
        C0899d.c(str == null || str.length() == 0);
        return this.d;
    }

    final void x() {
        if (this.n == null) {
            this.n = new C0947c();
        }
        if (this.h && this.n.size() < 512) {
            String strTrim = (this.f.length() > 0 ? this.f.toString() : this.g).trim();
            if (strTrim.length() > 0) {
                this.n.d(strTrim, this.k ? this.i.length() > 0 ? this.i.toString() : this.j : this.l ? "" : null);
            }
        }
        P.i(this.f);
        this.g = null;
        this.h = false;
        P.i(this.i);
        this.j = null;
        this.k = false;
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.d1.P
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public O h() {
        super.h();
        this.d = null;
        this.e = null;
        P.i(this.f);
        this.g = null;
        this.h = false;
        P.i(this.i);
        this.j = null;
        this.l = false;
        this.k = false;
        this.m = false;
        this.n = null;
        return this;
    }

    final void z() {
        this.l = true;
    }
}
