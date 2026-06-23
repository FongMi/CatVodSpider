package com.github.catvod.spider.merge.A0;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aad extends rf {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aad(rf rfVar, int i, int i2) {
        super(i, rfVar);
        this.a = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        switch (this.a) {
            case 0:
                if (uvVar instanceof uv) {
                    List listL = l(wq.class);
                    if (listL.size() > 1) {
                        Boolean boolE = ((as) ((dl) listL.get(0)).b(uvVar)).e();
                        for (int i = 1; i < listL.size(); i++) {
                            boolE = Boolean.valueOf(boolE.booleanValue() & ((as) ((dl) listL.get(i)).b(uvVar)).e().booleanValue());
                        }
                    }
                }
                break;
            default:
                if (uvVar instanceof uv) {
                }
                break;
        }
        return uvVar.f(this);
    }
}
