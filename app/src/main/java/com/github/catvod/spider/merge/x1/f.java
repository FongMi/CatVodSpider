package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.F1.B;
import java.net.URL;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class f implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                URL url = (URL) this.b;
                int i = B.j;
                break;
        }
        return ((Class) this.b).isInstance(obj);
    }
}
