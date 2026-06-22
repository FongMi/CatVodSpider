package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.p1.i;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends com.github.catvod.spider.merge.q1.c {
    private static final a a = new a();

    private a() {
    }

    public static a s() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) throws i {
        int i = m.c;
        m.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$"), str);
        try {
            return com.github.catvod.spider.merge.C1.b.e(str);
        } catch (Exception e) {
            throw new i(e.getMessage(), e);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        return k.b("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$", str.toLowerCase());
    }

    @Override // com.github.catvod.spider.merge.q1.c
    public final String q(String str, List list) throws i {
        try {
            return com.github.catvod.spider.merge.C1.b.f("https://api.soundcloud.com/users/" + str);
        } catch (Exception e) {
            throw new i(e.getMessage(), e);
        }
    }
}
