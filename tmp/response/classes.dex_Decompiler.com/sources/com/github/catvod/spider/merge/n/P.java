package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class P {
    private static final String[] d = {oZP.d("59"), oZP.d("4B"), oZP.d("5E"), oZP.d("0B"), oZP.d("55")};
    private static final String[] e = {oZP.d("48"), oZP.d("5452"), oZP.d("2B52"), oZP.d("5152"), oZP.d("5F52"), oZP.d("0B52")};
    private static final Pattern f = Pattern.compile(oZP.d("5D472C6A41085C505F1D087E5C505E2F440906455F1A47782846481D1F7F290B5C6853"), 2);
    private static final Pattern g = Pattern.compile(oZP.d("5D345C6C317C4A472B25477C"));
    private final com.github.catvod.spider.merge.M.S a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.J.c.e(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.M.S(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.N.N>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.N.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.N.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.N.N>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.P.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.K.b.f;
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                }
                if (!Character.isDigit(strTrim.codePointAt(i2))) {
                    break;
                }
                i2++;
            }
        }
        com.github.catvod.spider.merge.J.c.d(z, oZP.d("3C0113241475181A04354C37104F19340130070614"));
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void c(boolean z) {
        String strD = z ? oZP.d("4F0C182F18341C01040E1B3B") : oZP.d("4F0C182F18341C0104");
        this.a.d(strD);
        String strO = com.github.catvod.spider.merge.M.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.J.c.f(strO, strD + oZP.d("5D1B1239187C551E02241E2C5502023218751B0003610E30550A1A31182C"));
        this.c.add(z ? new r(strO) : new C0085s(strO, 0));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void d(boolean z) {
        String strD = z ? oZP.d("4F0C182F18341C010416043A190A38360201101703") : oZP.d("4F0C182F18341C010416043A190A23241421");
        this.a.d(strD);
        String strO = com.github.catvod.spider.merge.M.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.J.c.f(strO, strD + oZP.d("5D1B1239187C551E02241E2C5502023218751B0003610E30550A1A31182C"));
        this.c.add(z ? new C0086t(strO, 0) : new C0087u(strO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(boolean r9, boolean r10) {
        /*
            r8 = this;
            com.github.catvod.spider.merge.M.S r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.B.l.d(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.N.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.N.P.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "1A0B13"
            java.lang.String r3 = com.github.catvod.spider.merge.oZP.d(r3)
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            r6 = 2
            if (r3 == 0) goto L28
            r0 = 1
        L26:
            r4 = 2
            goto L80
        L28:
            java.lang.String r3 = "1019122F"
            java.lang.String r3 = com.github.catvod.spider.merge.oZP.d(r3)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r0 = 0
            goto L26
        L36:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "2B335C"
            java.lang.String r7 = com.github.catvod.spider.merge.oZP.d(r7)
            if (r3 == 0) goto L6e
            r0 = 3
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = r1.group(r5)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r5 = java.lang.Integer.parseInt(r0)
        L57:
            r0 = 4
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L6b
            java.lang.String r0 = r1.group(r0)
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4 = r0
        L6b:
            r0 = r4
            r4 = r5
            goto L80
        L6e:
            boolean r1 = r2.matches()
            if (r1 == 0) goto La9
            java.lang.String r0 = r2.group()
            java.lang.String r0 = r0.replaceFirst(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
        L80:
            if (r10 == 0) goto L94
            if (r9 == 0) goto L8c
            java.util.List<com.github.catvod.spider.merge.N.N> r9 = r8.c
            com.github.catvod.spider.merge.N.I r10 = new com.github.catvod.spider.merge.N.I
            r10.<init>(r4, r0)
            goto La5
        L8c:
            java.util.List<com.github.catvod.spider.merge.N.N> r9 = r8.c
            com.github.catvod.spider.merge.N.J r10 = new com.github.catvod.spider.merge.N.J
            r10.<init>(r4, r0)
            goto La5
        L94:
            if (r9 == 0) goto L9e
            java.util.List<com.github.catvod.spider.merge.N.N> r9 = r8.c
            com.github.catvod.spider.merge.N.H r10 = new com.github.catvod.spider.merge.N.H
            r10.<init>(r4, r0)
            goto La5
        L9e:
            java.util.List<com.github.catvod.spider.merge.N.N> r9 = r8.c
            com.github.catvod.spider.merge.N.G r10 = new com.github.catvod.spider.merge.N.G
            r10.<init>(r4, r0)
        La5:
            r9.add(r10)
            return
        La9:
            com.github.catvod.spider.merge.N.Q r9 = new com.github.catvod.spider.merge.N.Q
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "3600022D08751B0003611C34071C126102211D421E2F08300D4F50641F724F4F022F092D050A1435093155091833013401"
            java.lang.String r0 = com.github.catvod.spider.merge.oZP.d(r0)
            r9.<init>(r0, r10)
            goto Lba
        Lb9:
            throw r9
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.P.e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void f() {
        List<N> list;
        Object l;
        List<N> list2;
        Object e2;
        List<N> list3;
        Object c0082o;
        List<N> list4;
        Object c0076i;
        if (this.a.j(oZP.d("56"))) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.J.c.e(strE);
            this.c.add(new C0089w(strE));
            return;
        }
        int i = 1;
        if (this.a.j(oZP.d("5B"))) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.J.c.e(strE2);
            this.c.add(new C0076i(strE2.trim(), i));
            return;
        }
        boolean zM = this.a.m();
        String strD = oZP.d("5F13");
        int i2 = 0;
        if (zM || this.a.k(strD)) {
            String strD2 = com.github.catvod.spider.merge.B.l.d(this.a.f());
            com.github.catvod.spider.merge.J.c.e(strD2);
            boolean zStartsWith = strD2.startsWith(strD);
            String strD3 = oZP.d("4F");
            if (zStartsWith) {
                this.c.add(new C0072e(new C0085s(strD2.substring(2), 1), new C0086t(strD2.replace(strD, strD3), i)));
                return;
            } else {
                String strD4 = oZP.d("09");
                if (strD2.contains(strD4)) {
                    strD2 = strD2.replace(strD4, strD3);
                }
                this.c.add(new C0085s(strD2, 1));
                return;
            }
        }
        if (this.a.k(oZP.d("2E"))) {
            com.github.catvod.spider.merge.M.S s = new com.github.catvod.spider.merge.M.S(this.a.a('[', ']'));
            String strG = s.g(e);
            com.github.catvod.spider.merge.J.c.e(strG);
            s.h();
            if (s.i()) {
                if (strG.startsWith(oZP.d("2B"))) {
                    list4 = this.c;
                    c0076i = new C0078k(strG.substring(1), 0);
                } else {
                    list4 = this.c;
                    c0076i = new C0076i(strG, i2);
                }
                list4.add(c0076i);
                return;
            }
            if (s.j(oZP.d("48"))) {
                list3 = this.c;
                c0082o = new C0079l(strG, s.n());
            } else if (s.j(oZP.d("5452"))) {
                list3 = this.c;
                c0082o = new C0083p(strG, s.n());
            } else if (s.j(oZP.d("2B52"))) {
                list3 = this.c;
                c0082o = new C0084q(strG, s.n());
            } else if (s.j(oZP.d("5152"))) {
                list3 = this.c;
                c0082o = new C0081n(strG, s.n());
            } else if (s.j(oZP.d("5F52"))) {
                list3 = this.c;
                c0082o = new C0080m(strG, s.n());
            } else {
                if (!s.j(oZP.d("0B52"))) {
                    throw new Q(oZP.d("3600022D08751B0003611C34071C12610D21011D1E231921104F063409270C4F50641F724F4F022F092D050A14350931551B182A093B550E03614B700648"), this.b, s.n());
                }
                list3 = this.c;
                c0082o = new C0082o(strG, Pattern.compile(s.n()));
            }
            list3.add(c0082o);
            return;
        }
        if (this.a.j(oZP.d("5F"))) {
            this.c.add(new C0075h());
            return;
        }
        if (this.a.j(oZP.d("4F030369"))) {
            this.c.add(new A(b()));
            return;
        }
        if (this.a.j(oZP.d("4F080369"))) {
            this.c.add(new C0092z(b()));
            return;
        }
        if (this.a.j(oZP.d("4F0A0669"))) {
            this.c.add(new C0090x(b()));
            return;
        }
        if (this.a.k(oZP.d("4F07163244"))) {
            this.a.d(oZP.d("4F071632"));
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.J.c.f(strA, oZP.d("4F071632442610031222183A074657321937581C122D0936014F1A341F21550118354C37104F122C1C210C"));
            this.c.add(new T(j(strA)));
            return;
        }
        if (this.a.k(oZP.d("4F0C182F18341C010469"))) {
            c(false);
            return;
        }
        if (this.a.k(oZP.d("4F0C182F18341C01040E1B3B5D"))) {
            c(true);
            return;
        }
        if (this.a.k(oZP.d("4F0C182F18341C010416043A190A232414215D"))) {
            d(false);
            return;
        }
        if (this.a.k(oZP.d("4F0C182F18341C010416043A190A3836020110170369"))) {
            d(true);
            return;
        }
        if (this.a.k(oZP.d("4F0C182F18341C0104050D211447"))) {
            this.a.d(oZP.d("4F0C182F18341C0104050D2114"));
            String strO = com.github.catvod.spider.merge.M.S.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.J.c.f(strO, oZP.d("4F0C182F18341C0104050D211447032414215C4F063409270C4F1A341F21550118354C37104F122C1C210C"));
            this.c.add(new C0078k(strO, 1));
            return;
        }
        if (this.a.k(oZP.d("4F0216350F3D101C5F"))) {
            g(false);
            return;
        }
        if (this.a.k(oZP.d("4F0216350F3D101C3836027D"))) {
            g(true);
            return;
        }
        if (this.a.k(oZP.d("4F0216350F3D101C20290339103B1239187D"))) {
            h(false);
            return;
        }
        if (this.a.k(oZP.d("4F0216350F3D101C202903391020002F38300D1B5F"))) {
            h(true);
            return;
        }
        if (this.a.k(oZP.d("4F01183544"))) {
            this.a.d(oZP.d("4F011835"));
            String strA2 = this.a.a('(', ')');
            com.github.catvod.spider.merge.J.c.f(strA2, oZP.d("4F011835442610031222183A074657321937060A1B240F215502023218751B0003610E30550A1A31182C"));
            this.c.add(new W(j(strA2)));
            return;
        }
        if (this.a.j(oZP.d("4F01032941361D061B2544"))) {
            e(false, false);
            return;
        }
        if (this.a.j(oZP.d("4F0103294139141C036C0F3D1C031369"))) {
            e(true, false);
            return;
        }
        if (this.a.j(oZP.d("4F010329413A134203381C305D"))) {
            e(false, true);
            return;
        }
        if (this.a.j(oZP.d("4F0103294139141C036C0333581B0E31097D"))) {
            e(true, true);
            return;
        }
        if (this.a.j(oZP.d("4F091E331F21580C1F280031"))) {
            list = this.c;
            l = new C(i2);
        } else if (this.a.j(oZP.d("4F031632187816071E2D08"))) {
            list = this.c;
            l = new E(i2);
        } else if (this.a.j(oZP.d("4F091E331F215800116C182C050A"))) {
            list = this.c;
            l = new D();
        } else {
            if (!this.a.j(oZP.d("4F03163218781A095A35152510"))) {
                if (this.a.j(oZP.d("4F00192D157816071E2D08"))) {
                    list2 = this.c;
                    e2 = new C(i);
                } else if (this.a.j(oZP.d("4F00192D15781A095A35152510"))) {
                    list = this.c;
                    l = new K();
                } else if (this.a.j(oZP.d("4F0A1A31182C"))) {
                    list = this.c;
                    l = new B();
                } else if (this.a.j(oZP.d("4F1D182E18"))) {
                    list2 = this.c;
                    e2 = new E(i);
                } else {
                    if (!this.a.j(oZP.d("4F0216350F3D210A0F35"))) {
                        throw new Q(oZP.d("3600022D08751B0003611C34071C12611D20101D0E614B7006484D61193B101707240F21100B5735033E100157201875524A0466"), this.b, this.a.n());
                    }
                    list = this.c;
                    l = new L();
                }
                list2.add(e2);
                return;
            }
            list = this.c;
            l = new F();
        }
        list.add(l);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void g(boolean z) {
        String strD = z ? oZP.d("4F0216350F3D101C383602") : oZP.d("4F0216350F3D101C");
        this.a.d(strD);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.J.c.f(strA, strD + oZP.d("5D1D1226092D5C4F063409270C4F1A341F21550118354C37104F122C1C210C"));
        this.c.add(z ? new C0076i(Pattern.compile(strA), 2) : new M(Pattern.compile(strA)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void h(boolean z) {
        String strD = z ? oZP.d("4F0216350F3D101C202903391020002F38300D1B") : oZP.d("4F0216350F3D101C20290339103B123918");
        this.a.d(strD);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.J.c.f(strA, strD + oZP.d("5D1D1226092D5C4F063409270C4F1A341F21550118354C37104F122C1C210C"));
        this.c.add(z ? new C0078k(Pattern.compile(strA)) : new r(Pattern.compile(strA)));
    }

    public static N j(String str) {
        try {
            return new P(str).i();
        } catch (IllegalArgumentException e2) {
            throw new Q(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.github.catvod.spider.merge.N.N i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.M.S r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.M.S r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.N.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.N.N> r0 = r4.c
            com.github.catvod.spider.merge.N.Z r1 = new com.github.catvod.spider.merge.N.Z
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.f()
        L1f:
            com.github.catvod.spider.merge.M.S r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.M.S r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.M.S r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.N.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.M.S r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.N.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.N.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.N.N r0 = (com.github.catvod.spider.merge.N.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.N.d r1 = new com.github.catvod.spider.merge.N.d
            java.util.List<com.github.catvod.spider.merge.N.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.N.P.i():com.github.catvod.spider.merge.N.N");
    }

    public final String toString() {
        return this.b;
    }
}
