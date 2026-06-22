package com.github.catvod.spider.merge.q1;

import com.github.catvod.spider.merge.L1.m;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C1380a implements Serializable {
    protected final String b;
    protected final String c;
    protected final String d;

    public C1380a(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return m.e(this.c);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }
}
