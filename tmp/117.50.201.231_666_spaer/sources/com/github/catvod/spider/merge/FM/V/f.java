package com.github.catvod.spider.merge.FM.V;

import com.github.catvod.spider.merge.FM.C.h;
import com.github.catvod.spider.merge.FM.G.C0200a;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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
        if (obj instanceof String) {
            try {
                return C0200a.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbB = P.b("cast to date fail. vale = ");
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbB2 = P.b("cast to date fail. vale = ");
        sbB2.append(this.a);
        throw new com.github.catvod.spider.merge.FM.Z.e(sbB2.toString());
    }

    public final Double c() {
        double dDoubleValue;
        Object obj = this.a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbB = P.b("cast to number fail. vale = ");
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public final C0274g d() {
        return (C0274g) this.a;
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
                StringBuilder sbB = P.b("cast to number fail. vale = ");
                sbB.append(this.a);
                throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public final String g() {
        Object obj = this.a;
        if (obj instanceof C0274g) {
            StringBuilder sb = new StringBuilder();
            Iterator<m> it = ((C0274g) this.a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().j0());
            }
            return sb.toString();
        }
        if (obj instanceof m) {
            String strT0 = ((m) obj).t0();
            if (strT0 == "JX_TEXT" || (strT0 != null && strT0.equals("JX_TEXT"))) {
                return ((m) this.a).j0();
            }
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? h.e((List) obj2, ",") : String.valueOf(obj2).trim();
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
        StringBuilder sbB = P.b("Unsupported comparable XValue = ");
        sbB.append(toString());
        throw new com.github.catvod.spider.merge.FM.Z.e(sbB.toString());
    }

    public final f j() {
        this.c = true;
        this.a = h.f(h.f(h.g(h.g(String.valueOf(this.a), "'"), "\""), "'"), "\"");
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
        return this.a instanceof C0274g;
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
        com.github.catvod.spider.merge.FM.D.a aVar = new com.github.catvod.spider.merge.FM.D.a(this);
        aVar.a(this.a);
        aVar.b("isAttr", this.b);
        aVar.b("isExprStr", this.c);
        return aVar.toString();
    }
}
