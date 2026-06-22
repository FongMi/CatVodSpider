package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.L1.k;
import com.github.catvod.spider.merge.L1.m;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.p1.i;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends AbstractC0901a {
    private static final c a = new c();
    private static final Pattern b = Pattern.compile("^https?://(?:www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/(?!(?:tracks|albums|sets|reposts|followers|following)/?$)[0-9a-z_-]+/?(?:[#?].*)?$|^https?://on\\.soundcloud\\.com/[0-9a-zA-Z]+$");
    private static final Pattern c = Pattern.compile("^https?://api-v2\\.soundcloud.com/(tracks|albums|sets|reposts|followers|following)/([0-9a-z_-]+)/");

    private c() {
    }

    public static c o() {
        return a;
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String g(String str) throws i {
        Pattern pattern = c;
        if (k.c(pattern, str)) {
            return k.e(pattern, str, 1);
        }
        m.a(b, str);
        try {
            return com.github.catvod.spider.merge.C1.b.e(str);
        } catch (Exception e) {
            throw new i(e.getMessage(), e);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) throws i {
        try {
            return com.github.catvod.spider.merge.C1.b.f("https://api.soundcloud.com/tracks/" + str);
        } catch (Exception e) {
            throw new i(e.getMessage(), e);
        }
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) {
        return k.c(b, str.toLowerCase());
    }
}
