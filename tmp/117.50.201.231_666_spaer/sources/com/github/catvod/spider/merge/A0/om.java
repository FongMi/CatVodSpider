package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class om extends rf {
    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((kb) k(kb.class)) != null) {
            return (as) ((kb) k(kb.class)).b(uvVar);
        }
        if (m(5) == null) {
            return null;
        }
        String strC = m(5).c();
        if (jr.b.get(strC) != null) {
            throw new ClassCastException();
        }
        throw new tv("not support nodeTest: " + strC);
    }
}
