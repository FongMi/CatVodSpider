package com.github.catvod.spider.merge.Z;

import com.github.catvod.spider.merge.B.p;
import com.github.catvod.spider.merge.L.m;
import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.L.v;
import com.github.catvod.spider.merge.N.C0074g;
import com.github.catvod.spider.merge.N.O;
import com.github.catvod.spider.merge.oZP;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class f implements O {
    final /* synthetic */ Map a;
    final /* synthetic */ C0074g b;

    f(Map map, C0074g c0074g) {
        this.a = map;
        this.b = c0074g;
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void a(s sVar, int i) {
        if (sVar instanceof v) {
            v vVar = (v) sVar;
            String str = i + oZP.d("2A") + vVar.y().hashCode();
            Integer num = (Integer) this.a.get(str);
            Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.a.put(str, numValueOf);
            m mVar = new m(oZP.d("3F372815290D21"));
            mVar.u0(vVar.L());
            mVar.R(oZP.d("3023280529052127"), str);
            try {
                Method declaredMethod = s.class.getDeclaredMethod(oZP.d("060A03110D271001030F033110"), s.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(mVar, vVar.y());
            } catch (Exception unused) {
            }
            p.e(mVar, numValueOf.intValue());
            this.b.add(mVar);
        }
    }

    @Override // com.github.catvod.spider.merge.N.O
    public final void b(s sVar, int i) {
    }
}
