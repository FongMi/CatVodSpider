package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r2 {
    static boolean a(Object obj, Object obj2) {
        n2 n2VarZ = p2.Z(obj);
        if (obj2 instanceof w2) {
            return p2.b0(obj).n((w2) obj2, n2VarZ);
        }
        C1153k2 c1153k2Z1 = C1157l2.z1(obj2);
        String str = c1153k2Z1.a;
        return str == null ? n2VarZ.z(c1153k2Z1.b, n2VarZ) : n2VarZ.x(str, n2VarZ);
    }

    static void b(C1185v c1185v, Object obj, int i) {
        int i2;
        p2 p2VarA0 = p2.a0(obj);
        p2VarA0.G0();
        Object[] objArrO0 = p2VarA0.o0(true, true);
        int length = objArrO0.length;
        while (i2 < length) {
            Object obj2 = objArrO0[i2];
            p2 p2VarQ0 = p2VarA0.q0(c1185v, obj2);
            if (i == 2) {
                i2 = Boolean.TRUE.equals(p2VarQ0.get("configurable")) ? 0 : i2 + 1;
            } else {
                if (p2.A0(p2VarQ0) && Boolean.TRUE.equals(p2VarQ0.get("writable"))) {
                    p2VarQ0.v("writable", p2VarQ0, Boolean.FALSE);
                }
                if (Boolean.TRUE.equals(p2VarQ0.get("configurable"))) {
                }
                p2VarA0.T(c1185v, obj2, p2VarQ0, false);
            }
            p2VarQ0.v("configurable", p2VarQ0, Boolean.FALSE);
            p2VarA0.T(c1185v, obj2, p2VarQ0, false);
        }
    }

    static boolean c(C1185v c1185v, Object obj, int i) {
        p2 p2VarA0 = p2.a0(obj);
        if (p2VarA0.B0()) {
            return false;
        }
        for (Object obj2 : p2VarA0.o0(true, true)) {
            p2 p2VarQ0 = p2VarA0.q0(c1185v, obj2);
            Boolean bool = Boolean.TRUE;
            if (bool.equals(p2VarQ0.get("configurable"))) {
                return false;
            }
            if (i == 1 && p2.A0(p2VarQ0) && bool.equals(p2VarQ0.get("writable"))) {
                return false;
            }
        }
        return true;
    }
}
