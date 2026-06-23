package com.github.catvod.spider.merge.A0;

import java.util.Objects;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class co extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        Stack stack = uvVar.b;
        rg rgVar = new rg(uvVar.c.a);
        rgVar.c = uvVar.d();
        stack.push(rgVar);
        if (Objects.equals(this.a.j(), "//")) {
            uvVar.d().b = true;
        }
        as asVar = (as) ((go) k(go.class)).b(uvVar);
        stack.pop();
        return asVar;
    }
}
