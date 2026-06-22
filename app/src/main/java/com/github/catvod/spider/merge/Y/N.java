package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.I.t0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class N implements InterfaceC1414c {
    private static ConcurrentMap<String, N> g = new ConcurrentHashMap(128, 0.75f, 1);
    private final String b;
    private G[] c;
    private e0 d;
    private com.github.catvod.spider.merge.B.o e;
    private boolean f;

    public N(String str, e0 e0Var, com.github.catvod.spider.merge.B.o oVar) {
        if (str == null || str.length() == 0) {
            throw new O("json-path can not be null or empty");
        }
        this.b = str;
        this.d = e0Var;
        this.e = oVar;
        this.f = true;
    }

    static int b(Object obj, Object obj2) {
        Object d;
        Object f;
        if (obj.getClass() != obj2.getClass()) {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = obj2.getClass();
            if (cls == BigDecimal.class) {
                if (cls2 == Integer.class) {
                    f = new BigDecimal(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f = new BigDecimal(((Long) obj2).longValue());
                } else if (cls2 == Float.class) {
                    f = new BigDecimal(((Float) obj2).floatValue());
                } else if (cls2 == Double.class) {
                    f = new BigDecimal(((Double) obj2).doubleValue());
                }
                obj2 = f;
            } else if (cls == Long.class) {
                if (cls2 == Integer.class) {
                    f = new Long(((Integer) obj2).intValue());
                    obj2 = f;
                } else {
                    if (cls2 == BigDecimal.class) {
                        d = new BigDecimal(((Long) obj).longValue());
                    } else if (cls2 == Float.class) {
                        d = new Float(((Long) obj).longValue());
                    } else if (cls2 == Double.class) {
                        d = new Double(((Long) obj).longValue());
                    }
                    obj = d;
                }
            } else if (cls == Integer.class) {
                if (cls2 == Long.class) {
                    d = new Long(((Integer) obj).intValue());
                } else if (cls2 == BigDecimal.class) {
                    d = new BigDecimal(((Integer) obj).intValue());
                } else if (cls2 == Float.class) {
                    d = new Float(((Integer) obj).intValue());
                } else if (cls2 == Double.class) {
                    d = new Double(((Integer) obj).intValue());
                }
                obj = d;
            } else if (cls == Double.class) {
                if (cls2 == Integer.class) {
                    f = new Double(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f = new Double(((Long) obj2).longValue());
                } else if (cls2 == Float.class) {
                    f = new Double(((Float) obj2).floatValue());
                }
                obj2 = f;
            } else if (cls == Float.class) {
                if (cls2 == Integer.class) {
                    f = new Float(((Integer) obj2).intValue());
                } else if (cls2 == Long.class) {
                    f = new Float(((Long) obj2).longValue());
                } else if (cls2 == Double.class) {
                    d = new Double(((Float) obj).floatValue());
                    obj = d;
                }
                obj2 = f;
            }
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, com.github.catvod.spider.merge.y.N>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, com.github.catvod.spider.merge.y.N>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, com.github.catvod.spider.merge.y.N>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, com.github.catvod.spider.merge.y.N>] */
    public static N c(String str) {
        if (str == null) {
            throw new O("jsonpath can not be null");
        }
        N n = (N) g.get(str);
        if (n != null) {
            return n;
        }
        N n2 = new N(str, e0.i, com.github.catvod.spider.merge.B.o.v);
        if (g.size() >= 1024) {
            return n2;
        }
        g.putIfAbsent(str, n2);
        return (N) g.get(str);
    }

    protected static boolean n(Class<?> cls) {
        return cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class;
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1414c
    public final String a() {
        return AbstractC1412a.l(this.b);
    }

    protected final void d(Object obj, List<Object> list) {
        Collection collectionM;
        Class<?> cls = obj.getClass();
        com.github.catvod.spider.merge.D.M mJ = j(cls);
        if (mJ != null) {
            try {
                collectionM = mJ.m(obj);
            } catch (Exception e) {
                StringBuilder sbB = t0.b("jsonpath error, path ");
                sbB.append(this.b);
                throw new O(sbB.toString(), e);
            }
        } else {
            collectionM = obj instanceof Map ? ((Map) obj).values() : obj instanceof Collection ? (Collection) obj : null;
        }
        if (collectionM == null) {
            throw new UnsupportedOperationException(cls.getName());
        }
        for (Object obj2 : collectionM) {
            if (obj2 == null || com.github.catvod.spider.merge.B.o.i(obj2.getClass())) {
                list.add(obj2);
            } else {
                d(obj2, list);
            }
        }
    }

    protected final void e(Object obj, String str, List<Object> list) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (str.equals(entry.getKey())) {
                    if (value instanceof Collection) {
                        list.addAll((Collection) value);
                    } else {
                        list.add(value);
                    }
                } else if (value != null && !com.github.catvod.spider.merge.B.o.i(value.getClass())) {
                    e(value, str, list);
                }
            }
            return;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                if (!com.github.catvod.spider.merge.B.o.i(obj2.getClass())) {
                    e(obj2, str, list);
                }
            }
            return;
        }
        com.github.catvod.spider.merge.D.M mJ = j(obj.getClass());
        if (mJ == null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                for (int i = 0; i < list2.size(); i++) {
                    e(list2.get(i), str, list);
                }
                return;
            }
            return;
        }
        try {
            com.github.catvod.spider.merge.D.D dK = mJ.k(str);
            if (dK == null) {
                Iterator it = ((ArrayList) mJ.m(obj)).iterator();
                while (it.hasNext()) {
                    e(it.next(), str, list);
                }
                return;
            }
            try {
                try {
                    list.add(dK.b(obj));
                } catch (InvocationTargetException e) {
                    throw new C1415d("getFieldValue error." + str, e);
                }
            } catch (IllegalAccessException e2) {
                throw new C1415d("getFieldValue error." + str, e2);
            }
        } catch (Exception e3) {
            throw new O(z.b(t0.b("jsonpath error, path "), this.b, ", segement ", str), e3);
        }
    }

    public final Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        m();
        int i = 0;
        Object objA = obj;
        while (true) {
            G[] gArr = this.c;
            if (i >= gArr.length) {
                return objA;
            }
            objA = gArr[i].a(this, obj, objA);
            i++;
        }
    }

    final Set<?> g(Object obj) {
        com.github.catvod.spider.merge.D.M mJ;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).keySet();
        }
        if ((obj instanceof Collection) || (obj instanceof Object[]) || obj.getClass().isArray() || (mJ = j(obj.getClass())) == null) {
            return null;
        }
        try {
            return mJ.j(obj);
        } catch (Exception e) {
            StringBuilder sbB = t0.b("evalKeySet error : ");
            sbB.append(this.b);
            throw new O(sbB.toString(), e);
        }
    }

    final int h(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        if (obj instanceof Object[]) {
            return ((Object[]) obj).length;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj);
        }
        if (obj instanceof Map) {
            int i = 0;
            Iterator it = ((Map) obj).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    i++;
                }
            }
            return i;
        }
        com.github.catvod.spider.merge.D.M mJ = j(obj.getClass());
        if (mJ == null) {
            return -1;
        }
        try {
            return mJ.p(obj);
        } catch (Exception e) {
            StringBuilder sbB = t0.b("evalSize error : ");
            sbB.append(this.b);
            throw new O(sbB.toString(), e);
        }
    }

    protected final Object i(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i >= 0) {
                if (i < list.size()) {
                    return list.get(i);
                }
                return null;
            }
            if (Math.abs(i) <= list.size()) {
                return list.get(list.size() + i);
            }
            return null;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            if (i >= 0) {
                if (i < length) {
                    return Array.get(obj, i);
                }
                return null;
            }
            if (Math.abs(i) <= length) {
                return Array.get(obj, length + i);
            }
            return null;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(Integer.valueOf(i));
            return obj2 == null ? map.get(Integer.toString(i)) : obj2;
        }
        if (!(obj instanceof Collection)) {
            if (i == 0) {
                return obj;
            }
            throw new UnsupportedOperationException();
        }
        int i2 = 0;
        for (Object obj3 : (Collection) obj) {
            if (i2 == i) {
                return obj3;
            }
            i2++;
        }
        return null;
    }

    protected final com.github.catvod.spider.merge.D.M j(Class<?> cls) {
        com.github.catvod.spider.merge.D.X xE = this.d.e(cls);
        if (xE instanceof com.github.catvod.spider.merge.D.M) {
            return (com.github.catvod.spider.merge.D.M) xE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9 A[PHI: r1
      0x00f9: PHI (r1v22 java.lang.Object) = (r1v21 java.lang.Object), (r1v23 java.lang.Object), (r1v23 java.lang.Object) binds: [B:68:0x00e2, B:73:0x00f3, B:75:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object k(java.lang.Object r8, java.lang.String r9, long r10) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.N.k(java.lang.Object, java.lang.String, long):java.lang.Object");
    }

    protected final Collection<Object> l(Object obj) {
        if (obj == null) {
            return null;
        }
        com.github.catvod.spider.merge.D.M mJ = j(obj.getClass());
        if (mJ != null) {
            try {
                return mJ.m(obj);
            } catch (Exception e) {
                StringBuilder sbB = t0.b("jsonpath error, path ");
                sbB.append(this.b);
                throw new O(sbB.toString(), e);
            }
        }
        if (obj instanceof Map) {
            return ((Map) obj).values();
        }
        if (obj instanceof Collection) {
            return (Collection) obj;
        }
        throw new UnsupportedOperationException();
    }

    protected final void m() {
        if (this.c != null) {
            return;
        }
        if ("*".equals(this.b)) {
            this.c = new G[]{M.b};
            return;
        }
        C1428q c1428q = new C1428q(this.b);
        this.c = c1428q.c();
        boolean unused = c1428q.e;
    }

    public final boolean o() {
        try {
            m();
            int i = 0;
            while (true) {
                G[] gArr = this.c;
                if (i >= gArr.length) {
                    return true;
                }
                Class<?> cls = gArr[i].getClass();
                if (cls != C1418g.class && cls != C1410B.class) {
                    return false;
                }
                i++;
            }
        } catch (O unused) {
            return false;
        }
    }
}
