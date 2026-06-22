package com.github.catvod.spider.merge.P;

import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class z extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public z(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        com.github.catvod.spider.merge.L.l lVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        if (((r) e(r.class)) == null && !((r) e(r.class)).h()) {
            return (com.github.catvod.spider.merge.Q.b) ((z) e(z.class)).a(cVar);
        }
        com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((r) e(r.class)).a(cVar);
        if (this.e != null) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.Q.a aVar = cVar.a().c;
            com.github.catvod.spider.merge.Q.a aVar2 = new com.github.catvod.spider.merge.Q.a(aVar.a);
            aVar2.c = aVar;
            stack.push(aVar2);
            com.github.catvod.spider.merge.Q.b bVar2 = (com.github.catvod.spider.merge.Q.b) ((z) e(z.class)).a(cVar);
            stack.pop();
            Object obj = bVar.a;
            if (obj instanceof com.github.catvod.spider.merge.N.e) {
                Object obj2 = bVar2.a;
                if (obj2 instanceof com.github.catvod.spider.merge.N.e) {
                    ((com.github.catvod.spider.merge.N.e) obj).addAll((com.github.catvod.spider.merge.N.e) obj2);
                } else {
                    com.github.catvod.spider.merge.L.l lVar2 = new com.github.catvod.spider.merge.L.l();
                    String strE = bVar2.e();
                    com.github.catvod.spider.merge.J.b.f(strE);
                    lVar2.x(new com.github.catvod.spider.merge.L.s(strE));
                    ((com.github.catvod.spider.merge.N.e) bVar.a).add(lVar2);
                }
            } else if (obj instanceof String) {
                if (bVar2.a instanceof com.github.catvod.spider.merge.N.e) {
                    lVar = new com.github.catvod.spider.merge.L.l();
                    String strE2 = bVar.e();
                    com.github.catvod.spider.merge.J.b.f(strE2);
                    lVar.x(new com.github.catvod.spider.merge.L.s(strE2));
                    ((com.github.catvod.spider.merge.N.e) bVar2.a).add(lVar);
                    return bVar2;
                }
                bVar = new com.github.catvod.spider.merge.Q.b(bVar.e() + bVar2.e());
            } else if (obj instanceof Boolean) {
                Object obj3 = bVar2.a;
                if (obj3 instanceof Boolean) {
                    bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.a().booleanValue() | bVar.a().booleanValue()));
                } else {
                    if (obj3 instanceof com.github.catvod.spider.merge.N.e) {
                        lVar = new com.github.catvod.spider.merge.L.l();
                        String strE3 = bVar.e();
                        com.github.catvod.spider.merge.J.b.f(strE3);
                        lVar.x(new com.github.catvod.spider.merge.L.s(strE3));
                        ((com.github.catvod.spider.merge.N.e) bVar2.a).add(lVar);
                        return bVar2;
                    }
                    if (!(obj3 instanceof String)) {
                        throw new com.github.catvod.spider.merge.I.a("can not merge val1=" + bVar.a() + ",val2=" + bVar2.e());
                    }
                    bVar = new com.github.catvod.spider.merge.Q.b(bVar.a() + bVar2.e());
                }
            } else if (obj instanceof Number) {
                Object obj4 = bVar2.a;
                if (!(obj4 instanceof String)) {
                    if (!(obj4 instanceof com.github.catvod.spider.merge.N.e)) {
                        throw new com.github.catvod.spider.merge.I.a("can not merge val1=" + bVar.c() + ",val2=" + bVar2.e());
                    }
                    lVar = new com.github.catvod.spider.merge.L.l();
                    String strE4 = bVar.e();
                    com.github.catvod.spider.merge.J.b.f(strE4);
                    lVar.x(new com.github.catvod.spider.merge.L.s(strE4));
                    ((com.github.catvod.spider.merge.N.e) bVar2.a).add(lVar);
                    return bVar2;
                }
                bVar = new com.github.catvod.spider.merge.Q.b(bVar.c() + bVar2.e());
            } else {
                LinkedList linkedList = new LinkedList();
                if (!com.github.catvod.spider.merge.E.c.a(bVar.e())) {
                    linkedList.add(bVar.e());
                }
                if (!com.github.catvod.spider.merge.E.c.a(bVar2.e())) {
                    linkedList.add(bVar2.e());
                }
                bVar = new com.github.catvod.spider.merge.Q.b(com.github.catvod.spider.merge.E.c.c(linkedList, ","));
            }
        }
        return bVar;
    }
}
