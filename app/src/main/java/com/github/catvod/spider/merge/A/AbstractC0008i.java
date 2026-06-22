package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public abstract class AbstractC0008i {
    public int c;
    public com.github.catvod.spider.merge.C.f f;
    public C0000a a = null;
    public int b = -1;
    public boolean d = false;
    public final ArrayList e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.github.catvod.spider.merge.A.l0 r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.ArrayList r1 = r7.e
            int r2 = r1.size()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L14
            boolean r0 = r8.b()
        L11:
            r7.d = r0
            goto L33
        L14:
            boolean r3 = r7.d
            boolean r4 = r8.b()
            if (r3 == r4) goto L33
            java.io.PrintStream r3 = java.lang.System.err
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r5 = r7.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r5
            java.lang.String r5 = "ATN state %d has both epsilon and non-epsilon transitions.\n"
            r3.format(r4, r5, r6)
            goto L11
        L33:
            java.util.Iterator r0 = r1.iterator()
        L37:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r0.next()
            com.github.catvod.spider.merge.A.l0 r3 = (com.github.catvod.spider.merge.A.l0) r3
            com.github.catvod.spider.merge.A.i r4 = r3.a
            int r4 = r4.b
            com.github.catvod.spider.merge.A.i r5 = r8.a
            int r5 = r5.b
            if (r4 != r5) goto L37
            com.github.catvod.spider.merge.C.f r4 = r3.c()
            if (r4 == 0) goto L68
            com.github.catvod.spider.merge.C.f r4 = r8.c()
            if (r4 == 0) goto L68
            com.github.catvod.spider.merge.C.f r4 = r3.c()
            com.github.catvod.spider.merge.C.f r5 = r8.c()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L68
            goto L78
        L68:
            boolean r3 = r3.b()
            if (r3 == 0) goto L37
            boolean r3 = r8.b()
            if (r3 == 0) goto L37
            goto L78
        L75:
            r1.add(r2, r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.AbstractC0008i.a(com.github.catvod.spider.merge.A.l0):void");
    }

    public abstract int b();

    public final l0 c(int i) {
        return (l0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0008i) && this.b == ((AbstractC0008i) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
