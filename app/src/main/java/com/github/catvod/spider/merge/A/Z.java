package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class Z extends a0 {
    public final d0[] b;

    public Z(d0 d0Var, d0 d0Var2) {
        HashSet hashSet = new HashSet();
        if (d0Var instanceof Z) {
            hashSet.addAll(Arrays.asList(((Z) d0Var).b));
        } else {
            hashSet.add(d0Var);
        }
        if (d0Var2 instanceof Z) {
            hashSet.addAll(Arrays.asList(((Z) d0Var2).b));
        } else {
            hashSet.add(d0Var2);
        }
        List listA = d0.a(hashSet);
        if (!listA.isEmpty()) {
            hashSet.add((b0) Collections.max(listA));
        }
        this.b = (d0[]) hashSet.toArray(new d0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final boolean c(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        for (d0 d0Var : this.b) {
            if (d0Var.c(uVar, rVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.A.d0
    public final d0 d(com.github.catvod.spider.merge.z.u uVar, com.github.catvod.spider.merge.z.r rVar) {
        ArrayList arrayList = new ArrayList();
        d0[] d0VarArr = this.b;
        int length = d0VarArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            c0 c0Var = d0.a;
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                d0 d0Var = (d0) arrayList.get(0);
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    d0 d0Var2 = (d0) arrayList.get(i2);
                    if (d0Var == null) {
                        d0Var = d0Var2;
                    } else if (d0Var2 != null) {
                        if (d0Var == c0Var || d0Var2 == c0Var) {
                            d0Var = c0Var;
                        } else {
                            Z z2 = new Z(d0Var, d0Var2);
                            d0[] d0VarArr2 = z2.b;
                            d0Var = d0VarArr2.length == 1 ? d0VarArr2[0] : z2;
                        }
                    }
                }
                return d0Var;
            }
            d0 d0Var3 = d0VarArr[i];
            d0 d0VarD = d0Var3.d(uVar, rVar);
            z |= d0VarD != d0Var3;
            if (d0VarD == c0Var) {
                return c0Var;
            }
            if (d0VarD != null) {
                arrayList.add(d0VarD);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z) {
            return Arrays.equals(this.b, ((Z) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Z.class.hashCode();
        d0[] d0VarArr = this.b;
        for (d0 d0Var : d0VarArr) {
            iHashCode = com.github.catvod.spider.merge.R.a.c(iHashCode, d0Var);
        }
        return com.github.catvod.spider.merge.R.a.a(iHashCode, d0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.R.b.a(Arrays.asList(this.b).iterator(), "||");
    }
}
