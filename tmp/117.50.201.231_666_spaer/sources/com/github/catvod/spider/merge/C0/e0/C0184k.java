package com.github.catvod.spider.merge.C0.e0;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C0.e0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0184k extends N {
    public final int a;
    private final String b;

    public C0184k(String str, int i) {
        this.a = i;
        if (i == 1) {
            this.b = com.github.catvod.spider.merge.C0.x.a.c(str);
        } else {
            com.github.catvod.spider.merge.C0.N.a.i(str);
            this.b = com.github.catvod.spider.merge.C0.x.a.c(str);
        }
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        switch (this.a) {
            case 0:
                Iterator<com.github.catvod.spider.merge.C0.c0.a> it = lVar2.d().f().iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.C0.x.a.c(it.next().a()).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            default:
                return com.github.catvod.spider.merge.C0.x.a.c(lVar2.T()).contains(this.b);
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
