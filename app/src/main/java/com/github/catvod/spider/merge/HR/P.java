package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class P {
    private static final String[] d = {ZrJ.d("55"), ZrJ.d("47"), ZrJ.d("52"), ZrJ.d("07"), ZrJ.d("59")};
    private static final String[] e = {ZrJ.d("44"), ZrJ.d("587E"), ZrJ.d("277E"), ZrJ.d("5D7E"), ZrJ.d("537E"), ZrJ.d("077E")};
    private static final Pattern f = Pattern.compile(ZrJ.d("516B10666518507C63112C6E507C622360190A6963166368246A74113B6F2527606477"), 2);
    private static final Pattern g = Pattern.compile(ZrJ.d("51186060156C466B1729636C"));
    private final com.github.catvod.spider.merge.Mp.S a;
    private final String b;
    private final List<N> c = new ArrayList();

    private P(String str) {
        com.github.catvod.spider.merge.XU.k.e(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new com.github.catvod.spider.merge.Mp.S(strTrim);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HR.N>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HR.N>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HR.N>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.HR.N>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(char r10) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HR.P.a(char):void");
    }

    private int b() {
        String strTrim = this.a.b().trim();
        int i = com.github.catvod.spider.merge.XU.n.f;
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
        com.github.catvod.spider.merge.XU.k.d(z, ZrJ.d("302D2F2830651436383968271C63253825200B2A28"));
        return Integer.parseInt(strTrim);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void c(boolean z) {
        String strD = z ? ZrJ.d("432024233C24102D38023F2B") : ZrJ.d("432024233C24102D38");
        this.a.d(strD);
        String strO = com.github.catvod.spider.merge.Mp.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.XU.k.f(strO, strD + ZrJ.d("51372E353C6C59323E283A3C592E3E3E3C65172C3F6D2A205926263D3C3C"));
        this.c.add(z ? new r(strO) : new C0735s(strO, 0));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void d(boolean z) {
        String strD = z ? ZrJ.d("432024233C24102D381A202A1526043A26111C3B3F") : ZrJ.d("432024233C24102D381A202A15261F283031");
        this.a.d(strD);
        String strO = com.github.catvod.spider.merge.Mp.S.o(this.a.a('(', ')'));
        com.github.catvod.spider.merge.XU.k.f(strO, strD + ZrJ.d("51372E353C6C59323E283A3C592E3E3E3C65172C3F6D2A205926263D3C3C"));
        this.c.add(z ? new C0736t(strO, 0) : new C0737u(strO));
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
            com.github.catvod.spider.merge.Mp.S r0 = r8.a
            java.lang.String r0 = r0.b()
            java.lang.String r0 = com.github.catvod.spider.merge.Bk.l.d(r0)
            java.util.regex.Pattern r1 = com.github.catvod.spider.merge.HR.P.f
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.util.regex.Pattern r2 = com.github.catvod.spider.merge.HR.P.g
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r3 = "16272F"
            java.lang.String r3 = com.github.catvod.spider.merge.ZrJ.d(r3)
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
            java.lang.String r3 = "1C352E23"
            java.lang.String r3 = com.github.catvod.spider.merge.ZrJ.d(r3)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L36
            r0 = 0
            goto L26
        L36:
            boolean r3 = r1.matches()
            java.lang.String r6 = ""
            java.lang.String r7 = "271F60"
            java.lang.String r7 = com.github.catvod.spider.merge.ZrJ.d(r7)
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
            java.util.List<com.github.catvod.spider.merge.HR.N> r9 = r8.c
            com.github.catvod.spider.merge.HR.I r10 = new com.github.catvod.spider.merge.HR.I
            r10.<init>(r4, r0)
            goto La5
        L8c:
            java.util.List<com.github.catvod.spider.merge.HR.N> r9 = r8.c
            com.github.catvod.spider.merge.HR.J r10 = new com.github.catvod.spider.merge.HR.J
            r10.<init>(r4, r0)
            goto La5
        L94:
            if (r9 == 0) goto L9e
            java.util.List<com.github.catvod.spider.merge.HR.N> r9 = r8.c
            com.github.catvod.spider.merge.HR.H r10 = new com.github.catvod.spider.merge.HR.H
            r10.<init>(r4, r0)
            goto La5
        L9e:
            java.util.List<com.github.catvod.spider.merge.HR.N> r9 = r8.c
            com.github.catvod.spider.merge.HR.G r10 = new com.github.catvod.spider.merge.HR.G
            r10.<init>(r4, r0)
        La5:
            r9.add(r10)
            return
        La9:
            com.github.catvod.spider.merge.HR.Q r9 = new com.github.catvod.spider.merge.HR.Q
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r0
            java.lang.String r0 = "3A2C3E212C65172C3F6D38240B302E6D2631116E22232C2001636C683B6243633E232D3D092628392D215925243F25240D"
            java.lang.String r0 = com.github.catvod.spider.merge.ZrJ.d(r0)
            r9.<init>(r0, r10)
            goto Lba
        Lb9:
            throw r9
        Lba:
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HR.P.e(boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void f() {
        List<N> list;
        N l;
        List<N> list2;
        N e2;
        List<N> list3;
        N c0732o;
        List<N> list4;
        N c0726i;
        if (this.a.j(ZrJ.d("5A"))) {
            String strE = this.a.e();
            com.github.catvod.spider.merge.XU.k.e(strE);
            this.c.add(new C0739w(strE));
            return;
        }
        int i = 1;
        if (this.a.j(ZrJ.d("57"))) {
            String strE2 = this.a.e();
            com.github.catvod.spider.merge.XU.k.e(strE2);
            this.c.add(new C0726i(strE2.trim(), i));
            return;
        }
        boolean zM = this.a.m();
        String strD = ZrJ.d("533F");
        int i2 = 0;
        if (zM || this.a.k(strD)) {
            String strD2 = com.github.catvod.spider.merge.Bk.l.d(this.a.f());
            com.github.catvod.spider.merge.XU.k.e(strD2);
            boolean zStartsWith = strD2.startsWith(strD);
            String strD3 = ZrJ.d("43");
            if (zStartsWith) {
                this.c.add(new C0722e(new C0735s(strD2.substring(2), 1), new C0736t(strD2.replace(strD, strD3), i)));
                return;
            } else {
                String strD4 = ZrJ.d("05");
                if (strD2.contains(strD4)) {
                    strD2 = strD2.replace(strD4, strD3);
                }
                this.c.add(new C0735s(strD2, 1));
                return;
            }
        }
        if (this.a.k(ZrJ.d("22"))) {
            com.github.catvod.spider.merge.Mp.S s = new com.github.catvod.spider.merge.Mp.S(this.a.a('[', ']'));
            String strG = s.g(e);
            com.github.catvod.spider.merge.XU.k.e(strG);
            s.h();
            if (s.i()) {
                if (strG.startsWith(ZrJ.d("27"))) {
                    list4 = this.c;
                    c0726i = new C0728k(strG.substring(1), 0);
                } else {
                    list4 = this.c;
                    c0726i = new C0726i(strG, i2);
                }
                list4.add(c0726i);
                return;
            }
            if (s.j(ZrJ.d("44"))) {
                list3 = this.c;
                c0732o = new C0729l(strG, s.n());
            } else if (s.j(ZrJ.d("587E"))) {
                list3 = this.c;
                c0732o = new C0733p(strG, s.n());
            } else if (s.j(ZrJ.d("277E"))) {
                list3 = this.c;
                c0732o = new C0734q(strG, s.n());
            } else if (s.j(ZrJ.d("5D7E"))) {
                list3 = this.c;
                c0732o = new C0731n(strG, s.n());
            } else if (s.j(ZrJ.d("537E"))) {
                list3 = this.c;
                c0732o = new C0730m(strG, s.n());
            } else {
                if (!s.j(ZrJ.d("077E"))) {
                    throw new Q(ZrJ.d("3A2C3E212C65172C3F6D38240B302E6D29310D31222F3D311C633A382D3700636C683B6243633E232D3D092628392D21593724262D2B59223F6D6F600A64"), this.b, s.n());
                }
                list3 = this.c;
                c0732o = new C0732o(strG, Pattern.compile(s.n()));
            }
            list3.add(c0732o);
            return;
        }
        if (this.a.j(ZrJ.d("53"))) {
            this.c.add(new C0725h());
            return;
        }
        if (this.a.j(ZrJ.d("432F3F65"))) {
            this.c.add(new A(b()));
            return;
        }
        if (this.a.j(ZrJ.d("43243F65"))) {
            this.c.add(new C0742z(b()));
            return;
        }
        if (this.a.j(ZrJ.d("43263A65"))) {
            this.c.add(new C0740x(b()));
            return;
        }
        if (this.a.k(ZrJ.d("432B2A3E60"))) {
            this.a.d(ZrJ.d("432B2A3E"));
            String strA = this.a.a('(', ')');
            com.github.catvod.spider.merge.XU.k.f(strA, ZrJ.d("432B2A3E60361C2F2E2E3C2A0B6A6B3E3D2754302E212D260D6326383B31592D243968271C632E20383100"));
            this.c.add(new T(j(strA)));
            return;
        }
        if (this.a.k(ZrJ.d("432024233C24102D3865"))) {
            c(false);
            return;
        }
        if (this.a.k(ZrJ.d("432024233C24102D38023F2B51"))) {
            c(true);
            return;
        }
        if (this.a.k(ZrJ.d("432024233C24102D381A202A15261F28303151"))) {
            d(false);
            return;
        }
        if (this.a.k(ZrJ.d("432024233C24102D381A202A1526043A26111C3B3F65"))) {
            d(true);
            return;
        }
        if (this.a.k(ZrJ.d("432024233C24102D38092931186B"))) {
            this.a.d(ZrJ.d("432024233C24102D3809293118"));
            String strO = com.github.catvod.spider.merge.Mp.S.o(this.a.a('(', ')'));
            com.github.catvod.spider.merge.XU.k.f(strO, ZrJ.d("432024233C24102D38092931186B3F28303150633A382D37006326383B31592D243968271C632E20383100"));
            this.c.add(new C0728k(strO, 1));
            return;
        }
        if (this.a.k(ZrJ.d("432E2A392B2D1C3063"))) {
            g(false);
            return;
        }
        if (this.a.k(ZrJ.d("432E2A392B2D1C30043A266D"))) {
            g(true);
            return;
        }
        if (this.a.k(ZrJ.d("432E2A392B2D1C301C2527291C172E353C6D"))) {
            h(false);
            return;
        }
        if (this.a.k(ZrJ.d("432E2A392B2D1C301C2527291C0C3C231C20013763"))) {
            h(true);
            return;
        }
        if (this.a.k(ZrJ.d("432D243960"))) {
            this.a.d(ZrJ.d("432D2439"));
            String strA2 = this.a.a('(', ')');
            com.github.catvod.spider.merge.XU.k.f(strA2, ZrJ.d("432D243960361C2F2E2E3C2A0B6A6B3E3D270A2627282B31592E3E3E3C65172C3F6D2A205926263D3C3C"));
            this.c.add(new W(j(strA2)));
            return;
        }
        if (this.a.j(ZrJ.d("432D3F256526112A272960"))) {
            e(false, false);
            return;
        }
        if (this.a.j(ZrJ.d("432D3F25652918303F602B2D102F2F65"))) {
            e(true, false);
            return;
        }
        if (this.a.j(ZrJ.d("432D3F25652A1F6E3F34382051"))) {
            e(false, true);
            return;
        }
        if (this.a.j(ZrJ.d("432D3F25652918303F6027235437323D2D6D"))) {
            e(true, true);
            return;
        }
        if (this.a.j(ZrJ.d("4325223F3B31542023242421"))) {
            list = this.c;
            l = new C(i2);
        } else if (this.a.j(ZrJ.d("432F2A3E3C681A2B22212C"))) {
            list = this.c;
            l = new E(i2);
        } else if (this.a.j(ZrJ.d("4325223F3B31542C2D603C3C0926"))) {
            list = this.c;
            l = new D();
        } else {
            if (!this.a.j(ZrJ.d("432F2A3E3C681625663931351C"))) {
                if (this.a.j(ZrJ.d("432C252131681A2B22212C"))) {
                    list2 = this.c;
                    e2 = new C(i);
                } else if (this.a.j(ZrJ.d("432C252131681625663931351C"))) {
                    list = this.c;
                    l = new K();
                } else if (this.a.j(ZrJ.d("4326263D3C3C"))) {
                    list = this.c;
                    l = new B();
                } else if (this.a.j(ZrJ.d("433124223C"))) {
                    list2 = this.c;
                    e2 = new E(i);
                } else {
                    if (!this.a.j(ZrJ.d("432E2A392B2D2D263339"))) {
                        throw new Q(ZrJ.d("3A2C3E212C65172C3F6D38240B302E6D39301C31326D6F600A64716D3D2B1C3B3B282B311C276B39272E1C2D6B2C3C655E66386A"), this.b, this.a.n());
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
        String strD = z ? ZrJ.d("432E2A392B2D1C30043A26") : ZrJ.d("432E2A392B2D1C30");
        this.a.d(strD);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.XU.k.f(strA, strD + ZrJ.d("51312E2A2D3D50633A382D37006326383B31592D243968271C632E20383100"));
        this.c.add(z ? new C0726i(Pattern.compile(strA), 2) : new M(Pattern.compile(strA)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private void h(boolean z) {
        String strD = z ? ZrJ.d("432E2A392B2D1C301C2527291C0C3C231C200137") : ZrJ.d("432E2A392B2D1C301C2527291C172E353C");
        this.a.d(strD);
        String strA = this.a.a('(', ')');
        com.github.catvod.spider.merge.XU.k.f(strA, strD + ZrJ.d("51312E2A2D3D50633A382D37006326383B31592D243968271C632E20383100"));
        this.c.add(z ? new C0728k(Pattern.compile(strA)) : new r(Pattern.compile(strA)));
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
    final com.github.catvod.spider.merge.HR.N i() {
        /*
            r4 = this;
            com.github.catvod.spider.merge.Mp.S r0 = r4.a
            r0.h()
            com.github.catvod.spider.merge.Mp.S r0 = r4.a
            java.lang.String[] r1 = com.github.catvod.spider.merge.HR.P.d
            boolean r0 = r0.l(r1)
            if (r0 == 0) goto L1b
            java.util.List<com.github.catvod.spider.merge.HR.N> r0 = r4.c
            com.github.catvod.spider.merge.HR.Z r1 = new com.github.catvod.spider.merge.HR.Z
            r1.<init>()
            r0.add(r1)
            r0 = r4
            goto L37
        L1b:
            r0 = r4
        L1c:
            r0.f()
        L1f:
            com.github.catvod.spider.merge.Mp.S r1 = r0.a
            boolean r1 = r1.i()
            if (r1 != 0) goto L46
            com.github.catvod.spider.merge.Mp.S r1 = r0.a
            boolean r1 = r1.h()
            com.github.catvod.spider.merge.Mp.S r2 = r0.a
            java.lang.String[] r3 = com.github.catvod.spider.merge.HR.P.d
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L3e
        L37:
            com.github.catvod.spider.merge.Mp.S r1 = r0.a
            char r1 = r1.c()
            goto L42
        L3e:
            if (r1 == 0) goto L1c
            r1 = 32
        L42:
            r0.a(r1)
            goto L1f
        L46:
            java.util.List<com.github.catvod.spider.merge.HR.N> r1 = r0.c
            int r1 = r1.size()
            r2 = 1
            if (r1 != r2) goto L59
            java.util.List<com.github.catvod.spider.merge.HR.N> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.github.catvod.spider.merge.HR.N r0 = (com.github.catvod.spider.merge.HR.N) r0
            return r0
        L59:
            com.github.catvod.spider.merge.HR.d r1 = new com.github.catvod.spider.merge.HR.d
            java.util.List<com.github.catvod.spider.merge.HR.N> r0 = r0.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.HR.P.i():com.github.catvod.spider.merge.HR.N");
    }

    public final String toString() {
        return this.b;
    }
}
