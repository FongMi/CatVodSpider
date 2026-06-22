package com.github.catvod.spider.merge.N;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class e extends ArrayList {
    public e() {
    }

    public final String a(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (lVar.k(str)) {
                return lVar.c(str);
            }
        }
        return "";
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (lVar.k(str)) {
                arrayList.add(lVar.c(str));
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (lVar.F()) {
                arrayList.add(lVar.O());
            }
        }
        return arrayList;
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        e eVar = new e(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            eVar.add(((com.github.catvod.spider.merge.L.l) it.next()).clone());
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(int i) {
        return size() > i ? new e((com.github.catvod.spider.merge.L.l) get(i)) : new e();
    }

    public final String e() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(lVar.G());
        }
        return com.github.catvod.spider.merge.K.b.g(sbB);
    }

    public final e f(String str) {
        com.github.catvod.spider.merge.J.b.d(str);
        o oVarJ = q.j(str);
        e eVar = new e();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            com.github.catvod.spider.merge.J.b.f(oVarJ);
            com.github.catvod.spider.merge.J.b.f(lVar);
            e<com.github.catvod.spider.merge.L.l> eVar2 = new e();
            com.github.catvod.spider.merge.R.g.a(new a(lVar, eVar2, oVarJ), lVar);
            for (com.github.catvod.spider.merge.L.l lVar2 : eVar2) {
                if (identityHashMap.put(lVar2, Boolean.TRUE) == null) {
                    eVar.add(lVar2);
                }
            }
        }
        return eVar;
    }

    public final String g() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (sbB.length() != 0) {
                sbB.append(" ");
            }
            sbB.append(lVar.O());
        }
        return com.github.catvod.spider.merge.K.b.g(sbB);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) it.next();
            if (sbB.length() != 0) {
                sbB.append("\n");
            }
            sbB.append(lVar.p());
        }
        return com.github.catvod.spider.merge.K.b.g(sbB);
    }

    public e(int i) {
        super(i);
    }

    public e(List list) {
        super(list);
    }

    public e(com.github.catvod.spider.merge.L.l... lVarArr) {
        super(Arrays.asList(lVarArr));
    }
}
