package com.github.catvod.spider.merge.z;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class b0 {
    public static boolean a(C0287f c0287f) {
        Iterator<C0283b> it = c0287f.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof e0)) {
                return false;
            }
        }
        return true;
    }

    public static Collection<BitSet> b(C0287f c0287f) {
        a0 a0Var = new a0();
        for (C0283b c0283b : c0287f) {
            BitSet bitSet = (BitSet) a0Var.get(c0283b);
            if (bitSet == null) {
                bitSet = new BitSet();
                a0Var.put(c0283b, bitSet);
            }
            bitSet.set(c0283b.b);
        }
        return a0Var.values();
    }

    public static int c(Collection<BitSet> collection) {
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
}
