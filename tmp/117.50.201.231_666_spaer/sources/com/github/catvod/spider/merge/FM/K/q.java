package com.github.catvod.spider.merge.FM.K;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class q extends s {
    Object d;

    q() {
    }

    private void J() {
        Object obj = this.d;
        if (obj instanceof c) {
            return;
        }
        c cVar = new c();
        this.d = cVar;
        if (obj != null) {
            cVar.w(s(), (String) obj);
        }
    }

    public s H(String str, String str2) {
        if ((this.d instanceof c) || !str.equals("#doctype")) {
            J();
            d().x(t.a(this).f().b(str), str2);
        } else {
            this.d = str2;
        }
        return this;
    }

    final String I() {
        return c(s());
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public String c(String str) {
        return !(this.d instanceof c) ? s().equals(str) ? (String) this.d : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public final c d() {
        J();
        return (c) this.d;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public String e() {
        s sVar = this.a;
        return sVar != null ? sVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final s j(s sVar) {
        q qVar = (q) super.j(sVar);
        Object obj = this.d;
        if (obj instanceof c) {
            qVar.d = ((c) obj).clone();
        }
        return qVar;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final void k(String str) {
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    public s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final List<s> m() {
        return s.c;
    }

    @Override // com.github.catvod.spider.merge.FM.K.s
    protected final boolean o() {
        return this.d instanceof c;
    }
}
