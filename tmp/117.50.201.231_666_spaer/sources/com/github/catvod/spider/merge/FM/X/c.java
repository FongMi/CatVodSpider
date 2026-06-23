package com.github.catvod.spider.merge.FM.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c implements com.github.catvod.spider.merge.FM.V.c {
    @Override // com.github.catvod.spider.merge.FM.V.c
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar, List<com.github.catvod.spider.merge.FM.V.f> list) {
        LinkedList linkedList = (LinkedList) list;
        return linkedList.size() == 0 ? new com.github.catvod.spider.merge.FM.V.f(0) : new com.github.catvod.spider.merge.FM.V.f(Integer.valueOf(((com.github.catvod.spider.merge.FM.V.f) linkedList.get(0)).d().size()));
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final String name() {
        return "count";
    }
}
