package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.H.AbstractC0025a;
import com.github.catvod.spider.merge.L.l;
import com.github.catvod.spider.merge.N.e;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b implements Comparable {
    public Object a;
    public boolean b = false;
    public boolean c = false;

    public b(Object obj) {
        this.a = obj;
    }

    public final Boolean a() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || com.github.catvod.spider.merge.E.c.a(e())) ? false : true);
    }

    public final Date b() {
        Object obj = this.a;
        if (obj instanceof String) {
            try {
                return AbstractC0025a.a.b((String) obj);
            } catch (ParseException unused) {
                throw new com.github.catvod.spider.merge.I.a("cast to date fail. vale = " + this.a);
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        throw new com.github.catvod.spider.merge.I.a("cast to date fail. vale = " + this.a);
    }

    public final Double c() {
        double dDoubleValue;
        Object obj = this.a;
        if (obj instanceof String) {
            dDoubleValue = new BigDecimal((String) this.a).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                throw new com.github.catvod.spider.merge.I.a("cast to number fail. vale = " + this.a);
            }
            dDoubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    public final Long d() {
        long jLongValue;
        Object obj = this.a;
        if (obj instanceof String) {
            jLongValue = new BigDecimal((String) this.a).setScale(0, 4).longValue();
        } else {
            if (!(obj instanceof Number)) {
                throw new com.github.catvod.spider.merge.I.a("cast to number fail. vale = " + this.a);
            }
            jLongValue = ((Number) obj).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public final String e() {
        String str;
        Object obj = this.a;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder();
            Iterator<E> it = ((e) this.a).iterator();
            while (it.hasNext()) {
                sb.append(((l) it.next()).I());
            }
            return sb.toString();
        }
        if ((obj instanceof l) && ((str = ((l) obj).d.a) == "JX_TEXT" || (str != null && str.equals("JX_TEXT")))) {
            return ((l) this.a).I();
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? com.github.catvod.spider.merge.E.c.c((List) obj2, ",") : String.valueOf(obj2).trim();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.a;
        Object obj3 = ((b) obj).a;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        if (equals(bVar)) {
            return 0;
        }
        if (bVar == null || bVar.a == null) {
            return 1;
        }
        Object obj = this.a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return e().compareTo(bVar.e());
        }
        if (obj instanceof Number) {
            return c().compareTo(bVar.c());
        }
        throw new com.github.catvod.spider.merge.I.a("Unsupported comparable XValue = " + toString());
    }

    public final void g() {
        this.c = true;
        String strValueOf = String.valueOf(this.a);
        if (!com.github.catvod.spider.merge.E.c.b(strValueOf) && !com.github.catvod.spider.merge.E.c.b("'") && strValueOf.startsWith("'")) {
            strValueOf = strValueOf.substring(1);
        }
        if (!com.github.catvod.spider.merge.E.c.b(strValueOf) && !com.github.catvod.spider.merge.E.c.b("\"") && strValueOf.startsWith("\"")) {
            strValueOf = strValueOf.substring(1);
        }
        this.a = com.github.catvod.spider.merge.E.c.d(com.github.catvod.spider.merge.E.c.d(strValueOf, "'"), "\"");
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        com.github.catvod.spider.merge.F.a aVar = new com.github.catvod.spider.merge.F.a(this);
        Object obj = this.a;
        com.github.catvod.spider.merge.F.b bVar = aVar.c;
        StringBuffer stringBuffer = aVar.a;
        bVar.a(stringBuffer, obj);
        boolean z = this.b;
        bVar.f(stringBuffer, "isAttr");
        stringBuffer.append(z);
        stringBuffer.append(bVar.h);
        boolean z2 = this.c;
        bVar.f(stringBuffer, "isExprStr");
        stringBuffer.append(z2);
        stringBuffer.append(bVar.h);
        return aVar.toString();
    }
}
