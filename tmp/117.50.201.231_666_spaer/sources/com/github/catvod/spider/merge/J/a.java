package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.K.d;
import com.github.catvod.spider.merge.L.f;
import com.github.catvod.spider.merge.L.g;
import com.github.catvod.spider.merge.a.C0529a;
import com.github.catvod.spider.merge.t.C0628e;
import com.github.catvod.spider.merge.t.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    private c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public static a a(String str) {
        return new a(com.github.catvod.spider.merge.D.a.a(str).V());
    }

    public final List<b> b(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            d dVar = new d(new k(new com.github.catvod.spider.merge.K.b(C0628e.a(str))));
            dVar.s(new com.github.catvod.spider.merge.P.a());
            f fVar = (f) dVar.E().a(new g(this.a));
            if (fVar == null) {
                linkedList.add(new b(""));
                return linkedList;
            }
            if (fVar.n()) {
                Iterator<i> it = fVar.d().iterator();
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
            StringBuilder sbA = C0529a.a("Please check the syntax of your xpath expr or commit a ");
            sbA.append(com.github.catvod.spider.merge.A.a.b(e));
            throw new com.github.catvod.spider.merge.D.b(sbA.toString(), e);
        }
    }
}
