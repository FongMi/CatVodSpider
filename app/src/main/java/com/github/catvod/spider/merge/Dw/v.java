package com.github.catvod.spider.merge.Dw;

import com.github.catvod.spider.merge.ej.C1061g;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class v {
    private C1061g a;

    public v(C1061g c1061g) {
        this.a = c1061g;
    }

    public final List<com.github.catvod.spider.merge.fb.b> a(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            com.github.catvod.spider.merge.gu.e eVarB = com.github.catvod.spider.merge.gu.f.b(str.length());
            CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
            charBufferAllocate.put(str);
            charBufferAllocate.flip();
            eVarB.a(charBufferAllocate);
            w wVar = new w(new com.github.catvod.spider.merge.gu.m(new com.github.catvod.spider.merge.gu.a(com.github.catvod.spider.merge.gu.j.k(eVarB.d()))));
            wVar.v(new com.github.catvod.spider.merge.lq.a());
            com.github.catvod.spider.merge.h0.e eVar = (com.github.catvod.spider.merge.h0.e) wVar.H().e(new com.github.catvod.spider.merge.h0.f(this.a));
            if (eVar.n()) {
                Iterator<com.github.catvod.spider.merge.Em.l> it = eVar.d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.fb.b(it.next()));
                }
                return linkedList;
            }
            if (eVar.p()) {
                Iterator it2 = eVar.e().iterator();
                while (it2.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.fb.b((String) it2.next()));
                }
                return linkedList;
            }
            if (eVar.r()) {
                linkedList.add(new com.github.catvod.spider.merge.fb.b(eVar.g()));
                return linkedList;
            }
            if (eVar.q()) {
                linkedList.add(new com.github.catvod.spider.merge.fb.b(eVar.c()));
                return linkedList;
            }
            if (eVar.l()) {
                linkedList.add(new com.github.catvod.spider.merge.fb.b(eVar.a()));
                return linkedList;
            }
            if (eVar.m()) {
                linkedList.add(new com.github.catvod.spider.merge.fb.b(eVar.b()));
                return linkedList;
            }
            linkedList.add(new com.github.catvod.spider.merge.fb.b(eVar.g()));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("Please check the syntax of your xpath expr or commit a ");
            sbB.append(q.b(e));
            throw new g(sbB.toString(), e);
        }
    }
}
