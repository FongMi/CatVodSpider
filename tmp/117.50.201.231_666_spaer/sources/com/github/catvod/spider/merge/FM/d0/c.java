package com.github.catvod.spider.merge.FM.d0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c implements com.github.catvod.spider.merge.FM.b0.b {
    private final String a;
    private volatile com.github.catvod.spider.merge.FM.b0.b b;
    private Boolean c;
    private Method d;
    private com.github.catvod.spider.merge.FM.c0.a e;
    private Queue<com.github.catvod.spider.merge.FM.c0.c> f;
    private final boolean g;

    public c(String str, Queue<com.github.catvod.spider.merge.FM.c0.c> queue, boolean z) {
        this.a = str;
        this.f = queue;
        this.g = z;
    }

    @Override // com.github.catvod.spider.merge.FM.b0.b
    public final void a(String str, Throwable th) {
        com.github.catvod.spider.merge.FM.b0.b bVar;
        if (this.b != null) {
            bVar = this.b;
        } else if (this.g) {
            bVar = b.a;
        } else {
            if (this.e == null) {
                this.e = new com.github.catvod.spider.merge.FM.c0.a(this, this.f);
            }
            bVar = this.e;
        }
        bVar.a(str, th);
    }

    public final boolean b() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", com.github.catvod.spider.merge.FM.c0.b.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public final boolean c() {
        return this.b instanceof b;
    }

    public final boolean d() {
        return this.b == null;
    }

    public final void e(com.github.catvod.spider.merge.FM.c0.b bVar) {
        if (b()) {
            try {
                this.d.invoke(this.b, bVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a.equals(((c) obj).a);
    }

    public final void f(com.github.catvod.spider.merge.FM.b0.b bVar) {
        this.b = bVar;
    }

    @Override // com.github.catvod.spider.merge.FM.b0.b
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
