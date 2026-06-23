package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class oi {
    private volatile Object _next = null;
    private volatile long _state = 0;
    public final int d;
    public final AtomicReferenceArray e;
    public final int f;
    public final boolean g;
    public static final xb c = new xb("REMOVE_FROZEN", 3);
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(oi.class, Object.class, "_next");
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(oi.class, "_state");

    public oi(int i, boolean z) {
        this.f = i;
        this.g = z;
        int i2 = i - 1;
        this.d = i2;
        this.e = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r4 = 1
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L15
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r15 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r4 = 2
        L14:
            return r4
        L15:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r8 = r8 & r2
            r0 = 30
            long r8 = r8 >> r0
            int r9 = (int) r8
            int r8 = r14.d
            int r5 = r9 + 2
            r5 = r5 & r8
            r10 = r1 & r8
            if (r5 != r10) goto L2e
            return r4
        L2e:
            boolean r5 = r14.g
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.e
            r11 = r9 & r8
            java.lang.Object r5 = r5.get(r11)
            if (r5 == 0) goto L4d
            int r0 = r14.f
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4c
            int r9 = r9 - r1
            r1 = r9 & r10
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4c:
            return r4
        L4d:
            int r1 = r9 + 1
            r1 = r1 & r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = com.github.catvod.spider.merge.A0.oi.b
            r10 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r10 = r10 & r2
            long r12 = (long) r1
            long r0 = r12 << r0
            long r10 = r10 | r0
            r0 = r4
            r1 = r14
            r4 = r10
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.e
            r1 = r9 & r8
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L77
            goto L96
        L77:
            com.github.catvod.spider.merge.A0.oi r0 = r0.l()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.e
            int r2 = r0.d
            r2 = r2 & r9
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof com.github.catvod.spider.merge.A0.hs
            if (r4 == 0) goto L92
            com.github.catvod.spider.merge.A0.hs r3 = (com.github.catvod.spider.merge.A0.hs) r3
            int r3 = r3.a
            if (r3 != r9) goto L92
            r1.set(r2, r15)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 == 0) goto L96
            goto L6d
        L96:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.oi.h(java.lang.Object):int");
    }

    public final boolean i() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!b.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int j() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final boolean k() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final oi l() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (b.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            oi oiVar = (oi) this._next;
            if (oiVar != null) {
                return oiVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            oi oiVar2 = new oi(this.f * 2, this.g);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.d;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object hsVar = this.e.get(i4);
                if (hsVar == null) {
                    hsVar = new hs(i);
                }
                oiVar2.e.set(oiVar2.d & i, hsVar);
                i++;
            }
            oiVar2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oiVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object m() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return c;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.d;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.e.get(i4);
            if (obj == null) {
                if (this.g) {
                    return null;
                }
            } else {
                if (obj instanceof hs) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (b.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.e.set(this.d & i, null);
                    return obj;
                }
                if (this.g) {
                    oi oiVarL = this;
                    while (true) {
                        long j3 = oiVarL._state;
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            oiVarL = oiVarL.l();
                        } else {
                            if (b.compareAndSet(oiVarL, j3, (j3 & (-1073741824)) | j2)) {
                                oiVarL.e.set(oiVarL.d & i5, null);
                                oiVarL = null;
                            } else {
                                continue;
                            }
                        }
                        if (oiVarL == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
