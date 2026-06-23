package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class tn extends mj {
    public static final int a;
    public static final tn b = new tn();
    private static volatile Executor pool;

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            property = null;
        }
        if (property != null) {
            Integer numX = hx.x(property);
            if (numX == null || numX.intValue() < 1) {
                throw new IllegalStateException("Expected positive number in kotlinx.coroutines.default.parallelism, but has ".concat(property).toString());
            }
            iIntValue = numX.intValue();
        } else {
            iIntValue = -1;
        }
        a = iIntValue;
    }

    public static ExecutorService c() {
        return Executors.newFixedThreadPool(f(), new tl(new AtomicInteger()));
    }

    public static ExecutorService d() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return c();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return c();
        }
        int i = a;
        tn tnVar = b;
        if (i < 0) {
            try {
                Method method = cls.getMethod("commonPool", null);
                Object objInvoke = method != null ? method.invoke(null, null) : null;
                if (!(objInvoke instanceof ExecutorService)) {
                    objInvoke = null;
                }
                executorService = (ExecutorService) objInvoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                tnVar.getClass();
                executorService.submit(tm.a);
                try {
                    Object objInvoke2 = cls.getMethod("getPoolSize", null).invoke(executorService, null);
                    if (!(objInvoke2 instanceof Integer)) {
                        objInvoke2 = null;
                    }
                    num = (Integer) objInvoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (num == null || num.intValue() < 1) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Constructor<?> constructor = cls.getConstructor(Integer.TYPE);
            tnVar.getClass();
            Object objNewInstance = constructor.newInstance(Integer.valueOf(f()));
            if (!(objNewInstance instanceof ExecutorService)) {
                objNewInstance = null;
            }
            executorService2 = (ExecutorService) objNewInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : c();
    }

    public static int f() {
        int i = a;
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (iAvailableProcessors < 1) {
            return 1;
        }
        return iAvailableProcessors;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool");
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final void e(yg ygVar, acw acwVar) {
        try {
            Executor executorD = pool;
            if (executorD == null) {
                synchronized (this) {
                    executorD = pool;
                    if (executorD == null) {
                        executorD = d();
                        pool = executorD;
                    }
                }
            }
            executorD.execute(acwVar);
        } catch (RejectedExecutionException unused) {
            acj.x._a(acwVar);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final String toString() {
        return "CommonPool";
    }
}
