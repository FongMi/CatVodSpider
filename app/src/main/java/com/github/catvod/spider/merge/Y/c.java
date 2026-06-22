package com.github.catvod.spider.merge.Y;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class c implements com.github.catvod.spider.merge.W.a {
    public final String a;
    public volatile com.github.catvod.spider.merge.W.a b;
    public Boolean c;
    public Method d;
    public com.github.catvod.spider.merge.N.a e;
    public final Queue f;
    public final boolean g;

    public c(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    public final boolean a() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", com.github.catvod.spider.merge.X.a.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final void c(String str, Exception exc) {
        com.github.catvod.spider.merge.W.a aVar;
        if (this.b != null) {
            aVar = this.b;
        } else if (this.g) {
            aVar = a.a;
        } else {
            if (this.e == null) {
                this.e = new com.github.catvod.spider.merge.N.a(this, (LinkedBlockingQueue) this.f);
            }
            aVar = this.e;
        }
        aVar.c(str, exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a.equals(((c) obj).a);
    }

    @Override // com.github.catvod.spider.merge.W.a
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
