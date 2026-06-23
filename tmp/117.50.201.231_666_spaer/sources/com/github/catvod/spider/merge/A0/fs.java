package com.github.catvod.spider.merge.A0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fs extends acg {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs(Class cls, int i) {
        super(cls);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.acg
    public final Date b(Date date) {
        switch (this.a) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
