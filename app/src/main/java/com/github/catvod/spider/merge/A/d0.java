package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class d0 {
    public static final c0 a = new c0();

    public static List a(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (d0Var instanceof b0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((b0) d0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static d0 b(d0 d0Var, d0 d0Var2) {
        c0 c0Var;
        if (d0Var == null || d0Var == (c0Var = a)) {
            return d0Var2;
        }
        if (d0Var2 == null || d0Var2 == c0Var) {
            return d0Var;
        }
        Y y = new Y(d0Var, d0Var2);
        d0[] d0VarArr = y.b;
        return d0VarArr.length == 1 ? d0VarArr[0] : y;
    }

    public abstract boolean c(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar);

    public d0 d(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        return this;
    }
}
