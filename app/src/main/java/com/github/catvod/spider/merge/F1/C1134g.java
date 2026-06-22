package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1134g extends s2 {
    transient InterfaceC1118c h;
    transient InterfaceC1130f i;

    C1134g(s2 s2Var) {
        super(s2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final InterfaceC1098N b(String str, n2 n2Var) {
        InterfaceC1118c interfaceC1118c = this.h;
        if (interfaceC1118c == null) {
            return null;
        }
        return interfaceC1118c.b(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final p2 c(C1185v c1185v, n2 n2Var) {
        p2 p2Var = (p2) c1185v.y(n2Var);
        p2Var.Q0(a(), this.h == null && this.i == null);
        Object obj = this.b;
        String string = obj == null ? "f" : obj.toString();
        InterfaceC1118c interfaceC1118c = this.h;
        if (interfaceC1118c != null) {
            Object objB = interfaceC1118c.b(string, n2Var);
            if (objB == null) {
                objB = G2.b;
            }
            p2Var.X("get", objB, 0);
        }
        InterfaceC1130f interfaceC1130f = this.i;
        if (interfaceC1130f != null) {
            Object objB2 = interfaceC1130f.b(string, n2Var);
            if (objB2 == null) {
                objB2 = G2.b;
            }
            p2Var.X("set", objB2, 0);
        }
        return p2Var;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    final InterfaceC1098N d(String str, n2 n2Var) {
        InterfaceC1130f interfaceC1130f = this.i;
        if (interfaceC1130f == null) {
            return null;
        }
        return interfaceC1130f.b(str, n2Var);
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    public final Object e(n2 n2Var) {
        InterfaceC1118c interfaceC1118c = this.h;
        return interfaceC1118c != null ? interfaceC1118c.a(n2Var) : this.e;
    }

    @Override // com.github.catvod.spider.merge.f1.s2
    public final boolean i(Object obj, n2 n2Var, n2 n2Var2, boolean z) {
        String string;
        InterfaceC1130f interfaceC1130f = this.i;
        if (interfaceC1130f != null) {
            interfaceC1130f.a(obj, n2Var2);
            return true;
        }
        if (this.h == null) {
            return super.i(obj, n2Var, n2Var2, z);
        }
        C1185v c1185vH = C1185v.h();
        if (!c1185vH.u() && !c1185vH.t(11)) {
            return true;
        }
        if (this.b != null) {
            StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("[");
            sbB.append(n2Var2.F());
            sbB.append("].");
            sbB.append(this.b);
            string = sbB.toString();
        } else {
            string = "";
        }
        throw C1157l2.C1("msg.set.prop.no.setter", string, C1157l2.x1(obj));
    }
}
