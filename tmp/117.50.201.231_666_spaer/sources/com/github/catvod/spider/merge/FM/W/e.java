package com.github.catvod.spider.merge.FM.W;

import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements com.github.catvod.spider.merge.FM.V.a {
    @Override // com.github.catvod.spider.merge.FM.V.a
    public final com.github.catvod.spider.merge.FM.V.f a(C0274g c0274g) {
        HashSet hashSet = new HashSet();
        C0274g c0274g2 = new C0274g();
        Iterator<com.github.catvod.spider.merge.FM.K.m> it = c0274g.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().Z());
        }
        c0274g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.FM.V.f(c0274g2);
    }

    @Override // com.github.catvod.spider.merge.FM.V.a
    public final String name() {
        return "descendant-or-self";
    }
}
