package com.github.catvod.spider.merge.A0;

import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class bh {
    public static rp a(dr drVar, ed edVar) {
        drVar.d();
        edVar.getClass();
        return (rp) pq.b(edVar, ed.class).filter(new ri(drVar, edVar)).collect(Collectors.toCollection(new se(2)));
    }
}
