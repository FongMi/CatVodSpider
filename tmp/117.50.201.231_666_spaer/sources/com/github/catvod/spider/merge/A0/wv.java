package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class wv implements vq {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ kv d;

    public /* synthetic */ wv(Object obj, kv kvVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = kvVar;
    }

    @Override // com.github.catvod.spider.merge.A0.vq
    public final kv a(oa oaVar, fj fjVar) {
        switch (this.b) {
            case 0:
                if (fjVar.a == ((Class) this.c)) {
                    return this.d;
                }
                return null;
            case 1:
                Class<?> cls = fjVar.a;
                if (((Class) this.c).isAssignableFrom(cls)) {
                    return new su(this, cls);
                }
                return null;
            default:
                if (fjVar.equals((fj) this.c)) {
                    return this.d;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "Factory[type=" + ((Class) this.c).getName() + ",adapter=" + this.d + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.c).getName() + ",adapter=" + this.d + "]";
            default:
                return super.toString();
        }
    }
}
