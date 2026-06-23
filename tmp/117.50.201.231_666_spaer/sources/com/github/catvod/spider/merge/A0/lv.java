package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lv extends zy implements qw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.qw
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return obj == ((pa) this.b) ? "(this Collection)" : String.valueOf(obj);
            default:
                add addVar = (add) obj;
                ko.f("it", addVar);
                return dc.s((String) this.b, addVar);
        }
    }
}
