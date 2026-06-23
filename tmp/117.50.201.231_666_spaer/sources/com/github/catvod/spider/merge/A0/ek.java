package com.github.catvod.spider.merge.A0;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ek implements yg, Serializable {
    public static final ek a = new ek();

    @Override // com.github.catvod.spider.merge.A0.yg
    public final Object fold(Object obj, ha haVar) {
        return obj;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final xo get(xp xpVar) {
        ko.f("key", xpVar);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg minusKey(xp xpVar) {
        ko.f("key", xpVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0.yg
    public final yg plus(yg ygVar) {
        ko.f("context", ygVar);
        return ygVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
