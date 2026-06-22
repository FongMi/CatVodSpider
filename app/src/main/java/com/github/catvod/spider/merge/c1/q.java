package com.github.catvod.spider.merge.c1;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class q extends s {
    Object e;

    q() {
    }

    private void J() {
        Object obj = this.e;
        if (obj instanceof C0947c) {
            return;
        }
        C0947c c0947c = new C0947c();
        this.e = c0947c;
        if (obj != null) {
            c0947c.A(s(), (String) obj);
        }
    }

    public s H(String str, String str2) {
        if ((this.e instanceof C0947c) || !str.equals(s())) {
            J();
            d().B(t.a(this).g().b(str), str2);
        } else {
            this.e = str2;
        }
        return this;
    }

    final String I() {
        return c(s());
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public String a(String str) {
        J();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public String c(String str) {
        return !(this.e instanceof C0947c) ? s().equals(str) ? (String) this.e : "" : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final C0947c d() {
        J();
        return (C0947c) this.e;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public String e() {
        s sVar = this.b;
        return sVar != null ? sVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public int g() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final s j(s sVar) {
        q qVar = (q) super.j(sVar);
        Object obj = this.e;
        if (obj instanceof C0947c) {
            qVar.e = ((C0947c) obj).clone();
        }
        return qVar;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final void k(String str) {
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public s l() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final List<s> m() {
        return s.d;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public boolean n(String str) {
        J();
        return super.n("version");
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final boolean o() {
        return this.e instanceof C0947c;
    }
}
