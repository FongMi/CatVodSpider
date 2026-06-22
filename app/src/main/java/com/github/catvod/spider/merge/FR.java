package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class FR extends A0 {
    Object b;

    FR() {
    }

    private void f() {
        if (E9()) {
            return;
        }
        Object obj = this.b;
        Rz rz = new Rz();
        this.b = rz;
        if (obj != null) {
            rz.W(Q(), (String) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: DL, reason: merged with bridge method [inline-methods] */
    public FR A(A0 a0) {
        FR fr = (FR) super.A(a0);
        if (E9()) {
            fr.b = ((Rz) this.b).clone();
        }
        return fr;
    }

    @Override // com.github.catvod.spider.merge.A0
    protected final boolean E9() {
        return this.b instanceof Rz;
    }

    @Override // com.github.catvod.spider.merge.A0
    public int HM() {
        return 0;
    }

    String Lw() {
        return T4(Q());
    }

    @Override // com.github.catvod.spider.merge.A0
    public final Rz OL() {
        f();
        return (Rz) this.b;
    }

    @Override // com.github.catvod.spider.merge.A0
    public String T4(String str) {
        Rc.HM(str);
        return !E9() ? str.equals(Q()) ? (String) this.b : "" : super.T4(str);
    }

    @Override // com.github.catvod.spider.merge.A0
    public A0 b(String str, String str2) {
        if (E9() || !str.equals(Q())) {
            f();
            super.b(str, str2);
        } else {
            this.b = str2;
        }
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0
    protected void cD(String str) {
    }

    @Override // com.github.catvod.spider.merge.A0
    protected List<A0> hR() {
        return A0.l8;
    }

    @Override // com.github.catvod.spider.merge.A0
    public String l() {
        return uS() ? G().l() : "";
    }

    @Override // com.github.catvod.spider.merge.A0
    public String l8(String str) {
        f();
        return super.l8(str);
    }

    @Override // com.github.catvod.spider.merge.A0
    public A0 s() {
        return this;
    }
}
