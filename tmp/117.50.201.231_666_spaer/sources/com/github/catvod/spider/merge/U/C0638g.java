package com.github.catvod.spider.merge.u;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0638g {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final C0635d a = C0635d.a();

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.u.g$a */
    interface a {
        int a(char[] cArr, int i);

        int size();
    }

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        d = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        f = uuidFromString4;
    }

    private int c(char[] cArr, int i, List<com.github.catvod.spider.merge.w.i> list, a aVar) {
        int size = i + 1;
        char c2 = cArr[i];
        for (int i2 = 0; i2 < c2; i2++) {
            char c3 = cArr[size];
            int i3 = size + 1;
            com.github.catvod.spider.merge.w.i iVar = new com.github.catvod.spider.merge.w.i(new int[0]);
            list.add(iVar);
            int i4 = i3 + 1;
            if (cArr[i3] != 0) {
                iVar.a(-1);
            }
            size = i4;
            for (int i5 = 0; i5 < c3; i5++) {
                int iA = aVar.a(cArr, size);
                int size2 = size + aVar.size();
                int iA2 = aVar.a(cArr, size2);
                size = size2 + aVar.size();
                iVar.b(iA, iA2);
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
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.github.catvod.spider.merge.u.m] */
    /* JADX WARN: Type inference failed for: r11v27, types: [com.github.catvod.spider.merge.u.m] */
    /* JADX WARN: Type inference failed for: r11v28, types: [com.github.catvod.spider.merge.u.X] */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.github.catvod.spider.merge.u.X] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i0>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.r>] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.h0>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.u.C0632a b(char[] r19) {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.C0638g.b(char[]):com.github.catvod.spider.merge.u.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.u.i>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(com.github.catvod.spider.merge.u.C0632a r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.u.C0638g.f(com.github.catvod.spider.merge.u.a):void");
    }
}
