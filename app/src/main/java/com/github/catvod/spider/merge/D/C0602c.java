package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0602c implements X {
    public static final C0602c a = new C0602c();

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj instanceof LongAdder) {
            h0Var.l('{', "value", ((LongAdder) obj).longValue());
        } else {
            if (!(obj instanceof DoubleAdder)) {
                return;
            }
            double dDoubleValue = ((DoubleAdder) obj).doubleValue();
            h0Var.write(123);
            h0Var.j("value");
            h0Var.i(dDoubleValue, false);
        }
        h0Var.write(125);
    }
}
