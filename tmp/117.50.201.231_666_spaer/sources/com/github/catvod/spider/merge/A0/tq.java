package com.github.catvod.spider.merge.A0;

import java.util.Comparator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class tq implements Comparator {
    public final /* synthetic */ qw[] a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qw[] qwVarArr = this.a;
        ko.f("$selectors", qwVarArr);
        for (qw qwVar : qwVarArr) {
            int iA = oe.a((Comparable) qwVar.invoke(obj), (Comparable) qwVar.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
