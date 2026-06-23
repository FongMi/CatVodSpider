package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aax extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        boolean z;
        as asVar;
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((nu) k(nu.class)) != null && !((nu) k(nu.class)).n()) {
            return (as) ((nu) k(nu.class)).b(uvVar);
        }
        boolean z2 = false;
        if (((rn) k(rn.class)) == null || ((rn) k(rn.class)).n() || (asVar = (as) ((rn) k(rn.class)).b(uvVar)) == null) {
            z = false;
        } else {
            Serializable serializable = asVar.a;
            if (serializable instanceof rp) {
                uvVar.e((rp) serializable);
            } else if (asVar.b) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (((om) k(om.class)) != null && !((om) k(om.class)).n()) {
            as asVar2 = (as) ((om) k(om.class)).b(uvVar);
            if (z2) {
                rp rpVar = uvVar.d().a;
                String strI = asVar2.i();
                if (!uvVar.d().b) {
                    if (rpVar.size() == 1) {
                        return as.d(uvVar.d().d().au(strI));
                    }
                    LinkedList linkedList = new LinkedList();
                    Iterator<E> it = rpVar.iterator();
                    while (it.hasNext()) {
                        linkedList.add(((ed) it.next()).au(strI));
                    }
                    return as.d(linkedList);
                }
                if (rpVar.size() == 1) {
                    rp rpVarAh = uvVar.d().d().ah("[" + strI + "]");
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<E> it2 = rpVarAh.iterator();
                    while (it2.hasNext()) {
                        linkedList2.add(((ed) it2.next()).au(strI));
                    }
                    return as.d(linkedList2);
                }
                rp rpVar2 = new rp();
                Iterator<E> it3 = rpVar.iterator();
                while (it3.hasNext()) {
                    rpVar2.addAll(((ed) it3.next()).ah("[" + strI + "]"));
                }
                LinkedList linkedList3 = new LinkedList();
                Iterator<E> it4 = rpVar2.iterator();
                while (it4.hasNext()) {
                    linkedList3.add(((ed) it4.next()).au(strI));
                }
                return as.d(linkedList3);
            }
            if (asVar2.c) {
                String strI2 = asVar2.i();
                rp rpVar3 = uvVar.d().a;
                if (uvVar.d().b) {
                    uvVar.e(rpVar3.e(strI2));
                } else {
                    rp rpVar4 = new rp();
                    for (ed edVar : uvVar.d().a) {
                        if (!z) {
                            edVar.getClass();
                            for (ed edVar2 : new rp(edVar.z())) {
                                if (edVar2.s().equals(strI2) || Marker.ANY_MARKER.equals(strI2)) {
                                    rpVar4.add(edVar2);
                                }
                            }
                        } else if (edVar.s().equals(strI2) || Marker.ANY_MARKER.equals(strI2)) {
                            rpVar4.add(edVar);
                        }
                    }
                    uvVar.e(rpVar4);
                }
            } else {
                Serializable serializable2 = asVar2.a;
                if (!(serializable2 instanceof rp)) {
                    return asVar2;
                }
                uvVar.e((rp) serializable2);
            }
        }
        if (l(xs.class) != null && l(xs.class).size() > 0) {
            Iterator it5 = l(xs.class).iterator();
            while (it5.hasNext()) {
                uvVar.e((rp) ((as) ((xs) it5.next()).b(uvVar)).a);
            }
        }
        return as.d(uvVar.d().a);
    }
}
