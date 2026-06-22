package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class o {
    private final int a;
    private final n b;

    public o(int i, String str, Set<m> set) {
        this.a = i;
        this.b = new n(str);
    }

    public abstract com.github.catvod.spider.merge.q1.c a();

    public final com.github.catvod.spider.merge.r1.e b() {
        com.github.catvod.spider.merge.r1.e eVarC = k.c();
        if (h().contains(eVarC)) {
            return eVarC;
        }
        for (com.github.catvod.spider.merge.r1.e eVar : h()) {
            if (eVar.b().equals(eVarC.b())) {
                return eVar;
            }
        }
        return com.github.catvod.spider.merge.r1.e.d;
    }

    public abstract com.github.catvod.spider.merge.q1.c c();

    public final int d() {
        return this.a;
    }

    public abstract com.github.catvod.spider.merge.I1.f e(C1380a c1380a);

    public abstract AbstractC0901a f();

    public List<com.github.catvod.spider.merge.r1.a> g() {
        return Collections.singletonList(com.github.catvod.spider.merge.r1.a.c);
    }

    public List<com.github.catvod.spider.merge.r1.e> h() {
        return Collections.singletonList(com.github.catvod.spider.merge.r1.e.d);
    }

    public final String toString() {
        return this.a + ":" + this.b.a();
    }
}
