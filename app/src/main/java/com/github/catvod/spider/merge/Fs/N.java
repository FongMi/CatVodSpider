package com.github.catvod.spider.merge.Fs;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class N extends O {
    protected String b;
    protected String c;
    private String d;
    private String f;
    com.github.catvod.spider.merge.Em.c j;
    private StringBuilder e = new StringBuilder();
    private boolean g = false;
    private boolean h = false;
    boolean i = false;

    N() {
    }

    private void p() {
        this.h = true;
        String str = this.f;
        if (str != null) {
            this.e.append(str);
            this.f = null;
        }
    }

    final void i(char c) {
        String strValueOf = String.valueOf(c);
        String str = this.d;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.d = strValueOf;
    }

    final void j(String str) {
        String str2 = this.d;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.d = str;
    }

    final void k(char c) {
        p();
        this.e.append(c);
    }

    final void l(String str) {
        p();
        if (this.e.length() == 0) {
            this.f = str;
        } else {
            this.e.append(str);
        }
    }

    final void m(int[] iArr) {
        p();
        for (int i : iArr) {
            this.e.appendCodePoint(i);
        }
    }

    final void n(char c) {
        o(String.valueOf(c));
    }

    final void o(String str) {
        String str2 = this.b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.b = str;
        this.c = com.github.catvod.spider.merge.Dw.s.c(str);
    }

    final void q() {
        if (this.d != null) {
            u();
        }
    }

    final boolean r() {
        return this.j != null;
    }

    final N s(String str) {
        this.b = str;
        this.c = com.github.catvod.spider.merge.Dw.s.c(str);
        return this;
    }

    final String t() {
        String str = this.b;
        com.github.catvod.spider.merge.Dw.i.e(str == null || str.length() == 0);
        return this.b;
    }

    final void u() {
        if (this.j == null) {
            this.j = new com.github.catvod.spider.merge.Em.c();
        }
        String str = this.d;
        if (str != null) {
            String strTrim = str.trim();
            this.d = strTrim;
            if (strTrim.length() > 0) {
                this.j.d(this.d, this.h ? this.e.length() > 0 ? this.e.toString() : this.f : this.g ? "" : null);
            }
        }
        this.d = null;
        this.g = false;
        this.h = false;
        O.h(this.e);
        this.f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.Fs.O
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public N g() {
        this.b = null;
        this.c = null;
        this.d = null;
        O.h(this.e);
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        return this;
    }

    final void w() {
        this.g = true;
    }

    final String x() {
        String str = this.b;
        return str != null ? str : "[unset]";
    }
}
