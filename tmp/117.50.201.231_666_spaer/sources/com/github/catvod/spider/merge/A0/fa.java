package com.github.catvod.spider.merge.A0;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class fa extends dr {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public fa(dr drVar) {
        this.e = 1;
        this.g = ThreadLocal.withInitial(new se(6));
        this.f = drVar;
    }

    public fa(String str, String str2, boolean z) {
        this.e = 0;
        wc.c(str);
        wc.c(str2);
        this.f = qf.d(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strC = (!z && z2) ? qf.c(str2) : qf.d(str2);
        this.g = strC;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public void d() {
        switch (this.e) {
            case 1:
                ((IdentityHashMap) ((ThreadLocal) this.g).get()).clear();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.merge.A0.bu] */
    public boolean h(final ed edVar, ed edVar2) {
        Map map = (Map) ((ThreadLocal) this.g).get();
        el elVar = og.a;
        return ((Boolean) ((Map) map.computeIfAbsent(edVar, og.a)).computeIfAbsent(edVar2, new Function() { // from class: com.github.catvod.spider.merge.A0.bu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((dr) this.a.f).c(edVar, (ed) obj));
            }
        })).booleanValue();
    }
}
