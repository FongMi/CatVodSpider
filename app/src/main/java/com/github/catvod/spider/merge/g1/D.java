package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class D implements Function {
    public final /* synthetic */ G a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ D(G g, boolean z) {
        this.a = g;
        this.b = z;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return G.c0(this.a, this.b, (C0682a) obj);
    }
}
