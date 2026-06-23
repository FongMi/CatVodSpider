package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class er extends ym {
    public long m;
    public boolean n;
    public py o;

    public static void p(long j, ob obVar) {
        acj.x.l(j, obVar);
    }

    public abstract void f();

    public final void q() {
        long j = this.m - 4294967296L;
        this.m = j;
        if (j <= 0 && this.n) {
            f();
        }
    }

    public final void r(acw acwVar) {
        py pyVar = this.o;
        if (pyVar == null) {
            pyVar = new py();
            pyVar.a = new Object[16];
            this.o = pyVar;
        }
        Object[] objArr = pyVar.a;
        int i = pyVar.c;
        objArr[i] = acwVar;
        int length = (objArr.length - 1) & (i + 1);
        pyVar.c = length;
        int i2 = pyVar.b;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            qb.f(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = pyVar.a;
            int length3 = objArr3.length;
            int i3 = pyVar.b;
            qb.f(objArr3, objArr2, length3 - i3, 0, i3, 4);
            pyVar.a = objArr2;
            pyVar.b = 0;
            pyVar.c = length2;
        }
    }

    public abstract Thread s();

    public final void t(boolean z) {
        this.m = (z ? 4294967296L : 1L) + this.m;
        if (z) {
            return;
        }
        this.n = true;
    }

    public final boolean u() {
        py pyVar = this.o;
        if (pyVar == null) {
            return false;
        }
        int i = pyVar.b;
        Object obj = null;
        if (i != pyVar.c) {
            Object[] objArr = pyVar.a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            pyVar.b = (i + 1) & (objArr.length - 1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            obj = obj2;
        }
        acw acwVar = (acw) obj;
        if (acwVar == null) {
            return false;
        }
        acwVar.run();
        return true;
    }
}
