package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.j1.C1276a;
import com.github.catvod.spider.merge.j1.C1277b;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1112a1 extends p2 {
    private C1112a1() {
    }

    public static Object S0(C1185v c1185v, n2 n2Var, Object[] objArr) {
        String strY1 = C1157l2.y1(objArr);
        Object obj = objArr.length > 1 ? objArr[1] : null;
        if (!(obj instanceof InterfaceC1161n)) {
            return W0(c1185v, n2Var, strY1);
        }
        Object objW0 = W0(c1185v, n2Var, strY1);
        n2 n2VarY = c1185v.y(n2Var);
        n2 n2Var2 = (AbstractC1106W) n2VarY;
        n2Var2.v("", n2Var2, objW0);
        return Z0(c1185v, n2Var, (InterfaceC1161n) obj, n2VarY, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[PHI: r1
      0x001a: PHI (r1v1 java.lang.Object) = (r1v0 java.lang.Object), (r1v3 java.lang.Object) binds: [B:3:0x0007, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object T0(com.github.catvod.spider.merge.f1.C1185v r16, com.github.catvod.spider.merge.f1.n2 r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1112a1.T0(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }

    static void U0(n2 n2Var) {
        C1112a1 c1112a1 = new C1112a1();
        c1112a1.E(p2.p0(n2Var));
        c1112a1.D(n2Var);
        c1112a1.U(n2Var, "parse", 2, Y0.c);
        c1112a1.U(n2Var, "stringify", 3, X0.c);
        c1112a1.X("toSource", "JSON", 7);
        c1112a1.W(x2.d, "JSON", 3);
        p2.V(n2Var, "JSON", c1112a1, 2);
    }

    private static String V0(Collection<Object> collection, String str) {
        if (collection.isEmpty()) {
            return "";
        }
        Iterator<Object> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(it.next().toString());
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }

    private static Object W0(C1185v c1185v, n2 n2Var, String str) {
        try {
            return new C1277b(c1185v, n2Var).e(str);
        } catch (C1276a e) {
            throw C1157l2.j("SyntaxError", e.getMessage());
        }
    }

    private static String X0(String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt == '\r') {
                str2 = "\\r";
            } else if (cCharAt == '\"') {
                str2 = "\\\"";
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        str2 = "\\b";
                        break;
                    case '\t':
                        str2 = "\\t";
                        break;
                    case '\n':
                        str2 = "\\n";
                        break;
                    default:
                        if (cCharAt < ' ') {
                            sb.append("\\u");
                            str2 = String.format("%04x", Integer.valueOf(cCharAt));
                        } else {
                            sb.append(cCharAt);
                        }
                        break;
                }
            } else {
                str2 = "\\\\";
            }
            sb.append(str2);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object Y0(java.lang.Object r12, com.github.catvod.spider.merge.f1.n2 r13, com.github.catvod.spider.merge.f1.Z0 r14) {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1112a1.Y0(java.lang.Object, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.Z0):java.lang.Object");
    }

    private static Object Z0(C1185v c1185v, n2 n2Var, InterfaceC1161n interfaceC1161n, n2 n2Var2, Object obj) {
        Object objW = obj instanceof Number ? n2Var2.w(((Number) obj).intValue(), n2Var2) : n2Var2.l((String) obj, n2Var2);
        if (objW instanceof n2) {
            n2 n2Var3 = (n2) objW;
            if (n2Var3 instanceof B0) {
                long jA1 = ((B0) n2Var3).A1();
                for (long j = 0; j < jA1; j++) {
                    if (j > 2147483647L) {
                        String string = Long.toString(j);
                        Object objZ0 = Z0(c1185v, n2Var, interfaceC1161n, n2Var3, string);
                        if (objZ0 == G2.b) {
                            n2Var3.delete(string);
                        } else {
                            n2Var3.v(string, n2Var3, objZ0);
                        }
                    } else {
                        int i = (int) j;
                        Object objZ02 = Z0(c1185v, n2Var, interfaceC1161n, n2Var3, Integer.valueOf(i));
                        if (objZ02 == G2.b) {
                            n2Var3.p(i);
                        } else {
                            n2Var3.t(i, n2Var3, objZ02);
                        }
                    }
                }
            } else {
                for (Object obj2 : n2Var3.u()) {
                    Object objZ03 = Z0(c1185v, n2Var, interfaceC1161n, n2Var3, obj2);
                    if (objZ03 == G2.b) {
                        if (obj2 instanceof Number) {
                            n2Var3.p(((Number) obj2).intValue());
                        } else {
                            n2Var3.delete((String) obj2);
                        }
                    } else if (obj2 instanceof Number) {
                        n2Var3.t(((Number) obj2).intValue(), n2Var3, objZ03);
                    } else {
                        n2Var3.v((String) obj2, n2Var3, objZ03);
                    }
                }
            }
        }
        return interfaceC1161n.b(c1185v, n2Var, n2Var2, new Object[]{obj, objW});
    }

    @Override // com.github.catvod.spider.merge.f1.p2, com.github.catvod.spider.merge.f1.n2
    public final String F() {
        return "JSON";
    }
}
