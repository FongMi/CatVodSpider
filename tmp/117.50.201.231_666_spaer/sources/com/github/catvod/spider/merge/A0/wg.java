package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class wg extends il {
    public final Serializable f;

    public wg(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f = bool;
    }

    public wg(Number number) {
        Objects.requireNonNull(number);
        this.f = number;
    }

    public wg(String str) {
        Objects.requireNonNull(str);
        this.f = str;
    }

    public static boolean g(wg wgVar) {
        Serializable serializable = wgVar.f;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final double a() {
        return this.f instanceof Number ? j().doubleValue() : Double.parseDouble(e());
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final int b() {
        return this.f instanceof Number ? j().intValue() : Integer.parseInt(e());
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final long d() {
        return this.f instanceof Number ? j().longValue() : Long.parseLong(e());
    }

    @Override // com.github.catvod.spider.merge.A0.il
    public final String e() {
        Serializable serializable = this.f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return j().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wg.class != obj.getClass()) {
            return false;
        }
        wg wgVar = (wg) obj;
        Serializable serializable = this.f;
        Serializable serializable2 = wgVar.f;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (g(this) && g(wgVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? h().equals(wgVar.h()) : j().longValue() == wgVar.j().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : sk.d(e())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : sk.d(wgVar.e())) == 0;
        }
        double dA = a();
        double dA2 = wgVar.a();
        if (dA != dA2) {
            return Double.isNaN(dA) && Double.isNaN(dA2);
        }
        return true;
    }

    public final BigInteger h() {
        Serializable serializable = this.f;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(j().longValue());
        }
        String strE = e();
        sk.c(strE);
        return new BigInteger(strE);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f;
        if (serializable == null) {
            return 31;
        }
        if (g(this)) {
            jDoubleToLongBits = j().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(j().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean i() {
        Serializable serializable = this.f;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(e());
    }

    public final Number j() {
        Serializable serializable = this.f;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ns((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }
}
