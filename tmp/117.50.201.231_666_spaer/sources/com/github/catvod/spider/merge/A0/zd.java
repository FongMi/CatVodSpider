package com.github.catvod.spider.merge.A0;

import com.base.model.proto.DramaDetailProto;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class zd extends rf {
    public to a;

    @Override // com.github.catvod.spider.merge.A0.rf, com.github.catvod.spider.merge.A0.dl
    public final Object b(uv uvVar) {
        if (!(uvVar instanceof uv)) {
            return uvVar.f(this);
        }
        List listL = l(ci.class);
        if (listL.size() == 1) {
            return (as) ((dl) listL.get(0)).b(uvVar);
        }
        if (listL.size() != 2) {
            throw new tv("error equalityExpr near:" + c());
        }
        as asVar = (as) ((dl) listL.get(0)).b(uvVar);
        as asVar2 = (as) ((dl) listL.get(1)).b(uvVar);
        switch (this.a.a) {
            case 24:
                return as.d(Boolean.valueOf(asVar.compareTo(asVar2) < 0));
            case 25:
                return as.d(Boolean.valueOf(asVar.compareTo(asVar2) > 0));
            case 26:
                return as.d(Boolean.valueOf(asVar.compareTo(asVar2) <= 0));
            case 27:
                return as.d(Boolean.valueOf(asVar.compareTo(asVar2) >= 0));
            case 28:
            case 29:
            default:
                throw new tv("unknown operator" + this.a.j());
            case 30:
                return as.d(Boolean.valueOf(asVar.i().startsWith(asVar2.i())));
            case 31:
                return as.d(Boolean.valueOf(asVar.i().endsWith(asVar2.i())));
            case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                return as.d(Boolean.valueOf(asVar.i().contains(asVar2.i())));
            case 33:
                return as.d(Boolean.valueOf(asVar.i().matches(asVar2.i())));
            case 34:
                return as.d(Boolean.valueOf(!asVar.i().matches(asVar2.i())));
        }
    }
}
