package com.github.catvod.spider.merge.P1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c implements com.github.catvod.spider.merge.N1.b {
    private final String b;
    private volatile com.github.catvod.spider.merge.N1.b c;
    private Boolean d;
    private Method e;
    private com.github.catvod.spider.merge.O1.a f;
    private Queue<com.github.catvod.spider.merge.O1.c> g;
    private final boolean h;

    public c(String str, Queue<com.github.catvod.spider.merge.O1.c> queue, boolean z) {
        this.b = str;
        this.g = queue;
        this.h = z;
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void a(String str, Object obj) {
        g().a(str, obj);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void b(String str, Object obj) {
        g().b(str, obj);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void c(String str, Object obj, Object obj2) {
        g().c(str, obj, obj2);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void d(String str, Object... objArr) {
        g().d(str, objArr);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void e(String str, Object obj) {
        g().e(str, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.b.equals(((c) obj).b);
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final void f(Object... objArr) {
        g().f(objArr);
    }

    final com.github.catvod.spider.merge.N1.b g() {
        if (this.c != null) {
            return this.c;
        }
        if (this.h) {
            return b.b;
        }
        if (this.f == null) {
            this.f = new com.github.catvod.spider.merge.O1.a(this, this.g);
        }
        return this.f;
    }

    @Override // com.github.catvod.spider.merge.N1.b
    public final String getName() {
        return this.b;
    }

    public final boolean h() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.e = this.c.getClass().getMethod("log", com.github.catvod.spider.merge.O1.b.class);
            this.d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.d = Boolean.FALSE;
        }
        return this.d.booleanValue();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        return this.c instanceof b;
    }

    public final boolean j() {
        return this.c == null;
    }

    public final void k(com.github.catvod.spider.merge.O1.b bVar) {
        if (h()) {
            try {
                this.e.invoke(this.c, bVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final void l(com.github.catvod.spider.merge.N1.b bVar) {
        this.c = bVar;
    }
}
