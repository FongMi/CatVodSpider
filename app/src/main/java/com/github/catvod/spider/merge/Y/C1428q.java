package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.I.t0;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1428q {
    private static final Pattern f = Pattern.compile("'\\s*,\\s*'");
    private final String a;
    private int b;
    private char c;
    private int d;
    private boolean e;

    public C1428q(String str) {
        this.a = str;
        g();
    }

    static boolean e(char c) {
        return c == '-' || c == '+' || (c >= '0' && c <= '9');
    }

    final void a(char c) {
        if (this.c == ' ') {
            g();
        }
        if (this.c == c) {
            if (f()) {
                return;
            }
            g();
        } else {
            throw new O("expect '" + c + ", but '" + this.c + "'");
        }
    }

    public final G[] c() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        G[] gArr = new G[8];
        while (true) {
            G gK = k();
            if (gK == null) {
                break;
            }
            if (gK instanceof C1410B) {
                C1410B c1410b = (C1410B) gK;
                if (c1410b.c || !c1410b.a.equals("*")) {
                }
            }
            int i = this.d;
            if (i == gArr.length) {
                G[] gArr2 = new G[(i * 3) / 2];
                System.arraycopy(gArr, 0, gArr2, 0, i);
                gArr = gArr2;
            }
            int i2 = this.d;
            this.d = i2 + 1;
            gArr[i2] = gK;
        }
        int i3 = this.d;
        if (i3 == gArr.length) {
            return gArr;
        }
        G[] gArr3 = new G[i3];
        System.arraycopy(gArr, 0, gArr3, 0, i3);
        return gArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003b -> B:19:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.y.InterfaceC1420i d(com.github.catvod.spider.merge.y.InterfaceC1420i r7) {
        /*
            r6 = this;
            char r0 = r6.c
            r1 = 1
            r2 = 0
            r3 = 38
            if (r0 != r3) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            if (r0 != r3) goto L17
            java.lang.String r0 = r6.a
            int r5 = r6.b
            char r0 = r0.charAt(r5)
            if (r0 == r3) goto L27
        L17:
            char r0 = r6.c
            r3 = 124(0x7c, float:1.74E-43)
            if (r0 != r3) goto L58
            java.lang.String r0 = r6.a
            int r5 = r6.b
            char r0 = r0.charAt(r5)
            if (r0 != r3) goto L58
        L27:
            r6.g()
            r6.g()
            char r0 = r6.c
            r3 = 40
            if (r0 != r3) goto L35
            r0 = r6
            goto L3d
        L35:
            r1 = 0
            r0 = r6
        L37:
            char r3 = r0.c
            r5 = 32
            if (r3 != r5) goto L41
        L3d:
            r0.g()
            goto L37
        L41:
            java.lang.Object r2 = r0.h(r2)
            com.github.catvod.spider.merge.y.i r2 = (com.github.catvod.spider.merge.y.InterfaceC1420i) r2
            com.github.catvod.spider.merge.y.j r3 = new com.github.catvod.spider.merge.y.j
            r3.<init>(r7, r2, r4)
            if (r1 == 0) goto L57
            char r7 = r0.c
            r1 = 41
            if (r7 != r1) goto L57
            r0.g()
        L57:
            r7 = r3
        L58:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.C1428q.d(com.github.catvod.spider.merge.y.i):com.github.catvod.spider.merge.y.i");
    }

    final boolean f() {
        return this.b >= this.a.length();
    }

    final void g() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        this.c = str.charAt(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object h(boolean r21) {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.C1428q.h(boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r1 != '-') goto L7;
     */
    /* JADX WARN: Path cross not found for [B:6:0x000e, B:4:0x000a], limit reached: 13 */
    /* JADX WARN: Path cross not found for [B:6:0x000e, B:7:0x0011], limit reached: 13 */
    /* JADX WARN: Path cross not found for [B:7:0x0011, B:6:0x000e], limit reached: 13 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0019 -> B:6:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final long i() {
        /*
            r3 = this;
            int r0 = r3.b
            int r0 = r0 + (-1)
            char r1 = r3.c
            r2 = 43
            if (r1 == r2) goto Le
            r2 = 45
            if (r1 != r2) goto L11
        Le:
            r3.g()
        L11:
            char r1 = r3.c
            r2 = 48
            if (r1 < r2) goto L1c
            r2 = 57
            if (r1 > r2) goto L1c
            goto Le
        L1c:
            int r1 = r3.b
            int r1 = r1 + (-1)
            java.lang.String r2 = r3.a
            java.lang.String r0 = r2.substring(r0, r1)
            long r0 = java.lang.Long.parseLong(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.C1428q.i():long");
    }

    final String j() {
        n();
        char c = this.c;
        if (c != '\\' && !Character.isJavaIdentifierStart(c)) {
            StringBuilder sbB = t0.b("illeal jsonpath syntax. ");
            sbB.append(this.a);
            throw new O(sbB.toString());
        }
        StringBuilder sb = new StringBuilder();
        while (!f()) {
            char c2 = this.c;
            if (c2 == '\\') {
                g();
                sb.append(this.c);
                if (f()) {
                    return sb.toString();
                }
            } else {
                if (!Character.isJavaIdentifierPart(c2)) {
                    break;
                }
                sb.append(this.c);
            }
            g();
        }
        if (f() && Character.isJavaIdentifierPart(this.c)) {
            sb.append(this.c);
        }
        return sb.toString();
    }

    final G k() {
        boolean z;
        if (this.d == 0 && this.a.length() == 1) {
            if (e(this.c)) {
                return new C1418g(this.c - '0');
            }
            char c = this.c;
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                return new C1410B(Character.toString(c), false);
            }
        }
        while (!f()) {
            n();
            char c2 = this.c;
            if (c2 != '$') {
                if (c2 != '.' && c2 != '/') {
                    if (c2 == '[') {
                        Object objH = h(true);
                        return objH instanceof G ? (G) objH : new C1422k((InterfaceC1420i) objH);
                    }
                    if (this.d == 0) {
                        return new C1410B(j(), false);
                    }
                    if (c2 == '?') {
                        return new C1422k((InterfaceC1420i) h(false));
                    }
                    StringBuilder sbB = t0.b("not support jsonpath : ");
                    sbB.append(this.a);
                    throw new O(sbB.toString());
                }
                g();
                if (c2 == '.' && this.c == '.') {
                    g();
                    int length = this.a.length();
                    int i = this.b;
                    if (length > i + 3 && this.c == '[' && this.a.charAt(i) == '*' && this.a.charAt(this.b + 1) == ']' && this.a.charAt(this.b + 2) == '.') {
                        g();
                        g();
                        g();
                        g();
                    }
                    z = true;
                } else {
                    z = false;
                }
                char c3 = this.c;
                if (c3 == '*' || (z && c3 == '[')) {
                    boolean z2 = c3 == '[';
                    if (!f()) {
                        g();
                    }
                    return z ? z2 ? M.d : M.c : M.b;
                }
                if (e(c3)) {
                    Object objH2 = h(false);
                    return objH2 instanceof G ? (G) objH2 : new C1422k((InterfaceC1420i) objH2);
                }
                String strJ = j();
                if (this.c != '(') {
                    return new C1410B(strJ, z);
                }
                g();
                if (this.c != ')') {
                    StringBuilder sbB2 = t0.b("not support jsonpath : ");
                    sbB2.append(this.a);
                    throw new O(sbB2.toString());
                }
                if (!f()) {
                    g();
                }
                if ("size".equals(strJ) || "length".equals(strJ)) {
                    return H.a;
                }
                if ("max".equals(strJ)) {
                    return C1430t.a;
                }
                if ("min".equals(strJ)) {
                    return C1431u.a;
                }
                if ("keySet".equals(strJ)) {
                    return r.a;
                }
                if ("type".equals(strJ)) {
                    return K.a;
                }
                if ("floor".equals(strJ)) {
                    return C1423l.a;
                }
                StringBuilder sbB3 = t0.b("not support jsonpath : ");
                sbB3.append(this.a);
                throw new O(sbB3.toString());
            }
            g();
            n();
            if (this.c == '?') {
                return new C1422k((InterfaceC1420i) h(false));
            }
        }
        return null;
    }

    final String l() {
        char c = this.c;
        g();
        int i = this.b - 1;
        while (this.c != c && !f()) {
            g();
        }
        String strSubstring = this.a.substring(i, f() ? this.b : this.b - 1);
        a(c);
        return strSubstring;
    }

    protected final Object m() {
        n();
        if (e(this.c)) {
            return Long.valueOf(i());
        }
        char c = this.c;
        if (c == '\"' || c == '\'') {
            return l();
        }
        if (c != 'n') {
            throw new UnsupportedOperationException();
        }
        if ("null".equals(j())) {
            return null;
        }
        throw new O(this.a);
    }

    public final void n() {
        while (true) {
            char c = this.c;
            if (c > ' ') {
                return;
            }
            if (c != ' ' && c != '\r' && c != '\n' && c != '\t' && c != '\f' && c != '\b') {
                return;
            } else {
                g();
            }
        }
    }
}
