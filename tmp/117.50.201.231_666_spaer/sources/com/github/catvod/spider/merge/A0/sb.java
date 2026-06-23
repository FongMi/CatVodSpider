package com.github.catvod.spider.merge.A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class sb extends tt {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(sb.class, "_resumed");
    private volatile int _resumed;

    public sb(sa saVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + saVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }
}
