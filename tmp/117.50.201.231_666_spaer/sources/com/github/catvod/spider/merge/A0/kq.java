package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class kq extends kv {
    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        rdVar.p();
        while (rdVar.x()) {
            try {
                arrayList.add(Integer.valueOf(rdVar.ac()));
            } catch (NumberFormatException e) {
                throw new yc(e);
            }
        }
        rdVar.t();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        aagVar.p();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            aagVar.ac(r6.get(i));
        }
        aagVar.s();
    }
}
