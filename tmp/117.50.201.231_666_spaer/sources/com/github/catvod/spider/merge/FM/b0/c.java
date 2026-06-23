package com.github.catvod.spider.merge.FM.b0;

import com.github.catvod.spider.merge.FM.L.P;
import com.github.catvod.spider.merge.FM.a.C0298a;
import com.github.catvod.spider.merge.FM.d0.d;
import com.github.catvod.spider.merge.FM.d0.f;
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

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class c {
    static volatile int a;
    static final d b = new d();
    static final C0298a c = new C0298a();
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
                f.c("Failed to instantiate SLF4J LoggerFactory", e2);
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                String message = e3.getMessage();
                boolean z = false;
                if (message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    z = true;
                }
                if (!z) {
                    a = 2;
                    f.c("Failed to instantiate SLF4J LoggerFactory", e3);
                    throw e3;
                }
                a = 4;
                f.b("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                f.b("Defaulting to no-operation (NOP) logger implementation");
                f.b("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    a = 2;
                    f.b("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    f.b("Your binding is version 1.5.5 or earlier.");
                    f.b("Upgrade your binding to version 1.6.x.");
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
            f.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.github.catvod.spider.merge.FM.b0.a, org.slf4j.ILoggerFactory] */
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
        Class<?> clsA;
        b bVarA = c().a(cls.getName());
        if (d && (clsA = f.a()) != null && (!clsA.isAssignableFrom(cls))) {
            f.b(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", bVarA.getName(), clsA.getName()));
            f.b("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
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

    private static void g() {
        d dVar = b;
        synchronized (dVar) {
            dVar.e();
            for (com.github.catvod.spider.merge.FM.d0.c cVar : (ArrayList) dVar.d()) {
                cVar.f(e(cVar.getName()));
            }
        }
        LinkedBlockingQueue<com.github.catvod.spider.merge.FM.c0.c> linkedBlockingQueueC = b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<com.github.catvod.spider.merge.FM.c0.c> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (com.github.catvod.spider.merge.FM.c0.c cVar2 : arrayList) {
                if (cVar2 != null) {
                    com.github.catvod.spider.merge.FM.d0.c cVarA = cVar2.a();
                    String name = cVarA.getName();
                    if (cVarA.d()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!cVarA.c()) {
                        if (cVarA.b()) {
                            cVarA.e(cVar2);
                        } else {
                            f.b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (cVar2.a().b()) {
                        f.b("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.b("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.b("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!cVar2.a().c()) {
                        f.b("The following set of substitute loggers may have been accessed");
                        f.b("during the initialization phase. Logging calls during this");
                        f.b("phase were not honored. However, subsequent logging calls to these");
                        f.b("loggers will work as normally expected.");
                        f.b("See also http://www.slf4j.org/codes.html#substituteLogger");
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
                StringBuilder sbB = P.b("Actual binding is of type [");
                sbB.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbB.append("]");
                f.b(sbB.toString());
            }
        }
    }

    private static void i(Set<URL> set) {
        if (set.size() > 1) {
            f.b("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                f.b("Found binding in [" + it.next() + "]");
            }
            f.b("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
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
            f.b("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            f.b("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            f.c("Unexpected problem occured during version sanity check", th);
        }
    }
}
