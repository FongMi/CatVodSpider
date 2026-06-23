package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class rv extends kv {
    public static final ct a = new ct(0, new rv(3, vs.d));
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ rv(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        switch (this.d) {
            case 0:
                return new AtomicLong(((Number) ((kv) this.e).b(rdVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                rdVar.p();
                while (rdVar.x()) {
                    arrayList.add(Long.valueOf(((Number) ((kv) this.e).b(rdVar)).longValue()));
                }
                rdVar.t();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            case 2:
                if (rdVar.ak() != 9) {
                    return ((kv) this.e).b(rdVar);
                }
                rdVar.ag();
                return null;
            default:
                int iAk = rdVar.ak();
                int iH = wb.h(iAk);
                if (iH == 5 || iH == 6) {
                    return ((vs) this.e).a(rdVar);
                }
                if (iH == 8) {
                    rdVar.ag();
                    return null;
                }
                throw new yc("Expecting number, got: " + wb.i(iAk) + "; at path " + rdVar.w(false));
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final void c(aag aagVar, Object obj) throws IOException {
        switch (this.d) {
            case 0:
                ((kv) this.e).c(aagVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                aagVar.p();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    ((kv) this.e).c(aagVar, Long.valueOf(atomicLongArray.get(i)));
                }
                aagVar.s();
                break;
            case 2:
                if (obj == null) {
                    aagVar.w();
                } else {
                    ((kv) this.e).c(aagVar, obj);
                }
                break;
            default:
                aagVar.ad((Number) obj);
                break;
        }
    }
}
