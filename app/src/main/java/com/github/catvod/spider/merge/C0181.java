package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ґ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0181 implements InterfaceC0366 {
    @Override // com.github.catvod.spider.merge.InterfaceC0366
    public String name() {
        return SOY.d("143D3513");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo275(C0019 c0019) {
        C0455 c0455 = new C0455();
        for (C0011 c0011 : c0019.m220()) {
            c0455.addAll(c0011.m179());
            String strM194 = c0011.m194();
            if (C0131.m443(strM194)) {
                C0011 c00112 = new C0011("");
                c00112.m174(strM194);
                c0455.add(c00112);
            }
        }
        return C0367.m1420(c0455);
    }
}
