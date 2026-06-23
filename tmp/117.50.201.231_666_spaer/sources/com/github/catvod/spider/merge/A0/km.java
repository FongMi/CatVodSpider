package com.github.catvod.spider.merge.A0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class km implements Iterable, wi {
    public final /* synthetic */ acr a;

    public km(acr acrVar) {
        this.a = acrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new acq(this.a);
    }
}
