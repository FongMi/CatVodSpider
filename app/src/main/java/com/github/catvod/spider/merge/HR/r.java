package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class r extends N {
    public final /* synthetic */ int a = 0;
    private final Serializable b;

    public r(String str) {
        StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
        com.github.catvod.spider.merge.XU.n.a(sbB, str, false);
        this.b = com.github.catvod.spider.merge.Bk.l.c(com.github.catvod.spider.merge.XU.n.h(sbB));
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        switch (this.a) {
            case 0:
                return com.github.catvod.spider.merge.Bk.l.c(mVar2.j0()).contains((String) this.b);
            default:
                Pattern pattern = (Pattern) this.b;
                StringBuilder sbB = com.github.catvod.spider.merge.XU.n.b();
                com.github.catvod.spider.merge.XI.p.b(new com.github.catvod.spider.merge.UY.j(sbB), mVar2);
                return pattern.matcher(com.github.catvod.spider.merge.XU.n.h(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(ZrJ.d("432024233C24102D38023F2B51663864"), (String) this.b);
            default:
                return String.format(ZrJ.d("432E2A392B2D1C301C2527291C172E353C6D5C3062"), (Pattern) this.b);
        }
    }

    public r(Pattern pattern) {
        this.b = pattern;
    }
}
