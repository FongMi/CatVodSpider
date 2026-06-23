package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gr implements vq {
    public final xg b;
    public final fc c;
    public final lw d;
    public final ap e;
    public final List f;

    public gr(xg xgVar, fc fcVar, lw lwVar, ap apVar, List list) {
        this.b = xgVar;
        this.c = fcVar;
        this.d = lwVar;
        this.e = apVar;
        this.f = list;
    }

    public static void g(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ce.d(field) + " and " + ce.d(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        Class cls = fjVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        acs acsVar = ce.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new bz(2);
        }
        zb.b(this.f);
        return ce.a.d(cls) ? new rc(cls, h(oaVar, fjVar, cls, true)) : new kp(this.b.e(fjVar), h(oaVar, fjVar, cls, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.vg h(com.github.catvod.spider.merge.A0.oa r31, com.github.catvod.spider.merge.A0.fj r32, java.lang.Class r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.gr.h(com.github.catvod.spider.merge.A0.oa, com.github.catvod.spider.merge.A0.fj, java.lang.Class, boolean):com.github.catvod.spider.merge.A0.vg");
    }

    public final boolean i(Field field, boolean z) {
        boolean z2;
        lw lwVar = this.d;
        lwVar.getClass();
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || lwVar.e(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? lwVar.c : lwVar.d;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
