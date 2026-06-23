package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ik {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(ik.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(ik.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ik.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        r5 = com.github.catvod.spider.merge.A0.ik.g;
        r4 = ((com.github.catvod.spider.merge.A0.gw) r4).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r5.compareAndSet(r3, r2, r4) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r5.get(r3) == r2) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.ik j() {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            com.github.catvod.spider.merge.A0.ik r0 = (com.github.catvod.spider.merge.A0.ik) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L1e
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.github.catvod.spider.merge.A0.ik.h
        L10:
            boolean r1 = r5.compareAndSet(r7, r0, r2)
            if (r1 == 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r5.get(r7)
            if (r1 == r0) goto L10
            goto L0
        L1e:
            boolean r5 = r7.o()
            if (r5 == 0) goto L25
            return r1
        L25:
            if (r4 != 0) goto L28
            return r2
        L28:
            boolean r5 = r4 instanceof com.github.catvod.spider.merge.A0.xt
            if (r5 == 0) goto L32
            com.github.catvod.spider.merge.A0.xt r4 = (com.github.catvod.spider.merge.A0.xt) r4
            r4.b(r2)
            goto L0
        L32:
            boolean r5 = r4 instanceof com.github.catvod.spider.merge.A0.gw
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.github.catvod.spider.merge.A0.ik.g
            com.github.catvod.spider.merge.A0.gw r4 = (com.github.catvod.spider.merge.A0.gw) r4
            com.github.catvod.spider.merge.A0.ik r4 = r4.a
        L3e:
            boolean r6 = r5.compareAndSet(r3, r2, r4)
            if (r6 == 0) goto L46
            r2 = r3
            goto L6
        L46:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == r2) goto L3e
            goto L0
        L4d:
            java.lang.Object r2 = r2._prev
            com.github.catvod.spider.merge.A0.ik r2 = (com.github.catvod.spider.merge.A0.ik) r2
            goto L7
        L52:
            if (r4 == 0) goto L59
            com.github.catvod.spider.merge.A0.ik r4 = (com.github.catvod.spider.merge.A0.ik) r4
            r3 = r2
            r2 = r4
            goto L7
        L59:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
        */
        //  java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ik.j():com.github.catvod.spider.merge.A0.ik");
    }

    public final void k(ik ikVar) {
        while (true) {
            ik ikVar2 = (ik) ikVar._prev;
            if (l() != ikVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            while (!atomicReferenceFieldUpdater.compareAndSet(ikVar, ikVar2, this)) {
                if (atomicReferenceFieldUpdater.get(ikVar) != ikVar2) {
                    break;
                }
            }
            if (o()) {
                ikVar.j();
                return;
            }
            return;
        }
    }

    public final Object l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof xt)) {
                return obj;
            }
            ((xt) obj).b(this);
        }
    }

    public final ik m() {
        ik ikVar;
        Object objL = l();
        gw gwVar = (gw) (!(objL instanceof gw) ? null : objL);
        if (gwVar != null && (ikVar = gwVar.a) != null) {
            return ikVar;
        }
        if (objL != null) {
            return (ik) objL;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public final ik n() {
        ik ikVarJ = j();
        if (ikVarJ == null) {
            Object obj = this._prev;
            while (true) {
                ikVarJ = (ik) obj;
                if (!ikVarJ.o()) {
                    break;
                }
                obj = ikVarJ._prev;
            }
        }
        return ikVarJ;
    }

    public boolean o() {
        return l() instanceof gw;
    }

    public final void p() {
        while (true) {
            Object objL = l();
            if (objL instanceof gw) {
                ik ikVar = ((gw) objL).a;
                return;
            }
            if (objL == this) {
                return;
            }
            if (objL == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            ik ikVar2 = (ik) objL;
            gw gwVar = (gw) ikVar2._removedRef;
            if (gwVar == null) {
                gwVar = new gw(ikVar2);
                i.lazySet(ikVar2, gwVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, objL, gwVar)) {
                if (atomicReferenceFieldUpdater.get(this) != objL) {
                    break;
                }
            }
            ikVar2.j();
            return;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
