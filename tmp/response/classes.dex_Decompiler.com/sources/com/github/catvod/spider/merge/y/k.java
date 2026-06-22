package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.oZP;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class k implements com.github.catvod.spider.merge.W.c {
    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.W.f) linkedList.get(0)).g();
        int iMax = Math.max(((com.github.catvod.spider.merge.W.f) linkedList.get(1)).f().intValue() - 1, 0);
        return linkedList.get(2) != null ? new com.github.catvod.spider.merge.W.f(com.github.catvod.spider.merge.D.h.j(strG, iMax, Math.max(Math.min(((com.github.catvod.spider.merge.W.f) linkedList.get(2)).f().intValue() + iMax, strG.length()), 0))) : new com.github.catvod.spider.merge.W.f(com.github.catvod.spider.merge.D.h.i(strG, iMax));
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("061A153218271C0110");
    }
}
