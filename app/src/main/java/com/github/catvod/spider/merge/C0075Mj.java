package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.InterfaceC0054A;

/* renamed from: com.github.catvod.spider.merge.Mj */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0075Mj {
    /* renamed from: q */
    public static InterfaceC0054A.p m251q(InterfaceC0054A interfaceC0054A, AbstractC0077NC abstractC0077NC) {
        AbstractC0077NC abstractC0077NCM263MH = abstractC0077NC;
        int i = 0;
        while (abstractC0077NCM263MH != null) {
            InterfaceC0054A.p pVarMo117xC = interfaceC0054A.mo117xC(abstractC0077NCM263MH, i);
            if (pVarMo117xC == InterfaceC0054A.p.STOP) {
                return pVarMo117xC;
            }
            if (pVarMo117xC != InterfaceC0054A.p.CONTINUE || abstractC0077NCM263MH.mo131se() <= 0) {
                while (abstractC0077NCM263MH.m257E() == null && i > 0) {
                    InterfaceC0054A.p pVar = InterfaceC0054A.p.CONTINUE;
                    if ((pVarMo117xC == pVar || pVarMo117xC == InterfaceC0054A.p.SKIP_CHILDREN) && (pVarMo117xC = interfaceC0054A.mo116q(abstractC0077NCM263MH, i)) == InterfaceC0054A.p.STOP) {
                        return pVarMo117xC;
                    }
                    AbstractC0077NC abstractC0077NCM264P = abstractC0077NCM263MH.m264P();
                    i--;
                    if (pVarMo117xC == InterfaceC0054A.p.REMOVE) {
                        abstractC0077NCM263MH.m272d();
                    }
                    pVarMo117xC = pVar;
                    abstractC0077NCM263MH = abstractC0077NCM264P;
                }
                if ((pVarMo117xC == InterfaceC0054A.p.CONTINUE || pVarMo117xC == InterfaceC0054A.p.SKIP_CHILDREN) && (pVarMo117xC = interfaceC0054A.mo116q(abstractC0077NCM263MH, i)) == InterfaceC0054A.p.STOP) {
                    return pVarMo117xC;
                }
                if (abstractC0077NCM263MH == abstractC0077NC) {
                    return pVarMo117xC;
                }
                AbstractC0077NC abstractC0077NCM257E = abstractC0077NCM263MH.m257E();
                if (pVarMo117xC == InterfaceC0054A.p.REMOVE) {
                    abstractC0077NCM263MH.m272d();
                }
                abstractC0077NCM263MH = abstractC0077NCM257E;
            } else {
                abstractC0077NCM263MH = abstractC0077NCM263MH.m263MH(0);
                i++;
            }
        }
        return InterfaceC0054A.p.CONTINUE;
    }

    /* renamed from: xC */
    public static void m252xC(InterfaceC0150u2 interfaceC0150u2, AbstractC0077NC abstractC0077NC) {
        AbstractC0077NC abstractC0077NCM263MH = abstractC0077NC;
        int i = 0;
        while (abstractC0077NCM263MH != null) {
            AbstractC0077NC abstractC0077NCM264P = abstractC0077NCM263MH.m264P();
            interfaceC0150u2.mo288xC(abstractC0077NCM263MH, i);
            if (abstractC0077NCM264P != null && !abstractC0077NCM263MH.m267Tz()) {
                abstractC0077NCM263MH = abstractC0077NCM264P.m263MH(abstractC0077NCM263MH.m286z());
            }
            if (abstractC0077NCM263MH.mo131se() > 0) {
                abstractC0077NCM263MH = abstractC0077NCM263MH.m263MH(0);
                i++;
            } else {
                while (abstractC0077NCM263MH.m257E() == null && i > 0) {
                    interfaceC0150u2.mo287q(abstractC0077NCM263MH, i);
                    abstractC0077NCM263MH = abstractC0077NCM263MH.m264P();
                    i--;
                }
                interfaceC0150u2.mo287q(abstractC0077NCM263MH, i);
                if (abstractC0077NCM263MH == abstractC0077NC) {
                    return;
                } else {
                    abstractC0077NCM263MH = abstractC0077NCM263MH.m257E();
                }
            }
        }
    }
}
