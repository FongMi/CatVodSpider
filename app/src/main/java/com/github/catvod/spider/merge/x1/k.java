package com.github.catvod.spider.merge.x1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.I1.p;
import com.github.catvod.spider.merge.I1.q;
import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.m1.C1311c;
import com.github.catvod.spider.merge.m1.EnumC1316h;
import com.github.catvod.spider.merge.m1.o;
import com.github.catvod.spider.merge.p1.C1368e;
import com.github.catvod.spider.merge.q1.C1380a;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class k extends com.github.catvod.spider.merge.I1.f {
    private com.github.catvod.spider.merge.D0.e e;
    private String f;
    private com.github.catvod.spider.merge.D0.e g;

    public k(o oVar, C1380a c1380a) {
        super(oVar, c1380a);
        this.e = null;
        this.f = "";
        this.g = null;
    }

    private String c0(String str) {
        return (String) this.g.b("streams").stream().filter(new g(com.github.catvod.spider.merge.D0.e.class, 0)).map(new a(com.github.catvod.spider.merge.D0.e.class, 1)).map(new Function() { // from class: com.github.catvod.spider.merge.x1.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((com.github.catvod.spider.merge.D0.e) obj).g("urls");
            }
        }).filter(new com.github.catvod.spider.merge.A1.c(str, 4)).map(new b(str, 0)).findFirst().orElse("");
    }

    private <T extends com.github.catvod.spider.merge.I1.e> List<T> d0(String str, Function<j, T> function) {
        return (List) this.g.b("streams").stream().filter(new f(com.github.catvod.spider.merge.D0.e.class, 0)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 0)).filter(new com.github.catvod.spider.merge.D0.b(str, 3)).flatMap(e.c).filter(new Predicate() { // from class: com.github.catvod.spider.merge.x1.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !"dash".equals(((j) obj).b);
            }
        }).map(function).collect(Collectors.toList());
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final int H() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<C1311c> P() {
        return l.b(this.g);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String U() {
        return this.e.i("conference", null);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String W() {
        return C1290c.a("https://streaming.media.ccc.de/", this.e.i("slug", null));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> X() {
        return Collections.emptyList();
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<q> Y() {
        return d0("video", new Function() { // from class: com.github.catvod.spider.merge.x1.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j jVar = (j) obj;
                com.github.catvod.spider.merge.D0.c cVarB = jVar.a.b("videoSize");
                p pVar = new p();
                pVar.d(jVar.c.i("tech", " "));
                pVar.b(jVar.c.i("url", null), true);
                pVar.e(false);
                Object obj2 = cVarB.get(0);
                int iIntValue = obj2 instanceof Number ? ((Number) obj2).intValue() : 0;
                Object obj3 = cVarB.get(1);
                pVar.i(iIntValue + "x" + (obj3 instanceof Number ? ((Number) obj3).intValue() : 0));
                if ("hls".equals(jVar.b)) {
                    pVar.c(3);
                } else {
                    pVar.h(EnumC1316h.a(jVar.b));
                }
                return pVar.a();
            }
        });
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final long Z() {
        return -1L;
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final String i() {
        return this.g.i("display", null);
    }

    @Override // com.github.catvod.spider.merge.m1.AbstractC1310b
    public final void o(AbstractC0901a abstractC0901a) throws C1368e {
        com.github.catvod.spider.merge.D0.c cVarA = l.a(abstractC0901a, f());
        for (int i = 0; i < cVarA.size(); i++) {
            com.github.catvod.spider.merge.D0.e eVarA = cVarA.a(i);
            com.github.catvod.spider.merge.D0.c cVarB = eVarA.b("groups");
            for (int i2 = 0; i2 < cVarB.size(); i2++) {
                String strI = cVarB.a(i2).i("group", null);
                com.github.catvod.spider.merge.D0.c cVarB2 = cVarB.a(i2).b("rooms");
                for (int i3 = 0; i3 < cVarB2.size(); i3++) {
                    com.github.catvod.spider.merge.D0.e eVarA2 = cVarB2.a(i3);
                    if (g().equals(eVarA.i("slug", null) + "/" + eVarA2.i("slug", null))) {
                        this.e = eVarA;
                        this.f = strI;
                        this.g = eVarA2;
                        return;
                    }
                }
            }
        }
        throw new C1368e(t0.a("Could not find room matching id: '", g(), "'"));
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final List<com.github.catvod.spider.merge.I1.b> q() {
        return d0("audio", e.b);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String r() {
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String s() {
        return c0("dash");
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final com.github.catvod.spider.merge.I1.c t() {
        return new com.github.catvod.spider.merge.I1.c(t0.a(this.e.i("description", null), " - ", this.f), 3);
    }

    @Override // com.github.catvod.spider.merge.I1.f
    public final String x() {
        return c0("hls");
    }
}
