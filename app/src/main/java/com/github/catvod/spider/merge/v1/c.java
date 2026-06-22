package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends AbstractC0901a {
    private static final c a = new c();

    private c() {
    }

    public static c o() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) {
        return com.github.catvod.spider.merge.u1.b.f(str) ? str.split("bandcamp.com/\\?show=")[1] : i(str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) {
        return str.matches("\\d+") ? C1290c.a("https://bandcamp.com/?show=", str) : m.p(str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        if (com.github.catvod.spider.merge.u1.b.f(str)) {
            return true;
        }
        if (str.toLowerCase().matches("https?://.+\\..+/track/.+")) {
            return com.github.catvod.spider.merge.u1.b.e(str);
        }
        return false;
    }
}
