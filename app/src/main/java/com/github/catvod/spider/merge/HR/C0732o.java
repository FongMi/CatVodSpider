package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HR.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0732o extends N {
    String a;
    Pattern b;

    public C0732o(String str, Pattern pattern) {
        this.a = com.github.catvod.spider.merge.Bk.l.d(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return mVar2.n(this.a) && this.b.matcher(mVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format(ZrJ.d("2266383375600A1E"), this.a, this.b.toString());
    }
}
