package com.github.catvod.spider.merge.FM.M;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.M.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0276i extends N {
    public final /* synthetic */ int a;
    private final Object b;

    public /* synthetic */ C0276i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                return mVar2.n((String) this.b);
            case 1:
                return mVar2.a0((String) this.b);
            default:
                return ((Pattern) this.b).matcher(mVar2.j0()).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format("[%s]", (String) this.b);
            case 1:
                return String.format(".%s", (String) this.b);
            default:
                return String.format(":matchesOwn(%s)", (Pattern) this.b);
        }
    }
}
