package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class on extends kv {
    public static final ct a = new ct(1, vs.c);
    public final oa d;
    public final vs e;

    public on(oa oaVar, vs vsVar) {
        this.d = oaVar;
        this.e = vsVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iAk = rdVar.ak();
        int iH = wb.h(iAk);
        if (iH == 0) {
            rdVar.p();
            arrayList = new ArrayList();
        } else if (iH != 2) {
            arrayList = null;
        } else {
            rdVar.q();
            arrayList = new my(true);
        }
        if (arrayList == null) {
            return f(rdVar, iAk);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (rdVar.x()) {
                String strAe = arrayList instanceof Map ? rdVar.ae() : null;
                int iAk2 = rdVar.ak();
                int iH2 = wb.h(iAk2);
                if (iH2 == 0) {
                    rdVar.p();
                    arrayList2 = new ArrayList();
                } else if (iH2 != 2) {
                    arrayList2 = null;
                } else {
                    rdVar.q();
                    arrayList2 = new my(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = f(rdVar, iAk2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strAe, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    rdVar.t();
                } else {
                    rdVar.u();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.w();
            return;
        }
        Class<?> cls = obj.getClass();
        oa oaVar = this.d;
        oaVar.getClass();
        kv kvVarAa = oaVar.aa(new fj(cls));
        if (!(kvVarAa instanceof on)) {
            kvVarAa.c(aagVar, obj);
        } else {
            aagVar.q();
            aagVar.t();
        }
    }

    public final Serializable f(rd rdVar, int i) throws IOException {
        int iH = wb.h(i);
        if (iH == 5) {
            return rdVar.ai();
        }
        if (iH == 6) {
            return this.e.a(rdVar);
        }
        if (iH == 7) {
            return Boolean.valueOf(rdVar.aa());
        }
        if (iH != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(wb.i(i)));
        }
        rdVar.ag();
        return null;
    }
}
