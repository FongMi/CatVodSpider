package com.github.catvod.spider.merge.FM.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class n implements com.github.catvod.spider.merge.FM.V.c {
    @Override // com.github.catvod.spider.merge.FM.V.c
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar, List<com.github.catvod.spider.merge.FM.V.f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.FM.V.f) linkedList.get(0)).g();
        String strG2 = ((com.github.catvod.spider.merge.FM.V.f) linkedList.get(1)).g();
        if (!com.github.catvod.spider.merge.FM.C.h.c(strG) && strG2 != null) {
            if (strG2.isEmpty()) {
                strG = "";
            } else {
                int iIndexOf = strG.indexOf(strG2);
                if (iIndexOf != -1) {
                    strG = strG.substring(0, iIndexOf);
                }
            }
        }
        return new com.github.catvod.spider.merge.FM.V.f(strG);
    }

    @Override // com.github.catvod.spider.merge.FM.V.c
    public final String name() {
        return "substring-before";
    }
}
