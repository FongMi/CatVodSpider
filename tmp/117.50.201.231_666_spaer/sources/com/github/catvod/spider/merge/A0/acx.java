package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class acx extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        boolean zAa;
        BitSet bitSet = new BitSet();
        rdVar.p();
        int iAk = rdVar.ak();
        int i = 0;
        while (iAk != 2) {
            int iH = wb.h(iAk);
            if (iH == 5 || iH == 6) {
                int iAc = rdVar.ac();
                if (iAc == 0) {
                    zAa = false;
                } else {
                    if (iAc != 1) {
                        throw new yc("Invalid bitset value " + iAc + ", expected 0 or 1; at path " + rdVar.w(true));
                    }
                    zAa = true;
                }
            } else {
                if (iH != 7) {
                    throw new yc("Invalid bitset value type: " + wb.i(iAk) + "; at path " + rdVar.w(false));
                }
                zAa = rdVar.aa();
            }
            if (zAa) {
                bitSet.set(i);
            }
            i++;
            iAk = rdVar.ak();
        }
        rdVar.t();
        return bitSet;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        aagVar.p();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            aagVar.ac(bitSet.get(i) ? 1L : 0L);
        }
        aagVar.s();
    }
}
