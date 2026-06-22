package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.C.B;
import com.github.catvod.spider.merge.C.E;
import com.github.catvod.spider.merge.D.C0623y;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class l implements Callable<Void> {
    final /* synthetic */ o a;

    l(o oVar) {
        this.a = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.a.a.c(Timestamp.class, B.c);
        this.a.a.c(Date.class, B.b);
        this.a.a.c(Time.class, E.a);
        this.a.a.c(java.util.Date.class, C0623y.a);
        return null;
    }
}
