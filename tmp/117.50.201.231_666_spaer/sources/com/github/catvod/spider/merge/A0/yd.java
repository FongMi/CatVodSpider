package com.github.catvod.spider.merge.A0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class yd extends kv {
    public static final av a = new av();
    public final kv d;

    public yd(kv kvVar) {
        this.d = kvVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) {
        Date date = (Date) this.d.b(rdVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) {
        this.d.c(aagVar, (Timestamp) obj);
    }
}
