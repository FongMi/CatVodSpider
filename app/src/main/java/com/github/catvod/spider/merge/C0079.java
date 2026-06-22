package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ȓ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0079 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("0A3323131A03");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        LinkedList linkedList = new LinkedList();
        C0455 c04552 = new C0455();
        Iterator<C0011> it = c0455.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().mo170());
        }
        c04552.addAll(linkedList);
        return C0367.m1420(c04552);
    }
}
