package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.G1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class C0684c implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0684c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (com.github.catvod.spider.merge.D0.e) ((Class) this.b).cast(obj);
            case 1:
                return (com.github.catvod.spider.merge.D0.e) ((Class) this.b).cast(obj);
            case 2:
                return (String) ((Class) this.b).cast(obj);
            default:
                return S.u((S) this.b, (com.github.catvod.spider.merge.D0.e) obj);
        }
    }
}
