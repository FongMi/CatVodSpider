package com.github.catvod.spider.merge.Y0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class i {
    private int a;
    int[] b;
    int[] c;

    i() {
    }

    static void a(i iVar, a aVar) {
        int length = iVar.c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iVar.c[i2] = i;
            e.g(iVar.a, iVar.b, i, aVar);
            i += 1080;
        }
    }

    static void b(i iVar, int i, int i2) {
        iVar.a = i;
        iVar.b = new int[i2 * 1080];
        iVar.c = new int[i2];
    }
}
