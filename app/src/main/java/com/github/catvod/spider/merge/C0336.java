package com.github.catvod.spider.merge;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߔ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0336 implements InterfaceC0366 {
    @Override // com.github.catvod.spider.merge.InterfaceC0366
    public String name() {
        return SOY.d("1B3E3D22110F0E");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo275(C0019 c0019) {
        LinkedList linkedList = new LinkedList();
        for (C0011 c0011 : c0019.m220()) {
            if (SOY.d("0931231F0403").equals(c0011.mo122())) {
                linkedList.add(c0011.m181());
            } else {
                linkedList.add(c0011.m204());
            }
        }
        return C0367.m1420(linkedList);
    }
}
