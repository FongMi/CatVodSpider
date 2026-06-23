package com.github.catvod.spider.merge.C0.T;

import com.github.catvod.spider.merge.C0.P.D;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class g implements f {
    public D a;

    public g(D d) {
        this.a = d;
    }

    @Override // com.github.catvod.spider.merge.C0.T.f
    public final D a() {
        return this.a;
    }

    @Override // com.github.catvod.spider.merge.C0.T.b
    public final String c() {
        return this.a.c();
    }

    @Override // com.github.catvod.spider.merge.C0.T.b
    public <T> T e(d<? extends T> dVar) {
        dVar.q();
        return null;
    }

    public final String toString() {
        return this.a.e() == -1 ? "<EOF>" : this.a.c();
    }
}
