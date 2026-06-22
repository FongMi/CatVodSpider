package com.github.catvod.spider.merge.ej;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1079z extends N {
    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        for (com.github.catvod.spider.merge.Em.r rVar : lVar2.i()) {
            if (!(rVar instanceof com.github.catvod.spider.merge.Em.e) && !(rVar instanceof com.github.catvod.spider.merge.Em.i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}
