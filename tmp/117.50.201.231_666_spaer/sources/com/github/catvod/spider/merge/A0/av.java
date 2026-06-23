package com.github.catvod.spider.merge.A0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class av implements vq {
    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        if (fjVar.a != Timestamp.class) {
            return null;
        }
        oaVar.getClass();
        return new yd(oaVar.aa(new fj(Date.class)));
    }
}
