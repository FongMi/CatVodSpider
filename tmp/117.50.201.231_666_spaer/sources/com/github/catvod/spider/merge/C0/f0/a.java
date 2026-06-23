package com.github.catvod.spider.merge.C0.f0;

import com.github.catvod.spider.merge.C0.P.e;
import com.github.catvod.spider.merge.C0.P.f;
import com.github.catvod.spider.merge.C0.P.j;
import com.github.catvod.spider.merge.C0.P.m;
import com.github.catvod.spider.merge.C0.c0.l;
import com.github.catvod.spider.merge.C0.d.d;
import com.github.catvod.spider.merge.C0.e0.C0180g;
import com.github.catvod.spider.merge.C0.g0.D;
import com.github.catvod.spider.merge.C0.l.u;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class a {
    private C0180g a;

    public a(C0180g c0180g) {
        this.a = c0180g;
    }

    public final List<b> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            e eVarB = f.b(str.length());
            CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
            charBufferAllocate.put(str);
            charBufferAllocate.flip();
            eVarB.a(charBufferAllocate);
            D d = new D(new m(new com.github.catvod.spider.merge.C0.g0.a(j.k(eVarB.d()))));
            d.v(new com.github.catvod.spider.merge.C0.l0.a());
            com.github.catvod.spider.merge.C0.h0.e eVar = (com.github.catvod.spider.merge.C0.h0.e) d.H().e(new com.github.catvod.spider.merge.C0.h0.f(this.a));
            if (eVar.n()) {
                Iterator<l> it = eVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new b(it.next()));
                }
                return linkedList;
            }
            if (eVar.p()) {
                Iterator it2 = eVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new b((String) it2.next()));
                }
                return linkedList;
            }
            if (eVar.r()) {
                linkedList.add(new b(eVar.g()));
                return linkedList;
            }
            if (eVar.q()) {
                linkedList.add(new b(eVar.c()));
                return linkedList;
            }
            if (eVar.l()) {
                linkedList.add(new b(eVar.a()));
                return linkedList;
            }
            if (eVar.m()) {
                linkedList.add(new b(eVar.b()));
                return linkedList;
            }
            linkedList.add(new b(eVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbB = d.b("Please check the syntax of your xpath expr or commit a ");
            sbB.append(com.github.catvod.spider.merge.C0.W.a.b(e));
            throw new u(sbB.toString(), e);
        }
    }
}
