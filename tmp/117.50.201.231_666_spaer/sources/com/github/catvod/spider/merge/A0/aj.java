package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aj extends adf {
    public final Runnable a;

    public aj(Runnable runnable, long j, kj kjVar) {
        super(j, kjVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.aa.p();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.a;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(rs.a(runnable));
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.aa);
        sb.append(']');
        return sb.toString();
    }
}
