package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
enum N0 extends j1 {
    N0() {
        super(ZrJ.d("3D2C283931351C"), 50, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        O0 o0 = j1.Z;
        char cF = c0838a.f();
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            if (cF != '>') {
                if (cF != 65535) {
                    t.r(this);
                } else {
                    t.q(this);
                }
            }
            t.r(this);
            t.g();
            t.m.h = true;
            t.o();
            t.v(j1.a);
            return;
        }
        t.v(o0);
    }
}
