package com.github.catvod.spider.merge.w;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class a implements com.github.catvod.spider.merge.x.d {
    @Override // com.github.catvod.spider.merge.x.d
    public Object A(com.github.catvod.spider.merge.x.e eVar) {
        int iD = eVar.d();
        Object objA = null;
        for (int i = 0; i < iD; i++) {
            objA = eVar.c(i).a(this);
        }
        return objA;
    }

    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    @Override // com.github.catvod.spider.merge.x.d
    public void a() {
    }

    @Override // com.github.catvod.spider.merge.x.d
    public void i() {
    }
}
