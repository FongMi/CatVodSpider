package com.github.catvod.spider.merge.f1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class F0 extends AbstractC1106W {
    private m2 j;

    private F0() {
    }

    static void p1(n2 n2Var) {
        new F0().Y0(15, n2Var, false);
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "CallSite";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W, com.github.catvod.spider.merge.f1.InterfaceC1103T
    public final Object c(C1104U c1104u, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        int i;
        if (!c1104u.H1("CallSite")) {
            throw c1104u.L1();
        }
        int iK1 = c1104u.K1();
        switch (iK1) {
            case 1:
                F0 f0 = new F0();
                n2 n2Var3 = (n2) c1104u.l("prototype", c1104u);
                f0.D(n2Var);
                f0.E(n2Var3);
                return f0;
            case 2:
            case 3:
            case 4:
            case 9:
                return G2.b;
            case 5:
                while (n2Var2 != null && !(n2Var2 instanceof F0)) {
                    n2Var2 = n2Var2.C();
                }
                if (n2Var2 == null) {
                    return I2.c;
                }
                m2 m2Var = ((F0) n2Var2).j;
                return m2Var != null ? m2Var.c : null;
            case 6:
                return null;
            case 7:
                while (n2Var2 != null && !(n2Var2 instanceof F0)) {
                    n2Var2 = n2Var2.C();
                }
                if (n2Var2 == null) {
                    return I2.c;
                }
                m2 m2Var2 = ((F0) n2Var2).j;
                return m2Var2 != null ? m2Var2.b : null;
            case 8:
                while (n2Var2 != null && !(n2Var2 instanceof F0)) {
                    n2Var2 = n2Var2.C();
                }
                if (n2Var2 == null) {
                    return I2.c;
                }
                m2 m2Var3 = ((F0) n2Var2).j;
                return (m2Var3 == null || (i = m2Var3.d) < 0) ? G2.b : Integer.valueOf(i);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return Boolean.FALSE;
            case 15:
                while (n2Var2 != null && !(n2Var2 instanceof F0)) {
                    n2Var2 = n2Var2.C();
                }
                if (n2Var2 == null) {
                    return I2.c;
                }
                StringBuilder sb = new StringBuilder();
                ((F0) n2Var2).j.b(sb);
                return sb.toString();
            default:
                throw new IllegalArgumentException(String.valueOf(iK1));
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final int c1(String str) {
        str.getClass();
        switch (str) {
            case "toString":
                return 15;
            case "isToplevel":
                return 11;
            case "constructor":
                return 1;
            case "isEval":
                return 12;
            case "getMethodName":
                return 6;
            case "getFunction":
                return 4;
            case "getLineNumber":
                return 8;
            case "getEvalOrigin":
                return 10;
            case "isNative":
                return 13;
            case "getThis":
                return 2;
            case "getColumnNumber":
                return 9;
            case "isConstructor":
                return 14;
            case "getFileName":
                return 7;
            case "getTypeName":
                return 3;
            case "getFunctionName":
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.github.catvod.spider.merge.f1.AbstractC1106W
    protected final void h1(int i) {
        String str;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                str = "getThis";
                break;
            case 3:
                str = "getTypeName";
                break;
            case 4:
                str = "getFunction";
                break;
            case 5:
                str = "getFunctionName";
                break;
            case 6:
                str = "getMethodName";
                break;
            case 7:
                str = "getFileName";
                break;
            case 8:
                str = "getLineNumber";
                break;
            case 9:
                str = "getColumnNumber";
                break;
            case 10:
                str = "getEvalOrigin";
                break;
            case 11:
                str = "isToplevel";
                break;
            case 12:
                str = "isEval";
                break;
            case 13:
                str = "isNative";
                break;
            case 14:
                str = "isConstructor";
                break;
            case 15:
                str = "toString";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
        j1("CallSite", i, str, 0);
    }

    final void q1(m2 m2Var) {
        this.j = m2Var;
    }

    public final String toString() {
        m2 m2Var = this.j;
        return m2Var == null ? "" : m2Var.toString();
    }
}
