package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.UY.v;
import com.github.catvod.spider.merge.VE.h;
import com.github.catvod.spider.merge.XI.p;
import com.github.catvod.spider.merge.ZrJ;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g implements com.github.catvod.spider.merge.Wb.d {
    @Override // com.github.catvod.spider.merge.Wb.d
    public final com.github.catvod.spider.merge.Wb.f a(com.github.catvod.spider.merge.Wb.e eVar) {
        Integer num;
        C0724g c0724gA = eVar.a();
        C0724g c0724g = new C0724g();
        HashMap map = new HashMap();
        if (c0724gA != null && c0724gA.size() > 0) {
            if (eVar.f()) {
                Iterator<m> it = c0724gA.iterator();
                while (it.hasNext()) {
                    p.b(new f(map, c0724g), it.next());
                }
                for (m mVar : c0724g) {
                    String strC = mVar.c(ZrJ.d("3C0F14090D152D0B"));
                    if (h.d(strC) && (num = (Integer) map.get(strC)) != null) {
                        com.github.catvod.spider.merge.Bk.p.f(mVar, num.intValue());
                    }
                }
            } else {
                for (m mVar2 : c0724gA) {
                    boolean zEquals = ZrJ.d("0A2039243831").equals(mVar2.s());
                    String strD = ZrJ.d("331B14190D1D2D");
                    if (zEquals) {
                        m mVar3 = new m(strD);
                        mVar3.u0(mVar2.X());
                        com.github.catvod.spider.merge.Bk.p.e(mVar3, 1);
                        com.github.catvod.spider.merge.Bk.p.f(mVar3, 1);
                        c0724g.add(mVar3);
                    } else {
                        List<v> listW0 = mVar2.w0();
                        int i = 0;
                        while (i < listW0.size()) {
                            v vVar = listW0.get(i);
                            m mVar4 = new m(strD);
                            mVar4.u0(vVar.L());
                            i++;
                            com.github.catvod.spider.merge.Bk.p.e(mVar4, i);
                            com.github.catvod.spider.merge.Bk.p.f(mVar4, listW0.size());
                            c0724g.add(mVar4);
                        }
                    }
                }
            }
        }
        return new com.github.catvod.spider.merge.Wb.f(c0724g);
    }

    @Override // com.github.catvod.spider.merge.Wb.d
    public final String name() {
        return ZrJ.d("0D263339");
    }
}
