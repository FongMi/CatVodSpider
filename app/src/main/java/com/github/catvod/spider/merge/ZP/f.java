package com.github.catvod.spider.merge.ZP;

import com.github.catvod.spider.merge.Bk.p;
import com.github.catvod.spider.merge.HR.C0724g;
import com.github.catvod.spider.merge.HR.O;
import com.github.catvod.spider.merge.UY.m;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.UY.v;
import com.github.catvod.spider.merge.ZrJ;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class f implements O {
    final /* synthetic */ Map a;
    final /* synthetic */ C0724g b;

    f(Map map, C0724g c0724g) {
        this.a = map;
        this.b = c0724g;
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void a(s sVar, int i) {
        if (sVar instanceof v) {
            v vVar = (v) sVar;
            String str = i + ZrJ.d("26") + vVar.y().hashCode();
            Integer num = (Integer) this.a.get(str);
            Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.a.put(str, numValueOf);
            m mVar = new m(ZrJ.d("331B14190D1D2D"));
            mVar.u0(vVar.L());
            mVar.R(ZrJ.d("3C0F14090D152D0B"), str);
            try {
                Method declaredMethod = s.class.getDeclaredMethod(ZrJ.d("0A263F1D29371C2D3F0327211C"), s.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(mVar, vVar.y());
            } catch (Exception unused) {
            }
            p.e(mVar, numValueOf.intValue());
            this.b.add(mVar);
        }
    }

    @Override // com.github.catvod.spider.merge.HR.O
    public final void b(s sVar, int i) {
    }
}
