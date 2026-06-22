package com.github.catvod.spider.merge;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.د, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0239 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1C3D3D1A1B00133C365B071E183E3818135A153C34");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        LinkedList linkedList = new LinkedList();
        for (C0011 c0011 : c0455) {
            if (c0011.m192() != null) {
                linkedList.add(c0011.m192());
            }
        }
        C0455 c04552 = new C0455();
        c04552.addAll(linkedList);
        return C0367.m1420(c04552);
    }
}
