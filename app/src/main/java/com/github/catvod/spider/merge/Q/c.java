package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.N.e;
import com.github.catvod.spider.merge.z.r;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c {
    public final Stack a;
    public final a b;

    public c(e eVar) {
        com.github.catvod.spider.merge.W.b.d(c.class);
        Stack stack = new Stack();
        this.a = stack;
        a aVar = new a(eVar);
        this.b = aVar;
        a aVar2 = new a(eVar);
        aVar2.c = aVar;
        stack.push(aVar2);
    }

    public final a a() {
        return (a) this.a.peek();
    }

    public final void b(e eVar) {
        ((a) this.a.peek()).a = eVar;
    }

    public final Object c(com.github.catvod.spider.merge.D.b bVar) {
        return bVar.a(this);
    }

    public final Object d(r rVar) {
        int iD = rVar.d();
        Object objA = null;
        for (int i = 0; i < iD; i++) {
            objA = rVar.c(i).a(this);
        }
        return objA;
    }
}
