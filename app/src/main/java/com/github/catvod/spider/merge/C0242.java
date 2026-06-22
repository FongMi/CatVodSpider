package com.github.catvod.spider.merge;

import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ه, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0242 implements InterfaceC0007 {
    @Override // com.github.catvod.spider.merge.InterfaceC0007
    public String name() {
        return SOY.d("1E37221511191E333F02");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0007
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo134(C0455 c0455) {
        HashSet hashSet = new HashSet();
        C0455 c04552 = new C0455();
        for (C0011 c0011 : c0455) {
            C0455 c0455M185 = c0011.m185();
            c0455M185.remove(c0011);
            hashSet.addAll(c0455M185);
        }
        c04552.addAll(hashSet);
        return C0367.m1420(c04552);
    }
}
