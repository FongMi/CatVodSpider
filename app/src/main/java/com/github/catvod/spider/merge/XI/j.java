package com.github.catvod.spider.merge.XI;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
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
public final class j {
    static volatile int a;
    static final com.github.catvod.spider.merge.VB.d b = new com.github.catvod.spider.merge.VB.d();
    static final com.github.catvod.spider.merge.Bk.l c = new com.github.catvod.spider.merge.Bk.l();
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        String property = null;
        try {
            property = System.getProperty(ZrJ.d("0A2F2D79226B1D263F282B31352C2C2A2D3737222628052C0A2E2A392B2D"));
        } catch (SecurityException unused) {
        }
        d = property == null ? false : property.equalsIgnoreCase(ZrJ.d("0D313E28"));
        e = new String[]{ZrJ.d("486D7D"), ZrJ.d("486D7C")};
        f = ZrJ.d("16312C623B291F7721622128092F641E3C240D2A280127221E26390F212B1D2639632B29183038");
    }

    private j() {
    }

    private static final void a() {
        String strD = ZrJ.d("3F2222212D215937246D212B0A372A233C2C18372E6D1B093F77016D042A1E242E3F0E241A37243F31");
        Set<URL> setB = null;
        try {
            try {
                try {
                    try {
                        if (!f()) {
                            setB = b();
                            i(setB);
                        }
                        StaticLoggerBinder.getSingleton();
                        a = 3;
                        h(setB);
                    } catch (NoSuchMethodError e2) {
                        String message = e2.getMessage();
                        if (message != null && message.contains(ZrJ.d("16312C633B291F7721632128092F651E3C240D2A280127221E26390F212B1D2639632F200D1022232F291C372423606C"))) {
                            a = 2;
                            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("0A2F2D7922681833226D796B4F6D336D602A0B63272C3C200B6A6B243B65102D282225351837222F24205934223920650D2B223E6827102D2F24262257"));
                            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("202C3E3F6827102D2F242622592A386D3E200B3022222665486D7E637D6516316B282937152A2E3F66"));
                            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2C332C3F29211C6332223D37592122232C2C17246B3927650F26393E212A17637A637E6B016D"));
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    a = 2;
                    com.github.catvod.spider.merge.VB.f.c(strD, e3);
                    throw new IllegalStateException(ZrJ.d("2C2D2E3538201A372E29682C172A3F24292910392A39212A17632D2C21290C312E"), e3);
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                boolean z = false;
                if (message2 != null && (message2.contains(ZrJ.d("16312C623B291F7721622128092F641E3C240D2A280127221E26390F212B1D2639")) || message2.contains(ZrJ.d("16312C633B291F7721632128092F651E3C240D2A280127221E26390F212B1D2639")))) {
                    z = true;
                }
                if (!z) {
                    a = 2;
                    com.github.catvod.spider.merge.VB.f.c(strD, e4);
                    throw e4;
                }
                a = 4;
                com.github.catvod.spider.merge.VB.f.b(ZrJ.d("3F2222212D215937246D242A18276B2E24240A306B6F27371E6D38212E71136D2220382957103F2C3C2C1A0F242A2F200B0122232C200B6165"));
                com.github.catvod.spider.merge.VB.f.b(ZrJ.d("3D262D2C3D290D2A252A683116632522652A0926392C3C2C162D6B65060A296A6B2127221E26396D2128092F2E202D2B0D223F24272B"));
                com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D20310D33716267320E34653E24234D2965223A22562024292D36572B3F2024662A372A392126352C2C2A2D373B2A25292D375925243F68230C313F252D3759272E39292C153065"));
            }
        } finally {
            g();
        }
    }

    static Set<URL> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = j.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f) : classLoader.getResources(f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            com.github.catvod.spider.merge.VB.f.c(ZrJ.d("3C3139223A651E263F39212B1E6339283B2A0C3128283B651F3124206835183723"), e2);
        }
        return linkedHashSet;
    }

    public static h c() {
        if (a == 0) {
            synchronized (j.class) {
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
            throw new IllegalStateException(ZrJ.d("16312C633B291F772163042A1E242E3F0E241A37243F3165102D6B2B292C15262F6D3B3118372E63680A0B2A2C24262415632E352B200937222226650E22386D3C2D0B2C3C236800381107040D17576318282D65182F3822682D0D373B77676A0E343C633B291F77216327371E6C28222C200A6D233925295A36253E3D261A26383E2E30150A25243C"));
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException(ZrJ.d("2C2D39282926112229212D651A2C2F28"));
    }

    public static i d(Class<?> cls) {
        Class<?> clsA;
        i iVarA = c().a(cls.getName());
        if (d && (clsA = com.github.catvod.spider.merge.VB.f.a()) != null && (!clsA.isAssignableFrom(cls))) {
            com.github.catvod.spider.merge.VB.f.b(String.format(ZrJ.d("3D263F282B311C276B2127221E26396D262414266B20213614223F2E206B5904223B2D2B592D2A202D7F59616E3E6A7E5920242038300D262F6D26241426716D6A600A6165"), iVarA.getName(), clsA.getName()));
            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D20310D33716267320E34653E24234D2965223A22562024292D36572B3F202466152C2C2A2D3737222628052C0A2E2A392B2D5925243F682417632E353829182D2A39212A17"));
        }
        return iVarA;
    }

    public static i e(String str) {
        return c().a(str);
    }

    private static boolean f() {
        String property = null;
        try {
            property = System.getProperty(ZrJ.d("13223D2C66331C2D2F223A6B0C3127"));
        } catch (SecurityException unused) {
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains(ZrJ.d("182D2F3F272C1D"));
    }

    private static void g() {
        com.github.catvod.spider.merge.VB.d dVar = b;
        synchronized (dVar) {
            dVar.e();
            for (com.github.catvod.spider.merge.VB.c cVar : (ArrayList) dVar.d()) {
                cVar.f(e(cVar.getName()));
            }
        }
        LinkedBlockingQueue<m> linkedBlockingQueueC = b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<m> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (m mVar : arrayList) {
                if (mVar != null) {
                    com.github.catvod.spider.merge.VB.c cVarA = mVar.a();
                    String name = cVarA.getName();
                    if (cVarA.d()) {
                        throw new IllegalStateException(ZrJ.d("3D2627282F240D266B2127221E26396D2B24172D243968271C632538242959223F6D3C2D10306B3E3C240D2665"));
                    }
                    if (!cVarA.c()) {
                        if (cVarA.b()) {
                            cVarA.e(mVar);
                        } else {
                            com.github.catvod.spider.merge.VB.f.b(name);
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (mVar.a().b()) {
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("3863253825271C316B65") + size + ZrJ.d("5063242B682916242C24262259202A21243659273E3F212B1E633F252D65102D22392124152A312C3C2C162D6B3D20240A266B2529331C6329282D2B592A25392D371A263B392D215922252968240B26"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("172C3C6D2A20102D2C6D3A20092F2A342D2157631F252D361C632A3F2D650A3629272D260D633F22683111266B2B21290D263924262259313E212D36592C2D6D3C2D1C633E232C200B2F32242622592F242A2F2C17246B3E31360D262663"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D29290A2C6B253C31097964623F320E6D38212E71136D243F2F6A1A2C2F283B6B113726216B371C33272C31"));
                    } else if (!mVar.a().c()) {
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2D2B2E6D2E2A152F243A212B1E6338283C6516256B3E3D270A3722393D311C6327222F221C31386D25240063232C3E2059212E282665182028283B361C27"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("1D363924262259372328682C172A3F24292910392A39212A17633B2529361C6D6B0127221E2A252A6826182F273E68210C3122232F650D2B223E"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("092B2A3E2D650E263928682B16376B25272B16312E296665312C3C283E200B6F6B3E3D270A263A382D2B0D6327222F22102D2C6D2B24152F386D3C2A593723283B20"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("152C2C2A2D370A633C2424295934243F236518306B2327371422272131651C3B3B282B311C2765"));
                        com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D29290A2C6B253C31097964623F320E6D38212E71136D243F2F6A1A2C2F283B6B113726216B360C21383921310C372E0127221E2639"));
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
                StringBuilder sbB = C0925t.b(ZrJ.d("38203F382929592122232C2C17246B243B6516256B3931351C6310"));
                sbB.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbB.append(ZrJ.d("24"));
                com.github.catvod.spider.merge.VB.f.b(sbB.toString());
            }
        }
    }

    private static void i(Set<URL> set) {
        if (set.size() > 1) {
            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("3A2F2A3E3B6509223F256826162D3F2C212B0A632638243110332728681635057F076827102D2F2426220A6D"));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.VB.f.b(ZrJ.d("3F2C3E232C651B2A2529212B1E632223681E") + it.next() + ZrJ.d("24"));
            }
            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D20310D33716267320E34653E24234D2965223A22562024292D36572B3F2024661436273921351526142F212B1D2A252A3B651F2C396D292B5926333D242417223F24272B57"));
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
            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2D2B2E6D3A2008362E3E3C201D633D283A36102C256D") + str + ZrJ.d("5921326D312A0C316B3E24234D296B2F212B1D2A252A682C0A6325223C651A2C263D29311021272868321037236D") + Arrays.asList(e).toString());
            com.github.catvod.spider.merge.VB.f.b(ZrJ.d("2A262E6D20310D33716267320E34653E24234D2965223A22562024292D36572B3F2024660F26393E212A171C26243B2818372825682316316B2B3D370D2B2E3F68211C372A24243657"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            com.github.catvod.spider.merge.VB.f.c(ZrJ.d("2C2D2E3538201A372E2968350B2C29212D28592C282E3D371C276B293D37102D2C6D3E200B30222226650A2225243C3C592023282B2E"), th);
        }
    }
}
