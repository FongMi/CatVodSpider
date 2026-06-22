package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.H.C0000a;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class f implements Comparable<f> {
    private Object a;
    private boolean b = false;
    private boolean c = false;

    public f(Object obj) {
        this.a = obj;
    }

    public final Boolean a() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || h.b(g())) ? false : true);
    }

    public final Date b() {
        Object obj = this.a;
        boolean z = obj instanceof String;
        String strD = oZP.d("160E04354C211A4F1320183055091628007B5519162D0975484F");
        if (z) {
            try {
                return C0000a.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbC = C0133t.c(strD);
                sbC.append(this.a);
                throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbC2 = C0133t.c(strD);
        sbC2.append(this.a);
        throw new com.github.catvod.spider.merge.a0.e(sbC2.toString());
    }

    public final Double c() {
        double dDoubleValue;
        Object obj = this.a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbC = C0133t.c(oZP.d("160E04354C211A4F19340137101D57270D3C194157370D39104F4A61"));
                sbC.append(this.a);
                throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public final C0074g d() {
        return (C0074g) this.a;
    }

    public final List<String> e() {
        return (List) this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.a;
        Object obj3 = ((f) obj).a;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public final Long f() {
        long jLongValue;
        Object obj = this.a;
        if (obj instanceof String) {
            jLongValue = new BigDecimal((String) this.a).setScale(0, 4).longValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbC = C0133t.c(oZP.d("160E04354C211A4F19340137101D57270D3C194157370D39104F4A61"));
                sbC.append(this.a);
                throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public final String g() {
        Object obj = this.a;
        if (obj instanceof C0074g) {
            StringBuilder sb = new StringBuilder();
            Iterator<m> it = ((C0074g) this.a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().j0());
            }
            return sb.toString();
        }
        if (obj instanceof m) {
            String strT0 = ((m) obj).t0();
            String strD = oZP.d("3F372815290D21");
            if (strT0 == strD || (strT0 != null && strT0.equals(strD))) {
                return ((m) this.a).j0();
            }
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? h.e((List) obj2, oZP.d("59")) : String.valueOf(obj2).trim();
    }

    public final f h() {
        this.b = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        if (equals(fVar)) {
            return 0;
        }
        if (fVar == null || fVar.a == null) {
            return 1;
        }
        Object obj = this.a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return g().compareTo(fVar.g());
        }
        if (obj instanceof Number) {
            return c().compareTo(fVar.c());
        }
        StringBuilder sbC = C0133t.c(oZP.d("200104341C251A1D0324087516001A310D27140D1B244C0D230E1B340975484F"));
        sbC.append(toString());
        throw new com.github.catvod.spider.merge.a0.e(sbC.toString());
    }

    public final f j() {
        this.c = true;
        String strValueOf = String.valueOf(this.a);
        String strD = oZP.d("52");
        String strG = h.g(strValueOf, strD);
        String strD2 = oZP.d("57");
        this.a = h.f(h.f(h.g(strG, strD2), strD), strD2);
        return this;
    }

    public final boolean k() {
        return this.b;
    }

    public final boolean l() {
        return this.a instanceof Boolean;
    }

    public final boolean m() {
        return this.a instanceof Date;
    }

    public final boolean n() {
        return this.a instanceof C0074g;
    }

    public final boolean o() {
        return this.c;
    }

    public final boolean p() {
        return this.a instanceof List;
    }

    public final boolean q() {
        return this.a instanceof Number;
    }

    public final boolean r() {
        return this.a instanceof String;
    }

    public final Class s() {
        Object obj = this.a;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        com.github.catvod.spider.merge.E.a aVar = new com.github.catvod.spider.merge.E.a(this);
        aVar.a(this.a);
        aVar.b(oZP.d("1C1C36351827"), this.b);
        aVar.b(oZP.d("1C1C32391C27261B05"), this.c);
        return aVar.toString();
    }
}
