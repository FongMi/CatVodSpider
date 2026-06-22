package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.oZP;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a implements com.github.catvod.spider.merge.W.c {
    @Override // com.github.catvod.spider.merge.W.c
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar, List<com.github.catvod.spider.merge.W.f> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<com.github.catvod.spider.merge.W.f> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().g());
        }
        return new com.github.catvod.spider.merge.W.f(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.W.c
    public final String name() {
        return oZP.d("160019220D21");
    }
}
