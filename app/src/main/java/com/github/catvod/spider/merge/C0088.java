package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.InterfaceC0017;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ɾ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0088 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static InterfaceC0017.EnumC0018 m351(InterfaceC0017 interfaceC0017, AbstractC0191 abstractC0191) {
        AbstractC0191 abstractC0191M683 = abstractC0191;
        int i = 0;
        while (abstractC0191M683 != null) {
            InterfaceC0017.EnumC0018 enumC0018Mo216 = interfaceC0017.mo216(abstractC0191M683, i);
            if (enumC0018Mo216 == InterfaceC0017.EnumC0018.f169) {
                return enumC0018Mo216;
            }
            if (enumC0018Mo216 != InterfaceC0017.EnumC0018.f165 || abstractC0191M683.mo119() <= 0) {
                while (abstractC0191M683.m688() == null && i > 0) {
                    InterfaceC0017.EnumC0018 enumC0018 = InterfaceC0017.EnumC0018.f165;
                    if ((enumC0018Mo216 == enumC0018 || enumC0018Mo216 == InterfaceC0017.EnumC0018.f166) && (enumC0018Mo216 = interfaceC0017.mo215(abstractC0191M683, i)) == InterfaceC0017.EnumC0018.f169) {
                        return enumC0018Mo216;
                    }
                    AbstractC0191 abstractC0191M691 = abstractC0191M683.m691();
                    i--;
                    if (enumC0018Mo216 == InterfaceC0017.EnumC0018.f168) {
                        abstractC0191M683.m693();
                    }
                    enumC0018Mo216 = enumC0018;
                    abstractC0191M683 = abstractC0191M691;
                }
                if ((enumC0018Mo216 == InterfaceC0017.EnumC0018.f165 || enumC0018Mo216 == InterfaceC0017.EnumC0018.f166) && (enumC0018Mo216 = interfaceC0017.mo215(abstractC0191M683, i)) == InterfaceC0017.EnumC0018.f169) {
                    return enumC0018Mo216;
                }
                if (abstractC0191M683 == abstractC0191) {
                    return enumC0018Mo216;
                }
                AbstractC0191 abstractC0191M688 = abstractC0191M683.m688();
                if (enumC0018Mo216 == InterfaceC0017.EnumC0018.f168) {
                    abstractC0191M683.m693();
                }
                abstractC0191M683 = abstractC0191M688;
            } else {
                abstractC0191M683 = abstractC0191M683.m683(0);
                i++;
            }
        }
        return InterfaceC0017.EnumC0018.f165;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static void m352(InterfaceC0539 interfaceC0539, AbstractC0191 abstractC0191) {
        AbstractC0191 abstractC0191M683 = abstractC0191;
        int i = 0;
        while (abstractC0191M683 != null) {
            AbstractC0191 abstractC0191M691 = abstractC0191M683.m691();
            interfaceC0539.mo208(abstractC0191M683, i);
            if (abstractC0191M691 != null && !abstractC0191M683.m686()) {
                abstractC0191M683 = abstractC0191M691.m683(abstractC0191M683.m701());
            }
            if (abstractC0191M683.mo119() > 0) {
                abstractC0191M683 = abstractC0191M683.m683(0);
                i++;
            } else {
                while (abstractC0191M683.m688() == null && i > 0) {
                    interfaceC0539.mo207(abstractC0191M683, i);
                    abstractC0191M683 = abstractC0191M683.m691();
                    i--;
                }
                interfaceC0539.mo207(abstractC0191M683, i);
                if (abstractC0191M683 == abstractC0191) {
                    return;
                } else {
                    abstractC0191M683 = abstractC0191M683.m688();
                }
            }
        }
    }
}
