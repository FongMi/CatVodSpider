package com.github.catvod.spider.merge.N;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class l implements com.github.catvod.spider.merge.L.c {
    @Override // com.github.catvod.spider.merge.L.c
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar, List<com.github.catvod.spider.merge.L.f> list) {
        LinkedList linkedList = (LinkedList) list;
        return new com.github.catvod.spider.merge.L.f(com.github.catvod.spider.merge.y.f.k(((com.github.catvod.spider.merge.L.f) linkedList.get(0)).g(), ((com.github.catvod.spider.merge.L.f) linkedList.get(1)).g()));
    }

    @Override // com.github.catvod.spider.merge.L.c
    public final String name() {
        return "substring-after";
    }
}
