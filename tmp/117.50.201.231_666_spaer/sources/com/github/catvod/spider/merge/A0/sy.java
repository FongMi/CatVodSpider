package com.github.catvod.spider.merge.A0;

import java.util.Collection;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class sy extends sx {
    public static int m(Iterable iterable) {
        ko.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
