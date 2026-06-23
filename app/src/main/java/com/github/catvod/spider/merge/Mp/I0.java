package com.github.catvod.spider.merge.Mp;

import com.github.catvod.spider.merge.ZrJ;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class I0 extends j1 {
    I0() {
        super(ZrJ.d("3A2C26202D2B0D"), 46, null);
    }

    @Override // com.github.catvod.spider.merge.Mp.j1
    final void g(T t, C0838a c0838a) {
        char cU = c0838a.u();
        if (cU == 0) {
            t.r(this);
            c0838a.a();
            t.n.k((char) 65533);
        } else if (cU == '-') {
            t.a(j1.V);
        } else {
            if (cU != 65535) {
                t.n.l(c0838a.q('-', 0));
                return;
            }
            t.q(this);
            t.n();
            t.v(j1.a);
        }
    }
}
