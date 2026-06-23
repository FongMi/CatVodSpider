package com.github.catvod.spider.merge.FM.y;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class b0 {
    public static boolean a(C0464f c0464f) {
        Iterator<C0460b> it = c0464f.iterator();
        while (it.hasNext()) {
            if (!(it.next().a instanceof e0)) {
                return false;
            }
        }
        return true;
    }

    public static Collection<BitSet> b(C0464f c0464f) {
        a0 a0Var = new a0();
        for (C0460b c0460b : c0464f) {
            BitSet bitSet = (BitSet) a0Var.get(c0460b);
            if (bitSet == null) {
                bitSet = new BitSet();
                a0Var.put(c0460b, bitSet);
            }
            bitSet.set(c0460b.b);
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
