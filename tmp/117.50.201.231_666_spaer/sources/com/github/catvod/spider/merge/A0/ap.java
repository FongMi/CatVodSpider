package com.github.catvod.spider.merge.A0;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ap implements vq {
    public static final ao b;
    public static final ao c;
    public final xg d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    static {
        int i = 0;
        b = new ao(i);
        c = new ao(i);
    }

    public ap(xg xgVar) {
        this.d = xgVar;
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        kd kdVar = (kd) fjVar.a.getAnnotation(kd.class);
        if (kdVar == null) {
            return null;
        }
        return f(this.d, oaVar, fjVar, kdVar, true);
    }

    public final kv f(xg xgVar, oa oaVar, fj fjVar, kd kdVar, boolean z) {
        kv luVar;
        Object objM = xgVar.e(new fj(kdVar.value())).m();
        boolean zNullSafe = kdVar.nullSafe();
        if (objM instanceof kv) {
            luVar = (kv) objM;
        } else if (objM instanceof vq) {
            vq vqVar = (vq) objM;
            if (z) {
                vq vqVar2 = (vq) this.e.putIfAbsent(fjVar.a, vqVar);
                if (vqVar2 != null) {
                    vqVar = vqVar2;
                }
            }
            luVar = vqVar.a(oaVar, fjVar);
        } else {
            boolean z2 = objM instanceof ch;
            if (!z2 && !(objM instanceof aav)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objM.getClass().getName() + " as a @JsonAdapter for " + po.i(fjVar.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            luVar = new lu(z2 ? (ch) objM : null, objM instanceof aav ? (aav) objM : null, oaVar, fjVar, z ? b : c, zNullSafe);
            zNullSafe = false;
        }
        return (luVar == null || !zNullSafe) ? luVar : new rv(2, luVar);
    }
}
