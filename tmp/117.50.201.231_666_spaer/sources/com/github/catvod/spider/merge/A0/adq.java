package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class adq implements gf, qw {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ adq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void c(Throwable th) {
        switch (this.a) {
            case 0:
                ((adh) this.b).b();
                break;
            default:
                ((qw) this.b).invoke(th);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                c((Throwable) obj);
                break;
            default:
                c((Throwable) obj);
                break;
        }
        return jo.i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "DisposeOnCancel[" + ((adh) this.b) + ']';
            default:
                return "InvokeOnCancel[" + ((qw) this.b).getClass().getSimpleName() + '@' + rs.a(this) + ']';
        }
    }
}
