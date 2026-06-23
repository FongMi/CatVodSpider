package com.github.catvod.spider.merge.C0.e0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class K extends N {
    private final Pattern a;

    public K(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.C0.e0.N
    public final boolean a(com.github.catvod.spider.merge.C0.c0.l lVar, com.github.catvod.spider.merge.C0.c0.l lVar2) {
        return this.a.matcher(lVar2.p0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.a);
    }
}
