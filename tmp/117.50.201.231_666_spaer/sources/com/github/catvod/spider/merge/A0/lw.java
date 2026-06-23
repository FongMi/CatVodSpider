package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lw implements vq, Cloneable {
    public static final lw b = new lw();
    public final List c = Collections.emptyList();
    public final List d = Collections.emptyList();

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        Class cls = fjVar.a;
        boolean zE = e(cls, true);
        boolean zE2 = e(cls, false);
        if (zE || zE2) {
            return new mb(this, zE2, zE, oaVar, fjVar);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (lw) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean e(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            acs acsVar = ce.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.c : this.d).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
