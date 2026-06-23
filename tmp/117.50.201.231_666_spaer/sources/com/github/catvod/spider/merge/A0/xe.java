package com.github.catvod.spider.merge.A0;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class xe implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        rt rtVar = (rt) obj;
        rt rtVar2 = (rt) obj2;
        String strN = ws.n(rtVar2.a);
        rtVar2.a = null;
        wc.e(rtVar.a);
        rtVar.a.append((Object) strN);
        return rtVar;
    }
}
