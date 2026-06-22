package com.github.catvod.spider.merge.f1;

import java.util.EnumMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class D2 extends AbstractC1106W {
    private EnumMap<B2, C1150k> j;
    private EnumMap<C2, C1150k> k;

    public static InterfaceC1098N q1(C1185v c1185v, n2 n2Var) {
        B2 b2 = B2.Error;
        if (n2Var instanceof D2) {
            EnumMap<B2, C1150k> enumMap = ((D2) n2Var).j;
            C1150k c1150k = enumMap != null ? enumMap.get(b2) : null;
            if (c1150k != null) {
                return c1150k;
            }
        }
        return C1157l2.M(n2Var, "Error");
    }

    public static n2 r1(n2 n2Var, B2 b2) {
        if (n2Var instanceof D2) {
            EnumMap<B2, C1150k> enumMap = ((D2) n2Var).j;
            C1150k c1150k = enumMap != null ? enumMap.get(b2) : null;
            Object objV1 = c1150k != null ? c1150k.v1() : null;
            n2 n2Var2 = objV1 instanceof n2 ? (n2) objV1 : null;
            if (n2Var2 != null) {
                return n2Var2;
            }
        }
        return p2.k0(n2Var, b2 == B2.GeneratorFunction ? "__GeneratorFunction" : b2.name());
    }

    static InterfaceC1098N s1(C1185v c1185v, n2 n2Var, C2 c2) {
        if (n2Var instanceof D2) {
            EnumMap<C2, C1150k> enumMap = ((D2) n2Var).k;
            C1150k c1150k = enumMap != null ? enumMap.get(c2) : null;
            if (c1150k != null) {
                return c1150k;
            }
        }
        return C1157l2.M(n2Var, c2.name());
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "global";
    }

    public final void p1(n2 n2Var) {
        this.j = new EnumMap<>(B2.class);
        for (B2 b2 : B2.values()) {
            Object objT0 = p2.t0(this, b2.name());
            if (objT0 instanceof C1150k) {
                this.j.put(b2, (C1150k) objT0);
            } else if (b2 == B2.GeneratorFunction) {
                this.j.put(b2, (C1150k) C1150k.x1(n2Var));
            }
        }
        this.k = new EnumMap<>(C2.class);
        for (C2 c2 : C2.values()) {
            Object objT02 = p2.t0(this, c2.name());
            if (objT02 instanceof C1150k) {
                this.k.put(c2, (C1150k) objT02);
            }
        }
    }
}
