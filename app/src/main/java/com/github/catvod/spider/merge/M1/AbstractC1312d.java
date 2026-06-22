package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1312d implements Serializable {
    private final String b;
    private String c;
    private final String d;
    private final List<Throwable> e = new ArrayList();

    public AbstractC1312d(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(Collection<Throwable> collection) {
        this.e.addAll(collection);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    public final void b(Throwable th) {
        this.e.add(th);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String toString() {
        String strA = this.b.equals(this.c) ? "" : t0.a(" (originalUrl=\"", this.c, "\")");
        String simpleName = getClass().getSimpleName();
        String str = this.b;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[url=\"");
        sb.append(str);
        sb.append("\"");
        sb.append(strA);
        return z.b(sb, ", name=\"", str2, "\"]");
    }
}
