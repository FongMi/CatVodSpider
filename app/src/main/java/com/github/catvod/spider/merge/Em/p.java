package com.github.catvod.spider.merge.Em;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class p extends r {
    Object f;

    p() {
    }

    private void J() {
        Object obj = this.f;
        if (obj instanceof c) {
            return;
        }
        c cVar = new c();
        this.f = cVar;
        if (obj != null) {
            cVar.t(t(), (String) obj);
        }
    }

    final String I() {
        return c(t());
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public r b(String str, String str2) {
        if ((this.f instanceof c) || !str.equals("#doctype")) {
            J();
            super.b(str, str2);
        } else {
            this.f = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public String c(String str) {
        com.github.catvod.spider.merge.Dw.i.k(str);
        return !(this.f instanceof c) ? str.equals(t()) ? (String) this.f : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public final c d() {
        J();
        return (c) this.f;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public String e() {
        r rVar = this.c;
        return rVar != null ? rVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final r k(r rVar) {
        p pVar = (p) super.k(rVar);
        Object obj = this.f;
        if (obj instanceof c) {
            pVar.f = ((c) obj).clone();
        }
        return pVar;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final void l(String str) {
    }

    @Override // com.github.catvod.spider.merge.Em.r
    public r m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final List<r> n() {
        return r.e;
    }

    @Override // com.github.catvod.spider.merge.Em.r
    protected final boolean p() {
        return this.f instanceof c;
    }
}
