package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zq extends bf {
    public final vf[] a;

    public zq(vf vfVar, vf vfVar2) {
        HashSet hashSet = new HashSet();
        if (vfVar instanceof zq) {
            hashSet.addAll(Arrays.asList(((zq) vfVar).a));
        } else {
            hashSet.add(vfVar);
        }
        if (vfVar2 instanceof zq) {
            hashSet.addAll(Arrays.asList(((zq) vfVar2).a));
        } else {
            hashSet.add(vfVar2);
        }
        List listF = vf.f(hashSet);
        if (!listF.isEmpty()) {
            hashSet.add((aae) Collections.min(listF));
        }
        this.a = (vf[]) hashSet.toArray(new vf[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final vf b(wl wlVar, rf rfVar) {
        ArrayList arrayList = new ArrayList();
        vf[] vfVarArr = this.a;
        int length = vfVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            nb nbVar = vf.e;
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return nbVar;
                }
                vf vfVarG = (vf) arrayList.get(0);
                while (i < arrayList.size()) {
                    vfVarG = vf.g(vfVarG, (vf) arrayList.get(i));
                    i++;
                }
                return vfVarG;
            }
            vf vfVar = vfVarArr[i];
            vf vfVarB = vfVar.b(wlVar, rfVar);
            i2 |= vfVarB == vfVar ? 0 : 1;
            if (vfVarB == null) {
                return null;
            }
            if (vfVarB != nbVar) {
                arrayList.add(vfVarB);
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final boolean d(wl wlVar, rf rfVar) {
        for (vf vfVar : this.a) {
            if (!vfVar.d(wlVar, rfVar)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zq) {
            return Arrays.equals(this.a, ((zq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = zq.class.hashCode();
        vf[] vfVarArr = this.a;
        for (vf vfVar : vfVarArr) {
            iHashCode = po.k(iHashCode, vfVar);
        }
        return po.e(iHashCode, vfVarArr.length);
    }

    public final String toString() {
        return ko.h(Arrays.asList(this.a).iterator(), "&&");
    }
}
