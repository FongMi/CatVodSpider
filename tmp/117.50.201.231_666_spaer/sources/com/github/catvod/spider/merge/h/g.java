package com.github.catvod.spider.merge.H;

import java.io.StringReader;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g {
    private m a;
    private e b = new e();

    public g(m mVar) {
        this.a = mVar;
    }

    public static com.github.catvod.spider.merge.G.f d(String str) {
        i iVarU;
        b bVar = new b();
        bVar.c(new StringReader(str), new g(bVar));
        k kVar = bVar.c;
        do {
            iVarU = kVar.u();
            bVar.e(iVarU);
            iVarU.h();
        } while (iVarU.a != 6);
        bVar.b.d();
        bVar.b = null;
        bVar.c = null;
        bVar.e = null;
        bVar.i = null;
        return bVar.d;
    }

    public final e a() {
        return this.b;
    }

    public final boolean b(String str) {
        return this.a.d(str);
    }

    public final boolean c() {
        return this.b.b() > 0;
    }
}
