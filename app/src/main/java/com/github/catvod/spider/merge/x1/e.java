package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.m1.EnumC1316h;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                j jVar = (j) obj;
                com.github.catvod.spider.merge.I1.a aVar = new com.github.catvod.spider.merge.I1.a();
                aVar.u(jVar.c.i("tech", " "));
                aVar.s(jVar.c.i("url", null), true);
                aVar.r(-1);
                if ("hls".equals(jVar.b)) {
                    aVar.t(3);
                } else {
                    aVar.x(EnumC1316h.a(jVar.b));
                }
                return aVar.m();
            default:
                com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                return eVar.g("urls").entrySet().stream().filter(new Predicate() { // from class: com.github.catvod.spider.merge.x1.h
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((Map.Entry) obj2).getValue() instanceof com.github.catvod.spider.merge.D0.e;
                    }
                }).map(new a(eVar, 0));
        }
    }
}
