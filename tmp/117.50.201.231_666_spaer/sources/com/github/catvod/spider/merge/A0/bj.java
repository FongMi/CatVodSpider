package com.github.catvod.spider.merge.A0;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class bj {
    public static final void a(yg ygVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = ygVar.get(jo.d);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(ygVar, th);
            } else {
                yn.b(ygVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                cl.a(runtimeException, th);
                th = runtimeException;
            }
            yn.b(ygVar, th);
        }
    }
}
