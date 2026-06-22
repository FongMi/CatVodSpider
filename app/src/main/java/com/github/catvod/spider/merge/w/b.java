package com.github.catvod.spider.merge.W;

import com.github.catvod.spider.merge.Y.c;
import com.github.catvod.spider.merge.Y.d;
import com.github.catvod.spider.merge.Y.e;
import com.github.catvod.spider.merge.Y.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class b {
    public static volatile int a;
    public static final d b = new d();
    public static final com.github.catvod.spider.merge.Y.b c = new com.github.catvod.spider.merge.Y.b();
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                try {
                    try {
                        if (f()) {
                            linkedHashSetB = null;
                        } else {
                            linkedHashSetB = b();
                            i(linkedHashSetB);
                        }
                        StaticLoggerBinder.getSingleton();
                        a = 3;
                        h(linkedHashSetB);
                        g();
                    } catch (NoSuchMethodError e2) {
                        String message = e2.getMessage();
                        if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                            a = 2;
                            f.a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                            f.a("Your binding is version 1.5.5 or earlier.");
                            f.a("Upgrade your binding to version 1.6.x.");
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    a = 2;
                    f.b("Failed to instantiate SLF4J LoggerFactory", e3);
                    throw new IllegalStateException("Unexpected initialization failure", e3);
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                if (message2 == null || (!message2.contains("org/slf4j/impl/StaticLoggerBinder") && !message2.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    a = 2;
                    f.b("Failed to instantiate SLF4J LoggerFactory", e4);
                    throw e4;
                }
                a = 4;
                f.a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                f.a("Defaulting to no-operation (NOP) logger implementation");
                f.a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                g();
            }
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            f.b("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (b.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            j();
                        }
                    }
                } finally {
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

    public static a d(Class cls) {
        int i;
        a aVarE = e(cls.getName());
        if (d) {
            e eVar = f.a;
            Class cls2 = null;
            if (eVar == null) {
                if (f.b) {
                    eVar = null;
                } else {
                    try {
                        eVar = new e();
                    } catch (SecurityException unused) {
                        eVar = null;
                    }
                    f.a = eVar;
                    f.b = true;
                }
            }
            if (eVar != null) {
                Class[] classContext = eVar.getClassContext();
                String name = f.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && (!cls2.isAssignableFrom(cls))) {
                f.a("Detected logger name mismatch. Given name: \"" + aVarE.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                f.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return aVarE;
    }

    public static a e(String str) {
        return c().a(str);
    }

    public static boolean f() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void g() {
        d dVar = b;
        synchronized (dVar) {
            try {
                dVar.a = true;
                for (c cVar : new ArrayList(dVar.b.values())) {
                    cVar.b = e(cVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = b.c;
        int size = linkedBlockingQueue.size();
        ArrayList<com.github.catvod.spider.merge.X.a> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (com.github.catvod.spider.merge.X.a aVar : arrayList) {
                if (aVar != null) {
                    c cVar2 = aVar.a;
                    String str = cVar2.a;
                    if (cVar2.b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(cVar2.b instanceof com.github.catvod.spider.merge.Y.a)) {
                        if (!cVar2.a()) {
                            f.a(str);
                        } else if (cVar2.a()) {
                            try {
                                cVar2.d.invoke(cVar2.b, aVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (aVar.a.a()) {
                        f.a("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        f.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        f.a("See also http://www.slf4j.org/codes.html#replay");
                    } else if (!(aVar.a.b instanceof com.github.catvod.spider.merge.Y.a)) {
                        f.a("The following set of substitute loggers may have been accessed");
                        f.a("during the initialization phase. Logging calls during this");
                        f.a("phase were not honored. However, subsequent logging calls to these");
                        f.a("loggers will work as normally expected.");
                        f.a("See also http://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        d dVar2 = b;
        dVar2.b.clear();
        dVar2.c.clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        f.a("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            f.a("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                f.a("Found binding in [" + ((URL) it.next()) + "]");
            }
            f.a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void j() {
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
            f.a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
            f.a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            f.b("Unexpected problem occured during version sanity check", th);
        }
    }
}
