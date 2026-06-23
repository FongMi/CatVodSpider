package com.github.catvod.spider.merge.A0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ak {
    public static final long a = xy.g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b;
    public static final int c;
    public static final long d;
    public static final jo e;

    static {
        xy.h("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 12);
        int i = abp.a;
        int iH = xy.h("kotlinx.coroutines.scheduler.core.pool.size", i >= 2 ? i : 2, 8);
        b = iH;
        c = xy.h("kotlinx.coroutines.scheduler.max.pool.size", xj.h(i * 128, iH, 2097150), 4);
        d = TimeUnit.SECONDS.toNanos(xy.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        e = jo.f;
    }
}
