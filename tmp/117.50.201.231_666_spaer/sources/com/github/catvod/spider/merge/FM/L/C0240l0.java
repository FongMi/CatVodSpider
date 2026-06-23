package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.L.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum C0240l0 extends j1 {
    C0240l0() {
        super("ScriptDataEscapedEndTagOpen", 25, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        if (!c0217a.H()) {
            t.l("</");
            t.v(j1.v);
        } else {
            t.h(false);
            t.k.p(c0217a.u());
            t.h.append(c0217a.u());
            t.a(j1.A);
        }
    }
}
