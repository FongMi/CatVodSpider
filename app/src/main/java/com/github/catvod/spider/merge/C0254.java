package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ە, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0254 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1C3D3D1A1B00133C36");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        LinkedList linkedList = new LinkedList();
        for (C0011 c0011 : c0455) {
            Iterator<C0011> it = c0011.m196().iterator();
            while (it.hasNext()) {
                C0455 c0455M353 = C0097.m353(it.next());
                if (c0455M353 != null) {
                    Iterator<C0011> it2 = c0455M353.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().m185());
                    }
                }
            }
            C0455 c0455M3532 = C0097.m353(c0011);
            if (c0455M3532 != null) {
                Iterator<C0011> it3 = c0455M3532.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().m185());
                }
            }
        }
        return C0367.m1420(new C0455(linkedList));
    }
}
