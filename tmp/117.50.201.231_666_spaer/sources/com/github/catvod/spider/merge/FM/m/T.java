package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class T extends a0 {
    final C0269b b;

    public T(N n) {
        this.a = n;
        this.b = new C0269b(n);
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        for (int i = 0; i < mVar2.g(); i++) {
            com.github.catvod.spider.merge.FM.K.s sVarF = mVar2.f(i);
            if ((sVarF instanceof com.github.catvod.spider.merge.FM.K.m) && this.b.a(mVar2, (com.github.catvod.spider.merge.FM.K.m) sVarF) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
