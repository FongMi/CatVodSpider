package com.github.catvod.spider.merge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၡ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0552 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final C0430 f1232 = new C0430();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static int f1233 = 0;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final int f1234;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final int f1235;

    protected AbstractC0552(int i) {
        int i2 = f1233;
        f1233 = i2 + 1;
        this.f1234 = i2;
        this.f1235 = i;
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected static int m1804() {
        return C0120.m406(C0120.m409(1), 0);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected static int m1805(AbstractC0552 abstractC0552, int i) {
        return C0120.m406(C0120.m410(C0120.m411(C0120.m409(1), abstractC0552), i), 2);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected static int m1806(AbstractC0552[] abstractC0552Arr, int[] iArr) {
        int iM409 = C0120.m409(1);
        for (AbstractC0552 abstractC0552 : abstractC0552Arr) {
            iM409 = C0120.m411(iM409, abstractC0552);
        }
        for (int i : iArr) {
            iM409 = C0120.m410(iM409, i);
        }
        return C0120.m406(iM409, abstractC0552Arr.length * 2);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected static void m1807(AbstractC0552[] abstractC0552Arr) {
        HashMap map = new HashMap();
        for (AbstractC0552 abstractC0552 : abstractC0552Arr) {
            if (!map.containsKey(abstractC0552)) {
                map.put(abstractC0552, abstractC0552);
            }
        }
        for (int i = 0; i < abstractC0552Arr.length; i++) {
            abstractC0552Arr[i] = (AbstractC0552) map.get(abstractC0552Arr[i]);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static AbstractC0552 m1808(C0405 c0405, C0396 c0396) {
        if (c0396 == null) {
            c0396 = C0396.f985;
        }
        C0396 c03962 = c0396.f986;
        return (c03962 == null || c0396 == C0396.f985) ? f1232 : C0568.m1839(m1808(c0405, c03962), ((C0560) c0405.f994.get(c0396.f987).m1601(0)).f1248.f1042);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static AbstractC0552 m1809(AbstractC0552 abstractC0552, C0553 c0553, IdentityHashMap<AbstractC0552, AbstractC0552> identityHashMap) {
        if (abstractC0552.mo1608()) {
            return abstractC0552;
        }
        AbstractC0552 abstractC05522 = identityHashMap.get(abstractC0552);
        if (abstractC05522 != null) {
            return abstractC05522;
        }
        AbstractC0552 abstractC0552M1816 = c0553.m1816(abstractC0552);
        if (abstractC0552M1816 != null) {
            identityHashMap.put(abstractC0552, abstractC0552M1816);
            return abstractC0552M1816;
        }
        AbstractC0552[] abstractC0552Arr = new AbstractC0552[abstractC0552.mo1609()];
        boolean z = false;
        for (int i = 0; i < abstractC0552Arr.length; i++) {
            AbstractC0552 abstractC0552M1809 = m1809(abstractC0552.mo1606(i), c0553, identityHashMap);
            if (z || abstractC0552M1809 != abstractC0552.mo1606(i)) {
                if (!z) {
                    abstractC0552Arr = new AbstractC0552[abstractC0552.mo1609()];
                    for (int i2 = 0; i2 < abstractC0552.mo1609(); i2++) {
                        abstractC0552Arr[i2] = abstractC0552.mo1606(i2);
                    }
                    z = true;
                }
                abstractC0552Arr[i] = abstractC0552M1809;
            }
        }
        if (!z) {
            c0553.m1815(abstractC0552);
            identityHashMap.put(abstractC0552, abstractC0552);
            return abstractC0552;
        }
        AbstractC0552 abstractC0552M1839 = abstractC0552Arr.length == 0 ? f1232 : abstractC0552Arr.length == 1 ? C0568.m1839(abstractC0552Arr[0], abstractC0552.mo1607(0)) : new C0423(abstractC0552Arr, ((C0423) abstractC0552).f1054);
        c0553.m1815(abstractC0552M1839);
        identityHashMap.put(abstractC0552M1839, abstractC0552M1839);
        identityHashMap.put(abstractC0552, abstractC0552M1839);
        return abstractC0552M1839;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static AbstractC0552 m1810(AbstractC0552 abstractC0552, AbstractC0552 abstractC05522, boolean z, C0585<AbstractC0552, AbstractC0552, AbstractC0552> c0585) {
        if (abstractC0552 == abstractC05522 || abstractC0552.equals(abstractC05522)) {
            return abstractC0552;
        }
        boolean z2 = abstractC0552 instanceof C0568;
        if (z2 && (abstractC05522 instanceof C0568)) {
            return m1813((C0568) abstractC0552, (C0568) abstractC05522, z, c0585);
        }
        if (z) {
            if (abstractC0552 instanceof C0430) {
                return abstractC0552;
            }
            if (abstractC05522 instanceof C0430) {
                return abstractC05522;
            }
        }
        if (z2) {
            abstractC0552 = new C0423((C0568) abstractC0552);
        }
        if (abstractC05522 instanceof C0568) {
            abstractC05522 = new C0423((C0568) abstractC05522);
        }
        return m1811((C0423) abstractC0552, (C0423) abstractC05522, z, c0585);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static AbstractC0552 m1811(C0423 c0423, C0423 c04232, boolean z, C0585<AbstractC0552, AbstractC0552, AbstractC0552> c0585) {
        int[] iArr;
        if (c0585 != null) {
            AbstractC0552 abstractC0552M1855 = c0585.m1855(c0423, c04232);
            if (abstractC0552M1855 != null) {
                return abstractC0552M1855;
            }
            AbstractC0552 abstractC0552M18552 = c0585.m1855(c04232, c0423);
            if (abstractC0552M18552 != null) {
                return abstractC0552M18552;
            }
        }
        int[] iArr2 = c0423.f1054;
        int length = iArr2.length;
        int[] iArr3 = c04232.f1054;
        int[] iArrCopyOf = new int[length + iArr3.length];
        int length2 = iArr2.length + iArr3.length;
        AbstractC0552[] abstractC0552Arr = new AbstractC0552[length2];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iArr = c0423.f1054;
            if (i >= iArr.length) {
                break;
            }
            int[] iArr4 = c04232.f1054;
            if (i2 >= iArr4.length) {
                break;
            }
            AbstractC0552 abstractC0552 = c0423.f1053[i];
            AbstractC0552 abstractC05522 = c04232.f1053[i2];
            if (iArr[i] == iArr4[i2]) {
                int i4 = iArr[i];
                boolean z2 = i4 == Integer.MAX_VALUE && abstractC0552 == null && abstractC05522 == null;
                boolean z3 = (abstractC0552 == null || abstractC05522 == null || !abstractC0552.equals(abstractC05522)) ? false : true;
                if (z2 || z3) {
                    abstractC0552Arr[i3] = abstractC0552;
                    iArrCopyOf[i3] = i4;
                } else {
                    abstractC0552Arr[i3] = m1810(abstractC0552, abstractC05522, z, c0585);
                    iArrCopyOf[i3] = i4;
                }
                i++;
            } else if (iArr[i] < iArr4[i2]) {
                abstractC0552Arr[i3] = abstractC0552;
                iArrCopyOf[i3] = iArr[i];
                i++;
                i3++;
            } else {
                abstractC0552Arr[i3] = abstractC05522;
                iArrCopyOf[i3] = iArr4[i2];
            }
            i2++;
            i3++;
        }
        if (i >= iArr.length) {
            while (true) {
                int[] iArr5 = c04232.f1054;
                if (i2 >= iArr5.length) {
                    break;
                }
                abstractC0552Arr[i3] = c04232.f1053[i2];
                iArrCopyOf[i3] = iArr5[i2];
                i3++;
                i2++;
            }
        } else {
            while (true) {
                int[] iArr6 = c0423.f1054;
                if (i >= iArr6.length) {
                    break;
                }
                abstractC0552Arr[i3] = c0423.f1053[i];
                iArrCopyOf[i3] = iArr6[i];
                i3++;
                i++;
            }
        }
        if (i3 < length2) {
            if (i3 == 1) {
                C0568 c0568M1839 = C0568.m1839(abstractC0552Arr[0], iArrCopyOf[0]);
                if (c0585 != null) {
                    c0585.m1856(c0423, c04232, c0568M1839);
                }
                return c0568M1839;
            }
            abstractC0552Arr = (AbstractC0552[]) Arrays.copyOf(abstractC0552Arr, i3);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
        }
        C0423 c04233 = new C0423(abstractC0552Arr, iArrCopyOf);
        if (c04233.equals(c0423)) {
            if (c0585 != null) {
                c0585.m1856(c0423, c04232, c0423);
            }
            return c0423;
        }
        if (c04233.equals(c04232)) {
            if (c0585 != null) {
                c0585.m1856(c0423, c04232, c04232);
            }
            return c04232;
        }
        m1807(abstractC0552Arr);
        if (c0585 != null) {
            c0585.m1856(c0423, c04232, c04233);
        }
        return c04233;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static AbstractC0552 m1812(C0568 c0568, C0568 c05682, boolean z) {
        if (z) {
            C0430 c0430 = f1232;
            if (c0568 == c0430 || c05682 == c0430) {
                return c0430;
            }
        } else {
            C0430 c04302 = f1232;
            if (c0568 == c04302 && c05682 == c04302) {
                return c04302;
            }
            if (c0568 == c04302) {
                return new C0423(new AbstractC0552[]{c05682.f1257, null}, new int[]{c05682.f1258, Integer.MAX_VALUE});
            }
            if (c05682 == c04302) {
                return new C0423(new AbstractC0552[]{c0568.f1257, null}, new int[]{c0568.f1258, Integer.MAX_VALUE});
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public static AbstractC0552 m1813(C0568 c0568, C0568 c05682, boolean z, C0585<AbstractC0552, AbstractC0552, AbstractC0552> c0585) {
        AbstractC0552 abstractC0552;
        if (c0585 != null) {
            AbstractC0552 abstractC0552M1855 = c0585.m1855(c0568, c05682);
            if (abstractC0552M1855 != null) {
                return abstractC0552M1855;
            }
            AbstractC0552 abstractC0552M18552 = c0585.m1855(c05682, c0568);
            if (abstractC0552M18552 != null) {
                return abstractC0552M18552;
            }
        }
        AbstractC0552 abstractC0552M1812 = m1812(c0568, c05682, z);
        if (abstractC0552M1812 != null) {
            if (c0585 != null) {
                c0585.m1856(c0568, c05682, abstractC0552M1812);
            }
            return abstractC0552M1812;
        }
        if (c0568.f1258 == c05682.f1258) {
            AbstractC0552 abstractC0552M1810 = m1810(c0568.f1257, c05682.f1257, z, c0585);
            if (abstractC0552M1810 == c0568.f1257) {
                return c0568;
            }
            if (abstractC0552M1810 == c05682.f1257) {
                return c05682;
            }
            C0568 c0568M1839 = C0568.m1839(abstractC0552M1810, c0568.f1258);
            if (c0585 != null) {
                c0585.m1856(c0568, c05682, c0568M1839);
            }
            return c0568M1839;
        }
        AbstractC0552 abstractC05522 = null;
        if (c0568 == c05682 || ((abstractC0552 = c0568.f1257) != null && abstractC0552.equals(c05682.f1257))) {
            abstractC05522 = c0568.f1257;
        }
        if (abstractC05522 != null) {
            int i = c0568.f1258;
            int i2 = c05682.f1258;
            int[] iArr = {i, i2};
            if (i > i2) {
                iArr[0] = i2;
                iArr[1] = i;
            }
            C0423 c0423 = new C0423(new AbstractC0552[]{abstractC05522, abstractC05522}, iArr);
            if (c0585 != null) {
                c0585.m1856(c0568, c05682, c0423);
            }
            return c0423;
        }
        int i3 = c0568.f1258;
        int i4 = c05682.f1258;
        int[] iArr2 = {i3, i4};
        AbstractC0552 abstractC05523 = c0568.f1257;
        AbstractC0552 abstractC05524 = c05682.f1257;
        AbstractC0552[] abstractC0552Arr = {abstractC05523, abstractC05524};
        if (i3 > i4) {
            iArr2[0] = i4;
            iArr2[1] = i3;
            abstractC0552Arr = new AbstractC0552[]{abstractC05524, abstractC05523};
        }
        C0423 c04232 = new C0423(abstractC0552Arr, iArr2);
        if (c0585 != null) {
            c0585.m1856(c0568, c05682, c04232);
        }
        return c04232;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.f1235;
    }

    /* JADX INFO: renamed from: ԭ */
    public abstract AbstractC0552 mo1606(int i);

    /* JADX INFO: renamed from: Ԯ */
    public abstract int mo1607(int i);

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public boolean m1814() {
        return mo1607(mo1609() - 1) == Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֏ */
    public boolean mo1608() {
        return this == f1232;
    }

    /* JADX INFO: renamed from: ރ */
    public abstract int mo1609();
}
