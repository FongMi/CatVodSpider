package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class vf {
    public static final nb e = new nb();

    public static List f(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            vf vfVar = (vf) it.next();
            if (vfVar instanceof aae) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((aae) vfVar);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public static vf g(vf vfVar, vf vfVar2) {
        nb nbVar;
        if (vfVar == null || vfVar == (nbVar = e)) {
            return vfVar2;
        }
        if (vfVar2 == null || vfVar2 == nbVar) {
            return vfVar;
        }
        zq zqVar = new zq(vfVar, vfVar2);
        vf[] vfVarArr = zqVar.a;
        return vfVarArr.length == 1 ? vfVarArr[0] : zqVar;
    }

    public vf b(wl wlVar, rf rfVar) {
        return this;
    }

    public abstract boolean d(wl wlVar, rf rfVar);
}
