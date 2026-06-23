package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class jd extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((ada) k(ada.class)) == null && !((ada) k(ada.class)).n()) {
            return (as) ((jd) k(jd.class)).b(uvVar);
        }
        as asVar = (as) ((ada) k(ada.class)).b(uvVar);
        if (this.a != null) {
            Stack stack = uvVar.b;
            rg rgVar = uvVar.d().c;
            rg rgVar2 = new rg(rgVar.a);
            rgVar2.c = rgVar;
            stack.push(rgVar2);
            as asVar2 = (as) ((jd) k(jd.class)).b(uvVar);
            stack.pop();
            Serializable serializable = asVar.a;
            if (!(serializable instanceof rp)) {
                if (serializable instanceof String) {
                    if (!(asVar2.a instanceof rp)) {
                        return as.d(asVar.i() + asVar2.i());
                    }
                    ed edVar = new ed("V");
                    String strI = asVar.i();
                    wc.e(strI);
                    edVar.y(new vy(strI));
                    ((rp) asVar2.a).add(edVar);
                    return asVar2;
                }
                if (serializable instanceof Boolean) {
                    Serializable serializable2 = asVar2.a;
                    if (serializable2 instanceof Boolean) {
                        return as.d(Boolean.valueOf(asVar2.e().booleanValue() | asVar.e().booleanValue()));
                    }
                    if (serializable2 instanceof rp) {
                        ed edVar2 = new ed("V");
                        String strI2 = asVar.i();
                        wc.e(strI2);
                        edVar2.y(new vy(strI2));
                        ((rp) asVar2.a).add(edVar2);
                        return asVar2;
                    }
                    if (serializable2 instanceof String) {
                        return as.d(asVar.e() + asVar2.i());
                    }
                    throw new tv("can not merge val1=" + asVar.e() + ",val2=" + asVar2.i());
                }
                if (!(serializable instanceof Number)) {
                    LinkedList linkedList = new LinkedList();
                    if (!fx.c(asVar.i())) {
                        linkedList.add(asVar.i());
                    }
                    if (!fx.c(asVar2.i())) {
                        linkedList.add(asVar2.i());
                    }
                    return as.d(fx.e(linkedList, ","));
                }
                Serializable serializable3 = asVar2.a;
                if (serializable3 instanceof String) {
                    return as.d(asVar.g() + asVar2.i());
                }
                if (!(serializable3 instanceof rp)) {
                    throw new tv("can not merge val1=" + asVar.g() + ",val2=" + asVar2.i());
                }
                ed edVar3 = new ed("V");
                String strI3 = asVar.i();
                wc.e(strI3);
                edVar3.y(new vy(strI3));
                ((rp) asVar2.a).add(edVar3);
                return asVar2;
            }
            Serializable serializable4 = asVar2.a;
            if (serializable4 instanceof rp) {
                ((rp) serializable).addAll((rp) serializable4);
            } else {
                ed edVar4 = new ed("V");
                String strI4 = asVar2.i();
                wc.e(strI4);
                edVar4.y(new vy(strI4));
                ((rp) asVar.a).add(edVar4);
            }
        }
        return asVar;
    }
}
