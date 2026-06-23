package com.github.catvod.spider.merge.u;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class W {
    public static boolean a(C0634c c0634c) {
        Iterator<C0633b> it = c0634c.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof Z)) {
                return false;
            }
        }
        return true;
    }

    public static Collection<BitSet> b(C0634c c0634c) {
        V v = new V();
        for (C0633b c0633b : c0634c) {
            BitSet bitSet = (BitSet) v.get(c0633b);
            if (bitSet == null) {
                bitSet = new BitSet();
                v.put(c0633b, bitSet);
            }
            bitSet.set(c0633b.b);
        }
        return v.values();
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
