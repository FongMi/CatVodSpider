package com.github.catvod.spider.merge.ej;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1061g extends ArrayList<com.github.catvod.spider.merge.Em.l> {
    public C1061g() {
    }

    public C1061g(int i) {
        super(i);
    }

    public C1061g(List<com.github.catvod.spider.merge.Em.l> list) {
        super(list);
    }

    public C1061g(com.github.catvod.spider.merge.Em.l... lVarArr) {
        super(Arrays.asList(lVarArr));
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.Em.l lVar : this) {
            if (lVar.o(str)) {
                return lVar.c(str);
            }
        }
        return "";
    }

    public final C1061g b(int i) {
        return size() > i ? new C1061g(get(i)) : new C1061g();
    }

    public final com.github.catvod.spider.merge.Em.l c() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C1061g c1061g = new C1061g(size());
        Iterator<com.github.catvod.spider.merge.Em.l> it = iterator();
        while (it.hasNext()) {
            c1061g.add(it.next().j());
        }
        return c1061g;
    }

    public final C1061g d(String str) {
        com.github.catvod.spider.merge.Dw.i.i(str);
        N nH = P.h(str);
        C1061g c1061g = new C1061g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.Em.l lVar : this) {
            com.github.catvod.spider.merge.Dw.i.k(nH);
            com.github.catvod.spider.merge.Dw.i.k(lVar);
            for (com.github.catvod.spider.merge.Em.l lVar2 : C1057c.a(nH, lVar)) {
                if (identityHashMap.put(lVar2, Boolean.TRUE) == null) {
                    c1061g.add(lVar2);
                }
            }
        }
        return c1061g;
    }

    public final String e() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        for (com.github.catvod.spider.merge.Em.l lVar : this) {
            if (sbA.length() != 0) {
                sbA.append(" ");
            }
            sbA.append(lVar.p0());
        }
        return com.github.catvod.spider.merge.Dw.e.g(sbA);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbA = com.github.catvod.spider.merge.Dw.e.a();
        for (com.github.catvod.spider.merge.Em.l lVar : this) {
            if (sbA.length() != 0) {
                sbA.append("\n");
            }
            sbA.append(lVar.u());
        }
        return com.github.catvod.spider.merge.Dw.e.g(sbA);
    }
}
