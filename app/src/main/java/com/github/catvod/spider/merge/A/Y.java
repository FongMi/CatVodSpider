package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class Y extends a0 {
    public final d0[] b;

    public Y(d0 d0Var, d0 d0Var2) {
        HashSet hashSet = new HashSet();
        if (d0Var instanceof Y) {
            hashSet.addAll(Arrays.asList(((Y) d0Var).b));
        } else {
            hashSet.add(d0Var);
        }
        if (d0Var2 instanceof Y) {
            hashSet.addAll(Arrays.asList(((Y) d0Var2).b));
        } else {
            hashSet.add(d0Var2);
        }
        List listA = d0.a(hashSet);
        if (!listA.isEmpty()) {
            hashSet.add((b0) Collections.min(listA));
        }
        this.b = (d0[]) hashSet.toArray(new d0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final boolean c(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        for (d0 d0Var : this.b) {
            if (!d0Var.c(uVar, rVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final d0 d(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        ArrayList arrayList = new ArrayList();
        d0[] d0VarArr = this.b;
        int length = d0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            c0 c0Var = d0.a;
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return c0Var;
                }
                d0 d0VarB = (d0) arrayList.get(0);
                while (i < arrayList.size()) {
                    d0VarB = d0.b(d0VarB, (d0) arrayList.get(i));
                    i++;
                }
                return d0VarB;
            }
            d0 d0Var = d0VarArr[i];
            d0 d0VarD = d0Var.d(uVar, rVar);
            i2 |= d0VarD == d0Var ? 0 : 1;
            if (d0VarD == null) {
                return null;
            }
            if (d0VarD != c0Var) {
                arrayList.add(d0VarD);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return Arrays.equals(this.b, ((Y) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Y.class.hashCode();
        d0[] d0VarArr = this.b;
        for (d0 d0Var : d0VarArr) {
            iHashCode = com.github.catvod.spider.merge.R.a.c(iHashCode, d0Var);
        }
        return com.github.catvod.spider.merge.R.a.a(iHashCode, d0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.R.b.a(Arrays.asList(this.b).iterator(), "&&");
    }
}
