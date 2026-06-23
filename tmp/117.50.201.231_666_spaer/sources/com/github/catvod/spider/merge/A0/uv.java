package com.github.catvod.spider.merge.A0;

import java.util.Stack;
import org.slf4j.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class uv {
    public Logger a;
    public Stack b;
    public rg c;

    public final rg d() {
        return (rg) this.b.peek();
    }

    public final void e(rp rpVar) {
        ((rg) this.b.peek()).a = rpVar;
    }

    public final Object f(fg fgVar) {
        rf rfVar = (rf) fgVar;
        int iJ = rfVar.j();
        Object objB = null;
        for (int i = 0; i < iJ; i++) {
            objB = rfVar.i(i).b(this);
        }
        return objB;
    }
}
