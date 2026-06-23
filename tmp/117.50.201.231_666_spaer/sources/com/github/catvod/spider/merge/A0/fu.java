package com.github.catvod.spider.merge.A0;

import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class fu extends lc {
    public final zc a;
    public int b;
    public int c;
    public int d;
    public final zn[] e;
    public int f;
    public final aab g;

    public fu(zc zcVar, jj jjVar, zn[] znVarArr, xa xaVar) {
        super(jjVar, xaVar);
        this.b = -1;
        this.c = 1;
        this.d = 0;
        this.f = 0;
        aab aabVar = new aab();
        aabVar.a = -1;
        aabVar.b = 0;
        aabVar.c = -1;
        this.g = aabVar;
        this.e = znVarArr;
        this.a = zcVar;
    }

    public static void h(abf abfVar, int i, abf abfVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (abfVar) {
            try {
                if (abfVar.c == null) {
                    abfVar.c = new abf[128];
                }
                abfVar.c[i] = abfVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.lc
    public final void i() {
        aab aabVar = this.g;
        aabVar.a = -1;
        aabVar.b = 0;
        aabVar.c = -1;
        aabVar.d = null;
        this.b = -1;
        this.c = 1;
        this.d = 0;
        this.f = 0;
    }

    public final abf j(mz mzVar) {
        jk jkVar;
        abf abfVar = new abf(mzVar);
        Iterator it = mzVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                jkVar = null;
                break;
            }
            jkVar = (jk) it.next();
            if (jkVar.e instanceof hy) {
                break;
            }
        }
        if (jkVar != null) {
            abfVar.d = true;
            abfVar.f = ((gp) jkVar).a;
            abfVar.e = this.p.g[jkVar.e.f];
        }
        zn znVar = this.e[this.f];
        synchronized (znVar.a) {
            try {
                abf abfVar2 = (abf) znVar.a.get(abfVar);
                if (abfVar2 != null) {
                    return abfVar2;
                }
                abfVar.a = znVar.a.size();
                mzVar.a = true;
                mzVar.b = null;
                abfVar.b = mzVar;
                znVar.a.put(abfVar, abfVar);
                return abfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(com.github.catvod.spider.merge.A0.ss r18, com.github.catvod.spider.merge.A0.gp r19, com.github.catvod.spider.merge.A0.mz r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.fu.k(com.github.catvod.spider.merge.A0.ss, com.github.catvod.spider.merge.A0.gp, com.github.catvod.spider.merge.A0.mz, boolean, boolean, boolean):boolean");
    }

    public final void l(ss ssVar) {
        if (ssVar.e(1) == 10) {
            this.c++;
            this.d = 0;
        } else {
            this.d++;
        }
        int i = ssVar.b;
        if (ssVar.a - i == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        ssVar.b = i + 1;
    }

    public final int m(ss ssVar, abf abfVar) throws Throwable {
        int i;
        boolean z;
        abf abfVarJ;
        mz mzVar;
        int i2;
        int i3;
        lq lqVar;
        jk jkVar;
        int i4;
        int i5;
        int i6;
        lq lqVar2;
        jk jkVar2;
        abf abfVar2 = abfVar;
        boolean z2 = abfVar2.d;
        aab aabVar = this.g;
        if (z2) {
            aabVar.a = ssVar.b;
            aabVar.b = this.c;
            aabVar.c = this.d;
            aabVar.d = abfVar2;
        }
        int iE = ssVar.e(1);
        while (true) {
            abf[] abfVarArr = abfVar2.c;
            abf abfVar3 = (abfVarArr == null || iE < 0 || iE > 127) ? null : abfVarArr[iE];
            abf abfVar4 = lc.o;
            if (abfVar3 == null) {
                mz mzVar2 = new mz();
                int i7 = 0;
                for (jk jkVar3 : abfVar2.b.c) {
                    boolean z3 = jkVar3.f == i7;
                    if (!z3 || !((gp) jkVar3).b) {
                        lq lqVar3 = jkVar3.e;
                        int size = lqVar3.h.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                mzVar = mzVar2;
                                break;
                            }
                            nw nwVarK = lqVar3.k(i8);
                            lq lqVar4 = nwVarK.d(iE, 1114111) ? nwVarK.g : null;
                            if (lqVar4 != null) {
                                gp gpVar = (gp) jkVar3;
                                gk gkVar = gpVar.a;
                                if (gkVar != null) {
                                    i5 = i8;
                                    int i9 = ssVar.b - this.b;
                                    i6 = size;
                                    lqVar2 = lqVar3;
                                    int i10 = 0;
                                    r[] rVarArr = null;
                                    while (true) {
                                        r[] rVarArr2 = gkVar.a;
                                        jkVar2 = jkVar3;
                                        if (i10 >= rVarArr2.length) {
                                            break;
                                        }
                                        if (rVarArr2[i10].a() && !(rVarArr2[i10] instanceof abi)) {
                                            if (rVarArr == null) {
                                                rVarArr = (r[]) rVarArr2.clone();
                                            }
                                            rVarArr[i10] = new abi(i9, rVarArr2[i10]);
                                        }
                                        i10++;
                                        jkVar3 = jkVar2;
                                    }
                                    if (rVarArr != null) {
                                        gkVar = new gk(rVarArr);
                                    }
                                } else {
                                    i5 = i8;
                                    i6 = size;
                                    lqVar2 = lqVar3;
                                    jkVar2 = jkVar3;
                                }
                                boolean z4 = iE == -1;
                                gp gpVar2 = new gp(gpVar, lqVar4, gkVar);
                                i2 = i5;
                                int i11 = i6;
                                lqVar = lqVar2;
                                jk jkVar4 = jkVar2;
                                i4 = i7;
                                i3 = i11;
                                mzVar = mzVar2;
                                if (k(ssVar, gpVar2, mzVar2, z3, true, z4)) {
                                    i7 = jkVar4.f;
                                    break;
                                }
                                jkVar = jkVar4;
                            } else {
                                i2 = i8;
                                i3 = size;
                                lqVar = lqVar3;
                                jkVar = jkVar3;
                                i4 = i7;
                                mzVar = mzVar2;
                            }
                            jkVar3 = jkVar;
                            i8 = i2 + 1;
                            mzVar2 = mzVar;
                            lqVar3 = lqVar;
                            i7 = i4;
                            size = i3;
                        }
                        mzVar2 = mzVar;
                    }
                }
                mz mzVar3 = mzVar2;
                i = -1;
                if (mzVar3.c.isEmpty()) {
                    if (!mzVar3.f) {
                        h(abfVar2, iE, abfVar4);
                    }
                    abfVarJ = abfVar4;
                } else {
                    boolean z5 = mzVar3.f;
                    mzVar3.f = false;
                    abfVarJ = j(mzVar3);
                    if (!z5) {
                        h(abfVar2, iE, abfVarJ);
                    }
                }
                abfVar2 = abfVarJ;
            } else {
                i = -1;
                abfVar2 = abfVar3;
            }
            if (abfVar2 == abfVar4) {
                break;
            }
            if (iE != i) {
                l(ssVar);
            }
            if (abfVar2.d) {
                aabVar.a = ssVar.b;
                aabVar.b = this.c;
                aabVar.c = this.d;
                aabVar.d = abfVar2;
                if (iE == i) {
                    break;
                }
            }
            iE = ssVar.e(1);
        }
        abf abfVar5 = aabVar.d;
        zc zcVar = this.a;
        if (abfVar5 == null) {
            if (iE == i && ssVar.b == this.b) {
                return -1;
            }
            throw new ui(zcVar, ssVar, this.b);
        }
        gk gkVar2 = abfVar5.f;
        int i12 = this.b;
        int i13 = aabVar.a;
        int i14 = aabVar.b;
        int i15 = aabVar.c;
        ssVar.b = i13;
        this.c = i14;
        this.d = i15;
        if (gkVar2 != null) {
            try {
                r[] rVarArr3 = gkVar2.a;
                int length = rVarArr3.length;
                boolean z6 = false;
                for (int i16 = 0; i16 < length; i16++) {
                    try {
                        r rVar = rVarArr3[i16];
                        if (rVar instanceof abi) {
                            int i17 = ((abi) rVar).c + i12;
                            ssVar.b = i17;
                            rVar = ((abi) rVar).d;
                            z6 = i17 != i13;
                        } else if (rVar.a()) {
                            ssVar.b = i13;
                        }
                        rVar.b(zcVar);
                    } catch (Throwable th) {
                        th = th;
                        z = z6;
                        if (z) {
                            ssVar.b = i13;
                        }
                        throw th;
                    }
                }
                if (z6) {
                    ssVar.b = i13;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return aabVar.d.e;
    }

    public final int n(ss ssVar, int i) {
        this.f = i;
        ssVar.getClass();
        this.b = ssVar.b;
        aab aabVar = this.g;
        aabVar.a = -1;
        aabVar.b = 0;
        aabVar.c = -1;
        aabVar.d = null;
        zn znVar = this.e[i];
        if (znVar.b != null) {
            return m(ssVar, znVar.b);
        }
        lq lqVar = (lq) this.p.i.get(this.f);
        dt dtVar = xr.h;
        mz mzVar = new mz();
        int i2 = 0;
        while (i2 < lqVar.h.size()) {
            int i3 = i2 + 1;
            k(ssVar, new gp(lqVar.k(i2).g, i3, dtVar), mzVar, false, false, false);
            i2 = i3;
        }
        boolean z = mzVar.f;
        mzVar.f = false;
        abf abfVarJ = j(mzVar);
        if (!z) {
            this.e[this.f].b = abfVarJ;
        }
        return m(ssVar, abfVarJ);
    }
}
