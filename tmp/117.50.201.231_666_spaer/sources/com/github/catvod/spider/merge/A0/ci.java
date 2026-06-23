package com.github.catvod.spider.merge.A0;

import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ci extends rf {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci(rf rfVar, int i, int i2) {
        super(i, rfVar);
        this.a = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        switch (this.a) {
            case 0:
                if (!(uvVar instanceof uv)) {
                    return uvVar.f(this);
                }
                List listL = l(ade.class);
                if (listL.size() == 1) {
                    return (as) ((dl) listL.get(0)).b(uvVar);
                }
                Double dG = ((as) ((dl) listL.get(0)).b(uvVar)).g();
                String strC = null;
                for (int i = 1; i < j(); i++) {
                    dl dlVarI = i(i);
                    if (dlVarI instanceof ade) {
                        as asVar = (as) ((ade) dlVarI).b(uvVar);
                        if (Marker.ANY_NON_NULL_MARKER.equals(strC)) {
                            dG = Double.valueOf(asVar.g().doubleValue() + dG.doubleValue());
                        } else {
                            if (!"-".equals(strC)) {
                                throw new tv("syntax error, " + c());
                            }
                            dG = Double.valueOf(dG.doubleValue() - asVar.g().doubleValue());
                        }
                    } else {
                        strC = dlVarI.c();
                    }
                }
                return as.d(dG);
            default:
                return uvVar instanceof uv ? (as) ((jz) k(jz.class)).b(uvVar) : uvVar.f(this);
        }
    }
}
