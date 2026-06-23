package com.github.catvod.spider.merge.FM.Y;

import com.github.catvod.spider.merge.FM.A.p;
import com.github.catvod.spider.merge.FM.C.h;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.K.v;
import com.github.catvod.spider.merge.FM.M.C0274g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class g implements com.github.catvod.spider.merge.FM.V.d {
    @Override // com.github.catvod.spider.merge.FM.V.d
    public final com.github.catvod.spider.merge.FM.V.f a(com.github.catvod.spider.merge.FM.V.e eVar) {
        Integer num;
        C0274g c0274gA = eVar.a();
        C0274g c0274g = new C0274g();
        HashMap map = new HashMap();
        if (c0274gA != null && c0274gA.size() > 0) {
            if (eVar.f()) {
                Iterator<m> it = c0274gA.iterator();
                while (it.hasNext()) {
                    com.github.catvod.spider.merge.FM.E.a.d(new f(map, c0274g), it.next());
                }
                for (m mVar : c0274g) {
                    String strC = mVar.c("EL_DEPTH");
                    if (h.d(strC) && (num = (Integer) map.get(strC)) != null) {
                        p.f(mVar, num.intValue());
                    }
                }
            } else {
                for (m mVar2 : c0274gA) {
                    if ("script".equals(mVar2.s())) {
                        m mVar3 = new m("JX_TEXT");
                        mVar3.u0(mVar2.X());
                        p.e(mVar3, 1);
                        p.f(mVar3, 1);
                        c0274g.add(mVar3);
                    } else {
                        List<v> listW0 = mVar2.w0();
                        int i = 0;
                        while (i < listW0.size()) {
                            v vVar = listW0.get(i);
                            m mVar4 = new m("JX_TEXT");
                            mVar4.u0(vVar.L());
                            i++;
                            p.e(mVar4, i);
                            p.f(mVar4, listW0.size());
                            c0274g.add(mVar4);
                        }
                    }
                }
            }
        }
        return new com.github.catvod.spider.merge.FM.V.f(c0274g);
    }

    @Override // com.github.catvod.spider.merge.FM.V.d
    public final String name() {
        return "text";
    }
}
