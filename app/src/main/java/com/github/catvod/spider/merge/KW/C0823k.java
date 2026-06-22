package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.KW.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0823k {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final C0819g a = C0819g.a();

    static {
        UUID uuidFromString = UUID.fromString(ZrJ.d("4A707C7B79074B07667A70073B6E7F0C7C76547B097D0A684D057E0F0D0041020A0E0E76"));
        UUID uuidFromString2 = UUID.fromString(ZrJ.d("48070A7D0B704E07667B0B754F6E7F7E7004547A097F7F684873090E0A763A067B0B7E74"));
        b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString(ZrJ.d("38020F0F70014E06660C0D003F6E7F79797054020F7F0A6841717B790C733A057B797A00"));
        c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString(ZrJ.d("4C7A7D7F7F724177667E0A004C6E7F7C7F04540172080A684172787C09724B7B7D7D707C"));
        d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f = uuidFromString4;
    }

    private int c(char[] cArr, int i, List<com.github.catvod.spider.merge.Bk.k> list, InterfaceC0822j interfaceC0822j) {
        int size = i + 1;
        char c2 = cArr[i];
        for (int i2 = 0; i2 < c2; i2++) {
            char c3 = cArr[size];
            int i3 = size + 1;
            com.github.catvod.spider.merge.Bk.k kVar = new com.github.catvod.spider.merge.Bk.k(new int[0]);
            list.add(kVar);
            int i4 = i3 + 1;
            if (cArr[i3] != 0) {
                kVar.a(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < c3; i5++) {
                int iA = interfaceC0822j.a(cArr, size);
                int size2 = size + interfaceC0822j.size();
                int iA2 = interfaceC0822j.a(cArr, size2);
                size = size2 + interfaceC0822j.size();
                kVar.b(iA, iA2);
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    protected static boolean d(UUID uuid, UUID uuid2) {
        ?? r0 = e;
        int iIndexOf = r0.indexOf(uuid);
        return iIndexOf >= 0 && r0.indexOf(uuid2) >= iIndexOf;
    }

    protected static long e(char[] cArr, int i) {
        long j = ((long) (cArr[i] | (cArr[i + 1] << 16))) & 4294967295L;
        int i2 = i + 2;
        return (((long) ((cArr[i2 + 1] << 16) | cArr[i2])) << 32) | j;
    }

    protected final void a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.github.catvod.spider.merge.KW.c0] */
    /* JADX WARN: Type inference failed for: r11v30, types: [com.github.catvod.spider.merge.KW.c0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.t0>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.v>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.r0>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.KW.C0813a b(char[] r19) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.C0823k.b(char[]):com.github.catvod.spider.merge.KW.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.KW.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(com.github.catvod.spider.merge.KW.C0813a r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.KW.C0823k.f(com.github.catvod.spider.merge.KW.a):void");
    }
}
