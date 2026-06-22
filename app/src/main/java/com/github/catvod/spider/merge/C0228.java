package com.github.catvod.spider.merge;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ר, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0228 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("193A381A10");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        C0455 c04552 = new C0455();
        Iterator<C0011> it = c0455.iterator();
        while (it.hasNext()) {
            c04552.addAll(it.next().m179());
        }
        return C0367.m1420(c04552);
    }
}
