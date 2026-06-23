package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ade extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        if (((ade) k(ade.class)) == null || ((ade) k(ade.class)).n()) {
            return (as) ((ay) k(ay.class)).b(uvVar);
        }
        as asVar = (as) ((ay) k(ay.class)).b(uvVar);
        as asVar2 = (as) ((ade) k(ade.class)).b(uvVar);
        switch (this.a.a) {
            case 17:
                return as.d(Double.valueOf(asVar2.g().doubleValue() * asVar.g().doubleValue()));
            case 18:
                return as.d(Double.valueOf(asVar.g().doubleValue() / asVar2.g().doubleValue()));
            case 19:
                return as.d(Double.valueOf(asVar.g().doubleValue() % asVar2.g().doubleValue()));
            default:
                throw new tv("syntax error, " + c());
        }
    }
}
