package com.github.catvod.spider.merge.Fs;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Fs.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0650j0 extends h1 {
    C0650j0() {
        super("ScriptDataEscapedEndTagOpen", 25, null);
    }

    @Override // com.github.catvod.spider.merge.Fs.h1
    final void g(Q q, C0631a c0631a) {
        if (!c0631a.C()) {
            q.k("</");
            q.u(h1.x);
        } else {
            q.g(false);
            q.i.n(c0631a.s());
            q.h.append(c0631a.s());
            q.a(h1.C);
        }
    }
}
