package com.github.catvod.spider.merge.f1;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1164o {
    final Class<?> a;
    final Object b;

    public C1164o(Class<?> cls, Object obj) {
        this.a = cls;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1164o) {
            Class<?> cls = this.a;
            C1164o c1164o = (C1164o) obj;
            Class<?> cls2 = c1164o.a;
            if (cls == cls2 || (cls != null && cls.equals(cls2))) {
                Object obj2 = this.b;
                Object obj3 = c1164o.b;
                if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Object obj = this.b;
        return obj != null ? obj.hashCode() * 31 : iHashCode;
    }
}
