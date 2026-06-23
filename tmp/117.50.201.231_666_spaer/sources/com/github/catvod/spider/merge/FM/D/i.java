package com.github.catvod.spider.merge.FM.D;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class i implements Serializable {
    public static final i q = new b();
    private static final ThreadLocal<WeakHashMap<Object, Object>> r;
    private boolean c;
    private boolean h;
    private boolean a = true;
    private boolean b = true;
    private boolean d = true;
    private String e = "[";
    private String f = "]";
    private String g = "=";
    private String i = ",";
    private String j = "{";
    private String k = "}";
    private String l = "<null>";
    private String m = "<size=";
    private String n = ">";
    private String o = "<";
    private String p = ">";

    static {
        new d();
        new f();
        new g();
        new h();
        new e();
        new c();
        r = new ThreadLocal<>();
    }

    protected i() {
    }

    static void L(Object obj) {
        Map<Object, Object> mapT;
        if (obj == null || (mapT = t()) == null) {
            return;
        }
        mapT.remove(obj);
        if (mapT.isEmpty()) {
            r.remove();
        }
    }

    static Map<Object, Object> t() {
        return r.get();
    }

    static void u(Object obj) {
        if (obj != null) {
            if (t() == null) {
                r.set(new WeakHashMap<>());
            }
            t().put(obj, null);
        }
    }

    protected final void A(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
    }

    protected final void B() {
        this.h = true;
    }

    protected final void C() {
        this.l = "null";
    }

    protected final void D() {
        this.n = ">\"";
    }

    protected final void E() {
        this.m = "\"<size=";
    }

    protected final void F() {
        this.p = ">\"";
    }

    protected final void G() {
        this.o = "\"<";
    }

    protected final void H() {
        this.b = false;
    }

    protected final void I() {
        this.a = false;
    }

    protected final void J() {
        this.d = false;
    }

    protected final void K() {
        this.c = true;
    }

    public void a(StringBuffer stringBuffer, Object obj) {
        j(stringBuffer, "value");
        if (obj == null) {
            stringBuffer.append(this.l);
        } else {
            k(stringBuffer, "value", obj, true);
        }
        stringBuffer.append(this.i);
    }

    public final void b(StringBuffer stringBuffer, String str, boolean z) {
        j(stringBuffer, str);
        stringBuffer.append(z);
        stringBuffer.append(this.i);
    }

    protected void c(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    protected final void d(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(",");
        }
        if (obj == null) {
            stringBuffer.append(this.l);
        } else {
            k(stringBuffer, str, obj, true);
        }
    }

    protected void e(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected void f(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected void g(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    public final void h(StringBuffer stringBuffer, Object obj) {
        if (com.github.catvod.spider.merge.FM.C.h.a(stringBuffer, this.i)) {
            stringBuffer.setLength(stringBuffer.length() - this.i.length());
        }
        stringBuffer.append(this.f);
        L(obj);
    }

    protected final void i(StringBuffer stringBuffer) {
        stringBuffer.append(this.i);
    }

    protected void j(StringBuffer stringBuffer, String str) {
        if (!this.a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.g);
    }

    protected final void k(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map<Object, Object> mapT = t();
        int i = 0;
        if ((mapT != null && mapT.containsKey(obj)) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            com.github.catvod.spider.merge.FM.C.d.a(stringBuffer, obj);
            return;
        }
        u(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    f(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    n(stringBuffer, size);
                }
            } else if (obj instanceof Map) {
                if (z) {
                    g(stringBuffer, (Map) obj);
                } else {
                    size = ((Map) obj).size();
                    n(stringBuffer, size);
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.j);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.j);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.j);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.j);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.j);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        c(stringBuffer, cArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.j);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.j);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.j);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.j);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.l);
                        } else {
                            k(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.k);
                } else {
                    n(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                e(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.o);
                stringBuffer.append(com.github.catvod.spider.merge.FM.C.b.a(obj.getClass()));
                stringBuffer.append(this.p);
            }
        } finally {
            L(obj);
        }
    }

    protected final void l(StringBuffer stringBuffer) {
        stringBuffer.append(this.l);
    }

    public final void m(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            if (this.b) {
                u(obj);
                boolean z = this.c;
                Class<?> cls = obj.getClass();
                stringBuffer.append(z ? com.github.catvod.spider.merge.FM.C.b.a(cls) : cls.getName());
            }
            if (this.d) {
                u(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(this.e);
            if (this.h) {
                stringBuffer.append(this.i);
            }
        }
    }

    protected final void n(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.m);
        stringBuffer.append(i);
        stringBuffer.append(this.n);
    }

    protected final String o() {
        return this.k;
    }

    protected final String p() {
        return this.j;
    }

    protected final String q() {
        return this.f;
    }

    protected final String r() {
        return this.e;
    }

    protected final String s() {
        return this.l;
    }

    protected final void v() {
        this.k = "]";
    }

    protected final void w() {
        this.j = "[";
    }

    protected final void x(String str) {
        if (str == null) {
            str = "";
        }
        this.f = str;
    }

    protected final void y(String str) {
        this.e = str;
    }

    protected final void z() {
        this.g = ":";
    }
}
