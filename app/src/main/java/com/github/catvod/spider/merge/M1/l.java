package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.F1.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class l {
    public static final com.github.catvod.spider.merge.C1.c a;
    public static final com.github.catvod.spider.merge.z1.g b;
    private static final List<o> c;

    static {
        C c2 = new C();
        com.github.catvod.spider.merge.C1.c cVar = new com.github.catvod.spider.merge.C1.c();
        a = cVar;
        com.github.catvod.spider.merge.w1.a aVar = new com.github.catvod.spider.merge.w1.a();
        com.github.catvod.spider.merge.z1.g gVar = new com.github.catvod.spider.merge.z1.g();
        b = gVar;
        Object[] objArr = {c2, cVar, aVar, gVar, new com.github.catvod.spider.merge.t1.a()};
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static List<o> a() {
        return c;
    }
}
