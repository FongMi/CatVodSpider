package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class C0249D implements com.github.catvod.spider.merge.C.e {
    public static final y c = new y();
    public C0249D a;
    public int b;

    public C0249D() {
        this.b = -1;
    }

    public C0249D(C0249D c0249d, int i) {
        this.a = c0249d;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.C.b
    public <T> T b(com.github.catvod.spider.merge.C.d<? extends T> dVar) {
        return dVar.l(this);
    }

    @Override // com.github.catvod.spider.merge.C.b
    public com.github.catvod.spider.merge.C.b c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.C.b
    public int d() {
        throw null;
    }

    public int e() {
        return -1;
    }

    public final boolean f() {
        return this.b == -1;
    }

    @Override // com.github.catvod.spider.merge.C.b
    public final String getText() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(c(i).getText());
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("2E"));
        for (C0249D c0249d = this; c0249d != null; c0249d = c0249d.a) {
            if (!c0249d.f()) {
                sbC.append(c0249d.b);
            }
            C0249D c0249d2 = c0249d.a;
            if (c0249d2 != null && !c0249d2.f()) {
                sbC.append(oZP.d("55"));
            }
        }
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
