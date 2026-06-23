package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.x.AbstractC0425C;
import com.github.catvod.spider.merge.FM.x.C0426D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
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

    @Override // com.github.catvod.spider.merge.FM.y.l0
    public final boolean c(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
        for (l0 l0Var : this.b) {
            if (!l0Var.c(abstractC0425C, c0426d)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.FM.y.l0
    public final l0 d(AbstractC0425C<?, ?> abstractC0425C, C0426D c0426d) {
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
            l0 l0VarD = l0Var.d(abstractC0425C, c0426d);
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
            iHashCode = com.github.catvod.spider.merge.FM.A.l.j(iHashCode, l0Var);
        }
        return com.github.catvod.spider.merge.FM.A.l.c(iHashCode, l0VarArr.length);
    }

    public final String toString() {
        return com.github.catvod.spider.merge.FM.A.p.c(Arrays.asList(this.b).iterator(), "&&");
    }
}
