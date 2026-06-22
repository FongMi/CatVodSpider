package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.L.l;
import com.github.catvod.spider.merge.N.e;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class a {
    public e a;
    public boolean b = false;
    public a c;

    public a(l lVar) {
        e eVar = new e();
        this.a = eVar;
        eVar.add(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        if (this.a.size() != 1) {
            throw new com.github.catvod.spider.merge.I.a("current context is more than one el,total = " + this.a.size());
        }
        e eVar = this.a;
        if (eVar.isEmpty()) {
            return null;
        }
        return (l) eVar.get(0);
    }

    public a(e eVar) {
        e eVar2 = new e();
        this.a = eVar2;
        eVar2.addAll(eVar);
    }
}
