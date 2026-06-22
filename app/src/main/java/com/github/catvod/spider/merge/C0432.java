package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.र, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0432 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("0A2034151113133C36");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        C0455 c04552 = new C0455();
        LinkedList linkedList = new LinkedList();
        for (C0011 c0011 : c0455) {
            Iterator<C0011> it = c0011.m196().iterator();
            while (it.hasNext()) {
                C0455 c0455M356 = C0097.m356(it.next());
                if (c0455M356 != null) {
                    linkedList.addAll(c0455M356);
                }
            }
            C0455 c0455M3562 = C0097.m356(c0011);
            if (c0455M3562 != null) {
                linkedList.addAll(c0455M3562);
            }
        }
        c04552.addAll(linkedList);
        return C0367.m1420(c04552);
    }
}
