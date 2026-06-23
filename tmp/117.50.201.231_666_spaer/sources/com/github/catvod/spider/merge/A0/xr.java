package com.github.catvod.spider.merge.A0;

import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class xr {
    public static final dt h = new dt(null, Integer.MAX_VALUE);
    public final int i;

    public xr(int i) {
        this.i = i;
    }

    public static ga j(jj jjVar, rf rfVar) {
        if (rfVar == null) {
            rfVar = rf.d;
        }
        rf rfVar2 = rfVar.e;
        return (rfVar2 == null || rfVar == rf.d) ? h : ga.g(j(jjVar, rfVar2), ((abw) ((lq) jjVar.a.get(rfVar.f)).k(0)).f.e);
    }

    public static xr k(xr xrVar, xa xaVar, IdentityHashMap identityHashMap) {
        if (xrVar.c()) {
            return xrVar;
        }
        xr xrVar2 = (xr) identityHashMap.get(xrVar);
        if (xrVar2 != null) {
            return xrVar2;
        }
        xr xrVar3 = (xr) ((HashMap) xaVar.d).get(xrVar);
        if (xrVar3 != null) {
            identityHashMap.put(xrVar, xrVar3);
            return xrVar3;
        }
        xr[] xrVarArr = new xr[xrVar.d()];
        boolean z = false;
        for (int i = 0; i < xrVarArr.length; i++) {
            xr xrVarK = k(xrVar.a(i), xaVar, identityHashMap);
            if (z || xrVarK != xrVar.a(i)) {
                if (!z) {
                    xrVarArr = new xr[xrVar.d()];
                    for (int i2 = 0; i2 < xrVar.d(); i2++) {
                        xrVarArr[i2] = xrVar.a(i2);
                    }
                    z = true;
                }
                xrVarArr[i] = xrVarK;
            }
        }
        dt dtVar = h;
        HashMap map = (HashMap) xaVar.d;
        if (!z) {
            if (xrVar != dtVar && ((xr) map.get(xrVar)) == null) {
                map.put(xrVar, xrVar);
            }
            identityHashMap.put(xrVar, xrVar);
            return xrVar;
        }
        xr xrVarG = xrVarArr.length == 0 ? dtVar : xrVarArr.length == 1 ? ga.g(xrVarArr[0], xrVar.b(0)) : new px(xrVarArr, ((px) xrVar).f);
        if (xrVarG != dtVar && ((xr) map.get(xrVarG)) == null) {
            map.put(xrVarG, xrVarG);
        }
        identityHashMap.put(xrVarG, xrVarG);
        identityHashMap.put(xrVar, xrVarG);
        return xrVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.A0.xr l(com.github.catvod.spider.merge.A0.xr r18, com.github.catvod.spider.merge.A0.xr r19, boolean r20, com.github.catvod.spider.merge.A0.xa r21) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.xr.l(com.github.catvod.spider.merge.A0.xr, com.github.catvod.spider.merge.A0.xr, boolean, com.github.catvod.spider.merge.A0.xa):com.github.catvod.spider.merge.A0.xr");
    }

    public abstract xr a(int i);

    public abstract int b(int i);

    public boolean c() {
        return this == h;
    }

    public abstract int d();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.i;
    }

    public final boolean m() {
        return b(d() - 1) == Integer.MAX_VALUE;
    }
}
