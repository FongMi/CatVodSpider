package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0624z implements X {
    public static final C0624z b = new C0624z();
    private DecimalFormat a;

    public C0624z() {
        this.a = null;
    }

    public C0624z(String str) {
        this.a = new DecimalFormat(str);
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullNumberAsZero);
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
            h0Var.s();
            return;
        }
        DecimalFormat decimalFormat = this.a;
        if (decimalFormat == null) {
            h0Var.i(dDoubleValue, true);
        } else {
            h0Var.write(decimalFormat.format(dDoubleValue));
        }
    }
}
