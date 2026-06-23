package com.github.catvod.spider.merge.FM.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class i implements com.github.catvod.spider.merge.FM.V.c {
    @Override // com.github.catvod.spider.merge.FM.V.c
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar, List<com.github.catvod.spider.merge.FM.V.f> list) {
        LinkedList linkedList = (LinkedList) list;
        return new com.github.catvod.spider.merge.FM.V.f(Boolean.valueOf(((com.github.catvod.spider.merge.FM.V.f) linkedList.get(0)).g().startsWith(((com.github.catvod.spider.merge.FM.V.f) linkedList.get(1)).g())));
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final String name() {
        return "starts-with";
    }
}
