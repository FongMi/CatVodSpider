package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class su extends kv {
    public final /* synthetic */ int a = 0;
    public final Object d;
    public final Object e;

    public su(oa oaVar, Type type, kv kvVar, ub ubVar) {
        this.d = new nx(oaVar, kvVar, type);
        this.e = ubVar;
    }

    public su(wv wvVar, Class cls) {
        this.e = wvVar;
        this.d = cls;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        switch (this.a) {
            case 0:
                if (rdVar.ak() == 9) {
                    rdVar.ag();
                    return null;
                }
                Collection collection = (Collection) ((ub) this.e).m();
                rdVar.p();
                while (rdVar.x()) {
                    collection.add(((kv) ((nx) this.d).e).b(rdVar));
                }
                rdVar.t();
                return collection;
            default:
                Object objB = ((wv) this.e).d.b(rdVar);
                if (objB != null) {
                    Class cls = (Class) this.d;
                    if (!cls.isInstance(objB)) {
                        throw new yc("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + rdVar.w(true));
                    }
                }
                return objB;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    aagVar.p();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((nx) this.d).c(aagVar, it.next());
                    }
                    aagVar.s();
                } else {
                    aagVar.w();
                }
                break;
            default:
                ((wv) this.e).d.c(aagVar, obj);
                break;
        }
    }
}
