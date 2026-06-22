package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.e0.d;
import com.github.catvod.spider.merge.e0.f;
import com.github.catvod.spider.merge.oZP;
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

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class c {
    static volatile int a;
    static final d b = new d();
    static final l c = new l();
    static boolean d;
    private static final String[] e;
    private static String f;

    static {
        String property = null;
        try {
            property = System.getProperty(oZP.d("06031175067B110A03240F213900102609273B0E1A24213C060216350F3D"));
        } catch (SecurityException unused) {
        }
        d = property == null ? false : property.equalsIgnoreCase(oZP.d("011D0224"));
        e = new String[]{oZP.d("444141"), oZP.d("444140")};
        f = oZP.d("1A1D106E1F39135B1D6E05380503581218340106140D0332120A0503053B110A056F0F39141C04");
    }

    private c() {
    }

    private static final void a() {
        String strD = oZP.d("330E1E2D0931551B1861053B061B162F183C141B12613F19335B3D61203A120812332A34161B183315");
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
                        if (message != null && message.contains(oZP.d("1A1D106F1F39135B1D6F05380503591218340106140D0332120A0503053B110A056F0B30013C1E2F0B39101B182F447C"))) {
                            a = 2;
                            f.b(oZP.d("060311750678141F1E615D7B43410F61443A074F1B201830074657281F751C01142E0125141B1E23003055181E35047501071E324C371C01132802325B"));
                            f.b(oZP.d("2C0002334C371C0113280232550604611A30071C1E2E02754441426F59751A1D57240D271906123342"));
                            f.b(oZP.d("201F10330D31104F0E2E1927550D1E2F083C1B0857350375030A0532053A1B4F466F5A7B0D41"));
                        }
                        throw e2;
                    }
                } catch (Exception e3) {
                    a = 2;
                    f.c(strD, e3);
                    throw new IllegalStateException(oZP.d("200112391C30161B12254C3C1B0603280D391C151635053A1B4F11200539001D12"), e3);
                }
            } catch (NoClassDefFoundError e4) {
                String message2 = e4.getMessage();
                boolean z = false;
                if (message2 != null && (message2.contains(oZP.d("1A1D106E1F39135B1D6E05380503581218340106140D0332120A0503053B110A05")) || message2.contains(oZP.d("1A1D106F1F39135B1D6F05380503591218340106140D0332120A0503053B110A05")))) {
                    z = true;
                }
                if (!z) {
                    a = 2;
                    f.c(strD, e4);
                    throw e4;
                }
                a = 4;
                f.b(oZP.d("330E1E2D0931551B1861003A140B57220034061C576303271241042D0A611F411E2C1C395B3C0320183C162318260B30072D1E2F0830074D59"));
                f.b(oZP.d("310A11201939010619264C211A4F192E413A050A0520183C1A015769221A2546572D0332120A056105380503122C093B010E0328033B"));
                f.b(oZP.d("260A12610421011F4D6E43220218593200334105592E1E325A0C182509265B07032C0076261B16350536390010260927370619250927550918334C33001D03290927550B12350D3C191C59"));
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
            f.c(oZP.d("301D052E1E75120A0335053B124F05241F3A001D14241F75131D182C4C25141B1F"), e2);
        }
        return linkedHashSet;
    }

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
            throw new IllegalStateException(oZP.d("1A1D106F1F39135B1D6F203A120812332A34161B183315751C0157270D3C190A13611F21141B126F4C1A070610280234194F12390F30051B1E2E0275020E0461183D0700002F4C10343D3B0829075B4F242409751403042E4C3D011B077B437A0218006F1F39135B1D6F03271240142E083006411F350139561A19321936160A04320A201926192818"));
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException(oZP.d("200105240D361D0E152D097516001324"));
    }

    public static b d(Class<?> cls) {
        Class<?> clsA;
        b bVarA = c().a(cls.getName());
        if (d && (clsA = f.a()) != null && (!clsA.isAssignableFrom(cls))) {
            f.b(String.format(oZP.d("310A03240F21100B572D0332120A05610234180A572C0526180E0322047B55281E37093B5501162C096F554D52324E6E550C182C1C20010A13610234180A4D614E70064D59"), bVarA.getName(), clsA.getName()));
            f.b(oZP.d("260A12610421011F4D6E43220218593200334105592E1E325A0C182509265B07032C00761900102609273B0E1A24213C060216350F3D550918334C341B4F12391C3914011635053A1B"));
        }
        return bVarA;
    }

    public static b e(String str) {
        return c().a(str);
    }

    private static boolean f() {
        String property = null;
        try {
            property = System.getProperty(oZP.d("1F0E012042231001132E1E7B001D1B"));
        } catch (SecurityException unused) {
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains(oZP.d("14011333033C11"));
    }

    private static void g() {
        d dVar = b;
        synchronized (dVar) {
            dVar.e();
            for (com.github.catvod.spider.merge.e0.c cVar : (ArrayList) dVar.d()) {
                cVar.f(e(cVar.getName()));
            }
        }
        LinkedBlockingQueue<com.github.catvod.spider.merge.d0.c> linkedBlockingQueueC = b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<com.github.catvod.spider.merge.d0.c> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (com.github.catvod.spider.merge.d0.c cVar2 : arrayList) {
                if (cVar2 != null) {
                    com.github.catvod.spider.merge.e0.c cVarA = cVar2.a();
                    String name = cVarA.getName();
                    if (cVarA.d()) {
                        throw new IllegalStateException(oZP.d("310A1B240B34010A572D0332120A05610F341B0118354C37104F19340039550E0361183D1C1C57321834010A59"));
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
                        f.b(oZP.d("344F19340137101D5769") + size + oZP.d("5C4F18274C391A0810280232550C162D0026550B0233053B124F032909751C011E35053419060D20183C1A0157310434060A57290D23104F1524093B550619350927160A07350931550E19254C34070A"));
                        f.b(oZP.d("1B0000610E301C0110611E300503163809315B4F23290926104F16330975061A152B0936014F032E4C211D0A57270539010A05280232551D022D092655001161183D104F022F083007030E280232550318260B3C1B0857321526010A1A6F"));
                        f.b(oZP.d("260A12610D390600572918210555586E1B220241042D0A611F4118330B7A160013241F7B1D1B1A2D4F27101F1B2015"));
                    } else if (!cVar2.a().c()) {
                        f.b(oZP.d("210712610A3A19031836053B124F042418751A0957321937061B1E351921104F1B2E0B32101D046101340C4F1F201A30550D12240275140C14241F26100B"));
                        f.b(oZP.d("111A05280232551B1F244C3C1B0603280D391C151635053A1B4F07290D261041570D0332120619264C3614031B324C31001D1E2F0B7501071E32"));
                        f.b(oZP.d("050716320975020A05244C3B1A1B5729033B1A1D122542753D0000241A30074357321937060A0634093B014F1B2E0B321C0110610F3419030461183A551B1F241F30"));
                        f.b(oZP.d("190010260927064F00280039551818330775141C572F0327180E1B2D1575101707240F21100B59"));
                        f.b(oZP.d("260A12610D390600572918210555586E1B220241042D0A611F4118330B7A160013241F7B1D1B1A2D4F26000D04350521001B120D0332120A05"));
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
                StringBuilder sbC = C0133t.c(oZP.d("340C03340D39550D1E2F083C1B0857281F751A0957351525104F2C"));
                sbC.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
                sbC.append(oZP.d("28"));
                f.b(sbC.toString());
            }
        }
    }

    private static void i(Set<URL> set) {
        if (set.size() > 1) {
            f.b(oZP.d("360316321F75050E03294C361A010320053B064F1A3400211C1F1B244C063929430B4C371C01132802320641"));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                f.b(oZP.d("3300022F087517061925053B124F1E2F4C0E") + it.next() + oZP.d("28"));
            }
            f.b(oZP.d("260A12610421011F4D6E43220218593200334105592E1E325A0C182509265B07032C0076181A1B350525190A2823053B110619261F75130005610D3B550A0F3100341B0E0328033B5B"));
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
            f.b(oZP.d("210712611E30041A12321830114F01241E261C001961") + str + oZP.d("550D0E61153A001D5732003341055723053B110619264C3C064F192E187516001A310D211C0D1B244C221C1B1F61") + Arrays.asList(e).toString());
            f.b(oZP.d("260A12610421011F4D6E43220218593200334105592E1E325A0C182509265B07032C0076030A0532053A1B301A281F38141B14294C331A1D57271927010712334C31101B162800265B"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            f.c(oZP.d("200112391C30161B12254C250700152D0938550014221927100B572519271C0110611A30071C1E2E0275060E1928182C550C1F240F3E"), th);
        }
    }
}
