package com.github.catvod.spider.merge.P;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class g extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public g(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        Class cls;
        com.github.catvod.spider.merge.Q.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(v.class);
        if (listF.size() == 1) {
            return (com.github.catvod.spider.merge.Q.b) ((com.github.catvod.spider.merge.D.b) listF.get(0)).a(cVar);
        }
        if (listF.size() != 2) {
            throw new com.github.catvod.spider.merge.I.a("error equalityExpr near:" + getText());
        }
        com.github.catvod.spider.merge.Q.b bVar2 = (com.github.catvod.spider.merge.Q.b) ((com.github.catvod.spider.merge.D.b) listF.get(0)).a(cVar);
        com.github.catvod.spider.merge.Q.b bVar3 = (com.github.catvod.spider.merge.Q.b) ((com.github.catvod.spider.merge.D.b) listF.get(1)).a(cVar);
        cls = Object.class;
        if ("=".equals(this.e.a())) {
            Object obj = bVar2.a;
            Class<?> cls2 = obj == null ? cls : obj.getClass();
            Object obj2 = bVar3.a;
            if (cls2.equals(obj2 != null ? obj2.getClass() : Object.class)) {
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2 == bVar3 || bVar2.equals(bVar3)));
            } else {
                String strE = bVar2.e();
                String strE2 = bVar3.e();
                if (strE == strE2 || (strE != null && strE.equals(strE2))) {
                    z = true;
                }
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(z));
            }
        } else {
            Object obj3 = bVar2.a;
            Class<?> cls3 = obj3 == null ? cls : obj3.getClass();
            Object obj4 = bVar3.a;
            if (cls3.equals(obj4 != null ? obj4.getClass() : Object.class)) {
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(!(bVar2 == bVar3 || bVar2.equals(bVar3))));
            } else {
                String strE3 = bVar2.e();
                String strE4 = bVar3.e();
                if (strE3 == strE4 || (strE3 != null && strE3.equals(strE4))) {
                    z = true;
                }
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(!z));
            }
        }
        return bVar;
    }
}
