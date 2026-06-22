package com.github.catvod.spider.merge.P;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class v extends com.github.catvod.spider.merge.z.r {
    public com.github.catvod.spider.merge.z.f e;

    public v(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        com.github.catvod.spider.merge.Q.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        List listF = f(d.class);
        if (listF.size() == 1) {
            return (com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0));
        }
        if (listF.size() != 2) {
            throw new com.github.catvod.spider.merge.I.a("error equalityExpr near:" + getText());
        }
        com.github.catvod.spider.merge.Q.b bVar2 = (com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(0));
        com.github.catvod.spider.merge.Q.b bVar3 = (com.github.catvod.spider.merge.Q.b) cVar.c((com.github.catvod.spider.merge.D.b) listF.get(1));
        switch (this.e.a) {
            case 24:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.compareTo(bVar3) < 0));
                break;
            case 25:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.compareTo(bVar3) > 0));
                break;
            case 26:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.compareTo(bVar3) <= 0));
                break;
            case 27:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.compareTo(bVar3) >= 0));
                break;
            case 28:
            case 29:
            default:
                throw new com.github.catvod.spider.merge.I.a("unknown operator" + this.e.a());
            case 30:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.e().startsWith(bVar3.e())));
                break;
            case 31:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.e().endsWith(bVar3.e())));
                break;
            case 32:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.e().contains(bVar3.e())));
                break;
            case 33:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(bVar2.e().matches(bVar3.e())));
                break;
            case 34:
                bVar = new com.github.catvod.spider.merge.Q.b(Boolean.valueOf(!bVar2.e().matches(bVar3.e())));
                break;
        }
        return bVar;
    }
}
