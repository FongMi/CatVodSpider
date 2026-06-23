package com.github.catvod.spider.merge.A0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class tj extends dr {
    public int f = 0;
    public int g = 0;
    public final ArrayList a = new ArrayList();
    public final ArrayList e = new ArrayList();

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        return this.g;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dr) it.next()).d();
        }
    }

    public final void h() {
        ArrayList<dr> arrayList = this.a;
        this.f = arrayList.size();
        this.g = 0;
        for (dr drVar : arrayList) {
            this.g = drVar.b() + this.g;
        }
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.sort(Comparator.comparingInt(new tg()));
    }
}
