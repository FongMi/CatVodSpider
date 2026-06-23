package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class pc implements xo {
    private final xp key;

    public pc(xp xpVar) {
        this.key = xpVar;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public <R> R fold(R r, ha haVar) {
        ko.f("operation", haVar);
        return (R) haVar.invoke(r, this);
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public <E extends xo> E get(xp xpVar) {
        return (E) ou.a(this, xpVar);
    }

    @Override // com.github.catvod.spider.merge.A0.xo
    public xp getKey() {
        return this.key;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public yg minusKey(xp xpVar) {
        return ou.b(this, xpVar);
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public yg plus(yg ygVar) {
        ko.f("context", ygVar);
        return ygVar == ek.a ? this : (yg) ygVar.fold(this, te.b);
    }
}
