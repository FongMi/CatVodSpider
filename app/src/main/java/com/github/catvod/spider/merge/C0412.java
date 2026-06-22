package com.github.catvod.spider.merge;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0412 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static final int f1023 = 3;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final UUID f1024;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final UUID f1025;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final UUID f1026;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final UUID f1027;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final List<UUID> f1028;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static final UUID f1029;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private final C0411 f1030;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ$Ϳ, reason: contains not printable characters */
    static class C0413 implements InterfaceC0416 {
        C0413() {
        }

        @Override // com.github.catvod.spider.merge.C0412.InterfaceC0416
        public int size() {
            return 1;
        }

        @Override // com.github.catvod.spider.merge.C0412.InterfaceC0416
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public int mo1591(char[] cArr, int i) {
            return C0412.m1579(cArr[i]);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ$Ԩ, reason: contains not printable characters */
    static class C0414 implements InterfaceC0416 {
        C0414() {
        }

        @Override // com.github.catvod.spider.merge.C0412.InterfaceC0416
        public int size() {
            return 2;
        }

        @Override // com.github.catvod.spider.merge.C0412.InterfaceC0416
        /* JADX INFO: renamed from: Ϳ */
        public int mo1591(char[] cArr, int i) {
            return C0412.m1580(cArr, i);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ$Ԫ, reason: contains not printable characters */
    static /* synthetic */ class C0415 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        static final /* synthetic */ int[] f1031;

        static {
            int[] iArr = new int[EnumC0446.values().length];
            f1031 = iArr;
            try {
                iArr[EnumC0446.f1098.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1031[EnumC0446.f1099.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1031[EnumC0446.f1100.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1031[EnumC0446.f1101.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1031[EnumC0446.f1102.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1031[EnumC0446.f1103.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1031[EnumC0446.f1104.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1031[EnumC0446.f1105.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ$Ԭ, reason: contains not printable characters */
    interface InterfaceC0416 {
        int size();

        /* JADX INFO: renamed from: Ϳ */
        int mo1591(char[] cArr, int i);
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࢮ$Ԯ, reason: contains not printable characters */
    enum EnumC0417 {
        f1032,
        f1033
    }

    static {
        UUID uuidFromString = UUID.fromString(SOY.d("49616640453548167C414C35387F65374044576A1346365A4E1464343132421310353244"));
        f1024 = uuidFromString;
        UUID uuidFromString2 = UUID.fromString(SOY.d("4B16104637424D167C4037474C7F65454C36576B1344435A4B6213353644391761304246"));
        f1025 = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString(SOY.d("3B1315344C334D177C3731323C7F6542454257131544365A426061423041391461424632"));
        f1026 = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString(SOY.d("4F6B6744434042667C4536324F7F6547433657106833365A426362473540486A67464C4E"));
        f1027 = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        f1028 = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f1029 = uuidFromString4;
    }

    public C0412() {
        this(C0411.m1572());
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private int m1576(char[] cArr, int i, List<C0245> list, InterfaceC0416 interfaceC0416) {
        int size = i + 1;
        int iM1579 = m1579(cArr[i]);
        for (int i2 = 0; i2 < iM1579; i2++) {
            int iM15792 = m1579(cArr[size]);
            int i3 = size + 1;
            C0245 c0245 = new C0245(new int[0]);
            list.add(c0245);
            int i4 = i3 + 1;
            if (m1579(cArr[i3]) != 0) {
                c0245.m890(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < iM15792; i5++) {
                int iMo1591 = interfaceC0416.mo1591(cArr, size);
                int size2 = size + interfaceC0416.size();
                int iMo15912 = interfaceC0416.mo1591(cArr, size2);
                size = size2 + interfaceC0416.size();
                c0245.m891(iMo1591, iMo15912);
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    static InterfaceC0416 m1577(EnumC0417 enumC0417) {
        return enumC0417 == EnumC0417.f1032 ? new C0413() : new C0414();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected static boolean m1578(UUID uuid, UUID uuid2) {
        List<UUID> list = f1028;
        int iIndexOf = list.indexOf(uuid);
        return iIndexOf >= 0 && list.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected static int m1579(char c) {
        return c;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected static int m1580(char[] cArr, int i) {
        return (cArr[i + 1] << 16) | cArr[i];
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected static long m1581(char[] cArr, int i) {
        return (((long) m1580(cArr, i + 2)) << 32) | (((long) m1580(cArr, i)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected static UUID m1582(char[] cArr, int i) {
        return new UUID(m1581(cArr, i + 4), m1581(cArr, i));
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected void m1583(boolean z) {
        m1584(z, null);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected void m1584(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public C0405 m1585(char[] cArr) throws CloneNotSupportedException {
        AbstractC0419 next;
        AbstractC0573 abstractC0573M1601;
        char[] cArr2 = (char[]) cArr.clone();
        for (int i = 1; i < cArr2.length; i++) {
            cArr2[i] = (char) (cArr2[i] - 2);
        }
        int iM1579 = m1579(cArr2[0]);
        int i2 = f1023;
        if (iM1579 != i2) {
            throw new UnsupportedOperationException(new InvalidClassException(C0405.class.getName(), String.format(Locale.getDefault(), SOY.d("393D241A1057143D255610120937231F151B1328345635233472261F001F5A243404071E153C715310575237290611140E3735565113537C"), Integer.valueOf(iM1579), Integer.valueOf(i2))));
        }
        UUID uuidM1582 = m1582(cArr2, 1);
        if (!f1028.contains(uuidM1582)) {
            throw new UnsupportedOperationException(new InvalidClassException(C0405.class.getName(), String.format(Locale.getDefault(), SOY.d("393D241A1057143D255610120937231F151B1328345635233472261F001F5A07043F30575F21715E110F0A37320211135A7722561B055A33711A11101B312856212233167858"), uuidM1582, f1029)));
        }
        boolean zM1578 = m1578(f1025, uuidM1582);
        boolean zM15782 = m1578(f1026, uuidM1582);
        C0405 c0405 = new C0405(EnumC0420.values()[m1579(cArr2[9])], m1579(cArr2[10]));
        ArrayList<C0123> arrayList = new ArrayList();
        ArrayList<C0123> arrayList2 = new ArrayList();
        int iM15792 = m1579(cArr2[11]);
        int i3 = 12;
        int i4 = 0;
        int i5 = 12;
        while (i4 < iM15792) {
            int i6 = i5 + 1;
            int iM15793 = m1579(cArr2[i5]);
            if (iM15793 == 0) {
                c0405.m1544(null);
                i5 = i6;
            } else {
                int i7 = i6 + 1;
                int iM15794 = m1579(cArr2[i6]);
                if (iM15794 == 65535) {
                    iM15794 = -1;
                }
                AbstractC0419 abstractC0419M1589 = m1589(iM15793, iM15794);
                if (iM15793 == i3) {
                    arrayList.add(new C0123((C0541) abstractC0419M1589, Integer.valueOf(m1579(cArr2[i7]))));
                    i7++;
                } else if (abstractC0419M1589 instanceof AbstractC0428) {
                    arrayList2.add(new C0123((AbstractC0428) abstractC0419M1589, Integer.valueOf(m1579(cArr2[i7]))));
                    i7++;
                }
                c0405.m1544(abstractC0419M1589);
                i5 = i7;
            }
            i4++;
            i3 = 12;
        }
        for (C0123 c0123 : arrayList) {
            ((C0541) c0123.f309).f1212 = c0405.f994.get(((Integer) c0123.f310).intValue());
        }
        for (C0123 c01232 : arrayList2) {
            ((AbstractC0428) c01232.f309).f1057 = (C0427) c0405.f994.get(((Integer) c01232.f310).intValue());
        }
        int iM15795 = m1579(cArr2[i5]);
        int i8 = i5 + 1;
        int i9 = 0;
        while (i9 < iM15795) {
            ((AbstractC0429) c0405.f994.get(m1579(cArr2[i8]))).f1059 = true;
            i9++;
            i8++;
        }
        if (zM1578) {
            int iM15796 = m1579(cArr2[i8]);
            i8++;
            int i10 = 0;
            while (i10 < iM15796) {
                ((C0558) c0405.f994.get(m1579(cArr2[i8]))).f1245 = true;
                i10++;
                i8++;
            }
        }
        int i11 = i8 + 1;
        int iM15797 = m1579(cArr2[i8]);
        if (c0405.f999 == EnumC0420.f1047) {
            c0405.f1001 = new int[iM15797];
        }
        c0405.f996 = new C0558[iM15797];
        int i12 = i11;
        for (int i13 = 0; i13 < iM15797; i13++) {
            int i14 = i12 + 1;
            c0405.f996[i13] = (C0558) c0405.f994.get(m1579(cArr2[i12]));
            if (c0405.f999 == EnumC0420.f1047) {
                i12 = i14 + 1;
                int iM15798 = m1579(cArr2[i14]);
                if (iM15798 == 65535) {
                    iM15798 = -1;
                }
                c0405.f1001[i13] = iM15798;
                if (!m1578(f1026, uuidM1582)) {
                    i14 = i12 + 1;
                    m1579(cArr2[i12]);
                    i12 = i14;
                }
            } else {
                i12 = i14;
            }
        }
        c0405.f997 = new C0559[iM15797];
        for (AbstractC0419 abstractC0419 : c0405.f994) {
            if (abstractC0419 instanceof C0559) {
                C0559 c0559 = (C0559) abstractC0419;
                C0559[] c0559Arr = c0405.f997;
                int i15 = abstractC0419.f1043;
                c0559Arr[i15] = c0559;
                c0405.f996[i15].f1244 = c0559;
            }
        }
        int iM15799 = m1579(cArr2[i12]);
        int i16 = i12 + 1;
        int i17 = 0;
        while (i17 < iM15799) {
            c0405.f1003.add((C0572) c0405.f994.get(m1579(cArr2[i16])));
            i17++;
            i16++;
        }
        List<C0245> arrayList3 = new ArrayList<>();
        int iM1576 = m1576(cArr2, i16, arrayList3, m1577(EnumC0417.f1032));
        if (m1578(f1027, uuidM1582)) {
            iM1576 = m1576(cArr2, iM1576, arrayList3, m1577(EnumC0417.f1033));
        }
        int i18 = iM1576 + 1;
        int i19 = 0;
        for (int iM157910 = m1579(cArr2[iM1576]); i19 < iM157910; iM157910 = iM157910) {
            int iM157911 = m1579(cArr2[i18]);
            c0405.f994.get(iM157911).m1595(m1586(c0405, m1579(cArr2[i18 + 2]), iM157911, m1579(cArr2[i18 + 1]), m1579(cArr2[i18 + 3]), m1579(cArr2[i18 + 4]), m1579(cArr2[i18 + 5]), arrayList3));
            i18 += 6;
            i19++;
        }
        for (AbstractC0419 abstractC04192 : c0405.f994) {
            for (int i20 = 0; i20 < abstractC04192.m1596(); i20++) {
                AbstractC0573 abstractC0573M16012 = abstractC04192.m1601(i20);
                if (abstractC0573M16012 instanceof C0560) {
                    C0560 c0560 = (C0560) abstractC0573M16012;
                    C0558[] c0558Arr = c0405.f996;
                    int i21 = c0560.f1263.f1043;
                    if (!c0558Arr[i21].f1245 || c0560.f1247 != 0) {
                        i21 = -1;
                    }
                    c0405.f997[c0560.f1263.f1043].m1595(new C0431(c0560.f1248, i21));
                }
            }
        }
        for (AbstractC0419 abstractC04193 : c0405.f994) {
            if (abstractC04193 instanceof AbstractC0428) {
                AbstractC0428 abstractC0428 = (AbstractC0428) abstractC04193;
                C0427 c0427 = abstractC0428.f1057;
                if (c0427 == null) {
                    throw new IllegalStateException();
                }
                if (c0427.f1056 != null) {
                    throw new IllegalStateException();
                }
                c0427.f1056 = abstractC0428;
            }
            if (abstractC04193 instanceof C0549) {
                C0549 c0549 = (C0549) abstractC04193;
                for (int i22 = 0; i22 < c0549.m1596(); i22++) {
                    AbstractC0419 abstractC04194 = c0549.m1601(i22).f1263;
                    if (abstractC04194 instanceof C0548) {
                        ((C0548) abstractC04194).f1227 = c0549;
                    }
                }
            } else if (abstractC04193 instanceof C0571) {
                C0571 c0571 = (C0571) abstractC04193;
                for (int i23 = 0; i23 < c0571.m1596(); i23++) {
                    AbstractC0419 abstractC04195 = c0571.m1601(i23).f1263;
                    if (abstractC04195 instanceof C0570) {
                        ((C0570) abstractC04195).f1259 = c0571;
                    }
                }
            }
        }
        int i24 = i18 + 1;
        int iM157912 = m1579(cArr2[i18]);
        int i25 = 1;
        while (i25 <= iM157912) {
            int i26 = i24 + 1;
            AbstractC0429 abstractC0429 = (AbstractC0429) c0405.f994.get(m1579(cArr2[i24]));
            c0405.f995.add(abstractC0429);
            abstractC0429.f1058 = i25 - 1;
            i25++;
            i24 = i26;
        }
        if (c0405.f999 == EnumC0420.f1047) {
            if (zM15782) {
                int i27 = i24 + 1;
                c0405.f1002 = new InterfaceC0444[m1579(cArr2[i24])];
                int i28 = 0;
                while (i28 < c0405.f1002.length) {
                    int i29 = i27 + 1;
                    EnumC0446 enumC0446 = EnumC0446.values()[m1579(cArr2[i27])];
                    int i30 = i29 + 1;
                    int iM157913 = m1579(cArr2[i29]);
                    if (iM157913 == 65535) {
                        iM157913 = -1;
                    }
                    int i31 = i30 + 1;
                    int iM157914 = m1579(cArr2[i30]);
                    if (iM157914 == 65535) {
                        iM157914 = -1;
                    }
                    c0405.f1002[i28] = m1587(enumC0446, iM157913, iM157914);
                    i28++;
                    i27 = i31;
                }
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (AbstractC0419 abstractC04196 : c0405.f994) {
                    for (int i32 = 0; i32 < abstractC04196.m1596(); i32++) {
                        AbstractC0573 abstractC0573M16013 = abstractC04196.m1601(i32);
                        if (abstractC0573M16013 instanceof C0422) {
                            C0422 c0422 = (C0422) abstractC0573M16013;
                            int i33 = c0422.f1050;
                            C0449 c0449 = new C0449(i33, c0422.f1051);
                            abstractC04196.m1600(i32, new C0422(abstractC0573M16013.f1263, i33, arrayList4.size(), false));
                            arrayList4.add(c0449);
                        }
                    }
                }
                c0405.f1002 = (InterfaceC0444[]) arrayList4.toArray(new InterfaceC0444[arrayList4.size()]);
            }
        }
        m1588(c0405);
        if (this.f1030.m1574()) {
            m1590(c0405);
        }
        if (this.f1030.m1573() && c0405.f999 == EnumC0420.f1048) {
            c0405.f1001 = new int[c0405.f996.length];
            for (int i34 = 0; i34 < c0405.f996.length; i34++) {
                c0405.f1001[i34] = c0405.f1000 + i34 + 1;
            }
            for (int i35 = 0; i35 < c0405.f996.length; i35++) {
                C0425 c0425 = new C0425();
                c0425.f1043 = i35;
                c0405.m1544(c0425);
                C0427 c04272 = new C0427();
                c04272.f1043 = i35;
                c0405.m1544(c04272);
                c0425.f1057 = c04272;
                c0405.m1545(c0425);
                c04272.f1056 = c0425;
                if (c0405.f996[i35].f1245) {
                    Iterator<AbstractC0419> it = c0405.f994.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (next.f1043 == i35 && (next instanceof C0570)) {
                            AbstractC0419 abstractC04197 = next.m1601(next.m1596() - 1).f1263;
                            if ((abstractC04197 instanceof C0541) && abstractC04197.f1044 && (abstractC04197.m1601(0).f1263 instanceof C0559)) {
                                break;
                            }
                        }
                    }
                    if (next == null) {
                        throw new UnsupportedOperationException(SOY.d("393D241A10195D26711F1012142638100D571C3B3F171857092630021157153471021C125A22231317121E373F15115708273D1354070837371F0C57093732021D18147C"));
                    }
                    abstractC0573M1601 = ((C0570) next).f1259.m1601(0);
                } else {
                    next = c0405.f997[i35];
                    abstractC0573M1601 = null;
                }
                Iterator<AbstractC0419> it2 = c0405.f994.iterator();
                while (it2.hasNext()) {
                    for (AbstractC0573 abstractC0573 : it2.next().f1045) {
                        if (abstractC0573 != abstractC0573M1601 && abstractC0573.f1263 == next) {
                            abstractC0573.f1263 = c04272;
                        }
                    }
                }
                while (c0405.f996[i35].m1596() > 0) {
                    C0558[] c0558Arr2 = c0405.f996;
                    c0425.m1595(c0558Arr2[i35].m1599(c0558Arr2[i35].m1596() - 1));
                }
                c0405.f996[i35].m1595(new C0431(c0425));
                c04272.m1595(new C0431(next));
                AbstractC0419 c0426 = new C0426();
                c0405.m1544(c0426);
                c0426.m1595(new C0424(c04272, c0405.f1001[i35]));
                c0425.m1595(new C0431(c0426));
            }
            if (this.f1030.m1574()) {
                m1590(c0405);
            }
        }
        return c0405;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected AbstractC0573 m1586(C0405 c0405, int i, int i2, int i3, int i4, int i5, int i6, List<C0245> list) {
        AbstractC0419 abstractC0419 = c0405.f994.get(i3);
        switch (i) {
            case 1:
                return new C0431(abstractC0419);
            case 2:
                return i6 != 0 ? new C0557(abstractC0419, -1, i5) : new C0557(abstractC0419, i4, i5);
            case 3:
                return new C0560((C0558) c0405.f994.get(i4), i5, i6, abstractC0419);
            case 4:
                return new C0551(abstractC0419, i4, i5, i6 != 0);
            case 5:
                return i6 != 0 ? new C0424(abstractC0419, -1) : new C0424(abstractC0419, i4);
            case 6:
                return new C0422(abstractC0419, i4, i5, i6 != 0);
            case 7:
                return new C0567(abstractC0419, list.get(i4));
            case 8:
                return new C0544(abstractC0419, list.get(i4));
            case 9:
                return new C0575(abstractC0419);
            case 10:
                return new C0550(abstractC0419, i4);
            default:
                throw new IllegalArgumentException(SOY.d("2E3A345607071F3138101D121E7225041519093B251F1B195A2628061157132171181B035A24301A1D1354"));
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected InterfaceC0444 m1587(EnumC0446 enumC0446, int i, int i2) {
        switch (C0415.f1031[enumC0446.ordinal()]) {
            case 1:
                return new C0447(i);
            case 2:
                return new C0449(i, i2);
            case 3:
                return new C0451(i);
            case 4:
                return C0452.f1114;
            case 5:
                return C0453.f1115;
            case 6:
                return new C0463(i);
            case 7:
                return C0464.f1127;
            case 8:
                return new C0540(i);
            default:
                throw new IllegalArgumentException(String.format(Locale.getDefault(), SOY.d("2E3A345607071F3138101D121E723D130C1208723015001E153C71020D071F727412541E09723F1900570C333D1F1059"), enumC0446));
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected void m1588(C0405 c0405) {
        for (AbstractC0419 abstractC0419 : c0405.f994) {
            if ((abstractC0419 instanceof C0570) && c0405.f996[abstractC0419.f1043].f1245) {
                AbstractC0419 abstractC04192 = abstractC0419.m1601(abstractC0419.m1596() - 1).f1263;
                if ((abstractC04192 instanceof C0541) && abstractC04192.f1044 && (abstractC04192.m1601(0).f1263 instanceof C0559)) {
                    ((C0570) abstractC0419).f1260 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected AbstractC0419 m1589(int i, int i2) {
        AbstractC0419 c0426;
        switch (i) {
            case 0:
                return null;
            case 1:
                c0426 = new C0426();
                break;
            case 2:
                c0426 = new C0558();
                break;
            case 3:
                c0426 = new C0425();
                break;
            case 4:
                c0426 = new C0548();
                break;
            case 5:
                c0426 = new C0569();
                break;
            case 6:
                c0426 = new C0572();
                break;
            case 7:
                c0426 = new C0559();
                break;
            case 8:
                c0426 = new C0427();
                break;
            case 9:
                c0426 = new C0571();
                break;
            case 10:
                c0426 = new C0570();
                break;
            case 11:
                c0426 = new C0549();
                break;
            case 12:
                c0426 = new C0541();
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.getDefault(), SOY.d("2E3A345607071F3138101D121E72220215031F72250F04125A7735561D045A3C3E0254011B3E38125A"), Integer.valueOf(i)));
        }
        c0426.f1043 = i2;
        return c0426;
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected void m1590(C0405 c0405) {
        for (AbstractC0419 abstractC0419 : c0405.f994) {
            if (abstractC0419 != null) {
                m1583(abstractC0419.m1598() || abstractC0419.m1596() <= 1);
                if (abstractC0419 instanceof C0548) {
                    m1583(((C0548) abstractC0419).f1227 != null);
                }
                if (abstractC0419 instanceof C0570) {
                    C0570 c0570 = (C0570) abstractC0419;
                    m1583(c0570.f1259 != null);
                    m1583(c0570.m1596() == 2);
                    if (c0570.m1601(0).f1263 instanceof C0569) {
                        m1583(c0570.m1601(1).f1263 instanceof C0541);
                        m1583(!c0570.f1059);
                    } else {
                        if (!(c0570.m1601(0).f1263 instanceof C0541)) {
                            throw new IllegalStateException();
                        }
                        m1583(c0570.m1601(1).f1263 instanceof C0569);
                        m1583(c0570.f1059);
                    }
                }
                if (abstractC0419 instanceof C0571) {
                    m1583(abstractC0419.m1596() == 1);
                    m1583(abstractC0419.m1601(0).f1263 instanceof C0570);
                }
                if (abstractC0419 instanceof C0541) {
                    m1583(((C0541) abstractC0419).f1212 != null);
                }
                if (abstractC0419 instanceof C0558) {
                    m1583(((C0558) abstractC0419).f1244 != null);
                }
                if (abstractC0419 instanceof AbstractC0428) {
                    m1583(((AbstractC0428) abstractC0419).f1057 != null);
                }
                if (abstractC0419 instanceof C0427) {
                    m1583(((C0427) abstractC0419).f1056 != null);
                }
                if (abstractC0419 instanceof AbstractC0429) {
                    AbstractC0429 abstractC0429 = (AbstractC0429) abstractC0419;
                    m1583(abstractC0429.m1596() <= 1 || abstractC0429.f1058 >= 0);
                } else {
                    m1583(abstractC0419.m1596() <= 1 || (abstractC0419 instanceof C0559));
                }
            }
        }
    }

    public C0412(C0411 c0411) {
        this.f1030 = c0411 == null ? C0411.m1572() : c0411;
    }
}
