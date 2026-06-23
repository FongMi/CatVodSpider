package com.github.catvod.spider.merge.A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class pb extends bi implements xl, yq {
    public final yg ak;
    public final yg al;

    public pb(yg ygVar, boolean z) {
        super(z);
        this.al = ygVar;
        this.ak = ygVar.plus(this);
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final void ad(Object obj) {
        if (obj instanceof tt) {
            Throwable th = ((tt) obj).c;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final void ae() {
        an();
    }

    public final void am() {
        x((nr) this.al.get(nr.aj));
    }

    public void an() {
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public String b() {
        boolean z = yj.a;
        return super.b();
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final yg getContext() {
        return this.ak;
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final String l() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // com.github.catvod.spider.merge.A0.xl
    public final void resumeWith(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thB = vx.b(obj);
        if (thB != null) {
            obj = new tt(thB, false);
        }
        Object objAa = aa(obj);
        if (objAa == xj.b) {
            return;
        }
        i(objAa);
    }

    @Override // com.github.catvod.spider.merge.A0.bi
    public final void w(tv tvVar) {
        bj.a(this.ak, tvVar);
    }
}
