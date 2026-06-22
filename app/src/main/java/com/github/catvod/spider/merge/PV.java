package com.github.catvod.spider.merge;

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
public final class PV {
    static volatile int l8;
    static final jf S = new jf();
    static final B4 T4 = new B4();
    static boolean b = Pt.l("slf4j.detectLoggerNameMismatch");
    private static final String[] OL = {"1.6", "1.7"};
    private static String l = "org/slf4j/impl/StaticLoggerBinder.class";

    private PV() {
    }

    private static boolean A() {
        if ("http://www.android.com/" == 0) {
            return false;
        }
        return "http://www.android.com/".toLowerCase().contains("android");
    }

    private static void E9() {
        LinkedBlockingQueue<zE> linkedBlockingQueueT4 = S.T4();
        int size = linkedBlockingQueueT4.size();
        ArrayList<zE> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueT4.drainTo(arrayList, 128) != 0) {
            for (zE zEVar : arrayList) {
                uS(zEVar);
                int i2 = i + 1;
                if (i == 0) {
                    S(zEVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    public static Sj HM(Class<?> cls) {
        Class<?> clsL8;
        Sj sjN = n(cls.getName());
        if (b && (clsL8 = Pt.l8()) != null && s(cls, clsL8)) {
            Pt.T4(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", sjN.getName(), clsL8.getName()));
            Pt.T4("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return sjN;
    }

    private static void Kf() {
        tT();
        E9();
        S.S();
    }

    public static gp N() {
        if (l8 == 0) {
            synchronized (PV.class) {
                if (l8 == 0) {
                    l8 = 1;
                    hR();
                }
            }
        }
        int i = l8;
        if (i == 1) {
            return S;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return T4;
        }
        throw new IllegalStateException("Unreachable code");
    }

    static void OL(Throwable th) {
        l8 = 2;
        Pt.b("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static final void Q() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : OL) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Pt.T4("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(OL).toString());
            Pt.T4("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Pt.b("Unexpected problem occured during version sanity check", th);
        }
    }

    private static void S(zE zEVar, int i) {
        if (zEVar.l8().l8()) {
            T4(i);
        } else {
            if (zEVar.l8().S()) {
                return;
            }
            b();
        }
    }

    private static void T4(int i) {
        Pt.T4("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        Pt.T4("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Pt.T4("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void b() {
        Pt.T4("The following set of substitute loggers may have been accessed");
        Pt.T4("during the initialization phase. Logging calls during this");
        Pt.T4("phase were not honored. However, subsequent logging calls to these");
        Pt.T4("loggers will work as normally expected.");
        Pt.T4("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void c(Set<URL> set) {
        if (set == null || !v(set)) {
            return;
        }
        Pt.T4("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static boolean cD(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static void eD(Set<URL> set) {
        if (v(set)) {
            Pt.T4("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                Pt.T4("Found binding in [" + it.next() + "]");
            }
            Pt.T4("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static final void hR() {
        l8();
        if (l8 == 3) {
            Q();
        }
    }

    static Set<URL> l() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = PV.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(l) : classLoader.getResources(l);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            Pt.b("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    private static final void l8() {
        Set<URL> setL = null;
        try {
            try {
                if (!A()) {
                    setL = l();
                    eD(setL);
                }
                StaticLoggerBinder.getSingleton();
                l8 = 3;
                c(setL);
            } catch (Exception e) {
                OL(e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                if (!cD(e2.getMessage())) {
                    OL(e2);
                    throw e2;
                }
                l8 = 4;
                Pt.T4("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                Pt.T4("Defaulting to no-operation (NOP) logger implementation");
                Pt.T4("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message = e3.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    l8 = 2;
                    Pt.T4("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    Pt.T4("Your binding is version 1.5.5 or earlier.");
                    Pt.T4("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
        } finally {
            Kf();
        }
    }

    public static Sj n(String str) {
        return N().l8(str);
    }

    private static boolean s(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static void tT() {
        jf jfVar = S;
        synchronized (jfVar) {
            jfVar.OL();
            for (Yg yg : jfVar.b()) {
                yg.OL(n(yg.getName()));
            }
        }
    }

    private static void uS(zE zEVar) {
        if (zEVar == null) {
            return;
        }
        Yg ygL8 = zEVar.l8();
        String name = ygL8.getName();
        if (ygL8.T4()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (ygL8.S()) {
            return;
        }
        if (ygL8.l8()) {
            ygL8.b(zEVar);
        } else {
            Pt.T4(name);
        }
    }

    private static boolean v(Set<URL> set) {
        return set.size() > 1;
    }
}
