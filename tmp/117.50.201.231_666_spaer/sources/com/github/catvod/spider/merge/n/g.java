package com.github.catvod.spider.merge.N;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g implements com.github.catvod.spider.merge.L.c {
    @Override // com.github.catvod.spider.merge.L.c
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar, List<com.github.catvod.spider.merge.L.f> list) {
        if (((LinkedList) list).size() == 1) {
            return new com.github.catvod.spider.merge.L.f(Boolean.valueOf(!((com.github.catvod.spider.merge.L.f) r3.get(0)).a().booleanValue()));
        }
        throw new com.github.catvod.spider.merge.P.e("error param in not(bool) function.Please check.");
    }

    @Override // com.github.catvod.spider.merge.L.c
    public final String name() {
        return "not";
    }
}
