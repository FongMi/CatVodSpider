package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.oZP;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class j implements com.github.catvod.spider.merge.W.c {
    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        LinkedList linkedList = (LinkedList) list;
        return linkedList.size() == 0 ? new com.github.catvod.spider.merge.W.f(0) : new com.github.catvod.spider.merge.W.f(Integer.valueOf(((com.github.catvod.spider.merge.W.f) linkedList.get(0)).g().length()));
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("061B052802325803122F0B211D");
    }
}
