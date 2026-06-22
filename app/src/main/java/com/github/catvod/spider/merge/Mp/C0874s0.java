package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum C0874s0 extends j1 {
    C0874s0() {
        super(ZrJ.d("2A20392438313D223F2C0C2A0C2127280D361A223B282C091C30383920241710222A26"), 31, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        if (!c0838a.E('/')) {
            t.v(j1.C);
            return;
        }
        t.j('/');
        t.i();
        t.a(j1.G);
    }
}
