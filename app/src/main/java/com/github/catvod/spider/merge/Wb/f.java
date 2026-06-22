package com.github.catvod.spider.merge.Wb;

import com.github.catvod.spider.merge.HN.C0701a;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.VE.h;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
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
        String strD = ZrJ.d("1A223839683116632F2C3C2059252A24246B59352A212D654463");
        if (z) {
            try {
                return C0701a.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbB = C0925t.b(strD);
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbB2 = C0925t.b(strD);
        sbB2.append(this.a);
        throw new com.github.catvod.spider.merge.XU.e(sbB2.toString());
    }

    public final Double c() {
        double dDoubleValue;
        Object obj = this.a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbB = C0925t.b(ZrJ.d("1A22383968311663253825271C316B2B292C156D6B3B29291C63766D"));
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public final C0724g d() {
        return (C0724g) this.a;
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
                StringBuilder sbB = C0925t.b(ZrJ.d("1A22383968311663253825271C316B2B292C156D6B3B29291C63766D"));
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public final String g() {
        Object obj = this.a;
        if (obj instanceof C0724g) {
            StringBuilder sb = new StringBuilder();
            Iterator<m> it = ((C0724g) this.a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().j0());
            }
            return sb.toString();
        }
        if (obj instanceof m) {
            String strT0 = ((m) obj).t0();
            String strD = ZrJ.d("331B14190D1D2D");
            if (strT0 == strD || (strT0 != null && strT0.equals(strD))) {
                return ((m) this.a).j0();
            }
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? h.e((List) obj2, ZrJ.d("55")) : String.valueOf(obj2).trim();
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
        StringBuilder sbB = C0925t.b(ZrJ.d("2C2D3838383516313F282C651A2C263D293718212728681D2F2227382D654463"));
        sbB.append(toString());
        throw new com.github.catvod.spider.merge.XU.e(sbB.toString());
    }

    public final f j() {
        this.c = true;
        String strValueOf = String.valueOf(this.a);
        String strD = ZrJ.d("5E");
        String strG = h.g(strValueOf, strD);
        String strD2 = ZrJ.d("5B");
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
        return this.a instanceof C0724g;
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
        com.github.catvod.spider.merge.Et.a aVar = new com.github.catvod.spider.merge.Et.a(this);
        aVar.a(this.a);
        aVar.b(ZrJ.d("10300A393C37"), this.b);
        aVar.b(ZrJ.d("10300E3538372A3739"), this.c);
        return aVar.toString();
    }
}
