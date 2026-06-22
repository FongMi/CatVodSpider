package com.github.catvod.spider.merge;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ߌ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0333 implements InterfaceC0174 {
    @Override // com.github.catvod.spider.merge.InterfaceC0174
    public String name() {
        return SOY.d("193D3F151503");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0174
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo343(C0019 c0019, List<C0367> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<C0367> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m1427());
        }
        return C0367.m1420(sb.toString());
    }
}
