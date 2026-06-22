package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class M extends N {
    public String b;
    public String c;
    public String e;
    public String h;
    public com.github.catvod.spider.merge.L.c l;
    public final StringBuilder d = new StringBuilder();
    public boolean f = false;
    public final StringBuilder g = new StringBuilder();
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public final void h(char c) {
        this.i = true;
        String str = this.h;
        StringBuilder sb = this.g;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        sb.append(c);
    }

    public final void i(String str) {
        this.i = true;
        String str2 = this.h;
        StringBuilder sb = this.g;
        if (str2 != null) {
            sb.append(str2);
            this.h = null;
        }
        if (sb.length() == 0) {
            this.h = str;
        } else {
            sb.append(str);
        }
    }

    public final void j(int[] iArr) {
        this.i = true;
        String str = this.h;
        StringBuilder sb = this.g;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    public final void k(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.b;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.b = strReplace;
        this.c = com.github.catvod.spider.merge.R.f.a(strReplace.trim());
    }

    public final boolean l() {
        return this.l != null;
    }

    public final String m() {
        String str = this.b;
        if (str == null || str.length() == 0) {
            throw new com.github.catvod.spider.merge.J.c("Must be false");
        }
        return this.b;
    }

    public final void n(String str) {
        this.b = str;
        this.c = com.github.catvod.spider.merge.R.f.a(str.trim());
    }

    public final void o() {
        if (this.l == null) {
            this.l = new com.github.catvod.spider.merge.L.c();
        }
        boolean z = this.f;
        StringBuilder sb = this.g;
        StringBuilder sb2 = this.d;
        if (z && this.l.a < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.e).trim();
            if (strTrim.length() > 0) {
                this.l.a(strTrim, this.i ? sb.length() > 0 ? sb.toString() : this.h : this.j ? "" : null);
            }
        }
        N.g(sb2);
        this.e = null;
        this.f = false;
        N.g(sb);
        this.h = null;
        this.i = false;
        this.j = false;
    }

    @Override // com.github.catvod.spider.merge.M.N
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public M f() {
        this.b = null;
        this.c = null;
        N.g(this.d);
        this.e = null;
        this.f = false;
        N.g(this.g);
        this.h = null;
        this.j = false;
        this.i = false;
        this.k = false;
        this.l = null;
        return this;
    }
}
