package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class r extends N {
    public final /* synthetic */ int a = 0;
    private final Serializable b;

    public r(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
        com.github.catvod.spider.merge.K.b.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.B.l.c(com.github.catvod.spider.merge.K.b.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.B.l.c(mVar2.j0()).contains((String) this.b);
            default:
                Pattern pattern = (Pattern) this.b;
                StringBuilder sbB = com.github.catvod.spider.merge.K.b.b();
                com.github.catvod.spider.merge.F.a.b(new com.github.catvod.spider.merge.L.j(sbB), mVar2);
                return pattern.matcher(com.github.catvod.spider.merge.K.b.h(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(oZP.d("4F0C182F18341C01040E1B3B5D4A0468"), (String) this.b);
            default:
                return String.format(oZP.d("4F0216350F3D101C20290339103B1239187D501C5E"), (Pattern) this.b);
        }
    }

    public r(Pattern pattern) {
        this.b = pattern;
    }
}
