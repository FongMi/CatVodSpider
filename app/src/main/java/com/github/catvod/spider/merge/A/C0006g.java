package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0006g {
    public static final UUID a;
    public static final UUID b;
    public static final UUID c;
    public static final ArrayList d;
    public static final UUID e;

    static {
        UUID uuidFromString = UUID.fromString("33761B2D-78BB-4A43-8B0B-4F5BEE8AACF3");
        UUID uuidFromString2 = UUID.fromString("1DA0C57D-6C06-438A-9B27-10BCB3CE0F61");
        a = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("AADB8D7E-AEEF-4415-AD2B-8204D6CF042E");
        b = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("59627784-3BE5-417A-B9EB-8131A7286089");
        c = uuidFromString4;
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(uuidFromString);
        arrayList.add(uuidFromString2);
        arrayList.add(uuidFromString3);
        arrayList.add(uuidFromString4);
        e = uuidFromString4;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    public static int c(char[] cArr, int i, ArrayList arrayList, C0005f c0005f) {
        int i2 = i + 1;
        char c2 = cArr[i];
        for (int i3 = 0; i3 < c2; i3++) {
            char c3 = cArr[i2];
            int i4 = i2 + 1;
            com.github.catvod.spider.merge.C.f fVar = new com.github.catvod.spider.merge.C.f(new int[0]);
            arrayList.add(fVar);
            i2 += 2;
            if (cArr[i4] != 0) {
                fVar.a(-1);
            }
            int i5 = 0;
            while (i5 < c3) {
                int iA = c0005f.a(cArr, i2);
                int iB = c0005f.b() + i2;
                int iA2 = c0005f.a(cArr, iB);
                int iB2 = iB + c0005f.b();
                fVar.b(iA, iA2);
                i5++;
                i2 = iB2;
            }
        }
        return i2;
    }

    public static boolean d(UUID uuid, UUID uuid2) {
        ArrayList arrayList = d;
        int iIndexOf = arrayList.indexOf(uuid);
        return iIndexOf >= 0 && arrayList.indexOf(uuid2) >= iIndexOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.A.C0000a b(char[] r22) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.C0006g.b(char[]):com.github.catvod.spider.merge.A.a");
    }
}
