package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class dp implements vq {
    public final fj b;
    public final boolean c;
    public final ch d;
    public final aav e;

    public dp(Object obj, fj fjVar, boolean z) {
        this.d = (ch) obj;
        this.e = (aav) obj;
        this.b = fjVar;
        this.c = z;
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        fj fjVar2 = this.b;
        if (fjVar2 == null) {
            Class cls = fjVar.a;
            throw null;
        }
        if (!fjVar2.equals(fjVar)) {
            if (!this.c) {
                return null;
            }
            if (fjVar2.b != fjVar.a) {
                return null;
            }
        }
        return new lu(this.d, this.e, oaVar, fjVar, this, true);
    }
}
