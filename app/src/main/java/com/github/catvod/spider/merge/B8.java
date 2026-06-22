package com.github.catvod.spider.merge;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class B8 {
    private O S = O.S();
    private rO T4;
    private gx l8;

    public B8(gx gxVar) {
        this.l8 = gxVar;
        this.T4 = gxVar.S();
    }

    public static B8 S() {
        return new B8(new xU());
    }

    public static g9 T4(String str, String str2) {
        xU xUVar = new xU();
        return xUVar.OL(new StringReader(str), str2, new B8(xUVar));
    }

    public rO b() {
        return this.T4;
    }

    public O l8() {
        return this.S;
    }
}
