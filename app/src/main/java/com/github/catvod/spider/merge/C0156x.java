package com.github.catvod.spider.merge;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: com.github.catvod.spider.merge.x */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public final class C0156x {

    /* renamed from: q */
    static volatile int f758q;

    /* renamed from: xC */
    static final C0155wY f760xC = new C0155wY();

    /* renamed from: QU */
    static final C0089Rn f756QU = new C0089Rn();

    /* renamed from: UJ */
    static boolean f757UJ = C0101WF.m471Mo("slf4j.detectLoggerNameMismatch");

    /* renamed from: u */
    private static final String[] f759u = {"1.6", "1.7"};

    /* renamed from: Mo */
    private static String f755Mo = "org/slf4j/impl/StaticLoggerBinder.class";

    private C0156x() {
    }

    /* renamed from: B */
    private static boolean m744B() {
        String strM474i = C0101WF.m474i("java.vendor.url");
        if (strM474i == null) {
            return false;
        }
        return strM474i.toLowerCase().contains("android");
    }

    /* renamed from: E */
    private static void m745E(Set<URL> set) {
        if (m747FN(set)) {
            C0101WF.m472QU("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C0101WF.m472QU("Found binding in [" + it.next() + "]");
            }
            C0101WF.m472QU("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: F */
    private static boolean m746F(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* renamed from: FN */
    private static boolean m747FN(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: IS */
    private static void m748IS(Set<URL> set) {
        if (set == null || !m747FN(set)) {
            return;
        }
        C0101WF.m472QU("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    /* renamed from: KT */
    private static void m749KT() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m757i();
        m758k();
        f760xC.m743xC();
    }

    /* renamed from: MH */
    public static InterfaceC0130m m750MH() {
        if (f758q == 0) {
            synchronized (C0156x.class) {
                if (f758q == 0) {
                    f758q = 1;
                    m753RH();
                }
            }
        }
        int i = f758q;
        if (i == 1) {
            return f760xC;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f756QU;
        }
        throw new IllegalStateException("Unreachable code");
    }

    /* renamed from: Mo */
    static Set<URL> m751Mo() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C0156x.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f755Mo) : classLoader.getResources(f755Mo);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C0101WF.m473UJ("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: QU */
    private static void m752QU(int i) {
        C0101WF.m472QU("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C0101WF.m472QU("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C0101WF.m472QU("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: RH */
    private static final void m753RH() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m760q();
        if (f758q == 3) {
            m759p();
        }
    }

    /* renamed from: Tz */
    private static void m754Tz(C0158xt c0158xt) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (c0158xt == null) {
            return;
        }
        C0066IM c0066imM783q = c0158xt.m783q();
        String name = c0066imM783q.getName();
        if (c0066imM783q.m225QU()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c0066imM783q.m229xC()) {
            return;
        }
        if (c0066imM783q.m227q()) {
            c0066imM783q.m226UJ(c0158xt);
        } else {
            C0101WF.m472QU(name);
        }
    }

    /* renamed from: UJ */
    private static void m755UJ() {
        C0101WF.m472QU("The following set of substitute loggers may have been accessed");
        C0101WF.m472QU("during the initialization phase. Logging calls during this");
        C0101WF.m472QU("phase were not honored. However, subsequent logging calls to these");
        C0101WF.m472QU("loggers will work as normally expected.");
        C0101WF.m472QU("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: W */
    public static InterfaceC0098V1 m756W(String str) {
        return m750MH().mo417q(str);
    }

    /* renamed from: i */
    private static void m757i() {
        C0155wY c0155wY = f760xC;
        synchronized (c0155wY) {
            c0155wY.m742u();
            for (C0066IM c0066im : c0155wY.m741UJ()) {
                c0066im.m228u(m756W(c0066im.getName()));
            }
        }
    }

    /* renamed from: k */
    private static void m758k() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        LinkedBlockingQueue<C0158xt> linkedBlockingQueueM740QU = f760xC.m740QU();
        int size = linkedBlockingQueueM740QU.size();
        ArrayList<C0158xt> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM740QU.drainTo(arrayList, 128) != 0) {
            for (C0158xt c0158xt : arrayList) {
                m754Tz(c0158xt);
                int i2 = i + 1;
                if (i == 0) {
                    m764xC(c0158xt, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: p */
    private static final void m759p() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f759u) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C0101WF.m472QU("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f759u).toString());
            C0101WF.m472QU("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C0101WF.m473UJ("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: q */
    private static final void m760q() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Set<URL> setM751Mo = null;
        try {
            try {
                if (!m744B()) {
                    setM751Mo = m751Mo();
                    m745E(setM751Mo);
                }
                StaticLoggerBinder.getSingleton();
                f758q = 3;
                m748IS(setM751Mo);
            } catch (Exception e) {
                m762u(e);
                throw new IllegalStateException("Unexpected initialization failure", e);
            } catch (NoClassDefFoundError e2) {
                if (!m763w8(e2.getMessage())) {
                    m762u(e2);
                    throw e2;
                }
                f758q = 4;
                C0101WF.m472QU("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C0101WF.m472QU("Defaulting to no-operation (NOP) logger implementation");
                C0101WF.m472QU("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } catch (NoSuchMethodError e3) {
                String message = e3.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f758q = 2;
                    C0101WF.m472QU("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    C0101WF.m472QU("Your binding is version 1.5.5 or earlier.");
                    C0101WF.m472QU("Upgrade your binding to version 1.6.x.");
                }
                throw e3;
            }
        } finally {
            m749KT();
        }
    }

    /* renamed from: se */
    public static InterfaceC0098V1 m761se(Class<?> cls) {
        Class<?> clsM475q;
        InterfaceC0098V1 interfaceC0098V1M756W = m756W(cls.getName());
        if (f757UJ && (clsM475q = C0101WF.m475q()) != null && m746F(cls, clsM475q)) {
            C0101WF.m472QU(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC0098V1M756W.getName(), clsM475q.getName()));
            C0101WF.m472QU("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC0098V1M756W;
    }

    /* renamed from: u */
    static void m762u(Throwable th) {
        f758q = 2;
        C0101WF.m473UJ("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: w8 */
    private static boolean m763w8(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: xC */
    private static void m764xC(C0158xt c0158xt, int i) {
        if (c0158xt.m783q().m227q()) {
            m752QU(i);
        } else {
            if (c0158xt.m783q().m229xC()) {
                return;
            }
            m755UJ();
        }
    }
}
