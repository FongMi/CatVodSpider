package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.G.i;
import com.github.catvod.spider.merge.G.m;
import com.github.catvod.spider.merge.G.p;
import com.github.catvod.spider.merge.m.C0595d;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class f implements com.github.catvod.spider.merge.L.d {

    final class a implements com.github.catvod.spider.merge.I.e {
        final /* synthetic */ Map a;
        final /* synthetic */ com.github.catvod.spider.merge.I.c b;

        a(Map map, com.github.catvod.spider.merge.I.c cVar) {
            this.a = map;
            this.b = cVar;
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void a(m mVar, int i) {
        }

        @Override // com.github.catvod.spider.merge.I.e
        public final void b(m mVar, int i) {
            if (mVar instanceof p) {
                p pVar = (p) mVar;
                String str = i + "_" + pVar.z().hashCode();
                Integer num = (Integer) this.a.get(str);
                Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
                this.a.put(str, numValueOf);
                i iVar = new i("JX_TEXT");
                iVar.s0(pVar.L());
                iVar.c("EL_DEPTH", str);
                try {
                    Method declaredMethod = m.class.getDeclaredMethod("setParentNode", m.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(iVar, pVar.z());
                } catch (Exception unused) {
                }
                C0595d.d(iVar, numValueOf.intValue());
                this.b.add(iVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.L.d
    public final com.github.catvod.spider.merge.L.f a(com.github.catvod.spider.merge.L.e eVar) {
        Integer num;
        com.github.catvod.spider.merge.I.c cVarA = eVar.a();
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        HashMap map = new HashMap();
        if (cVarA != null && cVarA.size() > 0) {
            if (eVar.f()) {
                Iterator<i> it = cVarA.iterator();
                while (it.hasNext()) {
                    com.github.catvod.spider.merge.F.a.g(new a(map, cVar), it.next());
                }
                for (i iVar : cVar) {
                    String strD = iVar.d("EL_DEPTH");
                    if (com.github.catvod.spider.merge.y.f.d(strD) && (num = (Integer) map.get(strD)) != null) {
                        C0595d.e(iVar, num.intValue());
                    }
                }
            } else {
                for (i iVar2 : cVarA) {
                    if ("script".equals(iVar2.t())) {
                        i iVar3 = new i("JX_TEXT");
                        iVar3.s0(iVar2.X());
                        C0595d.d(iVar3, 1);
                        C0595d.e(iVar3, 1);
                        cVar.add(iVar3);
                    } else {
                        List<p> listU0 = iVar2.u0();
                        int i = 0;
                        while (i < listU0.size()) {
                            p pVar = listU0.get(i);
                            i iVar4 = new i("JX_TEXT");
                            iVar4.s0(pVar.L());
                            i++;
                            C0595d.d(iVar4, i);
                            C0595d.e(iVar4, listU0.size());
                            cVar.add(iVar4);
                        }
                    }
                }
            }
        }
        return new com.github.catvod.spider.merge.L.f(cVar);
    }

    @Override // com.github.catvod.spider.merge.L.d
    public final String name() {
        return "text";
    }
}
