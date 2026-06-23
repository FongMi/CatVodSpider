package com.github.catvod.spider.merge.A0;

import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final /* synthetic */ class ri implements Predicate {
    public final /* synthetic */ dr a;
    public final /* synthetic */ ed b;

    public /* synthetic */ ri(dr drVar, ed edVar) {
        this.a = drVar;
        this.b = edVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.a.c(this.b, (ed) obj);
    }
}
