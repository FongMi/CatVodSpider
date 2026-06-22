package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class gv {
    static B8 S(A0 a0) {
        g9 g9VarBc = a0.bc();
        return (g9VarBc == null || g9VarBc.T() == null) ? new B8(new xU()) : g9VarBc.T();
    }

    static g9.aA l8(A0 a0) {
        g9 g9VarBc = a0.bc();
        if (g9VarBc == null) {
            g9VarBc = new g9("");
        }
        return g9VarBc.K();
    }
}
