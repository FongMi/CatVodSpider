package com.github.catvod.spider.merge.FM.Y;

import com.github.catvod.spider.merge.FM.A.p;
import com.github.catvod.spider.merge.FM.K.m;
import com.github.catvod.spider.merge.FM.K.s;
import com.github.catvod.spider.merge.FM.K.v;
import com.github.catvod.spider.merge.FM.M.C0274g;
import com.github.catvod.spider.merge.FM.M.O;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class f implements O {
    final /* synthetic */ Map a;
    final /* synthetic */ C0274g b;

    f(Map map, C0274g c0274g) {
        this.a = map;
        this.b = c0274g;
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void a(s sVar, int i) {
    }

    @Override // com.github.catvod.spider.merge.FM.M.O
    public final void b(s sVar, int i) {
        if (sVar instanceof v) {
            v vVar = (v) sVar;
            String str = i + "_" + vVar.y().hashCode();
            Integer num = (Integer) this.a.get(str);
            Integer numValueOf = num == null ? 1 : Integer.valueOf(num.intValue() + 1);
            this.a.put(str, numValueOf);
            m mVar = new m("JX_TEXT");
            mVar.u0(vVar.L());
            mVar.R("EL_DEPTH", str);
            try {
                Method declaredMethod = s.class.getDeclaredMethod("setParentNode", s.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(mVar, vVar.y());
            } catch (Exception unused) {
            }
            p.e(mVar, numValueOf.intValue());
            this.b.add(mVar);
        }
    }
}
