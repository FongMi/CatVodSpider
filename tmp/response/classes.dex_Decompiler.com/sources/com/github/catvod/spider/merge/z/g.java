package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.D.h;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.L.v;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.oZP;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class g implements com.github.catvod.spider.merge.W.d {
    @Override // com.github.catvod.spider.merge.W.d
    public final com.github.catvod.spider.merge.W.f a(com.github.catvod.spider.merge.W.e eVar) {
        Integer num;
        C0074g c0074gA = eVar.a();
        C0074g c0074g = new C0074g();
        HashMap map = new HashMap();
        if (c0074gA != null && c0074gA.size() > 0) {
            if (eVar.f()) {
                Iterator<m> it = c0074gA.iterator();
                while (it.hasNext()) {
                    com.github.catvod.spider.merge.F.a.b(new f(map, c0074g), it.next());
                }
                for (m mVar : c0074g) {
                    String strC = mVar.c(oZP.d("3023280529052127"));
                    if (h.d(strC) && (num = (Integer) map.get(strC)) != null) {
                        p.f(mVar, num.intValue());
                    }
                }
            } else {
                for (m mVar2 : c0074gA) {
                    boolean zEquals = oZP.d("060C05281C21").equals(mVar2.s());
                    String strD = oZP.d("3F372815290D21");
                    if (zEquals) {
                        m mVar3 = new m(strD);
                        mVar3.u0(mVar2.X());
                        p.e(mVar3, 1);
                        p.f(mVar3, 1);
                        c0074g.add(mVar3);
                    } else {
                        List<v> listW0 = mVar2.w0();
                        int i = 0;
                        while (i < listW0.size()) {
                            v vVar = listW0.get(i);
                            m mVar4 = new m(strD);
                            mVar4.u0(vVar.L());
                            i++;
                            p.e(mVar4, i);
                            p.f(mVar4, listW0.size());
                            c0074g.add(mVar4);
                        }
                    }
                }
            }
        }
        return new com.github.catvod.spider.merge.W.f(c0074g);
    }

    @Override // com.github.catvod.spider.merge.W.d
    public final String name() {
        return oZP.d("010A0F35");
    }
}
