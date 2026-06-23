package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class zr {
    public static final xb b = new xb("ZERO", 3);

    public static final void c(yg ygVar, Object obj) {
        if (obj == b) {
            return;
        }
        if (obj instanceof bt) {
            ((bt) obj).getClass();
            ygVar.fold(obj, te.e);
        } else {
            Object objFold = ygVar.fold(null, te.d);
            if (objFold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            wb.g(objFold);
            throw null;
        }
    }

    public static final Object d(yg ygVar, Object obj) {
        if (obj == null) {
            obj = ygVar.fold(0, te.c);
            ko.c(obj);
        }
        if (obj == 0) {
            return b;
        }
        if (obj instanceof Integer) {
            return ygVar.fold(new bt(ygVar, ((Number) obj).intValue()), te.f);
        }
        wb.g(obj);
        throw null;
    }
}
