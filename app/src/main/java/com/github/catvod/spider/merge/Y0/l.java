package com.github.catvod.spider.merge.Y0;

import java.io.InputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class l {
    int A;
    int B;
    int C;
    int D;
    int E;
    int F;
    byte[] G;
    int H;
    int I;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    int T;
    int U;
    int V;
    int W;
    int X;
    byte[] Y;
    int b;
    byte[] d;
    int g;
    boolean h;
    boolean i;
    boolean j;
    int v;
    int w;
    int x;
    byte[] y;
    byte[] z;
    int a = 0;
    final a c = new a();
    final int[] e = new int[3240];
    final int[] f = new int[3240];
    final i k = new i();
    final i l = new i();
    final i m = new i();
    final int[] n = new int[3];
    final int[] o = new int[3];
    final int[] p = new int[6];
    final int[] q = {16, 15, 11, 4};
    int r = 0;
    int s = 0;
    int t = 0;
    boolean u = false;
    int P = 0;
    long Q = 0;
    byte[] R = new byte[0];
    int S = 0;

    l() {
    }

    static void a(l lVar, InputStream inputStream) {
        int i;
        if (lVar.a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a.e(lVar.c, inputStream);
        a aVar = lVar.c;
        if (a.h(aVar, 1) == 0) {
            i = 16;
        } else {
            int iH = a.h(aVar, 3);
            i = 17;
            if (iH != 0) {
                i = 17 + iH;
            } else {
                int iH2 = a.h(aVar, 3);
                if (iH2 != 0) {
                    i = iH2 + 8;
                }
            }
        }
        if (i == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i2 = 1 << i;
        lVar.O = i2;
        lVar.N = i2 - 16;
        lVar.a = 1;
    }
}
