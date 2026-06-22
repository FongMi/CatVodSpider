package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.H.C0002c;
import com.github.catvod.spider.merge.oZP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class e implements com.github.catvod.spider.merge.W.c {
    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strG = ((com.github.catvod.spider.merge.W.f) linkedList.get(0)).g();
        String strG2 = ((com.github.catvod.spider.merge.W.f) linkedList.get(1)).g();
        try {
            return (linkedList.size() <= 2 || linkedList.get(2) == null) ? new com.github.catvod.spider.merge.W.f(C0002c.b(strG2).c(strG)) : new com.github.catvod.spider.merge.W.f(new SimpleDateFormat(strG2, Locale.forLanguageTag(((com.github.catvod.spider.merge.W.f) linkedList.get(2)).g())).parse(strG));
        } catch (ParseException e) {
            throw new com.github.catvod.spider.merge.a0.e(e);
        }
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("1300052C0D21580B163509");
    }
}
