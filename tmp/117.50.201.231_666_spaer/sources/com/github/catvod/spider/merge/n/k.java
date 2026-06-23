package com.github.catvod.spider.merge.N;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k implements com.github.catvod.spider.merge.L.c {
    @Override // com.github.catvod.spider.merge.L.c
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar, List<com.github.catvod.spider.merge.L.f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.L.f) linkedList.get(0)).g();
        int iMax = Math.max(((com.github.catvod.spider.merge.L.f) linkedList.get(1)).f().intValue() - 1, 0);
        return linkedList.get(2) != null ? new com.github.catvod.spider.merge.L.f(com.github.catvod.spider.merge.y.f.j(strG, iMax, Math.max(Math.min(((com.github.catvod.spider.merge.L.f) linkedList.get(2)).f().intValue() + iMax, strG.length()), 0))) : new com.github.catvod.spider.merge.L.f(com.github.catvod.spider.merge.y.f.i(strG, iMax));
    }

    @Override // com.github.catvod.spider.merge.L.c
    public final String name() {
        return "substring";
    }
}
