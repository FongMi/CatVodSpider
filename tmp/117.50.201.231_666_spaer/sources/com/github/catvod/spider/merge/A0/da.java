package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class da {
    public static final void a(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final Object b(cj cjVar, cj cjVar2, ha haVar) throws Throwable {
        Object ttVar;
        Object objAa;
        cjVar.am();
        try {
            dd.b(haVar);
            ttVar = haVar.invoke(cjVar2, cjVar);
        } catch (Throwable th) {
            ttVar = new tt(th, false);
        }
        ys ysVar = ys.a;
        if (ttVar == ysVar || (objAa = cjVar.aa(ttVar)) == xj.b) {
            return ysVar;
        }
        if (objAa instanceof tt) {
            throw ((tt) objAa).c;
        }
        return xj.j(objAa);
    }
}
