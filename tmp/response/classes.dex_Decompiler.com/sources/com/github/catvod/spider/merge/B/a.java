package com.github.catvod.spider.merge.B;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public abstract class a implements com.github.catvod.spider.merge.C.d {
    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    @Override // com.github.catvod.spider.merge.C.d
    public void a() {
    }

    @Override // com.github.catvod.spider.merge.C.d
    public void i() {
    }

    @Override // com.github.catvod.spider.merge.C.d
    public Object l(com.github.catvod.spider.merge.C.e eVar) {
        int iD = eVar.d();
        Object objB = null;
        for (int i = 0; i < iD; i++) {
            objB = eVar.c(i).b(this);
        }
        return objB;
    }
}
