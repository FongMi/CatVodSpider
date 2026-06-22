package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1174r0 implements Serializable {
    private final p2 b;
    private final String c;
    private final String d;
    private Object g;
    private final boolean e = false;
    private final boolean f = true;
    private int h = 0;

    C1174r0(p2 p2Var, String str, String str2) {
        this.b = p2Var;
        this.c = str;
        this.d = str2;
        p2Var.G(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object b() {
        Class clsB = C1162n0.b(this.d);
        if (clsB != null) {
            try {
                C1150k c1150kJ = p2.J(this.b, clsB, this.e);
                if (c1150kJ != null) {
                    return c1150kJ;
                }
                n2 n2Var = this.b;
                Object objL = n2Var.l(this.c, n2Var);
                if (objL != I2.c) {
                    return objL;
                }
            } catch (AbstractC1125d2 | IllegalAccessException | InstantiationException | SecurityException unused) {
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
            }
        }
        return I2.c;
    }

    final Object c() {
        if (this.h == 2) {
            return this.g;
        }
        throw new IllegalStateException(this.c);
    }

    final void d() {
        synchronized (this) {
            int i = this.h;
            if (i == 1) {
                throw new IllegalStateException("Recursive initialization for " + this.c);
            }
            if (i == 0) {
                this.h = 1;
                I2 i2 = I2.c;
                try {
                    this.g = this.f ? AccessController.doPrivileged(new C1171q0(this)) : b();
                    this.h = 2;
                } catch (Throwable th) {
                    this.g = i2;
                    this.h = 2;
                    throw th;
                }
            }
        }
    }
}
