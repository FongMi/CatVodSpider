package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.D.e0;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.h0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1412a implements Q, InterfaceC1414c {
    public static int h;
    public static TimeZone b = TimeZone.getDefault();
    public static Locale c = Locale.getDefault();
    public static String d = "@type";
    static final f0[] e = new f0[0];
    public static String f = "yyyy-MM-dd HH:mm:ss";
    private static final ConcurrentHashMap<Type, Type> i = new ConcurrentHashMap<>(16);
    public static int g = (((((((com.github.catvod.spider.merge.B.c.AutoCloseSource.b | 0) | com.github.catvod.spider.merge.B.c.InternFieldNames.b) | com.github.catvod.spider.merge.B.c.UseBigDecimal.b) | com.github.catvod.spider.merge.B.c.AllowUnQuotedFieldNames.b) | com.github.catvod.spider.merge.B.c.AllowSingleQuotes.b) | com.github.catvod.spider.merge.B.c.AllowArbitraryCommas.b) | com.github.catvod.spider.merge.B.c.SortFeidFastMatch.b) | com.github.catvod.spider.merge.B.c.IgnoreNotMatch.b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    static {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.y.AbstractC1412a.<clinit>():void");
    }

    public static Type c(Type type) {
        if (type != null) {
            return i.get(type);
        }
        return null;
    }

    public static Object d(String str) {
        int i2 = g;
        com.github.catvod.spider.merge.B.o oVar = com.github.catvod.spider.merge.B.o.v;
        if (str == null) {
            return null;
        }
        com.github.catvod.spider.merge.B.b bVar = new com.github.catvod.spider.merge.B.b(str, oVar, i2);
        Object objO = bVar.o(null);
        bVar.k(objO);
        bVar.close();
        return objO;
    }

    public static Object e(String str, com.github.catvod.spider.merge.B.o oVar, int i2) {
        if (str == null) {
            return null;
        }
        com.github.catvod.spider.merge.B.b bVar = new com.github.catvod.spider.merge.B.b(str, oVar, i2);
        Object objO = bVar.o(null);
        bVar.k(objO);
        bVar.close();
        return objO;
    }

    public static C1416e g(String str) {
        Object objD = d(str);
        if (objD instanceof C1416e) {
            return (C1416e) objD;
        }
        try {
            return (C1416e) j(objD);
        } catch (RuntimeException e2) {
            throw new C1415d("can not cast to JSONObject.", e2);
        }
    }

    public static <T> T h(String str, Class<T> cls) {
        com.github.catvod.spider.merge.B.o oVar = com.github.catvod.spider.merge.B.o.v;
        int i2 = g;
        if (str.length() == 0) {
            return null;
        }
        com.github.catvod.spider.merge.B.b bVar = new com.github.catvod.spider.merge.B.b(str, oVar, i2);
        T t = (T) bVar.t(cls, null);
        bVar.k(t);
        bVar.close();
        return t;
    }

    public static Object j(Object obj) {
        return k(obj, e0.i);
    }

    public static Object k(Object obj, e0 e0Var) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof AbstractC1412a) {
            return obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            int size = map.size();
            C1416e c1416e = new C1416e((Map<String, Object>) (map instanceof LinkedHashMap ? new LinkedHashMap(size) : map instanceof TreeMap ? new TreeMap() : new HashMap(size)));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                boolean z = com.github.catvod.spider.merge.H.A.b;
                c1416e.put(key == null ? null : key.toString(), k(entry.getValue(), e0Var));
            }
            return c1416e;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            C1413b c1413b = new C1413b(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c1413b.add(k(it.next(), e0Var));
            }
            return c1413b;
        }
        if (obj instanceof com.github.catvod.spider.merge.D.J) {
            return d(l(obj));
        }
        Class<?> cls = obj.getClass();
        if (cls.isEnum()) {
            return ((Enum) obj).name();
        }
        boolean z2 = false;
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            C1413b c1413b2 = new C1413b(length);
            for (int i2 = 0; i2 < length; i2++) {
                c1413b2.add(j(Array.get(obj, i2)));
            }
            return c1413b2;
        }
        if (com.github.catvod.spider.merge.B.o.i(cls)) {
            return obj;
        }
        com.github.catvod.spider.merge.D.X xE = e0Var.e(cls);
        if (!(xE instanceof com.github.catvod.spider.merge.D.M)) {
            return d(m(obj, e0Var, new f0[]{null}, h, new i0[0]));
        }
        com.github.catvod.spider.merge.D.M m = (com.github.catvod.spider.merge.D.M) xE;
        InterfaceC1450d interfaceC1450dO = m.o();
        if (interfaceC1450dO != null) {
            boolean z3 = false;
            for (i0 i0Var : interfaceC1450dO.serialzeFeatures()) {
                if (i0Var == i0.SortField || i0Var == i0.MapSortField) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        C1416e c1416e2 = new C1416e(z2);
        try {
            for (Map.Entry entry2 : ((LinkedHashMap) m.n(obj)).entrySet()) {
                c1416e2.put((String) entry2.getKey(), k(entry2.getValue(), e0Var));
            }
            return c1416e2;
        } catch (Exception e2) {
            throw new C1415d("toJSON error", e2);
        }
    }

    public static String l(Object obj) {
        return m(obj, e0.i, e, h, new i0[0]);
    }

    public static String m(Object obj, e0 e0Var, f0[] f0VarArr, int i2, i0... i0VarArr) {
        h0 h0Var = new h0(i2, i0VarArr);
        try {
            com.github.catvod.spider.merge.D.L l = new com.github.catvod.spider.merge.D.L(h0Var, e0Var);
            if (f0VarArr != null) {
                for (f0 f0Var : f0VarArr) {
                    l.c(f0Var);
                }
            }
            l.u(obj);
            return h0Var.toString();
        } finally {
            h0Var.close();
        }
    }

    @Override // com.github.catvod.spider.merge.y.InterfaceC1414c
    public final String a() {
        h0 h0Var = new h0();
        try {
            new com.github.catvod.spider.merge.D.L(h0Var, e0.i).u(this);
            return h0Var.toString();
        } finally {
            h0Var.close();
        }
    }

    @Override // com.github.catvod.spider.merge.y.Q
    public final void b(Appendable appendable) {
        h0 h0Var = new h0();
        try {
            try {
                new com.github.catvod.spider.merge.D.L(h0Var, e0.i).u(this);
                appendable.append(h0Var.toString());
            } catch (IOException e2) {
                throw new C1415d(e2.getMessage(), e2);
            }
        } finally {
            h0Var.close();
        }
    }

    public final String toString() {
        return a();
    }
}
