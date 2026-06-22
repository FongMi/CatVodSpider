package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e implements com.github.catvod.spider.merge.W.a {
    @Override // com.github.catvod.spider.merge.W.a
    public final com.github.catvod.spider.merge.W.f a(C0074g c0074g) {
        HashSet hashSet = new HashSet();
        C0074g c0074g2 = new C0074g();
        Iterator<com.github.catvod.spider.merge.L.m> it = c0074g.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().Z());
        }
        c0074g2.addAll(hashSet);
        return new com.github.catvod.spider.merge.W.f(c0074g2);
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String name() {
        return oZP.d("110A0422093B110E1935413A074204240033");
    }
}
