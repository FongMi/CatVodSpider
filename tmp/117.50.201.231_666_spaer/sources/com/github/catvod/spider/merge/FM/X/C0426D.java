package com.github.catvod.spider.merge.FM.x;

import com.github.catvod.spider.merge.FM.L.P;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.x.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0426D implements com.github.catvod.spider.merge.FM.B.e {
    public static final y c = new y();
    public C0426D a;
    public int b;

    public C0426D() {
        this.b = -1;
    }

    public C0426D(C0426D c0426d, int i) {
        this.a = c0426d;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
    public <T> T b(com.github.catvod.spider.merge.FM.B.d<? extends T> dVar) {
        return dVar.g(this);
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
    public com.github.catvod.spider.merge.FM.B.b c(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
    public int d() {
        throw null;
    }

    public int e() {
        return -1;
    }

    public final boolean f() {
        return this.b == -1;
    }

    @Override // com.github.catvod.spider.merge.FM.B.b
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
        StringBuilder sbB = P.b("[");
        for (C0426D c0426d = this; c0426d != null; c0426d = c0426d.a) {
            if (!c0426d.f()) {
                sbB.append(c0426d.b);
            }
            C0426D c0426d2 = c0426d.a;
            if (c0426d2 != null && !c0426d2.f()) {
                sbB.append(" ");
            }
        }
        sbB.append("]");
        return sbB.toString();
    }
}
