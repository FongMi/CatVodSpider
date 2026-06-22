package com.github.catvod.spider.merge.I1;

import com.github.catvod.spider.merge.m1.AbstractC1310b;
import com.github.catvod.spider.merge.m1.AbstractC1313e;
import com.github.catvod.spider.merge.m1.AbstractC1315g;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.C1317i;
import com.github.catvod.spider.merge.m1.InterfaceC1314f;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class f extends AbstractC1310b {
    public f(com.github.catvod.spider.merge.m1.o oVar, C1380a c1380a) {
        super(oVar, c1380a);
    }

    public long A() {
        return 0L;
    }

    public String B() {
        return "";
    }

    public long C() {
        return -1L;
    }

    public List<C1317i> D() {
        return Collections.emptyList();
    }

    public int E() {
        return 1;
    }

    public AbstractC1315g<? extends AbstractC1313e, ? extends InterfaceC1314f> F() {
        return null;
    }

    public List<l> G() {
        return Collections.emptyList();
    }

    public abstract int H();

    public List<C1311c> I() {
        return Collections.emptyList();
    }

    public String J() {
        return "";
    }

    public String K() {
        return "";
    }

    public List<o> L() {
        return Collections.emptyList();
    }

    public String M() {
        return "";
    }

    public List<String> N() {
        return Collections.emptyList();
    }

    public String O() {
        return null;
    }

    public abstract List<C1311c> P();

    public long Q() {
        return 0L;
    }

    protected final long R(String str) {
        String strD;
        String strD2;
        String strD3 = "";
        try {
            String strD4 = com.github.catvod.spider.merge.L1.k.d(str, j(), 1);
            if (strD4.isEmpty()) {
                return 0L;
            }
            try {
                strD = com.github.catvod.spider.merge.L1.k.d("(\\d+)s", strD4, 1);
                try {
                    strD2 = com.github.catvod.spider.merge.L1.k.d("(\\d+)m", strD4, 1);
                    try {
                        strD3 = com.github.catvod.spider.merge.L1.k.d("(\\d+)h", strD4, 1);
                    } catch (Exception unused) {
                        try {
                            if (strD.isEmpty() && strD2.isEmpty()) {
                                strD = com.github.catvod.spider.merge.L1.k.d("t=(\\d+)", strD4, 1);
                            }
                        } catch (com.github.catvod.spider.merge.p1.i e) {
                            throw new com.github.catvod.spider.merge.p1.i("Could not get timestamp.", e);
                        }
                    }
                } catch (Exception unused2) {
                    strD2 = "";
                }
            } catch (Exception unused3) {
                strD = "";
                strD2 = strD;
            }
            int i = 0;
            int i2 = strD.isEmpty() ? 0 : Integer.parseInt(strD);
            int i3 = strD2.isEmpty() ? 0 : Integer.parseInt(strD2);
            if (!strD3.isEmpty()) {
                i = Integer.parseInt(strD3);
            }
            return (((long) i) * 3600) + (((long) i3) * 60) + ((long) i2);
        } catch (com.github.catvod.spider.merge.L1.j unused4) {
            return -2L;
        }
    }

    public com.github.catvod.spider.merge.r1.b S() {
        return null;
    }

    public List<C1311c> T() {
        return Collections.emptyList();
    }

    public abstract String U();

    public long V() {
        return -1L;
    }

    public abstract String W();

    public abstract List<q> X();

    public abstract List<q> Y();

    public long Z() {
        return -1L;
    }

    public boolean a0() {
        return false;
    }

    public int p() {
        return 0;
    }

    public abstract List<b> q();

    public String r() {
        return "";
    }

    public String s() {
        return "";
    }

    public abstract c t();

    public long u() {
        return -1L;
    }

    public String v() {
        return null;
    }

    public List<d> w() {
        return Collections.emptyList();
    }

    public String x() {
        return "";
    }

    public String y() {
        return "";
    }

    public Locale z() {
        return null;
    }
}
