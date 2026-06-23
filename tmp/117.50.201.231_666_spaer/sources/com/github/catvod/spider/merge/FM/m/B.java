package com.github.catvod.spider.merge.FM.M;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class B extends N {
    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        for (com.github.catvod.spider.merge.FM.K.s sVar : mVar2.h()) {
            if (!(sVar instanceof com.github.catvod.spider.merge.FM.K.e) && !(sVar instanceof com.github.catvod.spider.merge.FM.K.w) && !(sVar instanceof com.github.catvod.spider.merge.FM.K.i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}
