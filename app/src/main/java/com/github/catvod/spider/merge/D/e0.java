package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.z.InterfaceC1448b;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e0 {
    public static final e0 i = new e0();
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l = false;
    private static boolean m = false;
    private static boolean n = false;
    private static boolean o = false;
    private boolean a;
    private C0601b b;
    protected String c = AbstractC1412a.d;
    private long[] g = {4165360493669296979L, 4446674157046724083L};
    private List<com.github.catvod.spider.merge.E.a> h = new ArrayList();
    private final boolean f = false;
    private final com.github.catvod.spider.merge.H.k<Type, X> d = new com.github.catvod.spider.merge.H.k<>(8192);
    private final com.github.catvod.spider.merge.H.k<Type, com.github.catvod.spider.merge.H.k<Type, X>> e = new com.github.catvod.spider.merge.H.k<>(16);

    public e0() {
        this.a = !com.github.catvod.spider.merge.H.c.a;
        try {
            if (this.a) {
                this.b = new C0601b();
            }
        } catch (Throwable unused) {
            this.a = false;
        }
        f(Boolean.class, C0614o.a);
        f(Character.class, C0618t.a);
        G g = G.a;
        f(Byte.class, g);
        f(Short.class, g);
        f(Integer.class, g);
        f(Long.class, S.a);
        f(Float.class, E.b);
        f(Double.class, C0624z.b);
        f(BigDecimal.class, C0612m.c);
        f(BigInteger.class, C0613n.c);
        f(String.class, j0.a);
        Y y = Y.a;
        f(byte[].class, y);
        f(short[].class, y);
        f(int[].class, y);
        f(long[].class, y);
        f(float[].class, y);
        f(double[].class, y);
        f(boolean[].class, y);
        f(char[].class, y);
        f(Object[].class, W.a);
        U u = U.b;
        f(Class.class, u);
        f(SimpleDateFormat.class, u);
        f(Currency.class, new U());
        f(TimeZone.class, u);
        f(InetAddress.class, u);
        f(Inet4Address.class, u);
        f(Inet6Address.class, u);
        f(InetSocketAddress.class, u);
        f(File.class, u);
        C0605f c0605f = C0605f.a;
        f(Appendable.class, c0605f);
        f(StringBuffer.class, c0605f);
        f(StringBuilder.class, c0605f);
        k0 k0Var = k0.a;
        f(Charset.class, k0Var);
        f(Pattern.class, k0Var);
        f(Locale.class, k0Var);
        f(URI.class, k0Var);
        f(URL.class, k0Var);
        f(UUID.class, k0Var);
        C0607h c0607h = C0607h.a;
        f(AtomicBoolean.class, c0607h);
        f(AtomicInteger.class, c0607h);
        f(AtomicLong.class, c0607h);
        b0 b0Var = b0.a;
        f(AtomicReference.class, b0Var);
        f(AtomicIntegerArray.class, c0607h);
        f(AtomicLongArray.class, c0607h);
        f(WeakReference.class, b0Var);
        f(SoftReference.class, b0Var);
        f(LinkedList.class, C0620v.a);
    }

    private final M a(d0 d0Var) {
        M mK = this.b.k(d0Var);
        int i2 = 0;
        while (true) {
            D[] dArr = mK.j;
            if (i2 >= dArr.length) {
                return mK;
            }
            Class<?> cls = dArr[i2].b.f;
            if (cls.isEnum()) {
                boolean z = e(cls) instanceof A;
            }
            i2++;
        }
    }

    private static Member d(Class cls) {
        Field field = null;
        for (Method method : cls.getMethods()) {
            if (method.getReturnType() != Void.class && ((InterfaceC1448b) method.getAnnotation(InterfaceC1448b.class)) != null) {
                if (field != null) {
                    return null;
                }
                field = method;
            }
        }
        for (Field field2 : cls.getFields()) {
            if (((InterfaceC1448b) field2.getAnnotation(InterfaceC1448b.class)) != null) {
                if (field != null) {
                    return null;
                }
                field = field2;
            }
        }
        return field;
    }

    public final X b(Class<?> cls) {
        Method method;
        String name = cls.getName();
        if (Arrays.binarySearch(this.g, com.github.catvod.spider.merge.H.A.z(name)) >= 0) {
            throw new C1415d(C1290c.a("not support class : ", name));
        }
        d0 d0VarB = com.github.catvod.spider.merge.H.A.b(cls, this.f);
        if (d0VarB.e.length == 0 && Iterable.class.isAssignableFrom(cls)) {
            return U.b;
        }
        InterfaceC1450d interfaceC1450d = d0VarB.d;
        boolean z = false;
        boolean z2 = this.a && !this.f;
        if (interfaceC1450d != null) {
            Class<?> clsSerializer = interfaceC1450d.serializer();
            if (clsSerializer != Void.class) {
                try {
                    Object objNewInstance = clsSerializer.newInstance();
                    if (objNewInstance instanceof X) {
                        return (X) objNewInstance;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!interfaceC1450d.asm()) {
                z2 = false;
            }
            if (z2) {
                for (i0 i0Var : interfaceC1450d.serialzeFeatures()) {
                    if (i0.WriteNonStringValueAsString == i0Var || i0.WriteEnumUsingToString == i0Var || i0.NotWriteDefaultValue == i0Var || i0.BrowserCompatible == i0Var) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2 && interfaceC1450d.serialzeFilters().length != 0) {
                z2 = false;
            }
        }
        Class<?> cls2 = d0VarB.a;
        if (!Modifier.isPublic(cls2.getModifiers())) {
            return new M(d0VarB);
        }
        if ((z2 && this.b.a.b(cls2)) || cls2 == Serializable.class || cls2 == Object.class) {
            z2 = false;
        }
        if (z2 && !com.github.catvod.spider.merge.H.c.a(cls2.getSimpleName())) {
            z2 = false;
        }
        if (z2 && d0VarB.a.isInterface()) {
            z2 = false;
        }
        if (z2) {
            for (com.github.catvod.spider.merge.H.e eVar : d0VarB.e) {
                Field field = eVar.d;
                if ((field != null && !field.getType().equals(eVar.f)) || (((method = eVar.c) != null && !method.getReturnType().equals(eVar.f)) || (eVar.f.isEnum() && c(eVar.f) != A.b))) {
                    break;
                }
                InterfaceC1448b interfaceC1448bC = eVar.c();
                if (interfaceC1448bC != null) {
                    String str = interfaceC1448bC.format();
                    if ((str.length() != 0 && (eVar.f != String.class || !"trim".equals(str))) || !com.github.catvod.spider.merge.H.c.a(interfaceC1448bC.name()) || interfaceC1448bC.jsonDirect() || interfaceC1448bC.serializeUsing() != Void.class || interfaceC1448bC.unwrapped()) {
                        break;
                    }
                    for (i0 i0Var2 : interfaceC1448bC.serialzeFeatures()) {
                        if (i0.WriteNonStringValueAsString == i0Var2 || i0.WriteEnumUsingToString == i0Var2 || i0.NotWriteDefaultValue == i0Var2 || i0.BrowserCompatible == i0Var2 || i0.WriteClassName == i0Var2) {
                            z2 = false;
                            break;
                        }
                    }
                    if (com.github.catvod.spider.merge.H.A.a0(method) || com.github.catvod.spider.merge.H.A.Z(method) || (interfaceC1448bC.defaultValue() != null && !"".equals(interfaceC1448bC.defaultValue()))) {
                        break;
                    }
                }
            }
            z = z2;
        } else {
            z = z2;
        }
        if (z) {
            try {
                return a(d0VarB);
            } catch (ClassCastException | ClassFormatError | ClassNotFoundException unused2) {
            } catch (OutOfMemoryError e) {
                if (e.getMessage().indexOf("Metaspace") != -1) {
                    throw e;
                }
            } catch (Throwable th) {
                throw new C1415d("create asm serializer error, verson 1.2.83, class " + cls2, th);
            }
        }
        return new M(d0VarB);
    }

    public final X c(Type type) {
        X xB;
        Type typeC = AbstractC1412a.c(type);
        if (typeC == null) {
            xB = this.d.b(type);
        } else {
            com.github.catvod.spider.merge.H.k<Type, X> kVarB = this.e.b(type);
            if (kVarB == null) {
                return null;
            }
            xB = kVarB.b(typeC);
        }
        return xB;
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.E.a>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.D.X e(java.lang.Class<?> r21) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.e0.e(java.lang.Class):com.github.catvod.spider.merge.D.X");
    }

    public final boolean f(Type type, X x) {
        Type typeC = AbstractC1412a.c(type);
        if (typeC == null) {
            return this.d.c(type, x);
        }
        com.github.catvod.spider.merge.H.k<Type, X> kVarB = this.e.b(type);
        if (kVarB == null) {
            kVarB = new com.github.catvod.spider.merge.H.k<>(4);
            this.e.c(type, kVarB);
        }
        return kVarB.c(typeC, x);
    }

    public final void g() {
        if (com.github.catvod.spider.merge.H.c.a) {
            return;
        }
        this.a = false;
    }
}
