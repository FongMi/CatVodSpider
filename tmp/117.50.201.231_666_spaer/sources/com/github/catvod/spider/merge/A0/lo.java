package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class lo extends kv {
    public final vg g;

    public lo(vg vgVar) {
        this.g = vgVar;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        if (rdVar.ak() == 9) {
            rdVar.ag();
            return null;
        }
        Object objD = d();
        Map map = this.g.b;
        try {
            rdVar.q();
            while (rdVar.x()) {
                jv jvVar = (jv) map.get(rdVar.ae());
                if (jvVar == null) {
                    rdVar.ar();
                } else {
                    f(objD, rdVar, jvVar);
                }
            }
            rdVar.u();
            return e(objD);
        } catch (IllegalAccessException e) {
            acs acsVar = ce.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new yc(e2);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        if (obj == null) {
            aagVar.w();
            return;
        }
        aagVar.q();
        try {
            Iterator it = this.g.c.iterator();
            while (it.hasNext()) {
                ((jv) it.next()).i(aagVar, obj);
            }
            aagVar.t();
        } catch (IllegalAccessException e) {
            acs acsVar = ce.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, rd rdVar, jv jvVar);
}
