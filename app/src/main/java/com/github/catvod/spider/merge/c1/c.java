package com.github.catvod.spider.merge.C1;

import com.github.catvod.spider.merge.D1.d;
import com.github.catvod.spider.merge.I1.f;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.m;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends o {
    public c() {
        super(1, "SoundCloud", EnumSet.of(m.AUDIO, m.COMMENTS));
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c a() {
        return com.github.catvod.spider.merge.E1.a.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c c() {
        return com.github.catvod.spider.merge.E1.b.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final f e(C1380a c1380a) {
        return new d(this, c1380a);
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final AbstractC0901a f() {
        return com.github.catvod.spider.merge.E1.c.o();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final List<com.github.catvod.spider.merge.r1.a> g() {
        return com.github.catvod.spider.merge.r1.a.b("AU", "CA", "DE", "FR", "GB", "IE", "NL", "NZ", "US");
    }
}
