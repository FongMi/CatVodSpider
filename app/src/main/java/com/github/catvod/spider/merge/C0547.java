package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0579;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ဨ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0547 extends AbstractC0418 {

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static final boolean f1218 = Boolean.parseBoolean(m1765(SOY.d("2E0703382B383C140E3A2628361D1E262B323406032F2B3528131F353C28350205")));

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected final AbstractC0389 f1219;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public final C0576[] f1220;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private EnumC0554 f1221;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected C0585<AbstractC0552, AbstractC0552, AbstractC0552> f1222;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected InterfaceC0401 f1223;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected int f1224;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected C0391 f1225;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected C0576 f1226;

    public C0547(AbstractC0389 abstractC0389, C0405 c0405, C0576[] c0576Arr, C0553 c0553) {
        super(c0405, c0553);
        this.f1221 = EnumC0554.f1238;
        this.f1219 = abstractC0389;
        this.f1220 = c0576Arr;
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    public static String m1765(String str) {
        try {
            return System.getenv(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    protected static int m1766(C0407 c0407) {
        int i = 0;
        for (C0406 c0406 : c0407) {
            if (i == 0) {
                i = c0406.f1005;
            } else if (c0406.f1005 != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0418
    /* JADX INFO: renamed from: Ԩ */
    public void mo1593() {
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected C0406 m1767(C0406 c0406, C0422 c0422) {
        return new C0406(c0406, c0422.f1263);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public int m1768(InterfaceC0401 interfaceC0401, int i, C0391 c0391) {
        this.f1223 = interfaceC0401;
        this.f1224 = interfaceC0401.mo1215();
        this.f1225 = c0391;
        C0576 c0576 = this.f1220[i];
        this.f1226 = c0576;
        int iMo1209 = interfaceC0401.mo1209();
        int i2 = this.f1224;
        try {
            C0579 c0579M1840 = c0576.m1842() ? c0576.m1840(this.f1219.m1501()) : c0576.f1265;
            if (c0579M1840 == null) {
                if (c0391 == null) {
                    c0391 = C0396.f985;
                }
                C0407 c0407M1777 = m1777(c0576.f1267, C0396.f985, false);
                if (c0576.m1842()) {
                    c0576.f1265.f1273 = c0407M1777;
                    c0579M1840 = m1770(c0576, new C0579(m1771(c0407M1777)));
                    c0576.m1843(this.f1219.m1501(), c0579M1840);
                } else {
                    c0579M1840 = m1770(c0576, new C0579(c0407M1777));
                    c0576.f1265 = c0579M1840;
                }
            }
            return m1781(c0576, c0579M1840, interfaceC0401, i2, c0391);
        } finally {
            this.f1222 = null;
            this.f1226 = null;
            interfaceC0401.mo1211(i2);
            interfaceC0401.mo1218(iMo1209);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected C0579 m1769(C0576 c0576, C0579 c0579, int i, C0579 c05792) {
        if (c05792 == null) {
            return null;
        }
        C0579 c0579M1770 = m1770(c0576, c05792);
        if (c0579 == null || i < -1 || i > this.f1038.f1000) {
            return c0579M1770;
        }
        synchronized (c0579) {
            if (c0579.f1274 == null) {
                c0579.f1274 = new C0579[this.f1038.f1000 + 1 + 1];
            }
            c0579.f1274[i + 1] = c0579M1770;
        }
        return c0579M1770;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected C0579 m1770(C0576 c0576, C0579 c0579) {
        if (c0579 == AbstractC0418.f1037) {
            return c0579;
        }
        synchronized (c0576.f1264) {
            C0579 c05792 = c0576.f1264.get(c0579);
            if (c05792 != null) {
                return c05792;
            }
            c0579.f1272 = c0576.f1264.size();
            if (!c0579.f1273.m1560()) {
                c0579.f1273.m1561(this);
                c0579.f1273.m1562(true);
            }
            c0576.f1264.put(c0579, c0579);
            return c0579;
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected C0407 m1771(C0407 c0407) {
        AbstractC0552 abstractC0552;
        AbstractC0561 abstractC0561Mo1837;
        HashMap map = new HashMap();
        C0407 c04072 = new C0407(c0407.f1016);
        for (C0406 c0406 : c0407) {
            if (c0406.f1005 == 1 && (abstractC0561Mo1837 = c0406.f1008.mo1837(this.f1219, this.f1225)) != null) {
                map.put(Integer.valueOf(c0406.f1004.f1042), c0406.f1006);
                if (abstractC0561Mo1837 != c0406.f1008) {
                    c04072.m1557(new C0406(c0406, abstractC0561Mo1837), this.f1222);
                } else {
                    c04072.m1557(c0406, this.f1222);
                }
            }
        }
        for (C0406 c04062 : c0407) {
            if (c04062.f1005 != 1 && (c04062.m1553() || (abstractC0552 = (AbstractC0552) map.get(Integer.valueOf(c04062.f1004.f1042))) == null || !abstractC0552.equals(c04062.f1006))) {
                c04072.m1557(c04062, this.f1222);
            }
        }
        return c04072;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected boolean m1772(C0406 c0406) {
        if (f1218) {
            return false;
        }
        AbstractC0419 abstractC0419 = c0406.f1004;
        if (abstractC0419.mo1597() != 10 || !((C0570) abstractC0419).f1260 || c0406.f1006.mo1608() || c0406.f1006.m1814()) {
            return false;
        }
        int iMo1609 = c0406.f1006.mo1609();
        for (int i = 0; i < iMo1609; i++) {
            if (this.f1038.f994.get(c0406.f1006.mo1607(i)).f1043 != abstractC0419.f1043) {
                return false;
            }
        }
        C0427 c0427 = (C0427) this.f1038.f994.get(((AbstractC0428) abstractC0419.m1601(0).f1263).f1057.f1042);
        for (int i2 = 0; i2 < iMo1609; i2++) {
            AbstractC0419 abstractC04192 = this.f1038.f994.get(c0406.f1006.mo1607(i2));
            if (abstractC04192.m1596() == 1 && abstractC04192.m1601(0).mo1604()) {
                AbstractC0419 abstractC04193 = abstractC04192.m1601(0).f1263;
                if ((abstractC04192.mo1597() == 8 && abstractC04193 == abstractC0419) || abstractC04192 == c0427 || abstractC04193 == c0427 || (abstractC04193.mo1597() == 8 && abstractC04193.m1596() == 1 && abstractC04193.m1601(0).mo1604() && abstractC04193.m1601(0).f1263 == abstractC0419)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected void m1773(C0406 c0406, C0407 c0407, Set<C0406> set, boolean z, boolean z2, boolean z3) {
        m1774(c0406, c0407, set, z, z2, 0, z3);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected void m1774(C0406 c0406, C0407 c0407, Set<C0406> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0406.f1004 instanceof C0559) {
            if (!c0406.f1006.mo1608()) {
                for (int i2 = 0; i2 < c0406.f1006.mo1609(); i2++) {
                    if (c0406.f1006.mo1607(i2) != Integer.MAX_VALUE) {
                        C0406 c04062 = new C0406(this.f1038.f994.get(c0406.f1006.mo1607(i2)), c0406.f1005, c0406.f1006.mo1606(i2), c0406.f1008);
                        c04062.f1007 = c0406.f1007;
                        m1774(c04062, c0407, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0407.m1557(new C0406(c0406, c0406.f1004, AbstractC0552.f1232), this.f1222);
                    } else {
                        m1775(c0406, c0407, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0407.m1557(c0406, this.f1222);
                return;
            }
        }
        m1775(c0406, c0407, set, z, z2, i, z3);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected void m1775(C0406 c0406, C0407 c0407, Set<C0406> set, boolean z, boolean z2, int i, boolean z3) {
        int i2;
        int i3;
        AbstractC0419 abstractC0419 = c0406.f1004;
        if (!abstractC0419.m1598()) {
            c0407.m1557(c0406, this.f1222);
        }
        for (int i4 = 0; i4 < abstractC0419.m1596(); i4++) {
            if (i4 != 0 || !m1772(c0406)) {
                AbstractC0573 abstractC0573M1601 = abstractC0419.m1601(i4);
                boolean z4 = !(abstractC0573M1601 instanceof C0422) && z;
                C0406 c0406M1786 = m1786(c0406, abstractC0573M1601, z4, i == 0, z2, z3);
                if (c0406M1786 != null) {
                    if (c0406.f1004 instanceof C0559) {
                        C0576 c0576 = this.f1226;
                        if (c0576 != null && c0576.m1842() && ((C0431) abstractC0573M1601).m1611() == this.f1226.f1267.f1043) {
                            c0406M1786.m1554(true);
                        }
                        c0406M1786.f1007++;
                        if (set.add(c0406M1786)) {
                            c0407.f1015 = true;
                            i3 = i - 1;
                            i2 = i3;
                        }
                    } else if (abstractC0573M1601.mo1604() || set.add(c0406M1786)) {
                        if (!(abstractC0573M1601 instanceof C0560) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                    }
                    m1774(c0406M1786, c0407, set, z4, z2, i2, z3);
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected C0407 m1776(C0407 c0407, int i, boolean z) {
        if (this.f1222 == null) {
            this.f1222 = new C0585<>();
        }
        C0407 c04072 = new C0407(z);
        Iterator<C0406> it = c0407.iterator();
        ArrayList arrayList = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0406 next = it.next();
            AbstractC0419 abstractC0419 = next.f1004;
            if (!(abstractC0419 instanceof C0559)) {
                int iM1596 = abstractC0419.m1596();
                for (int i2 = 0; i2 < iM1596; i2++) {
                    AbstractC0419 abstractC0419M1790 = m1790(next.f1004.m1601(i2), i);
                    if (abstractC0419M1790 != null) {
                        c04072.m1557(new C0406(next, abstractC0419M1790), this.f1222);
                    }
                }
            } else if (z || i == -1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        C0407 c0407M1796 = (arrayList != null || i == -1 || (c04072.size() != 1 && m1766(c04072) == 0)) ? null : c04072;
        if (c0407M1796 == null) {
            C0407 c04073 = new C0407(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator<C0406> it2 = c04072.iterator();
            while (it2.hasNext()) {
                m1773(it2.next(), c04073, hashSet, false, z, z2);
                c04073 = c04073;
            }
            c0407M1796 = c04073;
        }
        if (i == -1) {
            c0407M1796 = m1796(c0407M1796, c0407M1796 == c04072);
        }
        if (arrayList != null && (!z || !EnumC0554.m1824(c0407M1796))) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c0407M1796.m1557((C0406) it3.next(), this.f1222);
            }
        }
        if (c0407M1796.isEmpty()) {
            return null;
        }
        return c0407M1796;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected C0407 m1777(AbstractC0419 abstractC0419, C0396 c0396, boolean z) {
        AbstractC0552 abstractC0552M1808 = AbstractC0552.m1808(this.f1038, c0396);
        C0407 c0407 = new C0407(z);
        int i = 0;
        while (i < abstractC0419.m1596()) {
            int i2 = i + 1;
            m1773(new C0406(abstractC0419.m1601(i).f1263, i2, abstractC0552M1808), c0407, new HashSet(), true, z, false);
            i = i2;
        }
        return c0407;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected C0579 m1778(C0576 c0576, C0579 c0579, int i) {
        C0407 c0407M1776 = m1776(c0579.f1273, i, false);
        if (c0407M1776 == null) {
            C0579 c05792 = AbstractC0418.f1037;
            m1769(c0576, c0579, i, c05792);
            return c05792;
        }
        C0579 c05793 = new C0579(c0407M1776);
        int iM1766 = m1766(c0407M1776);
        if (iM1766 != 0) {
            c05793.f1275 = true;
            c05793.f1273.f1012 = iM1766;
            c05793.f1276 = iM1766;
        } else if (EnumC0554.m1827(this.f1221, c0407M1776)) {
            c05793.f1273.f1013 = m1784(c0407M1776);
            c05793.f1278 = true;
            c05793.f1275 = true;
            c05793.f1276 = c05793.f1273.f1013.nextSetBit(0);
        }
        if (c05793.f1275 && c05793.f1273.f1014) {
            m1795(c05793, this.f1038.m1546(c0576.f1266));
            if (c05793.f1279 != null) {
                c05793.f1276 = 0;
            }
        }
        return m1769(c0576, c0579, i, c05793);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected BitSet m1779(C0579.C0580[] c0580Arr, C0391 c0391, boolean z) {
        BitSet bitSet = new BitSet();
        for (C0579.C0580 c0580 : c0580Arr) {
            AbstractC0561 abstractC0561 = c0580.f1280;
            if (abstractC0561 == AbstractC0561.f1249) {
                bitSet.set(c0580.f1281);
                if (!z) {
                    break;
                }
            } else {
                if (m1780(abstractC0561, c0391, c0580.f1281, false)) {
                    bitSet.set(c0580.f1281);
                    if (!z) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected boolean m1780(AbstractC0561 abstractC0561, C0391 c0391, int i, boolean z) {
        return abstractC0561.mo1836(this.f1219, c0391);
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected int m1781(C0576 c0576, C0579 c0579, InterfaceC0401 interfaceC0401, int i, C0391 c0391) {
        BitSet bitSetM1779;
        int iMo1214 = interfaceC0401.mo1214(1);
        C0579 c05792 = c0579;
        while (true) {
            C0579 c0579M1787 = m1787(c05792, iMo1214);
            if (c0579M1787 == null) {
                c0579M1787 = m1778(c0576, c05792, iMo1214);
            }
            C0579 c05793 = c0579M1787;
            if (c05793 == AbstractC0418.f1037) {
                C0388 c0388M1792 = m1792(interfaceC0401, c0391, c05792.f1273, i);
                interfaceC0401.mo1211(i);
                int iM1791 = m1791(c05792.f1273, c0391);
                if (iM1791 != 0) {
                    return iM1791;
                }
                throw c0388M1792;
            }
            if (c05793.f1278 && this.f1221 != EnumC0554.f1237) {
                BitSet bitSet = c05793.f1273.f1013;
                if (c05793.f1279 != null) {
                    int iMo1215 = interfaceC0401.mo1215();
                    if (iMo1215 != i) {
                        interfaceC0401.mo1211(i);
                    }
                    bitSetM1779 = m1779(c05793.f1279, c0391, true);
                    if (bitSetM1779.cardinality() == 1) {
                        return bitSetM1779.nextSetBit(0);
                    }
                    if (iMo1215 != i) {
                        interfaceC0401.mo1211(iMo1215);
                    }
                } else {
                    bitSetM1779 = bitSet;
                }
                C0407 c0407M1777 = m1777(c0576.f1267, c0391, true);
                m1798(c0576, bitSetM1779, c05793.f1273, i, interfaceC0401.mo1215());
                return m1782(c0576, c05793, c0407M1777, interfaceC0401, i, c0391);
            }
            if (c05793.f1275) {
                if (c05793.f1279 == null) {
                    return c05793.f1276;
                }
                int iMo12152 = interfaceC0401.mo1215();
                interfaceC0401.mo1211(i);
                BitSet bitSetM17792 = m1779(c05793.f1279, c0391, true);
                int iCardinality = bitSetM17792.cardinality();
                if (iCardinality == 0) {
                    throw m1792(interfaceC0401, c0391, c05793.f1273, i);
                }
                if (iCardinality == 1) {
                    return bitSetM17792.nextSetBit(0);
                }
                m1797(c0576, c05793, i, iMo12152, false, bitSetM17792, c05793.f1273);
                return bitSetM17792.nextSetBit(0);
            }
            if (iMo1214 != -1) {
                interfaceC0401.mo1217();
                iMo1214 = interfaceC0401.mo1214(1);
            }
            c05792 = c05793;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r10 = r6;
     */
    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int m1782(com.github.catvod.spider.merge.C0576 r12, com.github.catvod.spider.merge.C0579 r13, com.github.catvod.spider.merge.C0407 r14, com.github.catvod.spider.merge.InterfaceC0401 r15, int r16, com.github.catvod.spider.merge.C0391 r17) {
        /*
            r11 = this;
            r8 = r11
            r0 = r15
            r1 = r17
            r15.mo1211(r16)
            r2 = 1
            int r3 = r15.mo1214(r2)
            r4 = r3
            r3 = r14
        Le:
            com.github.catvod.spider.merge.ࢬ r7 = r11.m1776(r3, r4, r2)
            if (r7 != 0) goto L25
            r5 = r16
            com.github.catvod.spider.merge.ࡦ r2 = r11.m1792(r15, r1, r3, r5)
            r15.mo1211(r16)
            int r0 = r11.m1791(r3, r1)
            if (r0 == 0) goto L24
            return r0
        L24:
            throw r2
        L25:
            r5 = r16
            java.util.Collection r3 = com.github.catvod.spider.merge.EnumC0554.m1821(r7)
            int r6 = m1766(r7)
            r7.f1012 = r6
            r9 = 0
            if (r6 == 0) goto L36
        L34:
            r10 = r6
            goto L55
        L36:
            com.github.catvod.spider.merge.ၦ r6 = r8.f1221
            com.github.catvod.spider.merge.ၦ r10 = com.github.catvod.spider.merge.EnumC0554.f1239
            if (r6 == r10) goto L43
            int r6 = com.github.catvod.spider.merge.EnumC0554.m1829(r3)
            if (r6 == 0) goto L7a
            goto L34
        L43:
            boolean r6 = com.github.catvod.spider.merge.EnumC0554.m1818(r3)
            if (r6 == 0) goto L7a
            boolean r6 = com.github.catvod.spider.merge.EnumC0554.m1819(r3)
            if (r6 == 0) goto L7a
            int r6 = com.github.catvod.spider.merge.EnumC0554.m1822(r3)
            r10 = r6
            r9 = 1
        L55:
            int r1 = r7.f1012
            if (r1 == 0) goto L68
            int r6 = r15.mo1215()
            r0 = r11
            r1 = r12
            r2 = r10
            r3 = r7
            r4 = r16
            r5 = r6
            r0.m1799(r1, r2, r3, r4, r5)
            return r10
        L68:
            int r4 = r15.mo1215()
            java.util.BitSet r6 = r7.m1559()
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r16
            r5 = r9
            r0.m1797(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L7a:
            r3 = -1
            if (r4 == r3) goto L85
            r15.mo1217()
            int r3 = r15.mo1214(r2)
            r4 = r3
        L85:
            r3 = r7
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0547.m1782(com.github.catvod.spider.merge.ၿ, com.github.catvod.spider.merge.ႁ, com.github.catvod.spider.merge.ࢬ, com.github.catvod.spider.merge.ࢦ, int, com.github.catvod.spider.merge.ࡨ):int");
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected int m1783(C0407 c0407) {
        C0245 c0245 = new C0245(new int[0]);
        for (C0406 c0406 : c0407) {
            if (c0406.m1552() > 0 || ((c0406.f1004 instanceof C0559) && c0406.f1006.m1814())) {
                c0245.m890(c0406.f1005);
            }
        }
        if (c0245.m901() == 0) {
            return 0;
        }
        return c0245.m897();
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected BitSet m1784(C0407 c0407) {
        return EnumC0554.m1820(EnumC0554.m1821(c0407));
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    protected BitSet m1785(C0407 c0407) {
        if (c0407.f1012 == 0) {
            return c0407.f1013;
        }
        BitSet bitSet = new BitSet();
        bitSet.set(c0407.f1012);
        return bitSet;
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    protected C0406 m1786(C0406 c0406, AbstractC0573 abstractC0573, boolean z, boolean z2, boolean z3, boolean z4) {
        int iMo1603 = abstractC0573.mo1603();
        if (iMo1603 == 10) {
            return m1793(c0406, (C0550) abstractC0573, z, z2, z3);
        }
        switch (iMo1603) {
            case 1:
                return new C0406(c0406, abstractC0573.f1263);
            case 2:
            case 5:
            case 7:
                if (z4 && abstractC0573.mo1605(-1, 0, 1)) {
                    return new C0406(c0406, abstractC0573.f1263);
                }
                return null;
            case 3:
                return m1800(c0406, (C0560) abstractC0573);
            case 4:
                return m1794(c0406, (C0551) abstractC0573, z, z2, z3);
            case 6:
                return m1767(c0406, (C0422) abstractC0573);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    protected C0579 m1787(C0579 c0579, int i) {
        int i2;
        C0579[] c0579Arr = c0579.f1274;
        if (c0579Arr == null || (i2 = i + 1) < 0 || i2 >= c0579Arr.length) {
            return null;
        }
        return c0579Arr[i2];
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    protected C0579.C0580[] m1788(BitSet bitSet, AbstractC0561[] abstractC0561Arr) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i = 1; i < abstractC0561Arr.length; i++) {
            AbstractC0561 abstractC0561 = abstractC0561Arr[i];
            if (bitSet != null && bitSet.get(i)) {
                arrayList.add(new C0579.C0580(abstractC0561, i));
            }
            if (abstractC0561 != AbstractC0561.f1249) {
                z = true;
            }
        }
        if (z) {
            return (C0579.C0580[]) arrayList.toArray(new C0579.C0580[arrayList.size()]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    protected AbstractC0561[] m1789(BitSet bitSet, C0407 c0407, int i) {
        AbstractC0561[] abstractC0561Arr = new AbstractC0561[i + 1];
        for (C0406 c0406 : c0407) {
            if (bitSet.get(c0406.f1005)) {
                int i2 = c0406.f1005;
                abstractC0561Arr[i2] = AbstractC0561.m1835(abstractC0561Arr[i2], c0406.f1008);
            }
        }
        int i3 = 0;
        for (int i4 = 1; i4 <= i; i4++) {
            if (abstractC0561Arr[i4] == null) {
                abstractC0561Arr[i4] = AbstractC0561.f1249;
            } else if (abstractC0561Arr[i4] != AbstractC0561.f1249) {
                i3++;
            }
        }
        if (i3 == 0) {
            return null;
        }
        return abstractC0561Arr;
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    protected AbstractC0419 m1790(AbstractC0573 abstractC0573, int i) {
        if (abstractC0573.mo1605(i, 0, this.f1038.f1000)) {
            return abstractC0573.f1263;
        }
        return null;
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    protected int m1791(C0407 c0407, C0391 c0391) {
        int iM1783;
        C0123<C0407, C0407> c0123M1801 = m1801(c0407, c0391);
        C0407 c04072 = c0123M1801.f309;
        C0407 c04073 = c0123M1801.f310;
        int iM17832 = m1783(c04072);
        if (iM17832 != 0) {
            return iM17832;
        }
        if (c04073.size() <= 0 || (iM1783 = m1783(c04073)) == 0) {
            return 0;
        }
        return iM1783;
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    protected C0388 m1792(InterfaceC0401 interfaceC0401, C0391 c0391, C0407 c0407, int i) {
        return new C0388(this.f1219, interfaceC0401, interfaceC0401.get(i), interfaceC0401.mo1213(1), c0407, c0391);
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    public C0406 m1793(C0406 c0406, C0550 c0550, boolean z, boolean z2, boolean z3) {
        if (!z || !z2) {
            return new C0406(c0406, c0550.f1263);
        }
        if (!z3) {
            return new C0406(c0406, c0550.f1263, AbstractC0561.m1833(c0406.f1008, c0550.m1802()));
        }
        int iMo1215 = this.f1223.mo1215();
        this.f1223.mo1211(this.f1224);
        boolean zM1780 = m1780(c0550.m1802(), this.f1225, c0406.f1005, z3);
        this.f1223.mo1211(iMo1215);
        if (zM1780) {
            return new C0406(c0406, c0550.f1263);
        }
        return null;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    protected C0406 m1794(C0406 c0406, C0551 c0551, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (!z || ((z4 = c0551.f1231) && !(z4 && z2))) {
            return new C0406(c0406, c0551.f1263);
        }
        if (!z3) {
            return new C0406(c0406, c0551.f1263, AbstractC0561.m1833(c0406.f1008, c0551.m1803()));
        }
        int iMo1215 = this.f1223.mo1215();
        this.f1223.mo1211(this.f1224);
        boolean zM1780 = m1780(c0551.m1803(), this.f1225, c0406.f1005, z3);
        this.f1223.mo1211(iMo1215);
        if (zM1780) {
            return new C0406(c0406, c0551.f1263);
        }
        return null;
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    protected void m1795(C0579 c0579, AbstractC0429 abstractC0429) {
        int iM1596 = abstractC0429.m1596();
        BitSet bitSetM1785 = m1785(c0579.f1273);
        AbstractC0561[] abstractC0561ArrM1789 = m1789(bitSetM1785, c0579.f1273, iM1596);
        if (abstractC0561ArrM1789 == null) {
            c0579.f1276 = bitSetM1785.nextSetBit(0);
        } else {
            c0579.f1279 = m1788(bitSetM1785, abstractC0561ArrM1789);
            c0579.f1276 = 0;
        }
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    protected C0407 m1796(C0407 c0407, boolean z) {
        if (EnumC0554.m1817(c0407)) {
            return c0407;
        }
        C0407 c04072 = new C0407(c0407.f1016);
        for (C0406 c0406 : c0407) {
            AbstractC0419 abstractC0419 = c0406.f1004;
            if (abstractC0419 instanceof C0559) {
                c04072.m1557(c0406, this.f1222);
            } else if (z && abstractC0419.m1598() && this.f1038.m1549(c0406.f1004).m895(-2)) {
                c04072.m1557(new C0406(c0406, this.f1038.f997[c0406.f1004.f1043]), this.f1222);
            }
        }
        return c04072;
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    protected void m1797(C0576 c0576, C0579 c0579, int i, int i2, boolean z, BitSet bitSet, C0407 c0407) {
        AbstractC0389 abstractC0389 = this.f1219;
        if (abstractC0389 != null) {
            abstractC0389.m1529().mo1200(this.f1219, c0576, i, i2, z, bitSet, c0407);
        }
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    protected void m1798(C0576 c0576, BitSet bitSet, C0407 c0407, int i, int i2) {
        AbstractC0389 abstractC0389 = this.f1219;
        if (abstractC0389 != null) {
            abstractC0389.m1529().mo1203(this.f1219, c0576, i, i2, bitSet, c0407);
        }
    }

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    protected void m1799(C0576 c0576, int i, C0407 c0407, int i2, int i3) {
        AbstractC0389 abstractC0389 = this.f1219;
        if (abstractC0389 != null) {
            abstractC0389.m1529().mo1201(this.f1219, c0576, i2, i3, i, c0407);
        }
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    protected C0406 m1800(C0406 c0406, C0560 c0560) {
        return new C0406(c0406, c0560.f1263, C0568.m1839(c0406.f1006, c0560.f1248.f1042));
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    protected C0123<C0407, C0407> m1801(C0407 c0407, C0391 c0391) {
        C0407 c04072 = new C0407(c0407.f1016);
        C0407 c04073 = new C0407(c0407.f1016);
        for (C0406 c0406 : c0407) {
            AbstractC0561 abstractC0561 = c0406.f1008;
            if (abstractC0561 == AbstractC0561.f1249) {
                c04072.add(c0406);
            } else if (m1780(abstractC0561, c0391, c0406.f1005, c0407.f1016)) {
                c04072.add(c0406);
            } else {
                c04073.add(c0406);
            }
        }
        return new C0123<>(c04072, c04073);
    }
}
