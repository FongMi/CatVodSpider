package com.github.catvod.spider.merge.D0;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ a(Class cls, int i) {
        this.a = i;
        this.b = cls;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.b.cast(obj);
            case 1:
                return (e) this.b.cast(obj);
            default:
                return (e) this.b.cast(obj);
        }
    }
}
