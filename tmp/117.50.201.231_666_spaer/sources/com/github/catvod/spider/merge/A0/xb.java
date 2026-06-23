package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xb implements ub {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ xb(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.A0.ub
    public Object m() {
        switch (this.a) {
            case 0:
                throw new yc(this.b);
            case 1:
                throw new yc(this.b);
            default:
                throw new yc(this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return this.b;
            default:
                return super.toString();
        }
    }
}
