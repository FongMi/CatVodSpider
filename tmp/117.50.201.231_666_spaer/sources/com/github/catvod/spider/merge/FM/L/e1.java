package com.github.catvod.spider.merge.FM.L;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
enum e1 extends j1 {
    e1() {
        super("CdataSection", 66, null);
    }

    @Override // com.github.catvod.spider.merge.FM.L.j1
    final void g(T t, C0217a c0217a) {
        t.h.append(c0217a.o());
        if (c0217a.C("]]>") || c0217a.w()) {
            t.k(new H(t.h.toString()));
            t.v(j1.a);
        }
    }
}
