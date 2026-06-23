package com.github.catvod.spider.merge.A0;

import java.lang.ref.SoftReference;
import java.util.IdentityHashMap;
import java.util.Stack;
import java.util.function.Supplier;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class se implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ se(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new String[512];
            case 1:
                return new char[2048];
            case 2:
                return new rp();
            case 3:
                return new char[2];
            case 4:
                return new SoftReference(new Stack());
            case 5:
                return new StringBuilder(1024);
            case 6:
                return new IdentityHashMap();
            default:
                return new aau(new ed("html"), ed.class);
        }
    }
}
