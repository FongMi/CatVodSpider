package com.github.catvod.spider.merge.L1;

import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class a implements Serializable {
    private final String b;
    private final int c;
    private final int d;
    private final int e;

    public a(String str, int i, int i2, int i3) {
        this.b = str;
        this.c = i;
        this.d = i2;
        if (i3 == 0) {
            throw new NullPointerException("estimatedResolutionLevel is null");
        }
        this.e = i3;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final String toString() {
        return "ImageSuffix {suffix=" + this.b + ", height=" + this.c + ", width=" + this.d + ", resolutionLevel=" + com.github.catvod.spider.merge.B.h.c(this.e) + "}";
    }
}
