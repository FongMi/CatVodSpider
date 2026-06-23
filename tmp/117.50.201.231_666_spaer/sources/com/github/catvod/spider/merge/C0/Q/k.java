package com.github.catvod.spider.merge.C0.Q;

import com.github.catvod.spider.merge.C0.S.j;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class k {
    private static final UUID b;
    private static final UUID c;
    private static final UUID d;
    private static final List<UUID> e;
    public static final UUID f;
    private final g a = g.a();

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

    private int c(char[] cArr, int i, List<j> list, j jVar) {
        int size = i + 1;
        char c2 = cArr[i];
        for (int i2 = 0; i2 < c2; i2++) {
            char c3 = cArr[size];
            int i3 = size + 1;
            j jVar2 = new j(new int[0]);
            list.add(jVar2);
            if (cArr[i3] != 0) {
                jVar2.a(-1);
            }
            size = i3 + 1;
            for (int i4 = 0; i4 < c3; i4++) {
                int iA = jVar.a(cArr, size);
                int size2 = size + jVar.size();
                int iA2 = jVar.a(cArr, size2);
                size = size2 + jVar.size();
                jVar2.b(iA, iA2);
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    protected static boolean d(UUID uuid, UUID uuid2) {
        ?? r1 = e;
        int iIndexOf = r1.indexOf(uuid);
        return iIndexOf >= 0 && r1.indexOf(uuid2) >= iIndexOf;
    }

    protected static long e(char[] cArr, int i) {
        int i2 = i + 2;
        return ((cArr[i] | (cArr[i + 1] << 16)) & 4294967295L) | (((long) ((cArr[i2 + 1] << 16) | cArr[i2])) << 32);
    }

    protected final void a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<java.util.UUID>] */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.r0>] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.v>] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.C0.Q.a b(char[] r15) {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.k.b(char[]):com.github.catvod.spider.merge.C0.Q.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.C0.Q.m>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void f(com.github.catvod.spider.merge.C0.Q.a r8) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0.Q.k.f(com.github.catvod.spider.merge.C0.Q.a):void");
    }
}
