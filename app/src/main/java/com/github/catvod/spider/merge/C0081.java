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

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ɍ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0081 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static volatile int f257;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    static final C0100 f258 = new C0100();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    static final C0458 f259 = new C0458();

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    static boolean f260 = C0085.m349(SOY.d("093E37421E591E3725131703363D3611110534333C13391E093F3002171F"));

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final String[] f261 = {SOY.d("4B7C67"), SOY.d("4B7C66")};

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static String f262 = SOY.d("15203659071B1C663B591D1A0A3E7E2500160E3B323A1B101D3723341D191E372358171B1B2122");

    private C0081() {
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final void m322() {
        Set<URL> setM327 = null;
        try {
            try {
                try {
                    if (!m333()) {
                        setM327 = m327();
                        m341(setM327);
                    }
                    StaticLoggerBinder.getSingleton();
                    f257 = 3;
                    m340(setM327);
                } catch (NoSuchMethodError e) {
                    String message = e.getMessage();
                    if (message != null && message.contains(SOY.d("15203658071B1C663B581D1A0A3E7F2500160E3B323A1B101D3723341D191E37235813120E013818131B1F263E185C5E"))) {
                        f257 = 2;
                        C0085.m346(SOY.d("093E37421E5A1B22385645594C7C29565C1808723D170012087B711F0757133C321919071B26381418125A2538021C570E3A38055415133C351F1A1054"));
                        C0085.m346(SOY.d("233D24045415133C351F1A105A3B22560212082138191A574B7C64584157152071131505163B34045A"));
                        C0085.m346(SOY.d("2F22360415131F72281901055A303818101E143571021B570C3723051D18147260584259027C"));
                    }
                    throw e;
                }
            } catch (Exception e2) {
                m326(e2);
                throw new IllegalStateException(SOY.d("2F3C340E041219263412541E143B251F151B132830021D18147237171D1B0F2034"), e2);
            } catch (NoClassDefFoundError e3) {
                if (!m334(e3.getMessage())) {
                    m326(e3);
                    throw e3;
                }
                f257 = 4;
                C0085.m346(SOY.d("3C33381A11135A263E5618181B3671151816092171541B051D7C221A1243107C381B041B54012517001E191E3E11131208103818101208707F"));
                C0085.m346(SOY.d("3E373717011B0E3B3F11540315723F1959180A372317001E153C715E3A382A7B711A1B101D3723561D1A0A3E341B11190E33251F1B19"));
                C0085.m346(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B1854292630021D14363D36111105383B3F1211055A343E0454110F20251E11055A363402151E16217F"));
            }
        } finally {
            m337();
        }
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static void m323(C0443 c0443, int i) {
        if (c0443.m1661().m908()) {
            m324(i);
        } else {
            if (c0443.m1661().m909()) {
                return;
            }
            m325();
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static void m324(int i) {
        C0085.m346(SOY.d("3B723F0319151F20715E") + i + SOY.d("53723E10541B1535361F1A105A31301A18045A3624041D191D72251E1157133C38021D16163B2B17001E153C71061C160937711E15011F72331311195A3B3F0211051937210211135A333F1254160837"));
        C0085.m346(SOY.d("143D26561612133C365606120A3E300F11135472051E11041F72300411570927331C11140E7225195403123771101D1B0E37231F1A105A20241A11045A3D3756001F1F7224181012083E281F1A105A3E3E11131E143571050D040E373C58"));
        C0085.m346(SOY.d("29373456151B093D711E00030A687E5903000D7C221A1243107C3E041358193D3513075912263C1A57051F223D170D"));
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static void m325() {
        C0085.m346(SOY.d("2E3A34561218163E3E011D191D72221300571534710501150926380201031F723D1913101F20225619160372391702125A3034131A571B31321307041F36"));
        C0085.m346(SOY.d("1E27231F1A105A263913541E143B251F151B132830021D181472211E15041F7C713A1B101D3B3F1154141B3E3D0554130F20381813570E3A3805"));
        C0085.m346(SOY.d("0A3A300511570D37231354191526711E1B19152034125A57323D26130212087E710501150937200311190E723D191310133C36561716163E225600185A2639130712"));
        C0085.m346(SOY.d("163D361111050972261F181B5A253E041F571B2171181B0517333D1A0D571F2A211317031F367F"));
        C0085.m346(SOY.d("29373456151B093D711E00030A687E5903000D7C221A1243107C3E041358193D3513075912263C1A57040F3022021D030F26343A1B101D3723"));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    static void m326(Throwable th) {
        f257 = 2;
        C0085.m347(SOY.d("3C33381A11135A263E561D1909263018001E1B263456273B3C661B5638181D353404321619263E040D"), th);
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    static Set<URL> m327() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C0081.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f262) : classLoader.getResources(f262);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            C0085.m347(SOY.d("3F20231906571D3725021D191D72231307180F20321307571C203E1B54071B2639"), e);
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static void m328() {
        C0100 c0100 = f258;
        synchronized (c0100) {
            c0100.m362();
            for (C0250 c0250 : c0100.m361()) {
                c0250.m912(m331(c0250.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static InterfaceC0014 m329() {
        if (f257 == 0) {
            synchronized (C0081.class) {
                if (f257 == 0) {
                    f257 = 1;
                    m336();
                }
            }
        }
        int i = f257;
        if (i == 1) {
            return f258;
        }
        if (i == 2) {
            throw new IllegalStateException(SOY.d("15203658071B1C663B5838181D353404321619263E040D57133C7110151E1637355607031B2634585438083B361F1A161672340E17120A2638191A570D332256001F083D261854323B001D3F31255472021311571B3E2219541F0E26214C5B580D252658071B1C663B581B051D7D32191012097C3902191B59273F050114193722051202161B3F1F00"));
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f259;
        }
        throw new IllegalStateException(SOY.d("2F3C231315141233331A1157193D3513"));
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static InterfaceC0465 m330(Class<?> cls) {
        Class<?> clsM344;
        InterfaceC0465 interfaceC0465M331 = m331(cls.getName());
        if (f260 && (clsM344 = C0085.m344()) != null && m335(cls, clsM344)) {
            C0085.m346(String.format(SOY.d("3E37251317031F36711A1B101D3723561A161737711B1D04173325151C595A15380011195A3C301B114D5A707405564C5A313E1B04020E3735561A1617376B56565209707F"), interfaceC0465M331.getName(), clsM344.getName()));
            C0085.m346(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B1854163D3611110534333C13391E093F3002171F5A343E0454161472340E041B1B3C30021D1814"));
        }
        return interfaceC0465M331;
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static InterfaceC0465 m331(String str) {
        return m329().mo210(str);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static boolean m332(Set<URL> set) {
        return set.size() > 1;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private static boolean m333() {
        String strM350 = C0085.m350(SOY.d("103327175A011F3C351906590F203D"));
        if (strM350 == null) {
            return false;
        }
        return strM350.toLowerCase().contains(SOY.d("1B3C35041B1E1E"));
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private static boolean m334(String str) {
        if (str == null) {
            return false;
        }
        return str.contains(SOY.d("15203659071B1C663B591D1A0A3E7E2500160E3B323A1B101D3723341D191E3723")) || str.contains(SOY.d("15203658071B1C663B581D1A0A3E7F2500160E3B323A1B101D3723341D191E3723"));
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private static boolean m335(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private static final void m336() {
        m322();
        if (f257 == 3) {
            m342();
        }
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private static void m337() {
        m328();
        m338();
        f258.m359();
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private static void m338() {
        LinkedBlockingQueue<C0443> linkedBlockingQueueM360 = f258.m360();
        int size = linkedBlockingQueueM360.size();
        ArrayList<C0443> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueM360.drainTo(arrayList, 128) != 0) {
            for (C0443 c0443 : arrayList) {
                m339(c0443);
                int i2 = i + 1;
                if (i == 0) {
                    m323(c0443, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private static void m339(C0443 c0443) {
        if (c0443 == null) {
            return;
        }
        C0250 c0250M1661 = c0443.m1661();
        String name = c0250M1661.getName();
        if (c0250M1661.m910()) {
            throw new IllegalStateException(SOY.d("3E373D1313160E37711A1B101D3723561716143C3E0254151F723F03181B5A332556001F1321710500160E377F"));
        }
        if (c0250M1661.m909()) {
            return;
        }
        if (c0250M1661.m908()) {
            c0250M1661.m911(c0443);
        } else {
            C0085.m346(name);
        }
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private static void m340(Set<URL> set) {
        if (set == null || !m332(set)) {
            return;
        }
        C0085.m346(SOY.d("3B312503151B5A303818101E1435711F0757153471020D071F720A") + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + SOY.d("27"));
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    private static void m341(Set<URL> set) {
        if (m332(set)) {
            C0085.m346(SOY.d("393E300507570A33251E5414153C25171D1909723C03180313223D1354243614653C5415133C351F1A10097C"));
            Iterator<URL> it = set.iterator();
            while (it.hasNext()) {
                C0085.m346(SOY.d("3C3D24181057183B3F121D191D723818542C") + it.next() + SOY.d("27"));
            }
            C0085.m346(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B185417273D021D0716370E141D191E3B3F1107571C3D235615195A37290618161433251F1B1954"));
        }
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    private static final void m342() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f261) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C0085.m346(SOY.d("2E3A345606120B27340500121E7227130604133D3F56") + str + SOY.d("5A3028560D180F20710518114E3871141D191E3B3F11541E09723F190057193D3C06150313303D13540013263956") + Arrays.asList(f261).toString());
            C0085.m346(SOY.d("293734561C030E226B595B000D257F0518114E387F19061055313E121104543A251B18540C3723051D18140D3C1F071A1B26321E54111520711001050E3A340454131F26301F180454"));
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C0085.m347(SOY.d("2F3C340E0412192634125407083D331A111A5A3D321501051F3671120105133C36560212082138191A5709333F1F000E5A313913171C"), th);
        }
    }
}
