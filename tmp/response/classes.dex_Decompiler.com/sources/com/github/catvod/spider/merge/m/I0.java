package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.oZP;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
enum I0 extends j1 {
    I0() {
        super(oZP.d("36001A2C093B01"), 46, null);
    }

    @Override // com.github.catvod.spider.merge.M.j1
    final void g(T t, C0017a c0017a) {
        char cU = c0017a.u();
        if (cU == 0) {
            t.r(this);
            c0017a.a();
            t.n.k((char) 65533);
        } else if (cU == '-') {
            t.a(j1.V);
        } else {
            if (cU != 65535) {
                t.n.l(c0017a.q('-', 0));
                return;
            }
            t.q(this);
            t.n();
            t.v(j1.a);
        }
    }
}
