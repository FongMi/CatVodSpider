package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.a.C0529a;
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
        return Boolean.valueOf((obj == null || com.github.catvod.spider.merge.y.f.b(g())) ? false : true);
    }

    public final Date b() {
        Object obj = this.a;
        if (obj instanceof String) {
            try {
                return com.github.catvod.spider.merge.C.a.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder sbA = C0529a.a("cast to date fail. vale = ");
                sbA.append(this.a);
                throw new com.github.catvod.spider.merge.P.e(sbA.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder sbA2 = C0529a.a("cast to date fail. vale = ");
        sbA2.append(this.a);
        throw new com.github.catvod.spider.merge.P.e(sbA2.toString());
    }

    public final Double c() {
        double dDoubleValue;
        Object obj = this.a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder sbA = C0529a.a("cast to number fail. vale = ");
                sbA.append(this.a);
                throw new com.github.catvod.spider.merge.P.e(sbA.toString());
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public final com.github.catvod.spider.merge.I.c d() {
        return (com.github.catvod.spider.merge.I.c) this.a;
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
                StringBuilder sbA = C0529a.a("cast to number fail. vale = ");
                sbA.append(this.a);
                throw new com.github.catvod.spider.merge.P.e(sbA.toString());
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public final String g() {
        Object obj = this.a;
        if (obj instanceof com.github.catvod.spider.merge.I.c) {
            StringBuilder sb = new StringBuilder();
            Iterator<i> it = ((com.github.catvod.spider.merge.I.c) this.a).iterator();
            while (it.hasNext()) {
                sb.append(it.next().i0());
            }
            return sb.toString();
        }
        if (obj instanceof i) {
            String strR0 = ((i) obj).r0();
            if (strR0 == "JX_TEXT" || (strR0 != null && strR0.equals("JX_TEXT"))) {
                return ((i) this.a).i0();
            }
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? com.github.catvod.spider.merge.y.f.e((List) obj2, ",") : String.valueOf(obj2).trim();
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
        StringBuilder sbA = C0529a.a("Unsupported comparable XValue = ");
        sbA.append(toString());
        throw new com.github.catvod.spider.merge.P.e(sbA.toString());
    }

    public final f j() {
        this.c = true;
        this.a = com.github.catvod.spider.merge.y.f.f(com.github.catvod.spider.merge.y.f.f(com.github.catvod.spider.merge.y.f.g(com.github.catvod.spider.merge.y.f.g(String.valueOf(this.a), "'"), "\""), "'"), "\"");
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
        return this.a instanceof com.github.catvod.spider.merge.I.c;
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
        com.github.catvod.spider.merge.z.a aVar = new com.github.catvod.spider.merge.z.a(this);
        aVar.a(this.a);
        aVar.b("isAttr", this.b);
        aVar.b("isExprStr", this.c);
        return aVar.toString();
    }
}
