package com.github.catvod.spider.merge.A0;

import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fk extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        LinkedList linkedList = new LinkedList();
        as asVar = (as) ((adj) k(adj.class)).b(uvVar);
        for (jz jzVar : l(jz.class)) {
            Stack stack = uvVar.b;
            rg rgVarD = uvVar.d();
            rg rgVar = new rg(rgVarD.a);
            rgVar.c = rgVarD;
            stack.push(rgVar);
            linkedList.add(jzVar.b(uvVar));
            stack.pop();
        }
        String strI = asVar.i();
        if (jr.c.get(strI) != null) {
            throw new ClassCastException();
        }
        throw new tv("not support function: " + strI);
    }
}
