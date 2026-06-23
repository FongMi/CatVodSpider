package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.R.e;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class l {
    public static final e c;
    public final a a;
    protected final Y b;

    static {
        UUID uuid = k.f;
        UUID uuid2 = k.f;
        e eVar = new e(new f(true));
        c = eVar;
        eVar.a = Integer.MAX_VALUE;
    }

    public l(a aVar, Y y) {
        this.a = aVar;
        this.b = y;
    }

    public abstract void a();
}
