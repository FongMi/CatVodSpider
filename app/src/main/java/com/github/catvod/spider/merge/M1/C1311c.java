package com.github.catvod.spider.merge.m1;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1311c implements Serializable {
    private final String b;
    private final int c;
    private final int d;
    private final int e;

    public C1311c(String str, int i, int i2, int i3) {
        this.b = str;
        this.c = i;
        this.d = i2;
        if (i3 == 0) {
            throw new NullPointerException("estimatedResolutionLevel is null");
        }
        this.e = i3;
    }

    public final String a() {
        return this.b;
    }

    public final String toString() {
        return "Image {url=" + this.b + ", height=" + this.c + ", width=" + this.d + ", estimatedResolutionLevel=" + com.github.catvod.spider.merge.B.h.c(this.e) + "}";
    }
}
