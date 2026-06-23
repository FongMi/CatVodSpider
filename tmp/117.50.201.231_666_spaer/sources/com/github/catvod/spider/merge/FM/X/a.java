package com.github.catvod.spider.merge.FM.X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a implements com.github.catvod.spider.merge.FM.V.c {
    @Override // com.github.catvod.spider.merge.FM.V.c
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar, List<com.github.catvod.spider.merge.FM.V.f> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<com.github.catvod.spider.merge.FM.V.f> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().g());
        }
        return new com.github.catvod.spider.merge.FM.V.f(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final String name() {
        return "concat";
    }
}
