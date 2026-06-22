package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum b1 extends g1 {
    public b1() {
        super("CdataSection", 66);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        String strC;
        int iV = c0030a.v("]]>");
        if (iV != -1) {
            strC = C0030a.c(c0030a.a, c0030a.h, c0030a.e, iV);
            c0030a.e += iV;
        } else {
            int i = c0030a.c;
            int i2 = c0030a.e;
            if (i - i2 < 3) {
                c0030a.b();
                char[] cArr = c0030a.a;
                String[] strArr = c0030a.h;
                int i3 = c0030a.e;
                strC = C0030a.c(cArr, strArr, i3, c0030a.c - i3);
                c0030a.e = c0030a.c;
            } else {
                int i4 = i - 2;
                strC = C0030a.c(c0030a.a, c0030a.h, i2, i4 - i2);
                c0030a.e = i4;
            }
        }
        p.h.append(strC);
        if (c0030a.p("]]>") || c0030a.n()) {
            p.f(new F(p.h.toString()));
            p.o(g1.a);
        }
    }
}
