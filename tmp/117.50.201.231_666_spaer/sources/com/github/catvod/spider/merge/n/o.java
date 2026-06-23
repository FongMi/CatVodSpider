package com.github.catvod.spider.merge.N;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class o implements com.github.catvod.spider.merge.L.c {
    @Override // com.github.catvod.spider.merge.L.c
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar, List<com.github.catvod.spider.merge.L.f> list) {
        int iLastIndexOf;
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.L.f) linkedList.get(0)).g();
        String strG2 = ((com.github.catvod.spider.merge.L.f) linkedList.get(1)).g();
        if (!com.github.catvod.spider.merge.y.f.c(strG) && !com.github.catvod.spider.merge.y.f.c(strG2) && (iLastIndexOf = strG.lastIndexOf(strG2)) != -1) {
            strG = strG.substring(0, iLastIndexOf);
        }
        return new com.github.catvod.spider.merge.L.f(strG);
    }

    @Override // com.github.catvod.spider.merge.L.c
    public final String name() {
        return "substring-before-last";
    }
}
