package com.github.catvod.spider.merge.FM.A;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class a implements com.github.catvod.spider.merge.FM.B.d {
    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    @Override // com.github.catvod.spider.merge.FM.B.d
    public void a() {
    }

    @Override // com.github.catvod.spider.merge.FM.B.d
    public void f() {
    }

    @Override // com.github.catvod.spider.merge.FM.B.d
    public Object g(com.github.catvod.spider.merge.FM.B.e eVar) {
        int iD = eVar.d();
        Object objB = null;
        for (int i = 0; i < iD; i++) {
            objB = eVar.c(i).b(this);
        }
        return objB;
    }
}
