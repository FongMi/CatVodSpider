package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʕ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0099 implements InterfaceC0174 {
    @Override // com.github.catvod.spider.merge.InterfaceC0174
    public String name() {
        return SOY.d("193D241800");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0174
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo343(C0019 c0019, List<C0367> list) {
        return (list == null || list.size() == 0) ? C0367.m1420(0) : C0367.m1420(Integer.valueOf(list.get(0).m1424().size()));
    }
}
