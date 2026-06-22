package com.github.catvod.spider.merge;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၦ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum EnumC0554 {
    f1237,
    f1238,
    f1239;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၦ$Ϳ, reason: contains not printable characters */
    private static final class C0555 extends AbstractC0581<C0406> {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public static final C0555 f1241 = new C0555();

        private C0555() {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0587
        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo412(C0406 c0406, C0406 c04062) {
            if (c0406 == c04062) {
                return true;
            }
            return c0406 != null && c04062 != null && c0406.f1004.f1042 == c04062.f1004.f1042 && c0406.f1006.equals(c04062.f1006);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0587
        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo413(C0406 c0406) {
            return C0120.m406(C0120.m411(C0120.m410(C0120.m409(7), c0406.f1004.f1042), c0406.f1006), 2);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ၦ$Ԩ, reason: contains not printable characters */
    static class C0556 extends C0588<C0406, BitSet> {
        public C0556() {
            super(C0555.f1241);
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static boolean m1817(C0407 c0407) {
        Iterator<C0406> it = c0407.iterator();
        while (it.hasNext()) {
            if (!(it.next().f1004 instanceof C0559)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static boolean m1818(Collection<BitSet> collection) {
        return !m1826(collection);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static boolean m1819(Collection<BitSet> collection) {
        Iterator<BitSet> it = collection.iterator();
        BitSet next = it.next();
        while (it.hasNext()) {
            if (!it.next().equals(next)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static BitSet m1820(Collection<BitSet> collection) {
        BitSet bitSet = new BitSet();
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            bitSet.or(it.next());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static Collection<BitSet> m1821(C0407 c0407) {
        C0556 c0556 = new C0556();
        for (C0406 c0406 : c0407) {
            BitSet bitSet = (BitSet) c0556.get(c0406);
            if (bitSet == null) {
                bitSet = new BitSet();
                c0556.put(c0406, bitSet);
            }
            bitSet.set(c0406.f1005);
        }
        return c0556.values();
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static int m1822(Collection<BitSet> collection) {
        BitSet bitSet = new BitSet();
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static Map<AbstractC0419, BitSet> m1823(C0407 c0407) {
        HashMap map = new HashMap();
        for (C0406 c0406 : c0407) {
            BitSet bitSet = (BitSet) map.get(c0406.f1004);
            if (bitSet == null) {
                bitSet = new BitSet();
                map.put(c0406.f1004, bitSet);
            }
            bitSet.set(c0406.f1005);
        }
        return map;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static boolean m1824(C0407 c0407) {
        Iterator<C0406> it = c0407.iterator();
        while (it.hasNext()) {
            if (it.next().f1004 instanceof C0559) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static boolean m1825(Collection<BitSet> collection) {
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().cardinality() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static boolean m1826(Collection<BitSet> collection) {
        Iterator<BitSet> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static boolean m1827(EnumC0554 enumC0554, C0407 c0407) {
        if (m1817(c0407)) {
            return true;
        }
        if (enumC0554 == f1237 && c0407.f1014) {
            C0407 c04072 = new C0407();
            Iterator<C0406> it = c0407.iterator();
            while (it.hasNext()) {
                c04072.add(new C0406(it.next(), AbstractC0561.f1249));
            }
            c0407 = c04072;
        }
        return m1825(m1821(c0407)) && !m1828(c0407);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    public static boolean m1828(C0407 c0407) {
        Iterator<BitSet> it = m1823(c0407).values().iterator();
        while (it.hasNext()) {
            if (it.next().cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public static int m1829(Collection<BitSet> collection) {
        return m1822(collection);
    }
}
