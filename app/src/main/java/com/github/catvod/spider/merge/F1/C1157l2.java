package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.k1.C1286e;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.l1.AbstractC1297c;
import com.github.catvod.spider.merge.l1.AbstractC1298d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1157l2 {
    public static final Class<?> a = C1162n0.b("java.lang.Boolean");
    public static final Class<?> b = C1162n0.b("java.lang.Byte");
    public static final Class<?> c = C1162n0.b("java.lang.Character");
    public static final Class<?> d = C1162n0.b("java.lang.Class");
    public static final Class<?> e = C1162n0.b("java.lang.Double");
    public static final Class<?> f = C1162n0.b("java.lang.Float");
    public static final Class<?> g = C1162n0.b("java.lang.Integer");
    public static final Class<?> h = C1162n0.b("java.lang.Long");
    public static final Class<?> i = C1162n0.b("java.lang.Number");
    public static final Class<?> j = C1162n0.b("java.lang.Object");
    public static final Class<?> k = C1162n0.b("java.lang.Short");
    public static final Class<?> l = C1162n0.b("java.lang.String");
    public static final Class<?> m = C1162n0.b("java.util.Date");
    public static final Class<?> n = C1162n0.b("java.math.BigInteger");
    public static final Class<?> o = C1162n0.b("org.mozilla.javascript.Context");
    public static final Class<?> p;
    public static final Class<?> q;
    public static final Class<n2> r;
    private static final String s;
    public static final Double t;
    public static final double u;
    public static final Double v;
    public static final Double w;
    public static final InterfaceC1145i2 x;
    public static final Object[] y;

    static {
        C1162n0.b("org.mozilla.javascript.ContextFactory");
        p = C1162n0.b("org.mozilla.javascript.Function");
        q = C1162n0.b("org.mozilla.javascript.ScriptableObject");
        r = n2.class;
        s = "LIBRARY_SCOPE";
        t = Double.valueOf(Double.NaN);
        u = Double.longBitsToDouble(Long.MIN_VALUE);
        v = Double.valueOf(0.0d);
        w = Double.valueOf(-0.0d);
        x = new C1137g2();
        y = new Object[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean A(double r5, java.lang.Object r7) {
        /*
        L0:
            r0 = 0
            if (r7 == 0) goto L7a
            boolean r1 = com.github.catvod.spider.merge.f1.G2.b(r7)
            if (r1 == 0) goto Lb
            goto L7a
        Lb:
            boolean r1 = r7 instanceof java.math.BigInteger
            if (r1 == 0) goto L16
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            boolean r5 = y(r7, r5)
            return r5
        L16:
            boolean r1 = r7 instanceof java.lang.Number
            r2 = 1
            if (r1 == 0) goto L27
            java.lang.Number r7 = (java.lang.Number) r7
            double r3 = r7.doubleValue()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L26
            r0 = 1
        L26:
            return r0
        L27:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L35
            double r3 = p1(r7)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L34
            r0 = 1
        L34:
            return r0
        L35:
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L4c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L44
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L46
        L44:
            r3 = 0
        L46:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L4b
            r0 = 1
        L4b:
            return r0
        L4c:
            boolean r1 = j0(r7)
            if (r1 == 0) goto L53
            return r0
        L53:
            boolean r1 = r7 instanceof com.github.catvod.spider.merge.f1.n2
            if (r1 == 0) goto L77
            boolean r0 = r7 instanceof com.github.catvod.spider.merge.f1.p2
            if (r0 == 0) goto L71
            java.lang.Number r0 = N1(r5)
            r1 = r7
            com.github.catvod.spider.merge.f1.p2 r1 = (com.github.catvod.spider.merge.f1.p2) r1
            java.lang.Object r0 = r1.c0(r0)
            com.github.catvod.spider.merge.f1.I2 r1 = com.github.catvod.spider.merge.f1.I2.c
            if (r0 == r1) goto L71
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            return r5
        L71:
            r0 = 0
            java.lang.Object r7 = v1(r7, r0)
            goto L0
        L77:
            L1(r7)
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.A(double, java.lang.Object):boolean");
    }

    public static n2 A0(Object[] objArr, Object[] objArr2, int[] iArr, C1185v c1185v, n2 n2Var) {
        n2 n2VarY = c1185v.y(n2Var);
        int length = objArr == null ? 0 : objArr.length;
        for (int i2 = 0; i2 != length; i2++) {
            Object obj = objArr[i2];
            int i3 = iArr == null ? 0 : iArr[i2];
            Object obj2 = objArr2[i2];
            if (i3 != 0) {
                p2 p2Var = (p2) n2VarY;
                InterfaceC1161n interfaceC1161n = (InterfaceC1161n) obj2;
                boolean z = i3 == 1;
                String str = obj instanceof String ? (String) obj : null;
                p2Var.R0(str, str == null ? ((Integer) obj).intValue() : 0, interfaceC1161n, z);
            } else if (obj instanceof w2) {
                ((y2) n2VarY).q((w2) obj, n2VarY, obj2);
            } else if (obj instanceof Integer) {
                n2 n2Var2 = (p2) n2VarY;
                n2Var2.t(((Integer) obj).intValue(), n2Var2, obj2);
            } else {
                String strX1 = x1(obj);
                if (h0(strX1)) {
                    v2.e(c1185v, n2Var, n2VarY, strX1).d(c1185v, n2Var, obj2);
                } else {
                    n2 n2Var3 = (AbstractC1106W) n2VarY;
                    n2Var3.v(strX1, n2Var3, obj2);
                }
            }
        }
        return n2VarY;
    }

    public static long A1(double d2) {
        return ((long) com.github.catvod.spider.merge.Q0.a.a(d2)) & 4294967295L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean B(java.lang.CharSequence r5, java.lang.Object r6) {
        /*
        L0:
            r0 = 0
            if (r6 == 0) goto La2
            boolean r1 = com.github.catvod.spider.merge.f1.G2.b(r6)
            if (r1 == 0) goto Lb
            goto La2
        Lb:
            boolean r1 = r6 instanceof java.lang.CharSequence
            r2 = 1
            if (r1 == 0) goto L2c
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r1 = r5.length()
            int r3 = r6.length()
            if (r1 != r3) goto L2b
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2b
            r0 = 1
        L2b:
            return r0
        L2c:
            boolean r1 = r6 instanceof java.math.BigInteger
            if (r1 == 0) goto L3a
            java.math.BigInteger r5 = e1(r5)     // Catch: com.github.catvod.spider.merge.f1.C1089E -> L39
            boolean r5 = r5.equals(r6)
            return r5
        L39:
            return r0
        L3a:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L52
            java.lang.String r5 = r5.toString()
            double r3 = q1(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            double r5 = r6.doubleValue()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L51
            r0 = 1
        L51:
            return r0
        L52:
            boolean r1 = r6 instanceof java.lang.Boolean
            if (r1 == 0) goto L71
            java.lang.String r5 = r5.toString()
            double r3 = q1(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L69
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L6b
        L69:
            r5 = 0
        L6b:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L70
            r0 = 1
        L70:
            return r0
        L71:
            boolean r1 = j0(r6)
            if (r1 == 0) goto L78
            return r0
        L78:
            boolean r1 = r6 instanceof com.github.catvod.spider.merge.f1.n2
            if (r1 == 0) goto L9f
            boolean r0 = r6 instanceof com.github.catvod.spider.merge.f1.p2
            if (r0 == 0) goto L98
            r0 = r6
            com.github.catvod.spider.merge.f1.p2 r0 = (com.github.catvod.spider.merge.f1.p2) r0
            java.lang.String r1 = r5.toString()
            java.lang.Object r0 = r0.c0(r1)
            int r1 = com.github.catvod.spider.merge.f1.n2.a
            com.github.catvod.spider.merge.f1.I2 r1 = com.github.catvod.spider.merge.f1.I2.c
            if (r0 == r1) goto L98
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            return r5
        L98:
            r0 = 0
            java.lang.Object r6 = v1(r6, r0)
            goto L0
        L9f:
            L1(r6)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.B(java.lang.CharSequence, java.lang.Object):boolean");
    }

    public static RuntimeException B0(String str) {
        throw j("ReferenceError", P("msg.is.not.defined", str));
    }

    private static Object B1(C1185v c1185v, n2 n2Var, String str) {
        if (c1185v.l) {
            n2Var = e(c1185v.c, n2Var);
        }
        return p2.t0(n2Var, str);
    }

    private static RuntimeException C(String str, Object obj) {
        return C1185v.H(str, obj.getClass().getName());
    }

    public static RuntimeException C0(Object obj) {
        return D0(obj, obj);
    }

    public static C1089E C1(String str, Object... objArr) {
        return j("TypeError", P(str, objArr));
    }

    public static String D(Object obj, C1185v c1185v) {
        return k(c1185v).a();
    }

    public static RuntimeException D0(Object obj, Object obj2) {
        String string = obj2 == null ? "null" : obj2.toString();
        int i2 = n2.a;
        return obj == I2.c ? C1("msg.function.not.found", string) : C1("msg.isnt.function", string, E1(obj));
    }

    public static C1150k D1(C1185v c1185v) {
        if (c1185v.f == null) {
            C1133f2 c1133f2 = new C1133f2();
            S0(c1133f2, c1185v.c, false);
            c1133f2.G0();
            c1185v.f = c1133f2;
        }
        return c1185v.f;
    }

    public static String E(String str) {
        return F(str, '\"');
    }

    public static RuntimeException E0(Object obj, Object obj2, String str) {
        int iIndexOf;
        String strX1 = x1(obj);
        if ((obj instanceof Q0) && (iIndexOf = strX1.indexOf(123, strX1.indexOf(41))) > -1) {
            strX1 = strX1.substring(0, iIndexOf + 1) + "...}";
        }
        return obj2 == I2.c ? C1("msg.function.not.found.in", str, strX1) : C1("msg.isnt.function.in", str, strX1, E1(obj2));
    }

    public static String E1(Object obj) {
        if (obj == null) {
            return "object";
        }
        if (obj == G2.b) {
            return "undefined";
        }
        if (obj instanceof C1086B) {
            return E1(((C1086B) obj).b);
        }
        if (obj instanceof p2) {
            return ((p2) obj).w0();
        }
        if (obj instanceof n2) {
            return obj instanceof InterfaceC1161n ? "function" : "object";
        }
        if (obj instanceof CharSequence) {
            return "string";
        }
        if (obj instanceof BigInteger) {
            return "bigint";
        }
        if (obj instanceof Number) {
            return "number";
        }
        if (obj instanceof Boolean) {
            return "boolean";
        }
        if (j0(obj)) {
            return "symbol";
        }
        throw C("msg.invalid.type", obj);
    }

    public static String F(String str, char c2) {
        int i2;
        char c3;
        StringBuilder sb = null;
        if (c2 != '\"' && c2 != '\'') {
            C1162n0.c();
            throw null;
        }
        int length = str.length();
        for (int i3 = 0; i3 != length; i3++) {
            char cCharAt = str.charAt(i3);
            int i4 = 32;
            if (' ' > cCharAt || cCharAt > '~' || cCharAt == c2 || cCharAt == '\\') {
                if (sb == null) {
                    sb = new StringBuilder(length + 3);
                    sb.append(str);
                    sb.setLength(i3);
                }
                if (cCharAt != ' ') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                i4 = 98;
                                break;
                            case '\t':
                                i4 = 116;
                                break;
                            case '\n':
                                i4 = 110;
                                break;
                            case 11:
                                i4 = 118;
                                break;
                            case '\f':
                                i4 = 102;
                                break;
                            case '\r':
                                i4 = 114;
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 92;
                    }
                }
                if (i4 >= 0) {
                    sb.append('\\');
                    c3 = (char) i4;
                    sb.append(c3);
                } else if (cCharAt == c2) {
                    sb.append('\\');
                    sb.append(c2);
                } else {
                    if (cCharAt < 256) {
                        sb.append("\\x");
                        i2 = 2;
                    } else {
                        sb.append("\\u");
                        i2 = 4;
                    }
                    for (int i5 = (i2 - 1) * 4; i5 >= 0; i5 -= 4) {
                        int i6 = (cCharAt >> i5) & 15;
                        sb.append((char) (i6 < 10 ? i6 + 48 : i6 + 87));
                    }
                }
            } else if (sb != null) {
                c3 = cCharAt;
                sb.append(c3);
            }
        }
        return sb == null ? str : sb.toString();
    }

    private static RuntimeException F0(Object obj) {
        throw C1("msg.isnt.xml.object", x1(obj));
    }

    public static String F1(n2 n2Var, String str) {
        C1185v c1185vH = C1185v.h();
        n2 n2VarB = b(c1185vH, n2Var, str);
        return n2VarB == null ? "undefined" : E1(S(n2VarB, str, c1185vH));
    }

    public static String G(Object obj, C1185v c1185v) {
        return k(c1185v).b();
    }

    public static String G0(double d2, int i2) {
        if (i2 < 2 || i2 > 36) {
            throw C1185v.H("msg.bad.radix", Integer.toString(i2));
        }
        if (Double.isNaN(d2)) {
            return "NaN";
        }
        if (d2 == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        if (d2 == Double.NEGATIVE_INFINITY) {
            return "-Infinity";
        }
        if (d2 == 0.0d) {
            return "0";
        }
        if (i2 != 10) {
            return C1194y.a(i2, d2);
        }
        String strA = C1286e.a(d2);
        if (strA != null) {
            return strA;
        }
        StringBuilder sb = new StringBuilder();
        C1194y.b(sb, 0, 0, d2);
        return sb.toString();
    }

    public static RuntimeException G1(Object obj, Object obj2) {
        return C1("msg.undef.method.call", x1(obj), x1(obj2));
    }

    public static Object H(C1185v c1185v, n2 n2Var, Object obj, Object[] objArr, String str, int i2) {
        if (objArr.length < 1) {
            return G2.b;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof CharSequence)) {
            if (c1185v.t(11) || c1185v.t(9)) {
                throw C1185v.H("msg.eval.nonstring.strict", new Object[0]);
            }
            C1185v.I(P("msg.eval.nonstring", new Object[0]));
            return obj2;
        }
        if (str == null) {
            int[] iArr = new int[1];
            String strP = C1185v.p(iArr);
            if (strP != null) {
                i2 = iArr[0];
                str = strP;
            } else {
                str = "";
            }
        }
        String strO0 = o0(true, str, i2);
        c1185v.getClass();
        InterfaceC1094J interfaceC1094JF = C1085A.f();
        InterfaceC1095K interfaceC1095KD = C1185v.d();
        if (interfaceC1095KD == null) {
            throw new C1155l0("Interpreter not present", str, i2);
        }
        InterfaceC1129e2 interfaceC1129e2C = c1185v.c(obj2.toString(), interfaceC1095KD, interfaceC1094JF, strO0, 1);
        interfaceC1095KD.b(interfaceC1129e2C);
        return ((InterfaceC1161n) interfaceC1129e2C).b(c1185v, n2Var, (n2) obj, y);
    }

    public static Object H0(Object obj, String str, C1185v c1185v, n2 n2Var, int i2) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw H1(obj, str);
        }
        n2 n2VarC = n2VarU1;
        do {
            Object objL = n2VarC.l(str, n2VarU1);
            int i3 = n2.a;
            if (objL != I2.c) {
                return o(n2VarC, str, n2VarU1, objL, i2);
            }
            n2VarC = n2VarC.C();
        } while (n2VarC != null);
        Double d2 = t;
        n2VarU1.v(str, n2VarU1, d2);
        return d2;
    }

    public static RuntimeException H1(Object obj, Object obj2) {
        return C1("msg.undef.prop.read", x1(obj), x1(obj2));
    }

    public static Number I(Number number, Number number2) {
        boolean z = number instanceof BigInteger;
        if (z && (number2 instanceof BigInteger)) {
            if (((BigInteger) number2).signum() == -1) {
                throw J0("msg.bigint.negative.exponent", new Object[0]);
            }
            try {
                return ((BigInteger) number).pow(((BigInteger) number2).intValueExact());
            } catch (ArithmeticException unused) {
                throw J0("msg.bigint.out.of.range.arithmetic", new Object[0]);
            }
        }
        if (z || (number2 instanceof BigInteger)) {
            throw C1("msg.cant.convert.to.number", "BigInt");
        }
        return Double.valueOf(Math.pow(number.doubleValue(), number2.doubleValue()));
    }

    public static C1089E I0(String str) {
        return j("RangeError", str);
    }

    public static RuntimeException I1(Object obj, Object obj2, Object obj3) {
        return C1("msg.undef.prop.write", x1(obj), x1(obj2), x1(obj3));
    }

    static Object[] J(C1185v c1185v, Object obj) {
        if (obj == null || G2.b(obj)) {
            return y;
        }
        if (obj instanceof n2) {
            n2 n2Var = (n2) obj;
            if ((n2Var instanceof B0) || (n2Var instanceof C1142i) || p2.y0(n2Var, "length")) {
                c1185v.getClass();
                long jB1 = B0.B1(C1185v.h(), n2Var);
                if (jB1 > 2147483647L) {
                    throw new IllegalArgumentException();
                }
                int i2 = (int) jB1;
                if (i2 == 0) {
                    return y;
                }
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objR0 = p2.r0(n2Var, i3);
                    if (objR0 == I2.c) {
                        objR0 = G2.b;
                    }
                    objArr[i3] = objR0;
                }
                return objArr;
            }
        }
        if (obj instanceof p2) {
            return y;
        }
        throw C1("msg.arg.isnt.array", new Object[0]);
    }

    public static C1089E J0(String str, Object... objArr) {
        return I0(P(str, objArr));
    }

    static String J1(C1185v c1185v, n2 n2Var, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (G2.b(obj)) {
            return "undefined";
        }
        if (obj instanceof CharSequence) {
            String strE = E(obj.toString());
            StringBuilder sb = new StringBuilder(strE.length() + 2);
            sb.append('\"');
            sb.append(strE);
            sb.append('\"');
            return sb.toString();
        }
        if (obj instanceof Number) {
            double dDoubleValue = ((Number) obj).doubleValue();
            return (dDoubleValue != 0.0d || 1.0d / dDoubleValue >= 0.0d) ? w1(dDoubleValue) : "-0";
        }
        if (obj instanceof Boolean) {
            return x1(obj);
        }
        if (!(obj instanceof n2)) {
            L1(obj);
            return obj.toString();
        }
        n2 n2Var2 = (n2) obj;
        if (p2.y0(n2Var2, "toSource")) {
            Object objT0 = p2.t0(n2Var2, "toSource");
            if (objT0 instanceof InterfaceC1098N) {
                return x1(((InterfaceC1098N) objT0).b(c1185v, n2Var, n2Var2, y));
            }
        }
        return x1(obj);
    }

    static InterfaceC1161n K(n2 n2Var) {
        if (n2Var instanceof InterfaceC1161n) {
            return (InterfaceC1161n) n2Var;
        }
        if (n2Var == null) {
            throw D0(null, null);
        }
        Object objM = n2Var.m(p);
        if (objM instanceof InterfaceC1161n) {
            return (InterfaceC1161n) objM;
        }
        throw D0(objM, n2Var);
    }

    public static Object K0(Z1 z1, C1185v c1185v) {
        return Boolean.valueOf(z1.a(c1185v));
    }

    public static Object K1(n2 n2Var) {
        ((N1) n2Var).getClass();
        throw new IllegalStateException();
    }

    public static InterfaceC1161n L(Object obj, Object obj2, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1;
        Object objR0;
        if (j0(obj2)) {
            n2VarU1 = u1(c1185v, obj, n2Var);
            if (n2VarU1 == null) {
                throw G1(obj, String.valueOf(obj2));
            }
            objR0 = p2.s0(n2VarU1, (w2) obj2);
        } else {
            C1153k2 c1153k2Z1 = z1(obj2);
            String str = c1153k2Z1.a;
            if (str != null) {
                return V(obj, str, c1185v, n2Var);
            }
            n2VarU1 = u1(c1185v, obj, n2Var);
            if (n2VarU1 == null) {
                throw G1(obj, String.valueOf(obj2));
            }
            objR0 = p2.r0(n2VarU1, c1153k2Z1.b);
        }
        if (!(objR0 instanceof InterfaceC1161n)) {
            throw D0(objR0, obj2);
        }
        Z0(c1185v, n2VarU1);
        return (InterfaceC1161n) objR0;
    }

    public static Object L0(Z1 z1, C1185v c1185v) {
        return z1.b(c1185v);
    }

    private static void L1(Object obj) {
        if ("true".equals(P("params.omit.non.js.object.warning", new Object[0]))) {
            return;
        }
        String strP = P("msg.non.js.object.warning", obj, obj.getClass().getName());
        C1185v.I(strP);
        System.err.println(strP);
    }

    static InterfaceC1098N M(n2 n2Var, String str) {
        Object objT0 = p2.t0(n2Var, str);
        if (objT0 instanceof InterfaceC1098N) {
            return (InterfaceC1098N) objT0;
        }
        if (objT0 == I2.c) {
            throw C1185v.H("msg.ctor.not.found", str);
        }
        throw C1185v.H("msg.not.ctor", str);
    }

    public static Object M0(Z1 z1, C1185v c1185v, n2 n2Var, int i2) {
        Object objValueOf;
        Object objB = z1.b(c1185v);
        boolean z = (i2 & 2) != 0;
        Number numberS1 = objB instanceof Number ? (Number) objB : s1(objB);
        int i3 = i2 & 1;
        if (numberS1 instanceof BigInteger) {
            objValueOf = i3 == 0 ? ((BigInteger) numberS1).add(BigInteger.ONE) : ((BigInteger) numberS1).subtract(BigInteger.ONE);
        } else {
            double dDoubleValue = numberS1.doubleValue();
            objValueOf = Double.valueOf(i3 == 0 ? dDoubleValue + 1.0d : dDoubleValue - 1.0d);
        }
        z1.d(c1185v, n2Var, objValueOf);
        return z ? numberS1 : objValueOf;
    }

    public static Boolean M1(boolean z) {
        return Boolean.valueOf(z);
    }

    static Object N(String str) {
        long jZ = Z(str);
        return (jZ < 0 || jZ > 2147483647L) ? str : Integer.valueOf((int) jZ);
    }

    public static Object N0(Z1 z1, Object obj, C1185v c1185v, n2 n2Var) {
        return z1.d(c1185v, n2Var, obj);
    }

    public static Number N1(double d2) {
        return Double.isNaN(d2) ? t : Double.valueOf(d2);
    }

    public static p2 O(n2 n2Var) {
        return (p2) p2.v0(n2Var, s);
    }

    public static boolean O0(Object obj, Object obj2) {
        if (!E1(obj).equals(E1(obj2))) {
            return false;
        }
        if (obj instanceof BigInteger) {
            return obj.equals(obj2);
        }
        if (!(obj instanceof Number)) {
            return x(obj, obj2);
        }
        if (e0(obj) && e0(obj2)) {
            return true;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (obj2 instanceof Number) {
            double dDoubleValue2 = ((Number) obj2).doubleValue();
            double d2 = u;
            if ((dDoubleValue == d2 && dDoubleValue2 == 0.0d) || (dDoubleValue == 0.0d && dDoubleValue2 == d2)) {
                return true;
            }
        }
        return A(dDoubleValue, obj2);
    }

    public static n2 O1(C1185v c1185v, n2 n2Var, Object obj) {
        return c1185v.o().b();
    }

    public static String P(String str, Object... objArr) {
        ((C1137g2) x).getClass();
        C1185v c1185vI = C1185v.i();
        try {
            return new MessageFormat(ResourceBundle.getBundle("org.mozilla.javascript.resources.Messages", c1185vI != null ? c1185vI.l() : Locale.getDefault()).getString(str)).format(objArr);
        } catch (MissingResourceException unused) {
            throw new RuntimeException(C1290c.a("no message resource found for message property ", str));
        }
    }

    public static void P0(p2 p2Var, n2 n2Var, B2 b2) {
        n2 n2VarU0 = p2.u0(n2Var);
        p2Var.D(n2VarU0);
        p2Var.E(D2.r1(n2VarU0, b2));
    }

    public static InterfaceC1161n Q(String str, C1185v c1185v, n2 n2Var) {
        n2 n2VarB = n2Var.B();
        if (n2VarB != null) {
            return (InterfaceC1161n) t0(c1185v, n2Var, n2VarB, str, true);
        }
        Object objB1 = B1(c1185v, n2Var, str);
        if (objB1 instanceof InterfaceC1161n) {
            Z0(c1185v, n2Var);
            return (InterfaceC1161n) objB1;
        }
        if (objB1 != I2.c) {
            throw D0(objB1, str);
        }
        B0(str);
        throw null;
    }

    public static Object Q0(n2 n2Var, Object obj, String str) {
        if (n2Var instanceof AbstractC1298d) {
            n2Var.v(str, n2Var, obj);
        } else {
            n2 n2VarJ0 = p2.j0(n2Var, str);
            if (n2VarJ0 == null) {
                n2VarJ0 = n2Var;
            }
            if (n2VarJ0 instanceof InterfaceC1179t) {
                ((InterfaceC1179t) n2VarJ0).j(str, n2Var, obj);
            }
        }
        return obj;
    }

    public static Object R(n2 n2Var, Object obj, C1185v c1185v) {
        Object objR0;
        if (n2Var instanceof AbstractC1298d) {
            objR0 = ((AbstractC1298d) n2Var).r1();
        } else if (j0(obj)) {
            objR0 = p2.s0(n2Var, (w2) obj);
        } else {
            C1153k2 c1153k2Z1 = z1(obj);
            String str = c1153k2Z1.a;
            objR0 = str == null ? p2.r0(n2Var, c1153k2Z1.b) : p2.t0(n2Var, str);
        }
        return objR0 == I2.c ? G2.b : objR0;
    }

    public static void R0(Object obj, C1185v c1185v) {
        n2 n2VarX = c1185v.d;
        if (n2VarX == null) {
            n2VarX = X(c1185v);
        }
        Object objG = k(c1185v).g();
        if (n2VarX.x("__default_namespace__", n2VarX)) {
            n2VarX.v("__default_namespace__", n2VarX, objG);
        } else {
            p2.V(n2VarX, "__default_namespace__", objG, 6);
        }
        G2 g2 = G2.b;
    }

    public static Object S(n2 n2Var, String str, C1185v c1185v) {
        Object objT0 = p2.t0(n2Var, str);
        if (objT0 != I2.c) {
            return objT0;
        }
        if (c1185v.t(11)) {
            C1185v.I(P("msg.ref.undefined.prop", str));
        }
        return G2.b;
    }

    public static void S0(C1150k c1150k, n2 n2Var, boolean z) {
        c1150k.D(n2Var);
        c1150k.E(z ? D2.r1(p2.u0(n2Var), B2.GeneratorFunction) : p2.m0(n2Var));
    }

    public static Object T(Object obj, String str, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 != null) {
            return S(n2VarU1, str, c1185v);
        }
        throw H1(obj, str);
    }

    public static Object T0(n2 n2Var, Object obj, C1185v c1185v, n2 n2Var2, String str) {
        if (n2Var != null) {
            p2.L0(n2Var, str, obj);
        } else {
            if (c1185v.t(11) || c1185v.t(8)) {
                C1185v.I(P("msg.assn.create.strict", str));
            }
            n2 n2VarU0 = p2.u0(n2Var2);
            if (c1185v.l) {
                n2VarU0 = e(c1185v.c, n2VarU0);
            }
            n2VarU0.v(str, n2VarU0, obj);
        }
        return obj;
    }

    public static Object U(Object obj, String str, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw H1(obj, str);
        }
        Object objT0 = p2.t0(n2VarU1, str);
        return objT0 == I2.c ? G2.b : objT0;
    }

    public static Object U0(Object obj, Object obj2, Object obj3, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw I1(obj, obj2, obj3);
        }
        if (n2VarU1 instanceof AbstractC1298d) {
            ((AbstractC1298d) n2VarU1).v1();
        } else if (j0(obj2)) {
            w2 w2Var = (w2) obj2;
            n2 n2VarC = n2VarU1;
            while (!p2.b0(n2VarC).n(w2Var, n2VarU1) && (n2VarC = n2VarC.C()) != null) {
            }
            if (n2VarC == null) {
                n2VarC = n2VarU1;
            }
            p2.b0(n2VarC).q(w2Var, n2VarU1, obj3);
        } else {
            C1153k2 c1153k2Z1 = z1(obj2);
            String str = c1153k2Z1.a;
            if (str == null) {
                p2.K0(n2VarU1, c1153k2Z1.b, obj3);
            } else {
                p2.L0(n2VarU1, str, obj3);
            }
        }
        return obj3;
    }

    public static InterfaceC1161n V(Object obj, String str, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw G1(obj, str);
        }
        Object objT0 = p2.t0(n2VarU1, str);
        if (!(objT0 instanceof InterfaceC1161n)) {
            Object objT02 = p2.t0(n2VarU1, "__noSuchMethod__");
            if (objT02 instanceof InterfaceC1161n) {
                objT0 = new C1149j2((InterfaceC1161n) objT02, str);
            }
        }
        if (!(objT0 instanceof InterfaceC1161n)) {
            throw E0(n2VarU1, objT0, str);
        }
        Z0(c1185v, n2VarU1);
        return (InterfaceC1161n) objT0;
    }

    public static Object V0(Object obj, String str, Object obj2, C1185v c1185v, n2 n2Var) {
        if (!(obj instanceof n2)) {
            c1185v.u();
        }
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 == null) {
            throw I1(obj, str, obj2);
        }
        p2.L0(n2VarU1, str, obj2);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n2 W(C1185v c1185v, n2 n2Var, Object[] objArr, int i2) {
        Object[] objArr2 = objArr[i2];
        if (objArr2 instanceof n2) {
            return (n2) objArr2;
        }
        Object[] objArr3 = (String[]) objArr2;
        p2 p2Var = (p2) c1185v.w(n2Var, objArr3.length >>> 1);
        p2 p2Var2 = (p2) c1185v.w(n2Var, objArr3.length >>> 1);
        p2Var.v("raw", p2Var, p2Var2);
        p2Var.P0("raw", 2);
        int length = objArr3.length;
        for (int i3 = 0; i3 < length; i3 += 2) {
            int i4 = i3 >>> 1;
            p2Var.t(i4, p2Var, objArr3[i3] == null ? G2.b : objArr3[i3]);
            p2Var2.t(i4, p2Var2, objArr3[i3 + 1]);
        }
        r2.b(c1185v, p2Var2, 1);
        r2.b(c1185v, p2Var, 1);
        objArr[i2] = p2Var;
        return p2Var;
    }

    public static boolean W0(Object obj, Object obj2) {
        if (obj == obj2) {
            if (obj instanceof Number) {
                return !Double.isNaN(((Number) obj).doubleValue());
            }
            return true;
        }
        if (obj == null || obj == G2.b || obj == G2.d) {
            G2 g2 = G2.b;
            return (obj == g2 && obj2 == G2.d) || (obj == G2.d && obj2 == g2);
        }
        boolean z = obj instanceof BigInteger;
        if (z) {
            if (obj2 instanceof BigInteger) {
                return obj.equals(obj2);
            }
        } else {
            if ((obj instanceof Number) && !z) {
                return (obj2 instanceof Number) && !(obj2 instanceof BigInteger) && ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
            }
            if (obj instanceof CharSequence) {
                if (obj2 instanceof CharSequence) {
                    return obj.toString().equals(obj2.toString());
                }
            } else if (obj instanceof Boolean) {
                if (obj2 instanceof Boolean) {
                    return obj.equals(obj2);
                }
            } else {
                if (!(obj instanceof n2)) {
                    L1(obj);
                    return obj == obj2;
                }
                if ((obj instanceof L2) && (obj2 instanceof L2)) {
                    return ((L2) obj).c() == ((L2) obj2).c();
                }
                if (obj instanceof C1086B) {
                    obj = ((C1086B) obj).b;
                    if (obj2 instanceof C1086B) {
                        return W0(obj, ((C1086B) obj2).b);
                    }
                    if (obj == obj2) {
                        return true;
                    }
                }
                if ((obj2 instanceof C1086B) && ((C1086B) obj2).b == obj) {
                    return true;
                }
            }
        }
        return false;
    }

    public static n2 X(C1185v c1185v) {
        n2 n2Var = c1185v.c;
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException();
    }

    public static Number X0(Number number, Number number2) {
        boolean z = number instanceof BigInteger;
        if (z && (number2 instanceof BigInteger)) {
            try {
                return ((BigInteger) number).shiftRight(((BigInteger) number2).intValueExact());
            } catch (ArithmeticException unused) {
                throw J0("msg.bigint.out.of.range.arithmetic", new Object[0]);
            }
        }
        if (z || (number2 instanceof BigInteger)) {
            throw C1("msg.cant.convert.to.number", "BigInt");
        }
        return Double.valueOf(com.github.catvod.spider.merge.Q0.a.a(number.doubleValue()) >> com.github.catvod.spider.merge.Q0.a.a(number2.doubleValue()));
    }

    public static InterfaceC1161n Y(Object obj, C1185v c1185v) {
        if (!(obj instanceof InterfaceC1161n)) {
            throw D0(obj, obj);
        }
        InterfaceC1161n interfaceC1161n = (InterfaceC1161n) obj;
        n2 n2VarB = interfaceC1161n instanceof n2 ? ((n2) interfaceC1161n).B() : null;
        if (n2VarB == null && (n2VarB = c1185v.c) == null) {
            throw new IllegalStateException();
        }
        if (n2VarB.B() != null && !(n2VarB instanceof N1) && (n2VarB instanceof E0)) {
            n2VarB = p2.u0(n2VarB);
        }
        Z0(c1185v, n2VarB);
        return interfaceC1161n;
    }

    public static Z1 Y0(Object obj, String str, C1185v c1185v, n2 n2Var) {
        return v2.e(c1185v, n2Var, obj, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r4 <= (r5 ? 8 : 7)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long Z(java.lang.String r12) {
        /*
            int r0 = r12.length()
            r1 = -1
            if (r0 <= 0) goto L68
            r3 = 0
            char r4 = r12.charAt(r3)
            r5 = 45
            r6 = 48
            r7 = 1
            if (r4 != r5) goto L20
            if (r0 <= r7) goto L20
            char r4 = r12.charAt(r7)
            if (r4 != r6) goto L1d
            return r1
        L1d:
            r5 = 1
            r8 = 1
            goto L22
        L20:
            r5 = 0
            r8 = 0
        L22:
            int r4 = r4 + (-48)
            if (r4 < 0) goto L68
            r9 = 9
            if (r4 > r9) goto L68
            if (r5 == 0) goto L2f
            r10 = 11
            goto L31
        L2f:
            r10 = 10
        L31:
            if (r0 > r10) goto L68
            int r10 = -r4
            int r8 = r8 + r7
            if (r10 == 0) goto L4b
        L37:
            if (r8 == r0) goto L4b
            char r4 = r12.charAt(r8)
            int r4 = r4 - r6
            if (r4 < 0) goto L4b
            if (r4 > r9) goto L4b
            int r3 = r10 * 10
            int r3 = r3 - r4
            int r8 = r8 + 1
            r11 = r10
            r10 = r3
            r3 = r11
            goto L37
        L4b:
            if (r8 != r0) goto L68
            r12 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r3 > r12) goto L5c
            if (r3 != r12) goto L68
            if (r5 == 0) goto L59
            r12 = 8
            goto L5a
        L59:
            r12 = 7
        L5a:
            if (r4 > r12) goto L68
        L5c:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 == 0) goto L64
            goto L65
        L64:
            int r10 = -r10
        L65:
            long r2 = (long) r10
            long r0 = r0 & r2
            return r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.Z(java.lang.String):long");
    }

    private static void Z0(C1185v c1185v, n2 n2Var) {
        if (c1185v.v != null) {
            throw new IllegalStateException();
        }
        c1185v.v = n2Var;
    }

    public static Object a(Object obj, Object obj2) {
        boolean z = obj instanceof BigInteger;
        if (z && (obj2 instanceof BigInteger)) {
            return ((BigInteger) obj).add((BigInteger) obj2);
        }
        boolean z2 = obj instanceof Number;
        if ((z2 && (obj2 instanceof BigInteger)) || (z && (obj2 instanceof Number))) {
            throw C1("msg.cant.convert.to.number", "BigInt");
        }
        if (z2 && (obj2 instanceof Number)) {
            return N1(((Number) obj2).doubleValue() + ((Number) obj).doubleValue());
        }
        if ((obj instanceof CharSequence) && (obj2 instanceof CharSequence)) {
            return new C1176s((CharSequence) obj, (CharSequence) obj2);
        }
        if (obj instanceof AbstractC1298d) {
            ((AbstractC1298d) obj).getClass();
        }
        if (obj2 instanceof AbstractC1298d) {
            ((AbstractC1298d) obj2).getClass();
        }
        if ((obj instanceof w2) || (obj2 instanceof w2)) {
            throw C1("msg.not.a.number", new Object[0]);
        }
        if (obj instanceof n2) {
            obj = ((n2) obj).m(null);
        }
        if (obj2 instanceof n2) {
            obj2 = ((n2) obj2).m(null);
        }
        if ((obj instanceof CharSequence) || (obj2 instanceof CharSequence)) {
            return new C1176s(h1(obj), h1(obj2));
        }
        Number numberS1 = obj instanceof Number ? (Number) obj : s1(obj);
        Number numberS12 = obj2 instanceof Number ? (Number) obj2 : s1(obj2);
        boolean z3 = numberS1 instanceof BigInteger;
        if (z3 && (numberS12 instanceof BigInteger)) {
            return ((BigInteger) numberS1).add((BigInteger) numberS12);
        }
        if (z3 || (numberS12 instanceof BigInteger)) {
            throw C1("msg.cant.convert.to.number", "BigInt");
        }
        return Double.valueOf(numberS12.doubleValue() + numberS1.doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p2 a0(C1185v c1185v) {
        int i2;
        int i3;
        C2[] c2Arr;
        n2 n2Var;
        String str;
        String str2;
        int i4;
        p2 c1 = new C1();
        c1.I(s, c1);
        new C1167p().a(c1);
        C1150k.w1(c1185v, c1);
        new C1().Y0(12, c1, false);
        n2 n2VarP0 = p2.p0(c1);
        p2.k0(c1, "Function").E(n2VarP0);
        if (c1.C() == null) {
            c1.E(n2VarP0);
        }
        P0 p0 = new P0();
        p2.L0(p0, "name", "Error");
        p2.L0(p0, "message", "");
        p2.L0(p0, "fileName", "");
        p2.L0(p0, "lineNumber", 0);
        p0.P0("name", 2);
        p0.P0("message", 2);
        p0.Y0(3, c1, false);
        F0.p1(p0);
        T0 t0 = new T0();
        for (int i5 = 1; i5 <= 13; i5++) {
            switch (i5) {
                case 1:
                    str = "decodeURI";
                    break;
                case 2:
                    str = "decodeURIComponent";
                    break;
                case 3:
                    str = "encodeURI";
                    break;
                case 4:
                    str = "encodeURIComponent";
                    break;
                case 5:
                    str = "escape";
                    break;
                case 6:
                    str = "eval";
                    break;
                case 7:
                    str = "isFinite";
                    break;
                case 8:
                    str = "isNaN";
                    break;
                case 9:
                    str = "isXMLName";
                    break;
                case 10:
                    str = "parseFloat";
                    break;
                case 11:
                    str2 = "parseInt";
                    i4 = 2;
                    continue;
                    new C1104U(t0, "Global", i5, str2, i4, c1).F1();
                    break;
                case 12:
                    str = "unescape";
                    break;
                case 13:
                    str = "uneval";
                    break;
                default:
                    C1162n0.c();
                    throw null;
            }
            str2 = str;
            i4 = 1;
            new C1104U(t0, "Global", i5, str2, i4, c1).F1();
        }
        p2.V(c1, "NaN", t, 7);
        p2.V(c1, "Infinity", N1(Double.POSITIVE_INFINITY), 7);
        p2.V(c1, "undefined", G2.b, 7);
        p2.V(c1, "globalThis", c1, 2);
        n2 n2VarZ = p2.Z(p2.t0(c1, "Error"));
        n2 n2VarZ2 = p2.Z(p2.t0(n2VarZ, "prototype"));
        C2[] c2ArrValues = C2.values();
        int length = c2ArrValues.length;
        int i6 = 0;
        while (i6 < length) {
            C2 c2 = c2ArrValues[i6];
            if (c2 == C2.Error) {
                i2 = i6;
                i3 = length;
                c2Arr = c2ArrValues;
                n2Var = n2VarZ2;
            } else {
                String strName = c2.name();
                Object[] objArr = y;
                n2 n2VarU0 = p2.u0(c1);
                p2 p2Var = (p2) D2.q1(c1185v, n2VarU0).a(c1185v, n2VarU0, objArr);
                p2Var.X("name", strName, 2);
                p2Var.X("message", "", 2);
                i2 = i6;
                i3 = length;
                c2Arr = c2ArrValues;
                C1104U c1104u = new C1104U(t0, "Global", 14, strName, 1, c1);
                c1104u.J1(p2Var);
                c1104u.E(n2VarZ);
                p2Var.v("constructor", p2Var, c1104u);
                p2Var.P0("constructor", 2);
                n2Var = n2VarZ2;
                p2Var.E(n2Var);
                c1104u.P0("name", 3);
                c1104u.P0("length", 3);
                c1104u.F1();
            }
            i6 = i2 + 1;
            n2VarZ2 = n2Var;
            length = i3;
            c2ArrValues = c2Arr;
        }
        C1162n0.a(c1185v, c1, new B0(0L).Y0(34, c1, false));
        if (c1185v.n() > 0) {
            B0.K1();
        }
        new K1("").Y0(52, c1, false);
        new D0(false).Y0(4, c1, false);
        new C1181t1(0.0d).Y0(8, c1, false);
        H0.O1(c1);
        C1178s1.T0(c1);
        C1112a1.U0(c1);
        N1.d(c1);
        new E0().Y0(1, c1, false);
        J1.E1(c1);
        W0.q1(c1185v, c1);
        C0.t1(c1);
        L1.t1(c1);
        int i7 = C1156l1.i;
        C1152k1.t1(c1);
        int i8 = C1140h1.k;
        C1136g1.t1(c1);
        boolean z = c1185v.t(6) && c1185v.j() != null;
        new C1174r0(c1, "RegExp", "org.mozilla.javascript.regexp.NativeRegExp");
        new C1174r0(c1, "Continuation", "org.mozilla.javascript.NativeContinuation");
        if (z) {
            String strB = c1185v.j().b();
            new C1174r0(c1, "XML", strB);
            new C1174r0(c1, "XMLList", strB);
            new C1174r0(c1, "Namespace", strB);
            new C1174r0(c1, "QName", strB);
        }
        if (c1 instanceof D2) {
            ((D2) c1).p1(c1);
        }
        return c1;
    }

    public static Object a1(n2 n2Var, Object obj, String str) {
        if (n2Var != null) {
            p2.L0(n2Var, str, obj);
            return obj;
        }
        throw j("ReferenceError", "Assignment to undefined \"" + str + "\" in strict mode");
    }

    public static n2 b(C1185v c1185v, n2 n2Var, String str) {
        n2 n2VarB = n2Var.B();
        AbstractC1298d abstractC1298d = null;
        if (n2VarB != null) {
            AbstractC1298d abstractC1298d2 = null;
            while (true) {
                if (!(n2Var instanceof N1)) {
                    while (!p2.y0(n2Var, str)) {
                        n2 n2VarB2 = n2VarB.B();
                        if (n2VarB2 != null) {
                            n2 n2Var2 = n2VarB;
                            n2VarB = n2VarB2;
                            n2Var = n2Var2;
                        }
                    }
                    return n2Var;
                }
                n2 n2VarC = n2Var.C();
                if (n2VarC instanceof AbstractC1298d) {
                    AbstractC1298d abstractC1298d3 = (AbstractC1298d) n2VarC;
                    if (abstractC1298d3.s1()) {
                        return abstractC1298d3;
                    }
                    if (abstractC1298d2 == null) {
                        abstractC1298d2 = abstractC1298d3;
                    }
                } else if (p2.y0(n2VarC, str)) {
                    return n2VarC;
                }
                n2 n2VarB3 = n2VarB.B();
                if (n2VarB3 == null) {
                    break;
                }
                n2 n2Var3 = n2VarB;
                n2VarB = n2VarB3;
                n2Var = n2Var3;
            }
            n2Var = n2VarB;
            abstractC1298d = abstractC1298d2;
        }
        if (c1185v.l) {
            n2Var = e(c1185v.c, n2Var);
        }
        return p2.y0(n2Var, str) ? n2Var : abstractC1298d;
    }

    public static boolean b0(Object obj, Object obj2) {
        if (!(obj2 instanceof n2)) {
            throw C1("msg.instanceof.not.object", new Object[0]);
        }
        if (obj instanceof n2) {
            return ((n2) obj2).g((n2) obj);
        }
        return false;
    }

    static double b1(String str, int i2, int i3) {
        return c1(str, i2, str.length() - 1, i3, true);
    }

    public static Object c(Object obj, C1185v c1185v, n2 n2Var) {
        InterfaceC1161n interfaceC1161nL = L(obj, x2.c, c1185v, n2Var);
        n2 n2Var2 = c1185v.v;
        c1185v.v = null;
        return interfaceC1161nL.b(c1185v, n2Var, n2Var2, y);
    }

    public static boolean c0(int i2) {
        if ((57296 & i2) != 0) {
            return false;
        }
        return i2 == 10 || i2 == 13 || i2 == 8232 || i2 == 8233;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double c1(java.lang.String r23, int r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.c1(java.lang.String, int, int, int, boolean):double");
    }

    public static Z1 d(InterfaceC1161n interfaceC1161n, n2 n2Var, Object[] objArr, C1185v c1185v) {
        if (!(interfaceC1161n instanceof InterfaceC1113a2)) {
            throw j("ReferenceError", P("msg.no.ref.from.function", x1(interfaceC1161n)));
        }
        InterfaceC1113a2 interfaceC1113a2 = (InterfaceC1113a2) interfaceC1161n;
        Z1 z1A = interfaceC1113a2.A();
        if (z1A != null) {
            return z1A;
        }
        throw new IllegalStateException(interfaceC1113a2.getClass().getName() + ".refCall() returned null");
    }

    public static boolean d0(int i2) {
        return i0(i2) || c0(i2);
    }

    public static C1089E d1(Object... objArr) {
        return j("SyntaxError", P("msg.bigint.bad.form", objArr));
    }

    static n2 e(n2 n2Var, n2 n2Var2) {
        if (n2Var == n2Var2) {
            return n2Var;
        }
        n2 n2VarC = n2Var;
        do {
            n2VarC = n2VarC.C();
            if (n2VarC == n2Var2) {
                return n2Var;
            }
        } while (n2VarC != null);
        return n2Var2;
    }

    public static boolean e0(Object obj) {
        if (obj instanceof Double) {
            return ((Double) obj).isNaN();
        }
        if (obj instanceof Float) {
            return ((Float) obj).isNaN();
        }
        return false;
    }

    public static BigInteger e1(Object obj) {
        while (!(obj instanceof BigInteger)) {
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).toBigInteger();
            }
            if (obj instanceof Number) {
                if (obj instanceof Long) {
                    return BigInteger.valueOf(((Long) obj).longValue());
                }
                double dDoubleValue = ((Number) obj).doubleValue();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw J0("msg.cant.convert.to.bigint.isnt.integer", x1(obj));
                }
                try {
                    return new BigDecimal(dDoubleValue, MathContext.UNLIMITED).toBigIntegerExact();
                } catch (ArithmeticException unused) {
                    throw J0("msg.cant.convert.to.bigint.isnt.integer", x1(obj));
                }
            }
            if (obj == null || G2.b(obj)) {
                throw C1("msg.cant.convert.to.bigint", x1(obj));
            }
            if (obj instanceof String) {
                return f1((String) obj);
            }
            if (obj instanceof CharSequence) {
                return f1(obj.toString());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
            }
            if (obj instanceof w2) {
                throw C1("msg.cant.convert.to.bigint", x1(obj));
            }
            if (!(obj instanceof n2)) {
                L1(obj);
                return BigInteger.ZERO;
            }
            obj = ((n2) obj).m(n);
            if ((obj instanceof n2) && !j0(obj)) {
                throw C("msg.primitive.expected", obj);
            }
        }
        return (BigInteger) obj;
    }

    public static InterfaceC1117b2 f(C1185v c1185v) {
        InterfaceC1117b2 interfaceC1117b2O = c1185v.o();
        if (interfaceC1117b2O != null) {
            return interfaceC1117b2O;
        }
        throw C1185v.H("msg.no.regexp", new Object[0]);
    }

    public static boolean f0(Object obj) {
        if (obj == null || G2.b(obj)) {
            return false;
        }
        if (obj instanceof p2) {
            String strW0 = ((p2) obj).w0();
            return "object".equals(strW0) || "function".equals(strW0);
        }
        if (obj instanceof n2) {
            return !(obj instanceof InterfaceC1161n);
        }
        return false;
    }

    public static BigInteger f1(String str) {
        int i2;
        int length = str.length();
        for (int i3 = 0; i3 != length; i3++) {
            char cCharAt = str.charAt(i3);
            if (!i0(cCharAt)) {
                int i4 = length - 1;
                while (i0(str.charAt(i4))) {
                    i4--;
                }
                if (cCharAt == '0' && (i2 = i3 + 2) <= i4) {
                    char cCharAt2 = str.charAt(i3 + 1);
                    int i5 = (cCharAt2 == 'x' || cCharAt2 == 'X') ? 16 : (cCharAt2 == 'o' || cCharAt2 == 'O') ? 8 : (cCharAt2 == 'b' || cCharAt2 == 'B') ? 2 : -1;
                    if (i5 != -1) {
                        try {
                            return new BigInteger(str.substring(i2, i4 + 1), i5);
                        } catch (NumberFormatException unused) {
                            throw d1(new Object[0]);
                        }
                    }
                }
                String strSubstring = str.substring(i3, i4 + 1);
                for (int length2 = strSubstring.length() - 1; length2 >= 0; length2--) {
                    char cCharAt3 = strSubstring.charAt(length2);
                    if (!(length2 == 0 && (cCharAt3 == '+' || cCharAt3 == '-')) && ('0' > cCharAt3 || cCharAt3 > '9')) {
                        throw d1(new Object[0]);
                    }
                }
                try {
                    return new BigInteger(strSubstring);
                } catch (NumberFormatException unused2) {
                    throw d1(new Object[0]);
                }
            }
        }
        return BigInteger.ZERO;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(java.lang.Number r13, java.lang.Number r14, int r15) {
        /*
            boolean r0 = r13 instanceof java.math.BigInteger
            if (r0 == 0) goto L11
            boolean r1 = r14 instanceof java.math.BigInteger
            if (r1 == 0) goto L11
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            boolean r13 = i(r13, r14, r15)
            return r13
        L11:
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L40
            boolean r3 = r14 instanceof java.math.BigInteger
            if (r3 == 0) goto L1a
            goto L40
        L1a:
            double r3 = r13.doubleValue()
            double r13 = r14.doubleValue()
            switch(r15) {
                case 14: goto L3b;
                case 15: goto L36;
                case 16: goto L31;
                case 17: goto L2a;
                default: goto L25;
            }
        L25:
            com.github.catvod.spider.merge.f1.C1162n0.c()
            r13 = 0
            throw r13
        L2a:
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 < 0) goto L2f
            goto L3f
        L2f:
            r1 = 0
            goto L3f
        L31:
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 <= 0) goto L2f
            goto L3f
        L36:
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 > 0) goto L2f
            goto L3f
        L3b:
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 >= 0) goto L2f
        L3f:
            return r1
        L40:
            r3 = 14
            r4 = 16
            r5 = 15
            r6 = 17
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r9 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            if (r0 == 0) goto L56
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            r0.<init>(r13)
            goto L7e
        L56:
            double r11 = r13.doubleValue()
            boolean r13 = java.lang.Double.isNaN(r11)
            if (r13 == 0) goto L61
            return r2
        L61:
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L6c
            if (r15 == r6) goto L6b
            if (r15 != r4) goto L6a
            goto L6b
        L6a:
            r1 = 0
        L6b:
            return r1
        L6c:
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L77
            if (r15 == r5) goto L76
            if (r15 != r3) goto L75
            goto L76
        L75:
            r1 = 0
        L76:
            return r1
        L77:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.MathContext r13 = java.math.MathContext.UNLIMITED
            r0.<init>(r11, r13)
        L7e:
            boolean r13 = r14 instanceof java.math.BigInteger
            if (r13 == 0) goto L8a
            java.math.BigDecimal r13 = new java.math.BigDecimal
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            r13.<init>(r14)
            goto Lb3
        L8a:
            double r13 = r14.doubleValue()
            boolean r11 = java.lang.Double.isNaN(r13)
            if (r11 == 0) goto L95
            return r2
        L95:
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 != 0) goto La0
            if (r15 == r5) goto L9f
            if (r15 != r3) goto L9e
            goto L9f
        L9e:
            r1 = 0
        L9f:
            return r1
        La0:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r3 != 0) goto Lab
            if (r15 == r6) goto Laa
            if (r15 != r4) goto La9
            goto Laa
        La9:
            r1 = 0
        Laa:
            return r1
        Lab:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.math.MathContext r2 = java.math.MathContext.UNLIMITED
            r1.<init>(r13, r2)
            r13 = r1
        Lb3:
            boolean r13 = i(r0, r13, r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.g(java.lang.Number, java.lang.Number, int):boolean");
    }

    public static boolean g0(Object obj) {
        return obj == null || G2.b(obj) || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean);
    }

    public static boolean g1(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj == null || G2.b(obj)) {
            return false;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() != 0;
        }
        if (obj instanceof BigInteger) {
            return !BigInteger.ZERO.equals(obj);
        }
        if (obj instanceof Number) {
            double dDoubleValue = ((Number) obj).doubleValue();
            return (Double.isNaN(dDoubleValue) || dDoubleValue == 0.0d) ? false : true;
        }
        if (!(obj instanceof n2)) {
            L1(obj);
            return true;
        }
        if (obj instanceof p2) {
        }
        C1185v.h();
        return true;
    }

    public static boolean h(Object obj, Object obj2, int i2) {
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return g((Number) obj, (Number) obj2, i2);
        }
        if ((obj instanceof w2) || (obj2 instanceof w2)) {
            throw C1("msg.compare.symbol", new Object[0]);
        }
        if (obj instanceof n2) {
            obj = ((n2) obj).m(i);
        }
        if (obj2 instanceof n2) {
            obj2 = ((n2) obj2).m(i);
        }
        return ((obj instanceof CharSequence) && (obj2 instanceof CharSequence)) ? i(obj.toString(), obj2.toString(), i2) : g(s1(obj), s1(obj2), i2);
    }

    static boolean h0(String str) {
        return str.equals("__proto__") || str.equals("__parent__");
    }

    public static CharSequence h1(Object obj) {
        return obj instanceof K1 ? ((K1) obj).s1() : obj instanceof CharSequence ? (CharSequence) obj : x1(obj);
    }

    private static <T> boolean i(Comparable<T> comparable, T t2, int i2) {
        switch (i2) {
            case 14:
                return comparable.compareTo(t2) < 0;
            case 15:
                return comparable.compareTo(t2) <= 0;
            case 16:
                return comparable.compareTo(t2) > 0;
            case 17:
                return comparable.compareTo(t2) >= 0;
            default:
                C1162n0.c();
                throw null;
        }
    }

    static boolean i0(int i2) {
        if (i2 == 32 || i2 == 160 || i2 == 65279 || i2 == 8232 || i2 == 8233) {
            return true;
        }
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                if (Character.getType(i2) == 12) {
                }
                break;
        }
        return true;
    }

    public static int i1(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : com.github.catvod.spider.merge.Q0.a.a(p1(obj));
    }

    public static C1089E j(String str, String str2) {
        int[] iArr = new int[1];
        return new C1089E(str, str2, C1185v.p(iArr), iArr[0], null, 0);
    }

    static boolean j0(Object obj) {
        return ((obj instanceof M1) && ((M1) obj).u1()) || (obj instanceof x2);
    }

    public static int j1(Object[] objArr, int i2) {
        if (i2 < objArr.length) {
            return i1(objArr[i2]);
        }
        return 0;
    }

    private static AbstractC1297c k(C1185v c1185v) {
        n2 n2Var = c1185v.c;
        if (n2Var == null) {
            throw new IllegalStateException();
        }
        AbstractC1297c abstractC1297c = c1185v.e;
        if (abstractC1297c != null) {
            return abstractC1297c;
        }
        AbstractC1297c abstractC1297cC = AbstractC1297c.c(n2Var);
        c1185v.e = abstractC1297cC;
        return abstractC1297cC;
    }

    public static n2 k0(C1185v c1185v) {
        n2 n2Var = c1185v.v;
        c1185v.v = null;
        return n2Var;
    }

    public static double k1(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        return (d2 == 0.0d || Double.isInfinite(d2)) ? d2 : d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:11:0x002d, B:12:0x0037, B:14:0x003a, B:17:0x0042, B:21:0x0054, B:22:0x0057, B:44:0x00ad, B:23:0x005b, B:27:0x0068, B:28:0x006b, B:42:0x009a, B:43:0x009e, B:31:0x0076, B:36:0x0084, B:39:0x0090, B:40:0x0093), top: B:57:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:11:0x002d, B:12:0x0037, B:14:0x003a, B:17:0x0042, B:21:0x0054, B:22:0x0057, B:44:0x00ad, B:23:0x005b, B:27:0x0068, B:28:0x006b, B:42:0x009a, B:43:0x009e, B:31:0x0076, B:36:0x0084, B:39:0x0090, B:40:0x0093), top: B:57:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String l(com.github.catvod.spider.merge.f1.C1185v r13, com.github.catvod.spider.merge.f1.n2 r14, com.github.catvod.spider.merge.f1.n2 r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.l(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2):java.lang.String");
    }

    public static n2 l0(n2 n2Var) {
        return ((N1) n2Var).c;
    }

    public static double l1(Object obj) {
        return k1(p1(obj));
    }

    static String m(n2 n2Var) {
        if (n2Var == null) {
            return "[object Null]";
        }
        if (G2.b(n2Var)) {
            return "[object Undefined]";
        }
        StringBuilder sbB = com.github.catvod.spider.merge.I.t0.b("[object ");
        sbB.append(n2Var.F());
        sbB.append(']');
        return sbB.toString();
    }

    public static Number m0(Number number, Number number2) {
        boolean z = number instanceof BigInteger;
        if (z && (number2 instanceof BigInteger)) {
            try {
                return ((BigInteger) number).shiftLeft(((BigInteger) number2).intValueExact());
            } catch (ArithmeticException unused) {
                throw J0("msg.bigint.out.of.range.arithmetic", new Object[0]);
            }
        }
        if (z || (number2 instanceof BigInteger)) {
            throw C1("msg.cant.convert.to.number", "BigInt");
        }
        return Double.valueOf(com.github.catvod.spider.merge.Q0.a.a(number.doubleValue()) << com.github.catvod.spider.merge.Q0.a.a(number2.doubleValue()));
    }

    public static double m1(Object[] objArr, int i2) {
        if (i2 < objArr.length) {
            return l1(objArr[i2]);
        }
        return 0.0d;
    }

    public static boolean n(n2 n2Var, Object obj) {
        boolean zX;
        if (j0(obj)) {
            y2 y2VarB0 = p2.b0(n2Var);
            w2 w2Var = (w2) obj;
            y2VarB0.o(w2Var);
            zX = y2VarB0.n(w2Var, n2Var);
        } else {
            C1153k2 c1153k2Z1 = z1(obj);
            String str = c1153k2Z1.a;
            if (str == null) {
                n2Var.p(c1153k2Z1.b);
                zX = n2Var.z(c1153k2Z1.b, n2Var);
            } else {
                n2Var.delete(str);
                zX = n2Var.x(c1153k2Z1.a, n2Var);
            }
        }
        return !zX;
    }

    public static boolean n0(C1185v c1185v, n2 n2Var, Object obj, BiConsumer<Object, Object> biConsumer) {
        if (obj == null || G2.b(obj)) {
            return false;
        }
        Object objC = c(obj, c1185v, n2Var);
        if (G2.b(objC)) {
            return false;
        }
        C1139h0 c1139h0 = new C1139h0(c1185v, n2Var, objC);
        try {
            C1135g0 c1135g0 = new C1135g0(c1139h0);
            while (c1135g0.hasNext()) {
                n2 n2VarZ = p2.Z(c1135g0.next());
                if (n2VarZ instanceof w2) {
                    throw C1("msg.arg.not.object", E1(n2VarZ));
                }
                Object objW = n2VarZ.w(0, n2VarZ);
                I2 i2 = I2.c;
                if (objW == i2) {
                    objW = G2.b;
                }
                Object objW2 = n2VarZ.w(1, n2VarZ);
                if (objW2 == i2) {
                    objW2 = G2.b;
                }
                biConsumer.accept(objW, objW2);
            }
            c1139h0.close();
            return true;
        } finally {
        }
    }

    public static n2 n1(C1185v c1185v, n2 n2Var, n2 n2Var2, boolean z) {
        if (!p2.y0(n2Var2, "__iterator__")) {
            return null;
        }
        Object objT0 = p2.t0(n2Var2, "__iterator__");
        if (!(objT0 instanceof InterfaceC1161n)) {
            throw C1("msg.invalid.iterator", new Object[0]);
        }
        InterfaceC1161n interfaceC1161n = (InterfaceC1161n) objT0;
        Object[] objArr = new Object[1];
        objArr[0] = z ? Boolean.TRUE : Boolean.FALSE;
        Object objB = interfaceC1161n.b(c1185v, n2Var, n2Var2, objArr);
        if (objB instanceof n2) {
            return (n2) objB;
        }
        throw C1("msg.iterator.primitive", new Object[0]);
    }

    private static Object o(n2 n2Var, String str, n2 n2Var2, Object obj, int i2) {
        Object objValueOf;
        boolean z = (i2 & 2) != 0;
        Number numberS1 = obj instanceof Number ? (Number) obj : s1(obj);
        int i3 = i2 & 1;
        if (numberS1 instanceof BigInteger) {
            objValueOf = i3 == 0 ? ((BigInteger) numberS1).add(BigInteger.ONE) : ((BigInteger) numberS1).subtract(BigInteger.ONE);
        } else {
            double dDoubleValue = numberS1.doubleValue();
            objValueOf = Double.valueOf(i3 == 0 ? dDoubleValue + 1.0d : dDoubleValue - 1.0d);
        }
        n2Var.v(str, n2Var2, objValueOf);
        return z ? numberS1 : objValueOf;
    }

    static String o0(boolean z, String str, int i2) {
        StringBuilder sb;
        String str2;
        if (z) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(i2);
            str2 = "(eval)";
        } else {
            sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(i2);
            str2 = "(Function)";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static long o1(Object[] objArr) {
        double dM1 = m1(objArr, 0);
        if (dM1 <= 0.0d) {
            return 0L;
        }
        return (long) Math.min(dM1, 9.007199254740991E15d);
    }

    public static Object p(InterfaceC1161n interfaceC1161n, C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr, boolean z) {
        if (n2Var == null) {
            throw new IllegalArgumentException();
        }
        if (c1185v.c != null) {
            throw new IllegalStateException();
        }
        c1185v.c = p2.u0(n2Var);
        c1185v.l = c1185v.t(7);
        boolean z2 = c1185v.w;
        c1185v.w = z;
        try {
            c1185v.k().getClass();
            Object objB = interfaceC1161n.b(c1185v, n2Var, n2Var2, objArr);
            if (objB instanceof C1176s) {
                objB = objB.toString();
            }
            c1185v.c = null;
            c1185v.e = null;
            c1185v.w = z2;
            if (c1185v.d == null) {
                return objB;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            c1185v.c = null;
            c1185v.e = null;
            c1185v.w = z2;
            if (c1185v.d != null) {
                throw new IllegalStateException();
            }
            throw th;
        }
    }

    public static Z1 p0(Object obj, Object obj2, C1185v c1185v, int i2) {
        if (obj instanceof AbstractC1298d) {
            return ((AbstractC1298d) obj).t1();
        }
        F0(obj);
        throw null;
    }

    public static double p1(Object obj) {
        while (!(obj instanceof BigInteger)) {
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue();
            }
            if (obj == null) {
                return 0.0d;
            }
            if (G2.b(obj)) {
                return Double.NaN;
            }
            if (obj instanceof String) {
                return q1((String) obj);
            }
            if (obj instanceof CharSequence) {
                return q1(obj.toString());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
            }
            if (obj instanceof w2) {
                throw C1("msg.not.a.number", new Object[0]);
            }
            if (!(obj instanceof n2)) {
                L1(obj);
                return Double.NaN;
            }
            obj = ((n2) obj).m(i);
            if ((obj instanceof n2) && !j0(obj)) {
                throw C("msg.primitive.expected", obj);
            }
        }
        throw C1("msg.cant.convert.to.number", "BigInt");
    }

    public static n2 q(Object obj, n2 n2Var) {
        if (obj instanceof AbstractC1298d) {
            return ((AbstractC1298d) obj).p1();
        }
        F0(obj);
        throw null;
    }

    public static Z1 q0(Object obj, Object obj2, Object obj3, C1185v c1185v, int i2) {
        if (obj instanceof AbstractC1298d) {
            return ((AbstractC1298d) obj).u1();
        }
        F0(obj);
        throw null;
    }

    public static double q1(String str) {
        char cCharAt;
        int i2;
        char cCharAt2;
        int length = str.length();
        int i3 = 0;
        while (i3 != length) {
            char cCharAt3 = str.charAt(i3);
            if (!i0(cCharAt3)) {
                do {
                    length--;
                    cCharAt = str.charAt(length);
                } while (i0(cCharAt));
                C1185v.i();
                int i4 = 16;
                if (cCharAt3 == '0') {
                    int i5 = i3 + 2;
                    if (i5 <= length) {
                        char cCharAt4 = str.charAt(i3 + 1);
                        if (cCharAt4 != 'x' && cCharAt4 != 'X') {
                            i4 = -1;
                        }
                        if (i4 != -1) {
                            return b1(str, i5, i4);
                        }
                    }
                } else if ((cCharAt3 == '+' || cCharAt3 == '-') && (i2 = i3 + 3) <= length && str.charAt(i3 + 1) == '0' && ((cCharAt2 = str.charAt(i3 + 2)) == 'x' || cCharAt2 == 'X')) {
                    double dB1 = b1(str, i2, 16);
                    return cCharAt3 == '-' ? -dB1 : dB1;
                }
                if (cCharAt == 'y') {
                    if (cCharAt3 == '+' || cCharAt3 == '-') {
                        i3++;
                    }
                    if (i3 + 7 == length && str.regionMatches(i3, "Infinity", 0, 8)) {
                        return cCharAt3 == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    return Double.NaN;
                }
                String strSubstring = str.substring(i3, length + 1);
                for (int length2 = strSubstring.length() - 1; length2 >= 0; length2--) {
                    char cCharAt5 = strSubstring.charAt(length2);
                    if (('0' > cCharAt5 || cCharAt5 > '9') && cCharAt5 != '.' && cCharAt5 != 'e' && cCharAt5 != 'E' && cCharAt5 != '+' && cCharAt5 != '-') {
                        return Double.NaN;
                    }
                }
                try {
                    return Double.parseDouble(strSubstring);
                } catch (NumberFormatException unused) {
                    return Double.NaN;
                }
            }
            i3++;
        }
        return 0.0d;
    }

    public static n2 r(Object obj, C1185v c1185v, n2 n2Var) {
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        if (n2VarU1 != null) {
            return n2VarU1 instanceof AbstractC1298d ? ((AbstractC1298d) n2VarU1).q1() : new N1(n2Var, n2VarU1);
        }
        throw C1("msg.undef.with", x1(obj));
    }

    public static Object r0(C1185v c1185v, n2 n2Var, String str) {
        n2 n2VarB = n2Var.B();
        if (n2VarB != null) {
            return t0(c1185v, n2Var, n2VarB, str, false);
        }
        Object objB1 = B1(c1185v, n2Var, str);
        if (objB1 != I2.c) {
            return objB1;
        }
        B0(str);
        throw null;
    }

    public static double r1(Object[] objArr, int i2) {
        if (i2 < objArr.length) {
            return p1(objArr[i2]);
        }
        return Double.NaN;
    }

    private static void s(C1141h2 c1141h2) {
        Object[] objArr;
        Object[] objArrU = null;
        while (true) {
            n2 n2Var = c1141h2.b;
            if (n2Var == null) {
                break;
            }
            objArrU = n2Var.u();
            if (objArrU.length != 0) {
                break;
            } else {
                c1141h2.b = c1141h2.b.C();
            }
        }
        if (c1141h2.b != null && (objArr = c1141h2.c) != null) {
            int length = objArr.length;
            if (c1141h2.d == null) {
                c1141h2.d = new U1(length);
            }
            for (int i2 = 0; i2 != length; i2++) {
                c1141h2.d.h(objArr[i2]);
            }
        }
        c1141h2.c = objArrU;
        c1141h2.f = 0;
    }

    public static Object s0(n2 n2Var, String str, C1185v c1185v, int i2) {
        do {
            if (c1185v.l && n2Var.B() == null) {
                n2Var = e(c1185v.c, n2Var);
            }
            n2 n2VarC = n2Var;
            do {
                if ((n2VarC instanceof N1) && (n2VarC.C() instanceof AbstractC1298d)) {
                    break;
                }
                Object objL = n2VarC.l(str, n2Var);
                if (objL != I2.c) {
                    return o(n2VarC, str, n2Var, objL, i2);
                }
                n2VarC = n2VarC.C();
            } while (n2VarC != null);
            n2Var = n2Var.B();
        } while (n2Var != null);
        B0(str);
        throw null;
    }

    public static Number s1(Object obj) {
        return obj instanceof Number ? (Number) obj : Double.valueOf(p1(obj));
    }

    public static Object t(Object obj, C1185v c1185v) {
        C1141h2 c1141h2 = (C1141h2) obj;
        if (c1141h2.i != null) {
            return c1141h2.e;
        }
        int i2 = c1141h2.g;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                C1162n0.c();
                                throw null;
                            }
                        }
                    }
                }
                return c1185v.x(p2.u0(c1141h2.b), new Object[]{c1141h2.e, w(obj)});
            }
            return w(obj);
        }
        return c1141h2.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r8 = r1;
        r7 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[LOOP:0: B:3:0x0003->B:41:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object t0(com.github.catvod.spider.merge.f1.C1185v r6, com.github.catvod.spider.merge.f1.n2 r7, com.github.catvod.spider.merge.f1.n2 r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            r1 = r7
            r2 = r0
        L3:
            boolean r3 = r1 instanceof com.github.catvod.spider.merge.f1.N1
            if (r3 == 0) goto L2a
            com.github.catvod.spider.merge.f1.n2 r1 = r1.C()
            boolean r3 = r1 instanceof com.github.catvod.spider.merge.l1.AbstractC1298d
            if (r3 == 0) goto L21
            com.github.catvod.spider.merge.l1.d r1 = (com.github.catvod.spider.merge.l1.AbstractC1298d) r1
            boolean r3 = r1.x(r9, r1)
            if (r3 == 0) goto L1d
            java.lang.Object r7 = r1.l(r9, r1)
            r8 = r1
            goto L65
        L1d:
            if (r2 != 0) goto L4a
            r2 = r1
            goto L4a
        L21:
            java.lang.Object r3 = com.github.catvod.spider.merge.f1.p2.t0(r1, r9)
            com.github.catvod.spider.merge.f1.I2 r4 = com.github.catvod.spider.merge.f1.I2.c
            if (r3 == r4) goto L4a
            goto L47
        L2a:
            boolean r3 = r1 instanceof com.github.catvod.spider.merge.f1.E0
            if (r3 == 0) goto L3f
            java.lang.Object r1 = r1.l(r9, r1)
            com.github.catvod.spider.merge.f1.I2 r3 = com.github.catvod.spider.merge.f1.I2.c
            if (r1 == r3) goto L4a
            if (r10 == 0) goto L3c
            com.github.catvod.spider.merge.f1.n2 r7 = com.github.catvod.spider.merge.f1.p2.u0(r8)
        L3c:
            r8 = r7
            r7 = r1
            goto L65
        L3f:
            java.lang.Object r3 = com.github.catvod.spider.merge.f1.p2.t0(r1, r9)
            com.github.catvod.spider.merge.f1.I2 r4 = com.github.catvod.spider.merge.f1.I2.c
            if (r3 == r4) goto L4a
        L47:
            r8 = r1
            r7 = r3
            goto L65
        L4a:
            com.github.catvod.spider.merge.f1.n2 r1 = r8.B()
            if (r1 != 0) goto L75
            java.lang.Object r7 = B1(r6, r8, r9)
            com.github.catvod.spider.merge.f1.I2 r1 = com.github.catvod.spider.merge.f1.I2.c
            if (r7 != r1) goto L65
            if (r2 == 0) goto L61
            if (r10 != 0) goto L61
            java.lang.Object r7 = r2.l(r9, r2)
            goto L65
        L61:
            B0(r9)
            throw r0
        L65:
            if (r10 == 0) goto L74
            boolean r10 = r7 instanceof com.github.catvod.spider.merge.f1.InterfaceC1161n
            if (r10 == 0) goto L6f
            Z0(r6, r8)
            goto L74
        L6f:
            java.lang.RuntimeException r6 = D0(r7, r9)
            throw r6
        L74:
            return r7
        L75:
            r5 = r1
            r1 = r8
            r8 = r5
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.t0(com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.String, boolean):java.lang.Object");
    }

    public static n2 t1(C1185v c1185v, n2 n2Var, Object obj) {
        B2 b2 = B2.Symbol;
        if (obj == null) {
            throw C1("msg.null.to.object", new Object[0]);
        }
        if (G2.b(obj)) {
            throw C1("msg.undef.to.object", new Object[0]);
        }
        if (j0(obj)) {
            if (obj instanceof x2) {
                M1 m1 = new M1((x2) obj);
                P0(m1, n2Var, b2);
                return m1;
            }
            M1 m12 = new M1((M1) obj);
            P0(m12, n2Var, b2);
            return m12;
        }
        if (obj instanceof n2) {
            return (n2) obj;
        }
        if (obj instanceof CharSequence) {
            K1 k1 = new K1((CharSequence) obj);
            P0(k1, n2Var, B2.String);
            return k1;
        }
        c1185v.getClass();
        if (obj instanceof Number) {
            C1181t1 c1181t1 = new C1181t1(((Number) obj).doubleValue());
            P0(c1181t1, n2Var, B2.Number);
            return c1181t1;
        }
        if (obj instanceof Boolean) {
            D0 d0 = new D0(((Boolean) obj).booleanValue());
            P0(d0, n2Var, B2.Boolean);
            return d0;
        }
        Object objC = c1185v.s().c(c1185v, n2Var, obj, null);
        if (objC instanceof n2) {
            return (n2) objC;
        }
        throw C("msg.invalid.type", obj);
    }

    public static Object u(Object obj, C1185v c1185v, n2 n2Var, int i2) {
        C1141h2 c1141h2 = new C1141h2(null);
        n2 n2VarU1 = u1(c1185v, obj, n2Var);
        c1141h2.b = n2VarU1;
        if (i2 != 6) {
            if (n2VarU1 == null) {
                return c1141h2;
            }
            c1141h2.g = i2;
            c1141h2.i = null;
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                c1141h2.i = n1(c1185v, n2VarU1.B(), c1141h2.b, i2 == 0);
            }
            if (c1141h2.i == null) {
                s(c1141h2);
            }
            return c1141h2;
        }
        c1141h2.g = i2;
        c1141h2.i = null;
        if (n2VarU1 instanceof y2) {
            x2 x2Var = x2.c;
            if (p2.x0(n2VarU1, x2Var)) {
                Object objS0 = p2.s0(c1141h2.b, x2Var);
                if (!(objS0 instanceof InterfaceC1161n)) {
                    throw C1("msg.not.iterable", x1(c1141h2.b));
                }
                Object objB = ((InterfaceC1161n) objS0).b(c1185v, c1141h2.b.B(), c1141h2.b, new Object[0]);
                if (!(objB instanceof n2)) {
                    throw C1("msg.not.iterable", x1(c1141h2.b));
                }
                c1141h2.i = (n2) objB;
                return c1141h2;
            }
        }
        throw C1("msg.not.iterable", x1(c1141h2.b));
    }

    public static Z1 u0(Object obj, C1185v c1185v, n2 n2Var, int i2) {
        return k(c1185v).e();
    }

    public static n2 u1(C1185v c1185v, Object obj, n2 n2Var) {
        if (obj instanceof n2) {
            return (n2) obj;
        }
        if (obj == null || G2.b(obj)) {
            return null;
        }
        return t1(c1185v, n2Var, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Boolean v(Object obj, C1185v c1185v) {
        Object objValueOf;
        C1141h2 c1141h2 = (C1141h2) obj;
        n2 n2Var = c1141h2.i;
        if (n2Var != null) {
            if (c1141h2.g != 6) {
                Object objT0 = p2.t0(n2Var, "next");
                if (!(objT0 instanceof InterfaceC1161n)) {
                    return Boolean.FALSE;
                }
                try {
                    c1141h2.e = ((InterfaceC1161n) objT0).b(c1185v, c1141h2.i.B(), c1141h2.i, y);
                    return Boolean.TRUE;
                } catch (C1155l0 e2) {
                    if (e2.k() instanceof U0) {
                        return Boolean.FALSE;
                    }
                    throw e2;
                }
            }
            Object objT02 = p2.t0(n2Var, "next");
            if (!(objT02 instanceof InterfaceC1161n)) {
                throw D0(c1141h2.i, "next");
            }
            n2 n2VarB = c1141h2.i.B();
            n2 n2VarT1 = t1(c1185v, n2VarB, ((InterfaceC1161n) objT02).b(c1185v, n2VarB, c1141h2.i, y));
            Object objT03 = p2.t0(n2VarT1, "done");
            int i2 = n2.a;
            if (objT03 != I2.c && g1(objT03)) {
                return Boolean.FALSE;
            }
            c1141h2.e = p2.t0(n2VarT1, "value");
            return Boolean.TRUE;
        }
        while (true) {
            n2 n2Var2 = c1141h2.b;
            if (n2Var2 == null) {
                return Boolean.FALSE;
            }
            int i3 = c1141h2.f;
            Object[] objArr = c1141h2.c;
            if (i3 == objArr.length) {
                c1141h2.b = n2Var2.C();
                s(c1141h2);
            } else {
                c1141h2.f = i3 + 1;
                Object obj2 = objArr[i3];
                U1 u1 = c1141h2.d;
                if (u1 == null || !u1.e(obj2)) {
                    if (obj2 instanceof w2) {
                        continue;
                    } else if (obj2 instanceof String) {
                        objValueOf = (String) obj2;
                        n2 n2Var3 = c1141h2.b;
                        if (n2Var3.x(objValueOf, n2Var3)) {
                            break;
                        }
                    } else {
                        int iIntValue = ((Number) obj2).intValue();
                        n2 n2Var4 = c1141h2.b;
                        if (n2Var4.z(iIntValue, n2Var4)) {
                            objValueOf = c1141h2.h ? Integer.valueOf(iIntValue) : String.valueOf(iIntValue);
                        }
                    }
                }
            }
        }
        c1141h2.e = objValueOf;
        return Boolean.TRUE;
    }

    public static Z1 v0(Object obj, Object obj2, C1185v c1185v, n2 n2Var, int i2) {
        return k(c1185v).f();
    }

    public static Object v1(Object obj, Class<?> cls) {
        if (!(obj instanceof n2)) {
            return obj;
        }
        Object objM = ((n2) obj).m(cls);
        if (!(objM instanceof n2) || j0(objM)) {
            return objM;
        }
        throw C1("msg.bad.default.value", new Object[0]);
    }

    public static Object w(Object obj) {
        C1141h2 c1141h2 = (C1141h2) obj;
        if (j0(c1141h2.e)) {
            return p2.b0(c1141h2.b).e((w2) c1141h2.e, c1141h2.b);
        }
        C1153k2 c1153k2Z1 = z1(c1141h2.e);
        String str = c1153k2Z1.a;
        n2 n2Var = c1141h2.b;
        return str == null ? n2Var.w(c1153k2Z1.b, n2Var) : n2Var.l(str, n2Var);
    }

    public static Number w0(Number number) {
        return number instanceof BigInteger ? ((BigInteger) number).negate() : Double.valueOf(-number.doubleValue());
    }

    public static String w1(double d2) {
        return G0(d2, 10);
    }

    public static boolean x(Object obj, Object obj2) {
        Object objC0;
        Object objC02;
        Object objC03;
        Object objC04;
        Object objC05;
        if (obj == null || G2.b(obj)) {
            if (obj2 == null || G2.b(obj2)) {
                return true;
            }
            if (!(obj2 instanceof p2) || (objC0 = ((p2) obj2).c0(obj)) == I2.c) {
                return false;
            }
            return ((Boolean) objC0).booleanValue();
        }
        if (obj instanceof BigInteger) {
            return z((BigInteger) obj, obj2);
        }
        if (obj instanceof Number) {
            return A(((Number) obj).doubleValue(), obj2);
        }
        if (obj == obj2) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return B((CharSequence) obj, obj2);
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (obj2 instanceof Boolean) {
                return zBooleanValue == ((Boolean) obj2).booleanValue();
            }
            if (!(obj2 instanceof p2) || (objC05 = ((p2) obj2).c0(obj)) == I2.c) {
                return A(zBooleanValue ? 1.0d : 0.0d, obj2);
            }
            return ((Boolean) objC05).booleanValue();
        }
        if (!(obj instanceof n2)) {
            L1(obj);
            return obj == obj2;
        }
        if (obj instanceof C1086B) {
            obj = ((C1086B) obj).b;
            if (obj2 instanceof C1086B) {
                return x(obj, ((C1086B) obj2).b);
            }
            if (obj == obj2) {
                return true;
            }
        }
        if ((obj2 instanceof C1086B) && ((C1086B) obj2).b == obj) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            if (obj2 instanceof Boolean) {
                if (!(obj instanceof p2) || (objC02 = ((p2) obj).c0(obj2)) == I2.c) {
                    return A(((Boolean) obj2).booleanValue() ? 1.0d : 0.0d, obj);
                }
                return ((Boolean) objC02).booleanValue();
            }
            if (obj2 instanceof BigInteger) {
                return z((BigInteger) obj2, obj);
            }
            if (obj2 instanceof Number) {
                return A(((Number) obj2).doubleValue(), obj);
            }
            if (obj2 instanceof CharSequence) {
                return B((CharSequence) obj2, obj);
            }
            return false;
        }
        if ((obj instanceof p2) && (objC04 = ((p2) obj).c0(obj2)) != I2.c) {
            return ((Boolean) objC04).booleanValue();
        }
        if ((obj2 instanceof p2) && (objC03 = ((p2) obj2).c0(obj)) != I2.c) {
            return ((Boolean) objC03).booleanValue();
        }
        if ((obj instanceof L2) && (obj2 instanceof L2)) {
            Object objC = ((L2) obj).c();
            Object objC2 = ((L2) obj2).c();
            if (objC == objC2) {
                return true;
            }
            if (g0(objC) && g0(objC2) && x(objC, objC2)) {
                return true;
            }
        }
        return false;
    }

    public static n2 x0(Object[] objArr, int[] iArr, C1185v c1185v, n2 n2Var) {
        int length = objArr.length;
        int i2 = 0;
        int length2 = iArr != null ? iArr.length : 0;
        int i3 = length + length2;
        if (i3 <= 1 || length2 * 2 >= i3) {
            n2 n2VarW = c1185v.w(n2Var, i3);
            int i4 = 0;
            int i5 = 0;
            while (i2 != i3) {
                if (i4 == length2 || iArr[i4] != i2) {
                    n2 n2Var2 = (B0) n2VarW;
                    n2Var2.t(i2, n2Var2, objArr[i5]);
                    i5++;
                } else {
                    i4++;
                }
                i2++;
            }
            return n2VarW;
        }
        if (length2 != 0) {
            Object[] objArr2 = new Object[i3];
            int i6 = 0;
            int i7 = 0;
            while (i2 != i3) {
                if (i6 == length2 || iArr[i6] != i2) {
                    objArr2[i2] = objArr[i7];
                    i7++;
                } else {
                    int i8 = n2.a;
                    objArr2[i2] = I2.c;
                    i6++;
                }
                i2++;
            }
            objArr = objArr2;
        }
        return c1185v.x(n2Var, objArr);
    }

    public static String x1(Object obj) {
        while (obj != null) {
            if (G2.b(obj)) {
                return "undefined";
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof CharSequence) && !(obj instanceof BigInteger)) {
                if (obj instanceof Number) {
                    return G0(((Number) obj).doubleValue(), 10);
                }
                if (obj instanceof w2) {
                    throw C1("msg.not.a.string", new Object[0]);
                }
                if (!(obj instanceof n2)) {
                    return obj.toString();
                }
                obj = ((n2) obj).m(l);
                if ((obj instanceof n2) && !j0(obj)) {
                    throw C("msg.primitive.expected", obj);
                }
            }
            return obj.toString();
        }
        return "null";
    }

    private static boolean y(BigInteger bigInteger, double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return false;
        }
        double dCeil = Math.ceil(d2);
        return dCeil == d2 && new BigDecimal(bigInteger).compareTo(new BigDecimal(dCeil, MathContext.UNLIMITED)) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.f1.n2 y0(java.lang.Throwable r10, com.github.catvod.spider.merge.f1.n2 r11, java.lang.String r12, com.github.catvod.spider.merge.f1.C1185v r13, com.github.catvod.spider.merge.f1.n2 r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.y0(java.lang.Throwable, com.github.catvod.spider.merge.f1.n2, java.lang.String, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2):com.github.catvod.spider.merge.f1.n2");
    }

    public static String y1(Object[] objArr) {
        return objArr.length > 0 ? x1(objArr[0]) : "undefined";
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean z(java.math.BigInteger r2, java.lang.Object r3) {
        /*
        L0:
            r0 = 0
            if (r3 == 0) goto L72
            boolean r1 = com.github.catvod.spider.merge.f1.G2.b(r3)
            if (r1 == 0) goto La
            goto L72
        La:
            boolean r1 = r3 instanceof java.math.BigInteger
            if (r1 == 0) goto L13
            boolean r2 = r2.equals(r3)
            return r2
        L13:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L22
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            boolean r2 = y(r2, r0)
            return r2
        L22:
            boolean r1 = r3 instanceof java.lang.CharSequence
            if (r1 == 0) goto L30
            java.math.BigInteger r3 = e1(r3)     // Catch: com.github.catvod.spider.merge.f1.C1089E -> L2f
            boolean r2 = r2.equals(r3)
            return r2
        L2f:
            return r0
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            if (r1 == 0) goto L46
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3f
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            goto L41
        L3f:
            java.math.BigInteger r3 = java.math.BigInteger.ZERO
        L41:
            boolean r2 = r2.equals(r3)
            return r2
        L46:
            boolean r1 = j0(r3)
            if (r1 == 0) goto L4d
            return r0
        L4d:
            boolean r1 = r3 instanceof com.github.catvod.spider.merge.f1.n2
            if (r1 == 0) goto L6f
            boolean r0 = r3 instanceof com.github.catvod.spider.merge.f1.p2
            if (r0 == 0) goto L69
            r0 = r3
            com.github.catvod.spider.merge.f1.p2 r0 = (com.github.catvod.spider.merge.f1.p2) r0
            java.lang.Object r0 = r0.c0(r2)
            int r1 = com.github.catvod.spider.merge.f1.n2.a
            com.github.catvod.spider.merge.f1.I2 r1 = com.github.catvod.spider.merge.f1.I2.c
            if (r0 == r1) goto L69
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            return r2
        L69:
            r0 = 0
            java.lang.Object r3 = v1(r3, r0)
            goto L0
        L6f:
            L1(r3)
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.C1157l2.z(java.math.BigInteger, java.lang.Object):boolean");
    }

    static n2 z0(C1185v c1185v, n2 n2Var, C2 c2, Object[] objArr) {
        n2 n2VarU0 = p2.u0(n2Var);
        return D2.s1(c1185v, n2VarU0, c2).a(c1185v, n2VarU0, objArr);
    }

    public static C1153k2 z1(Object obj) {
        if (!(obj instanceof Number)) {
            String strX1 = obj instanceof String ? (String) obj : x1(obj);
            long jZ = Z(strX1);
            return (jZ < 0 || jZ > 2147483647L) ? new C1153k2(strX1) : new C1153k2((int) jZ);
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        if (dDoubleValue < 0.0d) {
            return new C1153k2(x1(obj));
        }
        int i2 = (int) dDoubleValue;
        return ((double) i2) == dDoubleValue ? new C1153k2(i2) : new C1153k2(x1(obj));
    }
}
