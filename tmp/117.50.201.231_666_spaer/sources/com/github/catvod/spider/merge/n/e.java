package com.github.catvod.spider.merge.N;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class e implements com.github.catvod.spider.merge.L.c {
    @Override // com.github.catvod.spider.merge.L.c
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar, List<com.github.catvod.spider.merge.L.f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.L.f) linkedList.get(0)).g();
        String strG2 = ((com.github.catvod.spider.merge.L.f) linkedList.get(1)).g();
        try {
            return (linkedList.size() <= 2 || linkedList.get(2) == null) ? new com.github.catvod.spider.merge.L.f(com.github.catvod.spider.merge.C.b.b(strG2).c(strG)) : new com.github.catvod.spider.merge.L.f(new SimpleDateFormat(strG2, Locale.forLanguageTag(((com.github.catvod.spider.merge.L.f) linkedList.get(2)).g())).parse(strG));
        } catch (ParseException e) {
            throw new com.github.catvod.spider.merge.P.e(e);
        }
    }

    @Override // com.github.catvod.spider.merge.L.c
    public final String name() {
        return "format-date";
    }
}
