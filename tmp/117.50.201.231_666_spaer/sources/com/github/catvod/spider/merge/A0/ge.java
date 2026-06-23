package com.github.catvod.spider.merge.A0;

import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ge {
    private volatile int _size = 0;
    public ob[] a;

    public final void b(ob obVar) {
        lh lhVar = (lh) this;
        if (obVar.d == sk.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        obVar.d = lhVar;
        ob[] obVarArr = this.a;
        if (obVarArr == null) {
            obVarArr = new ob[4];
            this.a = obVarArr;
        } else if (this._size >= obVarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(obVarArr, this._size * 2);
            ko.e("java.util.Arrays.copyOf(this, newSize)", objArrCopyOf);
            obVarArr = (ob[]) objArrCopyOf;
            this.a = obVarArr;
        }
        int i = this._size;
        this._size = i + 1;
        obVarArr[i] = obVar;
        obVar.e = i;
        h(i);
    }

    public final boolean c() {
        return this._size == 0;
    }

    public final ob d() {
        ob obVar;
        synchronized (this) {
            ob[] obVarArr = this.a;
            obVar = obVarArr != null ? obVarArr[0] : null;
        }
        return obVar;
    }

    public final void e(ob obVar) {
        synchronized (this) {
            Object obj = obVar.d;
            if (!(obj instanceof ge)) {
                obj = null;
            }
            if (((ge) obj) != null) {
                f(obVar.e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.ob f(int r8) {
        /*
            r7 = this;
            com.github.catvod.spider.merge.A0.ob[] r0 = r7.a
            com.github.catvod.spider.merge.A0.ko.c(r0)
            int r1 = r7._size
            r2 = -1
            int r1 = r1 + r2
            r7._size = r1
            int r1 = r7._size
            if (r8 >= r1) goto L6d
            int r1 = r7._size
            r7.i(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L31
            r3 = r0[r8]
            com.github.catvod.spider.merge.A0.ko.c(r3)
            r4 = r0[r1]
            com.github.catvod.spider.merge.A0.ko.c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L31
            r7.i(r8, r1)
            r7.h(r1)
            goto L6d
        L31:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7._size
            if (r3 < r4) goto L3a
            goto L6d
        L3a:
            com.github.catvod.spider.merge.A0.ob[] r4 = r7.a
            com.github.catvod.spider.merge.A0.ko.c(r4)
            int r1 = r1 + 2
            int r5 = r7._size
            if (r1 >= r5) goto L56
            r5 = r4[r1]
            com.github.catvod.spider.merge.A0.ko.c(r5)
            r6 = r4[r3]
            com.github.catvod.spider.merge.A0.ko.c(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L56
            goto L57
        L56:
            r1 = r3
        L57:
            r3 = r4[r8]
            com.github.catvod.spider.merge.A0.ko.c(r3)
            r4 = r4[r1]
            com.github.catvod.spider.merge.A0.ko.c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L68
            goto L6d
        L68:
            r7.i(r8, r1)
            r8 = r1
            goto L31
        L6d:
            int r8 = r7._size
            r8 = r0[r8]
            com.github.catvod.spider.merge.A0.ko.c(r8)
            java.lang.Object r1 = r8.d
            com.github.catvod.spider.merge.A0.xb r3 = com.github.catvod.spider.merge.A0.sk.a
            if (r1 == r3) goto L84
            r1 = 0
            r8.d = r1
            r8.e = r2
            int r2 = r7._size
            r0[r2] = r1
            return r8
        L84:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ge.f(int):com.github.catvod.spider.merge.A0.ob");
    }

    public final ob g() {
        ob obVarF;
        synchronized (this) {
            obVarF = this._size > 0 ? f(0) : null;
        }
        return obVarF;
    }

    public final void h(int i) {
        while (i > 0) {
            ob[] obVarArr = this.a;
            ko.c(obVarArr);
            int i2 = (i - 1) / 2;
            ob obVar = obVarArr[i2];
            ko.c(obVar);
            ob obVar2 = obVarArr[i];
            ko.c(obVar2);
            if (obVar.compareTo(obVar2) <= 0) {
                return;
            }
            i(i, i2);
            i = i2;
        }
    }

    public final void i(int i, int i2) {
        ob[] obVarArr = this.a;
        ko.c(obVarArr);
        ob obVar = obVarArr[i2];
        ko.c(obVar);
        ob obVar2 = obVarArr[i];
        ko.c(obVar2);
        obVarArr[i] = obVar;
        obVarArr[i2] = obVar2;
        obVar.e = i;
        obVar2.e = i2;
    }
}
