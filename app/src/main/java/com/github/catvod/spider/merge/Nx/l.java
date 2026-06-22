package com.github.catvod.spider.merge.Nx;

import com.github.catvod.spider.merge.Dw.m;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class l {
    public static final m c;
    public final a a;
    protected final Y b;

    static {
        UUID uuid = k.f;
        UUID uuid2 = k.f;
        m mVar = new m(new f(true));
        c = mVar;
        mVar.a = Integer.MAX_VALUE;
    }

    public l(a aVar, Y y) {
        this.a = aVar;
        this.b = y;
    }

    public abstract void a();
}
