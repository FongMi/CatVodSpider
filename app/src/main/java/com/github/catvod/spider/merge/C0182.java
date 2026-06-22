package com.github.catvod.spider.merge;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ү, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0182 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static Map<String, InterfaceC0007> f445 = new HashMap();

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static Map<String, InterfaceC0366> f446 = new HashMap();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static Map<String, InterfaceC0174> f447 = new HashMap();

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static InterfaceC0465 f448 = C0081.m330(C0182.class);

    static {
        m645(C0083.class, C0456.class, C0078.class, C0228.class, C0379.class, C0242.class, C0254.class, C0239.class, C0335.class, C0079.class, C0432.class, C0173.class, C0020.class, C0462.class);
        m646(C0333.class, C0334.class, C0099.class, C0460.class, C0461.class, C0454.class, C0082.class, C0437.class, C0175.class, C0240.class, C0257.class, C0178.class, C0252.class, C0440.class, C0084.class, C0098.class);
        m647(C0336.class, C0467.class, C0181.class, C0033.class, C0169.class, C0247.class);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static InterfaceC0174 m642(String str) {
        InterfaceC0174 interfaceC0174 = f447.get(str);
        if (interfaceC0174 != null) {
            return interfaceC0174;
        }
        throw new C0238(SOY.d("143D255607020A223E0400571C273F15001E153C6B56") + str);
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static InterfaceC0366 m643(String str) {
        InterfaceC0366 interfaceC0366 = f446.get(str);
        if (interfaceC0366 != null) {
            return interfaceC0366;
        }
        throw new C0238(SOY.d("143D255607020A223E040057143D3513201209266B56") + str);
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static InterfaceC0007 m644(String str) {
        InterfaceC0007 interfaceC0007 = f445.get(str);
        if (interfaceC0007 != null) {
            return interfaceC0007;
        }
        throw new C0032(SOY.d("143D255607020A223E0400571B2A38054E57") + str);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static void m645(Class<? extends InterfaceC0007>... clsArr) {
        for (Class<? extends InterfaceC0007> cls : clsArr) {
            m648(cls);
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static void m646(Class<? extends InterfaceC0174>... clsArr) {
        for (Class<? extends InterfaceC0174> cls : clsArr) {
            m649(cls);
        }
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static void m647(Class<? extends InterfaceC0366>... clsArr) {
        for (Class<? extends InterfaceC0366> cls : clsArr) {
            m650(cls);
        }
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static void m648(Class<? extends InterfaceC0007> cls) {
        try {
            InterfaceC0007 interfaceC0007NewInstance = cls.newInstance();
            f445.put(interfaceC0007NewInstance.name(), interfaceC0007NewInstance);
        } catch (Exception e) {
            f448.mo906(C0103.m377(e), e);
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static void m649(Class<? extends InterfaceC0174> cls) {
        try {
            InterfaceC0174 interfaceC0174NewInstance = cls.newInstance();
            f447.put(interfaceC0174NewInstance.name(), interfaceC0174NewInstance);
        } catch (Exception e) {
            f448.mo906(C0103.m377(e), e);
        }
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static void m650(Class<? extends InterfaceC0366> cls) {
        try {
            InterfaceC0366 interfaceC0366NewInstance = cls.newInstance();
            f446.put(interfaceC0366NewInstance.name(), interfaceC0366NewInstance);
        } catch (Exception e) {
            f448.mo906(C0103.m377(e), e);
        }
    }
}
