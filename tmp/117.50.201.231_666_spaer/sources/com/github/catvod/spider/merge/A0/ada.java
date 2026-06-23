package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ada extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((mc) k(mc.class)) != null && !((mc) k(mc.class)).n()) {
            return (as) ((mc) k(mc.class)).b(uvVar);
        }
        to toVar = this.a;
        if (toVar == null) {
            return (as) ((bg) k(bg.class)).b(uvVar);
        }
        if ("//".equals(toVar.j())) {
            uvVar.d().b = true;
        }
        return (as) ((go) k(go.class)).b(uvVar);
    }
}
