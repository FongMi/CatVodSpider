package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.M.D;
import com.github.catvod.spider.merge.M.E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class f extends o {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        List<com.github.catvod.spider.merge.L.q> listUnmodifiableList;
        e eVar;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (lVar2.f() == 0) {
                    listUnmodifiableList = com.github.catvod.spider.merge.L.q.c;
                } else {
                    List listJ = lVar2.j();
                    ArrayList arrayList = new ArrayList(listJ.size());
                    arrayList.addAll(listJ);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                for (com.github.catvod.spider.merge.L.q qVar : listUnmodifiableList) {
                    if (!(qVar instanceof com.github.catvod.spider.merge.L.e) && !(qVar instanceof com.github.catvod.spider.merge.L.i)) {
                        break;
                    }
                }
                break;
            case 2:
                com.github.catvod.spider.merge.L.l lVar3 = (com.github.catvod.spider.merge.L.l) lVar2.a;
                if (lVar3 == null || (lVar3 instanceof com.github.catvod.spider.merge.L.h) || lVar2.E() != 0) {
                }
                break;
            case 3:
                com.github.catvod.spider.merge.L.l lVar4 = (com.github.catvod.spider.merge.L.l) lVar2.a;
                if (lVar4 == null || (lVar4 instanceof com.github.catvod.spider.merge.L.h) || lVar2.E() != lVar4.A().size() - 1) {
                }
                break;
            case 4:
                com.github.catvod.spider.merge.L.q qVar2 = lVar2.a;
                com.github.catvod.spider.merge.L.l lVar5 = (com.github.catvod.spider.merge.L.l) qVar2;
                if (lVar5 != null && !(lVar5 instanceof com.github.catvod.spider.merge.L.h)) {
                    if (qVar2 == null) {
                        eVar = new e(0);
                    } else {
                        List<com.github.catvod.spider.merge.L.l> listZ = ((com.github.catvod.spider.merge.L.l) qVar2).z();
                        e eVar2 = new e(listZ.size() - 1);
                        for (com.github.catvod.spider.merge.L.l lVar6 : listZ) {
                            if (lVar6 != lVar2) {
                                eVar2.add(lVar6);
                            }
                        }
                        eVar = eVar2;
                    }
                    if (eVar.isEmpty()) {
                    }
                }
                break;
            case 5:
                com.github.catvod.spider.merge.L.l lVar7 = (com.github.catvod.spider.merge.L.l) lVar2.a;
                if (lVar7 != null && !(lVar7 instanceof com.github.catvod.spider.merge.L.h)) {
                    Iterator<E> it = lVar7.A().iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((com.github.catvod.spider.merge.L.l) it.next()).d.equals(lVar2.d)) {
                            i++;
                        }
                    }
                    if (i == 1) {
                    }
                }
                break;
            case 6:
                if (lVar instanceof com.github.catvod.spider.merge.L.h) {
                    lVar = (com.github.catvod.spider.merge.L.l) lVar.z().get(0);
                }
                if (lVar2 == lVar) {
                }
                break;
            case 7:
                if (!(lVar2 instanceof com.github.catvod.spider.merge.L.r)) {
                    lVar2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (com.github.catvod.spider.merge.L.q qVar3 : lVar2.f) {
                        if (qVar3 instanceof com.github.catvod.spider.merge.L.s) {
                            arrayList2.add((com.github.catvod.spider.merge.L.s) qVar3);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableList(arrayList2).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            com.github.catvod.spider.merge.L.s sVar = (com.github.catvod.spider.merge.L.s) it2.next();
                            com.github.catvod.spider.merge.L.r rVar = new com.github.catvod.spider.merge.L.r(E.a(lVar2.d.a, D.d), lVar2.e(), lVar2.d());
                            sVar.getClass();
                            com.github.catvod.spider.merge.J.b.f(sVar.a);
                            com.github.catvod.spider.merge.L.q qVar4 = sVar.a;
                            qVar4.getClass();
                            com.github.catvod.spider.merge.J.b.c(sVar.a == qVar4);
                            com.github.catvod.spider.merge.L.q qVar5 = rVar.a;
                            if (qVar5 != null) {
                                qVar5.v(rVar);
                            }
                            int i2 = sVar.b;
                            qVar4.j().set(i2, rVar);
                            rVar.a = qVar4;
                            rVar.b = i2;
                            sVar.a = null;
                            rVar.x(sVar);
                        }
                        break;
                    }
                }
                break;
            default:
                if (lVar == lVar2) {
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return super.toString();
        }
    }
}
