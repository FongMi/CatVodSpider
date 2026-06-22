package com.github.catvod.spider.merge;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0367 implements Comparable<C0367> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private Object f906;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private boolean f907 = false;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private boolean f908 = false;

    public C0367(Object obj) {
        this.f906 = obj;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static C0367 m1420(Object obj) {
        return new C0367(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0367.class != obj.getClass()) {
            return false;
        }
        return C0459.m1697(this.f906, ((C0367) obj).f906);
    }

    public int hashCode() {
        return C0337.m1344(this.f906);
    }

    public String toString() {
        return new C0153(this).m484(SOY.d("0C333D0311"), this.f906).m485(SOY.d("132110020005"), this.f907).m485(SOY.d("1321140E0405292623"), this.f908).toString();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public Boolean m1421() {
        Object obj = this.f906;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || C0131.m441(m1427())) ? false : true);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public Date m1422() {
        Object obj = this.f906;
        boolean z = obj instanceof String;
        String strD = SOY.d("1933220254031572351700125A34301F18595A24301A11574772");
        if (z) {
            try {
                return C0241.f613.m1026((String) obj);
            } catch (ParseException unused) {
                throw new C0249(strD + this.f906);
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        throw new C0249(strD + this.f906);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public Double m1423() {
        Object obj = this.f906;
        if (obj instanceof String) {
            return Double.valueOf(new BigDecimal((String) this.f906).doubleValue());
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        throw new C0249(SOY.d("19332202540315723F0319151F207110151E167C7100151B1F726C56") + this.f906);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public C0455 m1424() {
        return (C0455) this.f906;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public List<String> m1425() {
        return (List) this.f906;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public Long m1426() {
        Object obj = this.f906;
        if (obj instanceof String) {
            return Long.valueOf(new BigDecimal((String) this.f906).setScale(0, 4).longValue());
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        throw new C0249(SOY.d("19332202540315723F0319151F207110151E167C7100151B1F726C56") + this.f906);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public String m1427() {
        if (m1434()) {
            StringBuilder sb = new StringBuilder();
            Iterator<C0011> it = m1424().iterator();
            while (it.hasNext()) {
                sb.append(it.next().m194());
            }
            return sb.toString();
        }
        Object obj = this.f906;
        if ((obj instanceof C0011) && C0459.m1697(((C0011) obj).m203(), SOY.d("300A0E22312F2E"))) {
            return ((C0011) this.f906).m194();
        }
        Object obj2 = this.f906;
        return obj2 instanceof List ? C0131.m444((List) obj2, SOY.d("56")) : String.valueOf(obj2).trim();
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public C0367 m1428() {
        this.f907 = true;
        return this;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(C0367 c0367) {
        if (equals(c0367)) {
            return 0;
        }
        if (c0367 == null || c0367.f906 == null) {
            return 1;
        }
        if (this.f906 == null) {
            return -1;
        }
        if (m1438()) {
            return m1427().compareTo(c0367.m1427());
        }
        if (m1437()) {
            return m1423().compareTo(c0367.m1423());
        }
        throw new C0249(SOY.d("2F3C22030407152025131057193D3C0615051B303D13542F2C333D0311574772") + toString());
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public C0367 m1430() {
        this.f908 = true;
        String strValueOf = String.valueOf(this.f906);
        String strD = SOY.d("5D");
        String strM448 = C0131.m448(strValueOf, strD);
        String strD2 = SOY.d("58");
        this.f906 = C0131.m447(C0131.m447(C0131.m448(strM448, strD2), strD), strD2);
        return this;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public boolean m1431() {
        return this.f907;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public boolean m1432() {
        return this.f906 instanceof Boolean;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public boolean m1433() {
        return this.f906 instanceof Date;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public boolean m1434() {
        return this.f906 instanceof C0455;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    public boolean m1435() {
        return this.f908;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    public boolean m1436() {
        return this.f906 instanceof List;
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public boolean m1437() {
        return this.f906 instanceof Number;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public boolean m1438() {
        return this.f906 instanceof String;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public Class m1439() {
        Object obj = this.f906;
        return obj == null ? Object.class : obj.getClass();
    }
}
