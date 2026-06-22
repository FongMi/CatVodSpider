package com.github.catvod.spider.merge.g0;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Wogg.f((Wogg) this.a, (String) this.b);
    }
}
