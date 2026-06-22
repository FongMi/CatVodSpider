package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.oZP;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class M extends N {
    private final Pattern a;

    public M(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.N.N
    public final boolean a(com.github.catvod.spider.merge.L.m mVar, com.github.catvod.spider.merge.L.m mVar2) {
        return this.a.matcher(mVar2.v0()).find();
    }

    public final String toString() {
        return String.format(oZP.d("4F0216350F3D101C5F641F7C"), this.a);
    }
}
