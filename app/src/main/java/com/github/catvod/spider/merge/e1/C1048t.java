package com.github.catvod.spider.merge.e1;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.e1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1048t extends N {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ C1048t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.e1.N
    public final boolean a(com.github.catvod.spider.merge.c1.m mVar, com.github.catvod.spider.merge.c1.m mVar2) {
        switch (this.a) {
            case 0:
                return mVar2.u0().contains((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.g0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(":containsWholeOwnText(%s)", (String) this.b);
            default:
                return String.format(":matchesOwn(%s)", (Pattern) this.b);
        }
    }
}
