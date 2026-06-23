package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class adr extends n {
    public final /* synthetic */ int c;
    public final Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adr(pb pbVar, Object obj, int i) {
        super(pbVar);
        this.c = i;
        this.q = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.n
    public final void f(Throwable th) {
        switch (this.c) {
            case 0:
                ((adh) this.q).b();
                break;
            default:
                Object objV = ((bi) this.a).v();
                boolean z = objV instanceof tt;
                ne neVar = (ne) this.q;
                if (!z) {
                    neVar.resumeWith(xj.j(objV));
                } else {
                    neVar.resumeWith(act.b(((tt) objV).c));
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.c) {
            case 0:
                f((Throwable) obj);
                break;
            default:
                f((Throwable) obj);
                break;
        }
        return jo.i;
    }
}
