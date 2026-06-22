package com.github.catvod.spider.merge.Lc;

import com.github.catvod.spider.merge.gu.D;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class g implements f {
    public D a;

    public g(D d) {
        this.a = d;
    }

    @Override // com.github.catvod.spider.merge.Lc.f
    public final D a() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public final String c() {
        return this.a.c();
    }

    @Override // com.github.catvod.spider.merge.Lc.b
    public <T> T e(d<? extends T> dVar) {
        dVar.q();
        return null;
    }

    public final String toString() {
        return this.a.e() == -1 ? "<EOF>" : this.a.c();
    }
}
