package com.github.catvod.spider.merge.Bk;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class a implements com.github.catvod.spider.merge.cz.d {
    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    public void a() {
    }

    public void i() {
    }

    public Object l(com.github.catvod.spider.merge.cz.e eVar) {
        int iD = eVar.d();
        Object objB = null;
        for (int i = 0; i < iD; i++) {
            objB = eVar.c(i).b(this);
        }
        return objB;
    }
}
