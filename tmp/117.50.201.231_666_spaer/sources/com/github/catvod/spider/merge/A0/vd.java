package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class vd extends kv {
    public static il a(rd rdVar, int i) throws IOException {
        int iH = wb.h(i);
        if (iH == 5) {
            return new wg(rdVar.ai());
        }
        if (iH == 6) {
            return new wg(new ns(rdVar.ai()));
        }
        if (iH == 7) {
            return new wg(Boolean.valueOf(rdVar.aa()));
        }
        if (iH != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(wb.i(i)));
        }
        rdVar.ag();
        return aas.f;
    }

    public static void d(aag aagVar, il ilVar) throws IOException {
        if (ilVar == null || (ilVar instanceof aas)) {
            aagVar.w();
            return;
        }
        boolean z = ilVar instanceof wg;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + ilVar);
            }
            wg wgVar = (wg) ilVar;
            Serializable serializable = wgVar.f;
            if (serializable instanceof Number) {
                aagVar.ad(wgVar.j());
                return;
            } else if (serializable instanceof Boolean) {
                aagVar.af(wgVar.i());
                return;
            } else {
                aagVar.ae(wgVar.e());
                return;
            }
        }
        boolean z2 = ilVar instanceof zx;
        if (z2) {
            aagVar.p();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + ilVar);
            }
            Iterator it = ((zx) ilVar).f.iterator();
            while (it.hasNext()) {
                d(aagVar, (il) it.next());
            }
            aagVar.s();
            return;
        }
        if (!(ilVar instanceof jb)) {
            throw new IllegalArgumentException("Couldn't write " + ilVar.getClass());
        }
        aagVar.q();
        Iterator it2 = ((cx) ilVar.c().f.entrySet()).iterator();
        while (((xu) it2).hasNext()) {
            adi adiVarG = ((xu) it2).g();
            aagVar.u((String) adiVarG.getKey());
            d(aagVar, (il) adiVarG.getValue());
        }
        aagVar.t();
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final Object b(rd rdVar) throws IOException {
        il zxVar;
        il zxVar2;
        int iAk = rdVar.ak();
        int iH = wb.h(iAk);
        if (iH == 0) {
            rdVar.p();
            zxVar = new zx();
        } else if (iH != 2) {
            zxVar = null;
        } else {
            rdVar.q();
            zxVar = new jb();
        }
        if (zxVar == null) {
            return a(rdVar, iAk);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (rdVar.x()) {
                String strAe = zxVar instanceof jb ? rdVar.ae() : null;
                int iAk2 = rdVar.ak();
                int iH2 = wb.h(iAk2);
                if (iH2 == 0) {
                    rdVar.p();
                    zxVar2 = new zx();
                } else if (iH2 != 2) {
                    zxVar2 = null;
                } else {
                    rdVar.q();
                    zxVar2 = new jb();
                }
                boolean z = zxVar2 != null;
                if (zxVar2 == null) {
                    zxVar2 = a(rdVar, iAk2);
                }
                if (zxVar instanceof zx) {
                    ((zx) zxVar).f.add(zxVar2);
                } else {
                    jb jbVar = (jb) zxVar;
                    jbVar.getClass();
                    jbVar.f.put(strAe, zxVar2);
                }
                if (z) {
                    arrayDeque.addLast(zxVar);
                    zxVar = zxVar2;
                }
            } else {
                if (zxVar instanceof zx) {
                    rdVar.t();
                } else {
                    rdVar.u();
                }
                if (arrayDeque.isEmpty()) {
                    return zxVar;
                }
                zxVar = (il) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.kv
    public final /* bridge */ /* synthetic */ void c(aag aagVar, Object obj) throws IOException {
        d(aagVar, (il) obj);
    }
}
