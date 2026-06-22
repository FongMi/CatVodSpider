package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.AbstractC0248C;
import com.github.catvod.spider.merge.y.C0249D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class g0 extends i0 {
    public final l0[] b;

    public g0(l0 l0Var, l0 l0Var2) {
        HashSet hashSet = new HashSet();
        if (l0Var instanceof g0) {
            hashSet.addAll(Arrays.asList(((g0) l0Var).b));
        } else {
            hashSet.add(l0Var);
        }
        if (l0Var2 instanceof g0) {
            hashSet.addAll(Arrays.asList(((g0) l0Var2).b));
        } else {
            hashSet.add(l0Var2);
        }
        List listA = l0.a(hashSet);
        if (!listA.isEmpty()) {
            hashSet.add((j0) Collections.min(listA));
        }
        this.b = (l0[]) hashSet.toArray(new l0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.z.l0
    public final boolean c(AbstractC0248C<?, ?> abstractC0248C, C0249D c0249d) {
        for (l0 l0Var : this.b) {
            if (!l0Var.c(abstractC0248C, c0249d)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.z.l0
    public final l0 d(AbstractC0248C<?, ?> abstractC0248C, C0249D c0249d) {
        ArrayList arrayList = new ArrayList();
        l0[] l0VarArr = this.b;
        int length = l0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return l0.a;
                }
                l0 l0VarB = (l0) arrayList.get(0);
                while (i < arrayList.size()) {
                    l0VarB = l0.b(l0VarB, (l0) arrayList.get(i));
                    i++;
                }
                return l0VarB;
            }
            l0 l0Var = l0VarArr[i];
            l0 l0VarD = l0Var.d(abstractC0248C, c0249d);
            i2 |= l0VarD == l0Var ? 0 : 1;
            if (l0VarD == null) {
                return null;
            }
            if (l0VarD != l0.a) {
                arrayList.add(l0VarD);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return Arrays.equals(this.b, ((g0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        l0[] l0VarArr = this.b;
        int iHashCode = g0.class.hashCode();
        for (l0 l0Var : l0VarArr) {
            iHashCode = com.github.catvod.spider.merge.B.l.g(iHashCode, l0Var);
        }
        return com.github.catvod.spider.merge.B.l.b(iHashCode, l0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.B.p.c(Arrays.asList(this.b).iterator(), oZP.d("5349"));
    }
}
