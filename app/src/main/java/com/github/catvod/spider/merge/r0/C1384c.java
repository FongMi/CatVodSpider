package com.github.catvod.spider.merge.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.r0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1384c<T> implements InterfaceC1382a<T> {
    private Future<T> a;
    private Throwable b;

    private C1384c(Future<T> future, Throwable th) {
        this.a = future;
        this.b = th;
    }

    public static <T> C1384c<T> b(Throwable th) {
        return new C1384c<>(null, th);
    }

    public static <T> C1384c<T> d(T t) {
        return e(new FutureC1383b(t));
    }

    public static <T> C1384c<T> e(Future<T> future) {
        return new C1384c<>(future, null);
    }

    public final T a() {
        Future<T> future = this.a;
        if (future == null) {
            return null;
        }
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            this.b = e;
            return null;
        }
    }

    public final Throwable c() {
        Future<T> future = this.a;
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                this.b = e;
                return e;
            }
        }
        return this.b;
    }

    public final boolean f() {
        if (this.b != null) {
            return false;
        }
        try {
            this.a.get();
            return true;
        } catch (CancellationException unused) {
            return false;
        } catch (Exception e) {
            this.b = e;
            return false;
        }
    }
}
