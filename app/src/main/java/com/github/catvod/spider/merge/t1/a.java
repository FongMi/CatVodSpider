package com.github.catvod.spider.merge.t1;

import com.github.catvod.spider.merge.I1.f;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.m;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.q1.C1380a;
import com.github.catvod.spider.merge.q1.c;
import com.github.catvod.spider.merge.u1.e;
import com.github.catvod.spider.merge.u1.k;
import com.github.catvod.spider.merge.v1.b;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a extends o {
    public a() {
        super(4, "Bandcamp", EnumSet.of(m.AUDIO, m.COMMENTS));
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final c a() {
        return com.github.catvod.spider.merge.v1.a.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final c c() {
        return b.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final f e(C1380a c1380a) {
        return com.github.catvod.spider.merge.u1.b.f(c1380a.d()) ? new e(this, c1380a) : new k(this, c1380a);
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final AbstractC0901a f() {
        return com.github.catvod.spider.merge.v1.c.o();
    }
}
