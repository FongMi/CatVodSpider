package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.oZP;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
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
        if ((this.d instanceof c) || !str.equals(oZP.d("560B1822182C050A"))) {
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

    @Override // com.github.catvod.spider.merge.L.s
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.L.s
    public String c(String str) {
        return !(this.d instanceof c) ? s().equals(str) ? (String) this.d : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.L.s
    public final c d() {
        J();
        return (c) this.d;
    }

    @Override // com.github.catvod.spider.merge.L.s
    public String e() {
        s sVar = this.a;
        return sVar != null ? sVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.L.s
    public int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final s j(s sVar) {
        q qVar = (q) super.j(sVar);
        Object obj = this.d;
        if (obj instanceof c) {
            qVar.d = ((c) obj).clone();
        }
        return qVar;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final void k(String str) {
    }

    @Override // com.github.catvod.spider.merge.L.s
    public s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final List<s> m() {
        return s.c;
    }

    @Override // com.github.catvod.spider.merge.L.s
    protected final boolean o() {
        return this.d instanceof c;
    }
}
