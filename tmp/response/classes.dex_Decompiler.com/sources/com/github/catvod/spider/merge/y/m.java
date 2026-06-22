package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.oZP;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class m implements com.github.catvod.spider.merge.W.c {
    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        int iLastIndexOf;
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.W.f) linkedList.get(0)).g();
        String strG2 = ((com.github.catvod.spider.merge.W.f) linkedList.get(1)).g();
        if (!com.github.catvod.spider.merge.D.h.c(strG)) {
            strG = (com.github.catvod.spider.merge.D.h.c(strG2) || (iLastIndexOf = strG.lastIndexOf(strG2)) == -1 || iLastIndexOf == strG.length() - strG2.length()) ? "" : strG.substring(strG2.length() + iLastIndexOf);
        }
        return new com.github.catvod.spider.merge.W.f(strG);
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("061A153218271C01106C0D33010A056C0034061B");
    }
}
