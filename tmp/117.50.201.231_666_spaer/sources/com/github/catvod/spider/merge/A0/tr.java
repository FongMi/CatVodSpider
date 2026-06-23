package com.github.catvod.spider.merge.A0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class tr {
    public final Object a;
    public final adq b;
    public final qw c;
    public final Object d;
    public final Throwable e;

    public tr(Object obj, adq adqVar, qw qwVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = adqVar;
        this.c = qwVar;
        this.d = obj2;
        this.e = th;
    }

    public /* synthetic */ tr(Object obj, adq adqVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : adqVar, null, null, (i & 16) != 0 ? null : cancellationException);
    }

    public static tr f(tr trVar, adq adqVar, CancellationException cancellationException, int i) {
        Object obj = trVar.a;
        if ((i & 2) != 0) {
            adqVar = trVar.b;
        }
        adq adqVar2 = adqVar;
        qw qwVar = trVar.c;
        Object obj2 = trVar.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = trVar.e;
        }
        trVar.getClass();
        return new tr(obj, adqVar2, qwVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return ko.b(this.a, trVar.a) && ko.b(this.b, trVar.b) && ko.b(this.c, trVar.c) && ko.b(this.d, trVar.d) && ko.b(this.e, trVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        adq adqVar = this.b;
        int iHashCode2 = (iHashCode + (adqVar != null ? adqVar.hashCode() : 0)) * 31;
        qw qwVar = this.c;
        int iHashCode3 = (iHashCode2 + (qwVar != null ? qwVar.hashCode() : 0)) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ")";
    }
}
