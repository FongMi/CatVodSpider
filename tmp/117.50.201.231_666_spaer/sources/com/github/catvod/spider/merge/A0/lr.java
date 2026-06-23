package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class lr implements Serializable {
    public static final lr a = new lr(0);
    public static final ThreadLocal b;
    public boolean e;
    public boolean j;
    public final /* synthetic */ int s;
    public boolean c = true;
    public boolean d = true;
    public boolean f = true;
    public String g = "[";
    public String h = "]";
    public String i = "=";
    public String k = ",";
    public String l = "{";
    public String m = "}";
    public String n = "<null>";
    public String o = "<size=";
    public String p = ">";
    public String q = "<";
    public String r = ">";

    static {
        lr lrVar = new lr(2);
        lrVar.g = "[";
        String str = System.lineSeparator() + "  ";
        if (str == null) {
            str = "";
        }
        lrVar.k = str;
        lrVar.j = true;
        String str2 = System.lineSeparator() + "]";
        if (str2 == null) {
            str2 = "";
        }
        lrVar.h = str2;
        new lr(4).c = false;
        lr lrVar2 = new lr(5);
        lrVar2.e = true;
        lrVar2.f = false;
        lr lrVar3 = new lr(6);
        lrVar3.d = false;
        lrVar3.f = false;
        lrVar3.c = false;
        lrVar3.g = "";
        lrVar3.h = "";
        lr lrVar4 = new lr(3);
        lrVar4.d = false;
        lrVar4.f = false;
        lr lrVar5 = new lr(1);
        lrVar5.d = false;
        lrVar5.f = false;
        lrVar5.g = "{";
        lrVar5.h = "}";
        lrVar5.l = "[";
        lrVar5.m = "]";
        lrVar5.k = ",";
        lrVar5.i = ":";
        lrVar5.n = "null";
        lrVar5.q = "\"<";
        lrVar5.r = ">\"";
        lrVar5.o = "\"<size=";
        lrVar5.p = ">\"";
        b = new ThreadLocal();
    }

    public lr(int i) {
        this.s = i;
    }

    public static void t(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = b;
            if (((Map) threadLocal.get()) == null) {
                threadLocal.set(new WeakHashMap());
            }
            ((Map) threadLocal.get()).put(obj, null);
        }
    }

    public static void u(Object obj) {
        if (obj != null) {
            ThreadLocal threadLocal = b;
            Map map = (Map) threadLocal.get();
            if (map != null) {
                map.remove(obj);
                if (map.isEmpty()) {
                    threadLocal.remove();
                }
            }
        }
    }

    public final void aa(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        Map map = (Map) b.get();
        int i = 0;
        if (map != null && map.containsKey(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            Objects.requireNonNull(obj, new hc("object", new Object[0]));
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
            stringBuffer.append(name);
            stringBuffer.append('@');
            stringBuffer.append(hexString);
            return;
        }
        t(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    w(stringBuffer, str, (Collection) obj);
                } else {
                    ab(stringBuffer, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    x(stringBuffer, (Map) obj);
                } else {
                    ab(stringBuffer, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    long[] jArr = (long[]) obj;
                    stringBuffer.append(this.l);
                    while (i < jArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(jArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((long[]) obj).length);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    int[] iArr = (int[]) obj;
                    stringBuffer.append(this.l);
                    while (i < iArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(iArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((int[]) obj).length);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    short[] sArr = (short[]) obj;
                    stringBuffer.append(this.l);
                    while (i < sArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) sArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((short[]) obj).length);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer.append(this.l);
                    while (i < bArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append((int) bArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((byte[]) obj).length);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    char[] cArr = (char[]) obj;
                    stringBuffer.append(this.l);
                    while (i < cArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        char c = cArr[i];
                        switch (this.s) {
                            case 1:
                                String strValueOf = String.valueOf(c);
                                stringBuffer.append('\"');
                                stringBuffer.append(d.b(strValueOf));
                                stringBuffer.append('\"');
                                break;
                            default:
                                stringBuffer.append(c);
                                break;
                        }
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((char[]) obj).length);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    double[] dArr = (double[]) obj;
                    stringBuffer.append(this.l);
                    while (i < dArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(dArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((double[]) obj).length);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    float[] fArr = (float[]) obj;
                    stringBuffer.append(this.l);
                    while (i < fArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(fArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((float[]) obj).length);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    boolean[] zArr = (boolean[]) obj;
                    stringBuffer.append(this.l);
                    while (i < zArr.length) {
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(zArr[i]);
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((boolean[]) obj).length);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    Object[] objArr = (Object[]) obj;
                    stringBuffer.append(this.l);
                    while (i < objArr.length) {
                        Object obj2 = objArr[i];
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj2 == null) {
                            stringBuffer.append(this.n);
                        } else {
                            aa(stringBuffer, str, obj2, true);
                        }
                        i++;
                    }
                    stringBuffer.append(this.m);
                } else {
                    ab(stringBuffer, ((Object[]) obj).length);
                }
            } else if (z) {
                v(stringBuffer, str, obj);
            } else {
                stringBuffer.append(this.q);
                stringBuffer.append(sp.c(obj.getClass()));
                stringBuffer.append(this.r);
            }
            u(obj);
        } catch (Throwable th) {
            u(obj);
            throw th;
        }
    }

    public final void ab(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.o);
        stringBuffer.append(i);
        stringBuffer.append(this.p);
    }

    public void v(StringBuffer stringBuffer, String str, Object obj) {
        switch (this.s) {
            case 1:
                if (obj == null) {
                    stringBuffer.append(this.n);
                } else if ((obj instanceof String) || (obj instanceof Character)) {
                    String string = obj.toString();
                    stringBuffer.append('\"');
                    stringBuffer.append(d.b(string));
                    stringBuffer.append('\"');
                } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
                    stringBuffer.append(obj);
                } else {
                    String string2 = obj.toString();
                    if ((string2.startsWith(this.g) && string2.endsWith(this.h)) || (string2.startsWith(this.l) && string2.endsWith(this.m))) {
                        stringBuffer.append(obj);
                    } else {
                        v(stringBuffer, str, string2);
                    }
                }
                break;
            default:
                stringBuffer.append(obj);
                break;
        }
    }

    public void w(StringBuffer stringBuffer, String str, Collection collection) {
        switch (this.s) {
            case 1:
                if (collection == null || collection.isEmpty()) {
                    stringBuffer.append(collection);
                } else {
                    stringBuffer.append(this.l);
                    int i = 0;
                    for (Object obj : collection) {
                        int i2 = i + 1;
                        if (i > 0) {
                            stringBuffer.append(",");
                        }
                        if (obj == null) {
                            stringBuffer.append(this.n);
                        } else {
                            aa(stringBuffer, str, obj, true);
                        }
                        i = i2;
                    }
                    stringBuffer.append(this.m);
                }
                break;
            default:
                stringBuffer.append(collection);
                break;
        }
    }

    public void x(StringBuffer stringBuffer, Map map) {
        switch (this.s) {
            case 1:
                if (map == null || map.isEmpty()) {
                    stringBuffer.append(map);
                } else {
                    stringBuffer.append(this.g);
                    boolean z = true;
                    for (Map.Entry entry : map.entrySet()) {
                        String string = Objects.toString(entry.getKey(), null);
                        if (string != null) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append(this.k);
                            }
                            y(stringBuffer, string);
                            Object value = entry.getValue();
                            if (value == null) {
                                stringBuffer.append(this.n);
                            } else {
                                aa(stringBuffer, string, value, true);
                            }
                        }
                    }
                    stringBuffer.append(this.h);
                }
                break;
            default:
                stringBuffer.append(map);
                break;
        }
    }

    public void y(StringBuffer stringBuffer, String str) {
        switch (this.s) {
            case 1:
                z(stringBuffer, "\"" + d.b(str) + "\"");
                break;
            default:
                z(stringBuffer, str);
                break;
        }
    }

    public final void z(StringBuffer stringBuffer, String str) {
        if (!this.c || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.i);
    }
}
