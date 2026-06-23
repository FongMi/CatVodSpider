package com.github.catvod.spider.merge.C0.e0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0180g extends ArrayList<com.github.catvod.spider.merge.C0.c0.l> {
    public C0180g() {
    }

    public C0180g(int i) {
        super(i);
    }

    public C0180g(List<com.github.catvod.spider.merge.C0.c0.l> list) {
        super(list);
    }

    public C0180g(com.github.catvod.spider.merge.C0.c0.l... lVarArr) {
        super(Arrays.asList(lVarArr));
    }

    public final String a(String str) {
        for (com.github.catvod.spider.merge.C0.c0.l lVar : this) {
            if (lVar.o(str)) {
                return lVar.c(str);
            }
        }
        return "";
    }

    public final C0180g b(int i) {
        return size() > i ? new C0180g(get(i)) : new C0180g();
    }

    public final com.github.catvod.spider.merge.C0.c0.l c() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0180g c0180g = new C0180g(size());
        Iterator<com.github.catvod.spider.merge.C0.c0.l> it = iterator();
        while (it.hasNext()) {
            c0180g.add(it.next().j());
        }
        return c0180g;
    }

    public final C0180g d(String str) {
        com.github.catvod.spider.merge.C0.N.a.i(str);
        N nH = P.h(str);
        C0180g c0180g = new C0180g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (com.github.catvod.spider.merge.C0.c0.l lVar : this) {
            com.github.catvod.spider.merge.C0.N.a.k(nH);
            com.github.catvod.spider.merge.C0.N.a.k(lVar);
            for (com.github.catvod.spider.merge.C0.c0.l lVar2 : C0176c.a(nH, lVar)) {
                if (identityHashMap.put(lVar2, Boolean.TRUE) == null) {
                    c0180g.add(lVar2);
                }
            }
        }
        return c0180g;
    }

    public final String e() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        for (com.github.catvod.spider.merge.C0.c0.l lVar : this) {
            if (sbA.length() != 0) {
                sbA.append(" ");
            }
            sbA.append(lVar.p0());
        }
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbA = com.github.catvod.spider.merge.C0.b0.b.a();
        for (com.github.catvod.spider.merge.C0.c0.l lVar : this) {
            if (sbA.length() != 0) {
                sbA.append("\n");
            }
            sbA.append(lVar.u());
        }
        return com.github.catvod.spider.merge.C0.b0.b.g(sbA);
    }
}
