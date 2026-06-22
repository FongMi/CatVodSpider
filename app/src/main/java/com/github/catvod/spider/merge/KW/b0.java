package com.github.catvod.spider.merge.KW;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class b0 {
    public static boolean a(C0818f c0818f) {
        Iterator<C0814b> it = c0818f.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof e0)) {
                return false;
            }
        }
        return true;
    }

    public static Collection<BitSet> b(C0818f c0818f) {
        a0 a0Var = new a0();
        for (C0814b c0814b : c0818f) {
            BitSet bitSet = (BitSet) a0Var.get(c0814b);
            if (bitSet == null) {
                bitSet = new BitSet();
                a0Var.put(c0814b, bitSet);
            }
            bitSet.set(c0814b.b);
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
