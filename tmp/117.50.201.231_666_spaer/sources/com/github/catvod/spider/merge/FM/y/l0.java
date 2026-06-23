package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.AbstractC0425C;
import com.github.catvod.spider.merge.FM.x.C0426D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class l0 {
    public static final k0 a = new k0();

    static List a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var instanceof j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((j0) l0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static l0 b(l0 l0Var, l0 l0Var2) {
        k0 k0Var;
        if (l0Var == null || l0Var == (k0Var = a)) {
            return l0Var2;
        }
        if (l0Var2 == null || l0Var2 == k0Var) {
            return l0Var;
        }
        g0 g0Var = new g0(l0Var, l0Var2);
        l0[] l0VarArr = g0Var.b;
        return l0VarArr.length == 1 ? l0VarArr[0] : g0Var;
    }

    public static l0 e(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            return l0Var2;
        }
        if (l0Var2 == null) {
            return l0Var;
        }
        k0 k0Var = a;
        l0 l0Var3 = k0Var;
        l0Var3 = k0Var;
        if (l0Var != k0Var && l0Var2 != k0Var) {
            h0 h0Var = new h0(l0Var, l0Var2);
            l0[] l0VarArr = h0Var.b;
            l0Var3 = h0Var;
            if (l0VarArr.length == 1) {
                return l0VarArr[0];
            }
        }
        return l0Var3;
    }

    public abstract boolean c(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d);

    public l0 d(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
        return this;
    }
}
