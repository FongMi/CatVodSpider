package com.github.catvod.spider.merge.A0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ft extends cc implements acp {
    private volatile ft _immediate;
    public final ft a;
    public final Handler b;
    public final boolean f;

    public ft(Handler handler, boolean z) {
        this.b = handler;
        this.f = z;
        this._immediate = z ? this : null;
        ft ftVar = this._immediate;
        if (ftVar == null) {
            ftVar = new ft(handler, true);
            this._immediate = ftVar;
        }
        this.a = ftVar;
    }

    @Override // com.github.catvod.spider.merge.A0.acp
    public final adh c(long j, az azVar, yg ygVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        this.b.postDelayed(azVar, j);
        return new qt(this, azVar);
    }

    @Override // com.github.catvod.spider.merge.A0.acp
    public final void d(long j, sa saVar) {
        ca caVar = new ca(this, saVar);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        this.b.postDelayed(caVar, j);
        saVar.u(new un(this, caVar));
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final void e(yg ygVar, acw acwVar) {
        this.b.post(acwVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ft) && ((ft) obj).b == this.b;
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final boolean g() {
        return (this.f && ko.b(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // com.github.catvod.spider.merge.A0.ym
    public final String toString() {
        ft ftVar;
        String str;
        mj mjVar = adg.a;
        cc ccVar = abu.a;
        if (this == ccVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                ftVar = ((ft) ccVar).a;
            } catch (UnsupportedOperationException unused) {
                ftVar = null;
            }
            str = this == ftVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.b.toString();
        if (!this.f) {
            return string;
        }
        return string + ".immediate";
    }
}
