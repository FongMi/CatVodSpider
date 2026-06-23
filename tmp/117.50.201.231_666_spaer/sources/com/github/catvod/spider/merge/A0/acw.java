package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class acw extends adf {
    public int x;

    public acw(int i) {
        super(0L, jo.g);
        this.x = i;
    }

    public abstract void j(Object obj, CancellationException cancellationException);

    public abstract xl k();

    public Throwable l(Object obj) {
        if (!(obj instanceof tt)) {
            obj = null;
        }
        tt ttVar = (tt) obj;
        if (ttVar != null) {
            return ttVar.c;
        }
        return null;
    }

    public Object m(Object obj) {
        return obj;
    }

    public abstract Object n();

    @Override // java.lang.Runnable
    public final void run() {
        Object objB = jo.i;
        kj kjVar = this.aa;
        try {
            xl xlVarK = k();
            if (xlVarK == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
            acu acuVar = (acu) xlVarK;
            xm xmVar = acuVar.e;
            yg context = xmVar.getContext();
            Object objN = n();
            Object objD = zr.d(context, acuVar.c);
            try {
                Throwable thL = l(objN);
                nr nrVar = (thL == null && hk.a(this.x)) ? (nr) context.get(nr.aj) : null;
                if (nrVar != null && !nrVar.f()) {
                    CancellationException cancellationExceptionQ = ((bi) nrVar).q();
                    j(objN, cancellationExceptionQ);
                    xmVar.resumeWith(act.b(cancellationExceptionQ));
                } else if (thL != null) {
                    xmVar.resumeWith(act.b(thL));
                } else {
                    xmVar.resumeWith(m(objN));
                }
                zr.c(context, objD);
                try {
                    kjVar.p();
                } catch (Throwable th) {
                    objB = act.b(th);
                }
                y(null, vx.b(objB));
            } catch (Throwable th2) {
                zr.c(context, objD);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                kjVar.p();
            } catch (Throwable th4) {
                objB = act.b(th4);
            }
            y(th3, vx.b(objB));
        }
    }

    public final void y(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            cl.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ko.c(th);
        bj.a(k().getContext(), new za("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
