package com.github.catvod.spider.merge.e1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class S extends Z {
    final C1031b b;

    public S(N n) {
        this.a = n;
        this.b = new C1031b(n);
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        for (int i = 0; i < mVar2.g(); i++) {
            com.github.catvod.spider.merge.c1.s sVarF = mVar2.f(i);
            if ((sVarF instanceof com.github.catvod.spider.merge.c1.m) && this.b.a(mVar2, (com.github.catvod.spider.merge.c1.m) sVarF) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
