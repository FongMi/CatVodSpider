package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class wt extends wp {
    public static List a(hp hpVar) {
        Iterator it = hpVar.iterator();
        if (!it.hasNext()) {
            return eh.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return sx.l(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
