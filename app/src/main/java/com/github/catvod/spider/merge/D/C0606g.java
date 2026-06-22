package com.github.catvod.spider.merge.D;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0606g implements X {
    private final Class<?> a;
    private final X b;

    public C0606g(Class<?> cls, X x) {
        this.a = cls;
        this.b = x;
    }

    @Override // com.github.catvod.spider.merge.D.X
    public final void d(L l, Object obj, Object obj2, Type type, int i) {
        h0 h0Var = l.j;
        if (obj == null) {
            h0Var.u(i0.WriteNullListAsEmpty);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        c0 c0Var = l.p;
        l.s(c0Var, obj, obj2);
        try {
            h0Var.write(91);
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 != 0) {
                    h0Var.write(44);
                }
                Object obj3 = objArr[i2];
                if (obj3 != null) {
                    (obj3.getClass() == this.a ? this.b : l.n(obj3.getClass())).d(l, obj3, Integer.valueOf(i2), null, 0);
                } else if (h0Var.g(i0.WriteNullStringAsEmpty) && (obj instanceof String[])) {
                    h0Var.v("");
                } else {
                    h0Var.b("null");
                }
            }
            h0Var.write(93);
        } finally {
            l.p = c0Var;
        }
    }
}
