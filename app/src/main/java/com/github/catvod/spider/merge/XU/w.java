package com.github.catvod.spider.merge.XU;

import com.github.catvod.spider.merge.CQ.D;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import com.github.catvod.spider.merge.yZ.C1440e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class w {
    private C0724g a;

    public w(C0724g c0724g) {
        this.a = c0724g;
    }

    public final List<x> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            D d = new D(new com.github.catvod.spider.merge.yZ.n(new com.github.catvod.spider.merge.CQ.a(C1440e.b(str))));
            d.t(new a());
            com.github.catvod.spider.merge.Wb.f fVar = (com.github.catvod.spider.merge.Wb.f) d.F().b(new com.github.catvod.spider.merge.Wb.g(this.a));
            if (fVar == null) {
                linkedList.add(new x(""));
                return linkedList;
            }
            if (fVar.n()) {
                Iterator<com.github.catvod.spider.merge.UY.m> it = fVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new x(it.next()));
                }
                return linkedList;
            }
            if (fVar.p()) {
                Iterator<String> it2 = fVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new x(it2.next()));
                }
                return linkedList;
            }
            if (fVar.r()) {
                linkedList.add(new x(fVar.g()));
                return linkedList;
            }
            if (fVar.q()) {
                Class clsS = fVar.s();
                linkedList.add((clsS.isAssignableFrom(Long.class) || clsS.isAssignableFrom(Integer.class)) ? new x(fVar.f()) : new x(fVar.c()));
                return linkedList;
            }
            if (fVar.l()) {
                linkedList.add(new x(fVar.a()));
                return linkedList;
            }
            if (fVar.m()) {
                linkedList.add(new x(fVar.b()));
                return linkedList;
            }
            linkedList.add(new x(fVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbB = C0925t.b(ZrJ.d("292F2E2C3B20592023282B2E593723286836002D3F2C306516256B3427300B63333D293111632E353837592C396D2B2A142E2239682459"));
            sbB.append(com.github.catvod.spider.merge.XI.p.a(e));
            throw new com.github.catvod.spider.merge.XI.v(sbB.toString(), e);
        }
    }
}
