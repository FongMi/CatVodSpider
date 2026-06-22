package com.github.catvod.spider.merge.D;

import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final /* synthetic */ class i implements Supplier {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ i(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.a, this.b);
    }
}
