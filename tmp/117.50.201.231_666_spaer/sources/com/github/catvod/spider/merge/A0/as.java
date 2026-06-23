package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class as implements Comparable {
    public Serializable a;
    public boolean b;
    public boolean c;

    public static as d(Serializable serializable) {
        as asVar = new as();
        asVar.b = false;
        asVar.c = false;
        asVar.a = serializable;
        return asVar;
    }

    public final Boolean e() {
        Serializable serializable = this.a;
        if (serializable instanceof Boolean) {
            return (Boolean) serializable;
        }
        return Boolean.valueOf((serializable == null || fx.c(i())) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || as.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((as) obj).a);
    }

    public final Date f() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            try {
                return aca.a.e((String) serializable);
            } catch (ParseException unused) {
                throw new tv("cast to date fail. vale = " + this.a);
            }
        }
        if (serializable instanceof Date) {
            return (Date) serializable;
        }
        throw new tv("cast to date fail. vale = " + this.a);
    }

    public final Double g() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return Double.valueOf(new BigDecimal((String) this.a).doubleValue());
        }
        if (serializable instanceof Number) {
            return Double.valueOf(((Number) serializable).doubleValue());
        }
        throw new tv("cast to number fail. vale = " + this.a);
    }

    public final Long h() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return Long.valueOf(new BigDecimal((String) this.a).setScale(0, 4).longValue());
        }
        if (serializable instanceof Number) {
            return Long.valueOf(((Number) serializable).longValue());
        }
        throw new tv("cast to number fail. vale = " + this.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String i() {
        Object obj = this.a;
        if (obj instanceof rp) {
            StringBuilder sb = new StringBuilder();
            Iterator<E> it = ((rp) this.a).iterator();
            while (it.hasNext()) {
                sb.append(((ed) it.next()).ag());
            }
            return sb.toString();
        }
        if ((obj instanceof ed) && Objects.equals(((ed) obj).g.b, "JX_TEXT")) {
            return ((ed) this.a).ag();
        }
        Serializable serializable = this.a;
        return serializable instanceof List ? fx.e((List) serializable, ",") : String.valueOf(serializable).trim();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int compareTo(as asVar) {
        if (equals(asVar)) {
            return 0;
        }
        if (asVar == null || asVar.a == null) {
            return 1;
        }
        Serializable serializable = this.a;
        if (serializable == null) {
            return -1;
        }
        if (serializable instanceof String) {
            return i().compareTo(asVar.i());
        }
        if (serializable instanceof Number) {
            return g().compareTo(asVar.g());
        }
        throw new tv("Unsupported comparable XValue = " + toString());
    }

    public final void k() {
        this.c = true;
        String strValueOf = String.valueOf(this.a);
        if (!fx.d(strValueOf) && !fx.d("'") && strValueOf.startsWith("'")) {
            strValueOf = strValueOf.substring(1);
        }
        if (!fx.d(strValueOf) && !fx.d("\"") && strValueOf.startsWith("\"")) {
            strValueOf = strValueOf.substring(1);
        }
        this.a = fx.f(fx.f(strValueOf, "'"), "\"");
    }

    public final String toString() {
        ze zeVar = new ze(this);
        Serializable serializable = this.a;
        StringBuffer stringBuffer = zeVar.b;
        lr lrVar = zeVar.d;
        lrVar.y(stringBuffer, "value");
        if (serializable == null) {
            stringBuffer.append(lrVar.n);
        } else {
            lrVar.aa(stringBuffer, "value", serializable, true);
        }
        stringBuffer.append(lrVar.k);
        boolean z = this.b;
        lrVar.y(stringBuffer, "isAttr");
        stringBuffer.append(z);
        stringBuffer.append(lrVar.k);
        boolean z2 = this.c;
        lrVar.y(stringBuffer, "isExprStr");
        stringBuffer.append(z2);
        stringBuffer.append(lrVar.k);
        return zeVar.toString();
    }
}
