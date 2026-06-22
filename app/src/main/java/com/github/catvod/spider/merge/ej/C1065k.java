package com.github.catvod.spider.merge.ej;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ej.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1065k extends N {
    public final /* synthetic */ int a;
    private final String b;

    public C1065k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = com.github.catvod.spider.merge.Dw.s.c(str);
        } else {
            com.github.catvod.spider.merge.Dw.i.i(str);
            this.b = com.github.catvod.spider.merge.Dw.s.c(str);
        }
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.Em.a> it = lVar2.d().f().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.Dw.s.c(it.next().a()).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            default:
                return com.github.catvod.spider.merge.Dw.s.c(lVar2.T()).contains(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[^%s]", this.b);
            default:
                return String.format(":containsData(%s)", this.b);
        }
    }
}
