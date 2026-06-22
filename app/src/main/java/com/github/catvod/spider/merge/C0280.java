package com.github.catvod.spider.merge;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ނ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0280 implements Comparator<C0230> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final String f706;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final String f707;

    public C0280(String str, String str2) {
        this.f706 = str;
        this.f707 = str2;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static void m1030(String str, String str2, List<C0230> list) {
        Collections.sort(list, new C0280(str, str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compare(com.github.catvod.spider.merge.C0230 r5, com.github.catvod.spider.merge.C0230 r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f707
            java.lang.String r1 = "1B2132"
            java.lang.String r1 = com.github.catvod.spider.merge.SOY.d(r1)
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = r4.f706
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case 3076014: goto L39;
                case 3373707: goto L2a;
                case 3530753: goto L1b;
                default: goto L19;
            }
        L19:
            r1 = -1
            goto L47
        L1b:
            java.lang.String r2 = "093B2B13"
            java.lang.String r2 = com.github.catvod.spider.merge.SOY.d(r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            goto L19
        L28:
            r1 = 2
            goto L47
        L2a:
            java.lang.String r2 = "14333C13"
            java.lang.String r2 = com.github.catvod.spider.merge.SOY.d(r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L37
            goto L19
        L37:
            r1 = 1
            goto L47
        L39:
            java.lang.String r2 = "1E332513"
            java.lang.String r2 = com.github.catvod.spider.merge.SOY.d(r2)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L19
        L46:
            r1 = 0
        L47:
            switch(r1) {
                case 0: goto L7d;
                case 1: goto L61;
                case 2: goto L4b;
                default: goto L4a;
            }
        L4a:
            return r3
        L4b:
            if (r0 == 0) goto L56
            long r0 = r5.m812()
            long r5 = r6.m812()
            goto L5e
        L56:
            long r0 = r6.m812()
            long r5 = r5.m812()
        L5e:
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            return r2
        L61:
            if (r0 == 0) goto L70
            java.lang.String r5 = r5.m808()
            java.lang.String r6 = r6.m808()
            int r5 = r5.compareTo(r6)
            goto L7c
        L70:
            java.lang.String r6 = r6.m808()
            java.lang.String r5 = r5.m808()
            int r5 = r6.compareTo(r5)
        L7c:
            return r5
        L7d:
            if (r0 == 0) goto L8c
            java.util.Date r5 = r5.m805()
            java.util.Date r6 = r6.m805()
            int r5 = r5.compareTo(r6)
            goto L98
        L8c:
            java.util.Date r6 = r6.m805()
            java.util.Date r5 = r5.m805()
            int r5 = r6.compareTo(r5)
        L98:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0280.compare(com.github.catvod.spider.merge.ؠ, com.github.catvod.spider.merge.ؠ):int");
    }
}
