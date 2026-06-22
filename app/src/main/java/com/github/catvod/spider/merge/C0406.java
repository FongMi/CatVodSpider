package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢫ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0406 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final AbstractC0419 f1004;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public final int f1005;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public AbstractC0552 f1006;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public int f1007;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final AbstractC0561 f1008;

    public C0406(AbstractC0419 abstractC0419, int i, AbstractC0552 abstractC0552) {
        this(abstractC0419, i, abstractC0552, AbstractC0561.f1249);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0406) {
            return mo1551((C0406) obj);
        }
        return false;
    }

    public int hashCode() {
        return C0120.m406(C0120.m411(C0120.m411(C0120.m410(C0120.m410(C0120.m409(7), this.f1004.f1042), this.f1005), this.f1006), this.f1008), 4);
    }

    public String toString() {
        return m1555(null, true);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public boolean mo1551(C0406 c0406) {
        AbstractC0552 abstractC0552;
        AbstractC0552 abstractC05522;
        if (this == c0406) {
            return true;
        }
        return c0406 != null && this.f1004.f1042 == c0406.f1004.f1042 && this.f1005 == c0406.f1005 && ((abstractC0552 = this.f1006) == (abstractC05522 = c0406.f1006) || (abstractC0552 != null && abstractC0552.equals(abstractC05522))) && this.f1008.equals(c0406.f1008) && m1553() == c0406.m1553();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public final int m1552() {
        return this.f1007 & (-1073741825);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final boolean m1553() {
        return (this.f1007 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final void m1554(boolean z) {
        if (z) {
            this.f1007 |= 1073741824;
        } else {
            this.f1007 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public String m1555(AbstractC0394<?, ?> abstractC0394, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f1004);
        String strD = SOY.d("56");
        if (z) {
            sb.append(strD);
            sb.append(this.f1005);
        }
        if (this.f1006 != null) {
            sb.append(SOY.d("5609"));
            sb.append(this.f1006.toString());
            sb.append(SOY.d("27"));
        }
        AbstractC0561 abstractC0561 = this.f1008;
        if (abstractC0561 != null && abstractC0561 != AbstractC0561.f1249) {
            sb.append(strD);
            sb.append(this.f1008);
        }
        if (m1552() > 0) {
            sb.append(SOY.d("5627214B"));
            sb.append(m1552());
        }
        sb.append(')');
        return sb.toString();
    }

    public C0406(AbstractC0419 abstractC0419, int i, AbstractC0552 abstractC0552, AbstractC0561 abstractC0561) {
        this.f1004 = abstractC0419;
        this.f1005 = i;
        this.f1006 = abstractC0552;
        this.f1008 = abstractC0561;
    }

    public C0406(C0406 c0406, AbstractC0419 abstractC0419) {
        this(c0406, abstractC0419, c0406.f1006, c0406.f1008);
    }

    public C0406(C0406 c0406, AbstractC0419 abstractC0419, AbstractC0561 abstractC0561) {
        this(c0406, abstractC0419, c0406.f1006, abstractC0561);
    }

    public C0406(C0406 c0406, AbstractC0561 abstractC0561) {
        this(c0406, c0406.f1004, c0406.f1006, abstractC0561);
    }

    public C0406(C0406 c0406, AbstractC0419 abstractC0419, AbstractC0552 abstractC0552) {
        this(c0406, abstractC0419, abstractC0552, c0406.f1008);
    }

    public C0406(C0406 c0406, AbstractC0419 abstractC0419, AbstractC0552 abstractC0552, AbstractC0561 abstractC0561) {
        this.f1004 = abstractC0419;
        this.f1005 = c0406.f1005;
        this.f1006 = abstractC0552;
        this.f1008 = abstractC0561;
        this.f1007 = c0406.f1007;
    }
}
