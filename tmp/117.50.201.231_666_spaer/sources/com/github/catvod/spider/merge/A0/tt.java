package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class tt {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(tt.class, "_handled");
    private volatile int _handled;
    public final Throwable c;

    public tt(Throwable th, boolean z) {
        this.c = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.c + ']';
    }
}
