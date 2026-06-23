package com.github.catvod.spider.merge.A0;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class oa {
    public static final aba a = aba.a;
    public static final fc b = fc.b;
    public static final vs c = vs.c;
    public static final vs d = vs.d;
    public final ThreadLocal e;
    public final ConcurrentHashMap f;
    public final xg g;
    public final ap h;
    public final List i;
    public final lw j;
    public final fc k;
    public final Map l;
    public final boolean m;
    public final aba n;
    public final boolean o;
    public final int p;
    public final int q;
    public final List r;
    public final List s;
    public final vs t;
    public final vs u;
    public final List v;
    public final int w;

    public oa() {
        this(lw.b, b, Collections.emptyMap(), true, a, true, 1, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), c, d, Collections.emptyList());
    }

    public oa(lw lwVar, fc fcVar, Map map, boolean z, aba abaVar, boolean z2, int i, int i2, int i3, List list, List list2, List list3, vs vsVar, vs vsVar2, List list4) {
        this.e = new ThreadLocal();
        this.f = new ConcurrentHashMap();
        this.j = lwVar;
        this.k = fcVar;
        this.l = map;
        xg xgVar = new xg(map, z2, list4);
        this.g = xgVar;
        this.m = z;
        this.n = abaVar;
        this.o = z2;
        this.w = i;
        this.p = i2;
        this.q = i3;
        this.r = list;
        this.s = list2;
        this.t = vsVar;
        this.u = vsVar2;
        this.v = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ado.aa);
        arrayList.add(vsVar == vs.c ? on.a : new ct(1, vsVar));
        arrayList.add(lwVar);
        arrayList.addAll(list3);
        arrayList.add(ado.p);
        arrayList.add(ado.g);
        arrayList.add(ado.d);
        arrayList.add(ado.e);
        arrayList.add(ado.f);
        kv lpVar = i == 1 ? ado.k : new lp();
        arrayList.add(new ix(Long.TYPE, Long.class, lpVar));
        arrayList.add(new ix(Double.TYPE, Double.class, new bz(0)));
        arrayList.add(new ix(Float.TYPE, Float.class, new bz(1)));
        arrayList.add(vsVar2 == vs.d ? rv.a : new ct(0, new rv(3, vsVar2)));
        arrayList.add(ado.h);
        arrayList.add(ado.i);
        arrayList.add(new wv(AtomicLong.class, new rv(2, new rv(0, lpVar)), 0));
        arrayList.add(new wv(AtomicLongArray.class, new rv(2, new rv(1, lpVar)), 0));
        arrayList.add(ado.j);
        arrayList.add(ado.l);
        arrayList.add(ado.q);
        arrayList.add(ado.r);
        arrayList.add(new wv(BigDecimal.class, ado.m, 0));
        arrayList.add(new wv(BigInteger.class, ado.n, 0));
        arrayList.add(new wv(ns.class, ado.o, 0));
        arrayList.add(ado.s);
        arrayList.add(ado.t);
        arrayList.add(ado.v);
        arrayList.add(ado.w);
        arrayList.add(ado.y);
        arrayList.add(ado.u);
        arrayList.add(ado.b);
        arrayList.add(ach.a);
        arrayList.add(ado.x);
        if (he.a) {
            arrayList.add(he.e);
            arrayList.add(he.d);
            arrayList.add(he.f);
        }
        arrayList.add(qa.a);
        arrayList.add(ado.a);
        arrayList.add(new sv(xgVar, 0));
        arrayList.add(new sv(xgVar, 1));
        ap apVar = new ap(xgVar);
        this.h = apVar;
        arrayList.add(apVar);
        arrayList.add(ado.ab);
        arrayList.add(new gr(xgVar, fcVar, lwVar, apVar, list4));
        this.i = Collections.unmodifiableList(arrayList);
    }

    public static void x(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final kv aa(fj fjVar) {
        boolean z;
        Objects.requireNonNull(fjVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f;
        kv kvVar = (kv) concurrentHashMap.get(fjVar);
        if (kvVar != null) {
            return kvVar;
        }
        ThreadLocal threadLocal = this.e;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            kv kvVar2 = (kv) map.get(fjVar);
            if (kvVar2 != null) {
                return kvVar2;
            }
            z = false;
        }
        try {
            ml mlVar = new ml();
            map.put(fjVar, mlVar);
            Iterator it = this.i.iterator();
            kv kvVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kvVarA = ((vq) it.next()).a(this, fjVar);
                if (kvVarA != null) {
                    if (mlVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    mlVar.a = kvVarA;
                    map.put(fjVar, kvVarA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (kvVarA != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return kvVarA;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + fjVar);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A0.kv ab(com.github.catvod.spider.merge.A0.vq r7, com.github.catvod.spider.merge.A0.fj r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            com.github.catvod.spider.merge.A0.ap r0 = r6.h
            r0.getClass()
            com.github.catvod.spider.merge.A0.ao r1 = com.github.catvod.spider.merge.A0.ap.b
            if (r7 != r1) goto L14
            goto L57
        L14:
            java.util.concurrent.ConcurrentHashMap r1 = r0.e
            java.lang.Class r2 = r8.a
            java.lang.Object r3 = r1.get(r2)
            com.github.catvod.spider.merge.A0.vq r3 = (com.github.catvod.spider.merge.A0.vq) r3
            if (r3 == 0) goto L23
            if (r3 != r7) goto L58
            goto L57
        L23:
            java.lang.Class<com.github.catvod.spider.merge.A0.kd> r3 = com.github.catvod.spider.merge.A0.kd.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            com.github.catvod.spider.merge.A0.kd r3 = (com.github.catvod.spider.merge.A0.kd) r3
            if (r3 != 0) goto L2e
            goto L58
        L2e:
            java.lang.Class r3 = r3.value()
            java.lang.Class<com.github.catvod.spider.merge.A0.vq> r4 = com.github.catvod.spider.merge.A0.vq.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3b
            goto L58
        L3b:
            com.github.catvod.spider.merge.A0.xg r4 = r0.d
            com.github.catvod.spider.merge.A0.fj r5 = new com.github.catvod.spider.merge.A0.fj
            r5.<init>(r3)
            com.github.catvod.spider.merge.A0.ub r3 = r4.e(r5)
            java.lang.Object r3 = r3.m()
            com.github.catvod.spider.merge.A0.vq r3 = (com.github.catvod.spider.merge.A0.vq) r3
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            com.github.catvod.spider.merge.A0.vq r1 = (com.github.catvod.spider.merge.A0.vq) r1
            if (r1 == 0) goto L55
            r3 = r1
        L55:
            if (r3 != r7) goto L58
        L57:
            r7 = r0
        L58:
            java.util.List r0 = r6.i
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            com.github.catvod.spider.merge.A0.vq r2 = (com.github.catvod.spider.merge.A0.vq) r2
            if (r1 != 0) goto L71
            if (r2 != r7) goto L5f
            r1 = 1
            goto L5f
        L71:
            com.github.catvod.spider.merge.A0.kv r2 = r2.a(r6, r8)
            if (r2 == 0) goto L5f
            return r2
        L78:
            if (r1 != 0) goto L7f
            com.github.catvod.spider.merge.A0.kv r7 = r6.aa(r8)
            return r7
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.oa.ab(com.github.catvod.spider.merge.A0.vq, com.github.catvod.spider.merge.A0.fj):com.github.catvod.spider.merge.A0.kv");
    }

    public final aag ac(Writer writer) {
        aag aagVar = new aag(writer);
        aagVar.y(this.n);
        aagVar.l = this.m;
        aagVar.z(2);
        aagVar.n = false;
        return aagVar;
    }

    public final String ad(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                ae(ac(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new yc(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            af(obj, cls, ac(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new yc(e2);
        }
    }

    public final void ae(aag aagVar) {
        aas aasVar = aas.f;
        int i = aagVar.k;
        boolean z = aagVar.l;
        boolean z2 = aagVar.n;
        aagVar.l = this.m;
        aagVar.n = false;
        if (i == 2) {
            aagVar.k = 1;
        }
        try {
            try {
                ado.z.getClass();
                vd.d(aagVar, aasVar);
                aagVar.z(i);
                aagVar.l = z;
                aagVar.n = z2;
            } catch (IOException e) {
                throw new yc(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            aagVar.z(i);
            aagVar.l = z;
            aagVar.n = z2;
            throw th;
        }
    }

    public final void af(Object obj, Class cls, aag aagVar) {
        kv kvVarAa = aa(new fj(cls));
        int i = aagVar.k;
        if (i == 2) {
            aagVar.k = 1;
        }
        boolean z = aagVar.l;
        boolean z2 = aagVar.n;
        aagVar.l = this.m;
        aagVar.n = false;
        try {
            try {
                kvVarAa.c(aagVar, obj);
            } catch (IOException e) {
                throw new yc(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e2.getMessage(), e2);
            }
        } finally {
            aagVar.z(i);
            aagVar.l = z;
            aagVar.n = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.i + ",instanceCreators:" + this.g + "}";
    }

    public final Object y(String str, fj fjVar) {
        Object objB = null;
        if (str == null) {
            return null;
        }
        rd rdVar = new rd(new StringReader(str));
        rdVar.an(2);
        int i = rdVar.o;
        boolean z = true;
        if (i == 2) {
            rdVar.o = 1;
        }
        try {
            try {
                try {
                    rdVar.ak();
                    z = false;
                    objB = aa(fjVar).b(rdVar);
                } catch (EOFException e) {
                    if (!z) {
                        throw new yc(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new yc(e2);
                }
                if (objB != null) {
                    try {
                        if (rdVar.ak() != 10) {
                            throw new yc("JSON document was not fully consumed.");
                        }
                    } catch (uc e3) {
                        throw new yc(e3);
                    } catch (IOException e4) {
                        throw new yc(e4);
                    }
                }
                return objB;
            } catch (IOException e5) {
                throw new yc(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e6.getMessage(), e6);
            }
        } finally {
            rdVar.an(i);
        }
    }

    public final Object z(String str, Class cls) {
        Object objY = y(str, new fj(cls));
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objY);
    }
}
