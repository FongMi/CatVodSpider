package com.github.catvod.spider.merge.m1;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1313e implements Serializable {
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private List<C1311c> f = Collections.emptyList();

    public AbstractC1313e(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final List<C1311c> d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final void f(List<C1311c> list) {
        this.f = list;
    }

    public String toString() {
        return getClass().getSimpleName() + "[url=\"" + this.d + "\", name=\"" + this.e + "\"]";
    }
}
