package com.github.catvod.spider.merge.d1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d1.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0994k0 extends i1 {
    C0994k0() {
        super("ScriptDataEscapedEndTagOpen", 25, null);
    }

    @Override // com.github.catvod.spider.merge.d1.i1
    final void g(S s, C0973a c0973a) {
        if (!c0973a.H()) {
            s.l("</");
            s.v(i1.w);
        } else {
            s.h(false);
            s.k.p(c0973a.u());
            s.h.append(c0973a.u());
            s.a(i1.B);
        }
    }
}
