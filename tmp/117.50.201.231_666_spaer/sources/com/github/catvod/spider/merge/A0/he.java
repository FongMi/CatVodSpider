package com.github.catvod.spider.merge.A0;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class he {
    public static final boolean a;
    public static final fs b;
    public static final fs c;
    public static final gt d;
    public static final yu e;
    public static final av f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new fs(Date.class, 0);
            c = new fs(Timestamp.class, 1);
            d = kl.a;
            e = nn.a;
            f = yd.a;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
