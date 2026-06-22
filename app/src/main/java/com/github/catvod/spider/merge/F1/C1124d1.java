package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.l.C1290c;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1124d1 extends C1150k {
    C1186v0 t;

    public C1124d1(C1186v0 c1186v0) {
        this.t = c1186v0;
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k, com.github.catvod.spider.merge.f1.InterfaceC1098N, com.github.catvod.spider.merge.f1.InterfaceC1161n
    public final Object b(C1185v c1185v, n2 n2Var, n2 n2Var2, Object[] objArr) {
        Object[] objArr2;
        Object objF;
        C1186v0 c1186v0 = this.t;
        int i = C1120c1.j;
        Class<?>[] clsArr = c1186v0.c;
        int i2 = 0;
        if (c1186v0.d) {
            objArr2 = new Object[clsArr.length];
            for (int i3 = 0; i3 < clsArr.length - 1; i3++) {
                Object obj = objArr[i3];
                Class<?> cls = clsArr[i3];
                Object[] objArr3 = C1185v.x;
                objArr2[i3] = C1156l1.f(cls, obj);
            }
            if (objArr.length == clsArr.length && (objArr[objArr.length - 1] == null || (objArr[objArr.length - 1] instanceof B0) || (objArr[objArr.length - 1] instanceof C1116b1))) {
                Object obj2 = objArr[objArr.length - 1];
                Class<?> cls2 = clsArr[clsArr.length - 1];
                Object[] objArr4 = C1185v.x;
                objF = C1156l1.f(cls2, obj2);
            } else {
                Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
                Object objNewInstance = Array.newInstance(componentType, (objArr.length - clsArr.length) + 1);
                while (i2 < Array.getLength(objNewInstance)) {
                    Object obj3 = objArr[(clsArr.length - 1) + i2];
                    Object[] objArr5 = C1185v.x;
                    Array.set(objNewInstance, i2, C1156l1.f(componentType, obj3));
                    i2++;
                }
                objF = objNewInstance;
            }
            objArr2[clsArr.length - 1] = objF;
        } else {
            objArr2 = objArr;
            while (i2 < objArr2.length) {
                Object obj4 = objArr2[i2];
                Class<?> cls3 = clsArr[i2];
                Object[] objArr6 = C1185v.x;
                Object objF2 = C1156l1.f(cls3, obj4);
                if (objF2 != obj4) {
                    if (objArr2 == objArr) {
                        objArr2 = (Object[]) objArr.clone();
                    }
                    objArr2[i2] = objF2;
                }
                i2++;
            }
        }
        Object objI = c1186v0.i(objArr2);
        n2 n2VarU0 = p2.u0(n2Var);
        com.github.catvod.spider.merge.Q0.a aVarS = c1185v.s();
        aVarS.getClass();
        return objI instanceof n2 ? (n2) objI : objI.getClass().isArray() ? new C1116b1(n2VarU0, objI) : aVarS.d(n2VarU0, objI, null);
    }

    @Override // com.github.catvod.spider.merge.f1.C1150k
    public final String t1() {
        return "<init>".concat(C1147j0.j(this.t.c));
    }

    public final String toString() {
        return C1290c.b(com.github.catvod.spider.merge.I.t0.b("[JavaConstructor "), this.t.b(), "]");
    }
}
