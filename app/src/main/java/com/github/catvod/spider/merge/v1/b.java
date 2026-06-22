package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.L1.m;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class b extends com.github.catvod.spider.merge.q1.c {
    private static final b a = new b();

    private b() {
    }

    public static b s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        return i(str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        if (str.toLowerCase().matches("https?://.+\\..+/album/.+")) {
            return com.github.catvod.spider.merge.u1.b.e(str);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) {
        return m.p(str);
    }
}
