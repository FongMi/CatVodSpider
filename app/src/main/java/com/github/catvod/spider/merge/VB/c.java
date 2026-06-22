package com.github.catvod.spider.merge.VB;

import com.github.catvod.spider.merge.XI.i;
import com.github.catvod.spider.merge.XI.k;
import com.github.catvod.spider.merge.XI.l;
import com.github.catvod.spider.merge.XI.m;
import com.github.catvod.spider.merge.ZrJ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c implements i {
    private final String a;
    private volatile i b;
    private Boolean c;
    private Method d;
    private k e;
    private Queue<m> f;
    private final boolean g;

    public c(String str, Queue<m> queue, boolean z) {
        this.a = str;
        this.f = queue;
        this.g = z;
    }

    @Override // com.github.catvod.spider.merge.XI.i
    public final void a(String str, Throwable th) {
        i iVar;
        if (this.b != null) {
            iVar = this.b;
        } else if (this.g) {
            iVar = b.a;
        } else {
            if (this.e == null) {
                this.e = new k(this, this.f);
            }
            iVar = this.e;
        }
        iVar.a(str, th);
    }

    public final boolean b() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod(ZrJ.d("152C2C"), l.class);
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

    public final void e(l lVar) {
        if (b()) {
            try {
                this.d.invoke(this.b, lVar);
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

    public final void f(i iVar) {
        this.b = iVar;
    }

    @Override // com.github.catvod.spider.merge.XI.i
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
