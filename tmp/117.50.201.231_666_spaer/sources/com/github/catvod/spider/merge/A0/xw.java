package com.github.catvod.spider.merge.A0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xw extends CancellationException {
    public final bi a;

    public xw(String str, Throwable th, bi biVar) {
        super(str);
        this.a = biVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof xw) {
                xw xwVar = (xw) obj;
                if (!ko.b(xwVar.getMessage(), getMessage()) || !ko.b(xwVar.a, this.a) || !ko.b(xwVar.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        ko.c(message);
        int iHashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
