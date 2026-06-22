package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.เ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0456 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1B3C321307031520");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        LinkedList linkedList = new LinkedList();
        Iterator<C0011> it = c0455.iterator();
        while (it.hasNext()) {
            linkedList.addAll(it.next().m196());
        }
        return C0367.m1420(new C0455(linkedList));
    }
}
