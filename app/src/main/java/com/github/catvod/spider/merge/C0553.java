package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ၥ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0553 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected final Map<AbstractC0552, AbstractC0552> f1236 = new HashMap();

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public AbstractC0552 m1815(AbstractC0552 abstractC0552) {
        C0430 c0430 = AbstractC0552.f1232;
        if (abstractC0552 == c0430) {
            return c0430;
        }
        AbstractC0552 abstractC05522 = this.f1236.get(abstractC0552);
        if (abstractC05522 != null) {
            return abstractC05522;
        }
        this.f1236.put(abstractC0552, abstractC0552);
        return abstractC0552;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public AbstractC0552 m1816(AbstractC0552 abstractC0552) {
        return this.f1236.get(abstractC0552);
    }
}
