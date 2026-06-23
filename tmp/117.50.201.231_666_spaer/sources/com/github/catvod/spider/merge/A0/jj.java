package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jj {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public nm[] c;
    public hy[] d;
    public final int e;
    public final int f;
    public int[] g;
    public r[] h;
    public final ArrayList i;

    public jj(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    public final acc j(int i) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (acc) arrayList.get(i);
    }

    public final ii k(int i, rf rfVar) {
        if (i >= 0) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                ii iiVarL = l((lq) arrayList.get(i));
                if (!iiVarL.f(-2)) {
                    return iiVarL;
                }
                ii iiVar = new ii(new int[0]);
                iiVar.e(iiVarL);
                iiVar.h();
                while (rfVar != null) {
                    int i2 = rfVar.f;
                    if (i2 < 0 || !iiVarL.f(-2)) {
                        break;
                    }
                    iiVarL = l(((abw) ((lq) arrayList.get(i2)).k(0)).f);
                    iiVar.e(iiVarL);
                    iiVar.h();
                    rfVar = rfVar.e;
                }
                if (iiVarL.f(-2)) {
                    iiVar.c(-1);
                }
                return iiVar;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }

    public final ii l(lq lqVar) {
        ii iiVar = lqVar.i;
        if (iiVar != null) {
            return iiVar;
        }
        ii iiVarM = m(lqVar, null);
        lqVar.i = iiVarM;
        iiVarM.b = true;
        return iiVarM;
    }

    public final ii m(lq lqVar, rf rfVar) {
        xa xaVar = new xa(5, this);
        ii iiVar = new ii(new int[0]);
        xaVar.e(lqVar, rfVar != null ? xr.j(lqVar.d, rfVar) : null, iiVar, new HashSet(), new BitSet());
        return iiVar;
    }
}
