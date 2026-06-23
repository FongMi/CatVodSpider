package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class hk {
    public static final boolean a(int i) {
        return i == 1 || i == 2;
    }

    public static final void b(sa saVar, xl xlVar, boolean z) {
        Object objN = saVar.n();
        Throwable thL = saVar.l(objN);
        Object objB = thL != null ? act.b(thL) : saVar.m(objN);
        if (!z) {
            xlVar.resumeWith(objB);
            return;
        }
        if (xlVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        }
        acu acuVar = (acu) xlVar;
        xm xmVar = acuVar.e;
        yg context = xmVar.getContext();
        Object objD = zr.d(context, acuVar.c);
        try {
            xmVar.resumeWith(objB);
        } finally {
            zr.c(context, objD);
        }
    }
}
