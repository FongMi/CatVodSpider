package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ཇ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0467 implements InterfaceC0366 {
    @Override // com.github.catvod.spider.merge.InterfaceC0366
    public String name() {
        return SOY.d("12263C1A");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo275(C0019 c0019) {
        LinkedList linkedList = new LinkedList();
        Iterator<C0011> it = c0019.m220().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m189());
        }
        return C0367.m1420(linkedList);
    }
}
