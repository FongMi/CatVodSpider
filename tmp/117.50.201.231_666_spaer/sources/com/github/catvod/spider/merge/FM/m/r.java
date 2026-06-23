package com.github.catvod.spider.merge.FM.M;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class r extends N {
    public final /* synthetic */ int a = 0;
    private final Serializable b;

    public r(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
        com.github.catvod.spider.merge.FM.J.b.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.FM.A.l.d(com.github.catvod.spider.merge.FM.J.b.h(sbB));
    }

    public r(Pattern pattern) {
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.FM.A.l.d(mVar2.j0()).contains((String) this.b);
            default:
                Pattern pattern = (Pattern) this.b;
                StringBuilder sbB = com.github.catvod.spider.merge.FM.J.b.b();
                com.github.catvod.spider.merge.FM.E.a.d(new com.github.catvod.spider.merge.FM.K.j(sbB), mVar2);
                return pattern.matcher(com.github.catvod.spider.merge.FM.J.b.h(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(":containsOwn(%s)", (String) this.b);
            default:
                return String.format(":matchesWholeText(%s)", (Pattern) this.b);
        }
    }
}
