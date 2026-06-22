package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.E.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class b implements Serializable {
    public static final b p = new b(0);
    public static final ThreadLocal q;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public String d;
    public String e;
    public final String f;
    public boolean g;
    public String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    static {
        new b(1);
        q = new ThreadLocal();
    }

    public b(byte b) {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = "[";
        this.e = "]";
        this.f = "=";
        this.h = ",";
        this.i = "{";
        this.j = "}";
        this.k = "<null>";
        this.l = "<size=";
        this.m = ">";
        this.n = "<";
        this.o = ">";
    }

    public static void i(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = q;
            if (((Map) threadLocal.get()) == null) {
                threadLocal.set(new WeakHashMap());
            }
            ((Map) threadLocal.get()).put(obj, null);
        }
    }

    public static void j(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = q;
            Map map = (Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.remove();
                }
            }
        }
    }

    public void a(StringBuffer stringBuffer, Object obj) {
        f(stringBuffer, "value");
        if (obj == null) {
            stringBuffer.append(this.k);
        } else {
            g(stringBuffer, "value", obj, true);
        }
        stringBuffer.append(this.h);
    }

    public void b(StringBuffer stringBuffer, char c) {
        stringBuffer.append(c);
    }

    public void c(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    public void d(StringBuffer stringBuffer, String str, Collection collection) {
        stringBuffer.append(collection);
    }

    public void e(StringBuffer stringBuffer, Map map) {
        stringBuffer.append(map);
    }

    public void f(StringBuffer stringBuffer, String str) {
        if (!this.a || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f);
    }

    public final void g(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        int size;
        Map map = (Map) q.get();
        int i = 0;
        if (map != null && map.containsKey(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            Objects.requireNonNull(obj, new e("object", new Object[0]));
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
            stringBuffer.append(name);
            stringBuffer.append('@');
            stringBuffer.append(hexString);
            return;
        }
        i(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    d(stringBuffer, str, (Collection) obj);
                } else {
                    size = ((Collection) obj).size();
                    h(stringBuffer, size);
                }
            } else if (obj instanceof Map) {
                if (z) {
                    e(stringBuffer, (Map) obj);
                } else {
                    size = ((Map) obj).size();
                    h(stringBuffer, size);
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.i);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.i);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.i);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.i);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.i);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        b(stringBuffer, cArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.i);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.i);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.i);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.i);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.k);
                        } else {
                            g(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.j);
                } else {
                    h(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                c(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.n);
                stringBuffer.append(com.github.catvod.spider.merge.E.a.a(obj.getClass()));
                stringBuffer.append(this.o);
            }
            j(obj);
        } catch (Throwable th) {
            j(obj);
            throw th;
        }
    }

    public final void h(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.l);
        stringBuffer.append(i);
        stringBuffer.append(this.m);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i) {
        this((byte) 0);
        switch (i) {
            case 1:
                this((byte) 0);
                this.d = "[";
                String str = System.lineSeparator() + "  ";
                this.h = str == null ? "" : str;
                this.g = true;
                String str2 = System.lineSeparator() + "]";
                this.e = str2 != null ? str2 : "";
                break;
            default:
                break;
        }
    }
}
