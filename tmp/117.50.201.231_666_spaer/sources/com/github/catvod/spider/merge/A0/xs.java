package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xs extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        long j;
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        rp rpVar = new rp();
        for (ed edVar : uvVar.d().a) {
            Stack stack = uvVar.b;
            rg rgVar = new rg();
            rgVar.b = false;
            rp rpVar2 = new rp();
            rgVar.a = rpVar2;
            rpVar2.add(edVar);
            rgVar.c = uvVar.d();
            stack.push(rgVar);
            as asVar = (as) ((jz) k(jz.class)).b(uvVar);
            stack.pop();
            Serializable serializable = asVar.a;
            if (serializable instanceof Number) {
                long jLongValue = asVar.h().longValue();
                long j2 = 0;
                if (jLongValue < 0) {
                    if (Objects.equals(edVar.g.b, "JX_TEXT")) {
                        String strAu = edVar.au("EL_SAME_TAG_ALL_NUM");
                        j = ((long) (fx.c(strAu) ? -1 : Integer.parseInt(strAu))) + jLongValue + 1;
                        jLongValue = 1;
                    } else {
                        rg rgVarD = uvVar.d();
                        rp rpVar3 = new rp();
                        ed edVar2 = (ed) edVar.ap;
                        String str = edVar.g.b;
                        edVar2.getClass();
                        wc.c(str);
                        for (ed edVar3 : bh.a(new et(qf.d(str), 9, false), edVar2)) {
                            if (rgVarD.a.contains(edVar3)) {
                                rpVar3.add(edVar3);
                            }
                        }
                        long size = ((long) rpVar3.size()) + jLongValue;
                        jLongValue = 1;
                        j = size + 1;
                        j2 = 0;
                    }
                    if (j >= j2) {
                        jLongValue = j;
                    }
                }
                if (Objects.equals(edVar.g.b, "JX_TEXT")) {
                    if (jLongValue == (fx.c(edVar.au("EL_SAME_TAG_INDEX")) ? -1 : Integer.parseInt(r7))) {
                        rpVar.add(edVar);
                    }
                } else {
                    rg rgVarD2 = uvVar.d();
                    ed edVar4 = (ed) edVar.ap;
                    edVar4.getClass();
                    int i = 1;
                    for (ed edVar5 : new rp(edVar4.z())) {
                        if (edVar.g.b.equals(edVar5.g.b) && rgVarD2.a.contains(edVar5)) {
                            if (edVar.equals(edVar5)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (jLongValue == i) {
                        rpVar.add(edVar);
                    }
                }
            } else if (serializable instanceof Boolean) {
                if (asVar.e().booleanValue()) {
                    rpVar.add(edVar);
                }
            } else if (serializable instanceof String) {
                if (!fx.c(asVar.i())) {
                    rpVar.add(edVar);
                }
            } else if (!(serializable instanceof rp)) {
                if (!(serializable instanceof List)) {
                    throw new tv("unknown expr val:" + asVar);
                }
                if (((List) serializable).size() > 0) {
                    rpVar.add(edVar);
                }
            } else if (((rp) serializable).size() > 0) {
                rpVar.add(edVar);
            }
        }
        return as.d(rpVar);
    }
}
