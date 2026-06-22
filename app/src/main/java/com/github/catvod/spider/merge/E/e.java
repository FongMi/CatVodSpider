package com.github.catvod.spider.merge.E;

import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class e implements Supplier {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ e(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.a, this.b);
    }
}
