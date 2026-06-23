package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class qa extends kv {
    public static final pz a = new pz();
    public final Class d;
    public final nx e;

    public qa(oa oaVar, kv kvVar, Class cls) {
        this.e = new nx(oaVar, kvVar, cls);
        this.d = cls;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        rdVar.p();
        while (rdVar.x()) {
            arrayList.add(((kv) this.e.e).b(rdVar));
        }
        rdVar.t();
        int size = arrayList.size();
        Class cls = this.d;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.w();
            return;
        }
        aagVar.p();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.e.c(aagVar, Array.get(obj, i));
        }
        aagVar.s();
    }
}
