package com.github.catvod.spider.merge.f1;

import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class I1 extends p2 {
    public static final /* synthetic */ int n = 0;
    private int i = 1;
    private Object j = null;
    private boolean k = false;
    private ArrayList<Object> l = new ArrayList<>();
    private ArrayList<Object> m = new ArrayList<>();

    /* JADX WARN: Finally extract failed */
    public static Object S0(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        E1 e1 = new E1(c1185v, n2Var, n2Var2);
        try {
            C1139h0 c1139h0 = new C1139h0(c1185v, n2Var, C1157l2.c(objArr.length > 0 ? objArr[0] : G2.b, c1185v, n2Var));
            C1135g0 c1135g0 = new C1135g0(c1139h0);
            try {
                try {
                    Object objY0 = Y0(c1185v, n2Var, c1135g0, n2Var2, e1);
                    if (c1135g0.b()) {
                        return objY0;
                    }
                    c1139h0.close();
                    return objY0;
                } catch (AbstractC1125d2 e) {
                    e1.e.b(c1185v, n2Var, G2.d, new Object[]{X0(c1185v, n2Var, e)});
                    return e1.a;
                }
            } catch (Throwable th) {
                if (!c1135g0.b()) {
                    c1139h0.close();
                }
                throw th;
            }
        } catch (AbstractC1125d2 e2) {
            e1.e.b(c1185v, n2Var, G2.d, new Object[]{X0(c1185v, n2Var, e2)});
        }
    }

    public static Object T0(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        if (C1157l2.f0(n2Var2)) {
            return Z0(c1185v, n2Var, n2Var2, objArr.length > 0 ? objArr[0] : G2.b);
        }
        throw C1157l2.C1("msg.arg.not.object", C1157l2.E1(n2Var2));
    }

    public static Object U0(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return W0(c1185v, n2Var, n2Var2, objArr, false);
    }

    public static Object V0(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        return W0(c1185v, n2Var, n2Var2, objArr, true);
    }

    private static Object W0(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr, boolean z) {
        E1 e1 = new E1(c1185v, n2Var, n2Var2);
        try {
            C1139h0 c1139h0 = new C1139h0(c1185v, n2Var, C1157l2.c(objArr.length > 0 ? objArr[0] : G2.b, c1185v, n2Var));
            C1135g0 c1135g0 = new C1135g0(c1139h0);
            try {
                try {
                    return new G1(c1135g0, n2Var2, e1, z).b(c1185v, n2Var);
                } finally {
                    if (!c1135g0.b()) {
                        c1139h0.close();
                    }
                }
            } catch (AbstractC1125d2 e) {
                e1.e.b(c1185v, n2Var, G2.d, new Object[]{X0(c1185v, n2Var, e)});
                return e1.a;
            }
        } catch (AbstractC1125d2 e2) {
            e1.e.b(c1185v, n2Var, G2.d, new Object[]{X0(c1185v, n2Var, e2)});
        }
    }

    private static Object X0(C1185v c1185v, n2 n2Var, AbstractC1125d2 abstractC1125d2) {
        if (abstractC1125d2 instanceof C1155l0) {
            return ((C1155l0) abstractC1125d2).k();
        }
        C2 c2 = C2.Error;
        if (abstractC1125d2 instanceof C1089E) {
            String strL = ((C1089E) abstractC1125d2).l();
            strL.getClass();
            switch (strL) {
                case "TypeError":
                    c2 = C2.TypeError;
                    break;
                case "InternalError":
                    c2 = C2.InternalError;
                    break;
                case "EvalError":
                    c2 = C2.EvalError;
                    break;
                case "JavaException":
                    c2 = C2.JavaException;
                    break;
                case "URIError":
                    c2 = C2.URIError;
                    break;
                case "RangeError":
                    c2 = C2.RangeError;
                    break;
                case "ReferenceError":
                    c2 = C2.ReferenceError;
                    break;
                case "SyntaxError":
                    c2 = C2.SyntaxError;
                    break;
            }
        }
        return C1157l2.z0(c1185v, n2Var, c2, new Object[]{abstractC1125d2.getMessage()});
    }

    private static Object Y0(C1185v c1185v, n2 n2Var, C1135g0 c1135g0, n2 n2Var2, E1 e1) {
        InterfaceC1161n interfaceC1161nV = C1157l2.V(n2Var2, "resolve", c1185v, n2Var);
        n2 n2Var3 = c1185v.v;
        c1185v.v = null;
        while (true) {
            Object next = G2.b;
            try {
                boolean zHasNext = c1135g0.hasNext();
                if (zHasNext) {
                    next = c1135g0.next();
                }
                if (!zHasNext) {
                    return e1.a;
                }
                InterfaceC1161n interfaceC1161nV2 = C1157l2.V(interfaceC1161nV.b(c1185v, n2Var, n2Var3, new Object[]{next}), "then", c1185v, n2Var);
                n2 n2Var4 = c1185v.v;
                c1185v.v = null;
                interfaceC1161nV2.b(c1185v, n2Var, n2Var4, new Object[]{e1.c, e1.e});
            } catch (Throwable th) {
                c1135g0.c();
                throw th;
            }
        }
    }

    private static Object Z0(C1185v c1185v, n2 n2Var, Object obj, Object obj2) {
        if ((obj2 instanceof I1) && C1157l2.T(obj2, "constructor", c1185v, n2Var) == obj) {
            return obj2;
        }
        E1 e1 = new E1(c1185v, n2Var, obj);
        e1.c.b(c1185v, n2Var, G2.d, new Object[]{obj2});
        return e1.a;
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "Promise";
    }
}
