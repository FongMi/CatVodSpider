package com.github.catvod.spider.merge.A0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class el implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ el(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                fw fwVar = (fw) obj;
                return fwVar instanceof vy ? ((vy) fwVar).f() : fwVar.aw("br") ? "\n" : "";
            case 1:
                return vy.class.cast((fw) obj);
            case 2:
                return Collections.unmodifiableList((List) obj);
            case 3:
                return ((ed) obj).ae();
            case 4:
                return ((ed) obj).ak();
            case 5:
                return ((ed) obj).an();
            case 6:
                return new IdentityHashMap();
            default:
                rt rtVar = (rt) obj;
                String strN = ws.n(rtVar.a);
                rtVar.a = null;
                return strN;
        }
    }
}
