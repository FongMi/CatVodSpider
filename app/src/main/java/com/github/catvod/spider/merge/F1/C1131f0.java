package com.github.catvod.spider.merge.f1;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C1131f0 implements Serializable {
    boolean A;
    boolean B;
    Object[] C;
    E2 D;
    int E;
    boolean F;
    private int G;
    boolean H;
    String b;
    String c;
    boolean d;
    int e;
    String[] f;
    double[] g;
    BigInteger[] h;
    C1131f0[] i;
    Object[] j;
    Object[] k;
    byte[] l;
    int[] m;
    int n;
    int o;
    int p;
    int q;
    String[] r;
    boolean[] s;
    int t;
    boolean u;
    int v;
    String w;
    int x;
    int y;
    int z;

    C1131f0(int i, String str, String str2, boolean z) {
        this.E = -1;
        this.G = 0;
        this.z = i;
        this.c = str;
        this.w = str2;
        this.A = z;
        this.l = new byte[1024];
        this.f = new String[64];
        this.h = new BigInteger[64];
    }

    public final int a() {
        int i = this.G;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.l);
        this.G = iHashCode;
        return iHashCode;
    }

    C1131f0(C1131f0 c1131f0) {
        this.E = -1;
        this.G = 0;
        this.z = c1131f0.z;
        this.c = c1131f0.c;
        this.w = c1131f0.w;
        this.A = c1131f0.A;
        this.l = new byte[1024];
        this.f = new String[64];
        this.h = new BigInteger[64];
    }
}
