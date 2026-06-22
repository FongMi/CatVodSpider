package com.github.catvod.spider.merge;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ۀ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0252 implements InterfaceC0174 {
    @Override // com.github.catvod.spider.merge.InterfaceC0174
    public String name() {
        return SOY.d("092733050005133C365B110F");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0174
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo343(C0019 c0019, List<C0367> list) {
        String strM1427 = list.get(0).m1427();
        int iIntValue = list.get(1).m1426().intValue();
        return list.get(2) != null ? C0367.m1420(C0131.m453(strM1427, iIntValue, list.get(2).m1426().intValue())) : C0367.m1420(C0131.m452(strM1427, iIntValue));
    }
}
