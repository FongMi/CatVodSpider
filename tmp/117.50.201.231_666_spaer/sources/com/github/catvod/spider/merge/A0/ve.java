package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ve extends bf {
    public final vf[] a;

    public ve(vf vfVar, vf vfVar2) {
        HashSet hashSet = new HashSet();
        if (vfVar instanceof ve) {
            hashSet.addAll(Arrays.asList(((ve) vfVar).a));
        } else {
            hashSet.add(vfVar);
        }
        if (vfVar2 instanceof ve) {
            hashSet.addAll(Arrays.asList(((ve) vfVar2).a));
        } else {
            hashSet.add(vfVar2);
        }
        List listF = vf.f(hashSet);
        if (!listF.isEmpty()) {
            hashSet.add((aae) Collections.max(listF));
        }
        this.a = (vf[]) hashSet.toArray(new vf[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final vf b(wl wlVar, rf rfVar) {
        ArrayList arrayList = new ArrayList();
        vf[] vfVarArr = this.a;
        int length = vfVarArr.length;
        int i = 0;
        boolean z = false;
        while (true) {
            nb nbVar = vf.e;
            if (i >= length) {
                if (!z) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                vf vfVar = (vf) arrayList.get(0);
                for (int i2 = 1; i2 < arrayList.size(); i2++) {
                    vf vfVar2 = (vf) arrayList.get(i2);
                    if (vfVar == null) {
                        vfVar = vfVar2;
                    } else if (vfVar2 != null) {
                        if (vfVar == nbVar || vfVar2 == nbVar) {
                            vfVar = nbVar;
                        } else {
                            ve veVar = new ve(vfVar, vfVar2);
                            vf[] vfVarArr2 = veVar.a;
                            vfVar = vfVarArr2.length == 1 ? vfVarArr2[0] : veVar;
                        }
                    }
                }
                return vfVar;
            }
            vf vfVar3 = vfVarArr[i];
            vf vfVarB = vfVar3.b(wlVar, rfVar);
            z |= vfVarB != vfVar3;
            if (vfVarB == nbVar) {
                return nbVar;
            }
            if (vfVarB != null) {
                arrayList.add(vfVarB);
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.vf
    public final boolean d(wl wlVar, rf rfVar) {
        for (vf vfVar : this.a) {
            if (vfVar.d(wlVar, rfVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve) {
            return Arrays.equals(this.a, ((ve) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ve.class.hashCode();
        vf[] vfVarArr = this.a;
        for (vf vfVar : vfVarArr) {
            iHashCode = po.k(iHashCode, vfVar);
        }
        return po.e(iHashCode, vfVarArr.length);
    }

    public final String toString() {
        return ko.h(Arrays.asList(this.a).iterator(), "||");
    }
}
