package com.github.catvod.spider.merge.ej;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class K extends N {
    private final Pattern a;

    public K(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.ej.N
    public final boolean a(com.github.catvod.spider.merge.Em.l lVar, com.github.catvod.spider.merge.Em.l lVar2) {
        return this.a.matcher(lVar2.p0()).find();
    }

    public final String toString() {
        return String.format(":matches(%s)", this.a);
    }
}
