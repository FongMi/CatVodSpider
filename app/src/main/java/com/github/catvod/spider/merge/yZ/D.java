package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class D implements com.github.catvod.spider.merge.cz.e {
    public static final y c = new y();
    public D a;
    public int b;

    public D() {
        this.b = -1;
    }

    public D(D d, int i) {
        this.a = d;
        this.b = i;
    }

    public <T> T b(com.github.catvod.spider.merge.cz.d<? extends T> dVar) {
        return (T) dVar.l(this);
    }

    public com.github.catvod.spider.merge.cz.b c(int i) {
        throw null;
    }

    public int d() {
        throw null;
    }

    public int e() {
        return -1;
    }

    public final boolean f() {
        return this.b == -1;
    }

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
        StringBuilder sbB = C0925t.b(ZrJ.d("22"));
        for (D d = this; d != null; d = d.a) {
            if (!d.f()) {
                sbB.append(d.b);
            }
            D d2 = d.a;
            if (d2 != null && !d2.f()) {
                sbB.append(ZrJ.d("59"));
            }
        }
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
