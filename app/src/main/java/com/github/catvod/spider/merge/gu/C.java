package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Lc.b;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C implements com.github.catvod.spider.merge.Lc.e {
    public static final x c = new x();
    public C a;
    public int b;

    public C() {
        this.b = -1;
    }

    public C(C c2, int i) {
        this.a = c2;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public b b(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public final String c() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(b(i).c());
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public int d() {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public <T> T e(com.github.catvod.spider.merge.Lc.d<? extends T> dVar) {
        return (T) dVar.A(this);
    }

    public int f() {
        return -1;
    }

    public final boolean g() {
        return this.b == -1;
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("[");
        for (C c2 = this; c2 != null; c2 = c2.a) {
            if (!c2.g()) {
                sbB.append(c2.b);
            }
            C c3 = c2.a;
            if (c3 != null && !c3.g()) {
                sbB.append(" ");
            }
        }
        sbB.append("]");
        return sbB.toString();
    }
}
