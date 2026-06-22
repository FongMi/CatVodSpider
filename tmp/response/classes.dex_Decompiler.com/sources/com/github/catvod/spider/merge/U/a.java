package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.V.C0093a;
import com.github.catvod.spider.merge.V.D;
import com.github.catvod.spider.merge.W.f;
import com.github.catvod.spider.merge.W.g;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import com.github.catvod.spider.merge.y.C0261e;
import com.github.catvod.spider.merge.y.C0270n;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class a {
    private C0074g a;

    public a(C0074g c0074g) {
        this.a = c0074g;
    }

    public final List<b> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            D d = new D(new C0270n(new C0093a(C0261e.b(str))));
            d.t(new com.github.catvod.spider.merge.a0.a());
            f fVar = (f) d.F().b(new g(this.a));
            if (fVar == null) {
                linkedList.add(new b(""));
                return linkedList;
            }
            if (fVar.n()) {
                Iterator<m> it = fVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new b(it.next()));
                }
                return linkedList;
            }
            if (fVar.p()) {
                Iterator<String> it2 = fVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new b(it2.next()));
                }
                return linkedList;
            }
            if (fVar.r()) {
                linkedList.add(new b(fVar.g()));
                return linkedList;
            }
            if (fVar.q()) {
                Class clsS = fVar.s();
                linkedList.add((clsS.isAssignableFrom(Long.class) || clsS.isAssignableFrom(Integer.class)) ? new b(fVar.f()) : new b(fVar.c()));
                return linkedList;
            }
            if (fVar.l()) {
                linkedList.add(new b(fVar.a()));
                return linkedList;
            }
            if (fVar.m()) {
                linkedList.add(new b(fVar.b()));
                return linkedList;
            }
            linkedList.add(new b(fVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbC = C0133t.c(oZP.d("250312201F30550C1F240F3E551B1F244C260C01032014751A0957380320074F0F310D211D4F12391C27550005610F3A18021E354C3455"));
            sbC.append(com.github.catvod.spider.merge.F.a.a(e));
            throw new com.github.catvod.spider.merge.I.a(sbC.toString(), e);
        }
    }
}
