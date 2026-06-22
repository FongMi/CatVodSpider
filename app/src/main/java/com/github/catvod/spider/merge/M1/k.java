package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.b.AbstractC0901a;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k {
    private static AbstractC0901a a;
    private static com.github.catvod.spider.merge.r1.e b;
    private static com.github.catvod.spider.merge.r1.a c;

    public static AbstractC0901a a() {
        return a;
    }

    public static com.github.catvod.spider.merge.r1.a b() {
        com.github.catvod.spider.merge.r1.a aVar = c;
        return aVar == null ? com.github.catvod.spider.merge.r1.a.c : aVar;
    }

    public static com.github.catvod.spider.merge.r1.e c() {
        com.github.catvod.spider.merge.r1.e eVar = b;
        return eVar == null ? com.github.catvod.spider.merge.r1.e.d : eVar;
    }

    public static void d(AbstractC0901a abstractC0901a, com.github.catvod.spider.merge.r1.e eVar) {
        com.github.catvod.spider.merge.r1.a aVar = eVar.a().isEmpty() ? com.github.catvod.spider.merge.r1.a.c : new com.github.catvod.spider.merge.r1.a(eVar.a());
        a = abstractC0901a;
        b = eVar;
        c = aVar;
    }
}
