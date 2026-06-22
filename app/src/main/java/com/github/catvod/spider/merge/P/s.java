package com.github.catvod.spider.merge.P;

import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class s extends com.github.catvod.spider.merge.z.r {
    public s(int i, com.github.catvod.spider.merge.z.r rVar) {
        super(i, rVar);
    }

    @Override // com.github.catvod.spider.merge.z.r, com.github.catvod.spider.merge.D.b
    public final Object a(com.github.catvod.spider.merge.Q.c cVar) {
        int size;
        if (!(cVar instanceof com.github.catvod.spider.merge.Q.c)) {
            return cVar.d(this);
        }
        cVar.getClass();
        com.github.catvod.spider.merge.N.e eVar = new com.github.catvod.spider.merge.N.e();
        for (com.github.catvod.spider.merge.L.l lVar : cVar.a().a) {
            Stack stack = cVar.a;
            com.github.catvod.spider.merge.Q.a aVar = new com.github.catvod.spider.merge.Q.a(lVar);
            aVar.c = cVar.a();
            stack.push(aVar);
            com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) ((h) e(h.class)).a(cVar);
            stack.pop();
            Object obj = bVar.a;
            if (obj instanceof Number) {
                long jLongValue = bVar.d().longValue();
                if (jLongValue < 0) {
                    String str = lVar.d.a;
                    if (str == "JX_TEXT" || (str != null && str.equals("JX_TEXT"))) {
                        String strC = lVar.c("EL_SAME_TAG_ALL_NUM");
                        size = com.github.catvod.spider.merge.E.c.a(strC) ? -1 : Integer.parseInt(strC);
                    } else {
                        com.github.catvod.spider.merge.Q.a aVarA = cVar.a();
                        com.github.catvod.spider.merge.N.e eVar2 = new com.github.catvod.spider.merge.N.e();
                        com.github.catvod.spider.merge.L.l lVar2 = (com.github.catvod.spider.merge.L.l) lVar.a;
                        String str2 = lVar.d.a;
                        lVar2.getClass();
                        com.github.catvod.spider.merge.J.b.d(str2);
                        com.github.catvod.spider.merge.N.g gVar = new com.github.catvod.spider.merge.N.g(com.github.catvod.spider.merge.R.f.b(str2), 9, false);
                        com.github.catvod.spider.merge.N.e<com.github.catvod.spider.merge.L.l> eVar3 = new com.github.catvod.spider.merge.N.e();
                        com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.N.a(lVar2, eVar3, gVar), lVar2);
                        for (com.github.catvod.spider.merge.L.l lVar3 : eVar3) {
                            if (aVarA.a.contains(lVar3)) {
                                eVar2.add(lVar3);
                            }
                        }
                        size = eVar2.size();
                    }
                    long j = ((long) size) + jLongValue;
                    jLongValue = 1;
                    long j2 = j + 1;
                    if (j2 >= 0) {
                        jLongValue = j2;
                    }
                }
                String str3 = lVar.d.a;
                if (str3 == "JX_TEXT" || (str3 != null && str3.equals("JX_TEXT"))) {
                    if (jLongValue == (com.github.catvod.spider.merge.E.c.a(lVar.c("EL_SAME_TAG_INDEX")) ? -1 : Integer.parseInt(r7))) {
                        eVar.add(lVar);
                    }
                } else {
                    com.github.catvod.spider.merge.Q.a aVarA2 = cVar.a();
                    int i = 1;
                    for (com.github.catvod.spider.merge.L.l lVar4 : ((com.github.catvod.spider.merge.L.l) lVar.a).A()) {
                        if (lVar.d.a.equals(lVar4.d.a) && aVarA2.a.contains(lVar4)) {
                            if (lVar.equals(lVar4)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (jLongValue == i) {
                        eVar.add(lVar);
                    }
                }
            } else if (obj instanceof Boolean) {
                if (bVar.a().booleanValue()) {
                    eVar.add(lVar);
                }
            } else if (obj instanceof String) {
                if (!com.github.catvod.spider.merge.E.c.a(bVar.e())) {
                    eVar.add(lVar);
                }
            } else if (!(obj instanceof com.github.catvod.spider.merge.N.e)) {
                if (!(obj instanceof List)) {
                    throw new com.github.catvod.spider.merge.I.a("unknown expr val:" + bVar);
                }
                if (((List) obj).size() > 0) {
                    eVar.add(lVar);
                }
            } else if (((com.github.catvod.spider.merge.N.e) obj).size() > 0) {
                eVar.add(lVar);
            }
        }
        return new com.github.catvod.spider.merge.Q.b(eVar);
    }
}
