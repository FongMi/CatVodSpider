package com.github.catvod.spider.merge.FM.M;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class M extends N {
    private final Pattern a;

    public M(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.FM.M.N
    public final boolean a(com.github.catvod.spider.merge.FM.K.m mVar, com.github.catvod.spider.merge.FM.K.m mVar2) {
        return this.a.matcher(mVar2.v0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.a);
    }
}
