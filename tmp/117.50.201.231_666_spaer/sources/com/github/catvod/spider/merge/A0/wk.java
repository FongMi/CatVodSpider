package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wk extends uz {
    public String c;
    public String d;
    public boolean e;
    public qh f;
    public String o;
    public final StringBuilder p;
    public boolean q;
    public String r;
    public final StringBuilder s;
    public boolean t;
    public boolean u;

    public wk(int i, zl zlVar) {
        super(i);
        this.e = false;
        this.p = new StringBuilder();
        this.q = false;
        this.s = new StringBuilder();
        this.t = false;
        this.u = false;
        zlVar.getClass();
    }

    public final void aa(int i, int i2) {
        this.t = true;
        String str = this.r;
        if (str != null) {
            this.s.append(str);
            this.r = null;
        }
    }

    public final void ab(String str) {
        this.c = str;
        this.d = qf.c(str.trim());
    }

    public final void ac() {
        String string;
        if (this.f == null) {
            this.f = new qh();
        }
        if (this.q && this.f.a < 512) {
            StringBuilder sb = this.p;
            String strTrim = (sb.length() > 0 ? sb.toString() : this.o).trim();
            if (strTrim.length() > 0) {
                if (this.t) {
                    StringBuilder sb2 = this.s;
                    string = sb2.length() > 0 ? sb2.toString() : this.r;
                } else {
                    string = this.u ? "" : null;
                }
                this.f.e(strTrim, string);
            }
        }
        ad();
    }

    public final void ad() {
        uz.h(this.p);
        this.o = null;
        this.q = false;
        uz.h(this.s);
        this.r = null;
        this.u = false;
        this.t = false;
    }

    @Override // com.github.catvod.spider.merge.A0.uz
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wk a() {
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        ad();
        return this;
    }

    public final void v(char c, int i, int i2) {
        aa(i, i2);
        this.s.append(c);
    }

    public final void w(String str, int i, int i2) {
        aa(i, i2);
        StringBuilder sb = this.s;
        if (sb.length() == 0) {
            this.r = str;
        } else {
            sb.append(str);
        }
    }

    public final void x(int[] iArr, int i, int i2) {
        aa(i, i2);
        for (int i3 : iArr) {
            this.s.appendCodePoint(i3);
        }
    }

    public final void y(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.c;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.c = strReplace;
        this.d = qf.c(strReplace.trim());
    }

    public final void z(int i, int i2) {
        this.q = true;
        String str = this.o;
        if (str != null) {
            this.p.append(str);
            this.o = null;
        }
    }
}
