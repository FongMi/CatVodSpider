package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public enum I0 extends g1 {
    public I0() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // com.github.catvod.spider.merge.M.g1
    public final void d(P p, C0030a c0030a) {
        C0076x0 c0076x0 = g1.c;
        int[] iArrB = p.b(null, false);
        if (iArrB == null) {
            p.e('&');
        } else {
            p.g(new String(iArrB, 0, iArrB.length));
        }
        p.o(c0076x0);
    }
}
