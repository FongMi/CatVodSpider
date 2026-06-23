package com.github.catvod.spider.merge.A0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class sx {
    public static an j(an anVar) {
        if (anVar.f != null) {
            throw new IllegalStateException();
        }
        anVar.n();
        anVar.e = true;
        return anVar.d > 0 ? anVar : an.a;
    }

    public static int k(List list) {
        return list.size() - 1;
    }

    public static List l(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        ko.e("singletonList(...)", listSingletonList);
        return listSingletonList;
    }
}
