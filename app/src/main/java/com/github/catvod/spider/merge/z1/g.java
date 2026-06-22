package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.m1.m;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g extends o {
    private a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g() {
        super(3, "PeerTube", EnumSet.of(m.VIDEO, m.COMMENTS));
        a aVar = a.a;
        this.c = aVar;
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c a() {
        return com.github.catvod.spider.merge.B1.a.t();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.q1.c c() {
        return com.github.catvod.spider.merge.B1.b.s();
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final com.github.catvod.spider.merge.I1.f e(C1380a c1380a) {
        return new com.github.catvod.spider.merge.A1.d(this, c1380a);
    }

    @Override // com.github.catvod.spider.merge.m1.o
    public final AbstractC0901a f() {
        return com.github.catvod.spider.merge.B1.c.o();
    }

    public final String i() {
        return this.c.a();
    }
}
