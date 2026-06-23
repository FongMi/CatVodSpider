package com.github.catvod.spider.merge.A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class zt {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zt.class, Object.class, "_cur");
    private volatile Object _cur = new oi(8, false);

    public final boolean b(adf adfVar) {
        while (true) {
            oi oiVar = (oi) this._cur;
            int iH = oiVar.h(adfVar);
            if (iH == 0) {
                return true;
            }
            if (iH == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                oi oiVarL = oiVar.l();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oiVar, oiVarL) && atomicReferenceFieldUpdater.get(this) == oiVar) {
                }
            } else if (iH == 2) {
                return false;
            }
        }
    }

    public final void c() {
        while (true) {
            oi oiVar = (oi) this._cur;
            if (oiVar.i()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            oi oiVarL = oiVar.l();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oiVar, oiVarL) && atomicReferenceFieldUpdater.get(this) == oiVar) {
            }
        }
    }

    public final int d() {
        return ((oi) this._cur).j();
    }

    public final Object e() {
        while (true) {
            oi oiVar = (oi) this._cur;
            Object objM = oiVar.m();
            if (objM != oi.c) {
                return objM;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            oi oiVarL = oiVar.l();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oiVar, oiVarL) && atomicReferenceFieldUpdater.get(this) == oiVar) {
            }
        }
    }
}
