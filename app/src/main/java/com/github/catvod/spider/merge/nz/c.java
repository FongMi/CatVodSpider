package com.github.catvod.spider.merge.nz;

import com.github.catvod.spider.merge.Dw.d;
import com.github.catvod.spider.merge.Dw.h;
import com.github.catvod.spider.merge.Dw.q;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c {
    static volatile int a;
    static final d b = new d();
    static final q c = new q();
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        String property = null;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private c() {
    }

    private static final void a() {
        Set<URL> setB = null;
        try {
            try {
                if (!f()) {
                    setB = b();
                    i(setB);
                }
                StaticLoggerBinder.getSingleton();
                a = 3;
                h(setB);
            } catch (Exception e2) {
                a = 2;
                h.c("Failed to instantiate SLF4J LoggerFactory", e2);
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                String message = e3.getMessage();
                boolean z = false;
                if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    z = true;
                }
                if (!z) {
                    a = 2;
                    h.c("Failed to instantiate SLF4J LoggerFactory", e3);
                    throw e3;
                }
                a = 4;
                h.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                h.b("Defaulting to no-operation (NOP) logger implementation");
                h.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    a = 2;
                    h.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    h.b("Your binding is version 1.5.5 or earlier.");
                    h.b("Upgrade your binding to version 1.6.x.");
                }
                throw e4;
            }
        } finally {
            g();
        }
    }

    static Set<URL> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = c.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            h.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.catvod.spider.merge.Dw.d, com.github.catvod.spider.merge.nz.a] */
    public static a c() {
        if (a == 0) {
            synchronized (c.class) {
                if (a == 0) {
                    a = 1;
                    a();
                    if (a == 3) {
                        j();
                    }
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static b d(Class<?> cls) {
        Class clsA;
        b bVarA = c().a(cls.getName());
        if (d && (clsA = h.a()) != null && (!clsA.isAssignableFrom(cls))) {
            h.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", bVarA.b(), clsA.getName()));
            h.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return bVarA;
    }

    public static b e(String str) {
        return c().a(str);
    }

    private static boolean f() {
        String property = null;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.github.catvod.spider.merge.mk.b, com.github.catvod.spider.merge.mk.c] */
    private static void g() {
        d dVar = b;
        synchronized (dVar) {
            dVar.e();
            for (com.github.catvod.spider.merge.Dw.c cVar : (ArrayList) dVar.d()) {
                cVar.g(e(cVar.b()));
            }
        }
        LinkedBlockingQueue linkedBlockingQueueC = b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<??> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (Object r6 : arrayList) {
                if (r6 != 0) {
                    com.github.catvod.spider.merge.Dw.c cVarA = r6.a();
                    String strB = cVarA.b();
                    if (cVarA.e()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!cVarA.d()) {
                        if (cVarA.c()) {
                            cVarA.f(r6);
                        } else {
                            h.b(strB);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (r6.a().c()) {
                        h.b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        h.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        h.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!r6.a().d()) {
                        h.b("The following set of substitute loggers may have been accessed");
                        h.b("during the initialization phase. Logging calls during this");
                        h.b("phase were not honored. However, subsequent logging calls to these");
                        h.b("loggers will work as normally expected.");
                        h.b("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        b.b();
    }

    private static void h(Set<URL> set) {
        if (set != null) {
            if (set.size() > 1) {
                StringBuilder sbB = com.github.catvod.spider.merge.ka.d.b("Actual binding is of type [");
                sbB.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbB.append("]");
                h.b(sbB.toString());
            }
        }
    }

    private static void i(Set<URL> set) {
        if (set.size() > 1) {
            h.b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                h.b("Found binding in [" + it.next() + "]");
            }
            h.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            h.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            h.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            h.c("Unexpected problem occured during version sanity check", th);
        }
    }
}
