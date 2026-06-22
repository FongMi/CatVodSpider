package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.oZP;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0292k {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final C0288g a = C0288g.a();

    static {
        UUID uuidFromString = UUID.fromString(oZP.d("465C40775D17472B5A765417374243005866585735712E784129420329104D2E36022A66"));
        UUID uuidFromString2 = UUID.fromString(oZP.d("442B36712F60422B5A772F65434243725414585635735B78445F35022E66362A47075A64"));
        b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString(oZP.d("342E33035411422A5A002910334243755D60582E33732E784D5D47752863362947755E10"));
        c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString(oZP.d("405641735B624D5B5A722E10404243705B14582D4E042E784D5E44702D6247574171546C"));
        d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f = uuidFromString4;
    }

    private int c(char[] cArr, int i, List<com.github.catvod.spider.merge.B.k> list, InterfaceC0291j interfaceC0291j) {
        int size = i + 1;
        char c2 = cArr[i];
        for (int i2 = 0; i2 < c2; i2++) {
            char c3 = cArr[size];
            int i3 = size + 1;
            com.github.catvod.spider.merge.B.k kVar = new com.github.catvod.spider.merge.B.k(new int[0]);
            list.add(kVar);
            int i4 = i3 + 1;
            if (cArr[i3] != 0) {
                kVar.a(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < c3; i5++) {
                int iA = interfaceC0291j.a(cArr, size);
                int size2 = size + interfaceC0291j.size();
                int iA2 = interfaceC0291j.a(cArr, size2);
                size = size2 + interfaceC0291j.size();
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
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.github.catvod.spider.merge.z.c0] */
    /* JADX WARN: Type inference failed for: r11v30, types: [com.github.catvod.spider.merge.z.c0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.t0>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.v>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.r0>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.z.C0282a b(char[] r19) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.C0292k.b(char[]):com.github.catvod.spider.merge.z.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.z.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(com.github.catvod.spider.merge.z.C0282a r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.z.C0292k.f(com.github.catvod.spider.merge.z.a):void");
    }
}
