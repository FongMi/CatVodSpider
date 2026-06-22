package com.github.catvod.spider.merge;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ɩ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0083 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1B3C3213070315207C19065A09373D10");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        LinkedList linkedList = new LinkedList();
        for (C0011 c0011 : c0455) {
            linkedList.addAll(c0011.m196());
            linkedList.add(c0011);
        }
        return C0367.m1420(new C0455(linkedList));
    }
}
