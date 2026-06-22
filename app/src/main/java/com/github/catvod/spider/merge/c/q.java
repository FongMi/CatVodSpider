package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import com.github.catvod.spider.merge.z.InterfaceC1448b;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class q implements w {
    private final n[] a;
    protected final n[] b;
    protected final Class<?> c;
    public final com.github.catvod.spider.merge.H.l d;
    private ConcurrentMap<String, Object> e;
    private final Map<String, n> f;
    private Map<String, n> g;
    private transient long[] h;
    private transient short[] i;
    private final com.github.catvod.spider.merge.B.n j;

    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C.n>] */
    public q(com.github.catvod.spider.merge.B.o oVar, com.github.catvod.spider.merge.H.l lVar) {
        com.github.catvod.spider.merge.B.n nVarNewInstance;
        Class<?> clsDeserializeUsing;
        this.c = lVar.a;
        this.d = lVar;
        InterfaceC1450d interfaceC1450d = lVar.k;
        if (interfaceC1450d == null || interfaceC1450d.autoTypeCheckHandler() == com.github.catvod.spider.merge.B.n.class) {
            nVarNewInstance = null;
        } else {
            try {
                nVarNewInstance = lVar.k.autoTypeCheckHandler().newInstance();
            } catch (Exception unused) {
                nVarNewInstance = null;
            }
        }
        this.j = nVarNewInstance;
        com.github.catvod.spider.merge.H.e[] eVarArr = lVar.i;
        this.b = new n[eVarArr.length];
        int length = eVarArr.length;
        HashMap map = null;
        for (int i = 0; i < length; i++) {
            com.github.catvod.spider.merge.H.e eVar = lVar.i[i];
            oVar.getClass();
            Class<?> cls = lVar.a;
            Class<?> cls2 = eVar.f;
            InterfaceC1448b interfaceC1448bC = eVar.c();
            n c0599e = (((interfaceC1448bC == null || (clsDeserializeUsing = interfaceC1448bC.deserializeUsing()) == Void.class) ? null : clsDeserializeUsing) == null && (cls2 == List.class || cls2 == ArrayList.class)) ? new C0599e(cls, eVar) : new h(cls, eVar);
            this.b[i] = c0599e;
            if (length > 128) {
                if (this.g == null) {
                    this.g = new HashMap();
                }
                this.g.put(eVar.b, c0599e);
            }
            for (String str : eVar.u) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, c0599e);
            }
        }
        this.f = map;
        com.github.catvod.spider.merge.H.e[] eVarArr2 = lVar.h;
        this.a = new n[eVarArr2.length];
        int length2 = eVarArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.a[i2] = k(lVar.h[i2].b, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(com.github.catvod.spider.merge.B.o oVar, Class<?> cls, Type type) {
        this(oVar, com.github.catvod.spider.merge.H.l.b(cls, type, oVar.k));
        oVar.getClass();
    }

    private Object b(Object obj) {
        return this.d.e.invoke(null, obj);
    }

    protected static q l(com.github.catvod.spider.merge.B.o oVar, com.github.catvod.spider.merge.H.l lVar, String str) {
        InterfaceC1450d interfaceC1450d = lVar.k;
        if (interfaceC1450d == null) {
            return null;
        }
        for (Class<?> cls : interfaceC1450d.seeAlso()) {
            w wVarF = oVar.f(cls);
            if (wVarF instanceof q) {
                q qVar = (q) wVarF;
                com.github.catvod.spider.merge.H.l lVar2 = qVar.d;
                if (lVar2.l.equals(str)) {
                    return qVar;
                }
                q qVarL = l(oVar, lVar2, str);
                if (qVarL != null) {
                    return qVarL;
                }
            }
        }
        return null;
    }

    static boolean m(int i, int[] iArr) {
        int i2;
        if (iArr != null && (i2 = i / 32) < iArr.length) {
            return ((1 << (i % 32)) & iArr[i2]) != 0;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.C.w
    public <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        return (T) g(bVar, type, obj, 0);
    }

    public final Object d(com.github.catvod.spider.merge.B.b bVar, Type type) {
        Object objNewInstance;
        if ((type instanceof Class) && this.c.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new C1416e());
        }
        com.github.catvod.spider.merge.H.l lVar = this.d;
        Constructor<?> constructor = lVar.c;
        Object obj = null;
        if (constructor == null && lVar.e == null) {
            return null;
        }
        Method method = lVar.e;
        if (method != null && lVar.g > 0) {
            return null;
        }
        try {
            if (lVar.g == 0) {
                objNewInstance = constructor != null ? constructor.newInstance(new Object[0]) : method.invoke(null, new Object[0]);
            } else {
                com.github.catvod.spider.merge.B.k kVarF = bVar.f();
                if (kVarF == null || kVarF.a == null) {
                    throw new C1415d("can't create non-static inner class instance.");
                }
                if (!(type instanceof Class)) {
                    throw new C1415d("can't create non-static inner class instance.");
                }
                String name = ((Class) type).getName();
                String strSubstring = name.substring(0, name.lastIndexOf(36));
                Object obj2 = kVarF.a;
                String name2 = obj2.getClass().getName();
                if (!name2.equals(strSubstring)) {
                    com.github.catvod.spider.merge.B.k kVar = kVarF.b;
                    if (kVar == null || kVar.a == null || !("java.util.ArrayList".equals(name2) || "java.util.List".equals(name2) || "java.util.Collection".equals(name2) || "java.util.Map".equals(name2) || "java.util.HashMap".equals(name2))) {
                        obj = obj2;
                    } else if (kVar.a.getClass().getName().equals(strSubstring)) {
                        obj = kVar.a;
                    }
                    obj2 = obj;
                }
                if (obj2 == null || ((obj2 instanceof Collection) && ((Collection) obj2).isEmpty())) {
                    throw new C1415d("can't create non-static inner class instance.");
                }
                objNewInstance = constructor.newInstance(obj2);
            }
            if (bVar != null && bVar.g.l(com.github.catvod.spider.merge.B.c.InitStringFieldAsEmpty)) {
                for (com.github.catvod.spider.merge.H.e eVar : this.d.h) {
                    if (eVar.f == String.class) {
                        try {
                            eVar.i(objNewInstance, "");
                        } catch (Exception e) {
                            throw new C1415d(com.github.catvod.spider.merge.H0.j.b(this.c, t0.b("create instance error, class ")), e);
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (C1415d e2) {
            throw e2;
        } catch (Exception e3) {
            throw new C1415d(com.github.catvod.spider.merge.H0.j.b(this.c, t0.b("create instance error, class ")), e3);
        }
    }

    @Override // com.github.catvod.spider.merge.C.w
    public int e() {
        return 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.github.catvod.spider.merge.C.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v20, types: [int[], java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v17, types: [int] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.github.catvod.spider.merge.C.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.Map<java.lang.String, java.lang.Object> r20, com.github.catvod.spider.merge.B.o r21) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.q.f(java.util.Map, com.github.catvod.spider.merge.B.o):java.lang.Object");
    }

    public final <T> T g(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj, int i) {
        return (T) h(bVar, type, obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0338, code lost:
    
        if (r4 == (-2)) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x04ba, code lost:
    
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x04c1, code lost:
    
        if (r2 != null) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x04c3, code lost:
    
        r7 = r11.b(r0, r1, r13.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x04cd, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x04ce, code lost:
    
        r1 = r35.e().f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x04d8, code lost:
    
        r2 = r1.c(r35, r7, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x04de, code lost:
    
        if ((r1 instanceof com.github.catvod.spider.merge.C.q) == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x04e0, code lost:
    
        r1 = (com.github.catvod.spider.merge.C.q) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x04e2, code lost:
    
        if (r5 == null) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x04e4, code lost:
    
        r1 = r1.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x04e8, code lost:
    
        if (r1 == null) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x04ea, code lost:
    
        r1.f(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x04f4, code lost:
    
        if (r3 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x04f6, code lost:
    
        r3.a = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x04fa, code lost:
    
        r35.B(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x04fd, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x050d, code lost:
    
        r7 = r3;
        r11 = r6;
        r0 = r21;
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x092f, code lost:
    
        throw new com.github.catvod.spider.merge.y.C1415d("syntax error, unexpect token " + com.github.catvod.spider.merge.B.j.b(r13.p()));
     */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0688 A[PHI: r11 r14 r15 r19 r20 r21 r31
      0x0688: PHI (r11v26 com.github.catvod.spider.merge.B.k) = (r11v24 com.github.catvod.spider.merge.B.k), (r11v27 com.github.catvod.spider.merge.B.k) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r14v29 java.lang.Object) = (r14v28 java.lang.Object), (r14v30 java.lang.Object) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r15v29 java.lang.String) = (r15v28 java.lang.String), (r15v30 java.lang.String) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r19v3 int) = (r19v2 int), (r19v4 int) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r20v4 java.util.HashMap) = (r20v2 java.util.HashMap), (r20v5 java.util.HashMap) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r21v8 java.lang.Object) = (r21v6 java.lang.Object), (r21v9 java.lang.Object) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]
      0x0688: PHI (r31v10 com.github.catvod.spider.merge.B.o) = (r31v9 com.github.catvod.spider.merge.B.o), (r31v11 com.github.catvod.spider.merge.B.o) binds: [B:483:0x0675, B:487:0x0686] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x068d A[Catch: all -> 0x0938, TryCatch #14 {all -> 0x0938, blocks: (B:675:0x08fb, B:486:0x0680, B:489:0x068d, B:491:0x0693, B:671:0x08ec, B:673:0x08f4, B:676:0x0911, B:677:0x092f, B:478:0x0665, B:480:0x066b, B:482:0x0671, B:484:0x0678, B:678:0x0930, B:679:0x0937), top: B:718:0x08fb }] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0828 A[Catch: Exception -> 0x085a, all -> 0x08b6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x085a, blocks: (B:610:0x0800, B:612:0x0806, B:626:0x0828), top: B:715:0x0800 }] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0800 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0354 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object h(com.github.catvod.spider.merge.B.b r35, java.lang.reflect.Type r36, java.lang.Object r37, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.q.h(com.github.catvod.spider.merge.B.b, java.lang.reflect.Type, java.lang.Object, int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r12 = com.github.catvod.spider.merge.I.t0.b("illegal enum. ");
        r12.append(r0.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        throw new com.github.catvod.spider.merge.y.C1415d(r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        r0.o(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(com.github.catvod.spider.merge.B.b r11, java.lang.reflect.Type r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.q.i(com.github.catvod.spider.merge.B.b, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    public final n j(String str) {
        return k(str, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.merge.C.n>] */
    public final n k(String str, int[] iArr) {
        n nVar;
        if (str == null) {
            return null;
        }
        ?? r1 = this.g;
        if (r1 != 0 && (nVar = (n) r1.get(str)) != null) {
            return nVar;
        }
        int i = 0;
        int length = this.b.length - 1;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int iCompareTo = this.b[i2].a.b.compareTo(str);
            if (iCompareTo < 0) {
                i = i2 + 1;
            } else {
                if (iCompareTo <= 0) {
                    if (m(i2, iArr)) {
                        return null;
                    }
                    return this.b[i2];
                }
                length = i2 - 1;
            }
        }
        Map<String, n> map = this.f;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(com.github.catvod.spider.merge.B.b r22, java.lang.String r23, java.lang.Object r24, java.lang.reflect.Type r25, java.util.Map<java.lang.String, java.lang.Object> r26, int[] r27) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.q.n(com.github.catvod.spider.merge.B.b, java.lang.String, java.lang.Object, java.lang.reflect.Type, java.util.Map, int[]):boolean");
    }

    protected final Enum o(com.github.catvod.spider.merge.B.f fVar, char[] cArr, w wVar) {
        j jVar = wVar instanceof j ? (j) wVar : null;
        if (jVar == null) {
            fVar.n = -1;
            return null;
        }
        long jA0 = fVar.a0(cArr);
        if (fVar.n <= 0) {
            return null;
        }
        Enum enumB = jVar.b(jA0);
        if (enumB == null) {
            if (jA0 == -3750763034362895579L) {
                return null;
            }
            if (fVar.l(com.github.catvod.spider.merge.B.c.ErrorOnEnumNotMatch)) {
                StringBuilder sbB = t0.b("not match enum value, ");
                sbB.append(jVar.a);
                throw new C1415d(sbB.toString());
            }
        }
        return enumB;
    }

    public final n p(String str, int[] iArr) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        n nVarK = k(str, iArr);
        if (nVarK == null) {
            int i = 0;
            if (this.h == null) {
                long[] jArr = new long[this.b.length];
                int i2 = 0;
                while (true) {
                    n[] nVarArr = this.b;
                    if (i2 >= nVarArr.length) {
                        break;
                    }
                    jArr[i2] = nVarArr[i2].a.v;
                    i2++;
                }
                Arrays.sort(jArr);
                this.h = jArr;
            }
            int iBinarySearch = Arrays.binarySearch(this.h, com.github.catvod.spider.merge.H.A.B(str));
            if (iBinarySearch < 0) {
                iBinarySearch = Arrays.binarySearch(this.h, com.github.catvod.spider.merge.H.A.A(str));
            }
            if (iBinarySearch < 0) {
                zStartsWith = str.startsWith("is");
                if (zStartsWith) {
                    iBinarySearch = Arrays.binarySearch(this.h, com.github.catvod.spider.merge.H.A.A(str.substring(2)));
                }
            } else {
                zStartsWith = false;
            }
            if (iBinarySearch >= 0) {
                if (this.i == null) {
                    short[] sArr = new short[this.h.length];
                    Arrays.fill(sArr, (short) -1);
                    while (true) {
                        n[] nVarArr2 = this.b;
                        if (i >= nVarArr2.length) {
                            break;
                        }
                        int iBinarySearch2 = Arrays.binarySearch(this.h, nVarArr2[i].a.v);
                        if (iBinarySearch2 >= 0) {
                            sArr[iBinarySearch2] = (short) i;
                        }
                        i++;
                    }
                    this.i = sArr;
                }
                short s = this.i[iBinarySearch];
                if (s != -1 && !m(s, iArr)) {
                    nVarK = this.b[s];
                }
            }
            if (nVarK != null) {
                com.github.catvod.spider.merge.H.e eVar = nVarK.a;
                if ((eVar.k & com.github.catvod.spider.merge.B.c.DisableFieldSmartMatch.b) != 0) {
                    return null;
                }
                Class<?> cls = eVar.f;
                if (zStartsWith && cls != Boolean.TYPE && cls != Boolean.class) {
                    return null;
                }
            }
        }
        return nVarK;
    }
}
