package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ob implements Runnable, Comparable, adh {
    public Object d;
    public int e = -1;
    public long f;

    public ob(long j) {
        this.f = j;
    }

    @Override // com.github.catvod.spider.merge.A0.adh
    public final synchronized void b() {
        try {
            Object obj = this.d;
            xb xbVar = sk.a;
            if (obj == xbVar) {
                return;
            }
            if (!(obj instanceof lh)) {
                obj = null;
            }
            lh lhVar = (lh) obj;
            if (lhVar != null) {
                lhVar.e(this);
            }
            this.d = xbVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f - ((ob) obj).f;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f + ']';
    }
}
