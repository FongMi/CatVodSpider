package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.า, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0454 implements InterfaceC0174 {
    @Override // com.github.catvod.spider.merge.InterfaceC0174
    public String name() {
        return SOY.d("143D25");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0174
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo343(C0019 c0019, List<C0367> list) {
        if (list.size() == 1) {
            return C0367.m1420(Boolean.valueOf(!list.get(0).m1421().booleanValue()));
        }
        throw new C0249(SOY.d("1F20231906570A3323171957133C71181B0352303E19185E5A3424181703133D3F58241B1F33221354141237321D5A"));
    }
}
