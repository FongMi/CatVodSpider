package com.github.catvod.spider.merge.f1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class T0 implements Serializable, InterfaceC1103T {
    static boolean a(Object obj) {
        if (!(obj instanceof C1104U)) {
            return false;
        }
        C1104U c1104u = (C1104U) obj;
        return c1104u.H1("Global") && c1104u.K1() == 6;
    }

    private static char b(int i) {
        if ((i >> 4) == 0) {
            return (char) (i < 10 ? i + 48 : (i - 10) + 65);
        }
        C1162n0.c();
        throw null;
    }

    private static int d(char c) {
        char c2 = 'A';
        if ('A' > c || c > 'F') {
            c2 = 'a';
            if ('a' > c || c > 'f') {
                if ('0' > c || c > '9') {
                    return -1;
                }
                return c - '0';
            }
        }
        return (c - c2) + 10;
    }

    private static C1089E e() {
        return C1157l2.j("URIError", C1157l2.P("msg.bad.uri", new Object[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x021e, code lost:
    
        if ((r3 & (-8)) == 0) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1 A[PHI: r12
      0x00b1: PHI (r12v6 int) = (r12v0 int), (r12v8 int) binds: [B:44:0x00aa, B:47:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    @Override // com.github.catvod.spider.merge.f1.InterfaceC1103T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.github.catvod.spider.merge.f1.C1104U r19, com.github.catvod.spider.merge.f1.C1185v r20, com.github.catvod.spider.merge.f1.n2 r21, com.github.catvod.spider.merge.f1.n2 r22, java.lang.Object[] r23) {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.T0.c(com.github.catvod.spider.merge.f1.U, com.github.catvod.spider.merge.f1.v, com.github.catvod.spider.merge.f1.n2, com.github.catvod.spider.merge.f1.n2, java.lang.Object[]):java.lang.Object");
    }
}
