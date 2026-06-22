package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ৼ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0438 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public final C0405 f1072;

    public C0438(C0405 c0405) {
        this.f1072 = c0405;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public C0245 m1634(AbstractC0419 abstractC0419, C0396 c0396) {
        return m1635(abstractC0419, null, c0396);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public C0245 m1635(AbstractC0419 abstractC0419, AbstractC0419 abstractC04192, C0396 c0396) throws Throwable {
        C0245 c0245 = new C0245(new int[0]);
        m1636(abstractC0419, abstractC04192, c0396 != null ? AbstractC0552.m1808(abstractC0419.f1041, c0396) : null, c0245, new HashSet(), new BitSet(), true, true);
        return c0245;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected void m1636(AbstractC0419 abstractC0419, AbstractC0419 abstractC04192, AbstractC0552 abstractC0552, C0245 c0245, Set<C0406> set, BitSet bitSet, boolean z, boolean z2) throws Throwable {
        int i;
        int i2;
        C0560 c0560;
        if (set.add(new C0406(abstractC0419, 0, abstractC0552))) {
            if (abstractC0419 == abstractC04192) {
                if (abstractC0552 == null) {
                    c0245.m890(-2);
                    return;
                } else if (abstractC0552.mo1608() && z2) {
                    c0245.m890(-1);
                    return;
                }
            }
            if (abstractC0419 instanceof C0559) {
                if (abstractC0552 == null) {
                    c0245.m890(-2);
                    return;
                }
                if (abstractC0552.mo1608() && z2) {
                    c0245.m890(-1);
                    return;
                }
                if (abstractC0552 != AbstractC0552.f1232) {
                    boolean z3 = bitSet.get(abstractC0419.f1043);
                    try {
                        bitSet.clear(abstractC0419.f1043);
                        for (int i3 = 0; i3 < abstractC0552.mo1609(); i3++) {
                            m1636(this.f1072.f994.get(abstractC0552.mo1607(i3)), abstractC04192, abstractC0552.mo1606(i3), c0245, set, bitSet, z, z2);
                        }
                        if (z3) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z3) {
                            bitSet.set(abstractC0419.f1043);
                        }
                    }
                }
            }
            int i4 = 0;
            for (int iM1596 = abstractC0419.m1596(); i4 < iM1596; iM1596 = i2) {
                AbstractC0573 abstractC0573M1601 = abstractC0419.m1601(i4);
                if (abstractC0573M1601.getClass() == C0560.class) {
                    C0560 c05602 = (C0560) abstractC0573M1601;
                    if (bitSet.get(c05602.f1263.f1043)) {
                        i = i4;
                        i2 = iM1596;
                    } else {
                        C0568 c0568M1839 = C0568.m1839(abstractC0552, c05602.f1248.f1042);
                        try {
                            bitSet.set(((C0560) abstractC0573M1601).f1263.f1043);
                            c0560 = c05602;
                            i = i4;
                            i2 = iM1596;
                        } catch (Throwable th) {
                            th = th;
                            c0560 = c05602;
                        }
                        try {
                            m1636(abstractC0573M1601.f1263, abstractC04192, c0568M1839, c0245, set, bitSet, z, z2);
                            bitSet.clear(c0560.f1263.f1043);
                        } catch (Throwable th2) {
                            th = th2;
                            bitSet.clear(c0560.f1263.f1043);
                            throw th;
                        }
                    }
                } else {
                    i = i4;
                    i2 = iM1596;
                    if (abstractC0573M1601 instanceof AbstractC0421) {
                        if (z) {
                            m1636(abstractC0573M1601.f1263, abstractC04192, abstractC0552, c0245, set, bitSet, z, z2);
                        } else {
                            c0245.m890(0);
                        }
                    } else if (abstractC0573M1601.mo1604()) {
                        m1636(abstractC0573M1601.f1263, abstractC04192, abstractC0552, c0245, set, bitSet, z, z2);
                    } else if (abstractC0573M1601.getClass() == C0575.class) {
                        c0245.m893(C0245.m886(1, this.f1072.f1000));
                    } else {
                        C0245 c0245Mo1610 = abstractC0573M1601.mo1610();
                        if (c0245Mo1610 != null) {
                            if (abstractC0573M1601 instanceof C0544) {
                                c0245Mo1610 = c0245Mo1610.m894(C0245.m886(1, this.f1072.f1000));
                            }
                            c0245.m893(c0245Mo1610);
                        }
                    }
                }
                i4 = i + 1;
            }
        }
    }
}
