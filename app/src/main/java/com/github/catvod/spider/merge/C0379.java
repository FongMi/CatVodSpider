package com.github.catvod.spider.merge;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡆ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0379 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1E37221511191E333F025918087F22131811");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        HashSet hashSet = new HashSet();
        C0455 c04552 = new C0455();
        Iterator<C0011> it = c0455.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().m185());
        }
        c04552.addAll(hashSet);
        return C0367.m1420(c04552);
    }
}
