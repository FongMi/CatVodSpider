package com.github.catvod.spider.merge.FM.T;

import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.U.C0293a;
import com.github.catvod.spider.merge.FM.U.D;
import com.github.catvod.spider.merge.FM.V.f;
import com.github.catvod.spider.merge.FM.V.g;
import com.github.catvod.spider.merge.FM.x.C0438e;
import com.github.catvod.spider.merge.FM.x.C0447n;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    private C0274g a;

    public a(C0274g c0274g) {
        this.a = c0274g;
    }

    public final List<b> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            D d = new D(new C0447n(new C0293a(C0438e.b(str))));
            d.t(new com.github.catvod.spider.merge.FM.Z.a());
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
            StringBuilder sbB = P.b("Please check the syntax of your xpath expr or commit a ");
            sbB.append(com.github.catvod.spider.merge.FM.E.a.c(e));
            throw new com.github.catvod.spider.merge.FM.H.a(sbB.toString(), e);
        }
    }
}
