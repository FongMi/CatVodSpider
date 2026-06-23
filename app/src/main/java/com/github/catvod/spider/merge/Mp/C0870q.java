package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.Mp.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0870q extends B {
    C0870q() {
        super(ZrJ.d("38253F283A041F372E3F0E37182E2E3E2D31"), 22, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.B
    final boolean d(Q q, C0840b c0840b) {
        if (q.c()) {
            c0840b.L((J) q);
            return true;
        }
        if (q.d() || B.a(q) || (q.g() && ((N) q).e.equals(ZrJ.d("11372621")))) {
            return c0840b.f0(q, B.g);
        }
        if (q.e()) {
            return true;
        }
        if (q.g() && ((N) q).e.equals(ZrJ.d("172C2D3F29281C30"))) {
            return c0840b.f0(q, B.d);
        }
        c0840b.t(this);
        return false;
    }
}
