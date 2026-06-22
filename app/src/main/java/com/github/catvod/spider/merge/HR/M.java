package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.ZrJ;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class M extends N {
    private final Pattern a;

    public M(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.HR.N
    public final boolean a(com.github.catvod.spider.merge.UY.m mVar, com.github.catvod.spider.merge.UY.m mVar2) {
        return this.a.matcher(mVar2.v0()).find();
    }

    public final String toString() {
        return String.format(ZrJ.d("432E2A392B2D1C3063683B6C"), this.a);
    }
}
