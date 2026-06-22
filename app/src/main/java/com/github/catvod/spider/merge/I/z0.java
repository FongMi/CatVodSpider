package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.l.C1290c;
import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class z0 {
    public Object a;
    public Object b;

    public /* synthetic */ z0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final com.github.catvod.spider.merge.G0.a a() {
        com.github.catvod.spider.merge.G0.a aVar;
        com.github.catvod.spider.merge.G0.a[] aVarArr = {com.github.catvod.spider.merge.G0.b.a((BigInteger) this.a), com.github.catvod.spider.merge.G0.b.a((BigInteger) this.b)};
        com.github.catvod.spider.merge.G0.a aVar2 = new com.github.catvod.spider.merge.G0.a(com.github.catvod.spider.merge.L1.l.h(48));
        int iE = 0;
        for (int i = 0; i < 2; i++) {
            com.github.catvod.spider.merge.G0.a aVar3 = aVarArr[i];
            iE += aVar3.e();
            aVar2.d(aVar3.a());
        }
        if (iE < 128) {
            aVar = new com.github.catvod.spider.merge.G0.a(com.github.catvod.spider.merge.L1.l.h(iE));
        } else {
            String strA = String.format("%x", Integer.valueOf(iE));
            if (strA.length() % 2 != 0) {
                strA = C1290c.a("0", strA);
            }
            aVar = new com.github.catvod.spider.merge.G0.a(com.github.catvod.spider.merge.L1.l.a(strA));
            aVar.c(0, com.github.catvod.spider.merge.L1.l.h(128 | aVar.e()));
        }
        aVar2.c(1, aVar.a());
        return aVar2;
    }
}
