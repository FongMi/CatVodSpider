package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mb extends kv {
    public volatile kv a;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ oa f;
    public final /* synthetic */ fj g;
    public final /* synthetic */ lw h;

    public mb(lw lwVar, boolean z, boolean z2, oa oaVar, fj fjVar) {
        this.h = lwVar;
        this.d = z;
        this.e = z2;
        this.f = oaVar;
        this.g = fjVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (this.d) {
            rdVar.ar();
            return null;
        }
        kv kvVarAb = this.a;
        if (kvVarAb == null) {
            kvVarAb = this.f.ab(this.h, this.g);
            this.a = kvVarAb;
        }
        return kvVarAb.b(rdVar);
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (this.e) {
            aagVar.w();
            return;
        }
        kv kvVarAb = this.a;
        if (kvVarAb == null) {
            kvVarAb = this.f.ab(this.h, this.g);
            this.a = kvVarAb;
        }
        kvVarAb.c(aagVar, obj);
    }
}
