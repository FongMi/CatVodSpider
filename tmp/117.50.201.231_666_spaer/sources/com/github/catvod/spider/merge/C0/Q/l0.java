package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.P.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class l0 {
    public static final k0 c = new k0();

    static List a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            j0 j0Var = (l0) it.next();
            if (j0Var instanceof j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static l0 b(l0 l0Var, l0 l0Var2) {
        k0 k0Var;
        if (l0Var == null || l0Var == (k0Var = c)) {
            return l0Var2;
        }
        if (l0Var2 == null || l0Var2 == k0Var) {
            return l0Var;
        }
        g0 g0Var = new g0(l0Var, l0Var2);
        l0[] l0VarArr = g0Var.d;
        return l0VarArr.length == 1 ? l0VarArr[0] : g0Var;
    }

    public static l0 e(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            return l0Var2;
        }
        if (l0Var2 == null) {
            return l0Var;
        }
        h0 h0Var = c;
        if (l0Var != h0Var && l0Var2 != h0Var) {
            h0Var = new h0(l0Var, l0Var2);
            l0[] l0VarArr = h0Var.d;
            if (l0VarArr.length == 1) {
                return l0VarArr[0];
            }
        }
        return h0Var;
    }

    public abstract boolean c(com.github.catvod.spider.merge.C0.P.B<?, ?> b, C c2);

    public l0 d(com.github.catvod.spider.merge.C0.P.B<?, ?> b, C c2) {
        return this;
    }
}
