package com.github.catvod.spider.merge;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ಀ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0441 extends AbstractC0418 {

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static int f1075;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected final AbstractC0386 f1076;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected int f1077;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected int f1078;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected int f1079;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public final C0576[] f1080;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected int f1081;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected final C0442 f1082;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ಀ$Ϳ, reason: contains not printable characters */
    protected static class C0442 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        protected int f1083 = -1;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        protected int f1084 = 0;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        protected int f1085 = -1;

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        protected C0579 f1086;

        protected C0442() {
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        protected void m1660() {
            this.f1083 = -1;
            this.f1084 = 0;
            this.f1085 = -1;
            this.f1086 = null;
        }
    }

    public C0441(AbstractC0386 abstractC0386, C0405 c0405, C0576[] c0576Arr, C0553 c0553) {
        super(c0405, c0553);
        this.f1077 = -1;
        this.f1078 = 1;
        this.f1079 = 0;
        this.f1081 = 0;
        this.f1082 = new C0442();
        this.f1080 = c0576Arr;
        this.f1076 = abstractC0386;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0418
    /* JADX INFO: renamed from: Ԩ */
    public void mo1593() {
        this.f1082.m1660();
        this.f1077 = -1;
        this.f1078 = 1;
        this.f1079 = 0;
        this.f1081 = 0;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected void m1640(InterfaceC0317 interfaceC0317, C0445 c0445, int i, int i2, int i3, int i4) throws Throwable {
        AbstractC0386 abstractC0386;
        interfaceC0317.mo1211(i2);
        this.f1078 = i3;
        this.f1079 = i4;
        if (c0445 == null || (abstractC0386 = this.f1076) == null) {
            return;
        }
        c0445.m1674(abstractC0386, interfaceC0317, i);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected C0579 m1641(C0579 c0579, int i, C0407 c0407) {
        boolean z = c0407.f1014;
        c0407.f1014 = false;
        C0579 c0579M1643 = m1643(c0407);
        if (z) {
            return c0579M1643;
        }
        m1642(c0579, i, c0579M1643);
        return c0579M1643;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected void m1642(C0579 c0579, int i, C0579 c05792) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c0579) {
            if (c0579.f1274 == null) {
                c0579.f1274 = new C0579[128];
            }
            c0579.f1274[i + 0] = c05792;
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected C0579 m1643(C0407 c0407) {
        C0579 c0579 = new C0579(c0407);
        C0406 c0406 = null;
        Iterator<C0406> it = c0407.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0406 next = it.next();
            if (next.f1004 instanceof C0559) {
                c0406 = next;
                break;
            }
        }
        if (c0406 != null) {
            c0579.f1275 = true;
            c0579.f1277 = ((C0439) c0406).m1638();
            c0579.f1276 = this.f1038.f1001[c0406.f1004.f1043];
        }
        C0576 c0576 = this.f1080[this.f1081];
        synchronized (c0576.f1264) {
            C0579 c05792 = c0576.f1264.get(c0579);
            if (c05792 != null) {
                return c05792;
            }
            c0579.f1272 = c0576.f1264.size();
            c0407.m1562(true);
            c0579.f1273 = c0407;
            c0576.f1264.put(c0579, c0579);
            return c0579;
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected void m1644(C0442 c0442, InterfaceC0317 interfaceC0317, C0579 c0579) {
        c0442.f1083 = interfaceC0317.mo1215();
        c0442.f1084 = this.f1078;
        c0442.f1085 = this.f1079;
        c0442.f1086 = c0579;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected boolean m1645(InterfaceC0317 interfaceC0317, C0439 c0439, C0407 c0407, boolean z, boolean z2, boolean z3) {
        AbstractC0419 abstractC0419 = c0439.f1004;
        if (!(abstractC0419 instanceof C0559)) {
            if (!abstractC0419.m1598() && (!z || !c0439.m1639())) {
                c0407.add(c0439);
            }
            AbstractC0419 abstractC04192 = c0439.f1004;
            boolean zM1645 = z;
            for (int i = 0; i < abstractC04192.m1596(); i++) {
                C0439 c0439M1653 = m1653(interfaceC0317, c0439, abstractC04192.m1601(i), c0407, z2, z3);
                if (c0439M1653 != null) {
                    zM1645 = m1645(interfaceC0317, c0439M1653, c0407, zM1645, z2, z3);
                }
            }
            return zM1645;
        }
        AbstractC0552 abstractC0552 = c0439.f1006;
        boolean z4 = true;
        if (abstractC0552 == null || abstractC0552.m1814()) {
            AbstractC0552 abstractC05522 = c0439.f1006;
            if (abstractC05522 == null || abstractC05522.mo1608()) {
                c0407.add(c0439);
                return true;
            }
            c0407.add(new C0439(c0439, c0439.f1004, AbstractC0552.f1232));
        } else {
            z4 = z;
        }
        AbstractC0552 abstractC05523 = c0439.f1006;
        if (abstractC05523 == null || abstractC05523.mo1608()) {
            return z4;
        }
        boolean zM16452 = z4;
        for (int i2 = 0; i2 < c0439.f1006.mo1609(); i2++) {
            if (c0439.f1006.mo1607(i2) != Integer.MAX_VALUE) {
                zM16452 = m1645(interfaceC0317, new C0439(c0439, this.f1038.f994.get(c0439.f1006.mo1607(i2)), c0439.f1006.mo1606(i2)), c0407, zM16452, z2, z3);
            }
        }
        return zM16452;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected C0407 m1646(InterfaceC0317 interfaceC0317, AbstractC0419 abstractC0419) {
        C0430 c0430 = AbstractC0552.f1232;
        C0545 c0545 = new C0545();
        int i = 0;
        while (i < abstractC0419.m1596()) {
            int i2 = i + 1;
            m1645(interfaceC0317, new C0439(abstractC0419.m1601(i).f1263, i2, c0430), c0545, false, false, false);
            i = i2;
        }
        return c0545;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected C0579 m1647(InterfaceC0317 interfaceC0317, C0579 c0579, int i) {
        C0545 c0545 = new C0545();
        m1656(interfaceC0317, c0579.f1273, c0545, i);
        if (!c0545.isEmpty()) {
            return m1641(c0579, i, c0545);
        }
        if (!c0545.f1014) {
            m1642(c0579, i, AbstractC0418.f1037);
        }
        return AbstractC0418.f1037;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public void m1648(InterfaceC0317 interfaceC0317) {
        if (interfaceC0317.mo1214(1) == 10) {
            this.f1078++;
            this.f1079 = 0;
        } else {
            this.f1079++;
        }
        interfaceC0317.mo1217();
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected boolean m1649(InterfaceC0317 interfaceC0317, int i, int i2, boolean z) {
        AbstractC0386 abstractC0386 = this.f1076;
        if (abstractC0386 == null) {
            return true;
        }
        if (!z) {
            return abstractC0386.m1533(null, i, i2);
        }
        int i3 = this.f1079;
        int i4 = this.f1078;
        int iMo1215 = interfaceC0317.mo1215();
        int iMo1209 = interfaceC0317.mo1209();
        try {
            m1648(interfaceC0317);
            return this.f1076.m1533(null, i, i2);
        } finally {
            this.f1079 = i3;
            this.f1078 = i4;
            interfaceC0317.mo1211(iMo1215);
            interfaceC0317.mo1218(iMo1209);
        }
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected int m1650(InterfaceC0317 interfaceC0317, C0579 c0579) {
        if (c0579.f1275) {
            m1644(this.f1082, interfaceC0317, c0579);
        }
        int iMo1214 = interfaceC0317.mo1214(1);
        while (true) {
            C0579 c0579M1654 = m1654(c0579, iMo1214);
            if (c0579M1654 == null) {
                c0579M1654 = m1647(interfaceC0317, c0579, iMo1214);
            }
            if (c0579M1654 == AbstractC0418.f1037) {
                break;
            }
            if (iMo1214 != -1) {
                m1648(interfaceC0317);
            }
            if (c0579M1654.f1275) {
                m1644(this.f1082, interfaceC0317, c0579M1654);
                if (iMo1214 == -1) {
                    break;
                }
            }
            iMo1214 = interfaceC0317.mo1214(1);
            c0579 = c0579M1654;
        }
        return m1651(this.f1082, interfaceC0317, c0579.f1273, iMo1214);
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected int m1651(C0442 c0442, InterfaceC0317 interfaceC0317, C0407 c0407, int i) throws Throwable {
        C0579 c0579 = c0442.f1086;
        if (c0579 != null) {
            m1640(interfaceC0317, c0579.f1277, this.f1077, c0442.f1083, c0442.f1084, c0442.f1085);
            return c0442.f1086.f1276;
        }
        if (i == -1 && interfaceC0317.mo1215() == this.f1077) {
            return -1;
        }
        throw new C0387(this.f1076, interfaceC0317, this.f1077, c0407);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    public int m1652() {
        return this.f1079;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected C0439 m1653(InterfaceC0317 interfaceC0317, C0439 c0439, AbstractC0573 abstractC0573, C0407 c0407, boolean z, boolean z2) {
        C0439 c04392;
        int iMo1603 = abstractC0573.mo1603();
        if (iMo1603 == 10) {
            throw new UnsupportedOperationException(SOY.d("2A20341511131F3C321354070837351F17160E37225615051F723F190057092721061B050E3735561D195A3E340E1105097C"));
        }
        switch (iMo1603) {
            case 1:
                return new C0439(c0439, abstractC0573.f1263);
            case 2:
            case 5:
            case 7:
                if (z2 && abstractC0573.mo1605(-1, 0, 1114111)) {
                    return new C0439(c0439, abstractC0573.f1263);
                }
                return null;
            case 3:
                c04392 = new C0439(c0439, abstractC0573.f1263, C0568.m1839(c0439.f1006, ((C0560) abstractC0573).f1248.f1042));
                return c04392;
            case 4:
                C0551 c0551 = (C0551) abstractC0573;
                c0407.f1014 = true;
                if (m1649(interfaceC0317, c0551.f1229, c0551.f1230, z)) {
                    return new C0439(c0439, abstractC0573.f1263);
                }
                return null;
            case 6:
                AbstractC0552 abstractC0552 = c0439.f1006;
                if (abstractC0552 != null && !abstractC0552.m1814()) {
                    return new C0439(c0439, abstractC0573.f1263);
                }
                c04392 = new C0439(c0439, abstractC0573.f1263, C0445.m1673(c0439.m1638(), this.f1038.f1002[((C0422) abstractC0573).f1051]));
                return c04392;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected C0579 m1654(C0579 c0579, int i) {
        C0579[] c0579Arr = c0579.f1274;
        if (c0579Arr == null || i < 0 || i > 127) {
            return null;
        }
        return c0579Arr[i + 0];
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public int m1655() {
        return this.f1078;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected void m1656(InterfaceC0317 interfaceC0317, C0407 c0407, C0407 c04072, int i) {
        int i2;
        int i3 = 0;
        for (C0406 c0406 : c0407) {
            boolean z = c0406.f1005 == i3;
            if (!z || !((C0439) c0406).m1639()) {
                int iM1596 = c0406.f1004.m1596();
                int i4 = 0;
                while (true) {
                    if (i4 >= iM1596) {
                        break;
                    }
                    AbstractC0419 abstractC0419M1657 = m1657(c0406.f1004.m1601(i4), i);
                    if (abstractC0419M1657 != null) {
                        C0439 c0439 = (C0439) c0406;
                        C0445 c0445M1638 = c0439.m1638();
                        if (c0445M1638 != null) {
                            c0445M1638 = c0445M1638.m1675(interfaceC0317.mo1215() - this.f1077);
                        }
                        i2 = i4;
                        if (m1645(interfaceC0317, new C0439(c0439, abstractC0419M1657, c0445M1638), c04072, z, true, i == -1)) {
                            i3 = c0406.f1005;
                            break;
                        }
                    } else {
                        i2 = i4;
                    }
                    i4 = i2 + 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected AbstractC0419 m1657(AbstractC0573 abstractC0573, int i) {
        if (abstractC0573.mo1605(i, 0, 1114111)) {
            return abstractC0573.f1263;
        }
        return null;
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public int m1658(InterfaceC0317 interfaceC0317, int i) {
        f1075++;
        this.f1081 = i;
        int iMo1209 = interfaceC0317.mo1209();
        try {
            this.f1077 = interfaceC0317.mo1215();
            this.f1082.m1660();
            C0576 c0576 = this.f1080[i];
            return c0576.f1265 == null ? m1659(interfaceC0317) : m1650(interfaceC0317, c0576.f1265);
        } finally {
            interfaceC0317.mo1218(iMo1209);
        }
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    protected int m1659(InterfaceC0317 interfaceC0317) {
        C0407 c0407M1646 = m1646(interfaceC0317, this.f1038.f1003.get(this.f1081));
        boolean z = c0407M1646.f1014;
        c0407M1646.f1014 = false;
        C0579 c0579M1643 = m1643(c0407M1646);
        if (!z) {
            this.f1080[this.f1081].f1265 = c0579M1643;
        }
        return m1650(interfaceC0317, c0579M1643);
    }
}
